package qc1;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f443032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pl1.i f443034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f443035g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qc1.x f443036h;

    public w(qc1.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17, pl1.i iVar, int i18) {
        this.f443036h = xVar;
        this.f443032d = v5Var;
        this.f443033e = i17;
        this.f443034f = iVar;
        this.f443035g = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.tencent.mm.plugin.appbrand.widget.input.p4] */
    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.lang.Integer num;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p pVar;
        android.graphics.Rect o17;
        java.util.Set<??> d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 = this.f443032d;
        int i17 = this.f443033e;
        pl1.i iVar = this.f443034f;
        if (v5Var2 != null && (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m.f173073a.d(v5Var2)) != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f fVar : d17) {
                if (fVar != 0) {
                    if (fVar.h() != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) fVar.h())).m53464xb251d24f() == i17) {
                        break;
                    }
                }
            }
        }
        fVar = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f fVar2 = fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f ? fVar : null;
        if (fVar2 != null) {
            java.lang.String str = iVar.f438120a;
            if (str != null) {
                fVar2.t(str);
            }
            fVar2.j(iVar);
            android.widget.EditText n17 = fVar2.n();
            if (n17 != null && (v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) fVar2.f172968h.get()) != null && v5Var.a2() != null && (pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p) v5Var.E1()) != null && (o17 = fVar2.o()) != null) {
                pVar.s(v5Var.a2(), n17, o17.width(), o17.height(), o17.left, o17.top);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            this.f443032d.a(this.f443035g, this.f443036h.o("ok"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.a(this.f443032d, this.f443033e);
        if (!(a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0)) {
            java.util.Locale locale = java.util.Locale.US;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiUpdateInput", java.lang.String.format(locale, "AppBrandInputInvokeHandler with inputID(%d) 404", java.lang.Integer.valueOf(this.f443033e)));
            this.f443032d.a(this.f443035g, this.f443036h.o(java.lang.String.format(locale, "fail found no input with %d", java.lang.Integer.valueOf(this.f443033e))));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0) a17;
        pl1.i iVar2 = this.f443034f;
        pl1.f fVar3 = q0Var.f173142n;
        if (fVar3 != null && q0Var.f173145q != null) {
            fVar3.a(iVar2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.a(q0Var.f173142n, iVar2);
            if (q0Var.f173142n.U || ((num = q0Var.f173142n.f438122c) != null && num.intValue() > 0)) {
                q0Var.f173145q.setWillNotDraw(true);
                q0Var.A();
                java.lang.String str2 = q0Var.f173142n.f438120a;
                if (str2 != null) {
                    q0Var.f173145q.u(str2);
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(q0Var.f173142n.f438142w)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e0(q0Var);
                    if (q0Var.f173145q.getLayout() == null) {
                        q0Var.f173145q.post(e0Var);
                    } else {
                        e0Var.run();
                    }
                } else {
                    q0Var.C(q0Var.f173145q, q0Var.f173142n);
                }
                q0Var.f173145q.setWillNotDraw(false);
                q0Var.f173145q.invalidate();
            }
        }
        this.f443032d.a(this.f443035g, this.f443036h.o("ok"));
    }
}
