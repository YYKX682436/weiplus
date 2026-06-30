package za4;

/* loaded from: classes4.dex */
public class c0 implements za4.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za4.e0 f552602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f552604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552605d;

    public c0(za4.e0 e0Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f552602a = e0Var;
        this.f552603b = str;
        this.f552604c = i17;
        this.f552605d = str2;
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
        java.lang.String str = this.f552603b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadFileHelper", " download error for cdn file %s", str);
        this.f552602a.a();
        if (this.f552604c == 0) {
            n74.t.b(1, 1, 1, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
    }
}
