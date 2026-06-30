package com.tencent.matrix.battery.accumulate;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccProcessStats;", "Landroid/os/Parcelable;", "CREATOR", "lh/h", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AccProcessStats implements android.os.Parcelable {
    public static final lh.h CREATOR = new lh.h(null);

    /* renamed from: d, reason: collision with root package name */
    public long f52550d;

    /* renamed from: e, reason: collision with root package name */
    public long f52551e;

    /* renamed from: f, reason: collision with root package name */
    public long f52552f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.matrix.battery.accumulate.AccProcessStats.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.AccProcessStats");
        com.tencent.matrix.battery.accumulate.AccProcessStats accProcessStats = (com.tencent.matrix.battery.accumulate.AccProcessStats) obj;
        return this.f52550d == accProcessStats.f52550d && this.f52551e == accProcessStats.f52551e && this.f52552f == accProcessStats.f52552f;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f52550d) * 31) + java.lang.Long.hashCode(this.f52551e)) * 31) + java.lang.Long.hashCode(this.f52552f);
    }

    public java.lang.String toString() {
        return "AccProcessStats(usrTimeMs=" + this.f52550d + ", sysTimeMs=" + this.f52551e + ", startsCount=" + this.f52552f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeLong(this.f52550d);
        dest.writeLong(this.f52551e);
        dest.writeLong(this.f52552f);
    }
}
