package com.tencent.mm.feature.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserTicket", "Landroid/os/Parcelable;", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class SelectContactEcsActionHandler$IPCUserTicket implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket> CREATOR = new t00.u1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65637d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f65638e;

    public SelectContactEcsActionHandler$IPCUserTicket(java.lang.String userName, java.lang.String str) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f65637d = userName;
        this.f65638e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket)) {
            return false;
        }
        com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket selectContactEcsActionHandler$IPCUserTicket = (com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket) obj;
        return kotlin.jvm.internal.o.b(this.f65637d, selectContactEcsActionHandler$IPCUserTicket.f65637d) && kotlin.jvm.internal.o.b(this.f65638e, selectContactEcsActionHandler$IPCUserTicket.f65638e);
    }

    public int hashCode() {
        int hashCode = this.f65637d.hashCode() * 31;
        java.lang.String str = this.f65638e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "IPCUserTicket(userName=" + this.f65637d + ", ticket=" + this.f65638e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f65637d);
        out.writeString(this.f65638e);
    }
}
