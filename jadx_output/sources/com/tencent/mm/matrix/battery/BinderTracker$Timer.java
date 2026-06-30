package com.tencent.mm.matrix.battery;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/matrix/battery/BinderTracker$Timer", "Landroid/os/Parcelable;", "CREATOR", "cr0/e1", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class BinderTracker$Timer implements android.os.Parcelable {
    public static final cr0.e1 CREATOR = new cr0.e1(null);

    /* renamed from: d, reason: collision with root package name */
    public int f68689d;

    /* renamed from: e, reason: collision with root package name */
    public long f68690e;

    public BinderTracker$Timer(int i17, long j17) {
        this.f68689d = i17;
        this.f68690e = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.matrix.battery.BinderTracker$Timer)) {
            return false;
        }
        com.tencent.mm.matrix.battery.BinderTracker$Timer binderTracker$Timer = (com.tencent.mm.matrix.battery.BinderTracker$Timer) obj;
        return this.f68689d == binderTracker$Timer.f68689d && this.f68690e == binderTracker$Timer.f68690e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f68689d) * 31) + java.lang.Long.hashCode(this.f68690e);
    }

    public java.lang.String toString() {
        return "Timer(count=" + this.f68689d + ", timeMs=" + this.f68690e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f68689d);
        dest.writeLong(this.f68690e);
    }

    public /* synthetic */ BinderTracker$Timer(int i17, long j17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? 0L : j17);
    }
}
