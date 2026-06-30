package com.tencent.mm.feature_api.recordvideo;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature_api/recordvideo/INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo", "Landroid/os/Parcelable;", "recordvideo-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo> CREATOR = new ci0.t();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f67872d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67873e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f67874f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f67875g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f67876h;

    /* renamed from: i, reason: collision with root package name */
    public final int f67877i;

    /* renamed from: m, reason: collision with root package name */
    public final int f67878m;

    public INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo(java.lang.String musicId, java.lang.String streamUrl, java.lang.String songName, java.util.List singers, java.lang.String coverUrl, int i17, int i18) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
        kotlin.jvm.internal.o.g(streamUrl, "streamUrl");
        kotlin.jvm.internal.o.g(songName, "songName");
        kotlin.jvm.internal.o.g(singers, "singers");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        this.f67872d = musicId;
        this.f67873e = streamUrl;
        this.f67874f = songName;
        this.f67875g = singers;
        this.f67876h = coverUrl;
        this.f67877i = i17;
        this.f67878m = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo)) {
            return false;
        }
        com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo = (com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo) obj;
        return kotlin.jvm.internal.o.b(this.f67872d, iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67872d) && kotlin.jvm.internal.o.b(this.f67873e, iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67873e) && kotlin.jvm.internal.o.b(this.f67874f, iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67874f) && kotlin.jvm.internal.o.b(this.f67875g, iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67875g) && kotlin.jvm.internal.o.b(this.f67876h, iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67876h) && this.f67877i == iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67877i && this.f67878m == iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67878m;
    }

    public int hashCode() {
        return (((((((((((this.f67872d.hashCode() * 31) + this.f67873e.hashCode()) * 31) + this.f67874f.hashCode()) * 31) + this.f67875g.hashCode()) * 31) + this.f67876h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f67877i)) * 31) + java.lang.Integer.hashCode(this.f67878m);
    }

    public java.lang.String toString() {
        return "NewLifeSelectedMusicInfo(musicId=" + this.f67872d + ", streamUrl=" + this.f67873e + ", songName=" + this.f67874f + ", singers=" + this.f67875g + ", coverUrl=" + this.f67876h + ", duration=" + this.f67877i + ", musicType=" + this.f67878m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f67872d);
        out.writeString(this.f67873e);
        out.writeString(this.f67874f);
        out.writeStringList(this.f67875g);
        out.writeString(this.f67876h);
        out.writeInt(this.f67877i);
        out.writeInt(this.f67878m);
    }
}
