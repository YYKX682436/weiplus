package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class k implements pm5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22738xaf98734e.AssetsFileSystem f294554e;

    public k(com.p314xaae8f345.mm.vfs.C22738xaf98734e.AssetsFileSystem assetsFileSystem, java.lang.String str) {
        this.f294554e = assetsFileSystem;
        this.f294553d = str;
    }

    @Override // pm5.j
    public java.lang.Object d(java.lang.Object obj) {
        java.io.InputStream inputStream;
        com.p314xaae8f345.mm.vfs.x1 x1Var;
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = this.f294553d + str;
        java.io.InputStream inputStream2 = null;
        try {
            inputStream = this.f294554e.f294226e.open(str2);
            try {
                try {
                    x1Var = new com.p314xaae8f345.mm.vfs.x1(this.f294554e, str2, str, inputStream.available(), 0L, 0L, false);
                } catch (java.io.IOException unused) {
                    x1Var = new com.p314xaae8f345.mm.vfs.x1(this.f294554e, str2, str, 0L, 0L, 0L, true);
                    com.p314xaae8f345.mm.vfs.e8.d(inputStream);
                    return x1Var;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                inputStream2 = inputStream;
                com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
                throw th;
            }
        } catch (java.io.IOException unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.mm.vfs.e8.d(inputStream2);
            throw th;
        }
        com.p314xaae8f345.mm.vfs.e8.d(inputStream);
        return x1Var;
    }
}
