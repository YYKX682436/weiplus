package d44;

/* loaded from: classes3.dex */
public abstract class j {
    public static final void a(final java.lang.String username, int i17, final yz5.l callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("follow", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFollow", "it is begin to follow finder");
            new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be>(username, callback) { // from class: com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener

                /* renamed from: d, reason: collision with root package name */
                public final java.lang.String f244188d;

                /* renamed from: e, reason: collision with root package name */
                public final yz5.l f244189e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(com.p314xaae8f345.mm.app.a0.f134821d);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
                    this.f244188d = username;
                    this.f244189e = callback;
                    this.f39173x3fe91575 = 398763182;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be event = c5560x6f070be;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    boolean z17 = true;
                    try {
                        mo48814x2efc64();
                        boolean z18 = false;
                        am.zd zdVar = event.f135879g;
                        if (zdVar == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                            z17 = false;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFollow", "the follow user name is " + zdVar.f90084a);
                            java.lang.String str = zdVar.f90084a;
                            if (str != null && str.equals(this.f244188d)) {
                                z18 = true;
                            }
                            if (z18 && zdVar.f90085b == 1) {
                                this.f244189e.mo146xb9724478(java.lang.Boolean.valueOf(zdVar.f90086c));
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                        }
                    } catch (java.lang.Throwable unused) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper$FollowUserEventListener");
                    return z17;
                }
            }.mo48813x58998cd();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ni(username, 1, 0L, false, i17, 0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFollow", "the finder follow exception: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("follow", "com.tencent.mm.plugin.sns.ad.finder.FinderUserFollowHelper");
    }
}
