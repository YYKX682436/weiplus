package com.tencent.mm.feature.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCSelectConvParams", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class SelectContactEcsActionHandler$IPCSelectConvParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSelectConvParams> CREATOR = new t00.r1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65628d;

    public SelectContactEcsActionHandler$IPCSelectConvParams(java.lang.String str) {
        this.f65628d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSelectConvParams) && kotlin.jvm.internal.o.b(this.f65628d, ((com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSelectConvParams) obj).f65628d);
    }

    public int hashCode() {
        java.lang.String str = this.f65628d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "IPCSelectConvParams(blackList=" + this.f65628d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f65628d);
    }
}
