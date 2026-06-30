package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f233310a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f233311b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f233312c;

    public a3(java.lang.String songName, java.lang.String singer, java.lang.String albumUrl, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        songName = (i17 & 1) != 0 ? "" : songName;
        singer = (i17 & 2) != 0 ? "" : singer;
        albumUrl = (i17 & 4) != 0 ? "" : albumUrl;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songName, "songName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singer, "singer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(albumUrl, "albumUrl");
        this.f233310a = songName;
        this.f233311b = singer;
        this.f233312c = albumUrl;
    }

    /* renamed from: equals */
    public boolean m67384xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a3 a3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f233310a, a3Var.f233310a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f233311b, a3Var.f233311b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f233312c, a3Var.f233312c);
    }

    /* renamed from: hashCode */
    public int m67385x8cdac1b() {
        return (((this.f233310a.hashCode() * 31) + this.f233311b.hashCode()) * 31) + this.f233312c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m67386x9616526c() {
        return "SongInfo(songName=" + this.f233310a + ", singer=" + this.f233311b + ", albumUrl=" + this.f233312c + ')';
    }
}
