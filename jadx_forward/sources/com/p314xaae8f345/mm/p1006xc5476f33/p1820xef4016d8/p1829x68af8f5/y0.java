package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes4.dex */
public class y0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.z0 f227467f;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.z0 z0Var, java.lang.String str, java.lang.String str2) {
        this.f227467f = z0Var;
        this.f227465d = str;
        this.f227466e = str2;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "cdn callback: %s, %s", str, java.lang.Integer.valueOf(i17));
        if (i17 != 0) {
            com.p314xaae8f345.mm.vfs.w6.h(this.f227465d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) this.f227467f.f227470d.get();
            if (b1Var != null && b1Var.f227354a.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EnvelopeStoryVideoManager", "download video fail: %s", this.f227466e);
                b1Var.f227371r.setVisibility(0);
                b1Var.f227371r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.x0(this, b1Var));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19228, b1Var.f227356c, java.lang.Integer.valueOf(b1Var.f227366m.mo61527x6d590e18()), 2, java.lang.Integer.valueOf(b1Var.f227362i), java.lang.Integer.valueOf(b1Var.f227366m.m66134xdd2dfd95()), java.lang.Integer.valueOf(b1Var.f227361h), 0, -9999);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
