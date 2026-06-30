package ab4;

/* loaded from: classes4.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2903a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f2904b = "";

    /* renamed from: c, reason: collision with root package name */
    public float f2905c;

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
        if (obj == this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
            return true;
        }
        if (!(obj instanceof ab4.w0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
            return false;
        }
        ab4.w0 w0Var = (ab4.w0) obj;
        boolean z17 = w0Var.f2903a.equals(this.f2903a) && w0Var.f2904b.equals(this.f2904b) && w0Var.f2905c == this.f2905c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
        return z17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
        int hashCode = (int) (this.f2903a.hashCode() + this.f2904b.hashCode() + this.f2905c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo$Item");
        return hashCode;
    }
}
