package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/task/ipc/AppBrandProcessSuicideNotifyTask$Args", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args */
/* loaded from: classes5.dex */
public final /* data */ class C12613xc3a4304e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12613xc3a4304e> f35272x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170580d;

    /* renamed from: e, reason: collision with root package name */
    public final long f170581e;

    /* renamed from: f, reason: collision with root package name */
    public final int f170582f;

    public C12613xc3a4304e(java.lang.String processName, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        this.f170580d = processName;
        this.f170581e = j17;
        this.f170582f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52797xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12613xc3a4304e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12613xc3a4304e c12613xc3a4304e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12613xc3a4304e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170580d, c12613xc3a4304e.f170580d) && this.f170581e == c12613xc3a4304e.f170581e && this.f170582f == c12613xc3a4304e.f170582f;
    }

    /* renamed from: hashCode */
    public int m52798x8cdac1b() {
        return (((this.f170580d.hashCode() * 31) + java.lang.Long.hashCode(this.f170581e)) * 31) + java.lang.Integer.hashCode(this.f170582f);
    }

    /* renamed from: toString */
    public java.lang.String m52799x9616526c() {
        return "Args(processName=" + this.f170580d + ", invokeTimestampMs=" + this.f170581e + ", reportKey=" + this.f170582f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f170580d);
        out.writeLong(this.f170581e);
        out.writeInt(this.f170582f);
    }
}
