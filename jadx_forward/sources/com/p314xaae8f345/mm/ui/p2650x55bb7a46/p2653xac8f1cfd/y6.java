package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes4.dex */
public class y6 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f281817e;

    public y6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f281817e = f7Var;
        this.f281816d = f9Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "ChattingUI.appExposeReport";
    }

    @Override // java.lang.Runnable
    public void run() {
        int t17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var = this.f281817e;
        java.util.HashSet hashSet = f7Var.f280551h;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281816d;
        hashSet.add(java.lang.Long.valueOf(f9Var.I0()));
        m21.x xVar = new m21.x();
        xVar.a("20MessageID", f9Var.I0() + ",");
        xVar.a("21MessageInnerType", f9Var.mo78013xfb85f7b0() + ",");
        xVar.a("22currChatName", f9Var.Q0() + ",");
        xVar.a("23msgPostUserName", (f9Var.A0() == 1 ? c01.z1.r() : f7Var.f280113d.C() ? (f9Var.j() == null || (t17 = c01.w9.t(f9Var.j())) == -1) ? "" : f9Var.j().substring(0, t17).trim() : f9Var.Q0()) + ",");
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            return;
        }
        xVar.a("24AppId", v17.f430179d + ",");
        if (v17.Y1 != null) {
            r45.td6 td6Var = new r45.td6();
            try {
                td6Var.mo11468x92b714fd(android.util.Base64.decode(v17.Y1, 0));
            } catch (java.lang.Exception unused) {
            }
            if (td6Var.f467864f != null) {
                xVar.a("25SourceAppId", td6Var.f467864f.f466285d + ",");
            }
        }
        xVar.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13634, xVar);
    }
}
