package n34;

/* loaded from: classes4.dex */
public class f implements s85.b, java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final n34.f f416126e = new n34.f();

    /* renamed from: f, reason: collision with root package name */
    public static final s85.c f416127f = new s85.e(gm0.j1.t().a(0, java.lang.Boolean.class), new s85.h(gm0.j1.t().a(1, java.lang.Boolean.class)));

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f416128d = null;

    public static void b() {
        java.util.HashSet hashSet;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.CleanSnsDB");
        s85.a aVar = (s85.a) f416127f;
        synchronized (aVar.f486438g) {
            hashSet = aVar.f486437f;
            aVar.f486437f = new java.util.HashSet();
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            aVar.d((s85.b) it.next());
        }
        n34.f fVar = f416126e;
        wu5.c cVar = fVar.f416128d;
        if (cVar != null) {
            cVar.cancel(false);
            fVar.f416128d = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finish", "com.tencent.mm.plugin.sns.CleanSnsDB");
    }

    @Override // s85.b
    public void a(s85.c cVar, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
        if (!((java.lang.Boolean) obj).booleanValue()) {
            wu5.c cVar2 = this.f416128d;
            if (cVar2 != null) {
                cVar2.cancel(false);
                this.f416128d = null;
            }
        } else if (this.f416128d == null) {
            this.f416128d = ((ku5.t0) ku5.t0.f394148d).k(this, 360000L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChange", "com.tencent.mm.plugin.sns.CleanSnsDB");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[Catch: RuntimeException -> 0x01c1, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01c1, blocks: (B:3:0x000d, B:7:0x0025, B:10:0x0047, B:12:0x0051, B:13:0x0060, B:17:0x007d, B:19:0x009f, B:22:0x00d1, B:24:0x00db, B:25:0x00f5, B:29:0x0113, B:30:0x0102, B:32:0x010f, B:33:0x0179, B:34:0x006e, B:36:0x007b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0179 A[Catch: RuntimeException -> 0x01c1, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01c1, blocks: (B:3:0x000d, B:7:0x0025, B:10:0x0047, B:12:0x0051, B:13:0x0060, B:17:0x007d, B:19:0x009f, B:22:0x00d1, B:24:0x00db, B:25:0x00f5, B:29:0x0113, B:30:0x0102, B:32:0x010f, B:33:0x0179, B:34:0x006e, B:36:0x007b), top: B:2:0x000d }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n34.f.run():void");
    }
}
