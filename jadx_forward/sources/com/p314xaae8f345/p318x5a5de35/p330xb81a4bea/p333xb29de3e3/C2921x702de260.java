package com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3;

/* renamed from: com.tencent.cloud.huiyan.entity.YTLivenessConfig */
/* loaded from: classes14.dex */
public class C2921x702de260 {

    /* renamed from: ytLightData */
    private java.lang.String f9990xb1a8fd05 = "";

    /* renamed from: needEncrypt */
    private boolean f9985x719f8cef = true;

    /* renamed from: enhanceEncryptMethod */
    private int f9982xf3dd8798 = 0;

    /* renamed from: prepareTimeout */
    private long f9986xdb91725a = 30000;

    /* renamed from: actionTimeout */
    private long f9981x46e1e4b = 30000;

    /* renamed from: livenessMode */
    private int f9984xb5e63986 = 4;

    /* renamed from: landscape */
    private boolean f9983x5545f2bb = false;

    /* renamed from: ratio4_3 */
    private java.lang.String f9988x196f7efd = "0.020833, 0.140625, 0.020833, 0.140625";

    /* renamed from: ratio16_9 */
    private java.lang.String f9987x147e6f2a = "0.013889, 0.226563, 0.013889, 0.226563";

    /* renamed from: resourceDownloadPath */
    private java.lang.String f9989x6b348ffb = "";

    /* renamed from: getActionTimeout */
    public long m21913xc1cdda95() {
        return this.f9981x46e1e4b;
    }

    /* renamed from: getEnhanceEncryptMethod */
    public int m21914xa1a9440e() {
        return this.f9982xf3dd8798;
    }

    /* renamed from: getLivenessMode */
    public int m21915x16d8cbfc() {
        return this.f9984xb5e63986;
    }

    /* renamed from: getPrepareTimeout */
    public long m21916xca293f50() {
        return this.f9986xdb91725a;
    }

    /* renamed from: getRatio16_9 */
    public java.lang.String m21917x13ebe074() {
        return this.f9987x147e6f2a;
    }

    /* renamed from: getRatio4_3 */
    public java.lang.String m21918x9549bc73() {
        return this.f9988x196f7efd;
    }

    /* renamed from: getResourceDownloadPath */
    public java.lang.String m21919x19004c71() {
        return this.f9989x6b348ffb;
    }

    /* renamed from: getYtLightData */
    public java.lang.String m21920x8b7f43cf() {
        return this.f9990xb1a8fd05;
    }

    /* renamed from: isLandscape */
    public boolean m21921x9b8334b1() {
        return this.f9983x5545f2bb;
    }

    /* renamed from: isNeedEncrypt */
    public boolean m21922x1d942965() {
        return this.f9985x719f8cef;
    }

    /* renamed from: setActionTimeout */
    public void m21923x54a44109(long j17) {
        this.f9981x46e1e4b = j17;
    }

    /* renamed from: setEnhanceEncryptMethod */
    public void m21924x1bfc731a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2926x4eecd75e enumC2926x4eecd75e) {
        if (enumC2926x4eecd75e == com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2926x4eecd75e.AES) {
            this.f9982xf3dd8798 = 0;
        }
        if (enumC2926x4eecd75e == com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2926x4eecd75e.SM4) {
            this.f9982xf3dd8798 = 1;
        }
    }

    /* renamed from: setLandscape */
    public void m21925xb1072479(boolean z17) {
        this.f9983x5545f2bb = z17;
    }

    /* renamed from: setLivenessMode */
    public void m21926x4d21c708(int i17) {
        this.f9984xb5e63986 = i17;
    }

    /* renamed from: setNeedEncrypt */
    public void m21927xe1db472d(boolean z17) {
        this.f9985x719f8cef = z17;
    }

    /* renamed from: setPrepareTimeout */
    public void m21928x921fa75c(long j17) {
        this.f9986xdb91725a = j17;
    }

    /* renamed from: setRatio16_9 */
    public void m21929x703fa0e8(java.lang.String str) {
        this.f9987x147e6f2a = str;
    }

    /* renamed from: setRatio4_3 */
    public void m21930x90021d7f(java.lang.String str) {
        this.f9988x196f7efd = str;
    }

    /* renamed from: setResourceDownloadPath */
    public void m21931x93537b7d(java.lang.String str) {
        this.f9989x6b348ffb = str;
    }

    /* renamed from: setYtLightData */
    public void m21932x21e4b743(java.lang.String str) {
        this.f9990xb1a8fd05 = str;
    }
}
