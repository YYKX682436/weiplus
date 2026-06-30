package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/reporter/WebViewKeyWordAuditReport$TimeStampedCount", "Landroid/os/Parcelable;", "CREATOR", "cx4/d", "webview-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount */
/* loaded from: classes8.dex */
public final class C19298x237af51f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final cx4.d f38735x681a0c0c = new cx4.d(null);

    /* renamed from: d, reason: collision with root package name */
    public long f264998d;

    /* renamed from: e, reason: collision with root package name */
    public int f264999e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        try {
            parcel.writeLong(this.f264998d);
            parcel.writeInt(this.f264999e);
        } catch (java.lang.RuntimeException unused) {
        }
    }
}
