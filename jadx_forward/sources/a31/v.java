package a31;

/* loaded from: classes14.dex */
public class v extends com.p314xaae8f345.mm.ui.p2740x696c9db.c9 implements y90.k {

    /* renamed from: r, reason: collision with root package name */
    public boolean f82529r;

    /* renamed from: s, reason: collision with root package name */
    public int f82530s;

    /* renamed from: t, reason: collision with root package name */
    public int f82531t;

    /* renamed from: u, reason: collision with root package name */
    public y90.j f82532u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 f82533v;

    /* renamed from: w, reason: collision with root package name */
    public final a31.s f82534w;

    public v() {
        this.f82529r = true;
        this.f82534w = new a31.u(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c9
    public boolean h() {
        return this.f82529r;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c9
    public boolean l(int i17, android.view.KeyEvent keyEvent) {
        if (4 == i17) {
            com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924 = this.f82533v;
            boolean z17 = c11154x38c1a924 != null && c11154x38c1a924.getVisibility() == 0;
            s();
            if (z17) {
                return true;
            }
        }
        return super.l(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c9
    public void m(android.app.Activity activity, android.view.Menu menu) {
        super.m(activity, menu);
        com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924 = this.f82533v;
        if (c11154x38c1a924 != null) {
            c11154x38c1a924.m48304x4b680abd(this.f82534w);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c9
    public void n(android.view.Menu menu) {
        s();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c9
    public void p() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f291856h;
        boolean z17 = false;
        if (o3Var != null) {
            o3Var.mo81053xeb117c28(false);
            this.f291856h.mo81063x3717e759(false);
        }
        com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924 = this.f82533v;
        if (c11154x38c1a924 == null || c11154x38c1a924.getVisibility() != 8) {
            return;
        }
        com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a9242 = this.f82533v;
        int i17 = this.f82531t;
        c11154x38c1a9242.getClass();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = c11154x38c1a9242.getContext();
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, "android.permission.RECORD_AUDIO", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceSearchLayout", "summerper checkPermission checkMicrophone[%b]", java.lang.Boolean.valueOf(d17));
        if (!d17) {
            if (c11154x38c1a9242.getContext() instanceof android.app.Activity) {
                tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
                android.app.Activity activity = (android.app.Activity) c11154x38c1a9242.getContext();
                ((sb0.f) jVar2).getClass();
                j35.u.i(activity, "android.permission.RECORD_AUDIO", 80);
                return;
            }
            return;
        }
        c11154x38c1a9242.f153290g = true;
        c11154x38c1a9242.f153291h = false;
        a31.s sVar = c11154x38c1a9242.f153288e;
        if (sVar != null) {
            a31.u uVar = (a31.u) sVar;
            if (!iq.b.C(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && !iq.b.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && !iq.b.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                a31.v vVar = uVar.f82528a;
                g0Var.d(10453, java.lang.Integer.valueOf(vVar.f82530s), 3);
                y90.j jVar3 = vVar.f82532u;
                if (jVar3 != null) {
                    jVar3.m6();
                }
            }
        }
        c11154x38c1a9242.setVisibility(0);
        c11154x38c1a9242.f153299s.c(50L, 50L);
        c11154x38c1a9242.e(true, null);
        c11154x38c1a9242.f153298r = 0;
        z21.q qVar = new z21.q(new a31.r(c11154x38c1a9242), i17);
        c11154x38c1a9242.f153294n = qVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceAddr", "start record");
        if (qVar.f551195d == 0 && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            z17 = true;
        }
        qVar.f551200i = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceAddr", "mEnableAmrMode: %b", java.lang.Boolean.valueOf(z17));
        s75.d.b(new z21.o(qVar), "SceneVoiceAddr_record");
    }

    public void s() {
        com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924 = this.f82533v;
        if (c11154x38c1a924 != null) {
            c11154x38c1a924.c();
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f291856h;
        if (o3Var != null) {
            o3Var.mo81053xeb117c28(true);
            this.f291856h.mo81063x3717e759(true);
        }
    }

    public v(boolean z17, boolean z18) {
        super(z17, z18);
        this.f82529r = true;
        this.f82534w = new a31.u(this);
    }
}
