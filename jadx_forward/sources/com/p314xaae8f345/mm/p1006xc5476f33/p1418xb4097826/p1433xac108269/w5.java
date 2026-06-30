package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class w5 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w5 f184185d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w5();

    public final boolean a() {
        boolean z17;
        boolean z18 = pm0.v.z(g92.b.f351302e.k2().e().m75939xb282bd08(17), 4);
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPreCheckHelper", "[checkBindPhone] " + z18);
        }
        return z18;
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209514v5).mo141623x754a37bb()).r()).intValue();
        if (intValue == 0) {
            return a();
        }
        if (intValue == 1) {
            return true;
        }
        if (intValue != 2) {
            return a();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        if (r17 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.content.Context r20, java.lang.Integer r21, yz5.a r22) {
        /*
            r19 = this;
            r1 = r20
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r0)
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209478t5
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.mo141623x754a37bb()
            lb2.j r2 = (lb2.j) r2
            java.lang.Object r2 = r2.r()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r15 = 1
            java.lang.String r14 = "FinderPostPreCheckHelper"
            if (r2 != r15) goto L28
            java.lang.String r0 = "ignore all pre check"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r14, r0)
            return r15
        L28:
            boolean r2 = r19.b()
            r16 = 0
            if (r2 == 0) goto Lbe
            g92.b r2 = g92.b.f351302e
            m92.e r3 = r2.k2()
            boolean r3 = hc2.j.a(r3)
            if (r3 == 0) goto Lbc
            m92.e r2 = r2.k2()
            r45.ob4 r2 = r2.e()
            r3 = 17
            int r2 = r2.m75939xb282bd08(r3)
            r3 = 8
            boolean r2 = pm0.v.z(r2, r3)
            lb2.j r0 = r0.o0()
            java.lang.Object r0 = r0.r()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L65
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            r0 = r16
            goto L66
        L65:
            r0 = r15
        L66:
            if (r0 == 0) goto L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "[checkAgreeGetPhone] "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r14, r0)
        L79:
            r17 = r2 ^ 1
            if (r17 == 0) goto Lb4
            com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.INSTANCE
            r2 = 2131762067(0x7f101b93, float:1.91552E38)
            java.lang.String r4 = r1.getString(r2)
            r2 = 2131762064(0x7f101b90, float:1.9155194E38)
            java.lang.String r5 = r1.getString(r2)
            r2 = 2131762065(0x7f101b91, float:1.9155196E38)
            java.lang.String r6 = r1.getString(r2)
            r2 = 2131762059(0x7f101b8b, float:1.9155184E38)
            java.lang.String r7 = r1.getString(r2)
            com.tencent.mm.plugin.finder.assist.p5 r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p5.f183988d
            r2 = 0
            r3 = 0
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)
            r8 = 0
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r11 = 0
            r12 = 0
            r13 = 3206(0xc86, float:4.493E-42)
            r18 = 0
            r1 = r20
            r15 = r14
            r14 = r18
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.Companion.m61662x337db7d5(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lb5
        Lb4:
            r15 = r14
        Lb5:
            java.lang.String r0 = "[checkHasBindPhone] show argee save phone"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r15, r0)
            if (r17 != 0) goto Lc1
        Lbc:
            r15 = 1
            goto Lc3
        Lbe:
            r19.e(r20, r21, r22)
        Lc1:
            r15 = r16
        Lc3:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w5.c(android.content.Context, java.lang.Integer, yz5.a):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.app.Activity r17, r45.lk2 r18, yz5.a r19) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w5.d(android.app.Activity, r45.lk2, yz5.a):boolean");
    }

    public final void e(android.content.Context context, java.lang.Integer num, yz5.a aVar) {
        java.lang.String str = "";
        java.lang.String string = (num != null && num.intValue() == 1) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.crc) : (num != null && num.intValue() == 2) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.crd) : (num != null && num.intValue() == 3) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctv, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cty)) : (num != null && num.intValue() == 4) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctv, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctx)) : (num != null && num.intValue() == 5) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctv, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctw)) : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (num != null && num.intValue() == 1) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cr9);
        } else if (num != null && num.intValue() == 2) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cr_);
        }
        java.lang.String str2 = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        if (!hc2.j.a(g92.b.f351302e.k2()) && ((num == null || num.intValue() != 3) && ((num == null || num.intValue() != 4) && (num == null || num.intValue() != 5)))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.Companion.m61662x337db7d5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.INSTANCE, context, null, 0, str2, string, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572859cr2), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572858cr1), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v5(aVar, context), java.lang.Boolean.FALSE, null, null, 3206, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPreCheckHelper", "[checkHasBindPhone] isUserWxForeign false");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(string);
        u1Var.a(true);
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572859cr2));
        u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572858cr1));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u5(aVar, context));
        u1Var.q(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPreCheckHelper", "[checkHasBindPhone] isUserWxForeign true");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.app.Activity activity;
        if (!(m1Var != null && m1Var.mo808xfb85f7b0() == 3862)) {
            if (!(m1Var != null && m1Var.mo808xfb85f7b0() == 7143)) {
                if (!(m1Var != null && m1Var.mo808xfb85f7b0() == 3906)) {
                    return;
                }
            }
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPreCheckHelper", "errType=" + i17 + " errCode=" + i18);
        }
        if (i18 != -4300) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209514v5).mo141623x754a37bb()).r()).intValue() != 2) {
                return;
            }
        }
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        jz5.f0 f0Var = null;
        if (k17 != null && (activity = (android.app.Activity) k17.get()) != null) {
            if (((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).tj()) {
                int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w5 w5Var = f184185d;
                if (mo808xfb85f7b0 == 3862) {
                    w5Var.e(activity, 3, null);
                } else if (mo808xfb85f7b0 == 3906) {
                    w5Var.e(activity, 4, null);
                } else if (mo808xfb85f7b0 == 7143) {
                    w5Var.e(activity, 5, null);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostPreCheckHelper", "getTopActivity is in finder! ".concat(activity.getClass().getName()));
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostPreCheckHelper", "getTopActivity is null!");
        }
    }
}
