package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class x6 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f274622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 f274623c;

    public x6(java.lang.String str, boolean[] zArr, com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 y6Var) {
        this.f274621a = str;
        this.f274622b = zArr;
        this.f274623c = y6Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public void a(com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var) {
        super.a(a7Var);
        this.f274622b[0] = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 y6Var = this.f274623c;
        if (y6Var != null) {
            y6Var.a(a7Var);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public void b(com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var) {
        java.io.OutputStream b17;
        try {
            b17 = a7Var.b();
            try {
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScopedStorageUtil", e17, "copyFile fail", new java.lang.Object[0]);
            a(a7Var);
        }
        if (b17 == null) {
            throw new java.io.IOException("Open file fail");
        }
        com.p314xaae8f345.mm.vfs.u6 u6Var = new com.p314xaae8f345.mm.vfs.u6(this.f274621a);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = u6Var.read(bArr);
                if (-1 == read) {
                    break;
                } else {
                    b17.write(bArr, 0, read);
                }
            }
            a7Var.c();
            this.f274622b[0] = true;
            u6Var.close();
            b17.close();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 y6Var = this.f274623c;
            if (y6Var != null) {
                y6Var.b(a7Var);
            }
        } finally {
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public boolean c() {
        return true;
    }
}
