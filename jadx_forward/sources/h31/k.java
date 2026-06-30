package h31;

/* loaded from: classes9.dex */
public final class k implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h31.r f359950a;

    public k(h31.r rVar) {
        this.f359950a = rVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandSubscribeMsgRequestController", "getSubscribeMsgTemplateList onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        h31.r rVar = this.f359950a;
        h31.a aVar = rVar.f359967h;
        if (aVar != null) {
            int i19 = rVar.f359961b;
            if (!(errMsg.length() > 0)) {
                errMsg = "get subscribe msg list failed";
            }
            ((m31.y1) aVar).a(i19, 10002, errMsg);
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.ArrayList arrayList = result.f153318h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "getSubscribeMsgTemplateList onSuccess bizUsername: %s, size: %d", bizUsername, java.lang.Integer.valueOf(arrayList.size()));
        h31.r rVar = this.f359950a;
        int i17 = rVar.f359961b;
        rVar.getClass();
        if (result.f153330w == 0 && arrayList.isEmpty()) {
            rVar.f359968i = arrayList;
            rVar.f359975p = result.f153325r;
            rVar.f359961b = 2;
            h31.s.f359979a.c(rVar);
            return;
        }
        java.lang.ref.WeakReference weakReference = rVar.f359960a;
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            return;
        }
        rVar.a(context, i17, result);
    }
}
