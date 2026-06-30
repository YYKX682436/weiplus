package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl */
/* loaded from: classes15.dex */
public class C19656x5a7dec62 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 {

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f271397r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 f271398s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f271399t;

    /* renamed from: u, reason: collision with root package name */
    public long f271400u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f271401v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnTouchListener f271402w;

    public C19656x5a7dec62(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f271399t = false;
        this.f271401v = new com.p314xaae8f345.mm.p2470x93e71c27.ui.v3(this);
        this.f271402w = new com.p314xaae8f345.mm.p2470x93e71c27.ui.w3(this);
        j(context);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722
    public void d(boolean z17) {
        if (!z17) {
            k(17, false);
        }
        l(new com.p314xaae8f345.mm.p2470x93e71c27.ui.z3(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722
    public void e(int i17) {
        l(new com.p314xaae8f345.mm.p2470x93e71c27.ui.b4(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722
    public void f() {
        l(new com.p314xaae8f345.mm.p2470x93e71c27.ui.a4(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722
    public void g(boolean z17) {
        l(new com.p314xaae8f345.mm.p2470x93e71c27.ui.y3(this, z17));
    }

    public void i(boolean z17, boolean z18) {
        int i17 = this.f271389g;
        if (i17 == 1) {
            if (z17 || z18) {
                if (!z17 || z18) {
                    return;
                }
                k(4, this.f271399t);
                k(this.f271389g, this.f271399t);
                this.f271398s.b();
                return;
            }
            int n17 = c01.d9.e().n();
            if (n17 == 4 || n17 == 6) {
                b(true);
                return;
            }
            l(new com.p314xaae8f345.mm.p2470x93e71c27.ui.x3(this));
            this.f271389g = 1;
            f();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = this.f271386d;
            if (u3Var != null) {
                u3Var.g(12, -1, -1);
                return;
            }
            return;
        }
        if (i17 != 2) {
            if (!z17 && !z18) {
                k(i17, this.f271399t);
                a();
                return;
            } else {
                if (!z17 || z18) {
                    return;
                }
                k(4, this.f271399t);
                k(this.f271389g, this.f271399t);
                this.f271398s.b();
                return;
            }
        }
        if (!z18) {
            if (z17) {
                k(4, this.f271399t);
            }
            k(this.f271389g, this.f271399t);
            c();
            return;
        }
        this.f271398s.b();
        a();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.t3 t3Var = this.f271393n;
        if (t3Var != null) {
            t3Var.a(true);
        }
        k(5, this.f271399t);
    }

    public void j(android.content.Context context) {
        android.view.View findViewById = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d4b, this).findViewById(com.p314xaae8f345.mm.R.id.f569150p71);
        this.f271397r = findViewById;
        findViewById.setLayerType(1, null);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.g3(context);
        this.f271398s = g3Var;
        this.f271397r.setBackground(g3Var);
        this.f271397r.setEnabled(true);
        this.f271397r.setOnTouchListener(this.f271402w);
        this.f271397r.setOnLongClickListener(this.f271401v);
        h(true);
        if (isInEditMode()) {
            return;
        }
        int n17 = c01.d9.e().n();
        if (n17 == 4 || n17 == 6) {
            return;
        }
        l(new com.p314xaae8f345.mm.p2470x93e71c27.ui.x3(this));
        this.f271389g = 1;
        f();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = this.f271386d;
        if (u3Var != null) {
            u3Var.g(12, -1, -1);
        }
    }

    public final void k(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1 c17191x850a0de1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a();
        if (!z17) {
            c17189xc14104a.f37849x5a5c588 = i17;
        } else if (this.f271388f) {
            c17189xc14104a.f37851xe1880c15 = i17;
            if (i17 != 4 && this.f271399t) {
                long j17 = this.f271400u;
                if (j17 != 0) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    c17189xc14104a.f37852x87f1c082 = android.os.SystemClock.elapsedRealtime() - j17;
                }
            }
        } else {
            c17189xc14104a.f37854x614bc6c = i17;
            if (i17 != 4 && this.f271399t) {
                long j18 = this.f271400u;
                if (j18 != 0) {
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    c17189xc14104a.f37855x3b706d59 = android.os.SystemClock.elapsedRealtime() - j18;
                }
            }
        }
        c17191x850a0de1.f37886x6afc6eb = c17189xc14104a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.I(13905, c17191x850a0de1, false, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputLayoutImp", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", java.lang.Integer.valueOf(c17189xc14104a.f37845xae7a2e7a), java.lang.Integer.valueOf(c17189xc14104a.f37856x35cf88), java.lang.Integer.valueOf(c17189xc14104a.f37849x5a5c588), java.lang.Integer.valueOf(c17189xc14104a.f37854x614bc6c), java.lang.Long.valueOf(c17189xc14104a.f37855x3b706d59), java.lang.Integer.valueOf(c17189xc14104a.f37865xc099c45b), java.lang.Integer.valueOf(c17189xc14104a.f37862x1d166fd2), java.lang.Long.valueOf(c17189xc14104a.f37864x7cd6cfaa), java.lang.Integer.valueOf(c17189xc14104a.f37863x9ec2f6cd), java.lang.Long.valueOf(c17189xc14104a.f37867x8182a0a5), java.lang.Integer.valueOf(c17189xc14104a.f37850x2fd71e), java.lang.Integer.valueOf(c17189xc14104a.f37848x5a5b64d), java.lang.Integer.valueOf(c17189xc14104a.f37861x80c0d267), java.lang.Integer.valueOf(c17189xc14104a.f37866xc755f37d), java.lang.Integer.valueOf(c17189xc14104a.f37851xe1880c15), java.lang.Long.valueOf(c17189xc14104a.f37852x87f1c082));
    }

    public final void l(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        } else {
            runnable.run();
        }
    }

    public C19656x5a7dec62(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f271399t = false;
        this.f271401v = new com.p314xaae8f345.mm.p2470x93e71c27.ui.v3(this);
        this.f271402w = new com.p314xaae8f345.mm.p2470x93e71c27.ui.w3(this);
        j(context);
    }
}
