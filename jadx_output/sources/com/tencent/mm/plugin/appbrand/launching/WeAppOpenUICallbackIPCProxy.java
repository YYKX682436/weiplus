package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/WeAppOpenUICallbackIPCProxy;", "Landroid/os/Parcelable;", "com/tencent/mm/plugin/appbrand/launching/od", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class WeAppOpenUICallbackIPCProxy implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy> CREATOR = new com.tencent.mm.plugin.appbrand.launching.ed();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.h f84476d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.h f84477e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.h f84478f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.h f84479g;

    /* renamed from: h, reason: collision with root package name */
    public l81.e1 f84480h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f84481i;

    public WeAppOpenUICallbackIPCProxy(com.tencent.luggage.sdk.launching.h onUIEnterInvokeProxy, com.tencent.luggage.sdk.launching.h onUIExitInvokeProxy, com.tencent.luggage.sdk.launching.h onShareClickInHalfScreenMode, com.tencent.luggage.sdk.launching.h hVar) {
        kotlin.jvm.internal.o.g(onUIEnterInvokeProxy, "onUIEnterInvokeProxy");
        kotlin.jvm.internal.o.g(onUIExitInvokeProxy, "onUIExitInvokeProxy");
        kotlin.jvm.internal.o.g(onShareClickInHalfScreenMode, "onShareClickInHalfScreenMode");
        this.f84476d = onUIEnterInvokeProxy;
        this.f84477e = onUIExitInvokeProxy;
        this.f84478f = onShareClickInHalfScreenMode;
        this.f84479g = hVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        com.tencent.luggage.sdk.launching.k.d(this.f84476d, dest, 0, 4, null);
        com.tencent.luggage.sdk.launching.k.d(this.f84477e, dest, 0, 4, null);
        com.tencent.luggage.sdk.launching.k.d(this.f84478f, dest, 0, 4, null);
        com.tencent.luggage.sdk.launching.k.d(this.f84479g, dest, 0, 4, null);
    }
}
