package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class r implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams(parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams[i17];
    }
}
