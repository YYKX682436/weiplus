package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$FloatBallInfoEventReceiverParcel */
/* loaded from: classes14.dex */
final class C12893x410ca399 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12893x410ca399> f35362x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p2();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174636d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.ResultReceiver f174637e;

    public C12893x410ca399(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, android.os.ResultReceiver resultReceiver) {
        this.f174636d = c12886x91aa2b6d;
        this.f174637e = resultReceiver;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f174636d, i17);
        parcel.writeParcelable(this.f174637e, i17);
    }

    public C12893x410ca399(android.os.Parcel parcel) {
        this.f174636d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.class.getClassLoader());
        this.f174637e = (android.os.ResultReceiver) parcel.readParcelable(android.os.ResultReceiver.class.getClassLoader());
    }
}
