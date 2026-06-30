package com.tencent.mm.msgsubscription.voice;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/msgsubscription/voice/PlayVoiceData;", "Landroid/os/Parcelable;", "CREATOR", "p31/d", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class PlayVoiceData implements android.os.Parcelable {
    public static final p31.d CREATOR = new p31.d(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f71890d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71891e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71892f;

    public PlayVoiceData(long j17, java.lang.String url, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f71890d = j17;
        this.f71891e = url;
        this.f71892f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.msgsubscription.voice.PlayVoiceData)) {
            return false;
        }
        com.tencent.mm.msgsubscription.voice.PlayVoiceData playVoiceData = (com.tencent.mm.msgsubscription.voice.PlayVoiceData) obj;
        return this.f71890d == playVoiceData.f71890d && kotlin.jvm.internal.o.b(this.f71891e, playVoiceData.f71891e) && this.f71892f == playVoiceData.f71892f;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f71890d) * 31) + this.f71891e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f71892f);
    }

    public java.lang.String toString() {
        return "PlayVoiceData(id=" + this.f71890d + ", url=" + this.f71891e + ", action=" + this.f71892f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeLong(this.f71890d);
        parcel.writeString(this.f71891e);
        parcel.writeInt(this.f71892f);
    }
}
