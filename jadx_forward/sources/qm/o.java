package qm;

/* loaded from: classes13.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f446181e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f446177a = false;

    /* renamed from: b, reason: collision with root package name */
    public android.media.MediaPlayer f446178b = null;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f446180d = new qm.f(this, android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f446179c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;

    public o() {
        java.lang.String str = null;
        java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "deviceconfig.cfg";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServerConfigInfoStorage", "readConfigFromLocalFile, path: %s, isExist: %s", str2, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(str2)));
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str2, 0, -1);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
                java.lang.String str3 = new java.lang.String(N, java.nio.charset.Charset.defaultCharset());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    str = str3;
                }
            }
        }
        wo.v1.a(str);
    }

    public synchronized void a(java.lang.String str, boolean z17, boolean z18) {
        if (this.f446181e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "playSound playHandler == null");
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("playSoundThread", 0);
            a17.start();
            this.f446181e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        }
        this.f446181e.mo50293x3498a0(new qm.g(this, str, z17, z18));
    }

    public final void b(android.media.MediaPlayer mediaPlayer, java.lang.String str, boolean z17, boolean z18) {
        android.net.Uri parse;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            parse = android.media.RingtoneManager.getDefaultUri(2);
        } else if (z18) {
            parse = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(this.f446179c, com.p314xaae8f345.mm.vfs.r6.j(new java.io.File(str)));
        } else if (z17) {
            android.content.res.AssetFileDescriptor openFd = this.f446179c.getAssets().openFd(str);
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            parse = null;
        } else {
            parse = android.net.Uri.parse(str);
        }
        if (parse != null) {
            try {
                mediaPlayer.setDataSource(this.f446179c, parse);
            } catch (java.io.IOException unused) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "setPlayerDataSource IOException soundUri:%s, isAsset:%s", str, java.lang.Boolean.valueOf(z17));
                } else {
                    mediaPlayer.setDataSource(this.f446179c, android.media.RingtoneManager.getDefaultUri(2));
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "summeranrt setPlayerDataSource tid[%d] [%d]ms", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
