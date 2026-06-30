package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class a implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f225026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b f225028f;

    public a(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b bVar) {
        this.f225026d = j17;
        this.f225027e = str;
        this.f225028f = bVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppDownloadVideo", "download video mediaId:%s, rawMediaId:%s", str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.f225075a);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.f225075a.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppDownloadVideo", "download video cost time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f225026d));
            java.lang.String str2 = this.f225027e;
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppDownloadVideo", "download video[%s] success", str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppDownloadVideo", "download video[%s] fail, ret:%d", str2, java.lang.Integer.valueOf(i17));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b bVar = this.f225028f;
            if (i17 == 0 && !android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.f225076b)) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.f225076b);
                if (r6Var.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppDownloadVideo", "download file size:%d", java.lang.Long.valueOf(r6Var.C()));
                    bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.f225076b, 0, 0);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppDownloadVideo", "download video[%s] fail", str2);
            if (bVar != null) {
                bVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.f225076b, 2, i17);
            }
        }
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
    }
}
