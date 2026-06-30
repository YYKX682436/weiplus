package ab4;

/* loaded from: classes4.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2914a;

    /* renamed from: b, reason: collision with root package name */
    public float f2915b;

    /* renamed from: c, reason: collision with root package name */
    public float f2916c;

    /* renamed from: d, reason: collision with root package name */
    public float f2917d;

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
        if (obj == this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
            return true;
        }
        if (!(obj instanceof ab4.z0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
            return false;
        }
        ab4.z0 z0Var = (ab4.z0) obj;
        boolean z17 = z0Var.f2914a.equals(this.f2914a) && z0Var.f2915b == this.f2915b && z0Var.f2916c == this.f2916c && z0Var.f2917d == this.f2917d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
        return z17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
        int hashCode = super.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.PageDownIconInfo");
        return hashCode;
    }
}
