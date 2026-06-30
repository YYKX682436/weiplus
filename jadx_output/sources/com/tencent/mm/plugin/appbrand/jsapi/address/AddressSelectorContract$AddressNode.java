package com.tencent.mm.plugin.appbrand.jsapi.address;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/address/AddressSelectorContract$AddressNode", "Landroid/os/Parcelable;", "appbrand-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class AddressSelectorContract$AddressNode implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode> CREATOR = new ab1.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f78703d;

    /* renamed from: e, reason: collision with root package name */
    public final int f78704e;

    public AddressSelectorContract$AddressNode(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f78703d = name;
        this.f78704e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode addressSelectorContract$AddressNode = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode) obj;
        return kotlin.jvm.internal.o.b(this.f78703d, addressSelectorContract$AddressNode.f78703d) && this.f78704e == addressSelectorContract$AddressNode.f78704e;
    }

    public int hashCode() {
        return (this.f78703d.hashCode() * 31) + java.lang.Integer.hashCode(this.f78704e);
    }

    public java.lang.String toString() {
        return "AddressNode(name=" + this.f78703d + ", code=" + this.f78704e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f78703d);
        out.writeInt(this.f78704e);
    }
}
