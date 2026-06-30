package ga4;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static android.os.HandlerThread f351465e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f351466f;

    /* renamed from: a, reason: collision with root package name */
    public static final ga4.m f351461a = new ga4.m();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f351462b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(100);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f351463c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f351464d = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f351467g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public static r26.t f351468h = new r26.t("");

    /* renamed from: i, reason: collision with root package name */
    public static final l75.q0 f351469i = ga4.h.f351456d;

    public static final /* synthetic */ java.util.HashMap a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getKeywordsHashMap$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        java.util.HashMap hashMap = f351464d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getKeywordsHashMap$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        return hashMap;
    }

    public static final /* synthetic */ android.os.HandlerThread b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSpanThread$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        android.os.HandlerThread handlerThread = f351465e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSpanThread$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        return handlerThread;
    }

    public static final void c() {
        java.lang.String str;
        java.lang.String str2 = "loadFinderKeywords";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadFinderKeywords", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        java.util.HashMap hashMap = f351464d;
        hashMap.clear();
        f351462b.d(-1);
        f351468h = new r26.t("");
        zy2.lb lbVar = (zy2.lb) i95.n0.c(zy2.lb.class);
        if (lbVar != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.gj0 gj0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.gj0) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.t4) lbVar).f207748d).mo141623x754a37bb();
            gj0Var.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.database.Cursor B = gj0Var.f208377d.B("select * from FinderSnsKeyWordsJumpConfig", null);
            if (B != null) {
                while (B.moveToNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0 fj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0();
                    fj0Var.mo9015xbf5d97fd(B);
                    arrayList2.add(fj0Var);
                }
                B.close();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSnsKeyWordsStorage", "getAllData size:" + arrayList2.size());
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0 fj0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0) it.next();
                zy2.kb kbVar = new zy2.kb(fj0Var2.f66248x88be67a1);
                kbVar.f558978b = fj0Var2.f66250x1bb3b54a;
                kbVar.f558979c = fj0Var2.f66244x14c61803;
                kbVar.f558980d = fj0Var2.f66247x43f93fc4;
                kbVar.f558981e = fj0Var2.f66249xac36557b;
                arrayList.add(kbVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSnsKeyWordsService", "dataList " + arrayList + ", size:" + arrayList.size());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDone", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsKeywordMatcher", "loadFinderKeywords callback no data.");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDone", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1");
                str = "loadFinderKeywords";
            } else {
                long j17 = 1000;
                long currentTimeMillis = java.lang.System.currentTimeMillis() / j17;
                java.util.Iterator it6 = arrayList.iterator();
                java.lang.Object obj = "";
                long j18 = currentTimeMillis;
                long j19 = j18;
                while (it6.hasNext()) {
                    java.util.Iterator it7 = it6;
                    zy2.kb kbVar2 = (zy2.kb) it6.next();
                    java.lang.String str3 = str2;
                    long j27 = j17;
                    long j28 = kbVar2.f558978b;
                    if (currentTimeMillis < j28) {
                        if (j19 < j28) {
                            j19 = j28;
                        }
                    } else if (currentTimeMillis < kbVar2.f558979c) {
                        a().put(kbVar2.f558980d, kbVar2);
                        long j29 = kbVar2.f558979c;
                        if (j18 < j29) {
                            j18 = j29;
                        }
                    }
                    str2 = str3;
                    it6 = it7;
                    j17 = j27;
                }
                str = str2;
                long j37 = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKeywordMatcher", "loadFinderKeywords done. dataList size:" + arrayList.size() + ", keywordsHashMap size:" + a().size() + ", minStartTime:" + j19 + ", minEndTime:" + j18);
                if (a() != null && a().size() > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    java.lang.String pattern = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b0.f272719u.toString();
                    java.util.Iterator it8 = hashMap.entrySet().iterator();
                    boolean z17 = true;
                    while (it8.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it8.next();
                        if (z17) {
                            obj = entry.getKey();
                            z17 = false;
                        } else {
                            java.util.Iterator it9 = it8;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append((java.lang.String) obj);
                            sb6.append('|');
                            obj = sb6.toString() + ((java.lang.String) entry.getKey());
                            it8 = it9;
                            z17 = z17;
                        }
                    }
                    f351468h = new r26.t(java.lang.String.valueOf(pattern + "|(" + ((java.lang.String) obj) + ')'));
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("finished build keywords keywordRegexs:");
                    sb7.append(f351468h);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKeywordMatcher", sb7.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                }
                if (j19 <= currentTimeMillis) {
                    j19 = j18;
                } else if (j18 > currentTimeMillis) {
                    j19 = java.lang.Math.min(j19, j18);
                }
                if (j19 > currentTimeMillis) {
                    ga4.g gVar = ga4.g.f351455d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$queue", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    f351461a.e((j19 - currentTimeMillis) * j37, gVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$queue", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDone", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1");
            }
            str2 = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
    }

    public static final void d(java.lang.String str) {
        r26.t tVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putMatchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (tVar = f351468h) != null) {
            java.lang.String pattern = tVar.f450450d.pattern();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pattern, "pattern(...)");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pattern)) {
                if (f351462b.get(str) == null) {
                    ga4.m mVar = f351461a;
                    ga4.i iVar = new ga4.i(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("queue$default", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    mVar.e(0L, iVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queue$default", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putMatchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putMatchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static final java.lang.CharSequence f(long j17, java.lang.CharSequence charSequence, int i17, int i18) {
        ga4.c cVar;
        java.lang.CharSequence content = charSequence;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = f351462b;
        if (r2Var == null || r2Var.m77804x35e001() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            return content;
        }
        ?? r66 = 1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_sns_keyword", "0", false, true), 0) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsKeywordMatcher", "switch close.");
            g();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            return content;
        }
        android.os.SystemClock.elapsedRealtime();
        synchronized (f351463c) {
            try {
                cVar = (ga4.c) r2Var.get(charSequence.toString());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                throw th6;
            }
        }
        if (cVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            java.util.ArrayList arrayList = new java.util.ArrayList(cVar.f351440b);
            if (!arrayList.isEmpty()) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(content);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ga4.a aVar = (ga4.a) it.next();
                    aVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    java.lang.String str = aVar.f351436c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    int i19 = aVar.f351434a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildKeywordSpan", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    ga4.b bVar = new ga4.b(str, i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                    java.lang.String m07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m07)) {
                        if (r26.i0.p(m07, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI", r66)) {
                            f0Var.f391649d = r66;
                        } else if (r26.i0.p(m07, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI", r66)) {
                            f0Var.f391649d = 2;
                        }
                    }
                    java.util.Iterator it6 = it;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new ga4.d(j17, i17, str, i19, f0Var));
                    ga4.f fVar = new ga4.f(j17, i17, i19, f0Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCallBack", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
                    bVar.f351438e = fVar;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCallBack", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildKeywordSpan", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    int i27 = aVar.f351434a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    spannableStringBuilder.setSpan(bVar, i27, aVar.f351435b + 1, 18);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    it = it6;
                    r66 = 1;
                }
                content = spannableStringBuilder;
            }
        }
        android.os.SystemClock.elapsedRealtime();
        java.lang.CharSequence charSequence2 = content;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        return charSequence2;
    }

    public static final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        pm0.v.K(null, ga4.l.f351460d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r5, final yz5.a r7) {
        /*
            r4 = this;
            java.lang.String r0 = "queue"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.Object r0 = ga4.m.f351467g
            monitor-enter(r0)
            com.tencent.mm.sdk.platformtools.n3 r1 = ga4.m.f351466f     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            if (r1 == 0) goto L21
            android.os.HandlerThread r1 = ga4.m.f351465e     // Catch: java.lang.Throwable -> L4a
            r3 = 1
            if (r1 == 0) goto L1d
            boolean r1 = r1.isAlive()     // Catch: java.lang.Throwable -> L4a
            if (r1 != r3) goto L1d
            r1 = r3
            goto L1e
        L1d:
            r1 = r2
        L1e:
            if (r1 == 0) goto L21
            r2 = r3
        L21:
            monitor-exit(r0)
            if (r2 != 0) goto L35
            java.lang.String r5 = "MicroMsg.SnsKeywordMatcher"
            java.lang.String r6 = "queue thread already release"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r6)
            java.lang.String r5 = "queue"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
            return
        L35:
            com.tencent.mm.sdk.platformtools.n3 r0 = ga4.m.f351466f
            if (r0 == 0) goto L41
            ga4.j r1 = new ga4.j
            r1.<init>(r7)
            r0.mo50297x7c4d7ca2(r1, r5)
        L41:
            java.lang.String r5 = "queue"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
            return
        L4a:
            r5 = move-exception
            monitor-exit(r0)
            java.lang.String r6 = "queue"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ga4.m.e(long, yz5.a):void");
    }
}
