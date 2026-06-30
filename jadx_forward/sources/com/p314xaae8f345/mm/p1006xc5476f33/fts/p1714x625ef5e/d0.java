package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class d0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f219022n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f219023o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219024p;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, int[] iArr) {
        this.f219024p = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "MarkAllContactDirtyTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219024p;
        java.util.ArrayList arrayList = (java.util.ArrayList) lVar.f219121g.A(o13.d.f423758k, 1);
        this.f219022n = arrayList.size();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.d dVar = (p13.d) it.next();
            java.lang.String str = dVar.f432605b;
            if (!lVar.f219124m.containsKey(str)) {
                java.util.List list = (java.util.List) hashMap.get(str);
                if (list == null) {
                    list = new java.util.ArrayList(16);
                    hashMap.put(str, list);
                }
                list.add(java.lang.Long.valueOf(dVar.f432604a));
            }
        }
        lVar.f219124m.putAll(hashMap);
        this.f219023o = hashMap.size();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{touched: %d users: %d}", java.lang.Integer.valueOf(this.f219022n), java.lang.Integer.valueOf(this.f219023o));
    }
}
