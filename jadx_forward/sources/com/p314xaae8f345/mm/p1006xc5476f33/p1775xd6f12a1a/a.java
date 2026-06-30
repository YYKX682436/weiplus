package com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a;

/* loaded from: classes11.dex */
public class a implements com.p314xaae8f345.mm.p788xd6f12a1a.o, com.p314xaae8f345.mm.p788xd6f12a1a.r {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f223785d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Long f223786e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f223787f;

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a f223788g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f223789a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f223790b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f223791c;

    public a() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f223791c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5285x2f901cd4>(a0Var) { // from class: com.tencent.mm.plugin.hardcoder.HardCoderReporterImpl$1
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5285x2f901cd4 c5285x2f901cd4) {
                if (c5285x2f901cd4 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5285x2f901cd4) {
                    mo48814x2efc64();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.this;
                    if (!aVar.f223789a.isEmpty()) {
                        java.util.ArrayList arrayList = aVar.f223789a;
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayList.clone();
                        arrayList.clear();
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            android.util.Pair pair = (android.util.Pair) it.next();
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(((java.lang.Integer) pair.first).intValue(), (java.lang.Object[]) pair.second);
                        }
                    }
                    java.util.ArrayList arrayList3 = aVar.f223790b;
                    if (!arrayList3.isEmpty()) {
                        java.util.ArrayList arrayList4 = (java.util.ArrayList) arrayList3.clone();
                        arrayList3.clear();
                        java.util.Iterator it6 = arrayList4.iterator();
                        while (it6.hasNext()) {
                            java.lang.Object[] objArr = (java.lang.Object[]) it6.next();
                            if (objArr.length >= 4) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(((java.lang.Long) objArr[0]).longValue(), ((java.lang.Long) objArr[1]).longValue(), ((java.lang.Long) objArr[2]).longValue(), ((java.lang.Boolean) objArr[3]).booleanValue());
                            }
                        }
                    }
                }
                return false;
            }
        };
    }

    public final void a(int i17, java.lang.Object... objArr) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(i17, objArr);
        } else {
            if (gm0.j1.b().f354787q) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(i17, objArr);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HardCoderReporterImpl", "kvStat accountNotInitialReady!");
            this.f223791c.mo48813x58998cd();
            this.f223789a.add(new android.util.Pair(java.lang.Integer.valueOf(i17), objArr));
        }
    }
}
