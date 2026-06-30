package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class m2 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public int f76517d = 0;

    public m2(com.tencent.mm.plugin.appbrand.appusage.n2 n2Var) {
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((java.util.HashSet) com.tencent.mm.plugin.appbrand.utils.s0.f90550a).remove(this);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        int i18 = this.f76517d;
        this.f76517d = i18 + 1;
        if (i18 < 1 && z17) {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/uploaduserlocationinfo";
            lVar.f70667d = 1154;
            lVar.f70665b = new r45.wu6();
            r45.vu6 vu6Var = new r45.vu6();
            vu6Var.f388587d = f18;
            vu6Var.f388588e = f17;
            vu6Var.f388590g = d18;
            lVar.f70664a = vu6Var;
            com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.appbrand.appusage.l2(this, f17, f18, d18), true);
        }
        return true;
    }
}
