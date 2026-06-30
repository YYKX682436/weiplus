package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public final class p implements android.os.Parcelable.Creator {
    public p(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.ball.service.FloatBallReportServiceProxy$MarkExitPageTaskData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.ball.service.FloatBallReportServiceProxy$MarkExitPageTaskData[i17];
    }
}
