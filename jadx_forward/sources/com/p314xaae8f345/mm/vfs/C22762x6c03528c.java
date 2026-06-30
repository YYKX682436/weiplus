package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.RC4EncryptedFileSystem */
/* loaded from: classes12.dex */
public class C22762x6c03528c extends com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22762x6c03528c> f39824x681a0c0c = new com.p314xaae8f345.mm.vfs.v4();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb f294279e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.v2 f294280f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f294281g;

    public C22762x6c03528c(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, java.lang.String str) {
        com.p314xaae8f345.mm.vfs.v2 v2Var = com.p314xaae8f345.mm.vfs.b3.F;
        this.f294280f = v2Var;
        if (v2Var != null) {
            this.f294279e = interfaceC22750xe27c22eb;
            this.f294281g = str;
            return;
        }
        throw new java.lang.RuntimeException("Set global generator by calling setKeyGenerator(...) before initializing FileSystem objects.");
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        javax.crypto.spec.SecretKeySpec secretKeySpec;
        ((com.p314xaae8f345.mm.vfs.r7) this.f294280f).getClass();
        if (map.get("account") == null) {
            secretKeySpec = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KeyGen.generate: ");
            java.lang.String str = this.f294281g;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.Debug", sb6.toString());
            secretKeySpec = new javax.crypto.spec.SecretKeySpec(kk.k.h(((com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? gm0.j1.b().j() : new kk.v(gm0.m.i()).m143587x9616526c()) + str).getBytes()), "RC4");
        }
        if (secretKeySpec != null) {
            return new com.p314xaae8f345.mm.vfs.w4(this, (com.p314xaae8f345.mm.vfs.q2) this.f294279e.b(map), secretKeySpec);
        }
        throw new java.lang.RuntimeException("Cannot generate key.");
    }

    @Override // com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m82339x9616526c() {
        return "rc4 <- " + this.f294279e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22762x6c03528c.class, 3);
        parcel.writeParcelable(this.f294279e, i17);
        parcel.writeString(this.f294281g);
    }

    public C22762x6c03528c(android.os.Parcel parcel, com.p314xaae8f345.mm.vfs.v4 v4Var) {
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22762x6c03528c.class, 3);
        com.p314xaae8f345.mm.vfs.v2 v2Var = com.p314xaae8f345.mm.vfs.b3.F;
        this.f294280f = v2Var;
        if (v2Var != null) {
            this.f294279e = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) parcel.readParcelable(getClass().getClassLoader());
            this.f294281g = parcel.readString();
            return;
        }
        throw new java.lang.RuntimeException("Set global generator by calling setGlobalKeyGenerator(...) before initializing FileSystem objects.");
    }
}
