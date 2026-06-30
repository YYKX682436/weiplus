package u84;

/* loaded from: classes4.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f507107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f507108e;

    public k1(u84.m1 m1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f507107d = m1Var;
        this.f507108e = c17933xe8d1b226;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object m143895xf1229813;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        boolean z17;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/interactionlabel/AdStateSettingBarComponent$setClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        u84.m1 m1Var = this.f507107d;
        android.view.ViewGroup A = u84.m1.A(m1Var);
        if (!(A != null && A.getVisibility() == 0)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/AdStateSettingBarComponent$setClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1");
            return;
        }
        u84.o1 y17 = u84.m1.y(m1Var);
        if (y17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) y17.f507168j).a(y17, u84.o1.f507158n[2]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            if (c17702x544f64e9 != null) {
                c17702x544f64e9.f244102a = 23;
                if (c17702x544f64e9.f244104b == 21) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f507108e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$dispatchOverrideAndJump", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchOverrideAndJump", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    if (m1Var.f507126J == null) {
                        m1Var.f507126J = c17702x544f64e9.f244143u0;
                    }
                    s34.d dVar = m1Var.f507126J;
                    if (dVar != null) {
                        c17702x544f64e9.f244143u0 = dVar;
                    }
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c17933xe8d1b226.m70355xb5882a06());
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                    if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                        m143895xf1229813 = null;
                    }
                    java.lang.String str10 = (java.lang.String) m143895xf1229813;
                    m84.z b17 = !(str10 == null || str10.length() == 0) ? m84.a0.b(str10) : null;
                    java.lang.String a17 = b17 != null ? b17.a() : null;
                    if (b17 != null) {
                        str4 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1";
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarMd5", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarMd5", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
                        str5 = b17.f406356b;
                    } else {
                        str4 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1";
                        str5 = null;
                    }
                    if (str10 == null || str10.length() == 0) {
                        str6 = "onClick";
                        z17 = true;
                    } else {
                        str6 = "onClick";
                        z17 = false;
                    }
                    w64.n nVar = m1Var.f507130r;
                    if (!z17 && b17 != null) {
                        if (!(a17 == null || r26.n0.N(a17))) {
                            if (str5 == null || r26.n0.N(str5)) {
                                str = "(Landroid/view/View;)V";
                                p3325xe03a0797.p3326xc267989b.y0 h17 = m1Var.h();
                                if (h17 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m1Var.j(), "dispatchOverrideAndJump: itemScope null, fallback sync PATH C, aid=" + str10);
                                    if (nVar != null) {
                                        nVar.n(c17702x544f64e9, c17933xe8d1b226);
                                    }
                                    if (nVar != null) {
                                        nVar.k(view);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchOverrideAndJump", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                                } else {
                                    str7 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent";
                                    str8 = "access$dispatchOverrideAndJump";
                                    str2 = str4;
                                    m1Var.K = p3325xe03a0797.p3326xc267989b.l.d(h17, p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(u84.m1.N), null, new u84.o0(m1Var, a17, c17702x544f64e9, str10, c17933xe8d1b226, view, null), 2, null);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchOverrideAndJump", str7);
                                    str3 = str6;
                                    str9 = str8;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str9, str7);
                                }
                            } else {
                                str = "(Landroid/view/View;)V";
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m1Var.j(), "dispatchOverrideAndJump: PATH A — sync, storage carries md5, aid=" + str10 + ", urlLen=" + a17.length() + ", md5Len=" + str5.length());
                                m1Var.K(c17702x544f64e9, a17, str5, str10);
                                if (nVar != null) {
                                    nVar.n(c17702x544f64e9, c17933xe8d1b226);
                                }
                                if (nVar != null) {
                                    nVar.k(view);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchOverrideAndJump", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                            }
                            str7 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent";
                            str3 = str6;
                            str9 = "access$dispatchOverrideAndJump";
                            str2 = str4;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str9, str7);
                        }
                    }
                    str = "(Landroid/view/View;)V";
                    str7 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent";
                    str3 = str6;
                    str8 = "access$dispatchOverrideAndJump";
                    str2 = str4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m1Var.j(), "dispatchOverrideAndJump: storage miss / blank, sync jump with XML default, aid=" + str10);
                    if (nVar != null) {
                        nVar.n(c17702x544f64e9, c17933xe8d1b226);
                    }
                    if (nVar != null) {
                        nVar.k(view);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchOverrideAndJump", str7);
                    str9 = str8;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str9, str7);
                } else {
                    str = "(Landroid/view/View;)V";
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1";
                    str3 = "onClick";
                    w64.n D = m1Var.D();
                    if (D != null) {
                        D.n(c17702x544f64e9, this.f507108e);
                    }
                    w64.n D2 = m1Var.D();
                    if (D2 != null) {
                        D2.k(view);
                    }
                }
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/AdStateSettingBarComponent$setClickEvent$1", "android/view/View$OnClickListener", str3, str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str2);
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/AdStateSettingBarComponent$setClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1");
    }
}
