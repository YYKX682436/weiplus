package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public class k2 implements java.lang.Runnable {
    public k2(com.tencent.mm.feature.performance.c2 c2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.performance.elf.MainProcessChecker mainProcessChecker = (com.tencent.mm.plugin.performance.elf.MainProcessChecker) xp3.i.a(com.tencent.mm.plugin.performance.elf.MainProcessChecker.class);
        java.lang.StringBuilder sb6 = mainProcessChecker.C;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("ACTION_ELF_CHECK");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        if (fp.h.a(33)) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(mainProcessChecker, intentFilter);
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(mainProcessChecker, intentFilter, 4);
        }
        try {
            if (i95.n0.c(e42.e0.class) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MainProcessChecker", "IExptService is null!");
                return;
            }
            mainProcessChecker.D = wo.w0.q();
            mainProcessChecker.f152980n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_native, mainProcessChecker.f152979m);
            mainProcessChecker.f152982p = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_process_vm, mainProcessChecker.f152981o) * 0.01f;
            mainProcessChecker.f152984r = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_process_java, mainProcessChecker.f152983q) * 0.01f;
            long[] jArr = com.tencent.mm.plugin.performance.elf.MainProcessChecker.F;
            jArr[0] = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_process_work_begin, 0);
            jArr[1] = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_work_end, 86400000L);
            mainProcessChecker.f152977k = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_traffic_per_min, 1048576L);
            mainProcessChecker.f152978l = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_jiffy_per_min, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
            mainProcessChecker.f152986t = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_process_is_hard_mode, true);
            mainProcessChecker.f152987u = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_process_is_check_launcher_ui, false);
            mainProcessChecker.B = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_check_time, 1200000L);
            sb6.append(" \n");
            sb6.append("***************ProcessElf Config****************");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("is64BitRuntime:");
            sb6.append(mainProcessChecker.D);
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("isHardMode:");
            sb6.append(mainProcessChecker.f152986t);
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("workTime:");
            sb6.append(jArr[0]);
            sb6.append("-");
            sb6.append(jArr[1]);
            sb6.append("ms");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("NATIVE_SIZE:");
            sb6.append(mainProcessChecker.f152980n);
            sb6.append("B");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("MEMORY_VM_TOP:");
            sb6.append(mainProcessChecker.f152982p);
            sb6.append("%");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("MEMORY_JAVA_TOP:");
            sb6.append(mainProcessChecker.f152984r);
            sb6.append("%");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("TRAFFIC_PER_MIN:");
            sb6.append(mainProcessChecker.f152977k);
            sb6.append("B");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("JIFFIES_PER_MIN:");
            sb6.append(mainProcessChecker.f152978l);
            sb6.append("jiffy");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("CHECK_TIME:");
            sb6.append(mainProcessChecker.B);
            sb6.append("ms");
            sb6.append("\n");
            sb6.append("************************************************");
            sb6.append("\n");
            com.tencent.mars.xlog.Log.i("MicroMsg.MainProcessChecker", sb6.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MainProcessChecker", "[resetConfig] ERROR!!! %s", e17);
        }
    }
}
