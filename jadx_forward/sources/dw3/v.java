package dw3;

/* loaded from: classes4.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f325817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f325820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f325821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f325822i;

    public v(boolean z17, java.lang.String str, java.lang.String str2, boolean z18, boolean z19, boolean z27) {
        this.f325817d = z17;
        this.f325818e = str;
        this.f325819f = str2;
        this.f325820g = z18;
        this.f325821h = z19;
        this.f325822i = z27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f325817d) {
            dw3.c0.f325715a.j(this.f325818e);
        }
        java.lang.String str = this.f325819f;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "file is no exist >> " + str);
            return;
        }
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "videoState : " + o17 + ' ');
        if (o17) {
            boolean z17 = this.f325820g;
            if (z17 || (!z17 && this.f325821h && this.f325822i)) {
                java.lang.String h17 = ai3.d.h("mp4");
                if (!z17) {
                    h17 = q75.c.b("mp4");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "auto save video :" + h17);
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, h17);
                q75.c.f(h17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Bi(str);
            }
        }
    }
}
