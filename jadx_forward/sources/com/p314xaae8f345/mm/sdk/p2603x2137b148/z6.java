package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class z6 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f274669d;

    public z6(java.lang.String str) {
        super(null, null, null);
        this.f274669d = str;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a7
    public void a() {
        com.p314xaae8f345.mm.vfs.w6.h(this.f274669d);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a7
    public java.io.OutputStream b() {
        try {
            return com.p314xaae8f345.mm.vfs.w6.K(this.f274669d, false);
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScopedStorageUtil", "VFSFileOp openWrite fail: " + e17.getMessage());
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a7
    public void c() {
    }
}
