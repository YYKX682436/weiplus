package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j f231437d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j jVar) {
        super(1);
        this.f231437d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed;
        sj3.b5 elementPrev;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed2;
        java.lang.String wxUserName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j jVar = this.f231437d;
        java.lang.Integer num = (java.lang.Integer) jVar.f231543m.get(wxUserName);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 3) {
                sj3.j g17 = jVar.g(wxUserName);
                if (g17 != null && (c16587x33e31ed2 = g17.f490110d) != null) {
                    c16587x33e31ed2.c();
                }
                jVar.f231543m.put(wxUserName, 4);
                jVar.h().g(2, wxUserName);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
                if (n17 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c(jVar);
                    jj3.j jVar2 = n17.e().f353930i;
                    jVar2.getClass();
                    jVar2.f381554f.put(wxUserName, cVar);
                }
                zj3.g.f554835a.b(4, 2);
                zj3.g.f554855u.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k kVar = jVar.f231540g;
                if (kVar != null) {
                    sj3.a5 a5Var = (sj3.a5) kVar;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    a5Var.w(bool);
                    a5Var.o();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = a5Var.H;
                    if (c16584x79838812 != null && a5Var.L) {
                        c16584x79838812.f231843f.setTag(bool);
                        c16584x79838812.a(c16584x79838812.f231846i);
                        android.view.ViewPropertyAnimator animate = c16584x79838812.f231843f.animate();
                        long j17 = c16584x79838812.f231842e;
                        animate.setDuration(j17).rotation(270);
                        c16584x79838812.f231853s.setTag(bool);
                        android.widget.ImageButton imageButton = c16584x79838812.f231853s;
                        sj3.p pVar = new sj3.p(c16584x79838812, imageButton, sj3.i1.f490103o - sj3.i1.f490099k);
                        pVar.setDuration(j17);
                        imageButton.startAnimation(pVar);
                    }
                }
                sj3.j g18 = jVar.g(wxUserName);
                if (g18 != null) {
                    g18.B = true;
                    uj3.g gVar = g18.f490129z;
                    if (gVar != null) {
                        gVar.b();
                    }
                }
                android.widget.FrameLayout frameLayout = jVar.f231538e;
                r3 = frameLayout != null ? frameLayout.getLayoutParams() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) r3;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k kVar2 = jVar.f231540g;
                layoutParams.topMargin = kVar2 != null ? com.p314xaae8f345.mm.ui.bk.p(((sj3.a5) kVar2).f489950d) : 0;
                android.widget.FrameLayout frameLayout2 = jVar.f231538e;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(layoutParams);
                }
                android.widget.FrameLayout frameLayout3 = jVar.f231538e;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = jVar.f231537d;
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.setVisibility(8);
                }
                sj3.j jVar3 = jVar.f231541h;
                if (jVar3 != null) {
                    jVar3.i();
                    jVar.f231546p = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed3 = jVar3.f490110d;
                    if (c16587x33e31ed3 != null) {
                        c16587x33e31ed3.g(wxUserName, zj3.j.c(wxUserName));
                        c16587x33e31ed3.e();
                        sj3.j g19 = jVar.g(wxUserName);
                        if (g19 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed4 = g19.f490110d;
                            if (c16587x33e31ed4 != null && (elementPrev = c16587x33e31ed4.getElementPrev()) != null) {
                                c16587x33e31ed3.h(elementPrev);
                            }
                            if (g19.f490128y == 2) {
                                sj3.j jVar4 = jVar.f231541h;
                                if (jVar4 != null) {
                                    jVar4.j(true);
                                }
                                sj3.j jVar5 = jVar.f231541h;
                                if (jVar5 != null) {
                                    jVar5.n(true, true);
                                }
                            }
                        }
                    }
                    jVar3.n(false, true);
                }
                android.widget.RelativeLayout relativeLayout = jVar.f231539f;
                if (relativeLayout != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.width = -1;
                    layoutParams3.height = -1;
                    layoutParams3.leftMargin = 0;
                    layoutParams3.rightMargin = 0;
                    relativeLayout.setLayoutParams(layoutParams3);
                    relativeLayout.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k kVar3 = jVar.f231540g;
                    if (kVar3 != null) {
                        zj3.j jVar6 = zj3.j.f554870a;
                        android.content.Context context = relativeLayout.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        sj3.j jVar7 = jVar.f231541h;
                        if (jVar7 == null || (c16587x33e31ed = jVar7.f490110d) == null || (str = c16587x33e31ed.getF231878n()) == null) {
                            str = "";
                        }
                        ((sj3.a5) kVar3).r(jVar6.f(context, str), false);
                    }
                }
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wxUserName, c01.z1.b())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().getClass();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n18 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
                if (n18 != null) {
                    n18.h(wxUserName);
                }
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153139d;
            } else if (intValue != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AvatarViewManager", "unable to trans from " + num.intValue() + " to ScreenCastBig");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AvatarViewManager", "trans state from screen cast big to screen cast big");
            }
            r3 = f0Var;
        }
        if (r3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AvatarViewManager", "unable trans state to screen cast big");
        }
        return f0Var;
    }
}
