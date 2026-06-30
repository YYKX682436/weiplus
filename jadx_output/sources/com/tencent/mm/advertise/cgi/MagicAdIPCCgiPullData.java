package com.tencent.mm.advertise.cgi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiPullData;", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class MagicAdIPCCgiPullData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData> CREATOR = new yj.k();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f53154d;

    public MagicAdIPCCgiPullData(java.lang.String posIds) {
        kotlin.jvm.internal.o.g(posIds, "posIds");
        this.f53154d = posIds;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData) && kotlin.jvm.internal.o.b(this.f53154d, ((com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData) obj).f53154d);
    }

    public int hashCode() {
        return this.f53154d.hashCode();
    }

    public java.lang.String toString() {
        return "MagicAdIPCCgiPullData(posIds=" + this.f53154d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f53154d);
    }
}
