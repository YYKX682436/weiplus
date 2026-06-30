package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class t90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f217534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f217535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 f217536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f217537g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t90(android.view.ViewGroup viewGroup, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34, yz5.l lVar) {
        super(1);
        this.f217534d = viewGroup;
        this.f217535e = i17;
        this.f217536f = c15482x9b531b34;
        this.f217537g = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da videoView = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoView, "videoView");
        android.view.ViewGroup viewGroup = this.f217534d;
        videoView.m122874xca0297d8(java.lang.Integer.valueOf(viewGroup.hashCode()));
        android.view.View mo56698x4ee17f0a = videoView.mo56698x4ee17f0a();
        int i17 = this.f217535e;
        if (i17 <= 0) {
            i17 = 0;
        }
        viewGroup.addView(mo56698x4ee17f0a, i17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        videoView.m122873xca0297d8(com.p314xaae8f345.mm.R.id.g4z, java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
        this.f217536f.f215211n.put(java.lang.Integer.valueOf(viewGroup.hashCode()), null);
        this.f217537g.mo146xb9724478(videoView);
        return jz5.f0.f384359a;
    }
}
