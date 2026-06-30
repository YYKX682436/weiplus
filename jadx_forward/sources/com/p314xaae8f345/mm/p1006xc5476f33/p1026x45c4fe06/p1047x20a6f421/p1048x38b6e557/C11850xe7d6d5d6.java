package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/debugger/console/ConsoleDebugLogImpl$LogInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo */
/* loaded from: classes8.dex */
final class C11850xe7d6d5d6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.C11850xe7d6d5d6> f33615x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f159174d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f159175e;

    /* renamed from: f, reason: collision with root package name */
    public final int f159176f;

    public C11850xe7d6d5d6(int i17, java.lang.String logLine) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logLine, "logLine");
        this.f159174d = i17;
        this.f159175e = logLine;
        this.f159176f = (logLine.length() * 2) + 4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m50169x9616526c() {
        return "LogInfo(priority=" + this.f159174d + ", logLine='" + this.f159175e + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f159174d);
        out.writeString(this.f159175e);
    }
}
