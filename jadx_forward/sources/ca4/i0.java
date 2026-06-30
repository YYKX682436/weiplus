package ca4;

/* loaded from: classes4.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f121476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f121478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121479g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121480h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121481i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121482m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f121483n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121484o;

    public i0(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6) {
        this.f121476d = context;
        this.f121477e = str;
        this.f121478f = i17;
        this.f121479g = str2;
        this.f121480h = str3;
        this.f121481i = str4;
        this.f121482m = str5;
        this.f121483n = i18;
        this.f121484o = str6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2");
        android.content.Intent launchIntentForPackage = this.f121476d.getPackageManager().getLaunchIntentForPackage(this.f121477e);
        if (this.f121478f != 2) {
            ca4.c0.e(this.f121479g, this.f121480h, 0, 2, this.f121481i, this.f121482m, this.f121483n);
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(this.f121476d, launchIntentForPackage, this.f121484o, this.f121478f, new ca4.h0(this), null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.data.SnsAdUtil$2");
    }
}
