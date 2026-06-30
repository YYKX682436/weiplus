package com.tencent.mm.api;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/api/TingMemberShipSubscribeRequest;", "Landroid/os/Parcelable;", "CREATOR", "qk/ca", "ting-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TingMemberShipSubscribeRequest implements android.os.Parcelable {
    public static final qk.ca CREATOR = new qk.ca(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Integer f53211d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.w80 f53212e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f53213f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f53214g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f53215h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "TingMemberShipSubscribeRequest{requestScene: " + this.f53211d + ", tingScene: " + this.f53215h + ", sessionId: " + this.f53214g + ", showSuccessView: " + this.f53213f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeValue(this.f53211d);
        parcel.writeByte(this.f53213f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f53214g);
        parcel.writeInt(this.f53215h);
    }
}
