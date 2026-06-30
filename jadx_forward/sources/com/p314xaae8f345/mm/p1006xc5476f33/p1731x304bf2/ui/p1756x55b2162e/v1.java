package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class v1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7 f222856a;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7 activityC16011x94b3fdc7) {
        this.f222856a = activityC16011x94b3fdc7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k
    public boolean a() {
        p53.u uVar = this.f222856a.f222749h;
        if (uVar != null) {
            return uVar.m157861x421622b1().f222723h;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k
    public int b() {
        p53.u uVar = this.f222856a.f222749h;
        int height = uVar != null ? uVar.getHeight() : 0;
        int e17 = ik1.w.e(height);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGameWebTabUI", "tabHeight:%d, heightInH5:%d", java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(e17));
        return e17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k
    public boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222856a.f222751m;
        return c16008xdb77bd65 != null && c16008xdb77bd65.f222684d.size() <= 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k
    public void d(boolean z17) {
        p53.u uVar = this.f222856a.f222749h;
        if (uVar != null) {
            uVar.m157861x421622b1().m64790x8163599e(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k
    public java.lang.String e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222856a.f222751m;
        return c16008xdb77bd65 != null ? c16008xdb77bd65.e() : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k
    public boolean f() {
        return this.f222856a.getIntent().getBooleanExtra("game_has_entrance_info", false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k
    public void g(java.lang.String str) {
        p53.u uVar = this.f222856a.f222749h;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb m157861x421622b1 = uVar.m157861x421622b1();
            m157861x421622b1.getClass();
            m157861x421622b1.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.t0(m157861x421622b1, str));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k
    public int h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7 activityC16011x94b3fdc7 = this.f222856a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = activityC16011x94b3fdc7.f222751m;
        if (c16008xdb77bd65 == null) {
            return 0;
        }
        if (c16008xdb77bd65.f222684d.containsKey("chat")) {
            return 2;
        }
        return r53.n.a(activityC16011x94b3fdc7.f222751m) ? 1 : 0;
    }
}
