package lr;

/* loaded from: classes15.dex */
public abstract class u extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final lr.o0 f402117d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f402118e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10439xce021022 f402119f;

    /* renamed from: g, reason: collision with root package name */
    public final lr.z f402120g;

    /* renamed from: h, reason: collision with root package name */
    public final lr.y f402121h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22783x88759141 f402122i;

    /* renamed from: m, reason: collision with root package name */
    public ir.t0 f402123m;

    /* renamed from: n, reason: collision with root package name */
    public final lr.t f402124n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ lr.x f402125o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(lr.x xVar, android.view.View itemView, lr.o0 sizeResolver, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d layoutManager) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeResolver, "sizeResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        this.f402125o = xVar;
        this.f402117d = sizeResolver;
        this.f402118e = layoutManager;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.dcg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10439xce021022 c10439xce021022 = (com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10439xce021022) findViewById;
        this.f402119f = c10439xce021022;
        lr.z zVar = new lr.z(xVar.f402133d);
        this.f402120g = zVar;
        this.f402121h = new lr.q(this, zVar);
        lr.p0 p0Var = new lr.p0(zVar, layoutManager);
        com.p314xaae8f345.mm.p2776x373aa5.C22783x88759141 c22783x88759141 = (com.p314xaae8f345.mm.p2776x373aa5.C22783x88759141) itemView.findViewById(com.p314xaae8f345.mm.R.id.dcf);
        this.f402122i = c22783x88759141;
        this.f402124n = new lr.t(this);
        c10439xce021022.m7971xa810ec34(xVar.f402140n);
        c10439xce021022.m7963x830bc99d(true);
        c10439xce021022.mo7960x6cab2c8d(zVar);
        c10439xce021022.m43699xf757fca9(sizeResolver);
        c10439xce021022.m43697x667146a8(xVar.f402134e);
        c10439xce021022.N(new lr.a0(sizeResolver));
        layoutManager.B = p0Var;
        c10439xce021022.mo7967x900dcbe1(layoutManager);
        c10439xce021022.setFocusable(false);
        c10439xce021022.m7964x8d4ad49c(null);
        zVar.f402153g = xVar.f402141o;
        if (c22783x88759141 == null) {
            return;
        }
        c22783x88759141.m82524x4263699e(xVar.f402137h);
    }

    public final void i() {
        ir.e1 e1Var;
        int i17;
        ir.t0 t0Var = this.f402123m;
        if (t0Var instanceof ir.i1) {
            ir.i1 i1Var = (ir.i1) t0Var;
            if (!i1Var.f375404e.f375346c.isEmpty() && (i17 = (e1Var = i1Var.f375404e).f375366e) > 0) {
                lr.x xVar = this.f402125o;
                xVar.f402133d.f375389o = null;
                e1Var.f375366e = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f402138i, "checkScrollToPosition: " + i17);
                com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10439xce021022 c10439xce021022 = this.f402119f;
                lr.t tVar = this.f402124n;
                c10439xce021022.removeCallbacks(tVar);
                tVar.f402115d = i17;
                c10439xce021022.postDelayed(tVar, 300L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x010a, code lost:
    
        if ((!(r8 instanceof ir.f1)) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(ir.t0 r8) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.u.j(ir.t0):void");
    }

    public void k() {
        ir.k0 b17;
        ir.r p17;
        lr.x xVar = this.f402125o;
        java.lang.String str = xVar.f402138i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUnbind: ");
        ir.t0 t0Var = this.f402123m;
        sb6.append((t0Var == null || (b17 = t0Var.b()) == null || (p17 = b17.p()) == null) ? null : p17.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ir.t0 t0Var2 = this.f402123m;
        if (t0Var2 != null) {
            t0Var2.g(null);
        }
        this.f402123m = null;
        this.f402119f.removeCallbacks(this.f402124n);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = xVar.f402143q;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        xVar.f402143q = null;
    }
}
