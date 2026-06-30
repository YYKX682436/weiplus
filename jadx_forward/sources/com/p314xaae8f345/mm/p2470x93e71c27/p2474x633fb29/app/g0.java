package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class g0 extends l75.n0 implements lt.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f270436f = {l75.n0.m145250x3fdc6f77(ot0.t.E, "AppMessage")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f270437g = {"CREATE INDEX IF NOT EXISTS AppMessage_Talker_LocalId ON AppMessage ( msgTalker,msgId )", "CREATE INDEX IF NOT EXISTS AppMessage_Talker_SvrId ON AppMessage ( msgTalker,msgSvrId )"};

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0 f270438d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f270439e;

    public g0(l75.k0 k0Var) {
        super(k0Var, ot0.t.E, "AppMessage", null);
        this.f270438d = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0(null);
        this.f270439e = k0Var;
        qt0.b.f448024a.b(new qt0.e(k0Var, f270437g, "AppMessage", null, 0));
    }

    public /* bridge */ /* synthetic */ boolean D0(ot0.t tVar) {
        return super.mo880xb970c2b9(tVar);
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo51731x24249762(ot0.t tVar, boolean z17) {
        long j17 = tVar.f67765x297eb4f7;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0 f0Var = this.f270438d;
        return f0Var.d(j17) ? f0Var.b(tVar, z17) : super.mo51731x24249762(tVar, z17);
    }

    public /* bridge */ /* synthetic */ boolean L0(ot0.t tVar, java.lang.String[] strArr) {
        return super.mo9952xce0038c9(tVar, strArr);
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo55864x413cb2b4(l75.f0 f0Var, boolean z17) {
        ot0.t tVar = (ot0.t) f0Var;
        long j17 = tVar.f67765x297eb4f7;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0 f0Var2 = this.f270438d;
        return f0Var2.d(j17) ? f0Var2.c(tVar, z17) : super.mo55864x413cb2b4(tVar, z17);
    }

    @Override // l75.n0
    /* renamed from: updateNotify */
    public boolean mo51732xbf274172(l75.f0 f0Var, boolean z17, java.lang.String[] strArr) {
        ot0.t tVar = (ot0.t) f0Var;
        long j17 = tVar.f67765x297eb4f7;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0 f0Var2 = this.f270438d;
        return f0Var2.d(j17) ? f0Var2.e(tVar, z17, strArr) : super.mo51732xbf274172(tVar, z17, strArr);
    }

    public ot0.t y0(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f0 f0Var = this.f270438d;
        if (f0Var.d(j17)) {
            return f0Var.a(j17);
        }
        ot0.t tVar = new ot0.t();
        if (pt0.p.B3("AppMessage")) {
            tVar.f67765x297eb4f7 = j17;
            tVar.f67767x436b2035 = str;
        } else {
            tVar.f67765x297eb4f7 = j17;
        }
        if (super.get(tVar, new java.lang.String[0])) {
            return tVar;
        }
        return null;
    }

    public android.database.Cursor z0(int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        l75.k0 k0Var = this.f270439e;
        if (!(k0Var instanceof d95.b0)) {
            return null;
        }
        return ((d95.b0) k0Var).P().m107707x66f18c8(false, "AppMessage", ot0.t.E.f398487c, "msgTalker IS NULL", new java.lang.String[0], null, null, null, i17 + "", c26987xeef691ab);
    }
}
