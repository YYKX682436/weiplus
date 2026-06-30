package com.tencent.mm.matrix.battery;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/matrix/battery/ProcessTracker$ProcessCallStats", "Landroid/os/Parcelable;", "CREATOR", "cr0/x3", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ProcessTracker$ProcessCallStats implements android.os.Parcelable {
    public static final cr0.x3 CREATOR = new cr0.x3(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f68691d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f68692e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f68693f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f68694g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f68695h;

    /* renamed from: i, reason: collision with root package name */
    public final long f68696i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f68697m;

    public ProcessTracker$ProcessCallStats(int i17, java.lang.String type, java.lang.String from, java.lang.String to6, java.lang.String caller, long j17, java.lang.String str) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        kotlin.jvm.internal.o.g(caller, "caller");
        this.f68691d = i17;
        this.f68692e = type;
        this.f68693f = from;
        this.f68694g = to6;
        this.f68695h = caller;
        this.f68696i = j17;
        this.f68697m = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "ProcessCallStats(id=" + this.f68691d + ", type='" + this.f68692e + "', '" + this.f68693f + "'>>'" + this.f68694g + "', time=" + pj.e.c(this.f68696i, "HH:mm:ss") + ", desc=" + this.f68697m + "): " + kz5.n0.g0(r26.n0.f0(this.f68695h, new java.lang.String[]{";"}, false, 0, 6, null), "\n\t", null, null, 0, null, null, 62, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f68691d);
        dest.writeString(this.f68692e);
        dest.writeString(this.f68693f);
        dest.writeString(this.f68694g);
        dest.writeString(this.f68695h);
        dest.writeLong(this.f68696i);
        dest.writeString(this.f68697m);
    }
}
