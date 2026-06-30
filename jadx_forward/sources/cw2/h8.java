package cw2;

/* loaded from: classes2.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f305278a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f305279b;

    /* renamed from: c, reason: collision with root package name */
    public final mn2.g4 f305280c;

    /* renamed from: d, reason: collision with root package name */
    public final int f305281d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f305282e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f305283f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f305284g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f305285h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f305286i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.dd4 f305287j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f305288k;

    public h8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 feed, java.lang.String mediaId, mn2.g4 media, int i17, java.util.LinkedList mediaList, boolean z17, boolean z18, boolean z19, boolean z27, r45.dd4 dd4Var, boolean z28, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z19 = (i18 & 128) != 0 ? false : z19;
        z27 = (i18 & 256) != 0 ? false : z27;
        dd4Var = (i18 & 512) != 0 ? null : dd4Var;
        z28 = (i18 & 1024) != 0 ? false : z28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        this.f305278a = feed;
        this.f305279b = mediaId;
        this.f305280c = media;
        this.f305281d = i17;
        this.f305282e = mediaList;
        this.f305283f = z17;
        this.f305284g = z18;
        this.f305285h = z19;
        this.f305286i = z27;
        this.f305287j = dd4Var;
        this.f305288k = z28;
    }

    /* renamed from: equals */
    public boolean m122885xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.h8)) {
            return false;
        }
        cw2.h8 h8Var = (cw2.h8) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305278a, h8Var.f305278a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305279b, h8Var.f305279b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305280c, h8Var.f305280c) && this.f305281d == h8Var.f305281d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305282e, h8Var.f305282e) && this.f305283f == h8Var.f305283f && this.f305284g == h8Var.f305284g && this.f305285h == h8Var.f305285h && this.f305286i == h8Var.f305286i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305287j, h8Var.f305287j) && this.f305288k == h8Var.f305288k;
    }

    /* renamed from: hashCode */
    public int m122886x8cdac1b() {
        int hashCode = ((((((((((((((((this.f305278a.hashCode() * 31) + this.f305279b.hashCode()) * 31) + this.f305280c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f305281d)) * 31) + this.f305282e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f305283f)) * 31) + java.lang.Boolean.hashCode(this.f305284g)) * 31) + java.lang.Boolean.hashCode(this.f305285h)) * 31) + java.lang.Boolean.hashCode(this.f305286i)) * 31;
        r45.dd4 dd4Var = this.f305287j;
        return ((hashCode + (dd4Var == null ? 0 : dd4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f305288k);
    }

    /* renamed from: toString */
    public java.lang.String m122887x9616526c() {
        return "PlayInfo(feed=" + this.f305278a + ", mediaId=" + this.f305279b + ", media=" + this.f305280c + ", position=" + this.f305281d + ", mediaList=" + this.f305282e + ", isLocal=" + this.f305283f + ", isFocusPlaying=" + this.f305284g + ", isSeekMode=" + this.f305285h + ", isHasPlayed=" + this.f305286i + ", cropInfo=" + this.f305287j + ", pauseWhenSeek=" + this.f305288k + ')';
    }
}
