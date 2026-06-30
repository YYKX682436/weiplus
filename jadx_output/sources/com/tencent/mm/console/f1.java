package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class f1 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        final long longExtra = intent.getLongExtra("cmd", 0L);
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("args");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        if (stringArrayExtra != null) {
            java.util.Collections.addAll(arrayList, stringArrayExtra);
        } else {
            arrayList.add("nothing");
        }
        ((ku5.t0) ku5.t0.f312615d).b(new java.lang.Runnable() { // from class: com.tencent.mm.console.f1$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
                java.util.ArrayList args = arrayList;
                kotlin.jvm.internal.o.g(args, "args");
                com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().d(longExtra, args);
            }
        }, "TEST_ROAM_DO_DEBUG_CMD");
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "Roam data compare: %s, %s", java.lang.Long.valueOf(longExtra), arrayList);
    }
}
