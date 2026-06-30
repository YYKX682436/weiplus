package fm;

/* loaded from: classes7.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final fm.c0 f345508d = new fm.c0();

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        int i18;
        k65.l lVar = k65.l.f386150a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.vfs.r6 uncompressedStringsDir = j65.b.f379451g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uncompressedStringsDir, "uncompressedStringsDir");
            synchronized (k65.l.f386151b) {
                i17 = 0;
                try {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    i18 = 0;
                }
                if (uncompressedStringsDir.m()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.vfs.r6[] G = uncompressedStringsDir.G();
                    if (G != null) {
                        i18 = 0;
                        for (com.p314xaae8f345.mm.vfs.r6 r6Var : G) {
                            try {
                                if (r6Var.y()) {
                                    k65.l lVar2 = k65.l.f386150a;
                                    long d17 = lVar2.d(r6Var);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseStringConstant", "cleanupStale remove version dir: " + r6Var.o() + ", lastUsedMs=" + d17);
                                    if (d17 >= 0 && currentTimeMillis - d17 > 2592000000L) {
                                        java.lang.String m82467xfb82e301 = r6Var.m82467xfb82e301();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                                        com.p314xaae8f345.mm.vfs.w6.f(r6Var.o());
                                        com.p314xaae8f345.mm.vfs.r6 c17 = lVar2.c(m82467xfb82e301);
                                        if (c17.m()) {
                                            com.p314xaae8f345.mm.vfs.w6.h(c17.o());
                                        }
                                        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(lVar2.b(), m82467xfb82e301);
                                        if (r6Var2.m()) {
                                            com.p314xaae8f345.mm.vfs.w6.h(r6Var2.o());
                                        }
                                        i18++;
                                    }
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMBaseStringConstant", th, "cleanupStaleUncompressedCache", new java.lang.Object[0]);
                                i17 = i18;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseStringConstant", "checkCleanMMStringResource: " + i17);
                            }
                        }
                        k65.l.f386150a.a(uncompressedStringsDir);
                        i17 = i18;
                    }
                } else {
                    uncompressedStringsDir.J();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseStringConstant", "checkCleanMMStringResource: " + i17);
        }
    }
}
