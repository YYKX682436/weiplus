package com.p314xaae8f345.mm.p646xf2865d2e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/SyncPhotoRequest;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.brandService.SyncPhotoRequest */
/* loaded from: classes4.dex */
public final /* data */ class C10321x9368f258 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p646xf2865d2e.C10321x9368f258> f27778x681a0c0c = new rm.e0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145161d;

    public C10321x9368f258(boolean z17) {
        this.f145161d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m43465xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p646xf2865d2e.C10321x9368f258) && this.f145161d == ((com.p314xaae8f345.mm.p646xf2865d2e.C10321x9368f258) obj).f145161d;
    }

    /* renamed from: hashCode */
    public int m43466x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f145161d);
    }

    /* renamed from: toString */
    public java.lang.String m43467x9616526c() {
        return "SyncPhotoRequest(enable=" + this.f145161d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f145161d ? 1 : 0);
    }
}
