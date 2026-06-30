package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes5.dex */
public class f1 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        final long longExtra = intent.getLongExtra("cmd", 0L);
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("args");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        if (stringArrayExtra != null) {
            java.util.Collections.addAll(arrayList, stringArrayExtra);
        } else {
            arrayList.add("nothing");
        }
        ((ku5.t0) ku5.t0.f394148d).b(new java.lang.Runnable() { // from class: com.tencent.mm.console.f1$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
                java.util.ArrayList args = arrayList;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().d(longExtra, args);
            }
        }, "TEST_ROAM_DO_DEBUG_CMD");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "Roam data compare: %s, %s", java.lang.Long.valueOf(longExtra), arrayList);
    }
}
