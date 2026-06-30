package ln1;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static long f401297b = -1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f401298a = false;

    public void a(final java.util.LinkedList linkedList, final ln1.m mVar, long j17) {
        java.util.HashMap hashMap;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xn1.h l17 = mn1.d.i().l();
        if (l17.f537002r == 0) {
            long j18 = l17.f537000p;
            long j19 = l17.f537001q;
            hashMap = new java.util.HashMap();
            try {
                android.database.Cursor p17 = mt1.b0.f412724a.n().p1(j18, j19, null);
                while (p17.moveToNext()) {
                    try {
                        java.lang.String string = p17.getString(0);
                        long[] jArr = new long[5];
                        int i17 = 0;
                        while (i17 < 5) {
                            int i18 = i17 + 1;
                            jArr[i17] = jArr[i17] + p17.getLong(i18);
                            i17 = i18;
                        }
                        hashMap.put(string, jArr);
                    } finally {
                    }
                }
                p17.close();
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupCalculator", e17, "", new java.lang.Object[0]);
            }
        } else {
            hashMap = null;
        }
        java.util.HashMap hashMap2 = hashMap;
        java.util.Iterator it = linkedList.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            kn1.i iVar = (kn1.i) it.next();
            if (iVar.f391161g >= 0) {
                i19++;
            } else {
                if (f401297b == -1) {
                    f401297b = aw1.v.d();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCalculator", "calConversation, msgPerSize = " + f401297b);
                long j27 = f401297b * iVar.f391162h;
                long[] jArr2 = iVar.f391160f;
                jArr2[0] = j27;
                iVar.f391161g = j27;
                if (hashMap2 != null && hashMap2.containsKey(iVar.f391158d)) {
                    long[] jArr3 = (long[]) hashMap2.get(iVar.f391158d);
                    if (jArr3.length > 0) {
                        long j28 = jArr2[0] + jArr3[0];
                        jArr2[0] = j28;
                        long j29 = jArr3[0];
                        long j37 = jArr3[1];
                        if (j29 >= j37) {
                            jArr2[1] = jArr2[1] + (j29 - j37);
                        }
                        iVar.f391161g = j28;
                    }
                }
                final int i27 = i19 + 1;
                if (!this.f401298a && mVar != null) {
                    final kn1.i iVar2 = new kn1.i();
                    iVar2.f391158d = iVar.f391158d;
                    iVar2.f391159e = iVar.f391159e;
                    iVar2.f391161g = iVar.f391161g;
                    iVar2.f391162h = iVar.f391162h;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: ln1.h$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (ln1.h.this.f401298a) {
                                return;
                            }
                            mVar.X0(linkedList, iVar2, i27);
                        }
                    });
                }
                i19 = i27;
            }
        }
        if (!this.f401298a && mVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: ln1.h$$b
                @Override // java.lang.Runnable
                public final void run() {
                    ln1.m mVar2;
                    if (ln1.h.this.f401298a || (mVar2 = mVar) == null) {
                        return;
                    }
                    mVar2.e1(linkedList);
                }
            });
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCalculator", "calculChooseConvSize loading time[%d] userSize:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(linkedList.size()));
    }

    public void b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCalculator", "cancel. stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f401298a = true;
    }
}
