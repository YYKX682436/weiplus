package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/recordvideo/background/VideoMixer$MixConfig", "Landroid/os/Parcelable;", "CREATOR", "lt3/w", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig */
/* loaded from: classes4.dex */
public final class C16989x37a4afe8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final lt3.w f37755x681a0c0c = new lt3.w(null);

    /* renamed from: d, reason: collision with root package name */
    public int f237174d;

    /* renamed from: e, reason: collision with root package name */
    public int f237175e;

    /* renamed from: f, reason: collision with root package name */
    public int f237176f;

    /* renamed from: g, reason: collision with root package name */
    public int f237177g;

    /* renamed from: h, reason: collision with root package name */
    public int f237178h;

    /* renamed from: i, reason: collision with root package name */
    public int f237179i;

    /* renamed from: m, reason: collision with root package name */
    public int f237180m;

    /* renamed from: n, reason: collision with root package name */
    public int f237181n;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m67884x9616526c() {
        return "[MixConfig]videoWidth=" + this.f237174d + ", videoHeight=" + this.f237175e + ", videoBitrate=" + this.f237176f + ", audioBitrate=" + this.f237177g + ", audioSampleRate=" + this.f237178h + ", audioChannelCount=" + this.f237179i + ", videoFrameRate=" + this.f237180m + ", videoRotate=" + this.f237181n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f237174d);
        parcel.writeInt(this.f237175e);
        parcel.writeInt(this.f237176f);
        parcel.writeInt(this.f237177g);
        parcel.writeInt(this.f237178h);
        parcel.writeInt(this.f237179i);
        parcel.writeInt(this.f237180m);
        parcel.writeInt(this.f237181n);
    }
}
