package t21;

/* loaded from: classes12.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.c2 f496604d;

    public z1(t21.c2 c2Var) {
        this.f496604d = c2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r0.h("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r0.h("@chatroom") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r0.f496257e != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r0.f496258f == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r12.f496604d.f496253a.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r0 = r12.f496604d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(r0.f496262j) <= 600) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        r0.f496262j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r3 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        t21.c2.b(r12.f496604d, 111, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        r0 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        r1 = r12.f496604d.f496253a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        r2 = r12.f496604d.f496253a.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r2.hasNext() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        r6 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) r2.next();
        r8 = t21.c2.c(r12.f496604d, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        if (r0.f38859x6ac9171 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        r2.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r8 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r6 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
    
        r12.f496604d.f496261i = new t21.v0(r6.m124847x74d37ac6(), r6.Q0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%s start to preload video[%s]", java.lang.Integer.valueOf(r12.f496604d.hashCode()), r12.f496604d.f496261i.c());
        r0 = r12.f496604d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        if (r0.f496261i.b(r0) >= 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreloadVideoService", "%s curr preload task do scene error.", java.lang.Integer.valueOf(r12.f496604d.hashCode()));
        r0 = r12.f496604d.f496253a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010d, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r2.f136479h.f90034b != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        r1 = r12.f496604d.f496253a.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        if (r1.hasNext() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011c, code lost:
    
        r2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        if (r2 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
    
        r8 = r2.m124847x74d37ac6();
        r2 = r12.f496604d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        if (r8 != r2.f496261i.f496511b) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", java.lang.Integer.valueOf(r2.hashCode()), java.lang.Long.valueOf(r12.f496604d.f496261i.f496511b));
        r1.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        r12.f496604d.f496261i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (t21.o2.Zi().f496406p == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00b7, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0059, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0030, code lost:
    
        if (r1 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r0.f496261i == null) goto L14;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.z1.run():void");
    }
}
