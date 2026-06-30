package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.ExifTag */
/* loaded from: classes13.dex */
class C0789x14cacc4a {

    /* renamed from: name */
    public final java.lang.String f1959x337a8b;

    /* renamed from: number */
    public final int f1960xc258db49;

    /* renamed from: primaryFormat */
    public final int f1961xca4be899;

    /* renamed from: secondaryFormat */
    public final int f1962x62836e8b;

    public C0789x14cacc4a(java.lang.String str, int i17, int i18) {
        this.f1959x337a8b = str;
        this.f1960xc258db49 = i17;
        this.f1961xca4be899 = i18;
        this.f1962x62836e8b = -1;
    }

    /* renamed from: isFormatCompatible */
    public boolean m5916x49412375(int i17) {
        int i18;
        int i19 = this.f1961xca4be899;
        if (i19 == 7 || i17 == 7 || i19 == i17 || (i18 = this.f1962x62836e8b) == i17) {
            return true;
        }
        if ((i19 == 4 || i18 == 4) && i17 == 3) {
            return true;
        }
        if ((i19 == 9 || i18 == 9) && i17 == 8) {
            return true;
        }
        return (i19 == 12 || i18 == 12) && i17 == 11;
    }

    public C0789x14cacc4a(java.lang.String str, int i17, int i18, int i19) {
        this.f1959x337a8b = str;
        this.f1960xc258db49 = i17;
        this.f1961xca4be899 = i18;
        this.f1962x62836e8b = i19;
    }
}
