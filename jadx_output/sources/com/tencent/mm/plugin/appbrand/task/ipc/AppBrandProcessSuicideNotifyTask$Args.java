package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/task/ipc/AppBrandProcessSuicideNotifyTask$Args", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class AppBrandProcessSuicideNotifyTask$Args implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f89047d;

    /* renamed from: e, reason: collision with root package name */
    public final long f89048e;

    /* renamed from: f, reason: collision with root package name */
    public final int f89049f;

    public AppBrandProcessSuicideNotifyTask$Args(java.lang.String processName, long j17, int i17) {
        kotlin.jvm.internal.o.g(processName, "processName");
        this.f89047d = processName;
        this.f89048e = j17;
        this.f89049f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args appBrandProcessSuicideNotifyTask$Args = (com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args) obj;
        return kotlin.jvm.internal.o.b(this.f89047d, appBrandProcessSuicideNotifyTask$Args.f89047d) && this.f89048e == appBrandProcessSuicideNotifyTask$Args.f89048e && this.f89049f == appBrandProcessSuicideNotifyTask$Args.f89049f;
    }

    public int hashCode() {
        return (((this.f89047d.hashCode() * 31) + java.lang.Long.hashCode(this.f89048e)) * 31) + java.lang.Integer.hashCode(this.f89049f);
    }

    public java.lang.String toString() {
        return "Args(processName=" + this.f89047d + ", invokeTimestampMs=" + this.f89048e + ", reportKey=" + this.f89049f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f89047d);
        out.writeLong(this.f89048e);
        out.writeInt(this.f89049f);
    }
}
