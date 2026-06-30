package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class xj0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public static long A;
    public static long B;

    /* renamed from: y, reason: collision with root package name */
    public static long f196622y;

    /* renamed from: z, reason: collision with root package name */
    public static long f196623z;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196624p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f196625q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f196626r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1527x58d9bd6.C14275xc7bd3384 f196627s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f196628t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f196629u;

    /* renamed from: v, reason: collision with root package name */
    public int f196630v;

    /* renamed from: w, reason: collision with root package name */
    public long f196631w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f196632x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196624p = statusMonitor;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.enq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f196625q = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.fkz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f196626r = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.enw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f196627s = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1527x58d9bd6.C14275xc7bd3384) findViewById3;
        this.f196629u = "SWITCH_ONLY_AUDIO_MODE_ACTION";
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xj0 xj0Var, r45.ba4 ba4Var) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        xj0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "[showLiveRoomImg] info = " + pm0.b0.g(ba4Var));
        int m75939xb282bd08 = ba4Var.m75939xb282bd08(2);
        str = "";
        if (m75939xb282bd08 == 0) {
            java.lang.String m75945x2fec83072 = ba4Var.m75945x2fec8307(0);
            xj0Var.x1(m75945x2fec83072 != null ? m75945x2fec83072 : "");
            return;
        }
        if (m75939xb282bd08 != 1) {
            super.K0(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "[showLiveRoomImg] unknown img type");
            return;
        }
        r45.gg0 gg0Var = (r45.gg0) ba4Var.m75936x14adae67(1);
        if (gg0Var != null && (m75945x2fec8307 = gg0Var.m75945x2fec8307(1)) != null) {
            str = m75945x2fec8307;
        }
        xj0Var.x1(str);
        if (xj0Var.f196628t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "plugin has unmount, dont new player");
        }
    }

    public final void A1() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.uo1 m76959xd0530b13;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
        java.lang.String m75945x2fec8307 = (c19792x256d27252 == null || (m76802x2dd016662 = c19792x256d27252.m76802x2dd01666()) == null || (m76959xd0530b13 = m76802x2dd016662.m76959xd0530b13()) == null) ? null : m76959xd0530b13.m75945x2fec8307(0);
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && ((c19792x256d2725 = ((mm2.c1) P0(mm2.c1.class)).f410379n) == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null || (m75945x2fec8307 = c19788xd7cfd73e.m76625xb5887639()) == null)) {
            m75945x2fec8307 = "";
        }
        java.lang.String str = m75945x2fec8307;
        java.lang.String str2 = V0().f390662d.f150075m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.lang.String str3 = str2.length() > 0 ? str2 : null;
        if (str3 == null) {
            str3 = ((mm2.c1) P0(mm2.c1.class)).f410385o;
        }
        ya2.b2 b17 = ((mm2.c1) P0(mm2.c1.class)).Y4 ? ya2.h.f542017a.b(((mm2.c1) P0(mm2.c1.class)).f410385o) : ya2.h.f542017a.b(str3);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pj0(((mm2.c1) P0(mm2.c1.class)).w7(), this, str, b17 != null ? b17.y0() : "", ""));
        y1(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void J0() {
        y1(((mm2.c1) P0(mm2.c1.class)).f8());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
    }

    @Override // qo0.a
    public void L0() {
        u1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 162) {
            if (((mm2.c1) P0(mm2.c1.class)).f8()) {
                v1(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "link mic close onlyAudioMode");
                return;
            }
            return;
        }
        if (ordinal == 193) {
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_ONLY_AUDIO_MODE_SWITCH", false) : false;
            v1(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "FINDER_LIVE_VISITOR_ONLY_AUDIO_MODE_SWITCH isVisitorOnlyAudioMode:" + z17);
            return;
        }
        if (ordinal == 194 && this.f196632x) {
            if (this.f446856d.getVisibility() == 0) {
                super.K0(4);
            }
            R0().mo57479x2f73c7d7(true);
            this.f196632x = false;
        }
    }

    @Override // qo0.a
    public void N0() {
        w1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var;
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        super.O0();
        this.f196628t = true;
        this.f196630v = 0;
        this.f196631w = 0L;
        this.f196632x = false;
        w1();
        gm0.y n17 = gm0.j1.n();
        if (n17 == null || (r1Var = n17.f354821b) == null || (sVar = r1Var.f152297d) == null) {
            return;
        }
        sVar.f1(xn0.i.f536957d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", this.f196629u) && (obj instanceof java.lang.Boolean)) {
            v1(((java.lang.Boolean) obj).booleanValue());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void u1() {
        if (!((mm2.c1) P0(mm2.c1.class)).f8()) {
            super.K0(4);
        } else {
            A = c01.id.c();
            A1();
        }
    }

    public final void v1(boolean z17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.uo1 m76959xd0530b13;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAudioMode isVisitorOnlyAudioMode:");
        sb6.append(z17);
        sb6.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
        sb6.append(((mm2.c1) P0(mm2.c1.class)).I4);
        sb6.append(" liveDesc.cover:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
        sb6.append((c19792x256d2725 == null || (m76802x2dd016662 = c19792x256d2725.m76802x2dd01666()) == null || (m76959xd0530b13 = m76802x2dd016662.m76959xd0530b13()) == null) ? null : m76959xd0530b13.m75945x2fec8307(0));
        sb6.append(" media.url:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
        sb6.append((c19792x256d27252 == null || (m76802x2dd01666 = c19792x256d27252.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) ? null : c19788xd7cfd73e.m76625xb5887639());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", sb6.toString());
        if (z17 == ((mm2.c1) P0(mm2.c1.class)).f8()) {
            return;
        }
        if (x0()) {
            p1(this.f196629u, java.lang.Boolean.valueOf(z17));
            return;
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        if (z17) {
            boolean z18 = ((mm2.c1) P0(mm2.c1.class)).V4 != 0;
            boolean m40080x23b734ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (z18 || !m40080x23b734ff) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "anchor pause live:" + z18 + ",networkEnable:" + m40080x23b734ff + '!');
                db5.t7.b(viewGroup.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egu));
                return;
            }
            dk2.xf W0 = W0();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(W0 != null ? java.lang.Boolean.valueOf(((dk2.r4) W0).t(z17, false)) : null, java.lang.Boolean.TRUE)) {
                M0(qo0.b.f446868c3, null);
            } else {
                db5.t7.b(viewGroup.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egu));
            }
        } else {
            this.f196632x = true;
            dk2.xf W02 = W0();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(W02 != null ? java.lang.Boolean.valueOf(((dk2.r4) W02).t(z17, false)) : null, java.lang.Boolean.TRUE)) {
                M0(qo0.b.f446868c3, null);
            } else {
                db5.t7.b(viewGroup.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egu));
            }
        }
        if (z17) {
            A1();
        } else {
            R0().m57770xc5b7675c(((mm2.c1) P0(mm2.c1.class)).f410385o);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0.class);
        if (le0Var != null) {
            le0Var.t1();
        }
        y1(z17);
    }

    public final void w1() {
        if (!((mm2.c1) P0(mm2.c1.class)).f8() || A == 0) {
            return;
        }
        long c17 = c01.id.c() - A;
        B += c17;
        A = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorOnlyAudioModePlugin", "in room add Time, inRoom: " + c17 + " total: " + B);
    }

    public final void x1(java.lang.String str) {
        if (r26.i0.y(str, "http", false)) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c a17 = g1Var.e().a(new mn2.j0(str));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rj0 rj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rj0(this);
            a17.getClass();
            a17.f529406d = rj0Var;
            a17.g(g1Var.h(mn2.f1.G));
            a17.f();
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a18.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(a18, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "openRead(...)");
        android.view.ViewGroup viewGroup = this.f446856d;
        android.graphics.Bitmap P = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.P(D, 0.0f, i65.a.B(viewGroup.getContext()), i65.a.k(viewGroup.getContext()), true);
        this.f196625q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(viewGroup.getContext().getResources(), P));
        ((mm2.c1) P0(mm2.c1.class)).I4 = P;
        super.K0(0);
    }

    public final void y1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1527x58d9bd6.C14275xc7bd3384 c14275xc7bd3384 = this.f196627s;
        if (z17) {
            c14275xc7bd3384.leftWave.m57086xb72366a7(true, false);
            c14275xc7bd3384.rightWave.m57086xb72366a7(true, true);
        } else {
            c14275xc7bd3384.leftWave.m57086xb72366a7(false, false);
            c14275xc7bd3384.rightWave.m57086xb72366a7(false, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var;
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        super.z0();
        this.f196630v = 0;
        this.f196631w = 0L;
        this.f196628t = false;
        android.widget.TextView titleTxt = this.f196627s.getTitleTxt();
        android.view.ViewGroup viewGroup = this.f446856d;
        titleTxt.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2c));
        android.widget.TextView textView = this.f196626r;
        com.p314xaae8f345.mm.ui.fk.a(textView);
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sj0(this));
        u1();
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tj0(this));
        gm0.y n17 = gm0.j1.n();
        if (n17 == null || (r1Var = n17.f354821b) == null || (sVar = r1Var.f152297d) == null) {
            return;
        }
        sVar.h1(xn0.i.f536957d);
    }

    public final void z1() {
        if (!((mm2.c1) P0(mm2.c1.class)).N4 || ((mm2.c1) P0(mm2.c1.class)).f8()) {
            return;
        }
        ((mm2.c1) P0(mm2.c1.class)).N4 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(this.f446856d.getContext());
        e3Var.f(com.p314xaae8f345.mm.R.C30864xbddafb2a.awi);
        android.view.View view = e3Var.f213492f;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.i4m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        view.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uj0(e3Var));
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.i4l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vj0(this, e3Var));
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.i4n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wj0(this, e3Var));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.X1;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "3");
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        ml2.r0.hj(r0Var, b4Var, r26.i0.t(gVar2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
        e3Var.i();
    }
}
