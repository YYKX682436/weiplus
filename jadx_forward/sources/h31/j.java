package h31;

/* loaded from: classes9.dex */
public final class j implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h31.r f359949a;

    public j(h31.r rVar) {
        this.f359949a = rVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandSubscribeMsgRequestController", "doSubscribeMsg onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        h31.r rVar = this.f359949a;
        h31.a aVar = rVar.f359967h;
        if (aVar != null) {
            int i19 = rVar.f359961b;
            if (!(errMsg.length() > 0)) {
                errMsg = "subscribe failed";
            }
            ((m31.y1) aVar).a(i19, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, errMsg);
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "doSubscribeMsg success bizUsername: %s, template size: %d", bizUsername, java.lang.Integer.valueOf(result.f153318h.size()));
        h31.r rVar = this.f359949a;
        java.lang.ref.WeakReference weakReference = rVar.f359960a;
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            return;
        }
        rVar.a(context, rVar.f359961b, result);
    }
}
