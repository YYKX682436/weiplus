package com.tencent.mm.feature.ecs.open;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/open/EcsOpenAsyncInfo$EcsOpenAsyncInfoResult", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class EcsOpenAsyncInfo$EcsOpenAsyncInfoResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult> CREATOR = new r10.e();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65851d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65852e;

    public EcsOpenAsyncInfo$EcsOpenAsyncInfoResult(boolean z17, boolean z18) {
        this.f65851d = z17;
        this.f65852e = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult)) {
            return false;
        }
        com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult ecsOpenAsyncInfo$EcsOpenAsyncInfoResult = (com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult) obj;
        return this.f65851d == ecsOpenAsyncInfo$EcsOpenAsyncInfoResult.f65851d && this.f65852e == ecsOpenAsyncInfo$EcsOpenAsyncInfoResult.f65852e;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f65851d) * 31) + java.lang.Boolean.hashCode(this.f65852e);
    }

    public java.lang.String toString() {
        return "EcsOpenAsyncInfoResult(success=" + this.f65851d + ", isTeenMode=" + this.f65852e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f65851d ? 1 : 0);
        out.writeInt(this.f65852e ? 1 : 0);
    }
}
