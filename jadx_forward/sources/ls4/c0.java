package ls4;

/* loaded from: classes8.dex */
public final class c0 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.e0 f402575a;

    public c0(ls4.e0 e0Var) {
        this.f402575a = e0Var;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeCoinSubscribeLogic", "auth fail");
        this.f402575a.f402580a.f439571c.mo146xb9724478(new pr4.n(pr4.p.f439574d));
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinSubscribeLogic", "auth success");
        this.f402575a.b();
    }
}
