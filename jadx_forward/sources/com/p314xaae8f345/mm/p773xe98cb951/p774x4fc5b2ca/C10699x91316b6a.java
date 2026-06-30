package com.p314xaae8f345.mm.p773xe98cb951.p774x4fc5b2ca;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature_api/recordvideo/INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo", "Landroid/os/Parcelable;", "recordvideo-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo */
/* loaded from: classes5.dex */
public final /* data */ class C10699x91316b6a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p773xe98cb951.p774x4fc5b2ca.C10699x91316b6a> f28938x681a0c0c = new ci0.t();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f149405d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f149406e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f149407f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f149408g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f149409h;

    /* renamed from: i, reason: collision with root package name */
    public final int f149410i;

    /* renamed from: m, reason: collision with root package name */
    public final int f149411m;

    public C10699x91316b6a(java.lang.String musicId, java.lang.String streamUrl, java.lang.String songName, java.util.List singers, java.lang.String coverUrl, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamUrl, "streamUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songName, "songName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singers, "singers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        this.f149405d = musicId;
        this.f149406e = streamUrl;
        this.f149407f = songName;
        this.f149408g = singers;
        this.f149409h = coverUrl;
        this.f149410i = i17;
        this.f149411m = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45333xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p773xe98cb951.p774x4fc5b2ca.C10699x91316b6a)) {
            return false;
        }
        com.p314xaae8f345.mm.p773xe98cb951.p774x4fc5b2ca.C10699x91316b6a c10699x91316b6a = (com.p314xaae8f345.mm.p773xe98cb951.p774x4fc5b2ca.C10699x91316b6a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149405d, c10699x91316b6a.f149405d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149406e, c10699x91316b6a.f149406e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149407f, c10699x91316b6a.f149407f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149408g, c10699x91316b6a.f149408g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149409h, c10699x91316b6a.f149409h) && this.f149410i == c10699x91316b6a.f149410i && this.f149411m == c10699x91316b6a.f149411m;
    }

    /* renamed from: hashCode */
    public int m45334x8cdac1b() {
        return (((((((((((this.f149405d.hashCode() * 31) + this.f149406e.hashCode()) * 31) + this.f149407f.hashCode()) * 31) + this.f149408g.hashCode()) * 31) + this.f149409h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f149410i)) * 31) + java.lang.Integer.hashCode(this.f149411m);
    }

    /* renamed from: toString */
    public java.lang.String m45335x9616526c() {
        return "NewLifeSelectedMusicInfo(musicId=" + this.f149405d + ", streamUrl=" + this.f149406e + ", songName=" + this.f149407f + ", singers=" + this.f149408g + ", coverUrl=" + this.f149409h + ", duration=" + this.f149410i + ", musicType=" + this.f149411m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f149405d);
        out.writeString(this.f149406e);
        out.writeString(this.f149407f);
        out.writeStringList(this.f149408g);
        out.writeString(this.f149409h);
        out.writeInt(this.f149410i);
        out.writeInt(this.f149411m);
    }
}
