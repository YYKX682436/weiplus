package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static km2.m f197141b = null;

    /* renamed from: c, reason: collision with root package name */
    public static long f197142c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f197143d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f197144e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f197145f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f197146g;

    /* renamed from: h, reason: collision with root package name */
    public static long f197147h;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0 f197140a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0();

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o2 f197148i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o2(0, null, 3, null);

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.ArrayList f197149j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Set f197150k = new java.util.LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.ArrayList f197151l = new java.util.ArrayList();

    public final void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideStatusReport", "clear from=" + str);
        java.util.Set set = f197150k;
        synchronized (set) {
            set.clear();
        }
        java.util.ArrayList arrayList = f197149j;
        synchronized (arrayList) {
            arrayList.clear();
        }
        java.util.ArrayList arrayList2 = f197151l;
        synchronized (arrayList2) {
            arrayList2.clear();
        }
        f197148i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o2(0L, null, 3, null);
        f197147h = 0L;
        f197142c = -1L;
        f197144e = false;
        f197145f = -1;
        f197141b = null;
        f197143d = 0;
        f197146g = false;
    }

    public final int b() {
        km2.t c17;
        boolean z17;
        km2.n nVar = dk2.ef.H;
        int d17 = nVar != null ? nVar.d() : 0;
        km2.n nVar2 = dk2.ef.H;
        if (nVar2 == null || (c17 = nVar2.c()) == null) {
            return 0;
        }
        km2.n nVar3 = dk2.ef.H;
        if (nVar3 != null) {
            km2.m mVar = c17.f390755d;
            if (mVar == null) {
                return 0;
            }
            z17 = nVar3.f390685d.contains(mVar);
        } else {
            z17 = false;
        }
        km2.n nVar4 = dk2.ef.H;
        int size = nVar4 != null ? nVar4.f390685d.size() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCurSelectedOffsetPos historyLiveSize=");
        sb6.append(size);
        sb6.append(" isHistoryLive=");
        sb6.append(z17);
        sb6.append(" curPos=");
        sb6.append(d17);
        sb6.append(" offsetPos=");
        int i17 = d17 - size;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideStatusReport", sb6.toString());
        if (z17) {
            return -1;
        }
        return i17 >= 0 ? i17 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r17, co0.s r18) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.c(int, co0.s):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r25, r45.un5 r26, km2.m r27, tn0.w0 r28) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.d(android.content.Context, r45.un5, km2.m, tn0.w0):void");
    }
}
