package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/MBBizExtraParams;", "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.MBBizExtraParams */
/* loaded from: classes.dex */
public final /* data */ class C16415x6bab6b98 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16415x6bab6b98> f37476x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.w4();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229349d;

    public C16415x6bab6b98(java.lang.String str) {
        this.f229349d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66259xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16415x6bab6b98) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229349d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16415x6bab6b98) obj).f229349d);
    }

    /* renamed from: hashCode */
    public int m66260x8cdac1b() {
        java.lang.String str = this.f229349d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66261x9616526c() {
        return "MBBizExtraParams(projectId=" + this.f229349d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f229349d);
    }
}
