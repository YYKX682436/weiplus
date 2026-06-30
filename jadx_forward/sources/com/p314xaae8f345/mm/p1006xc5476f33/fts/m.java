package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.j f219292d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.fts.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.j jVar) {
        this.f219292d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.j jVar = this.f219292d;
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(jVar.f218953a);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if ((!m17.a() ? false : m17.f294799a.F(m17.f294800b)) || (bitmap = jVar.f218954b) == null || bitmap.isRecycled()) {
                return;
            }
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(jVar.f218954b, 100, android.graphics.Bitmap.CompressFormat.PNG, jVar.f218953a, false);
            java.lang.System.currentTimeMillis();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSImageLoader", e17, "", new java.lang.Object[0]);
        }
    }
}
