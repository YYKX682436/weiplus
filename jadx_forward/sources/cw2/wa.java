package cw2;

/* loaded from: classes10.dex */
public class wa {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f305627a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f305628b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f305629c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.mb4 f305630d;

    /* renamed from: e, reason: collision with root package name */
    public final mn2.j4 f305631e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f305632f;

    public wa(java.lang.String str, java.lang.String path, java.lang.String mediaId, r45.mb4 mb4Var, mn2.j4 video, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 feedData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedData, "feedData");
        this.f305627a = str;
        this.f305628b = path;
        this.f305629c = mediaId;
        this.f305630d = mb4Var;
        this.f305631e = video;
        this.f305632f = feedData;
    }

    /* renamed from: toString */
    public java.lang.String m122936x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" downloadUrl='");
        sb6.append(this.f305627a);
        sb6.append("', path='");
        sb6.append(this.f305628b);
        sb6.append("', mediaId='");
        sb6.append(this.f305629c);
        sb6.append("' localFinderMedia is null? ");
        sb6.append(this.f305630d == null);
        sb6.append(' ');
        return sb6.toString();
    }
}
