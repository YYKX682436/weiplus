package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sn {

    /* renamed from: a, reason: collision with root package name */
    public final int f133022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f133023b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f133024c = "_night";

    /* renamed from: d, reason: collision with root package name */
    private final java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st> f133025d;

    public sn(int i17, int i18, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st> list) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        this.f133025d = copyOnWriteArrayList;
        this.f133022a = i17;
        this.f133023b = i18;
        copyOnWriteArrayList.addAll(list);
        java.util.Collections.sort(list, new java.util.Comparator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st>() { // from class: com.tencent.mapsdk.internal.sn.1
            private static int a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st stVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st stVar2) {
                return stVar2.a() - stVar.a();
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st stVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st stVar2) {
                return stVar2.a() - stVar.a();
            }
        });
    }

    private int b() {
        return this.f133023b;
    }

    public final java.lang.Object[] a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gb gbVar, boolean z17) {
        java.lang.String str;
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st stVar : this.f133025d) {
            if (stVar.a(gbVar)) {
                android.graphics.Bitmap a17 = stVar.a(z17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(stVar.f133070c);
                sb6.append(z17 ? "_night" : "");
                java.lang.String sb7 = sb6.toString();
                if (z17 && (str = stVar.f133072e) != null && str.length() > 0) {
                    return new java.lang.Object[]{sb7, stVar.f133072e, a17};
                }
                return new java.lang.Object[]{sb7, stVar.f133071d, a17};
            }
        }
        return null;
    }

    private int a() {
        return this.f133022a;
    }
}
