package dm3;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.o f323247d;

    public n(dm3.o oVar) {
        this.f323247d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm3.o oVar = this.f323247d;
        if (oVar.f323257q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.m(), "startTimerToReplace overTime and replace player");
            oVar.f323258r = true;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Vi(true);
            b66.n nVar = oVar.f323251h;
            if (nVar != null) {
                qk.a9 a9Var = oVar.f323259s;
                if (a9Var != null) {
                    ((ul4.i) a9Var).f510150e = null;
                }
                b66.g o17 = oVar.o();
                if (o17 != null) {
                    p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169658x21ba6b3a(((b66.i) o17).m105978x2737f10(), nVar);
                }
                qk.a9 a9Var2 = oVar.f323259s;
                if (a9Var2 != null) {
                    jm4.h0 h0Var = jm4.h0.f381922f;
                    byte[] mo14344x5f01b1f6 = new bw5.vo0().mo14344x5f01b1f6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                    ((ul4.i) a9Var2).e(h0Var, mo14344x5f01b1f6);
                }
                b66.t tVar = oVar.f323262v;
                ((b66.q) nVar).j(tVar);
                jm4.n2 o18 = oVar.o();
                b66.n f17 = o18 != null ? ((jm4.p2) o18).f() : null;
                oVar.f323251h = f17;
                if (f17 != null) {
                    ((b66.q) f17).a(tVar);
                }
            }
        }
    }
}
