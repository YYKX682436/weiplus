package xz4;

/* loaded from: classes8.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static volatile xz4.i f539806c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f539807a;

    /* renamed from: b, reason: collision with root package name */
    public final xz4.a f539808b = new xz4.f(this);

    public i() {
        if (this.f539807a == null) {
            this.f539807a = new java.util.concurrent.ConcurrentHashMap();
        }
    }

    public static xz4.i a() {
        if (f539806c == null) {
            synchronized (xz4.i.class) {
                if (f539806c == null) {
                    f539806c = new xz4.i();
                }
            }
        }
        return f539806c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(xz4.i r23, xz4.l r24) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xz4.i.b(xz4.i, xz4.l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa A[Catch: all -> 0x0126, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x000c, B:10:0x0015, B:12:0x0038, B:15:0x0040, B:17:0x0048, B:19:0x0062, B:22:0x0069, B:24:0x0073, B:27:0x0084, B:29:0x008c, B:30:0x00a8, B:32:0x00b0, B:33:0x00c7, B:35:0x00cf, B:37:0x00e9, B:39:0x00fa, B:42:0x010c), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x000c, B:10:0x0015, B:12:0x0038, B:15:0x0040, B:17:0x0048, B:19:0x0062, B:22:0x0069, B:24:0x0073, B:27:0x0084, B:29:0x008c, B:30:0x00a8, B:32:0x00b0, B:33:0x00c7, B:35:0x00cf, B:37:0x00e9, B:39:0x00fa, B:42:0x010c), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void c(java.lang.String r16, xz4.h r17) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xz4.i.c(java.lang.String, xz4.h):void");
    }

    public final void d(wz4.a aVar, xz4.h hVar) {
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.l.b(aVar.f67173x29a55882, aVar.f67175x8987ca93);
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.b(b17);
        f(3, aVar.f67173x29a55882, b17 + "/diff", "", aVar.f67169x238eb002, aVar.f67174x55b5eda8, aVar.f67175x8987ca93, aVar.f67172x3e015116, aVar.f67170x4b6e68b9, aVar.f67168xd4f0ff8a, hVar);
    }

    public final void e(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        if (r6Var == null || !r6Var.m()) {
            return;
        }
        if (r6Var.A() && r6Var.m82467xfb82e301().equals(str)) {
            if (list == null) {
                list = new java.util.ArrayList();
            }
            list.add(r6Var.o());
        } else {
            if (!r6Var.y() || (G = r6Var.G()) == null) {
                return;
            }
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                e(r6Var2, str, list);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c3, code lost:
    
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0214, code lost:
    
        if ((((r3 < 12 || r3 >= 14) && (r3 != 14 ? r3 < 18 || r3 > 24 : r2.get(12) > 30)) ? r11 : true) != false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, long r30, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, xz4.h r36) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xz4.i.f(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, int, xz4.h):void");
    }
}
