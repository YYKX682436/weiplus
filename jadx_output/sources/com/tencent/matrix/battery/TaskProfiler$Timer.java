package com.tencent.matrix.battery;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/matrix/battery/TaskProfiler$Timer", "Landroid/os/Parcelable;", "CREATOR", "kh/w1", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class TaskProfiler$Timer implements android.os.Parcelable {
    public static final kh.w1 CREATOR = new kh.w1(null);

    /* renamed from: d, reason: collision with root package name */
    public int f52548d;

    /* renamed from: e, reason: collision with root package name */
    public long f52549e;

    public TaskProfiler$Timer(int i17, long j17) {
        this.f52548d = i17;
        this.f52549e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.battery.TaskProfiler$Timer)) {
            return false;
        }
        com.tencent.matrix.battery.TaskProfiler$Timer taskProfiler$Timer = (com.tencent.matrix.battery.TaskProfiler$Timer) obj;
        return this.f52548d == taskProfiler$Timer.f52548d && this.f52549e == taskProfiler$Timer.f52549e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f52548d) * 31) + java.lang.Long.hashCode(this.f52549e);
    }

    public java.lang.String toString() {
        return "Timer(count=" + this.f52548d + ", cpuTime=" + this.f52549e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f52548d);
        dest.writeLong(this.f52549e);
    }

    public /* synthetic */ TaskProfiler$Timer(int i17, long j17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? 0L : j17);
    }
}
