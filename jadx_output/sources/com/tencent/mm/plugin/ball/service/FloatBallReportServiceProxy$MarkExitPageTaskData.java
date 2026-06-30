package com.tencent.mm.plugin.ball.service;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/ball/service/FloatBallReportServiceProxy$MarkExitPageTaskData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/ball/service/p", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class FloatBallReportServiceProxy$MarkExitPageTaskData implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.ball.service.p CREATOR = new com.tencent.mm.plugin.ball.service.p(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f93099d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93100e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f93101f;

    public FloatBallReportServiceProxy$MarkExitPageTaskData(int i17, boolean z17, boolean z18) {
        this.f93099d = i17;
        this.f93100e = z17;
        this.f93101f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f93099d);
        parcel.writeByte(this.f93100e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f93101f ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallReportServiceProxy$MarkExitPageTaskData(android.os.Parcel parcel) {
        this(0, false, false);
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f93099d = parcel.readInt();
        this.f93100e = parcel.readByte() != 0;
        this.f93101f = parcel.readByte() != 0;
    }
}
