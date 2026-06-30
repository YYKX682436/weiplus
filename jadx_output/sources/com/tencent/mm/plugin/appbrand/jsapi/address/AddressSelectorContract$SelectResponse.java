package com.tencent.mm.plugin.appbrand.jsapi.address;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/address/AddressSelectorContract$SelectResponse", "Landroid/os/Parcelable;", "appbrand-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class AddressSelectorContract$SelectResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse> CREATOR = new ab1.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f78708d;

    /* renamed from: e, reason: collision with root package name */
    public final int f78709e;

    public AddressSelectorContract$SelectResponse(java.util.ArrayList list, int i17) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f78708d = list;
        this.f78709e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse addressSelectorContract$SelectResponse = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse) obj;
        return kotlin.jvm.internal.o.b(this.f78708d, addressSelectorContract$SelectResponse.f78708d) && this.f78709e == addressSelectorContract$SelectResponse.f78709e;
    }

    public int hashCode() {
        return (this.f78708d.hashCode() * 31) + java.lang.Integer.hashCode(this.f78709e);
    }

    public java.lang.String toString() {
        return "SelectResponse(list=" + this.f78708d + ", postcode=" + this.f78709e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.ArrayList arrayList = this.f78708d;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode) it.next()).writeToParcel(out, i17);
        }
        out.writeInt(this.f78709e);
    }
}
