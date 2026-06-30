package z74;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f552133a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f552134b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f552135c;

    /* renamed from: d, reason: collision with root package name */
    public r45.jj4 f552136d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f552137e;

    public g(java.lang.String str) {
        this.f552133a = android.text.TextUtils.isEmpty(str) ? "OnlineVideoLayoutBuilder" : str;
    }

    public final void a() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLayout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
        r45.jj4 jj4Var = this.f552136d;
        java.lang.String str = this.f552133a;
        if (jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "OnlineVideoLayoutBuilder: the media object is null");
            z17 = false;
        } else {
            z17 = true;
        }
        if (this.f552135c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "OnlineVideoLayoutBuilder: the time line object is null");
            z17 = false;
        }
        if (this.f552134b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "OnlineVideoLayoutBuilder: the video container is null");
            z17 = false;
        }
        if (android.text.TextUtils.isEmpty(this.f552137e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "OnlineVideoLayoutBuilder: the sns local id is empty");
            z17 = false;
        }
        if (z17) {
            r45.jj4 jj4Var2 = this.f552136d;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f552135c;
            android.view.ViewGroup viewGroup = this.f552134b;
            java.lang.String str2 = this.f552137e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
            java.lang.String str3 = c19807x593d1720.Id;
            boolean f17 = xd4.o0.d().f(str3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 b17 = xd4.o0.d().b(str3);
            if (a84.y0.e(viewGroup)) {
                android.view.View childAt = viewGroup.getChildAt(0);
                if ((childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str3, ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) childAt).f252174m2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "the obj id is not equal, remove child!!!!");
                    a84.y0.c(viewGroup);
                }
            }
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "the item is  null!!!!");
            } else {
                b17.P(jj4Var2, str2, c19807x593d1720.f39015xc86e6609);
            }
            if (b17 != null && !a84.y0.e(viewGroup)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "the videoView is not null, the container is empty");
                a84.y0.i(b17);
                a84.y0.o(b17, -1, -1);
                a84.y0.p(b17, true);
                b17.m70656x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
                a84.y0.b(viewGroup, b17, 0);
            } else if (f17 && a84.y0.e(viewGroup) && !xd4.o0.d().e(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "the container is not empty, the state is invalid");
                a84.y0.c(viewGroup);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
    }
}
