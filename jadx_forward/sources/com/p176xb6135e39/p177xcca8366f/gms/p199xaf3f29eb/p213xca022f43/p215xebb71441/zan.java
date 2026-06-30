package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441;

/* loaded from: classes13.dex */
public final class zan extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zan> f5992x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zao();
    final int zaa;
    private final java.util.HashMap zab;
    private final java.lang.String zac;

    public zan(int i17, java.util.ArrayList arrayList, java.lang.String str) {
        this.zaa = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zal zalVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zal) arrayList.get(i18);
            java.lang.String str2 = zalVar.zab;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            int size2 = ((java.util.ArrayList) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zalVar.zac)).size();
            for (int i19 = 0; i19 < size2; i19++) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zam zamVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zam) zalVar.zac.get(i19);
                hashMap2.put(zamVar.zab, zamVar.zac);
            }
            hashMap.put(str2, hashMap2);
        }
        this.zab = hashMap;
        this.zac = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        zad();
    }

    /* renamed from: toString */
    public final java.lang.String m18490x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : this.zab.keySet()) {
            sb6.append(str);
            sb6.append(":\n");
            java.util.Map map = (java.util.Map) this.zab.get(str);
            for (java.lang.String str2 : map.keySet()) {
                sb6.append("  ");
                sb6.append(str2);
                sb6.append(": ");
                sb6.append(map.get(str2));
            }
        }
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zaa);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.zab.keySet()) {
            arrayList.add(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zal(str, (java.util.Map) this.zab.get(str)));
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 2, arrayList, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, this.zac, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final java.lang.String zaa() {
        return this.zac;
    }

    public final java.util.Map zab(java.lang.String str) {
        return (java.util.Map) this.zab.get(str);
    }

    public final void zac() {
        for (java.lang.String str : this.zab.keySet()) {
            java.util.Map map = (java.util.Map) this.zab.get(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str2 : map.keySet()) {
                hashMap.put(str2, ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field) map.get(str2)).zab());
            }
            this.zab.put(str, hashMap);
        }
    }

    public final void zad() {
        java.util.Iterator it = this.zab.keySet().iterator();
        while (it.hasNext()) {
            java.util.Map map = (java.util.Map) this.zab.get((java.lang.String) it.next());
            java.util.Iterator it6 = map.keySet().iterator();
            while (it6.hasNext()) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field) map.get((java.lang.String) it6.next())).zai(this);
            }
        }
    }

    public final void zae(java.lang.Class cls, java.util.Map map) {
        this.zab.put((java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(cls.getCanonicalName()), map);
    }

    public final boolean zaf(java.lang.Class cls) {
        return this.zab.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(cls.getCanonicalName()));
    }

    public zan(java.lang.Class cls) {
        this.zaa = 1;
        this.zab = new java.util.HashMap();
        this.zac = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(cls.getCanonicalName());
    }
}
