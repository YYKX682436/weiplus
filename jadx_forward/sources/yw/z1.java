package yw;

/* loaded from: classes3.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f548052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f548052d = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context context = (android.content.Context) this.f548052d.get();
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(str, context, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSaveImg file not exist:" + str);
        }
        return jz5.f0.f384359a;
    }
}
