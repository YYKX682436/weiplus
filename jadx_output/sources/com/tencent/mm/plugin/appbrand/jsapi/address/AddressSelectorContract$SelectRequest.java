package com.tencent.mm.plugin.appbrand.jsapi.address;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/address/AddressSelectorContract$SelectRequest", "Landroid/os/Parcelable;", "appbrand-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class AddressSelectorContract$SelectRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest> CREATOR = new ab1.d();

    /* renamed from: d, reason: collision with root package name */
    public final ab1.c f78705d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f78706e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f78707f;

    public AddressSelectorContract$SelectRequest(ab1.c mode, java.util.ArrayList arrayList, boolean z17) {
        kotlin.jvm.internal.o.g(mode, "mode");
        this.f78705d = mode;
        this.f78706e = arrayList;
        this.f78707f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest addressSelectorContract$SelectRequest = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest) obj;
        return this.f78705d == addressSelectorContract$SelectRequest.f78705d && kotlin.jvm.internal.o.b(this.f78706e, addressSelectorContract$SelectRequest.f78706e) && this.f78707f == addressSelectorContract$SelectRequest.f78707f;
    }

    public int hashCode() {
        int hashCode = this.f78705d.hashCode() * 31;
        java.util.ArrayList arrayList = this.f78706e;
        return ((hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f78707f);
    }

    public java.lang.String toString() {
        return "SelectRequest(mode=" + this.f78705d + ", current=" + this.f78706e + ", autoLocation=" + this.f78707f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        ab1.c cVar = this.f78705d;
        kotlin.jvm.internal.o.g(cVar, "<this>");
        out.writeInt(cVar.ordinal());
        out.writeStringList(this.f78706e);
        out.writeInt(this.f78707f ? 1 : 0);
    }
}
