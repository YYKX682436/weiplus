package ls4;

/* loaded from: classes8.dex */
public final class n implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402619a;

    public n(ls4.u uVar) {
        this.f402619a = uVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "onFailed,errorType:%s,errorCode:%s, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ls4.u uVar = this.f402619a;
        if (i18 != -3) {
            uVar.d(new pr4.a(pr4.j.f439547f));
            return;
        }
        ns4.c0 c0Var = uVar.f402635c;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("consumePanel");
            throw null;
        }
        if (c0Var.f420997c.f()) {
            return;
        }
        ls4.u.a(uVar);
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        ls4.u.c(this.f402619a);
    }
}
