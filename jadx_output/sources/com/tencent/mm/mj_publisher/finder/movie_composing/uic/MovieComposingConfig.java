package com.tencent.mm.mj_publisher.finder.movie_composing.uic;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieComposingConfig;", "Landroid/os/Parcelable;", "CREATOR", "gx0/w0", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MovieComposingConfig implements android.os.Parcelable {
    public static final gx0.w0 CREATOR = new gx0.w0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f69342d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f69343e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.maas_api.MovieComposingOption f69344f;

    /* renamed from: g, reason: collision with root package name */
    public final gx0.i1 f69345g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f69346h;

    /* renamed from: i, reason: collision with root package name */
    public r45.q23 f69347i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f69348m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f69349n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f69350o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f69351p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f69352q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f69353r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f69354s;

    /* renamed from: t, reason: collision with root package name */
    public eu0.q f69355t;

    /* renamed from: u, reason: collision with root package name */
    public r45.ab4 f69356u;

    /* renamed from: v, reason: collision with root package name */
    public r45.mi0 f69357v;

    public MovieComposingConfig(java.lang.String outputVideoPath, java.util.List mediaList, com.tencent.mm.maas_api.MovieComposingOption option, gx0.i1 entryScene, java.util.List waitSaveToAlbumAssets) {
        kotlin.jvm.internal.o.g(outputVideoPath, "outputVideoPath");
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        kotlin.jvm.internal.o.g(option, "option");
        kotlin.jvm.internal.o.g(entryScene, "entryScene");
        kotlin.jvm.internal.o.g(waitSaveToAlbumAssets, "waitSaveToAlbumAssets");
        this.f69342d = outputVideoPath;
        this.f69343e = mediaList;
        this.f69344f = option;
        this.f69345g = entryScene;
        this.f69346h = waitSaveToAlbumAssets;
        this.f69352q = jz5.h.b(new gx0.y0(this));
        this.f69353r = jz5.h.b(new gx0.x0(this));
    }

    public final boolean a() {
        return this.f69345g == gx0.i1.f276518e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f69342d);
        parcel.writeTypedList(this.f69343e);
        parcel.writeParcelable(this.f69344f, i17);
        parcel.writeInt(this.f69345g.ordinal());
        parcel.writeTypedList(this.f69346h);
    }
}
