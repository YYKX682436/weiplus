package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
public class g2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel[i17];
    }
}
