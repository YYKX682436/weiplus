package hy2;

/* loaded from: classes10.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements iz2.b {

    /* renamed from: d, reason: collision with root package name */
    public boolean f367588d;

    /* renamed from: e, reason: collision with root package name */
    public final hy2.e f367589e;

    /* renamed from: f, reason: collision with root package name */
    public int f367590f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f367589e = new hy2.e(this);
        this.f367590f = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O6(int r14, yz5.a r15) {
        /*
            r13 = this;
            java.lang.String r0 = "callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            pf5.u r0 = pf5.u.f435469a
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            pf5.v r0 = r0.e(r1)
            java.lang.Class<iz2.c> r1 = iz2.c.class
            pf5.c r0 = r0.c(r1)
            iz2.c r0 = (iz2.c) r0
            com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) r0
            boolean r1 = r0.Q6()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lb9
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC
            r5 = 0
            long r4 = r1.t(r4, r5)
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r6 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC
            boolean r1 = r1.o(r6, r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "checkTeemModeLimit: currentEnjoyFinderMs="
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = " , hasCurFewClose="
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FinderTeenModeLimitVM"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7)
            boolean r7 = r0.R6()
            if (r7 == 0) goto L98
            long r6 = c01.id.c()
            gm0.b0 r9 = gm0.j1.u()
            com.tencent.mm.storage.n3 r9 = r9.c()
            com.tencent.mm.storage.u3 r10 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_CURFEW_CLOSE_TIME_LONG_SYNC
            long r9 = r9.t(r10, r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "checkTeemModeLimit: isInLimitTimeRange, currentTime="
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r12 = ", lastTime="
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r11)
            if (r1 == 0) goto L93
            long r6 = r6 - r9
            r8 = 57600000(0x36ee800, double:2.8458181E-316)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto La7
        L93:
            r0.S6(r3)
            r0 = r3
            goto Lba
        L98:
            if (r1 == 0) goto La7
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r1.x(r6, r7)
        La7:
            hy2.g r1 = hy2.g.f367591a
            int r1 = r1.c()
            int r1 = r1 * 1000
            long r6 = (long) r1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto Lb9
            r0.S6(r2)
            r0 = 2
            goto Lba
        Lb9:
            r0 = r2
        Lba:
            if (r0 == 0) goto Lfd
            r13.f367590f = r14
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            if (r0 != r3) goto Lc6
            r2 = r3
        Lc6:
            java.lang.String r0 = "key_is_curfew"
            r14.putExtra(r0, r2)
            java.lang.String r0 = "key_finder_teen_mode_scene"
            int r1 = r13.f367590f
            r14.putExtra(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r13.m158354x19263085()
            java.lang.Class<com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14095xead19c0c.class
            r14.setClass(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r13.m158354x19263085()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            androidx.activity.result.h r0 = r0.mo2507xfe541f5f()
            h.f r1 = new h.f
            r1.<init>()
            hy2.d r2 = new hy2.d
            r2.<init>(r15)
            java.lang.String r15 = "FinderTeenModeFloatPageUIC"
            androidx.activity.result.c r15 = r0.e(r15, r1, r2)
            r0 = 0
            r15.a(r14, r0)
            goto L100
        Lfd:
            r15.mo152xb9724478()
        L100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hy2.f.O6(int, yz5.a):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeFloatPageUIC", "onActivityResult： requestCode=" + i17 + ", resultCode=" + i18 + ", activity=" + m158354x19263085().getClass().getSimpleName());
        if (i17 == 11111) {
            if (i18 == -1) {
                jz2.x0.f384287a.b(m158354x19263085());
                return;
            }
            if (i18 != 11112) {
                return;
            }
            if (this.f367590f != 7) {
                boolean z17 = m158354x19263085().getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6;
                jz2.x0.f384287a.b(m158354x19263085());
                if (!z17 && !(m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.addFlags(67108864);
                    intent2.addFlags(268435456);
                    intent2.putExtra("preferred_tab", 2);
                    j45.l.u(m158354x19263085(), ".ui.LauncherUI", intent2, null);
                }
            }
            if (!m158354x19263085().isFinishing() && !m158354x19263085().isDestroyed()) {
                if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1) {
                    m158354x19263085().finishAndRemoveTask();
                } else {
                    m158354x19263085().finish();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f367588d = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.f367588d = false;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nzs);
            if (mo144222x4ff8c0f0 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kw8);
            if (mo144222x4ff8c0f02 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nzs);
        if (mo144222x4ff8c0f03 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(mo144222x4ff8c0f03, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f03.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f03, "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f03.setOnClickListener(new hy2.b(this));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(mo144222x4ff8c0f03, "teen_mode_umbrella");
            ((cy1.a) aVar.ik(mo144222x4ff8c0f03, 8, 25496)).Ai(mo144222x4ff8c0f03, new hy2.c(this));
        }
        android.view.View mo144222x4ff8c0f04 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.kw8);
        if (mo144222x4ff8c0f04 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(mo144222x4ff8c0f04, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f04.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f04, "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.class);
        hy2.e listener = this.f367589e;
        c15485xead19c2f.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        synchronized (c15485xead19c2f.f218265f) {
            c15485xead19c2f.f218265f.add(listener);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f c15485xead19c2f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.class);
        hy2.e listener = this.f367589e;
        c15485xead19c2f.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        synchronized (c15485xead19c2f.f218265f) {
            c15485xead19c2f.f218265f.remove(listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f367589e = new hy2.e(this);
        this.f367590f = -1;
    }
}
