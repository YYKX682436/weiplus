package pk2;

/* loaded from: classes3.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final pk2.g8 f437191a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437192b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f437193c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f437194d;

    /* renamed from: e, reason: collision with root package name */
    public pk2.c7 f437195e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f437196f;

    /* renamed from: g, reason: collision with root package name */
    public kl2.e0 f437197g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 f437198h;

    /* renamed from: i, reason: collision with root package name */
    public o25.y1 f437199i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx f437200j;

    /* renamed from: k, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.f1 f437201k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1 f437202l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f437203m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f437204n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f437205o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f437206p;

    /* renamed from: q, reason: collision with root package name */
    public pk2.p7 f437207q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f437208r;

    /* renamed from: s, reason: collision with root package name */
    public final db5.t4 f437209s;

    /* renamed from: t, reason: collision with root package name */
    public final db5.t4 f437210t;

    /* renamed from: u, reason: collision with root package name */
    public final db5.t4 f437211u;

    /* renamed from: v, reason: collision with root package name */
    public final db5.s4 f437212v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437213w;

    public d9(pk2.o9 o9Var, pk2.g8 livingDep) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(livingDep, "livingDep");
        this.f437213w = o9Var;
        this.f437191a = livingDep;
        this.f437192b = true;
        this.f437203m = new java.util.ArrayList();
        this.f437204n = new java.util.ArrayList();
        this.f437205o = new java.util.ArrayList();
        this.f437206p = new java.util.ArrayList();
        boolean g17 = zl2.q4.f555466a.g();
        this.f437192b = g17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "enableVisitorRoleEntrance:" + g17);
        this.f437209s = new pk2.o8(o9Var, this);
        this.f437210t = new pk2.i8(o9Var, this);
        this.f437211u = new pk2.b9(o9Var, this);
        this.f437212v = new pk2.c9(o9Var);
    }

    public static final void a(pk2.d9 d9Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.view.View view) {
        r45.c03 m76834xb82e7e9f;
        java.lang.String m75945x2fec8307;
        pk2.o9 o9Var = d9Var.f437213w;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
        if (c19792x256d2725 == null || (m76834xb82e7e9f = c19792x256d2725.m76834xb82e7e9f()) == null || (m75945x2fec8307 = m76834xb82e7e9f.m75945x2fec8307(0)) == null) {
            return;
        }
        if (!(m75945x2fec8307.length() > 0)) {
            m75945x2fec8307 = null;
        }
        if (m75945x2fec8307 != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570629b95, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g2u);
            if (textView != null) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                textView.setText(m75945x2fec8307);
            }
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.d1o);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper$LivingMoreActionHelper", "updateReviewWording", "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper$LivingMoreActionHelper", "updateReviewWording", "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (view == null) {
                if (k0Var != null) {
                    k0Var.s(inflate, true);
                    return;
                }
                return;
            }
            pm0.v.B(view);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(abstractActivityC21394xb3d2c0cf);
            linearLayout.setOrientation(1);
            linearLayout.addView(inflate, -1, -2);
            linearLayout.addView(view, -1, -2);
            if (k0Var != null) {
                k0Var.s(linearLayout, true);
            }
        }
    }

    public final void b(qk2.h hVar) {
        ((java.util.ArrayList) this.f437204n).add(hVar);
        qk2.f fVar = this.f437213w.f437619h;
        if (fVar != null) {
            fVar.a(hVar);
        }
    }

    public final void c(qk2.h hVar) {
        ((java.util.ArrayList) this.f437205o).add(hVar);
        qk2.f fVar = this.f437213w.f437619h;
        if (fVar != null) {
            fVar.a(hVar);
        }
    }

    public final void d(qk2.h hVar) {
        ((java.util.ArrayList) this.f437203m).add(hVar);
        qk2.f fVar = this.f437213w.f437619h;
        if (fVar != null) {
            fVar.a(hVar);
        }
    }

    public final void e() {
        android.app.Dialog dialog;
        r45.c03 m76834xb82e7e9f;
        kn0.g gVar;
        r45.ka4 ka4Var;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f437213w.f437611d;
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.x1()) {
            f(abstractActivityC21394xb3d2c0cf);
            return;
        }
        if (r4Var.w1()) {
            f(abstractActivityC21394xb3d2c0cf);
            return;
        }
        boolean z17 = true;
        if (!((mm2.c1) this.f437213w.c(mm2.c1.class)).T) {
            if (!(((mm2.n0) this.f437213w.c(mm2.n0.class)).f410806r)) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f437193c;
                pk2.o9 scene = this.f437213w;
                if (k0Var == null) {
                    pk2.f7 f7Var = new pk2.f7(abstractActivityC21394xb3d2c0cf, 0, true);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
                    f7Var.f437279r2 = scene;
                    this.f437193c = f7Var;
                    f7Var.X1 = scene.h();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f437193c;
                    if (k0Var2 != null) {
                        k0Var2.U1 = true;
                    }
                    if (k0Var2 != null) {
                        k0Var2.V1 = true;
                    }
                }
                if (this.f437199i == null) {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
                    this.f437199i = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
                    r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(abstractActivityC21394xb3d2c0cf, 14, r45.pk5.class);
                    if (pk5Var != null) {
                        pk5Var.f464670i = 8;
                    }
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f437193c;
                if (k0Var3 != null) {
                    k0Var3.f293388d2 = false;
                }
                if (k0Var3 != null) {
                    k0Var3.f293405n = new pk2.t8(this);
                }
                if (k0Var3 != null) {
                    k0Var3.f293407o = new pk2.u8(this, abstractActivityC21394xb3d2c0cf);
                }
                if (k0Var3 != null) {
                    k0Var3.f293409p = new pk2.v8(this, scene);
                }
                if (k0Var3 != null) {
                    k0Var3.f293425z = new pk2.w8(scene);
                }
                db5.t4 t4Var = this.f437209s;
                if (k0Var3 != null) {
                    k0Var3.f293414s = t4Var;
                }
                if (k0Var3 != null) {
                    k0Var3.f293417v = t4Var;
                }
                if (k0Var3 != null) {
                    k0Var3.f293418w = this.f437211u;
                }
                if (k0Var3 != null) {
                    k0Var3.f293419x = this.f437212v;
                }
                if (k0Var3 != null) {
                    k0Var3.p(new pk2.n8(this, scene, abstractActivityC21394xb3d2c0cf));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = this.f437193c;
                if (k0Var4 != null) {
                    k0Var4.v();
                    return;
                }
                return;
            }
        }
        pk2.c7 c7Var = this.f437195e;
        pk2.o9 o9Var = this.f437213w;
        if (c7Var == null) {
            this.f437195e = new pk2.c7(abstractActivityC21394xb3d2c0cf, o9Var.h());
        }
        pk2.c7 c7Var2 = this.f437195e;
        if (c7Var2 != null) {
            int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
            android.widget.TextView textView = c7Var2.a().f213504u;
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
        java.lang.String str = o9Var.f437605a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildAssistantBottomSheet: business(LiveCommonSlice::class.java).liveFinderObject.id:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
        java.lang.String str2 = null;
        sb6.append(c19792x256d2725 != null ? java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()) : null);
        sb6.append(" hlsUrl:");
        kn0.i iVar = ((mm2.e1) o9Var.c(mm2.e1.class)).f410523t;
        sb6.append((iVar == null || (gVar = iVar.f391091b) == null || (ka4Var = gVar.f391081o) == null) ? null : ka4Var.f460092z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.rj((ml2.r0) c17, 11, null, 2, null);
        pk2.c7 c7Var3 = this.f437195e;
        if (c7Var3 != null) {
            c7Var3.f437163m = new pk2.q8(this);
        }
        if (c7Var3 != null) {
            c7Var3.f437164n = new pk2.r8(this);
        }
        if (c7Var3 != null) {
            c7Var3.f437165o = new pk2.s8(this);
        }
        if (c7Var3 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
            if (c19792x256d27252 != null && (m76834xb82e7e9f = c19792x256d27252.m76834xb82e7e9f()) != null) {
                str2 = m76834xb82e7e9f.m75945x2fec8307(0);
            }
            android.view.View findViewById = c7Var3.f437157g.findViewById(com.p314xaae8f345.mm.R.id.tg6);
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            int i17 = z17 ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet", "setTipsWording", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet", "setTipsWording", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.g2u);
            if (textView2 != null) {
                com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                textView2.setText(str2);
            }
            android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.d1o);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet", "setTipsWording", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet", "setTipsWording", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        pk2.c7 c7Var4 = this.f437195e;
        db5.t4 t4Var2 = this.f437209s;
        if (c7Var4 != null) {
            c7Var4.f437159i.f437863e = t4Var2;
        }
        if (c7Var4 != null) {
            c7Var4.f437160j.f437863e = t4Var2;
        }
        if (c7Var4 != null) {
            c7Var4.f437161k.f437863e = t4Var2;
        }
        if (c7Var4 != null) {
            c7Var4.a().f213501r = new pk2.l8(this, o9Var);
        }
        pk2.c7 c7Var5 = this.f437195e;
        if (c7Var5 != null) {
            db5.o4 o4Var = c7Var5.f437163m;
            if (o4Var != null) {
                o4Var.mo887xc459429a((db5.g4) ((jz5.n) c7Var5.f437154d).mo141623x754a37bb());
            }
            db5.g4 g4Var = (db5.g4) ((jz5.n) c7Var5.f437154d).mo141623x754a37bb();
            pk2.w6 w6Var = c7Var5.f437159i;
            w6Var.f437862d = g4Var;
            w6Var.m8146xced61ae5();
            db5.o4 o4Var2 = c7Var5.f437164n;
            if (o4Var2 != null) {
                o4Var2.mo887xc459429a((db5.g4) ((jz5.n) c7Var5.f437155e).mo141623x754a37bb());
            }
            db5.g4 g4Var2 = (db5.g4) ((jz5.n) c7Var5.f437155e).mo141623x754a37bb();
            pk2.w6 w6Var2 = c7Var5.f437160j;
            w6Var2.f437862d = g4Var2;
            w6Var2.m8146xced61ae5();
            db5.o4 o4Var3 = c7Var5.f437165o;
            if (o4Var3 != null) {
                o4Var3.mo887xc459429a((db5.g4) ((jz5.n) c7Var5.f437156f).mo141623x754a37bb());
            }
            db5.g4 g4Var3 = (db5.g4) ((jz5.n) c7Var5.f437156f).mo141623x754a37bb();
            pk2.w6 w6Var3 = c7Var5.f437161k;
            w6Var3.f437862d = g4Var3;
            w6Var3.m8146xced61ae5();
            c7Var5.a().i();
            android.content.Context context = c7Var5.f437151a;
            if (!r4Var.Y1(context) || (dialog = c7Var5.a().f213490d) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x7.a(dialog, context);
        }
    }

    public final void f(android.app.Activity activity) {
        pk2.p7 p7Var = this.f437207q;
        pk2.o9 o9Var = this.f437213w;
        if (p7Var == null) {
            pk2.p7 p7Var2 = new pk2.p7(activity, o9Var.h());
            this.f437207q = p7Var2;
            p7Var2.c().f213501r = new pk2.m8(this, o9Var);
        }
        this.f437208r = null;
        pk2.p7 p7Var3 = this.f437207q;
        if (p7Var3 != null) {
            int color = o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
            android.widget.TextView textView = p7Var3.c().f213504u;
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
        pk2.p7 p7Var4 = this.f437207q;
        java.util.List menuConfigs = this.f437206p;
        pk2.y8 y8Var = new pk2.y8(this);
        pk2.z8 z8Var = new pk2.z8(o9Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuConfigs, "menuConfigs");
        java.util.ArrayList arrayList = (java.util.ArrayList) menuConfigs;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            pk2.e9 e9Var = (pk2.e9) arrayList.get(i17);
            java.lang.String str = "level_" + i17;
            if (p7Var4 != null) {
                p7Var4.a(str, e9Var.f437246b, new pk2.r9(e9Var));
            }
            if (p7Var4 != null) {
                p7Var4.d(str, new pk2.s9(e9Var, z8Var, y8Var, p7Var4));
            }
            if (p7Var4 != null) {
                p7Var4.e(str, !e9Var.f437245a.isEmpty());
            }
            android.view.View view = e9Var.f437247c;
            if (view != null && p7Var4 != null) {
                p7Var4.b(str, view);
            }
        }
        pk2.p7 p7Var5 = this.f437207q;
        if (p7Var5 != null) {
            p7Var5.f();
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1 g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1 q1Var = this.f437202l;
        if (q1Var != null) {
            return q1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicLiveCardDebugHalfWebViewDialog");
        throw null;
    }

    public final void h() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f437193c;
        if (k0Var != null) {
            k0Var.u();
        }
        pk2.c7 c7Var = this.f437195e;
        if (c7Var != null) {
            c7Var.a().h();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f437194d;
        if (k0Var2 != null) {
            k0Var2.u();
        }
        pk2.p7 p7Var = this.f437207q;
        if (p7Var != null) {
            p7Var.c().h();
        }
    }

    public final void i() {
        kl2.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar = this.f437200j;
        if (yxVar != null) {
            yxVar.f202016e = false;
            yxVar.f202015d = null;
            yxVar.f202014c = null;
        }
        kl2.e0 e0Var = this.f437197g;
        if (e0Var != null && (vVar = (kl2.v) ((jz5.n) e0Var.f390301k).mo141623x754a37bb()) != null) {
            vVar.a();
        }
        pk2.p7 p7Var = this.f437207q;
        if (p7Var != null) {
            p7Var.c().h();
        }
        if (zl2.q4.f555466a.E() && this.f437202l != null && g().m74860x58a9c73b()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) g()).dismiss();
            java.lang.String str = this.f437213w.f437605a;
        }
    }
}
