package com.tencent.mm.minigame;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/minigame/AppBrandProcessWVARunningNotifyTask$Args", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final /* data */ class AppBrandProcessWVARunningNotifyTask$Args implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.minigame.AppBrandProcessWVARunningNotifyTask$Args> CREATOR = new com.tencent.mm.minigame.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68986d;

    public AppBrandProcessWVARunningNotifyTask$Args(java.lang.String processName) {
        kotlin.jvm.internal.o.g(processName, "processName");
        this.f68986d = processName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.minigame.AppBrandProcessWVARunningNotifyTask$Args) && kotlin.jvm.internal.o.b(this.f68986d, ((com.tencent.mm.minigame.AppBrandProcessWVARunningNotifyTask$Args) obj).f68986d);
    }

    public int hashCode() {
        return this.f68986d.hashCode();
    }

    public java.lang.String toString() {
        return "Args(processName=" + this.f68986d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f68986d);
    }
}
