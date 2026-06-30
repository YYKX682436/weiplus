package jk2;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final jk2.a f381602a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.zd2 f381603b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f381604c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f381605d;

    public j(jk2.a plugin, r45.zd2 guideData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guideData, "guideData");
        this.f381602a = plugin;
        this.f381603b = guideData;
        this.f381604c = jz5.h.b(new jk2.i(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e c14255x699a7a9e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e) d().r(b(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e.class);
        if (c14255x699a7a9e != null) {
            long c17 = (c01.id.c() - c14255x699a7a9e.f193274d) / 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f381605d, "checkClear, saveTime: " + java.lang.Long.valueOf(c14255x699a7a9e.f193274d) + " value: " + java.lang.Integer.valueOf(c14255x699a7a9e.f193275e) + " offest: " + c17);
            if (c17 > 86400) {
                d().d();
            }
        }
        this.f381605d = "VisitorCloseGuide_" + e();
    }

    public abstract boolean a();

    public final java.lang.String b() {
        return "LiveGuide_" + this.f381603b.m75939xb282bd08(0);
    }

    public final java.lang.String c() {
        return "LiveGuide_" + this.f381603b.m75939xb282bd08(0) + '_' + ((mm2.e1) ((df2.wv) this.f381602a).b().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) this.f381604c.mo141623x754a37bb();
    }

    public abstract java.lang.String e();

    public boolean f() {
        return true;
    }

    public final boolean g() {
        boolean z17 = false;
        int i17 = d().getInt(c(), 0);
        java.lang.String str = "isCurrentLiveHadGuide key: " + c() + " hadGuide: " + i17;
        java.lang.String str2 = this.f381605d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (!(i17 != 0) && a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e c14255x699a7a9e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e) d().r(b(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1519x5e23afc.C14255x699a7a9e.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isGuideCountOver key: ");
            sb6.append(b());
            sb6.append(" count: ");
            sb6.append(c14255x699a7a9e != null ? java.lang.Integer.valueOf(c14255x699a7a9e.f193275e) : null);
            sb6.append(" dayTimes: ");
            r45.zd2 zd2Var = this.f381603b;
            sb6.append(zd2Var.m75939xb282bd08(3));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            if (!((c14255x699a7a9e != null ? c14255x699a7a9e.f193275e : 0) >= zd2Var.m75939xb282bd08(3))) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "isEnableShow: ret=" + z17);
        return z17;
    }

    public void h() {
    }

    public abstract void i();

    public void j(r45.r71 r71Var) {
    }

    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f381605d, "start preload");
    }

    public void l() {
    }
}
