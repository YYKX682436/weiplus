package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap */
/* loaded from: classes7.dex */
public final /* data */ class C10458x88813eff implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10458x88813eff> f28808x681a0c0c = new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f146576d;

    public C10458x88813eff(java.util.List processList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processList, "processList");
        this.f146576d = processList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m43824xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10458x88813eff) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146576d, ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10458x88813eff) obj).f146576d);
    }

    /* renamed from: hashCode */
    public int m43825x8cdac1b() {
        return this.f146576d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m43826x9616526c() {
        return "ParcelizedAppProcessListWrap(processList=" + this.f146576d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f146576d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7) it.next()).writeToParcel(out, i17);
        }
    }
}
