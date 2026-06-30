package hz1;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final hz1.c f367836a = new hz1.c();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f367837b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f367838c = 0;

    public void a(hz1.a aVar) {
        if (aVar == null) {
            return;
        }
        java.util.List list = this.f367837b;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
        while (it.hasNext()) {
            if (((hz1.a) it.next()).d(aVar)) {
                return;
            }
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(aVar);
    }

    public java.util.List b(boolean z17) {
        hz1.c cVar = this.f367836a;
        if (cVar.c() <= 0) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) cVar.a(z17)).iterator();
        while (it.hasNext()) {
            hz1.a aVar = (hz1.a) it.next();
            if (!aVar.f367831l) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public hz1.a c(int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f367836a.a(true)).iterator();
        while (it.hasNext()) {
            hz1.a aVar = (hz1.a) it.next();
            if (i17 == aVar.f367820a) {
                return aVar;
            }
        }
        return null;
    }

    public hz1.a d(java.lang.Object obj, boolean z17) {
        if (obj == null) {
            return null;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f367836a.a(true)).iterator();
        while (it.hasNext()) {
            hz1.a aVar = (hz1.a) it.next();
            if (obj.hashCode() == aVar.f367820a) {
                return aVar;
            }
        }
        java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArrayList) this.f367837b).iterator();
        while (it6.hasNext()) {
            hz1.a aVar2 = (hz1.a) it6.next();
            if (obj.hashCode() == aVar2.f367820a) {
                return aVar2;
            }
        }
        if (z17) {
            return new hz1.a(obj);
        }
        return null;
    }

    public hz1.a e() {
        hz1.c cVar = this.f367836a;
        if (cVar.c() <= 0) {
            return null;
        }
        java.util.Iterator it = ((java.util.ArrayList) cVar.a(true)).iterator();
        while (it.hasNext()) {
            hz1.a aVar = (hz1.a) it.next();
            if (!aVar.f367831l) {
                return aVar;
            }
        }
        return null;
    }

    public void f(hz1.a aVar) {
        int i17;
        if (aVar == null) {
            return;
        }
        hz1.c cVar = this.f367836a;
        java.util.ArrayList arrayList = (java.util.ArrayList) cVar.a(true);
        if (arrayList.size() > 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hz1.a aVar2 = (hz1.a) it.next();
                if (aVar.d(aVar2)) {
                    arrayList2.add(aVar2);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                cVar.b((hz1.a) it6.next());
            }
        }
        hz1.c cVar2 = this.f367836a;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) cVar2.a(true);
        int i18 = 0;
        if (arrayList3.size() > 0) {
            java.util.Iterator it7 = arrayList3.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    i17 = 0;
                    break;
                }
                hz1.a aVar3 = (hz1.a) it7.next();
                if (u46.l.c(aVar3.f367823d, aVar.f367823d) && (i17 = aVar3.f367830k) != aVar.f367830k) {
                    break;
                }
            }
            java.util.Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                hz1.a aVar4 = (hz1.a) it8.next();
                if (aVar4.f367830k == i17) {
                    cVar2.b(aVar4);
                }
            }
        }
        int i19 = aVar.f367830k;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hz1.c cVar3 = this.f367836a;
        java.util.Iterator it9 = ((java.util.ArrayList) cVar3.a(true)).iterator();
        while (it9.hasNext()) {
            hz1.a aVar5 = (hz1.a) it9.next();
            int i27 = aVar5.f367830k;
            if (i27 > 0 && i27 != this.f367838c) {
                if (aVar5.f367831l) {
                    java.lang.Integer num = (java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(i27));
                    if (num == null) {
                        num = 0;
                    }
                    hashMap2.put(java.lang.Integer.valueOf(aVar5.f367830k), java.lang.Integer.valueOf(num.intValue() + 1));
                } else {
                    java.lang.Integer num2 = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i27));
                    if (num2 == null) {
                        num2 = 0;
                    }
                    hashMap.put(java.lang.Integer.valueOf(aVar5.f367830k), java.lang.Integer.valueOf(num2.intValue() + 1));
                }
            }
        }
        java.util.Iterator it10 = ((java.util.ArrayList) cVar3.a(true)).iterator();
        while (it10.hasNext()) {
            hz1.a aVar6 = (hz1.a) it10.next();
            int i28 = aVar6.f367830k;
            if (i28 > 0 && i28 != this.f367838c && i28 != i19) {
                java.lang.Integer num3 = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i28));
                java.lang.Integer num4 = (java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(aVar6.f367830k));
                if (num3 == null || num3.intValue() <= 0) {
                    if (num4 == null || num4.intValue() <= 1) {
                        cVar3.b(aVar6);
                    }
                }
            }
        }
        aVar.f367831l = false;
        java.util.Iterator it11 = ((java.util.ArrayList) this.f367836a.a(false)).iterator();
        while (it11.hasNext()) {
            if (!((hz1.a) it11.next()).f367831l) {
                i18++;
            }
        }
        aVar.f367829j = i18;
        hz1.c cVar4 = this.f367836a;
        synchronized (cVar4.f367839a) {
            java.util.Iterator it12 = ((java.util.ArrayList) cVar4.f367839a).iterator();
            while (true) {
                if (!it12.hasNext()) {
                    ((java.util.ArrayList) cVar4.f367839a).add(aVar);
                    break;
                } else if (((hz1.a) it12.next()).d(aVar)) {
                    break;
                }
            }
        }
        int c17 = this.f367836a.c();
        if (pz1.a.a() && c17 > pz1.a.f440710b) {
            pz1.a.f440710b = c17;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add("3");
            arrayList4.add(java.lang.String.valueOf(c17));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(24504, arrayList4);
        }
    }
}
