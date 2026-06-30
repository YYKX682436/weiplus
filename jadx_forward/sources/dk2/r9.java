package dk2;

/* loaded from: classes3.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.r9 f315558a = new dk2.r9();

    public static /* synthetic */ void i(dk2.r9 r9Var, android.content.Context context, dk2.x4 x4Var, java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17, java.lang.Object obj) {
        java.lang.String str3 = (i17 & 4) != 0 ? "" : str;
        java.lang.String str4 = (i17 & 8) != 0 ? "" : str2;
        if ((i17 & 16) != 0) {
            intent = null;
        }
        r9Var.h(context, x4Var, str3, str4, intent);
    }

    public static final void j(dk2.x4 x4Var, android.content.Intent intent, android.content.Context context) {
        int i17 = x4Var.f315852m;
        if (i17 == 1 || i17 == 0) {
            intent.setClass(context, zl2.r4.f555483a.o0(context));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive$jump", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive$jump", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i17 == 2) {
            intent.setClass(context, zl2.r4.f555483a.n0(context));
            intent.addFlags(872415232);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive$jump", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive$jump", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "config.secondaryDeviceFlag is not legal: " + x4Var.f315852m);
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            gk2.e eVar = gk2.e.f354004n;
            activity.overridePendingTransition(eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).a8() ? com.p314xaae8f345.mm.R.C30854x2dc211.f559261p : com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
    }

    public final dk2.r9 a(yz5.a aVar) {
        if (!iq.b.d() && !iq.b.a()) {
            return this;
        }
        if (aVar == null) {
            return null;
        }
        aVar.mo152xb9724478();
        return null;
    }

    public final void b(android.content.Intent intent) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        long longExtra = intent.getLongExtra("CURRENT_FEED_ID", 0L);
        boolean booleanExtra = intent.getBooleanExtra("LAUNCH_WITH_ANIM", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "checkFluentEnterCountDown feedId: " + longExtra + " isLaunchWithFluentAnimate: " + booleanExtra);
        if (!booleanExtra || longExtra == 0) {
            return;
        }
        ig2.m mVar = ig2.m.f372926a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", "startEnterLiveCountDown feedId: " + longExtra);
        java.util.HashMap hashMap = ig2.m.f372927b;
        if (hashMap.get(java.lang.Long.valueOf(longExtra)) != null && (r2Var = (p3325xe03a0797.p3326xc267989b.r2) hashMap.get(java.lang.Long.valueOf(longExtra))) != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        hashMap.put(java.lang.Long.valueOf(longExtra), p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new ig2.l(longExtra, null), 3, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (iq.b.H() == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r5 = this;
            java.lang.Class<ve0.e> r0 = ve0.e.class
            i95.m r0 = i95.n0.c(r0)
            ve0.e r0 = (ve0.e) r0
            o95.k r0 = (o95.k) r0
            boolean r0 = r0.Ai()
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r1
            goto L14
        L13:
            r0 = r5
        L14:
            r2 = 0
            if (r0 == 0) goto L4c
            boolean r3 = iq.b.d()
            if (r3 != 0) goto L23
            boolean r3 = iq.b.a()
            if (r3 == 0) goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L4c
            boolean r3 = iq.b.A()
            if (r3 == 0) goto L2d
            r0 = r1
        L2d:
            if (r0 == 0) goto L4c
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r4 = "getApplicationContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            boolean r3 = iq.b.i(r3, r2, r1)
            if (r3 != 0) goto L4c
            boolean r3 = iq.b.F(r1, r2)
            if (r3 != 0) goto L4c
            boolean r3 = iq.b.H()
            if (r3 == 0) goto L4d
        L4c:
            r0 = r1
        L4d:
            r3 = 1
            if (r0 != 0) goto L52
            r0 = r3
            goto L53
        L52:
            r0 = r2
        L53:
            if (r0 != 0) goto L69
            boolean r0 = iq.b.q(r1, r2)
            iq.b.r()
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            boolean r0 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(r0)
            if (r0 != 0) goto L65
            goto L66
        L65:
            r1 = r5
        L66:
            if (r1 == 0) goto L69
            r2 = r3
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r9.c():boolean");
    }

    public final dk2.r9 d(yz5.a aVar) {
        if (!((o95.k) ((ve0.e) i95.n0.c(ve0.e.class))).Ai()) {
            return this;
        }
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if ((sn0.b.f491497e2 != null) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dk2.r9 e(android.content.Context r9, boolean r10, yz5.l r11) {
        /*
            r8 = this;
            gk2.e r0 = gk2.e.f354004n
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r0.a(r2)
            mm2.c1 r0 = (mm2.c1) r0
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2f
            java.lang.Class<mm2.e1> r4 = mm2.e1.class
            androidx.lifecycle.c1 r4 = r0.m147920xbba4bfc0(r4)
            mm2.e1 r4 = (mm2.e1) r4
            r45.nw1 r4 = r4.f410521r
            long r4 = r4.m75942xfb822ef2(r3)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2f
            boolean r4 = r0.U7()
            if (r4 != 0) goto L2f
            r4 = r2
            goto L30
        L2f:
            r4 = r3
        L30:
            if (r4 == 0) goto L4a
            if (r11 == 0) goto L49
            java.lang.String r9 = xy2.c.e(r9)
            if (r0 == 0) goto L3d
            java.lang.String r10 = r0.f410385o
            goto L3e
        L3d:
            r10 = r1
        L3e:
            boolean r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r9, r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r11.mo146xb9724478(r9)
        L49:
            return r1
        L4a:
            r9 = 3
            if (r10 == 0) goto L59
            dk2.ef r10 = dk2.ef.f314905a
            co0.s r11 = r10.u0()
            if (r11 == 0) goto L6f
            dk2.ef.T(r10, r3, r1, r9, r1)
            goto L6f
        L59:
            in0.q r10 = in0.q.f374302b2
            if (r10 == 0) goto L5f
            r10 = r2
            goto L60
        L5f:
            r10 = r3
        L60:
            if (r10 != 0) goto L6a
            sn0.b r10 = sn0.b.f491497e2
            if (r10 == 0) goto L67
            goto L68
        L67:
            r2 = r3
        L68:
            if (r2 == 0) goto L6f
        L6a:
            dk2.ef r10 = dk2.ef.f314905a
            dk2.ef.T(r10, r3, r1, r9, r1)
        L6f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r9.e(android.content.Context, boolean, yz5.l):dk2.r9");
    }

    public final dk2.r9 f(yz5.a aVar) {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return this;
        }
        if (aVar == null) {
            return null;
        }
        aVar.mo152xb9724478();
        return null;
    }

    public final dk2.r9 g(android.content.Context context, yz5.a aVar) {
        if (!iq.b.i(context, false, null) && !iq.b.F(null, false) && !iq.b.H()) {
            return this;
        }
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return null;
    }

    public final void h(android.content.Context context, dk2.x4 x4Var, java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        java.util.ArrayList arrayList;
        r45.nw1 m59258xd0557130;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        boolean z17 = context instanceof android.app.Activity;
        intent.addFlags(268435456);
        dk2.x4.C.c(intent, x4Var);
        r45.h32 h32Var = x4Var.f315840a;
        intent.putExtra("KEY_PARAMS_NOTICE", h32Var != null ? h32Var.mo14344x5f01b1f6() : null);
        r45.uy1 uy1Var = x4Var.f315841b;
        intent.putExtra("KEY_PARAMS_LIVE_TASK_INFO", uy1Var != null ? uy1Var.mo14344x5f01b1f6() : null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(str, intent);
        }
        intent.putExtra("key_click_tab_context_id", str2);
        java.util.LinkedList linkedList = x4Var.f315844e;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.il1) it.next()).mo14344x5f01b1f6());
            }
        } else {
            arrayList = null;
        }
        intent.putExtra("KEY_PARAMS_VISITOR_WHITE_LIST", arrayList instanceof java.io.Serializable ? arrayList : null);
        intent.putExtra("KEY_PARAMS_VISIBLE_ROOM_MAX_COUNT", x4Var.f315845f);
        intent.putExtra("KEY_PARAMS_VISIBLE_USER_MAX_COUNT", x4Var.f315846g);
        intent.putExtra("KEY_PARAMS_LUCKY_MONEY_CONFIG", x4Var.f315847h);
        int intExtra = intent.getIntExtra("KEY_PARAMS_SOURCE_TYPE", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "[gotoAnchorLive] config.secondaryDeviceFlag" + x4Var.f315852m + ", sourceType:" + intExtra);
        if (intExtra == 5) {
            intent.setClass(context, zl2.r4.f555483a.n0(context));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e = (com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e) x4Var.f315851l.get(0);
        if (c10828x8f239b6e != null && x4Var.f315852m == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(c10828x8f239b6e.f150082s);
            x4Var.f315852m = (h17 == null || (m59258xd0557130 = h17.m59258xd0557130()) == null) ? -1 : m59258xd0557130.m75939xb282bd08(21);
        }
        if (x4Var.f315852m != -1) {
            j(x4Var, intent, context);
            return;
        }
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e2 = (com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e) x4Var.f315851l.get(0);
        if (c10828x8f239b6e2 != null) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ml(c10828x8f239b6e2.f150082s, c10828x8f239b6e2.f150089z, 0, false, true, "", new dk2.j9(x4Var, c10828x8f239b6e2, intent, context));
        }
    }

    public final void k(android.content.Context context, dk2.x4 x4Var, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17) {
        int i17 = c61.dc.f120480a;
        boolean z18 = c61.cc.f120461a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "gotoVisitLive isAuthorizeFromAnim=" + z18);
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Kk() || z18) {
            m(context, x4Var, str, str2, intent, z17);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        dk2.q9 q9Var = new dk2.q9(context, x4Var, str, str2, intent, z17);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 9007199254740992L, null, q9Var, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0138, code lost:
    
        if (((r0 == null || (r0 = r0.getIntent()) == null || !r0.getBooleanExtra("KEY_IS_FROM_FINDER_TASK", false)) ? false : true) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.content.Context r32, dk2.x4 r33, java.lang.String r34, java.lang.String r35, android.content.Intent r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.r9.m(android.content.Context, dk2.x4, java.lang.String, java.lang.String, android.content.Intent, boolean):void");
    }
}
