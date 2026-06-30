package gs5;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static kr5.g f356701a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Runnable f356702b = new gs5.d();

    public static void a(java.lang.String str, tr5.g0 g0Var) {
        kr5.c cVar;
        if (g0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupResult".concat(" can not be null"));
        }
        tr5.q qVar = g0Var.f503026e;
        if (!(qVar instanceof fs5.c)) {
            or5.b.e("lookupResult.stat is not instanceof StatisticsMerge", new java.lang.Object[0]);
            return;
        }
        fs5.c cVar2 = (fs5.c) qVar;
        kr5.c c17 = kr5.c.c();
        java.lang.String b17 = c17.b();
        int i17 = cVar2.f347889h;
        java.lang.String str2 = gs5.b.f356697a;
        java.lang.String str3 = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : "dual" : "aaaa" : "a";
        kr5.g gVar = f356701a;
        boolean z17 = gVar.f393088j;
        bs5.g gVar2 = cVar2.f347891m;
        if (gVar2.f105569s) {
            return;
        }
        int i18 = gVar2.f105562i;
        if (i18 == 0) {
            java.lang.Integer num = 0;
            c17.f393059a.set(num.intValue());
            or5.b.a(java.lang.Thread.currentThread().getName() + " set mErrorCount: " + num, new java.lang.Object[0]);
            if (z17) {
                lr5.f fVar = lr5.e.f402302b;
                java.lang.String str4 = cVar2.f347885d;
                kr5.g gVar3 = f356701a;
                java.lang.String str5 = gVar3.f393081c.f105589b;
                java.lang.String str6 = gVar3.f393080b;
                java.lang.String str7 = gVar3.f393087i;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                bs5.g gVar4 = cVar2.f347891m;
                ((lr5.c) fVar).execute(gs5.b.a(str4, str5, str6, str7, str, currentTimeMillis, b17, gVar4.f347882f, r7.f347882f, cVar2.f347887f, str3, f356701a.f393082d, gVar4.f105565o, gVar4.f105562i, gVar4.f105572v, gVar4.f105569s, 1, sr5.a.f(cVar2.f347890i.f347880d, ","), sr5.a.f(cVar2.f347891m.f347880d, ",")));
                return;
            }
            return;
        }
        if (i18 != 2 && (!"Https".equals(gVar.f393087i) || cVar2.f347891m.f105562i != 1)) {
            if (z17) {
                lr5.f fVar2 = lr5.e.f402302b;
                java.lang.String str8 = cVar2.f347885d;
                kr5.g gVar5 = f356701a;
                java.lang.String str9 = gVar5.f393081c.f105589b;
                java.lang.String str10 = gVar5.f393080b;
                java.lang.String str11 = gVar5.f393087i;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                bs5.g gVar6 = cVar2.f347891m;
                ((lr5.c) fVar2).execute(gs5.b.a(str8, str9, str10, str11, str, currentTimeMillis2, b17, gVar6.f347882f, r15.f347882f, cVar2.f347887f, str3, f356701a.f393082d, gVar6.f105565o, gVar6.f105562i, gVar6.f105572v, gVar6.f105569s, 1, sr5.a.f(cVar2.f347890i.f347880d, ","), sr5.a.f(cVar2.f347891m.f347880d, ",")));
                return;
            }
            return;
        }
        if (z17) {
            if (c17.f393059a.get() + 1 >= 3) {
                lr5.f fVar3 = lr5.e.f402302b;
                java.lang.String str12 = cVar2.f347885d;
                kr5.g gVar7 = f356701a;
                java.lang.String str13 = gVar7.f393081c.f105589b;
                java.lang.String str14 = gVar7.f393080b;
                java.lang.String str15 = gVar7.f393087i;
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                bs5.g gVar8 = cVar2.f347891m;
                long j17 = gVar8.f347882f;
                wr5.a aVar = cVar2.f347890i;
                long j18 = aVar.f347882f;
                java.lang.String str16 = cVar2.f347887f;
                long j19 = f356701a.f393082d;
                java.util.Map map = gVar8.f105565o;
                long j27 = gVar8.f105562i;
                int i19 = gVar8.f105572v;
                boolean z18 = gVar8.f105569s;
                java.lang.String f17 = sr5.a.f(aVar.f347880d, ",");
                java.lang.String f18 = sr5.a.f(cVar2.f347891m.f347880d, ",");
                cVar = c17;
                ((lr5.c) fVar3).execute(gs5.b.a(str12, str13, str14, str15, str, currentTimeMillis3, b17, j17, j18, str16, str3, j19, map, j27, i19, z18, 1, f17, f18));
                or5.b.a(java.lang.Thread.currentThread().getName() + " increment mErrorCount: " + java.lang.Integer.valueOf(cVar.f393059a.incrementAndGet()), new java.lang.Object[0]);
            }
        }
        cVar = c17;
        or5.b.a(java.lang.Thread.currentThread().getName() + " increment mErrorCount: " + java.lang.Integer.valueOf(cVar.f393059a.incrementAndGet()), new java.lang.Object[0]);
    }

    public static void b(kr5.g gVar) {
        if (gVar == null) {
            throw new java.lang.IllegalArgumentException("dnsConfig".concat(" can not be null"));
        }
        f356701a = gVar;
        java.util.Random random = new java.util.Random();
        char[] cArr = new char[12];
        for (int i17 = 0; i17 < 12; i17++) {
            cArr[i17] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62));
        }
        gs5.g.f356703a = new java.lang.String(cArr);
        ((lr5.c) lr5.e.f402302b).b(f356702b, 300000L);
        gs5.e eVar = new gs5.e();
        java.util.List list = nr5.c.f420875a;
        synchronized (nr5.c.class) {
            if (nr5.c.f420876b) {
                ((java.util.concurrent.CopyOnWriteArrayList) nr5.c.f420875a).add(eVar);
            }
        }
    }

    public static void c(java.lang.String str, java.util.Map map) {
        java.util.List list = rr5.a.f480767a;
        if (android.text.TextUtils.isEmpty(str) || map == null) {
            return;
        }
        boolean z17 = true;
        if (2 >= or5.b.f429236a) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                or5.b.a("%s: %s", entry.getKey(), entry.getValue());
            }
        }
        java.util.List list2 = rr5.a.f480767a;
        if (list2.isEmpty() && rr5.a.f480768b.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            or5.b.a("HTTPDNS_SDK_VER:4.11.0a, Try to report %s", str);
            java.util.Iterator it = list2.iterator();
            if (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                throw null;
            }
            java.util.Iterator it6 = rr5.a.f480768b.iterator();
            if (it6.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
                throw null;
            }
        }
    }
}
