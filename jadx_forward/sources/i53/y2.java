package i53;

/* loaded from: classes8.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f370323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f370324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f370327i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i53.z2 f370328m;

    public y2(i53.z2 z2Var, java.lang.String str, long j17, boolean z17, java.lang.String str2, java.lang.String str3, int i17) {
        this.f370328m = z2Var;
        this.f370322d = str;
        this.f370323e = j17;
        this.f370324f = z17;
        this.f370325g = str2;
        this.f370326h = str3;
        this.f370327i = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        i53.u z07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().z0(this.f370322d);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z07 != null) {
            hashMap.put("type", java.lang.Integer.valueOf(i53.d3.a(this.f370328m.f370338a, z07.f67107x1a330c39)));
            if (i53.d3.a(this.f370328m.f370338a, z07.f67107x1a330c39) == 2) {
                hashMap.put("videoid", com.p314xaae8f345.mm.vfs.w6.p(z07.f67101xf1e9b966));
            }
        }
        hashMap.put("costtime", java.lang.Long.valueOf(this.f370323e));
        hashMap.put("origtime", java.lang.Integer.valueOf(z07.f67099xa7075739));
        hashMap.put("origsize", java.lang.Long.valueOf(z07.f67109x22618426));
        i53.x D0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().D0(this.f370328m.f370338a.f370080a);
        if (D0 != null) {
            hashMap.put("pushid", D0.f67215x11522065);
            i17 = D0.f67212xf10bdf85;
            i18 = D0.f67214xf10c4fa7;
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (this.f370324f) {
            ((java.util.HashSet) this.f370328m.f370338a.f370086g).remove(this.f370322d);
            i53.w wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi();
            java.lang.String str = this.f370322d;
            java.lang.String str2 = this.f370325g;
            java.lang.String str3 = this.f370326h;
            wi6.getClass();
            java.lang.String format = java.lang.String.format("update %s set %s=\"%s\", %s=\"%s\", %s=%d where %s=\"%s\"", "GameHaowanMedia", "mediaUrl", str2, "thumbPicUrl", str3, "uploadState", 2, dm.i4.f66867x2a5c95c7, str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateMediaUrl, sql: " + format);
            wi6.m145253xb158737d("GameHaowanMedia", format);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8764, 0, 48, i18, lj0.a.a(i17, hashMap));
        } else if (this.f370327i != -21006) {
            ((java.util.HashSet) this.f370328m.f370338a.f370086g).add(this.f370322d);
            hashMap.put("failid", java.lang.Integer.valueOf(this.f370327i));
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8764, 0, 56, i18, lj0.a.a(i17, hashMap));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload list size : %d, hasPushAllUpload: %b", java.lang.Integer.valueOf(((java.util.HashSet) this.f370328m.f370338a.f370085f).size()), java.lang.Boolean.valueOf(this.f370328m.f370338a.f370088i));
        if (((java.util.HashSet) this.f370328m.f370338a.f370085f).isEmpty()) {
            i53.d3 d3Var = this.f370328m.f370338a;
            if (d3Var.f370088i) {
                if (!((java.util.HashSet) d3Var.f370086g).isEmpty()) {
                    ((ku5.t0) ku5.t0.f394148d).k(this.f370328m.f370338a.f370091l, 60000L);
                } else {
                    i53.c3 c3Var = this.f370328m.f370338a.f370083d;
                    if (c3Var != null) {
                        ((i53.y) c3Var).a(true);
                    }
                }
            }
        }
    }
}
