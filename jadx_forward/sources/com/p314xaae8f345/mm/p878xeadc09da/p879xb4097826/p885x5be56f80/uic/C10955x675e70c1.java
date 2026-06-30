package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.uic;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieComposingConfig;", "Landroid/os/Parcelable;", "CREATOR", "gx0/w0", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig */
/* loaded from: classes5.dex */
public final class C10955x675e70c1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final gx0.w0 f29776x681a0c0c = new gx0.w0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150875d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f150876e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p839xf223db21.C10859x7be975f4 f150877f;

    /* renamed from: g, reason: collision with root package name */
    public final gx0.i1 f150878g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f150879h;

    /* renamed from: i, reason: collision with root package name */
    public r45.q23 f150880i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f150881m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f150882n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f150883o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f150884p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f150885q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f150886r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f150887s;

    /* renamed from: t, reason: collision with root package name */
    public eu0.q f150888t;

    /* renamed from: u, reason: collision with root package name */
    public r45.ab4 f150889u;

    /* renamed from: v, reason: collision with root package name */
    public r45.mi0 f150890v;

    public C10955x675e70c1(java.lang.String outputVideoPath, java.util.List mediaList, com.p314xaae8f345.mm.p839xf223db21.C10859x7be975f4 option, gx0.i1 entryScene, java.util.List waitSaveToAlbumAssets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputVideoPath, "outputVideoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryScene, "entryScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(waitSaveToAlbumAssets, "waitSaveToAlbumAssets");
        this.f150875d = outputVideoPath;
        this.f150876e = mediaList;
        this.f150877f = option;
        this.f150878g = entryScene;
        this.f150879h = waitSaveToAlbumAssets;
        this.f150885q = jz5.h.b(new gx0.y0(this));
        this.f150886r = jz5.h.b(new gx0.x0(this));
    }

    public final boolean a() {
        return this.f150878g == gx0.i1.f358051e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f150875d);
        parcel.writeTypedList(this.f150876e);
        parcel.writeParcelable(this.f150877f, i17);
        parcel.writeInt(this.f150878g.ordinal());
        parcel.writeTypedList(this.f150879h);
    }
}
