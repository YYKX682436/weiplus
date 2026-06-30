package i53;

/* loaded from: classes12.dex */
public class k3 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.m3 f370169f;

    public k3(i53.m3 m3Var, long j17, java.lang.String str) {
        this.f370169f = m3Var;
        this.f370167d = j17;
        this.f370168e = str;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        if (!this.f370169f.f370192b.equals(str) || j18 == 0) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i53.j3(this, j17, j18));
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        i53.m3 m3Var = this.f370169f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameVideoDownloadPerform", "download video mediaId:%s, rawMediaId:%s", str, m3Var.f370192b);
        if (m3Var.f370192b.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameVideoDownloadPerform", "download video cost time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f370167d));
            java.lang.String str2 = this.f370168e;
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameVideoDownloadPerform", "download video[%s] success", str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameVideoDownloadPerform", "download video[%s] fail, ret:%d", str2, java.lang.Integer.valueOf(i17));
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m3Var.f370191a;
            if (i17 == 0 && !android.text.TextUtils.isEmpty(m3Var.f370193c)) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(m3Var.f370193c);
                if (r6Var.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameVideoDownloadPerform", "download file size:%d", java.lang.Long.valueOf(r6Var.C()));
                    zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                    java.lang.String str3 = m3Var.f370193c;
                    ((yb0.g) b0Var).getClass();
                    java.lang.String g17 = com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str3, null, null);
                    if (g17 != null) {
                        q75.c.f(g17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    }
                    abstractActivityC21394xb3d2c0cf.setResult(-1, new android.content.Intent().putExtra("ret_info", java.lang.String.valueOf(0)));
                    abstractActivityC21394xb3d2c0cf.finish();
                    return;
                }
            }
            abstractActivityC21394xb3d2c0cf.setResult(-1, new android.content.Intent().putExtra("ret_info", java.lang.String.valueOf(i17)));
            abstractActivityC21394xb3d2c0cf.finish();
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
