package com.tencent.mm.advertise.util;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/util/MagicAdPushMsg;", "Landroid/os/Parcelable;", "ad-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MagicAdPushMsg implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.advertise.util.MagicAdPushMsg> CREATOR = new ik.g();

    /* renamed from: d, reason: collision with root package name */
    public final int f53183d;

    /* renamed from: e, reason: collision with root package name */
    public final long f53184e;

    /* renamed from: f, reason: collision with root package name */
    public final long f53185f;

    /* renamed from: g, reason: collision with root package name */
    public final long f53186g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f53187h;

    public MagicAdPushMsg(int i17, long j17, long j18, long j19, java.lang.String traceid) {
        kotlin.jvm.internal.o.g(traceid, "traceid");
        this.f53183d = i17;
        this.f53184e = j17;
        this.f53185f = j18;
        this.f53186g = j19;
        this.f53187h = traceid;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.advertise.util.MagicAdPushMsg)) {
            return false;
        }
        com.tencent.mm.advertise.util.MagicAdPushMsg magicAdPushMsg = (com.tencent.mm.advertise.util.MagicAdPushMsg) obj;
        return this.f53183d == magicAdPushMsg.f53183d && this.f53184e == magicAdPushMsg.f53184e && this.f53185f == magicAdPushMsg.f53185f && this.f53186g == magicAdPushMsg.f53186g && kotlin.jvm.internal.o.b(this.f53187h, magicAdPushMsg.f53187h);
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f53183d) * 31) + java.lang.Long.hashCode(this.f53184e)) * 31) + java.lang.Long.hashCode(this.f53185f)) * 31) + java.lang.Long.hashCode(this.f53186g)) * 31) + this.f53187h.hashCode();
    }

    public java.lang.String toString() {
        return "MagicAdPushMsg(opcpde=" + this.f53183d + ", aid=" + this.f53184e + ", slotid=" + this.f53185f + ", op_time=" + this.f53186g + ", traceid=" + this.f53187h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f53183d);
        out.writeLong(this.f53184e);
        out.writeLong(this.f53185f);
        out.writeLong(this.f53186g);
        out.writeString(this.f53187h);
    }
}
