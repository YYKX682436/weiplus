package com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui;

@db5.a(m123858x6ac9171 = 1024)
/* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI */
/* loaded from: classes5.dex */
public class ActivityC16081x2d23fdab extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public static final /* synthetic */ int U = 0;
    public int A;
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 E;
    public int H;
    public boolean I;
    public android.graphics.Rect P;
    public android.graphics.Rect Q;
    public z63.g R;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f223751d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ScrollView f223752e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f223753f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f223754g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f223755h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f223756i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f223757m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f223758n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageButton f223759o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f223760p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f223761q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f223762r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f223763s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f223764t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f223765u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f223766v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.GestureDetector f223767w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f223768x;

    /* renamed from: z, reason: collision with root package name */
    public int f223770z;

    /* renamed from: y, reason: collision with root package name */
    public boolean f223769y = false;
    public y63.a B = null;
    public y63.a C = null;
    public java.lang.String D = "";
    public boolean F = false;
    public boolean G = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f223750J = false;
    public boolean K = false;
    public boolean L = false;
    public final java.util.ArrayList M = new java.util.ArrayList();
    public boolean N = false;
    public final android.text.TextWatcher S = new z63.y(this);
    public final android.view.View.OnTouchListener T = new z63.i0(this);

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        android.util.Pair pair;
        java.lang.Object obj;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object obj2;
        y63.a aVar;
        java.lang.String str5;
        activityC16081x2d23fdab.N = true;
        if (activityC16081x2d23fdab.f223769y && (aVar = activityC16081x2d23fdab.B) != null && (str5 = aVar.I) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5.trim())) {
            activityC16081x2d23fdab.B.I = activityC16081x2d23fdab.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fso) + " " + activityC16081x2d23fdab.B.I.trim();
            y63.a aVar2 = activityC16081x2d23fdab.B;
            aVar2.f66138x4b6e619a = x63.g.o(aVar2);
        }
        y63.a f17 = ((t63.e) i95.n0.c(t63.e.class)).wi().f(activityC16081x2d23fdab.D, activityC16081x2d23fdab.B.f66138x4b6e619a);
        x63.g.h(f17, activityC16081x2d23fdab.D);
        if (activityC16081x2d23fdab.F) {
            z17 = f17 != null;
            f17 = x63.g.A(activityC16081x2d23fdab.B, f17, c01.z1.r(), 2);
        } else {
            z17 = false;
        }
        y63.a m176555x5a5dd5d = f17 == null ? null : f17.m176555x5a5dd5d();
        y63.a I = x63.g.I(activityC16081x2d23fdab.B, f17, c01.z1.r(), true, false);
        if (I.P) {
            x63.g.z(I);
        }
        if (f17 != null && f17.f66134xf102adeb == 0 && I.N.size() > 1) {
            ((t63.e) i95.n0.c(t63.e.class)).Ai().b(I, c01.z1.r(), activityC16081x2d23fdab.D);
        }
        I.f66139x3647780e = c01.id.e();
        x63.g.K(I, f17 != null, false);
        int i17 = activityC16081x2d23fdab.H;
        if ((i17 == 4 || i17 == 5) || (activityC16081x2d23fdab.F && f17 != null)) {
            t63.e eVar = (t63.e) i95.n0.c(t63.e.class);
            java.lang.String str6 = activityC16081x2d23fdab.D;
            y63.a aVar3 = activityC16081x2d23fdab.B;
            boolean z18 = f17 == null;
            eVar.getClass();
            java.lang.String j17 = x63.g.j(aVar3);
            ot0.q qVar = new ot0.q();
            qVar.f430187f = j17;
            qVar.f430199i = 53;
            qVar.f430254v2 = new android.util.Pair(I.f66138x4b6e619a, x63.g.a(j17, I, z17));
            if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).rj(qVar.f430199i, str6)) {
                l15.c cVar = new l15.c();
                cVar.m126728xdc93280d(ot0.q.u(qVar, null, null));
                qu.c cVar2 = new qu.c(str6, cVar, null);
                cVar2.f448248q = I;
                cVar2.f448249r = z18;
                cVar2.f448250s = 2;
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).uj(new qu.b(cVar2));
                pair = new android.util.Pair(-1L, "");
            } else {
                ((ez.w0) ot0.j1.a()).getClass();
                android.util.Pair I2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", str6, "", null);
                if (!z18 || I2.first == null || I2.second == null) {
                    str = j17;
                    str2 = str6;
                    if (!z18) {
                        ((t63.e) i95.n0.c(t63.e.class)).Ai().i(I, m176555x5a5dd5d, 2);
                    }
                } else {
                    str = j17;
                    ((t63.e) i95.n0.c(t63.e.class)).Ai().a(((java.lang.Long) I2.second).longValue(), I, m176555x5a5dd5d, false, 2);
                    str2 = str6;
                }
                if (I2.first != null && (obj = I2.second) != null) {
                    x63.g.L(((java.lang.Long) obj).longValue(), c01.z1.r(), I, str2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.PluginGroupSolitaire", "sendGroupSolitatire() ret:%s lossOrig:%s", I2, java.lang.Boolean.valueOf(z17));
                java.lang.Object obj3 = I2.second;
                pair = new android.util.Pair(java.lang.Long.valueOf(obj3 != null ? ((java.lang.Long) obj3).longValue() : -1L), str);
            }
        } else {
            t63.e eVar2 = (t63.e) i95.n0.c(t63.e.class);
            java.lang.String str7 = activityC16081x2d23fdab.D;
            boolean z19 = activityC16081x2d23fdab.F;
            eVar2.getClass();
            java.lang.String j18 = x63.g.j(I);
            ot0.q qVar2 = new ot0.q();
            qVar2.f430187f = j18;
            qVar2.f430199i = 53;
            qVar2.f430254v2 = new android.util.Pair(I.f66138x4b6e619a, x63.g.a(j18, I, z17));
            if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).rj(qVar2.f430199i, str7)) {
                l15.c cVar3 = new l15.c();
                cVar3.m126728xdc93280d(ot0.q.u(qVar2, null, null));
                qu.c cVar4 = new qu.c(str7, cVar3, null);
                cVar4.f448248q = I;
                cVar4.f448249r = z19;
                cVar4.f448250s = 2;
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).uj(new qu.b(cVar4));
                pair = new android.util.Pair(-1L, "");
            } else {
                ((ez.w0) ot0.j1.a()).getClass();
                android.util.Pair I3 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar2, "", "", str7, "", null);
                if (!z19 || I3.first == null || I3.second == null) {
                    str3 = str7;
                    str4 = "MicroMsg.groupsolitaire.PluginGroupSolitaire";
                    if (!z19) {
                        ((t63.e) i95.n0.c(t63.e.class)).Ai().i(I, m176555x5a5dd5d, 2);
                    }
                } else {
                    str3 = str7;
                    str4 = "MicroMsg.groupsolitaire.PluginGroupSolitaire";
                    ((t63.e) i95.n0.c(t63.e.class)).Ai().a(((java.lang.Long) I3.second).longValue(), I, m176555x5a5dd5d, false, 2);
                }
                if (I3.first != null && (obj2 = I3.second) != null) {
                    x63.g.L(((java.lang.Long) obj2).longValue(), c01.z1.r(), I, str3);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "sendGroupSolitatire() ret:%s", I3);
                java.lang.Object obj4 = I3.second;
                pair = new android.util.Pair(java.lang.Long.valueOf(obj4 != null ? ((java.lang.Long) obj4).longValue() : -1L), j18);
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_group_solitatire_content", (java.lang.String) pair.second);
        activityC16081x2d23fdab.setResult(-1, intent);
        if (((java.lang.Long) pair.first).longValue() >= 0) {
            if (I.f66140xd09be28e == 0) {
                x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
                long longValue = ((java.lang.Long) pair.first).longValue();
                y63.a aVar4 = activityC16081x2d23fdab.B;
                int i18 = activityC16081x2d23fdab.H;
                int i19 = i18 == 3 || i18 == 4 ? 3 : i18;
                boolean z27 = activityC16081x2d23fdab.F;
                Ai.getClass();
                if (longValue >= 0 && aVar4 != null) {
                    x63.n nVar = new x63.n(Ai);
                    nVar.f533792a = aVar4.f66142xdec927b;
                    nVar.f533793b = i19;
                    nVar.f533795d = aVar4.f66138x4b6e619a;
                    if (z27) {
                        nVar.f533794c = 2L;
                    } else {
                        nVar.f533794c = 1L;
                    }
                    Ai.f533801c.put(java.lang.Long.valueOf(longValue), nVar);
                }
            } else {
                x63.p Ai2 = ((t63.e) i95.n0.c(t63.e.class)).Ai();
                int i27 = activityC16081x2d23fdab.H;
                if (i27 == 3 || i27 == 4) {
                    i27 = 3;
                }
                Ai2.g(I, i27, 3, activityC16081x2d23fdab.F);
            }
        }
        activityC16081x2d23fdab.finish();
    }

    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab, boolean z17) {
        android.view.View view = activityC16081x2d23fdab.f223766v;
        if (view == null) {
            return;
        }
        activityC16081x2d23fdab.A = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) view).getSelectionStart();
        int height = ((android.view.WindowManager) activityC16081x2d23fdab.getSystemService("window")).getDefaultDisplay().getHeight();
        activityC16081x2d23fdab.f223766v.getGlobalVisibleRect(activityC16081x2d23fdab.Q);
        android.graphics.Rect rect = activityC16081x2d23fdab.Q;
        if (rect.bottom > height) {
            rect.bottom = height;
        }
        int height2 = ((activityC16081x2d23fdab.f223770z + activityC16081x2d23fdab.f223761q.getHeight()) - (height - activityC16081x2d23fdab.Q.bottom)) + (com.p314xaae8f345.mm.ui.b4.c(activityC16081x2d23fdab) ? com.p314xaae8f345.mm.ui.bk.j(activityC16081x2d23fdab) + 0 : 0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC16081x2d23fdab.f223765u.getLayoutParams();
        activityC16081x2d23fdab.f223761q.getHeight();
        int i17 = activityC16081x2d23fdab.Q.bottom;
        if (!z17) {
            layoutParams.height = 0;
            activityC16081x2d23fdab.f223765u.setLayoutParams(layoutParams);
            return;
        }
        if (i17 <= height - (activityC16081x2d23fdab.f223770z + activityC16081x2d23fdab.f223761q.getHeight()) || activityC16081x2d23fdab.f223770z == 0) {
            return;
        }
        if (activityC16081x2d23fdab.f223760p.isShown()) {
            activityC16081x2d23fdab.f223760p.getGlobalVisibleRect(activityC16081x2d23fdab.P);
        } else {
            activityC16081x2d23fdab.f223757m.getGlobalVisibleRect(activityC16081x2d23fdab.P);
        }
        android.graphics.Rect rect2 = activityC16081x2d23fdab.P;
        if (rect2.bottom > height) {
            rect2.bottom = height;
        }
        layoutParams.height = (height - rect2.bottom) + height2;
        activityC16081x2d23fdab.f223765u.setLayoutParams(layoutParams);
        activityC16081x2d23fdab.f223765u.postDelayed(new z63.d0(activityC16081x2d23fdab, height2), 100L);
    }

    public final void U6(java.lang.String str) {
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) this.f223766v).requestFocus();
        this.f223758n.postDelayed(new z63.c0(this), 200L);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) this.f223766v).getText().insert(this.A, str + "; ");
    }

    public final void X6(boolean z17) {
        y63.b bVar = new y63.b();
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.biq, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gud)).setText((this.B.N.size() + 1) + "");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) inflate.findViewById(com.p314xaae8f345.mm.R.id.guc);
        java.lang.CharSequence b76 = b7(c01.z1.r(), false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(b76)) {
            c22621x7603e017.setText(((java.lang.Object) b76) + " ");
            bVar.f541189e = ((java.lang.Object) b76) + "";
        }
        bVar.f541185a = c01.z1.r();
        y63.a aVar = this.B;
        bVar.f541187c = aVar.K;
        bVar.f541190f = aVar.N.size() + 1;
        c22621x7603e017.setTag(com.p314xaae8f345.mm.R.id.guj, 3);
        c22621x7603e017.setTag(com.p314xaae8f345.mm.R.id.guh, bVar);
        c22621x7603e017.requestFocus();
        c22621x7603e017.setFocusable(true);
        c22621x7603e017.setFocusableInTouchMode(true);
        c22621x7603e017.addTextChangedListener(this.S);
        c22621x7603e017.setOnTouchListener(this.T);
        c22621x7603e017.setOnFocusChangeListener(new z63.g0(this, c22621x7603e017));
        c22621x7603e017.setMaxLines(10);
        java.util.HashMap hashMap = this.B.N;
        hashMap.put(java.lang.Integer.valueOf(hashMap.size() + 1), bVar);
        this.f223758n.addView(inflate);
        this.M.add(inflate);
        inflate.post(new z63.u(this));
        g7(z17);
    }

    public void Y6(int i17) {
        android.view.View view = this.f223766v;
        int i18 = 0;
        if (view == null || !(view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017)) {
            ((t63.e) i95.n0.c(t63.e.class)).Ai().d(this.B, i17, 0);
            return;
        }
        int intValue = ((java.lang.Integer) ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) view).getTag(com.p314xaae8f345.mm.R.id.guj)).intValue();
        int i19 = 1;
        if (intValue != 1) {
            i19 = 3;
            if (intValue != 2) {
                if (intValue == 3) {
                    i18 = 4;
                } else if (intValue == 4) {
                    i18 = 2;
                }
                ((t63.e) i95.n0.c(t63.e.class)).Ai().d(this.B, i17, i18);
            }
        }
        i18 = i19;
        ((t63.e) i95.n0.c(t63.e.class)).Ai().d(this.B, i17, i18);
    }

    public final android.util.Pair Z6() {
        java.util.HashSet hashSet = new java.util.HashSet();
        boolean z17 = true;
        for (int i17 = 1; i17 <= this.C.N.size(); i17++) {
            y63.b bVar = (y63.b) this.C.N.get(java.lang.Integer.valueOf(i17));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(bVar.f541185a, c01.z1.r())) {
                hashSet.add(bVar);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (int i18 = 1; i18 <= this.B.N.size(); i18++) {
            y63.b bVar2 = (y63.b) this.B.N.get(java.lang.Integer.valueOf(i18));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(bVar2.f541185a, c01.z1.r()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar2.f541189e.trim())) {
                arrayList.add(bVar2);
                hashSet2.add(bVar2);
            }
        }
        boolean z18 = false;
        if (hashSet.size() == arrayList.size()) {
            boolean z19 = arrayList.size() != hashSet2.size();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (!hashSet.contains((y63.b) it.next())) {
                    break;
                }
            }
            z18 = z19;
        }
        return new android.util.Pair(java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    public final int a7(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        if (this.f223770z == 0) {
            return 10;
        }
        int height = ((android.view.WindowManager) getSystemService("window")).getDefaultDisplay().getHeight();
        float height2 = (height - ((this.f223770z + this.f223761q.getHeight()) + com.p314xaae8f345.mm.ui.zk.a(this, 145))) / c22621x7603e017.getLineHeight();
        if (height2 <= 0.0f) {
            height2 = 10.0f;
        }
        return (int) height2;
    }

    public final java.lang.CharSequence b7(java.lang.String str, boolean z17) {
        java.lang.String z07;
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
            java.lang.String d17 = n17.d1();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.E;
            z07 = a3Var == null ? null : a3Var.z0(d17);
        } else {
            z07 = n17.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.f2();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.d1();
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((ke0.e) xVar).getClass();
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, z07);
    }

    public final boolean c7() {
        if (this.f223750J) {
            db5.e1.D(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsj), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsi), getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsh), false, new z63.p(this), new z63.q(this), com.p314xaae8f345.mm.R.C30859x5a72f63.a2y);
        } else {
            x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
            y63.a aVar = this.B;
            int i17 = this.H;
            if (i17 == 3 || i17 == 4) {
                i17 = 3;
            }
            Ai.g(aVar, i17, 1, this.F);
            finish();
        }
        return true;
    }

    public final void d7() {
        if (this.f223751d.findFocus() == null) {
            return;
        }
        android.view.View findFocus = this.f223751d.findFocus();
        this.f223766v = findFocus;
        this.A = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findFocus).getSelectionStart();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f223767w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        super.dispatchTouchEvent(motionEvent);
        return false;
    }

    public final void e7() {
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(this, "android.permission.ACCESS_FINE_LOCATION", true)) {
                if (!((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                    c71.b.c(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()), 30764, true);
                    return;
                } else {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
                    return;
                }
            }
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(this, "android.permission.ACCESS_FINE_LOCATION", 64, null, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "summerper checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(a17));
            if (!a17) {
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
        intent.putExtra("map_view_type", 3);
        j45.l.n(this, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, 4097);
    }

    public final void f7(int i17) {
        if (this.I) {
            this.f223759o.setVisibility(8);
        } else {
            this.f223759o.setVisibility(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        try {
            mo48674x36654fab();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "finish() hideVKB() %s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public final void g7(boolean z17) {
        boolean z18;
        int i17 = 1;
        while (true) {
            if (i17 > this.B.N.size()) {
                z18 = false;
                break;
            }
            y63.b bVar = (y63.b) this.B.N.get(java.lang.Integer.valueOf(i17));
            if (bVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f541189e.trim())) {
                z18 = true;
                break;
            }
            i17++;
        }
        if (!this.F) {
            android.util.Pair Z6 = Z6();
            boolean booleanValue = ((java.lang.Boolean) Z6.first).booleanValue();
            boolean booleanValue2 = ((java.lang.Boolean) Z6.second).booleanValue();
            if (z18 && (booleanValue || booleanValue2)) {
                m78500x43e00957(0, true);
                if (z17) {
                    return;
                }
                this.f223750J = true;
                return;
            }
            m78500x43e00957(0, false);
            if (z17) {
                return;
            }
            this.f223750J = false;
            return;
        }
        if (!z18) {
            m78500x43e00957(0, false);
            if (z17) {
                return;
            }
            this.f223750J = false;
            return;
        }
        m78500x43e00957(0, true);
        if (z17) {
            return;
        }
        y63.a aVar = this.C;
        if (aVar != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.B.H, aVar.H) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.B.I, this.C.I) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.B.f541184J, this.C.f541184J)) {
            android.util.Pair Z62 = Z6();
            boolean booleanValue3 = ((java.lang.Boolean) Z62.first).booleanValue();
            boolean booleanValue4 = ((java.lang.Boolean) Z62.second).booleanValue();
            if (!booleanValue3 && !booleanValue4) {
                if (z17) {
                    return;
                }
                this.f223750J = false;
                return;
            }
        }
        if (z17) {
            return;
        }
        this.f223750J = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bir;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0512  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) this.f223766v).requestFocus();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onActivityResult reqCode: %d, retCod: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            return;
        }
        if (i17 != 4097) {
            if (i17 != 4098) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "REQUEST_CODE_POST_CONTACT");
            z63.g gVar = this.R;
            if (gVar != null) {
                gVar.a();
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Kwebmap_locaion");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("kPoiName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "REQUEST_CODE_POST_LOC address: %s, poiName：%s", stringExtra, stringExtra2);
        if (stringExtra.contains(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fse))) {
            stringExtra = stringExtra.substring(stringExtra.indexOf(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fse)) + 1);
        }
        U6(stringExtra2 + "(" + stringExtra + ")");
        Y6(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "key_group_solitatire_create"
            r1 = 0
            boolean r7 = r7.getBooleanExtra(r0, r1)
            r6.F = r7
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "key_group_solitatire_key"
            java.lang.String r7 = r7.getStringExtra(r0)
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r2 = "key_group_solitatire_chatroom_username"
            java.lang.String r0 = r0.getStringExtra(r2)
            r6.D = r0
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r2 = "key_group_solitatire_scene"
            r3 = 3
            int r0 = r0.getIntExtra(r2, r3)
            r6.H = r0
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r2 = "KEY_GROUP_SOLITATIRE_READ_ONLY"
            boolean r0 = r0.getBooleanExtra(r2, r1)
            r6.I = r0
            int r0 = r6.H
            r2 = 1
            java.lang.Class<t63.e> r4 = t63.e.class
            if (r0 == r3) goto L64
            r3 = 4
            if (r0 == r3) goto L4f
            r3 = 5
            if (r0 != r3) goto L4d
            goto L4f
        L4d:
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            if (r0 == 0) goto L53
            goto L64
        L53:
            i95.m r0 = i95.n0.c(r4)
            t63.e r0 = (t63.e) r0
            x63.j r0 = r0.wi()
            java.lang.String r3 = r6.D
            y63.a r0 = r0.f(r3, r7)
            goto L87
        L64:
            i95.m r0 = i95.n0.c(r4)
            t63.e r0 = (t63.e) r0
            x63.j r0 = r0.wi()
            java.lang.String r3 = r6.D
            java.util.concurrent.ConcurrentHashMap r0 = r0.f533776d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            java.lang.Object r0 = r0.get(r3)
            y63.a r0 = (y63.a) r0
        L87:
            java.lang.String r3 = "MicroMsg.groupsolitaire.GroupSolitatireEditUI"
            if (r0 != 0) goto L98
            java.lang.String r0 = "initData() key:%s temp == null"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0, r7)
            r6.finish()
            goto Ldd
        L98:
            y63.a r0 = r0.m176555x5a5dd5d()
            r6.B = r0
            if (r0 != 0) goto Lad
            java.lang.String r0 = "initData() key:%s mGroupSolitatire == null"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0, r7)
            r6.finish()
            goto Ldd
        Lad:
            i95.m r7 = i95.n0.c(r4)
            t63.e r7 = (t63.e) r7
            x63.j r7 = r7.wi()
            java.lang.String r0 = r6.D
            y63.a r3 = r6.B
            java.lang.String r3 = r3.f66138x4b6e619a
            y63.a r7 = r7.f(r0, r3)
            r6.C = r7
            java.lang.Class<rv1.f> r7 = rv1.f.class
            lm0.a r7 = gm0.j1.s(r7)
            rv1.f r7 = (rv1.f) r7
            qv1.a r7 = (qv1.a) r7
            com.tencent.mm.storage.b3 r7 = r7.a()
            java.lang.String r0 = r6.D
            com.tencent.mm.storage.a3 r7 = r7.z0(r0)
            r6.E = r7
            r6.setResult(r1)
            r1 = r2
        Ldd:
            if (r1 != 0) goto Le0
            return
        Le0:
            r6.mo43517x10010bd5()
            android.content.res.Resources r7 = r6.getResources()
            r0 = 2131102740(0x7f060c14, float:1.7817926E38)
            int r7 = r7.getColor(r0)
            r6.mo78578x8b18f126(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        if (this.G) {
            return true;
        }
        c7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f223768x;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onRequestPermissionsResult");
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        if (iArr[0] == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onRequestPermissionsResult OK");
            e7();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onRequestPermissionsResult failed");
            db5.e1.C(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhg), false, new z63.b0(this), null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f223752e.post(new z63.s(this));
        int i17 = this.H;
        if (i17 != 2) {
            if (!(i17 == 3 || i17 == 4) && i17 != 5) {
                return;
            }
        }
        this.f223758n.postDelayed(new z63.t(this), 200L);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        android.animation.ObjectAnimator ofFloat;
        boolean z18 = this.G;
        if (i17 > 0) {
            this.G = true;
        } else {
            this.G = false;
        }
        if (!z18 && this.G) {
            java.util.Iterator it = this.M.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setTag(null);
            }
        }
        if (i17 != 0) {
            this.f223770z = i17;
        }
        if (this.F) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f223755h;
            c22621x7603e017.setMaxLines(a7(c22621x7603e017));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f223760p;
            c22621x7603e0172.setMaxLines(a7(c22621x7603e0172));
        }
        android.view.View view = this.f223766v;
        if (view != null) {
            if (this.G) {
                view.postDelayed(new z63.x(this), 100L);
            } else {
                view.post(new z63.w(this));
            }
        }
        if (this.G) {
            if (this.f223761q.getTranslationY() != 0.0f) {
                this.f223761q.setTranslationY(0.0f);
            }
            ofFloat = android.animation.ObjectAnimator.ofFloat(this.f223761q, "translationY", 0.0f, -this.f223770z);
        } else {
            android.widget.LinearLayout linearLayout = this.f223761q;
            ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, "translationY", linearLayout.getTranslationY(), 0.0f);
        }
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(new y3.b());
        ofFloat.addListener(new z63.z(this));
        ofFloat.start();
        d7();
        android.view.View view2 = this.f223766v;
        if (view2 == null) {
            return;
        }
        view2.postDelayed(new z63.a0(this), 50L);
    }
}
