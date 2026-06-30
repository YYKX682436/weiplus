package com.p314xaae8f345.mm.p617xd6d92827.cgi;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiPullData;", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData */
/* loaded from: classes5.dex */
public final /* data */ class C4977xe7434428 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428> f21388x681a0c0c = new yj.k();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f134687d;

    public C4977xe7434428(java.lang.String posIds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posIds, "posIds");
        this.f134687d = posIds;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42880xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134687d, ((com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428) obj).f134687d);
    }

    /* renamed from: hashCode */
    public int m42881x8cdac1b() {
        return this.f134687d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m42882x9616526c() {
        return "MagicAdIPCCgiPullData(posIds=" + this.f134687d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f134687d);
    }
}
