package com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI;", "Lcom/tencent/mm/plugin/forcenotify/ui/BaseForceNotifyShowUI;", "<init>", "()V", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI */
/* loaded from: classes10.dex */
public final class ActivityC15563xb39a5965 extends com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.AbstractActivityC15559xa873fe94 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f218875s = 0;

    /* renamed from: h, reason: collision with root package name */
    public android.media.MediaPlayer f218878h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f218879i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f218880m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f218883p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f218884q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f218885r;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f218876f = jz5.h.b(new k13.e0(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f218877g = jz5.h.b(new k13.k0(this));

    /* renamed from: n, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f218881n = k13.d0.f384735d;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f218882o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public ActivityC15563xb39a5965() {
        jz5.h.b(new k13.f0(this));
    }

    public final android.media.AudioManager T6() {
        return (android.media.AudioManager) ((jz5.n) this.f218876f).mo141623x754a37bb();
    }

    public final void U6() {
        java.lang.String str = this.f218860d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reset");
        if (this.f218885r) {
            this.f218883p = false;
            this.f218884q = false;
        }
        getWindow().getDecorView().setKeepScreenOn(false);
        getWindow().clearFlags(128);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f218882o;
        n3Var.mo50302x6b17ad39(null);
        try {
            n3Var.mo50300x3fa464aa(this.f218879i);
            V6();
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
        }
    }

    public final void V6() {
        try {
            ((android.os.Vibrator) ((jz5.n) this.f218877g).mo141623x754a37bb()).cancel();
            android.media.MediaPlayer mediaPlayer = this.f218878h;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            android.media.MediaPlayer mediaPlayer2 = this.f218878h;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            getWindow().getDecorView().setKeepScreenOn(false);
            getWindow().clearFlags(128);
            T6().abandonAudioFocus(this.f218881n);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bbi;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.AbstractActivityC15559xa873fe94, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f218860d, "[onBackPressed]");
        i13.c cVar = this.f218861e;
        if (cVar == null || !(cVar instanceof i13.p)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        i13.p pVar = (i13.p) cVar;
        long j17 = 1000;
        sb6.append(pVar.f368849n / j17);
        sb6.append(pVar.f368846h);
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ai(cVar.f368808d, sb6.toString(), 8, c01.id.c() / j17);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0334  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.AbstractActivityC15559xa873fe94, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15563xb39a5965.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.AbstractActivityC15559xa873fe94, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        java.lang.String str;
        super.onDestroy();
        U6();
        this.f218880m = null;
        this.f218879i = null;
        i13.c cVar = this.f218861e;
        if (cVar == null || (str = cVar.f368808d) == null) {
            return;
        }
        j13.a.f378710d.d(str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f218860d, "[onKeyDown] keyCode:" + i17);
        U6();
        return super.onKeyDown(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f218860d, "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f218860d, "onResume");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f218860d, "onStart");
        if (this.f218883p || this.f218884q) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f218882o;
            n3Var.mo50297x7c4d7ca2(this.f218880m, 1000L);
            n3Var.mo50297x7c4d7ca2(this.f218879i, 60000L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        U6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f218860d, "onStop");
    }
}
