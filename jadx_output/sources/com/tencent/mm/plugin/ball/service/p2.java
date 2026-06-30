package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class p2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$FloatBallInfoEventReceiverParcel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$FloatBallInfoEventReceiverParcel[i17];
    }
}
