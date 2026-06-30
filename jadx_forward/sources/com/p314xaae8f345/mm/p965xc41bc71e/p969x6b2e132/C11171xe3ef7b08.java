package com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/msgsubscription/voice/PlayVoiceData;", "Landroid/os/Parcelable;", "CREATOR", "p31/d", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.voice.PlayVoiceData */
/* loaded from: classes9.dex */
public final /* data */ class C11171xe3ef7b08 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final p31.d f32585x681a0c0c = new p31.d(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f153423d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153424e;

    /* renamed from: f, reason: collision with root package name */
    public final int f153425f;

    public C11171xe3ef7b08(long j17, java.lang.String url, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f153423d = j17;
        this.f153424e = url;
        this.f153425f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48324xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132.C11171xe3ef7b08)) {
            return false;
        }
        com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132.C11171xe3ef7b08 c11171xe3ef7b08 = (com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132.C11171xe3ef7b08) obj;
        return this.f153423d == c11171xe3ef7b08.f153423d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f153424e, c11171xe3ef7b08.f153424e) && this.f153425f == c11171xe3ef7b08.f153425f;
    }

    /* renamed from: hashCode */
    public int m48325x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f153423d) * 31) + this.f153424e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f153425f);
    }

    /* renamed from: toString */
    public java.lang.String m48326x9616526c() {
        return "PlayVoiceData(id=" + this.f153423d + ", url=" + this.f153424e + ", action=" + this.f153425f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeLong(this.f153423d);
        parcel.writeString(this.f153424e);
        parcel.writeInt(this.f153425f);
    }
}
