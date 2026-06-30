package ca4;

/* loaded from: classes4.dex */
public class l0 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ca4.d f121526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f121528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f121529h;

    public l0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, ca4.d dVar, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i18) {
        this.f121522a = i17;
        this.f121523b = str;
        this.f121524c = str2;
        this.f121525d = str3;
        this.f121526e = dVar;
        this.f121527f = str4;
        this.f121528g = c17933xe8d1b226;
        this.f121529h = i18;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public void a(boolean z17, boolean z18) {
        da4.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$5");
        java.lang.String str = this.f121525d;
        java.lang.String str2 = this.f121524c;
        java.lang.String str3 = this.f121523b;
        int i17 = this.f121522a;
        if (z17) {
            ca4.d dVar = this.f121526e;
            if (i17 != 2) {
                ca4.m0.B0(str3, str2, str, 2, "0");
                l44.z.c(dVar);
            }
            l44.z.f(dVar, 1);
            java.lang.String str4 = this.f121527f;
            java.lang.String str5 = this.f121523b;
            java.lang.String str6 = this.f121524c;
            java.lang.String str7 = this.f121525d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f121528g;
            int i18 = dVar.f121396m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            try {
                iVar = new da4.i(str4, str5, str6, str7, c17933xe8d1b226, true, i18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
                iVar = null;
            }
            if (iVar != null) {
                if (this.f121529h == 4) {
                    iVar.f309330j = 2;
                }
                da4.h.i(iVar);
            }
        } else if (i17 != 2) {
            ca4.m0.B0(str3, str2, str, 2, "2");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$5");
    }
}
