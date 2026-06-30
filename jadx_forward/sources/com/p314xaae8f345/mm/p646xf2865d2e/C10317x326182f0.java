package com.p314xaae8f345.mm.p646xf2865d2e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/CheckCanCreatePhotoAccountRequest;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.brandService.CheckCanCreatePhotoAccountRequest */
/* loaded from: classes.dex */
public final /* data */ class C10317x326182f0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p646xf2865d2e.C10317x326182f0> f27774x681a0c0c = new rm.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f145143d;

    public C10317x326182f0(int i17) {
        this.f145143d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m43449xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p646xf2865d2e.C10317x326182f0) && this.f145143d == ((com.p314xaae8f345.mm.p646xf2865d2e.C10317x326182f0) obj).f145143d;
    }

    /* renamed from: hashCode */
    public int m43450x8cdac1b() {
        return java.lang.Integer.hashCode(this.f145143d);
    }

    /* renamed from: toString */
    public java.lang.String m43451x9616526c() {
        return "CheckCanCreatePhotoAccountRequest(scene=" + this.f145143d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f145143d);
    }
}
