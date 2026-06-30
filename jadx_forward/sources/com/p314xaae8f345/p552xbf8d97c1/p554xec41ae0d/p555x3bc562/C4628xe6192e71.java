package com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccProcessStats;", "Landroid/os/Parcelable;", "CREATOR", "lh/h", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.matrix.battery.accumulate.AccProcessStats */
/* loaded from: classes7.dex */
public final class C4628xe6192e71 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final lh.h f19896x681a0c0c = new lh.h(null);

    /* renamed from: d, reason: collision with root package name */
    public long f134083d;

    /* renamed from: e, reason: collision with root package name */
    public long f134084e;

    /* renamed from: f, reason: collision with root package name */
    public long f134085f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m40821xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.AccProcessStats");
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71 c4628xe6192e71 = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71) obj;
        return this.f134083d == c4628xe6192e71.f134083d && this.f134084e == c4628xe6192e71.f134084e && this.f134085f == c4628xe6192e71.f134085f;
    }

    /* renamed from: hashCode */
    public int m40822x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f134083d) * 31) + java.lang.Long.hashCode(this.f134084e)) * 31) + java.lang.Long.hashCode(this.f134085f);
    }

    /* renamed from: toString */
    public java.lang.String m40823x9616526c() {
        return "AccProcessStats(usrTimeMs=" + this.f134083d + ", sysTimeMs=" + this.f134084e + ", startsCount=" + this.f134085f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeLong(this.f134083d);
        dest.writeLong(this.f134084e);
        dest.writeLong(this.f134085f);
    }
}
