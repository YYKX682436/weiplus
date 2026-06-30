package com.tencent.mm.flutter.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/flutter/ui/FlutterPageInfo;", "Landroid/os/Parcelable;", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FlutterPageInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.flutter.ui.FlutterPageInfo> CREATOR = new bj0.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68113d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f68114e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f68115f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f68116g;

    public FlutterPageInfo(java.lang.String engineId, java.lang.String engineGroupId, java.lang.String enginePlugin, java.lang.String engineRoute) {
        kotlin.jvm.internal.o.g(engineId, "engineId");
        kotlin.jvm.internal.o.g(engineGroupId, "engineGroupId");
        kotlin.jvm.internal.o.g(enginePlugin, "enginePlugin");
        kotlin.jvm.internal.o.g(engineRoute, "engineRoute");
        this.f68113d = engineId;
        this.f68114e = engineGroupId;
        this.f68115f = enginePlugin;
        this.f68116g = engineRoute;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f68113d);
        out.writeString(this.f68114e);
        out.writeString(this.f68115f);
        out.writeString(this.f68116g);
    }
}
