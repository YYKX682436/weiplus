package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes14.dex */
public final class b0 extends pf5.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f231789d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f231790e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f231791f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f231792g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f231793h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f231794i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f231795m;

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f231796n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f231797o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f231798p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f231799q;

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f231800r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f231801s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f231802t;

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f231803u;

    /* renamed from: v, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f231804v;

    /* renamed from: w, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f231805w;

    /* renamed from: x, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f231806x;

    /* renamed from: y, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f231807y;

    /* renamed from: z, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f231808z;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0.<init>():void");
    }

    public static final int N6(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 b0Var, com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54, java.util.List list, java.lang.String str) {
        java.lang.Object obj;
        int i17;
        int i18;
        b0Var.getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c11143x170c3f54.f153145d, str)) {
            return 1000;
        }
        boolean z17 = true;
        boolean z18 = c11143x170c3f54.f153147f == 10;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e) obj).f153152e, c11143x170c3f54.f153145d)) {
                break;
            }
        }
        com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e c11145xd1f31e9e = (com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e) obj;
        if (c11145xd1f31e9e == null || ((i17 = c11145xd1f31e9e.f153154g) != 3 && i17 != 2 && (i18 = c11145xd1f31e9e.f153155h) != 101 && i18 != 102)) {
            z17 = false;
        }
        if (z18) {
            return z17 ? 0 : 10;
        }
        return 100;
    }

    public final void O6(java.lang.Boolean bool) {
        boolean booleanValue;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCameraClick, cur state: ");
        p012xc85e97e9.p093xedfae76a.g0 g0Var = this.f231796n;
        sb6.append(g0Var.mo3195x754a37bb());
        sb6.append(", new state: ");
        sb6.append(bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
        if (bool != null) {
            if (!bool.booleanValue()) {
                booleanValue = true;
            }
            booleanValue = false;
        } else {
            java.lang.Boolean bool2 = (java.lang.Boolean) g0Var.mo3195x754a37bb();
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            }
            booleanValue = false;
        }
        if (booleanValue == (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().c())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "current camera state is " + com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().c() + ", return");
            return;
        }
        if (booleanValue) {
            rq4.u.f480642a.b(4, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().d());
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wi6, "getCameraManager(...)");
            wi6.i(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.H();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().getClass();
        } else {
            boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231699i ? this.f231801s : this.f231802t;
            this.f231803u.mo7808x76db6cb1(java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
            if (n17 != null) {
                n17.i(z17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 wi7 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wi7, "getCameraManager(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0.h(wi7, false, 1, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(5);
            rq4.u.f480642a.b(3, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().d());
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            i4Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "hy: onCameraStart");
            i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.n3(i4Var));
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().getClass();
        }
        this.f231795m.mo523x53d8522f(java.lang.Boolean.valueOf(!booleanValue));
    }

    public final void P6(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMicClick, cur state: ");
        p012xc85e97e9.p093xedfae76a.g0 g0Var = this.f231790e;
        sb6.append(g0Var.mo3195x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
        java.lang.Boolean bool = (java.lang.Boolean) g0Var.mo3195x754a37bb();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        this.f231789d.mo523x53d8522f(java.lang.Boolean.valueOf(!booleanValue));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f231675b++;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onMicClick, need notify iLink Engine");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Q(booleanValue);
        }
        if (booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().b(false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().b(true);
        }
    }

    public final void Q6(boolean z17) {
        p012xc85e97e9.p093xedfae76a.g0 g0Var = this.f231792g;
        java.lang.Integer num = (java.lang.Integer) g0Var.mo3195x754a37bb();
        int intValue = num != null ? num.intValue() : 1;
        int i17 = intValue == 1 ? 2 : 1;
        this.f231791f.mo7808x76db6cb1(java.lang.Integer.valueOf(i17));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onSpeakerClick, need notify iLink Engine");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().R(intValue != 1);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f231808z;
        if (r2Var != null && r2Var.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MT.MultiTalkUIViewModel", "onSpeakerClick: now switching, skip click");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onSpeakerClick, cur state: " + g0Var.mo3195x754a37bb() + ", new state: " + i17);
        this.f231808z = pf5.e.m158343xd39de650(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.y(i17, this, null), 3, null);
    }

    public final void R6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f231676c++;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().c(true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().c(false);
        }
    }
}
