package dt2;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 f324691a;

    /* renamed from: b, reason: collision with root package name */
    public dk2.rg f324692b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f324693c;

    public a0(android.content.Context context, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9(context);
        this.f324691a = c14932xfc4acec9;
        c14932xfc4acec9.mo56708x764cf626(false);
        c14932xfc4acec9.mo56709x764d819b(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", "init " + hashCode() + " playerView:" + c14932xfc4acec9.hashCode());
        this.f324693c = new dt2.y(this);
    }

    public final void a(mn2.g4 data, java.lang.String key, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 feedData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedData, "feedData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindMediaInfo ");
        sb6.append(hashCode());
        sb6.append(" key:");
        sb6.append(key);
        sb6.append(", playerView:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f324691a;
        sb6.append(c14932xfc4acec9.hashCode());
        sb6.append(",newContainer:");
        sb6.append(data.f411535e.m75945x2fec8307(9));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", sb6.toString());
        c14932xfc4acec9.m58790x1a4b8fc2(key);
        c14932xfc4acec9.n(data, z17, feedData);
    }

    public final void b(android.view.ViewGroup newContainer, java.lang.Integer num, android.util.Size mediaSize, com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 scaleType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newContainer, "newContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSize, "mediaSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleType, "scaleType");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f324691a;
        boolean mo58787xc00617a4 = c14932xfc4acec9.mo58787xc00617a4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", "moveToNewContainer " + hashCode() + " playerView:" + c14932xfc4acec9.hashCode() + ",newContainer:" + newContainer.hashCode() + ",isPlaying:" + mo58787xc00617a4 + ",index:" + num + ",scaleType:" + scaleType);
        c14932xfc4acec9.D = true;
        c14932xfc4acec9.animate().cancel();
        c14932xfc4acec9.animate().setListener(null);
        zl2.r4.f555483a.Q2(c14932xfc4acec9);
        if (z17) {
            c14932xfc4acec9.setClipToOutline(true);
            c14932xfc4acec9.setOutlineProvider(new fo0.p(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8)));
        } else {
            c14932xfc4acec9.setClipToOutline(false);
        }
        if (newContainer.indexOfChild(c14932xfc4acec9) == -1) {
            if (num != null) {
                newContainer.addView(c14932xfc4acec9, num.intValue(), new android.view.ViewGroup.LayoutParams(-1, -1));
            } else {
                newContainer.addView(c14932xfc4acec9, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
        }
        newContainer.post(new dt2.z(this, newContainer, mediaSize, scaleType, mo58787xc00617a4));
    }

    public final void c(android.view.ViewGroup newContainer, android.util.Size mediaSize, com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 scaleType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newContainer, "newContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSize, "mediaSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleType, "scaleType");
        b(newContainer, 0, mediaSize, scaleType, z17);
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseVideo ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f324691a;
        sb6.append(c14932xfc4acec9.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", sb6.toString());
        c14932xfc4acec9.mo58788x65825f6();
    }

    public final void e(java.lang.Integer num) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playVideo ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f324691a;
        sb6.append(c14932xfc4acec9.hashCode());
        sb6.append(",offset:");
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", sb6.toString());
        c14932xfc4acec9.mo56709x764d819b(false);
        c14932xfc4acec9.mo56716x4121a19(true);
        c14932xfc4acec9.J(num);
    }

    public final void f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f324691a;
        sb6.append(c14932xfc4acec9.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", sb6.toString());
        c14932xfc4acec9.d();
        c14932xfc4acec9.b();
    }

    public final void g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFillScaleType ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f324691a;
        sb6.append(c14932xfc4acec9.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", sb6.toString());
        c14932xfc4acec9.mo56713xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
    }

    public final void h() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFitScaleType ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f324691a;
        sb6.append(c14932xfc4acec9.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", sb6.toString());
        c14932xfc4acec9.mo56713xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
    }

    public final void i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopVideo ");
        sb6.append(hashCode());
        sb6.append(" playerView:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f324691a;
        sb6.append(c14932xfc4acec9.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", sb6.toString());
        c14932xfc4acec9.mo58801x360802();
    }
}
