package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/event/StartActivityFromAppBrandEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", "appbrand-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent */
/* loaded from: classes7.dex */
public final class C11865xc185f759 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759> f33622x681a0c0c = new da1.a();

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Intent f159548g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f159549h;

    public C11865xc185f759(android.content.Intent intent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f159548g = intent;
        this.f159549h = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f159548g, i17);
        out.writeInt(this.f159549h ? 1 : 0);
    }
}
