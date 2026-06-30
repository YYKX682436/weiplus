package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.CleanExpireFileSystem */
/* loaded from: classes12.dex */
public class C22740xea8e1d93 extends com.p314xaae8f345.mm.vfs.C22747x9dc2c96a {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22740xea8e1d93> f39788x681a0c0c = new com.p314xaae8f345.mm.vfs.s();

    /* renamed from: i, reason: collision with root package name */
    public final long f294229i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f294230m;

    public C22740xea8e1d93(android.os.Parcel parcel) {
        super(parcel);
        com.p314xaae8f345.mm.vfs.e8.b(parcel, com.p314xaae8f345.mm.vfs.C22740xea8e1d93.class, 2);
        this.f294230m = parcel.readByte() != 0;
        this.f294229i = this.f294243f;
    }

    @Override // com.p314xaae8f345.mm.vfs.C22747x9dc2c96a, com.p314xaae8f345.mm.vfs.a0
    /* renamed from: c */
    public com.p314xaae8f345.mm.vfs.q2 b(java.util.Map map) {
        return new com.p314xaae8f345.mm.vfs.t(this, (com.p314xaae8f345.mm.vfs.q2) this.f294242e.b(map), map);
    }

    @Override // com.p314xaae8f345.mm.vfs.C22747x9dc2c96a
    /* renamed from: toString */
    public java.lang.String mo82291x9616526c() {
        return "CleanExpire [" + this.f294242e.toString() + "]";
    }

    @Override // com.p314xaae8f345.mm.vfs.C22747x9dc2c96a, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        com.p314xaae8f345.mm.vfs.e8.u(parcel, com.p314xaae8f345.mm.vfs.C22740xea8e1d93.class, 2);
        parcel.writeByte(this.f294230m ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C22740xea8e1d93(com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb r7, long r8, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "CleanExpireFileSystem"
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r0)
            java.lang.String r1 = "CleanExpireCurrentExpireTime"
            r2 = 0
            long r4 = r0.getLong(r1, r2)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L18
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 > 0) goto L18
            r8 = r4
            goto L1b
        L18:
            r0.B(r1, r8)
        L1b:
            r6.<init>(r7, r8)
            r6.f294229i = r8
            r6.f294230m = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.C22740xea8e1d93.<init>(com.tencent.mm.vfs.FileSystem, long, boolean):void");
    }
}
