package vg2;

/* loaded from: classes3.dex */
public final class t extends vg2.c {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f518117f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1 f518118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, android.view.ViewGroup parentRoot, yz5.l rotateBlock) {
        super(context, parentRoot);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentRoot, "parentRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rotateBlock, "rotateBlock");
        this.f518117f = rotateBlock;
        this.f518018c.setOnClickListener(new vg2.r(this));
    }

    @Override // vg2.c
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.arl;
    }

    @Override // vg2.c
    public int b() {
        return -i65.a.b(this.f518016a, 4);
    }

    @Override // vg2.c
    public void d(android.view.ViewGroup attachView, java.lang.String giftId) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachView, "attachView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        ce2.i e17 = dk2.u7.f315714a.e(giftId);
        if (e17 == null || e17.f67805xe860fa1 == null) {
            f0Var = null;
        } else {
            super.d(attachView, giftId);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GiftActivityJumpToastWidget", "jumpInfo = null");
        }
    }

    public final void e(java.lang.String giftId) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        ce2.i e17 = dk2.u7.f315714a.e(giftId);
        jz5.f0 f0Var = null;
        if (e17 != null && (c19786x6a1e2862 = e17.f67805xe860fa1) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftActivityJumpToastWidget", "bannerJumpImpl business_type:%d", java.lang.Integer.valueOf(c19786x6a1e2862.m76480xe2ee1ca3()));
            if (c19786x6a1e2862.m76503x92bc3c07() == 2) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d9 = c19786x6a1e2862.m76494x46f709d9();
                if (m76494x46f709d9 == null || (str = m76494x46f709d9.m77166xb5887639()) == null) {
                    str = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftActivityJumpToastWidget", "jump half h5 url:%s", str);
                if (c19786x6a1e2862.m76494x46f709d9() == null || android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GiftActivityJumpToastWidget", "jumpToHalfScreenH5 html5_info is null or url is empty");
                } else {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d92 = c19786x6a1e2862.m76494x46f709d9();
                    boolean z17 = m76494x46f709d92 != null && m76494x46f709d92.m77164x7528c3fb() == 1;
                    android.content.Context context = this.f518016a;
                    if (!z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftActivityJumpToastWidget", "show FullScreenWebView");
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", str);
                        intent.putExtra("convertActivityFromTranslucent", true);
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    } else if (context.getResources().getConfiguration().orientation == 2) {
                        this.f518117f.mo146xb9724478(this.f518020e);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftActivityJumpToastWidget", "change to portrait and show dialog");
                    } else {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d93 = c19786x6a1e2862.m76494x46f709d9();
                        int m77163xab345223 = m76494x46f709d93 != null ? m76494x46f709d93.m77163xab345223() : 0;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftActivityJumpToastWidget", "show HalfScreenWebView heightPercent:" + m77163xab345223);
                        if (m77163xab345223 < df2.lt.Y || m77163xab345223 > df2.lt.Z) {
                            m77163xab345223 = 75;
                        }
                        float f17 = m77163xab345223 / 100;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftActivityJumpToastWidget", "realScreenHeightPercent:" + f17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1 wi6 = ((yg0.s2) ((zg0.u2) i95.n0.c(zg0.u2.class))).wi(context, str, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(f17, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388586, null));
                        this.f518118g = wi6;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) wi6).show();
                        java.lang.Object obj = this.f518118g;
                        if (obj != null) {
                            ((hg5.d) obj).f362939o = new vg2.s(this);
                        }
                    }
                }
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GiftActivityJumpToastWidget", "giftActivityJumpToastWidget jump click null");
        }
    }
}
