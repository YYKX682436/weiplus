package com.p314xaae8f345.mm.p775xd2ae381c.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/flutter/ui/FlutterPageInfo;", "Landroid/os/Parcelable;", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.flutter.ui.FlutterPageInfo */
/* loaded from: classes11.dex */
public final class C10715x7014d3f9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9> f28958x681a0c0c = new bj0.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f149646d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f149647e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f149648f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f149649g;

    public C10715x7014d3f9(java.lang.String engineId, java.lang.String engineGroupId, java.lang.String enginePlugin, java.lang.String engineRoute) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineId, "engineId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineGroupId, "engineGroupId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enginePlugin, "enginePlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineRoute, "engineRoute");
        this.f149646d = engineId;
        this.f149647e = engineGroupId;
        this.f149648f = enginePlugin;
        this.f149649g = engineRoute;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f149646d);
        out.writeString(this.f149647e);
        out.writeString(this.f149648f);
        out.writeString(this.f149649g);
    }
}
