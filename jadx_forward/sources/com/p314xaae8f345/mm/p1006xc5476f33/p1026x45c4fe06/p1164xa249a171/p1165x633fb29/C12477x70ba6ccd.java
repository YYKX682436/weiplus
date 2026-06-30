package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/openmaterial/model/MultiSelectMaterialModel;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.MultiSelectMaterialModel */
/* loaded from: classes.dex */
public final /* data */ class C12477x70ba6ccd implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12477x70ba6ccd> f35125x681a0c0c = new bi1.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f167805d;

    public C12477x70ba6ccd(java.util.ArrayList appBrandOpenMaterialModels) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandOpenMaterialModels, "appBrandOpenMaterialModels");
        this.f167805d = appBrandOpenMaterialModels;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52076xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12477x70ba6ccd) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167805d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12477x70ba6ccd) obj).f167805d);
    }

    /* renamed from: hashCode */
    public int m52077x8cdac1b() {
        return this.f167805d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52078x9616526c() {
        return java.lang.String.valueOf(this.f167805d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.ArrayList arrayList = this.f167805d;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
    }
}
