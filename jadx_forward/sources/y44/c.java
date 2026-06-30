package y44;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f540893a;

    /* renamed from: b, reason: collision with root package name */
    public final long f540894b;

    /* renamed from: c, reason: collision with root package name */
    public final long f540895c;

    /* renamed from: d, reason: collision with root package name */
    public final y44.b f540896d;

    public c(java.lang.String pkg, long j17, long j18, y44.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkg, "pkg");
        this.f540893a = pkg;
        this.f540894b = j17;
        this.f540895c = j18;
        this.f540896d = bVar;
    }

    /* renamed from: equals */
    public boolean m176489xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return true;
        }
        if (!(obj instanceof y44.c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return false;
        }
        y44.c cVar = (y44.c) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540893a, cVar.f540893a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return false;
        }
        if (this.f540894b != cVar.f540894b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return false;
        }
        if (this.f540895c != cVar.f540895c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540896d, cVar.f540896d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        return b17;
    }

    /* renamed from: hashCode */
    public int m176490x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        int hashCode = ((((this.f540893a.hashCode() * 31) + java.lang.Long.hashCode(this.f540894b)) * 31) + java.lang.Long.hashCode(this.f540895c)) * 31;
        y44.b bVar = this.f540896d;
        int hashCode2 = hashCode + (bVar == null ? 0 : bVar.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m176491x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        java.lang.String str = "InstallPkgData(pkg=" + this.f540893a + ", startTime=" + this.f540894b + ", delayDuration=" + this.f540895c + ", action=" + this.f540896d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
        return str;
    }
}
