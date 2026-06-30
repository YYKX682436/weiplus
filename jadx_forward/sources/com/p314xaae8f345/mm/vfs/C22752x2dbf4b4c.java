package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.MaintenanceGroup */
/* loaded from: classes12.dex */
public class C22752x2dbf4b4c implements com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c> f39817x681a0c0c = new com.p314xaae8f345.mm.vfs.q3();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.i1 f294248d;

    public C22752x2dbf4b4c(com.p314xaae8f345.mm.vfs.a0... a0VarArr) {
        this.f294248d = new com.p314xaae8f345.mm.vfs.i1(a0VarArr);
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.p314xaae8f345.mm.vfs.r3(this, this.f294248d.a(map));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m82318xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c) {
            if (this.f294248d.m82408xb2c87fbf(((com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c) obj).f294248d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m82319x8cdac1b() {
        return com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c.class.hashCode() ^ this.f294248d.m82409x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m82320x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append("maintenanceGroup:");
        com.p314xaae8f345.mm.vfs.i1 i1Var = this.f294248d;
        i1Var.getClass();
        for (com.p314xaae8f345.mm.vfs.a0 a0Var : i1Var.f294523a) {
            sb6.append('\n');
            sb6.append("  ");
            sb6.append(a0Var);
        }
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c.class, 3);
        this.f294248d.b(parcel);
    }

    public C22752x2dbf4b4c(java.util.Collection collection) {
        this.f294248d = new com.p314xaae8f345.mm.vfs.i1(collection);
    }

    public C22752x2dbf4b4c(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c.class, 3);
        this.f294248d = new com.p314xaae8f345.mm.vfs.i1(parcel);
    }
}
