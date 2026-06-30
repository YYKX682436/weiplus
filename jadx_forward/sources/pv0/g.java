package pv0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final pv0.b f440053a;

    /* renamed from: b, reason: collision with root package name */
    public final pp0.s0 f440054b;

    /* renamed from: c, reason: collision with root package name */
    public final pp0.r0 f440055c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f440056d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f440057e;

    public g(pv0.b timbreManagerCallback, pp0.s0 speechManager, pp0.r0 materialManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreManagerCallback, "timbreManagerCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(speechManager, "speechManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialManager, "materialManager");
        this.f440053a = timbreManagerCallback;
        this.f440054b = speechManager;
        this.f440055c = materialManager;
        this.f440056d = jz5.h.b(new pv0.f(this));
        this.f440057e = jz5.h.b(new pv0.d(this));
    }

    public final void a(java.util.List timbreRequestGroupList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreRequestGroupList, "timbreRequestGroupList");
        yu0.t tVar = (yu0.t) kz5.n0.a0(timbreRequestGroupList, 0);
        dw0.a aVar = tVar != null ? tVar.f547374g : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimbreManager", "submitTimbreRequestGroup: materialPrefix " + aVar + ' ');
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimbreManager", "submitTimbreRequestGroup:  impossible mistake materialPrefix == null");
            return;
        }
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            vu0.b bVar = (vu0.b) ((jz5.n) this.f440057e).mo141623x754a37bb();
            bVar.getClass();
            java.util.Iterator it = timbreRequestGroupList.iterator();
            while (it.hasNext()) {
                yu0.t tVar2 = (yu0.t) it.next();
                java.lang.String str = tVar2.f547371d;
                java.lang.String str2 = tVar2.f547369b;
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(uu0.l.a("wav", bVar.b(str, str2)));
                if (r6Var.A() && r6Var.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioFilterService", "submitSpeechRequest: cache cacheFile " + r6Var.o());
                    bVar.f521586b.c(new ru0.e(tVar2.f547368a, tVar2.f547369b, tVar2.f547370c, r6Var, null, 16, null));
                } else {
                    ru0.d dVar = new ru0.d(tVar2.f547368a, str2);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = bVar.f521587c;
                    if (concurrentHashMap.get(dVar) != null) {
                        return;
                    } else {
                        concurrentHashMap.put(dVar, p3325xe03a0797.p3326xc267989b.l.d(bVar.f521588d, null, null, new vu0.a(bVar, dVar, tVar2, null), 3, null));
                    }
                }
            }
            return;
        }
        vu0.s sVar = (vu0.s) ((jz5.n) this.f440056d).mo141623x754a37bb();
        sVar.getClass();
        java.util.Iterator it6 = timbreRequestGroupList.iterator();
        while (it6.hasNext()) {
            yu0.t tVar3 = (yu0.t) it6.next();
            java.util.List list = tVar3.f547372e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                java.lang.String m34366xfb85ada3 = ((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9) obj).m34366xfb85ada3();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34366xfb85ada3, "getText(...)");
                if (m34366xfb85ada3.length() > 0) {
                    arrayList.add(obj);
                }
            }
            java.lang.String c17 = sVar.c(arrayList);
            java.lang.String str3 = tVar3.f547369b;
            java.lang.String b17 = sVar.b(c17, str3, "");
            java.util.Map map = (java.util.Map) sVar.f521691j.get(b17);
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(uu0.l.b(), b17);
            if (!r6Var2.m()) {
                r6Var2.J();
            }
            com.p314xaae8f345.mm.vfs.r6[] G = r6Var2.G();
            com.p314xaae8f345.mm.vfs.r6 r6Var3 = G != null ? (com.p314xaae8f345.mm.vfs.r6) kz5.z.O(G) : null;
            if (r6Var3 == null || map == null) {
                ru0.d dVar2 = new ru0.d(tVar3.f547368a, str3);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = sVar.f521689h;
                if (concurrentHashMap2.get(dVar2) != null) {
                    return;
                } else {
                    concurrentHashMap2.put(dVar2, p3325xe03a0797.p3326xc267989b.l.d(sVar.f521690i, null, null, new vu0.p(sVar, dVar2, arrayList, tVar3, null), 3, null));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioTimbreService", "submitSpeechRequest: cache cacheFile " + r6Var3.o());
                sVar.f521683b.c(new ru0.e(tVar3.f547368a, tVar3.f547369b, tVar3.f547370c, r6Var3, map));
            }
        }
    }
}
