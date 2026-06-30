package com.p314xaae8f345.mm.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/api/TingMemberShipSubscribeRequest;", "Landroid/os/Parcelable;", "CREATOR", "qk/ca", "ting-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.api.TingMemberShipSubscribeRequest */
/* loaded from: classes11.dex */
public final class C4990x83627a9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final qk.ca f21399x681a0c0c = new qk.ca(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Integer f134744d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.w80 f134745e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f134746f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f134747g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f134748h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m42942x9616526c() {
        return "TingMemberShipSubscribeRequest{requestScene: " + this.f134744d + ", tingScene: " + this.f134748h + ", sessionId: " + this.f134747g + ", showSuccessView: " + this.f134746f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeValue(this.f134744d);
        parcel.writeByte(this.f134746f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f134747g);
        parcel.writeInt(this.f134748h);
    }
}
