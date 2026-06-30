package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public class k2 implements java.lang.Runnable {
    public k2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2 c2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f c16794xbccf947f = (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f) xp3.i.a(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f.class);
        java.lang.StringBuilder sb6 = c16794xbccf947f.C;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("ACTION_ELF_CHECK");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        if (fp.h.a(33)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c16794xbccf947f, intentFilter);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c16794xbccf947f, intentFilter, 4);
        }
        try {
            if (i95.n0.c(e42.e0.class) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MainProcessChecker", "IExptService is null!");
                return;
            }
            c16794xbccf947f.D = wo.w0.q();
            c16794xbccf947f.f234513n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_native, c16794xbccf947f.f234512m);
            c16794xbccf947f.f234515p = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_process_vm, c16794xbccf947f.f234514o) * 0.01f;
            c16794xbccf947f.f234517r = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_process_java, c16794xbccf947f.f234516q) * 0.01f;
            long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f.F;
            jArr[0] = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_process_work_begin, 0);
            jArr[1] = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_work_end, 86400000L);
            c16794xbccf947f.f234510k = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_traffic_per_min, 1048576L);
            c16794xbccf947f.f234511l = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_jiffy_per_min, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d);
            c16794xbccf947f.f234519t = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_process_is_hard_mode, true);
            c16794xbccf947f.f234520u = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_process_is_check_launcher_ui, false);
            c16794xbccf947f.B = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_check_time, 1200000L);
            sb6.append(" \n");
            sb6.append("***************ProcessElf Config****************");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("is64BitRuntime:");
            sb6.append(c16794xbccf947f.D);
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("isHardMode:");
            sb6.append(c16794xbccf947f.f234519t);
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
            sb6.append(c16794xbccf947f.f234513n);
            sb6.append("B");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("MEMORY_VM_TOP:");
            sb6.append(c16794xbccf947f.f234515p);
            sb6.append("%");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("MEMORY_JAVA_TOP:");
            sb6.append(c16794xbccf947f.f234517r);
            sb6.append("%");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("TRAFFIC_PER_MIN:");
            sb6.append(c16794xbccf947f.f234510k);
            sb6.append("B");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("JIFFIES_PER_MIN:");
            sb6.append(c16794xbccf947f.f234511l);
            sb6.append("jiffy");
            sb6.append("\n");
            sb6.append("| ");
            sb6.append("CHECK_TIME:");
            sb6.append(c16794xbccf947f.B);
            sb6.append("ms");
            sb6.append("\n");
            sb6.append("************************************************");
            sb6.append("\n");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainProcessChecker", sb6.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainProcessChecker", "[resetConfig] ERROR!!! %s", e17);
        }
    }
}
