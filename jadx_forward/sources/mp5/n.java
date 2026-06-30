package mp5;

/* loaded from: classes9.dex */
public class n implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f412024d;

    public n(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223) {
        this.f412024d = c22894x55bf3223;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        java.lang.String m82973x5325305f;
        if (keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0) {
            return false;
        }
        java.lang.String m83183xfb85ada3 = this.f412024d.f295335J.m83183xfb85ada3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "click enter, code: %s text:%s", java.lang.Integer.valueOf(this.f412024d.K), m83183xfb85ada3);
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f412024d;
        mp5.u uVar = c22894x55bf3223.H;
        if (uVar != null) {
            if (c22894x55bf3223.N != null) {
                m82973x5325305f = c22894x55bf3223.m82973x5325305f();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "click enter, realText:%s", m82973x5325305f);
                com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32232 = this.f412024d;
                mp5.u uVar2 = c22894x55bf32232.H;
                int i18 = c22894x55bf32232.K;
                o05.j jVar = ((ps4.f) uVar2).f439683a;
                if (jVar != null) {
                    jVar.b(i18, m82973x5325305f);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29733, 1, 2);
            } else {
                int i19 = c22894x55bf3223.K;
                o05.j jVar2 = ((ps4.f) uVar).f439683a;
                if (jVar2 != null) {
                    jVar2.b(i19, m83183xfb85ada3);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29733, 1, 1);
            }
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32233 = this.f412024d;
        c22894x55bf32233.L = m83183xfb85ada3;
        wu5.c cVar = c22894x55bf32233.M;
        if (cVar != null) {
            cVar.cancel(false);
            this.f412024d.M = null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32234 = this.f412024d;
        ku5.u0 u0Var = ku5.t0.f394148d;
        mp5.m mVar = new mp5.m(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        c22894x55bf32234.M = t0Var.z(mVar, 30000L, false);
        this.f412024d.K = 0;
        return true;
    }
}
