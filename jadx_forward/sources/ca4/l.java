package ca4;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f121510a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f121511b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f121512c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f121513d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f121514e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f121515f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f121516g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f121517h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f121518i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f121519j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f121520k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f121521l = 0;

    public boolean a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkTypeIsSame", "com.tencent.mm.plugin.sns.data.CalInfo");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(i17) && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(i18)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTypeIsSame", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        boolean z17 = i17 == i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTypeIsSame", "com.tencent.mm.plugin.sns.data.CalInfo");
        return z17;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCal", "com.tencent.mm.plugin.sns.data.CalInfo");
        this.f121511b = -1;
        this.f121519j = -1;
        this.f121510a = -1;
        this.f121514e = "";
        this.f121515f = "";
        this.f121516g = "";
        this.f121520k = -1;
        this.f121512c = -1;
        this.f121517h = -1;
        this.f121518i = 0;
        this.f121513d = 0;
        this.f121521l = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCal", "com.tencent.mm.plugin.sns.data.CalInfo");
    }

    public boolean c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOneLineType", "com.tencent.mm.plugin.sns.data.CalInfo");
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
                                case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
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
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOneLineType", "com.tencent.mm.plugin.sns.data.CalInfo");
                                            return false;
                                    }
                            }
                    }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOneLineType", "com.tencent.mm.plugin.sns.data.CalInfo");
        return true;
    }

    public boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
        int i17 = this.f121517h;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f121511b == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (!a(i17, this.f121512c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (c(this.f121517h)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (c(this.f121512c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f121518i > 1 || this.f121513d > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        java.lang.String str = this.f121516g;
        if (str != null && !str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        java.lang.String str2 = this.f121514e;
        if (str2 != null && !str2.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f121510a != this.f121511b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
        return false;
    }

    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
        if (this.f121519j == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (!a(this.f121512c, this.f121520k)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (c(this.f121520k)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f121521l > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        java.lang.String str = this.f121515f;
        if (str != null && !str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        if (this.f121511b != this.f121519j) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
        return false;
    }
}
