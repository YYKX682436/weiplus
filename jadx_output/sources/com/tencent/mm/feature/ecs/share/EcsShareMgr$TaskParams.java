package com.tencent.mm.feature.ecs.share;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/share/EcsShareMgr$TaskParams", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final /* data */ class EcsShareMgr$TaskParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams> CREATOR = new com.tencent.mm.feature.ecs.share.r();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65968d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65969e;

    public EcsShareMgr$TaskParams(java.lang.String input, int i17) {
        kotlin.jvm.internal.o.g(input, "input");
        this.f65968d = input;
        this.f65969e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams)) {
            return false;
        }
        com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams ecsShareMgr$TaskParams = (com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams) obj;
        return kotlin.jvm.internal.o.b(this.f65968d, ecsShareMgr$TaskParams.f65968d) && this.f65969e == ecsShareMgr$TaskParams.f65969e;
    }

    public int hashCode() {
        return (this.f65968d.hashCode() * 31) + java.lang.Integer.hashCode(this.f65969e);
    }

    public java.lang.String toString() {
        return "TaskParams(input=" + this.f65968d + ", method=" + this.f65969e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f65968d);
        out.writeInt(this.f65969e);
    }
}
