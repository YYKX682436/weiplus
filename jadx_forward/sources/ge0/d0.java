package ge0;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f352424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ge0.e0 f352426f;

    public d0(ge0.e0 e0Var, long j17, java.lang.String str) {
        this.f352426f = e0Var;
        this.f352424d = j17;
        this.f352425e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(this.f352426f.f352427a);
        if (i17 == null || i17.f68891x29d1292e == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = i17.m70371x485d7();
        if (m70371x485d7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
            return;
        }
        java.lang.String str = m70371x485d7.f39013x4c306a8a;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(i17.f68891x29d1292e);
        java.util.regex.Matcher matcher = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b0.f272719u.matcher(str);
        while (matcher.find()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.i7(3, matcher.group(), t07, this.f352424d, this.f352425e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
    }
}
