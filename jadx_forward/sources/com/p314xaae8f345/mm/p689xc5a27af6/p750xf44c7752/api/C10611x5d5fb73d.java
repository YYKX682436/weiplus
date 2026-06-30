package com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/BizData;", "Landroid/os/Parcelable;", "gallery-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.gallery.api.BizData */
/* loaded from: classes8.dex */
public final /* data */ class C10611x5d5fb73d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10611x5d5fb73d> f28876x681a0c0c = new e60.a();

    /* renamed from: d, reason: collision with root package name */
    public final long f148619d;

    /* renamed from: e, reason: collision with root package name */
    public final long f148620e;

    /* renamed from: f, reason: collision with root package name */
    public final int f148621f;

    public C10611x5d5fb73d(long j17, long j18, int i17) {
        this.f148619d = j17;
        this.f148620e = j18;
        this.f148621f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45021xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10611x5d5fb73d)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10611x5d5fb73d c10611x5d5fb73d = (com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10611x5d5fb73d) obj;
        return this.f148619d == c10611x5d5fb73d.f148619d && this.f148620e == c10611x5d5fb73d.f148620e && this.f148621f == c10611x5d5fb73d.f148621f;
    }

    /* renamed from: hashCode */
    public int m45022x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f148619d) * 31) + java.lang.Long.hashCode(this.f148620e)) * 31) + java.lang.Integer.hashCode(this.f148621f);
    }

    /* renamed from: toString */
    public java.lang.String m45023x9616526c() {
        return "BizData(bizUin=" + this.f148619d + ", mid=" + this.f148620e + ", idx=" + this.f148621f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeLong(this.f148619d);
        out.writeLong(this.f148620e);
        out.writeInt(this.f148621f);
    }
}
