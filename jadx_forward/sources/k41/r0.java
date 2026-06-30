package k41;

/* loaded from: classes11.dex */
public final class r0 extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f385572f = {l75.n0.m145250x3fdc6f77(k41.g0.f385528y1, "OpenIMKefuContact")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f385573d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.e8 f385574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(l75.k0 storage) {
        super(storage, k41.g0.f385528y1, "OpenIMKefuContact", dm.u8.D);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        l75.e0 e0Var = k41.g0.f385528y1;
        this.f385573d = storage;
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Bi, "getContactStg(...)");
        this.f385574e = Bi;
    }

    @Override // l75.s0
    /* renamed from: extraStepsAfterNotifying */
    public void mo77982x77686a54(l75.w0 w0Var) {
        fs.g.b(k41.p0.class, new k41.q0(w0Var));
    }

    public final k41.g0 y0(java.lang.String username) {
        k41.g0 g0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.database.Cursor f17 = this.f385573d.f("SELECT *, rowid FROM OpenIMKefuContact WHERE username = " + d95.b0.O(username), null, 2);
        boolean z17 = false;
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    z17 = true;
                }
            } finally {
            }
        }
        if (z17) {
            g0Var = new k41.g0();
            g0Var.mo9015xbf5d97fd(f17);
            g0Var.f385530x1 = g0Var.f72763xa3c65b86;
            g0Var.f385529p1 = true;
        } else {
            g0Var = null;
        }
        vz5.b.a(f17, null);
        return g0Var;
    }
}
