package com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaResultInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaResultInfo */
/* loaded from: classes4.dex */
public final /* data */ class C16505x35e9c14f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f> f37629x681a0c0c = new og3.f();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f230139d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f230140e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Bundle f230141f;

    public C16505x35e9c14f(boolean z17, java.util.ArrayList mediaList, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        this.f230139d = z17;
        this.f230140e = mediaList;
        this.f230141f = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66639xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f c16505x35e9c14f = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f) obj;
        return this.f230139d == c16505x35e9c14f.f230139d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f230140e, c16505x35e9c14f.f230140e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f230141f, c16505x35e9c14f.f230141f);
    }

    /* renamed from: hashCode */
    public int m66640x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f230139d) * 31) + this.f230140e.hashCode()) * 31;
        android.os.Bundle bundle = this.f230141f;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m66641x9616526c() {
        return "MediaResultInfo(result=" + this.f230139d + ", mediaList=" + this.f230140e + ", extra=" + this.f230141f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f230139d ? 1 : 0);
        java.util.ArrayList arrayList = this.f230140e;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) it.next()).writeToParcel(out, i17);
        }
        out.writeBundle(this.f230141f);
    }
}
