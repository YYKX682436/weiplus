package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/ball/service/FloatBallReportServiceProxy$MarkExitPageTaskData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/ball/service/p", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallReportServiceProxy$MarkExitPageTaskData */
/* loaded from: classes14.dex */
final class C12891xa691fd25 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p f35360x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f174632d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f174633e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f174634f;

    public C12891xa691fd25(int i17, boolean z17, boolean z18) {
        this.f174632d = i17;
        this.f174633e = z17;
        this.f174634f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f174632d);
        parcel.writeByte(this.f174633e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f174634f ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12891xa691fd25(android.os.Parcel parcel) {
        this(0, false, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f174632d = parcel.readInt();
        this.f174633e = parcel.readByte() != 0;
        this.f174634f = parcel.readByte() != 0;
    }
}
