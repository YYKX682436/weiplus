package ca4;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f39977a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f39978b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f39979c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f39980d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f39981e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f39982f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f39983g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f39984h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f39985i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f39986j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f39987k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f39988l = 0;

    public boolean a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkTypeIsSame", "com.tencent.mm.plugin.sns.data.CalInfo");
        if (com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(i17) && com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(i18)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTypeIsSame", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        boolean z17 = i17 == i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTypeIsSame", "com.tencent.mm.plugin.sns.data.CalInfo");
        return z17;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCal", "com.tencent.mm.plugin.sns.data.CalInfo");
        this.f39978b = -1;
        this.f39986j = -1;
        this.f39977a = -1;
        this.f39981e = "";
        this.f39982f = "";
        this.f39983g = "";
        this.f39987k = -1;
        this.f39979c = -1;
        this.f39984h = -1;
        this.f39985i = 0;
        this.f39980d = 0;
        this.f39988l = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCal", "com.tencent.mm.plugin.sns.data.CalInfo");
    }

    public boolean c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOneLineType", "com.tencent.mm.plugin.sns.data.CalInfo");
        if (i17 != 15 && i17 != 18 && i17 != 26 && i17 != 34 && i17 != 59 && i17 != 28 && i17 != 29 && i17 != 55 && i17 != 56) {
            switch (i17) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i17) {
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i17) {
                                case 42:
                                case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                    break;
                                default:
                                    switch (i17) {
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                            break;
                                        default:
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOneLineType", "com.tencent.mm.plugin.sns.data.CalInfo");
                                            return false;
                                    }
                            }
                    }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOneLineType", "com.tencent.mm.plugin.sns.data.CalInfo");
        return true;
    }

    public boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
        int i17 = this.f39984h;
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f39978b == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (!a(i17, this.f39979c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (c(this.f39984h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (c(this.f39979c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f39985i > 1 || this.f39980d > 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        java.lang.String str = this.f39983g;
        if (str != null && !str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        java.lang.String str2 = this.f39981e;
        if (str2 != null && !str2.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f39977a != this.f39978b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
        return false;
    }

    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
        if (this.f39986j == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (!a(this.f39979c, this.f39987k)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (c(this.f39987k)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f39988l > 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        java.lang.String str = this.f39982f;
        if (str != null && !str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f39978b != this.f39986j) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
        return false;
    }
}
