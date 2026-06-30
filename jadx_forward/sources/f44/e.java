package f44;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f341083a;

    /* renamed from: b, reason: collision with root package name */
    public final int f341084b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f341085c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f341086d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341087e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        this.f341084b = 0;
        this.f341086d = c17933xe8d1b226;
        this.f341087e = i17;
        this.f341084b = 0;
        this.f341083a = a(c17933xe8d1b226 != null ? c17933xe8d1b226.m70367x7525eefd() : "", 0);
    }

    public static java.lang.String a(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeKey", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager$TaskInfo");
        if (str == null) {
            java.lang.String str2 = " _" + i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeKey", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager$TaskInfo");
            return str2;
        }
        java.lang.String str3 = str + "_" + i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeKey", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager$TaskInfo");
        return str3;
    }

    public e(java.lang.String str, java.lang.String[] strArr) {
        this.f341084b = 0;
        this.f341085c = strArr;
        this.f341084b = 1;
        this.f341083a = a(str, 1);
    }
}
