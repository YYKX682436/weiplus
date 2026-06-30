package lm3;

/* loaded from: classes10.dex */
public final class f extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final in5.s0 f401016d;

    /* renamed from: e, reason: collision with root package name */
    public final lm3.e f401017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f401018f;

    public f(lm3.b0 b0Var, in5.s0 holder, lm3.e item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f401018f = b0Var;
        this.f401016d = holder;
        this.f401017e = item;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 a(in5.s0 s0Var, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(s0Var.f374654e);
        c22699x3dcdb352.setVisibility(4);
        android.content.Context context = s0Var.f374654e;
        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.gravity = 17;
        c22699x3dcdb352.setLayoutParams(layoutParams);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79160x8dce826e);
        c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77890x91ab89a5));
        viewGroup.addView(c22699x3dcdb352);
        return c22699x3dcdb352;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        in5.s0 s0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvItemConvert", "onDoubleTap");
        fm3.t tVar = fm3.u.A;
        lm3.e eVar = this.f401017e;
        boolean e18 = tVar.e(eVar.f401015d);
        uw2.h0 h0Var = uw2.h0.f513207a;
        lm3.b0 b0Var = this.f401018f;
        in5.s0 s0Var2 = this.f401016d;
        if (e18) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var2.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ghl);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
            s0Var = s0Var2;
            uw2.h0.p(h0Var, a(s0Var2, viewGroup), 1.4f, e17, true, viewGroup.getY(), 0L, 32, null);
            if (!eVar.f401015d.f345667n) {
                lm3.b0.n(b0Var, s0Var, eVar, 2);
                b0Var.s(s0Var, eVar);
            }
        } else {
            s0Var = s0Var2;
        }
        if (b0Var.f401006h) {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ghl);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
            uw2.h0.p(h0Var, a(s0Var, viewGroup2), 1.4f, e17, true, viewGroup2.getY(), 0L, 32, null);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.f401003e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a17;
            b0Var.getClass();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.h6l);
            boolean z17 = !n0Var.D;
            if (z17) {
                n0Var.D = z17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3.F;
                if (z17) {
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79774xc850a2af);
                    c22699x3dcdb352.m82040x7541828(s0Var.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
                    h2Var.a(n0Var.f232843i, 1L, 1L);
                } else {
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79774xc850a2af);
                    c22699x3dcdb352.m82040x7541828(s0Var.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                    h2Var.a(n0Var.f232843i, 2L, 1L);
                }
                android.widget.TextView textView = (android.widget.TextView) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.i1i);
                if (z17) {
                    int i17 = n0Var.C + 1;
                    n0Var.C = i17;
                    textView.setText(b0Var.o(i17));
                } else {
                    int i18 = n0Var.C;
                    if (i18 <= 1 || z17) {
                        textView.setText(s0Var.f3639x46306858.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3y));
                    } else {
                        int i19 = i18 - 1;
                        n0Var.C = i19;
                        textView.setText(b0Var.o(i19));
                    }
                }
                fv2.f fVar = new fv2.f(new iv2.b(n0Var.A, n0Var.B));
                int i27 = z17 ? 1 : 2;
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                r45.a13 a13Var = new r45.a13();
                iv2.b bVar = fVar.f348507m;
                a13Var.f451165f = bVar.f376658a;
                a13Var.f451166g = bVar.f376659b;
                a13Var.f451172p = null;
                a13Var.f451163d = db2.t4.f309704a.a(6989);
                a13Var.f451164e = java.lang.System.currentTimeMillis();
                a13Var.f451169m = i27;
                lVar.f152197a = a13Var;
                lVar.f152198b = new r45.b13();
                lVar.f152199c = "/cgi-bin/micromsg-bin/finderunilike";
                lVar.f152200d = 6989;
                fVar.p(lVar.a());
                fVar.l();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        super.onLongPress(e17);
        lm3.b0 b0Var = this.f401018f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.f401003e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.e4 e4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.class)).f232642g;
        if (e4Var.isShowing()) {
            e4Var.dismiss();
        }
        lm3.e eVar = this.f401017e;
        fm3.u musicMv = eVar.f401015d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
        int i17 = musicMv.f345669p;
        boolean z17 = true;
        if (i17 != 1 && i17 != 4) {
            z17 = false;
        }
        if (z17) {
            in5.s0 s0Var = this.f401016d;
            s0Var.f3639x46306858.performHapticFeedback(0, 2);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = b0Var.f401003e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7.class)).O6(s0Var, eVar.f401015d, 3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        pk4.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvItemConvert", "onSingleTapConfirmed");
        lm3.b0 b0Var = this.f401018f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.f401003e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232851t;
        in5.s0 s0Var = this.f401016d;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = b0Var.f401003e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232851t = false;
            lm3.e eVar = this.f401017e;
            b0Var.r(s0Var, eVar);
            b0Var.p(s0Var, eVar);
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = b0Var.f401003e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            pf5.z zVar = pf5.z.f435481a;
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a17;
            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e) a18;
            boolean i17 = kl3.t.g().a().i();
            fm3.j0 j0Var = fm3.j0.f345611a;
            if (i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvItemConvert", "onSingleTap, stop music");
                b21.m.f();
                j0Var.k(activity3, n0Var.f232843i, 2);
                r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity3, 7, r45.bt4.class);
                if (bt4Var != null) {
                    bt4Var.f452579q = android.os.SystemClock.elapsedRealtime();
                }
                r45.bt4 bt4Var2 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity3, 7, r45.bt4.class);
                java.lang.Integer valueOf = bt4Var2 != null ? java.lang.Integer.valueOf(bt4Var2.f452581s + 1) : null;
                r45.bt4 bt4Var3 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity3, 7, r45.bt4.class);
                if (bt4Var3 != null) {
                    bt4Var3.f452581s = valueOf.intValue();
                }
                c16677x5944b67e.T6();
                c16677x5944b67e.U6();
                c16677x5944b67e.P6();
                android.view.KeyEvent.Callback findViewById = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k0o);
                cVar = findViewById instanceof pk4.c ? (pk4.c) findViewById : null;
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).a();
                }
            } else {
                if (kl3.t.g().a().g()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class)).c7(s0Var.m8183xf806b362());
                    kl3.t.g().a().mo67221xc84dc82d();
                } else {
                    kl3.t.g().d(b21.m.b());
                }
                c16677x5944b67e.Q6();
                c16677x5944b67e.R6();
                c16677x5944b67e.S6();
                android.view.KeyEvent.Callback findViewById2 = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k0o);
                cVar = findViewById2 instanceof pk4.c ? (pk4.c) findViewById2 : null;
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).c();
                }
                j0Var.k(activity3, n0Var.f232843i, 1);
                r45.bt4 bt4Var4 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity3, 7, r45.bt4.class);
                if (bt4Var4 != null) {
                    long j17 = bt4Var4.f452579q;
                    if (j17 > 0) {
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvItemConvert", "accumulate pauseTime:" + elapsedRealtime);
                        bt4Var4.f452578p = bt4Var4.f452578p + elapsedRealtime;
                        bt4Var4.f452579q = -1L;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
