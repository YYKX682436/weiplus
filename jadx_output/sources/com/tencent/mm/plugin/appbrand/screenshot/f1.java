package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class f1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.screenshot.RecordScreenshotTakeReactor$ScreenshotMoveInfo(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.screenshot.RecordScreenshotTakeReactor$ScreenshotMoveInfo[i17];
    }
}
