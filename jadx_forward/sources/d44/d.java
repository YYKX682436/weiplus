package d44;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f307961a;

    /* renamed from: b, reason: collision with root package name */
    public final int f307962b;

    /* renamed from: c, reason: collision with root package name */
    public final d44.b f307963c;

    public d(java.lang.String str, int i17, d44.b bVar) {
        this.f307961a = str;
        this.f307962b = i17;
        this.f307963c = bVar;
    }

    public void b(int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback");
        d44.b bVar = this.f307963c;
        if (bVar != null) {
            try {
                ((ku5.t0) ku5.t0.f394148d).B(new d44.c(this, i17, bVar, obj));
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback");
    }
}
