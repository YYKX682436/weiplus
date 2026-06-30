package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f149122d;

    public i4(android.content.Context context) {
        this.f149122d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.w1 w1Var = dr0.a3.f323936d;
        boolean o17 = w1Var.a().o();
        android.content.Context context = this.f149122d;
        if (o17) {
            int i17 = er0.f0.a().getInt("acc_proc_life_pull_up_num", -1);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = er0.f0.a();
            int i18 = i17 + 1;
            if (1 >= i18) {
                i18 = 1;
            }
            a17.putInt("acc_proc_life_pull_up_num", i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.FeatureService", "pullUpNum: " + i17 + " + 1");
            if (((java.lang.Boolean) w1Var.a().f323943c.mo141623x754a37bb()).booleanValue()) {
                long accDeadCount = dr0.t0.f324073k.i().getAccDeadCount();
                int h17 = w1Var.a().h();
                dr0.p1 a18 = dr0.p1.f324022d.a();
                java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
                android.app.ApplicationExitInfo b17 = a18.b(PROCESS_MAIN, h17);
                long currentTimeMillis = (b17 == null || android.os.Build.VERSION.SDK_INT < 30) ? -1L : java.lang.System.currentTimeMillis() - b17.getTimestamp();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
                sb6.append(h17);
                sb6.append(">>");
                sb6.append(android.os.Process.myPid());
                sb6.append("): No.");
                sb6.append(i17);
                sb6.append("+1, @");
                sb6.append(accDeadCount);
                sb6.append(", ");
                sb6.append(currentTimeMillis > 0 ? java.lang.String.valueOf(currentTimeMillis / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) : "N/A");
                sb6.append(" 分钟");
                java.lang.String sb7 = sb6.toString();
                w1Var.a().q("进程启动" + sb7);
                z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
                k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
                k0Var.f("进程启动");
                k0Var.e(sb7);
                k0Var.h(16, true);
                c01.m8 m8Var = ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d;
                if (m8Var != null) {
                    ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) m8Var).m(k0Var.b(), true);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            try {
                java.lang.Object systemService = context.getSystemService("shortcut");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.content.pm.ShortcutManager");
                android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) systemService;
                shortcutManager.removeDynamicShortcuts(kz5.b0.c("MicroMsg.proc.FeatureService.ManualRecycleId"));
                w1Var.a().getClass();
                com.p314xaae8f345.mm.p642xad8b531f.s sVar = ((km0.c) gm0.j1.p().a()).f390525f;
                if (sVar != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(sVar.a(".com.tencent.mm.debug.manual_recycle_enable"), false) : false) {
                    android.content.pm.ShortcutInfo.Builder icon = new android.content.pm.ShortcutInfo.Builder(context, "MicroMsg.proc.FeatureService.ManualRecycleId").setShortLabel("关闭微信").setRank(10).setLongLabel("关闭微信").setIcon(android.graphics.drawable.Icon.createWithResource(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.f563633cw1));
                    android.content.Intent intent = new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction");
                    intent.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_manual_recycle");
                    android.content.pm.ShortcutInfo build = icon.setIntent(intent).build();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "build(...)");
                    shortcutManager.removeDynamicShortcuts(kz5.b0.c("MicroMsg.proc.FeatureService.ManualRecycleId"));
                    shortcutManager.addDynamicShortcuts(kz5.b0.c(build));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FeatureService", "addShortcut failed: " + e17.getMessage());
            }
        }
    }
}
