package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandShowToastEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandShowToastEvent */
/* loaded from: classes7.dex */
public final class C11889x2f43c736 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11889x2f43c736> f33631x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.z();

    /* renamed from: g, reason: collision with root package name */
    public final int f159900g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f159901h;

    public C11889x2f43c736(int i17, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f159900g = i17;
        this.f159901h = text;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f159900g);
        out.writeString(this.f159901h);
    }
}
