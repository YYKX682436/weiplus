package com.tencent.mm.plugin.ball.model;

/* loaded from: classes11.dex */
public class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo[i17];
    }
}
