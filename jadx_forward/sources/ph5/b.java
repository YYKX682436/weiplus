package ph5;

/* loaded from: classes12.dex */
public class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    public static void a(int i17, java.util.List list) {
        if (i17 == android.os.Process.myPid()) {
            b(list);
            c("Dump Thread, pid = " + i17 + ", tid = " + list.toString(), 1);
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) sh.c.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)).iterator();
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            if (((java.lang.Integer) dVar.f404625a).intValue() == i17) {
                java.lang.String str = (java.lang.String) dVar.f404626b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (java.lang.Object obj : list) {
                    if (sb6.length() != 0) {
                        obj = "," + obj;
                    }
                    sb6.append(obj);
                }
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopThreadDumpTask", "Dump remote process, name = " + str + ", pid = " + i17 + ", tids = " + sb7);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(sb7), ph5.b.class, new ph5.C29979x2d1840());
                return;
            }
        }
    }

    public static void b(java.util.List list) {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k kVar;
        ph.u e17 = gi.d.e();
        wh.s cVar = e17 != null ? e17.f435829h.f444868d.A : new gi.c();
        int myPid = android.os.Process.myPid();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            arrayList.add(new m3.d(num, wh.u1.e(myPid, num.intValue())));
        }
        qh.u uVar = new qh.u();
        uVar.i();
        uVar.a("| TOP_THREAD_DUMP\n");
        uVar.b("Proc");
        uVar.h("pid", java.lang.String.valueOf(myPid));
        uVar.b("Stacks");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            m3.d dVar = (m3.d) it6.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(((wh.t1) dVar.f404626b).f527406a);
            sb6.append("(");
            java.lang.Object obj = dVar.f404625a;
            sb6.append(obj);
            sb6.append(")");
            uVar.c(sb6.toString());
            java.lang.String a17 = cVar.a(((java.lang.Integer) obj).intValue());
            linkedHashMap.put("stack_" + ((wh.t1) dVar.f404626b).f527406a + "(" + obj + ")", a17);
            int i17 = 0;
            for (java.lang.String str : a17.split("\n")) {
                uVar.f444920a.append((java.lang.Object) (i17 == 0 ? "|   -> " : "|      "));
                uVar.f444920a.append((java.lang.Object) str);
                uVar.a("\n");
                i17++;
            }
        }
        uVar.f();
        uVar.d();
        if (e17 == null || (kVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) e17.f435829h.i(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class)) == null) {
            return;
        }
        kVar.k("MATRIX_TOP_DUMP", myPid, linkedHashMap);
    }

    public static void c(final java.lang.String str, final int i17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: ph5.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, i17).show();
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : java.lang.String.valueOf(((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).f149939d).split(",")) {
            java.lang.String trim = str.trim();
            if (android.text.TextUtils.isDigitsOnly(trim)) {
                try {
                    arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(trim)));
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TopThreadDumpTask", "parse tid failed: " + th6.getMessage());
                }
            }
        }
        b(arrayList);
        rVar.a(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d);
    }
}
