package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class p1 implements android.os.Parcelable.Creator {
    public p1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard$StartActivityRequest(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard$StartActivityRequest[i17];
    }
}
