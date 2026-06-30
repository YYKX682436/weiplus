package ab4;

/* loaded from: classes4.dex */
public class s extends ab4.u {
    public int A1;
    public long B1;
    public java.lang.String C1;
    public java.lang.String D1;
    public java.lang.String E1;

    /* renamed from: z1, reason: collision with root package name */
    public int f2891z1;

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompSmartPhoneBtnInfo");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[sid:");
        stringBuffer.append(this.f2891z1);
        stringBuffer.append(", compId:");
        stringBuffer.append(this.A1);
        stringBuffer.append(", aid:");
        stringBuffer.append(this.B1);
        stringBuffer.append(", traceId:");
        stringBuffer.append(this.C1);
        stringBuffer.append(", pageId:");
        stringBuffer.append(this.E1);
        stringBuffer.append(", uxinfo:");
        stringBuffer.append(this.D1);
        stringBuffer.append("]");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompSmartPhoneBtnInfo");
        return stringBuffer2;
    }
}
