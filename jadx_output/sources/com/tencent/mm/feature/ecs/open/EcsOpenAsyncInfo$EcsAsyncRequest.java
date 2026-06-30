package com.tencent.mm.feature.ecs.open;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/open/EcsOpenAsyncInfo$EcsAsyncRequest", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class EcsOpenAsyncInfo$EcsAsyncRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsAsyncRequest> CREATOR = new r10.c();

    /* renamed from: d, reason: collision with root package name */
    public final int f65850d;

    public EcsOpenAsyncInfo$EcsAsyncRequest(int i17) {
        this.f65850d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsAsyncRequest) && this.f65850d == ((com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsAsyncRequest) obj).f65850d;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f65850d);
    }

    public java.lang.String toString() {
        return "EcsAsyncRequest(placeholder=" + this.f65850d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f65850d);
    }

    public /* synthetic */ EcsOpenAsyncInfo$EcsAsyncRequest(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
