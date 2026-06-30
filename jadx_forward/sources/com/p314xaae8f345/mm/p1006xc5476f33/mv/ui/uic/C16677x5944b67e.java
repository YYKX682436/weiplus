package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC */
/* loaded from: classes10.dex */
public final class C16677x5944b67e extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public r45.hf2 f232532d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i f232533e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f232534f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f232535g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f232536h;

    /* renamed from: i, reason: collision with root package name */
    public long f232537i;

    /* renamed from: m, reason: collision with root package name */
    public long f232538m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f232539n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k f232540o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f232541p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f232542q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f232543r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f232544s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f232545t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f232546u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16677x5944b67e(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        new java.util.HashMap();
        this.f232540o = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t7(this, activity);
        this.f232541p = new java.util.HashMap();
        this.f232542q = new java.util.HashMap();
        this.f232543r = new java.util.HashMap();
        this.f232544s = new java.util.HashMap();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f232545t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC$musicCheckErrorListener$1
            {
                this.f39173x3fe91575 = -1443570203;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5 c5721xb5961bd5) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5 event = c5721xb5961bd5;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", "musicCheckErrorListener check error");
                am.ik ikVar = event.f136044g;
                if (ikVar.f88489a == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mv.MusicMvSongInfoUIC", "musicCheckErrorListener, must has error.");
                    return false;
                }
                java.lang.String string = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ikVar.f88490b) ? ikVar.f88490b : p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4e);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e = this;
                c16677x5944b67e.f232534f = db5.e1.y(c16677x5944b67e.m80379x76847179(), string, "", c16677x5944b67e.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.u7(c16677x5944b67e));
                return true;
            }
        };
        this.f232546u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC$musicPlayerListener$1
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                fm3.u uVar;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 event = c5722xb16ab0f4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MusicPlayerEvent, action:");
                am.jk jkVar = event.f136045g;
                sb6.append(jkVar.f88569b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", sb6.toString());
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                pf5.z zVar = pf5.z.f435481a;
                if (!((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).R6(jkVar.f88570c)) {
                    return false;
                }
                int i17 = jkVar.f88569b;
                if (i17 == 0) {
                    pk4.c cVar = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class)).f232516p;
                    if (cVar == null) {
                        return false;
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).f();
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e = this;
                if (i17 == 1) {
                    pk4.c cVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class)).f232516p;
                    if (cVar2 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar2).c();
                    }
                    c16677x5944b67e.Q6();
                    c16677x5944b67e.R6();
                    c16677x5944b67e.S6();
                    return false;
                }
                if (i17 != 2 && i17 != 3 && i17 != 4) {
                    if (i17 != 7) {
                        return false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e.O6(c16677x5944b67e, c16677x5944b67e.f232536h);
                    return false;
                }
                pk4.c cVar3 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class)).f232516p;
                if (cVar3 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar3).a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class);
                lm3.e eVar = (lm3.e) kz5.n0.a0(c16668xffb9dd68.f232510g, c16668xffb9dd68.f232515o);
                if (eVar != null && (uVar = eVar.f401015d) != null) {
                    uVar.f345677x++;
                }
                c16677x5944b67e.T6();
                c16677x5944b67e.U6();
                c16677x5944b67e.P6();
                return false;
            }
        };
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e c16677x5944b67e, android.view.View view) {
        android.view.View findViewById;
        android.view.View findViewById2;
        c16677x5944b67e.getClass();
        ka0.o0 o0Var = (ka0.o0) i95.n0.c(ka0.o0.class);
        b21.r b17 = b21.m.b();
        java.lang.String str = b17 != null ? b17.P : null;
        ((ja0.i0) o0Var).getClass();
        java.lang.Integer num = (java.lang.Integer) ml3.c.f409935d.get(str);
        if (num != null && num.intValue() == 2) {
            ka0.o0 o0Var2 = (ka0.o0) i95.n0.c(ka0.o0.class);
            b21.r b18 = b21.m.b();
            java.lang.String str2 = b18 != null ? b18.P : null;
            ((ja0.i0) o0Var2).getClass();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.Boolean) ml3.c.f409936e.get(str2), java.lang.Boolean.TRUE)) {
                ((ja0.c0) ((ka0.h0) i95.n0.c(ka0.h0.class))).getClass();
                ll3.b1 b1Var = ll3.b1.f400673a;
                ll3.b1.f400674b.f400690u = true;
                if ((view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.ojy) : null) == null) {
                    return;
                }
                int i17 = 0;
                if (!c16677x5944b67e.f232539n) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(150L);
                    int width = (view == null || (findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.ojy)) == null) ? 0 : findViewById2.getWidth();
                    if (view != null && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.ojz)) != null) {
                        i17 = findViewById.getWidth();
                    }
                    ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
                    ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v7(width, i17, view));
                    ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w7(view, c16677x5944b67e));
                    ofFloat.start();
                    return;
                }
                android.view.View findViewById3 = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.gsl) : null;
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view2 = findViewById3;
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById4 = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.gsl) : null;
                if (findViewById4 == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                android.view.View view3 = findViewById4;
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    public final void P6() {
        java.util.Collection values = this.f232542q.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((java.lang.ref.WeakReference) it.next()).get();
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.setVisibility(8);
            }
        }
        java.util.Collection<java.lang.ref.WeakReference> values2 = this.f232543r.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
        for (java.lang.ref.WeakReference weakReference : values2) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01) weakReference.get();
            if (c16692x9f29da01 != null) {
                c16692x9f29da01.setVisibility(4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da012 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01) weakReference.get();
            if (c16692x9f29da012 != null) {
                c16692x9f29da012.c();
            }
        }
    }

    public final void Q6() {
        java.util.Collection values = this.f232544s.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((java.lang.ref.WeakReference) it.next()).get();
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
        }
    }

    public final void R6() {
        java.util.Collection values = this.f232541p.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d) ((java.lang.ref.WeakReference) it.next()).get();
            if (c16639xd269873d != null) {
                c16639xd269873d.setVisibility(8);
            }
        }
    }

    public final void S6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class)).f232957r) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class)).f232964y) {
                java.util.Collection values = this.f232542q.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                java.util.Iterator it = values.iterator();
                while (it.hasNext()) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((java.lang.ref.WeakReference) it.next()).get();
                    if (c1163xf1deaba4 != null) {
                        c1163xf1deaba4.setVisibility(0);
                    }
                }
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) pf5.z.f435481a.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class)).f232964y) {
            java.util.Collection<java.lang.ref.WeakReference> values2 = this.f232543r.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
            for (java.lang.ref.WeakReference weakReference : values2) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01) weakReference.get();
                if (c16692x9f29da01 != null) {
                    c16692x9f29da01.setVisibility(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da012 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01) weakReference.get();
                if (c16692x9f29da012 != null) {
                    c16692x9f29da012.d();
                }
            }
        }
    }

    public final void T6() {
        java.util.Collection values = this.f232544s.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((java.lang.ref.WeakReference) it.next()).get();
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
        }
    }

    public final void U6() {
        java.util.Collection values = this.f232541p.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d c16639xd269873d = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16639xd269873d) ((java.lang.ref.WeakReference) it.next()).get();
            if (c16639xd269873d != null) {
                c16639xd269873d.setVisibility(0);
            }
        }
    }

    public final void V6(android.view.View view) {
        ka0.o0 o0Var = (ka0.o0) i95.n0.c(ka0.o0.class);
        b21.r b17 = b21.m.b();
        java.lang.String str = b17 != null ? b17.P : null;
        ((ja0.i0) o0Var).getClass();
        java.lang.Integer num = (java.lang.Integer) ml3.c.f409935d.get(str);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a17;
        if ((num != null && num.intValue() == 2) || n0Var.f232857z == 2) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.ojy);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showTryListenIcon", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showTryListenIcon", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f232535g = true;
            if (j65.c.f(i65.a.n(m80379x76847179())) >= 6) {
                android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.gsl);
                android.widget.TextView textView = findViewById2 instanceof android.widget.TextView ? (android.widget.TextView) findViewById2 : null;
                if (textView != null) {
                    textView.setText(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5l));
                }
                android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.gsm);
                android.widget.TextView textView2 = findViewById3 instanceof android.widget.TextView ? (android.widget.TextView) findViewById3 : null;
                if (textView2 != null) {
                    textView2.setText(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5l));
                }
            }
            ka0.o0 o0Var2 = (ka0.o0) i95.n0.c(ka0.o0.class);
            b21.r b18 = b21.m.b();
            java.lang.String str2 = b18 != null ? b18.P : null;
            ((ja0.i0) o0Var2).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.Boolean) ml3.c.f409936e.get(str2), java.lang.Boolean.TRUE);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232854w) {
                view.post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x7(this, view));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            android.view.View contentView = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.class)).f232642g.getContentView();
            if (contentView == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", "onCreate");
        this.f232545t.mo48813x58998cd();
        this.f232546u.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f232534f;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        this.f232545t.mo48814x2efc64();
        this.f232546u.mo48814x2efc64();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.class)).f232642g.a();
        kl3.t.g().f(this.f232540o);
        ((ja0.i0) ((ka0.o0) i95.n0.c(ka0.o0.class))).getClass();
        ml3.c.f409937f = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        kl3.t.g().f(this.f232540o);
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        kl3.t g17 = kl3.t.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k kVar = this.f232540o;
        rl3.b bVar = (rl3.b) g17.a();
        if (kVar == null) {
            bVar.getClass();
            return;
        }
        java.util.LinkedList linkedList = bVar.f478768j;
        if (linkedList.contains(kVar)) {
            return;
        }
        linkedList.add(kVar);
    }
}
