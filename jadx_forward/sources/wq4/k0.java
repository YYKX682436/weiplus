package wq4;

/* loaded from: classes14.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioManager f530180a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f530181b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.MediaPlayer f530182c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Vibrator f530183d;

    /* renamed from: f, reason: collision with root package name */
    public long f530185f;

    /* renamed from: g, reason: collision with root package name */
    public long f530186g;

    /* renamed from: j, reason: collision with root package name */
    public wq4.j0 f530189j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f530184e = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f530187h = false;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f530188i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public k0(android.content.Context context) {
        this.f530181b = context;
        if (context != null) {
            this.f530180a = (android.media.AudioManager) context.getSystemService("audio");
            this.f530183d = (android.os.Vibrator) context.getSystemService("vibrator");
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        context2 = context2 instanceof android.app.Activity ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context2;
        if (fp.h.c(8)) {
            new fp.g(context2);
        }
    }

    public void a() {
        java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e();
        android.content.Context context = this.f530181b;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(e17, 0);
        if (fp.h.c(26) ? sharedPreferences.getBoolean("settings_voip_scene_shake", true) : sharedPreferences.getBoolean("settings_shake", true)) {
            int ringerMode = this.f530180a.getRingerMode();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingPlayer", "system ringer mode: %s", java.lang.Integer.valueOf(ringerMode));
            if (ringerMode != 1 && ringerMode != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingPlayer", "system not open vibrate");
                return;
            }
            android.os.Vibrator vibrator = (android.os.Vibrator) context.getSystemService("vibrator");
            this.f530183d = vibrator;
            if (vibrator == null) {
                return;
            }
            if (fp.h.c(26)) {
                this.f530183d.vibrate(android.os.VibrationEffect.createWaveform(new long[]{1000, 1000, 1000, 1000}, 0), new android.media.AudioAttributes.Builder().setUsage(6).build());
            } else {
                this.f530183d.vibrate(new long[]{1000, 1000, 1000, 1000}, 0);
            }
        }
    }

    public android.net.Uri b(java.lang.String str) {
        str.getClass();
        boolean equals = str.equals("ipcall_phonering");
        android.content.Context context = this.f530181b;
        if (equals) {
            return android.net.Uri.parse("android.resource://" + context.getPackageName() + "/2131691554");
        }
        if (str.equals("close_lower_volume")) {
            return android.net.Uri.parse("android.resource://" + context.getPackageName() + "/2131690002");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "phonering")) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "playend") ? mx3.f0.c(context) : mx3.f0.c(context);
        }
        mx3.f0 f0Var = mx3.f0.f414081a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = mx3.f0.f414083c;
        sb6.append(str2);
        java.lang.String str3 = mx3.f0.f414085e;
        sb6.append(str3);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb6.toString());
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            mx3.f0.f414081a.a();
        }
        android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, new com.p314xaae8f345.mm.vfs.r6(str2 + str3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getUriForFile(...)");
        return b17;
    }

    public void c(boolean z17) {
        int i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RingPlayer", "setSpeakerStatus, isSpeakerOn: %b, isSpeakerphoneOn: %s, mode: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f530180a.isSpeakerphoneOn()), java.lang.Integer.valueOf(this.f530180a.getMode()));
        int i18 = z17 ? 0 : fp.h.c(21) ? 3 : 2;
        if ((z17 && (i17 = wo.v1.f529356c.f529121J) > -1) || (!z17 && (i17 = wo.v1.f529356c.I) > -1)) {
            i18 = i17;
        }
        if (i18 != this.f530180a.getMode()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingPlayer", "set AudioManager mode: %s", java.lang.Integer.valueOf(i18));
            ym1.f.wi().x(i18, null);
        }
        android.media.AudioManager audioManager = this.f530180a;
        if (audioManager == null) {
            audioManager = (android.media.AudioManager) ((jz5.n) mm1.g.f410194a).mo141623x754a37bb();
        }
        if (z17 != mm1.g.b(audioManager)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingPlayer", "set AudioManager speakerphoneOn: %s", java.lang.Boolean.valueOf(z17));
            ((ku5.t0) ku5.t0.f394148d).g(new xm1.e(ym1.f.wi(), z17));
        }
    }

    public final void d(java.lang.String str, long j17, boolean z17, int i17) {
        this.f530185f = java.lang.System.currentTimeMillis();
        this.f530182c = new to.g();
        try {
            this.f530182c.setDataSource(this.f530181b, b(str));
            this.f530182c.setOnCompletionListener(new wq4.d0(this, str, j17, z17, i17));
            this.f530182c.setOnErrorListener(new wq4.e0(this));
            this.f530182c.setAudioStreamType(i17);
            if (z17) {
                this.f530182c.setVolume(0.6f, 0.6f);
            } else {
                a();
            }
            this.f530182c.setLooping(false);
            this.f530182c.prepare();
            this.f530182c.start();
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingPlayer", "new MediaPlayer failed, " + e17.toString());
        }
    }

    public void e() {
        android.os.Vibrator vibrator = this.f530183d;
        if (vibrator != null) {
            vibrator.cancel();
            this.f530183d = null;
        }
        android.media.MediaPlayer mediaPlayer = this.f530182c;
        if (mediaPlayer == null || !this.f530184e) {
            return;
        }
        try {
            mediaPlayer.stop();
            this.f530182c.release();
            wq4.j0 j0Var = this.f530189j;
            if (j0Var != null) {
                this.f530188i.mo50300x3fa464aa(j0Var);
            }
            this.f530184e = false;
            i95.m c17 = i95.n0.c(ym1.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            xm1.h hVar = ((ym1.f) c17).f544669e;
            if (hVar == null) {
                hVar = new xm1.j();
                i95.m c18 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ((ym1.f) c18).f544669e = hVar;
                i95.m c19 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ((ym1.f) c19).f544671g[0] = "music";
            }
            hVar.v();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingPlayer", e17.toString());
        }
    }
}
