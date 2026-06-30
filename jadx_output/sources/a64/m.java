package a64;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f1783a;

    /* renamed from: b, reason: collision with root package name */
    public int f1784b;

    /* renamed from: c, reason: collision with root package name */
    public int f1785c;

    /* renamed from: d, reason: collision with root package name */
    public int f1786d;

    /* renamed from: e, reason: collision with root package name */
    public int f1787e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1788f;

    /* renamed from: g, reason: collision with root package name */
    public int f1789g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1790h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1791i;

    public m(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, kotlin.jvm.internal.i iVar) {
        i17 = (i47 & 1) != 0 ? 0 : i17;
        i18 = (i47 & 2) != 0 ? 0 : i18;
        i19 = (i47 & 4) != 0 ? 0 : i19;
        i27 = (i47 & 8) != 0 ? 0 : i27;
        i28 = (i47 & 16) != 0 ? 0 : i28;
        i29 = (i47 & 32) != 0 ? 0 : i29;
        i37 = (i47 & 64) != 0 ? 0 : i37;
        i38 = (i47 & 128) != 0 ? i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12) : i38;
        i39 = (i47 & 256) != 0 ? i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 28) : i39;
        this.f1783a = i17;
        this.f1784b = i18;
        this.f1785c = i19;
        this.f1786d = i27;
        this.f1787e = i28;
        this.f1788f = i29;
        this.f1789g = i37;
        this.f1790h = i38;
        this.f1791i = i39;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return true;
        }
        if (!(obj instanceof a64.m)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return false;
        }
        a64.m mVar = (a64.m) obj;
        if (this.f1783a != mVar.f1783a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return false;
        }
        if (this.f1784b != mVar.f1784b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return false;
        }
        if (this.f1785c != mVar.f1785c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return false;
        }
        if (this.f1786d != mVar.f1786d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return false;
        }
        if (this.f1787e != mVar.f1787e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return false;
        }
        if (this.f1788f != mVar.f1788f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return false;
        }
        if (this.f1789g != mVar.f1789g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return false;
        }
        if (this.f1790h != mVar.f1790h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
            return false;
        }
        int i17 = this.f1791i;
        int i18 = mVar.f1791i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        int hashCode = (((((((((((((((java.lang.Integer.hashCode(this.f1783a) * 31) + java.lang.Integer.hashCode(this.f1784b)) * 31) + java.lang.Integer.hashCode(this.f1785c)) * 31) + java.lang.Integer.hashCode(this.f1786d)) * 31) + java.lang.Integer.hashCode(this.f1787e)) * 31) + java.lang.Integer.hashCode(this.f1788f)) * 31) + java.lang.Integer.hashCode(this.f1789g)) * 31) + java.lang.Integer.hashCode(this.f1790h)) * 31) + java.lang.Integer.hashCode(this.f1791i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        java.lang.String str = "ContentSizeAttr(screenWidth=" + this.f1783a + ", screenHeight=" + this.f1784b + ", statusBarHeight=" + this.f1785c + ", actionBarHeight=" + this.f1786d + ", statusBarAndActionBarHeight=" + this.f1787e + ", topContainerHeight=" + this.f1788f + ", initVisibleHalfScreenHeight=" + this.f1789g + ", halfScreenHeaderHeight=" + this.f1790h + ", halfScreenDragHeaderHeight=" + this.f1791i + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC$ContentSizeAttr");
        return str;
    }
}
