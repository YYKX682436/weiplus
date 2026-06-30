package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/WeAppOpenUICallbackIPCProxy;", "Landroid/os/Parcelable;", "com/tencent/mm/plugin/appbrand/launching/od", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy */
/* loaded from: classes7.dex */
public final class C12354xf2fbb9c8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12354xf2fbb9c8> f35065x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ed();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f166009d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f166010e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f166011f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f166012g;

    /* renamed from: h, reason: collision with root package name */
    public l81.e1 f166013h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f166014i;

    public C12354xf2fbb9c8(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h onUIEnterInvokeProxy, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h onUIExitInvokeProxy, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h onShareClickInHalfScreenMode, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onUIEnterInvokeProxy, "onUIEnterInvokeProxy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onUIExitInvokeProxy, "onUIExitInvokeProxy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onShareClickInHalfScreenMode, "onShareClickInHalfScreenMode");
        this.f166009d = onUIEnterInvokeProxy;
        this.f166010e = onUIExitInvokeProxy;
        this.f166011f = onShareClickInHalfScreenMode;
        this.f166012g = hVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.k.d(this.f166009d, dest, 0, 4, null);
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.k.d(this.f166010e, dest, 0, 4, null);
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.k.d(this.f166011f, dest, 0, 4, null);
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.k.d(this.f166012g, dest, 0, 4, null);
    }
}
