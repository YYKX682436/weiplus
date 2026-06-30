package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes12.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final b11.f f286331a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286332b;

    /* renamed from: c, reason: collision with root package name */
    public final t21.v2 f286333c;

    /* renamed from: d, reason: collision with root package name */
    public final fk4.u f286334d;

    public h0(b11.f mediaInfo, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, t21.v2 videoInfo, fk4.u videoDownloader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoDownloader, "videoDownloader");
        this.f286331a = mediaInfo;
        this.f286332b = msgInfo;
        this.f286333c = videoInfo;
        this.f286334d = videoDownloader;
    }

    /* renamed from: equals */
    public boolean m80329xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h0)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h0 h0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f286331a, h0Var.f286331a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f286332b, h0Var.f286332b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f286333c, h0Var.f286333c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f286334d, h0Var.f286334d);
    }

    /* renamed from: hashCode */
    public int m80330x8cdac1b() {
        return (((((this.f286331a.hashCode() * 31) + this.f286332b.hashCode()) * 31) + this.f286333c.hashCode()) * 31) + this.f286334d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m80331x9616526c() {
        return "PrepareContext(mediaInfo=" + this.f286331a + ", msgInfo=" + this.f286332b + ", videoInfo=" + this.f286333c + ", videoDownloader=" + this.f286334d + ')';
    }
}
