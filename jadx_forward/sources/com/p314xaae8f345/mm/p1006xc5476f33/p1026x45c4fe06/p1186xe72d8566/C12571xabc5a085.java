package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/screenshot/RecordScreenshotTakeReactor$ScreenshotMoveInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.screenshot.RecordScreenshotTakeReactor$ScreenshotMoveInfo */
/* loaded from: classes7.dex */
public final class C12571xabc5a085 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.C12571xabc5a085> f35161x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.f1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f169994d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f169995e;

    public C12571xabc5a085(java.lang.String fromPath, java.lang.String toPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromPath, "fromPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toPath, "toPath");
        this.f169994d = fromPath;
        this.f169995e = toPath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m52516x9616526c() {
        return "ScreenshotMoveInfo(fromPath='" + this.f169994d + "', toPath='" + this.f169995e + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f169994d);
        out.writeString(this.f169995e);
    }
}
