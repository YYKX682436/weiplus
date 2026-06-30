package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes7.dex */
public class i2 implements java.lang.Runnable {
    public i2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2 c2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = yp3.b.f545934b;
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = yp3.b.f545934b;
        if ((r6Var2 == null || r6Var2.i()) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HprofCleaner", r6Var2.o() + " not writable");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.util.List I = kz5.z.I(yp3.b.f545935c);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(I, 10));
            java.util.Iterator it = ((java.util.ArrayList) I).iterator();
            while (it.hasNext()) {
                arrayList.add(new com.p314xaae8f345.mm.vfs.r6((java.lang.String) it.next()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = (com.p314xaae8f345.mm.vfs.r6) next;
                if (r6Var3.m() && r6Var3.y()) {
                    arrayList2.add(next);
                }
            }
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.mm.vfs.r6[] H = ((com.p314xaae8f345.mm.vfs.r6) it7.next()).H(new yp3.a(currentTimeMillis));
                if (H != null) {
                    for (com.p314xaae8f345.mm.vfs.r6 r6Var4 : H) {
                        if (r6Var4.m() && r6Var4.A()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HprofCleaner", "clean " + r6Var4.o() + ", last modify: " + r6Var4.B());
                            r6Var4.l();
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.HprofCleaner", th6, "", new java.lang.Object[0]);
        }
    }
}
