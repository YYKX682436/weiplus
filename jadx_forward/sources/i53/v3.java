package i53;

/* loaded from: classes12.dex */
public class v3 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m33.u1 f370297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15912x63e03585 f370298g;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15912x63e03585 activityC15912x63e03585, long j17, java.lang.String str, m33.u1 u1Var) {
        this.f370298g = activityC15912x63e03585;
        this.f370295d = j17;
        this.f370296e = str;
        this.f370297f = u1Var;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        if (!this.f370298g.f221607g.equals(str) || j18 == 0) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i53.u3(this, j17, j18));
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15912x63e03585 activityC15912x63e03585 = this.f370298g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download video mediaId:%s, rawMediaId:%s", str, activityC15912x63e03585.f221607g);
        if (activityC15912x63e03585.f221607g.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download video cost time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f370295d));
            java.lang.String str2 = this.f370296e;
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download video[%s] success", str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download video[%s] fail, ret:%d", str2, java.lang.Integer.valueOf(i17));
            }
            m33.u1 u1Var = this.f370297f;
            if (i17 == 0 && !android.text.TextUtils.isEmpty(activityC15912x63e03585.f221611n)) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(activityC15912x63e03585.f221611n);
                if (r6Var.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "download file size:%d", java.lang.Long.valueOf(r6Var.C()));
                    ((i53.t3) u1Var).a(activityC15912x63e03585.f221611n, 0, 0);
                    return;
                }
            }
            db5.t7.m123882x26a183b(activityC15912x63e03585.f221606f, com.p314xaae8f345.mm.R.C30867xcad56011.fpt, 1).show();
            if (u1Var != null) {
                ((i53.t3) u1Var).a(activityC15912x63e03585.f221611n, 2, i17);
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
