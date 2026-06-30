package qc1;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f443026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 f443027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pl1.f f443028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f443029g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f443030h;

    public s(qc1.v vVar, java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var, pl1.f fVar, int i17, int i18) {
        this.f443026d = weakReference;
        this.f443027e = q0Var;
        this.f443028f = fVar;
        this.f443029g = i17;
        this.f443030h = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) this.f443026d.get();
        if (v5Var == null || v5Var.a2() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var = this.f443027e;
        pl1.f fVar = this.f443028f;
        int i17 = this.f443029g;
        int i18 = this.f443030h;
        q0Var.f173142n = fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) fVar.W.get();
        if (v5Var2 != null) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e1(v5Var2);
        }
        java.lang.ref.WeakReference weakReference = q0Var.f173142n.W;
        q0Var.f173143o = weakReference;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var3 = weakReference == null ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) weakReference.get();
        if (v5Var3 == null || v5Var3.a2() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandInputInvokeHandler", "insertInputImpl, view not ready, return fail");
            q0Var.y();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 a2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(q0Var.f173142n.f438140u) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a2(v5Var3.getF229340d()) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e2(v5Var3.getF229340d());
        q0Var.f173145q = a2Var;
        int i19 = q0Var.f173142n.Q;
        q0Var.f173144p = i19;
        a2Var.mo53451x25c31fc3(i19);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f173174d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m.f173073a.e(v5Var3, q0Var);
        q0Var.A();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var = q0Var.f173145q;
        java.lang.String str = q0Var.f173142n.f438120a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        e4Var.setText(str);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(q0Var.f173142n.f438142w)) {
            q0Var.r();
        }
        q0Var.f173145q.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j0(q0Var));
        q0Var.f173145q.m53468x9b6bc52f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k0(q0Var));
        q0Var.f173145q.m53469xac3f159c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l0(q0Var));
        if (!q0Var.k(q0Var.f173145q, q0Var.f173142n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandInputInvokeHandler", "add custom view into webView failed");
            q0Var.y();
            return;
        }
        pl1.a aVar = q0Var.f173142n.V;
        if (aVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(aVar.f438109b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.r.a(v5Var3, q0Var.f173145q, q0Var.f173142n.V);
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(q0Var.f173142n.f438140u)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b.b(q0Var.f173145q, i17, i18);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(q0Var.f173142n.f438140u)) {
            q0Var.f173145q.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m0(q0Var));
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(q0Var.f173142n.f438140u)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a2) q0Var.f173145q).m53434x7f004a33(q0Var.f173142n.C);
        }
        java.lang.String str2 = q0Var.f173142n.R;
        if ((com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24.equalsIgnoreCase(str2) || "encrypt-text".equalsIgnoreCase(str2)) || "textarea".equalsIgnoreCase(q0Var.f173142n.R)) {
            q0Var.q(false);
        } else {
            if (!"emoji".equalsIgnoreCase(q0Var.f173142n.R)) {
                iz5.a.h(java.lang.String.format(java.util.Locale.US, "Unrecognized type(%s) implementation removed from here", q0Var.f173142n.R));
                throw null;
            }
            q0Var.q(true);
        }
        q0Var.f173145q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t(q0Var));
        q0Var.x();
    }
}
