package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/data/SearchHotWordParcelable;", "Landroid/os/Parcelable;", "CREATOR", "nt2/c", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable */
/* loaded from: classes15.dex */
public final class C14956x58c15452 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final nt2.c f36129x681a0c0c = new nt2.c(null);

    /* renamed from: d, reason: collision with root package name */
    public r45.lu2 f207196d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m58951x9616526c() {
        r45.lu2 lu2Var = this.f207196d;
        java.lang.String m75945x2fec8307 = lu2Var != null ? lu2Var.m75945x2fec8307(0) : null;
        return m75945x2fec8307 == null ? "null" : m75945x2fec8307;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        r45.lu2 lu2Var = this.f207196d;
        if (lu2Var != null) {
            byte[] mo14344x5f01b1f6 = lu2Var.mo14344x5f01b1f6();
            parcel.writeInt(mo14344x5f01b1f6.length);
            parcel.writeByteArray(mo14344x5f01b1f6);
        }
    }
}
