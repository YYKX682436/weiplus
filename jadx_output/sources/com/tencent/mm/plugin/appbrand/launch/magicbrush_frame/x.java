package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class x implements android.os.Parcelable.Creator {
    public x(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams[i17];
    }
}
