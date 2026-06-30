package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67589d;

    public i4(android.content.Context context) {
        this.f67589d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.w1 w1Var = dr0.a3.f242403d;
        boolean o17 = w1Var.a().o();
        android.content.Context context = this.f67589d;
        if (o17) {
            int i17 = er0.f0.a().getInt("acc_proc_life_pull_up_num", -1);
            com.tencent.mm.sdk.platformtools.o4 a17 = er0.f0.a();
            int i18 = i17 + 1;
            if (1 >= i18) {
                i18 = 1;
            }
            a17.putInt("acc_proc_life_pull_up_num", i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.FeatureService", "pullUpNum: " + i17 + " + 1");
            if (((java.lang.Boolean) w1Var.a().f242410c.getValue()).booleanValue()) {
                long accDeadCount = dr0.t0.f242540k.i().getAccDeadCount();
                int h17 = w1Var.a().h();
                dr0.p1 a18 = dr0.p1.f242489d.a();
                java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
                kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
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
                sb6.append(currentTimeMillis > 0 ? java.lang.String.valueOf(currentTimeMillis / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) : "N/A");
                sb6.append(" 分钟");
                java.lang.String sb7 = sb6.toString();
                w1Var.a().q("进程启动" + sb7);
                z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
                k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
                k0Var.f("进程启动");
                k0Var.e(sb7);
                k0Var.h(16, true);
                c01.m8 m8Var = ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d;
                if (m8Var != null) {
                    ((com.tencent.mm.booter.notification.x) m8Var).m(k0Var.b(), true);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            try {
                java.lang.Object systemService = context.getSystemService("shortcut");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.pm.ShortcutManager");
                android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) systemService;
                shortcutManager.removeDynamicShortcuts(kz5.b0.c("MicroMsg.proc.FeatureService.ManualRecycleId"));
                w1Var.a().getClass();
                com.tencent.mm.booter.s sVar = ((km0.c) gm0.j1.p().a()).f308992f;
                if (sVar != null ? com.tencent.mm.sdk.platformtools.t8.m1(sVar.a(".com.tencent.mm.debug.manual_recycle_enable"), false) : false) {
                    android.content.pm.ShortcutInfo.Builder icon = new android.content.pm.ShortcutInfo.Builder(context, "MicroMsg.proc.FeatureService.ManualRecycleId").setShortLabel("关闭微信").setRank(10).setLongLabel("关闭微信").setIcon(android.graphics.drawable.Icon.createWithResource(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.f482100cw1));
                    android.content.Intent intent = new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction");
                    intent.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_manual_recycle");
                    android.content.pm.ShortcutInfo build = icon.setIntent(intent).build();
                    kotlin.jvm.internal.o.f(build, "build(...)");
                    shortcutManager.removeDynamicShortcuts(kz5.b0.c("MicroMsg.proc.FeatureService.ManualRecycleId"));
                    shortcutManager.addDynamicShortcuts(kz5.b0.c(build));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.proc.FeatureService", "addShortcut failed: " + e17.getMessage());
            }
        }
    }
}
