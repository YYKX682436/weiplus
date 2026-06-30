package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverContract$IPCCallResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult */
/* loaded from: classes7.dex */
public final class C12348x9f2a4bd6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12348x9f2a4bd6> f35062x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ha();

    /* renamed from: d, reason: collision with root package name */
    public int f165980d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f f165981e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f165982f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f165983g;

    /* renamed from: h, reason: collision with root package name */
    public int f165984h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f165985i;

    public C12348x9f2a4bd6(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f c11666xa31a0b7f, java.util.List list, boolean z17, int i18, java.lang.String str, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        c11666xa31a0b7f = (i19 & 2) != 0 ? null : c11666xa31a0b7f;
        list = (i19 & 4) != 0 ? null : list;
        z17 = (i19 & 8) != 0 ? false : z17;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        str = (i19 & 32) != 0 ? null : str;
        this.f165980d = i17;
        this.f165981e = c11666xa31a0b7f;
        this.f165982f = list;
        this.f165983g = z17;
        this.f165984h = i18;
        this.f165985i = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f165980d);
        int i18 = this.f165980d;
        if (i18 == 1) {
            dest.writeParcelable(this.f165981e, 0);
            return;
        }
        if (i18 != 2) {
            return;
        }
        java.lang.Iterable iterable = this.f165982f;
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            android.os.Parcelable parcelable = (android.os.Parcelable) obj;
            if (((parcelable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) || (parcelable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847)) != false) {
                arrayList.add(obj);
            }
        }
        dest.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.os.Parcelable parcelable2 = (android.os.Parcelable) it.next();
            dest.writeString(parcelable2.getClass().getName());
            dest.writeParcelable(parcelable2, 0);
        }
        dest.writeByte(this.f165983g ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f165984h);
        dest.writeString(this.f165985i);
    }
}
