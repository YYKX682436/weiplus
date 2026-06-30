package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/texture/ErrorInfo;", "Landroid/os/Parcelable;", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.texture.ErrorInfo */
/* loaded from: classes.dex */
public final /* data */ class C16464x8b1186b6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16464x8b1186b6> f37623x681a0c0c = new ve3.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f229687d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f229688e;

    public C16464x8b1186b6(int i17, java.lang.String errMessage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMessage, "errMessage");
        this.f229687d = i17;
        this.f229688e = errMessage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66514xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16464x8b1186b6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16464x8b1186b6 c16464x8b1186b6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16464x8b1186b6) obj;
        return this.f229687d == c16464x8b1186b6.f229687d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229688e, c16464x8b1186b6.f229688e);
    }

    /* renamed from: hashCode */
    public int m66515x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f229687d) * 31) + this.f229688e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66516x9616526c() {
        return "ErrorInfo(errCode=" + this.f229687d + ", errMessage=" + this.f229688e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f229687d);
        out.writeString(this.f229688e);
    }
}
