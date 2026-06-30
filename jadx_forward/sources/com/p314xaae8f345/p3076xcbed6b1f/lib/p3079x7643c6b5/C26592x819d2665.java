package com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5;

/* renamed from: com.tencent.tinker.lib.service.PatchResult */
/* loaded from: classes13.dex */
public class C26592x819d2665 implements java.io.Serializable {

    /* renamed from: PATCH_TYPE_BSDIFF */
    public static final int f55407x3857c6e4 = 0;

    /* renamed from: PATCH_TYPE_CUSTOM */
    public static final int f55408x3a2fca7f = 1;

    /* renamed from: PATCH_TYPE_UNKNOWN */
    public static final int f55409xb7944edc = -1;

    /* renamed from: dexCostTime */
    public long f55410xf4eda971;

    /* renamed from: dexoptTriggerTime */
    public long f55411x9f906bc9;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Throwable f297078e;

    /* renamed from: isOatGenerated */
    public boolean f55412xcd215d17;

    /* renamed from: isSuccess */
    public boolean f55413x6e268779;

    /* renamed from: patchVersion */
    public java.lang.String f55414x7bc63370;

    /* renamed from: rawPatchFilePath */
    public java.lang.String f55415xf44864e1;

    /* renamed from: resCostTime */
    public long f55416x341944fa;

    /* renamed from: soCostTime */
    public long f55417xf1341eb6;

    /* renamed from: totalCostTime */
    public long f55418xe843839e;

    /* renamed from: type */
    public int f55419x368f3a = -1;

    /* renamed from: useEmergencyMode */
    public boolean f55420xb6a9208d;

    /* renamed from: toString */
    public java.lang.String m104447x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("\nPatchResult: \n");
        stringBuffer.append("isSuccess:" + this.f55413x6e268779 + "\n");
        stringBuffer.append("rawPatchFilePath:" + this.f55415xf44864e1 + "\n");
        stringBuffer.append("useEmergencyMode:" + this.f55420xb6a9208d + "\n");
        stringBuffer.append("costTime:" + this.f55418xe843839e + "\n");
        stringBuffer.append("dexoptTriggerTime:" + this.f55411x9f906bc9 + "\n");
        stringBuffer.append("isOatGenerated:" + this.f55412xcd215d17 + "\n");
        if (this.f55414x7bc63370 != null) {
            stringBuffer.append("patchVersion:" + this.f55414x7bc63370 + "\n");
        }
        if (this.f297078e != null) {
            stringBuffer.append("Throwable:" + this.f297078e.getMessage() + "\n");
        }
        return stringBuffer.toString();
    }
}
