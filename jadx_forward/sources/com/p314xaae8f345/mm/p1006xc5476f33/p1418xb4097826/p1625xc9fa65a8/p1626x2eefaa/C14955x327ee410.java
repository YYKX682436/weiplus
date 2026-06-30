package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/data/SearchHotWordListParcelable;", "Landroid/os/Parcelable;", "CREATOR", "nt2/b", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable */
/* loaded from: classes15.dex */
public final class C14955x327ee410 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final nt2.b f36128x681a0c0c = new nt2.b(null);

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452 f207193e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f207192d = "Finder.SearchHotWordList";

    /* renamed from: f, reason: collision with root package name */
    public int f207194f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f207195g = new java.util.LinkedList();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m58949x9616526c() {
        return this.f207193e + " pos:" + this.f207194f + " list:" + this.f207195g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeParcelable(this.f207193e, i17);
        parcel.writeInt(this.f207194f);
        parcel.writeTypedList(this.f207195g);
    }
}
