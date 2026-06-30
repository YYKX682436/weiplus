package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class f0 implements android.os.Parcelable.Creator {
    public f0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest[i17];
    }
}
