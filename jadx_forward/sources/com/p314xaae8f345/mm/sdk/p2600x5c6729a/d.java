package com.p314xaae8f345.mm.sdk.p2600x5c6729a;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.d f273903d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.d();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.g f273904a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.g();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f273905b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f273906c = new java.util.HashMap();

    public fm5.b a(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d) {
        fm5.b bVar;
        synchronized (this) {
            iz5.a.d("EventPoolImpl.add", abstractC20980x9b9ad01d);
            abstractC20980x9b9ad01d.m77669x78c2cdf();
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.i iVar = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.i) this.f273906c.get(java.lang.Integer.valueOf(abstractC20980x9b9ad01d.m77669x78c2cdf()));
            if (iVar == null) {
                java.util.HashMap hashMap = this.f273906c;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(abstractC20980x9b9ad01d.m77669x78c2cdf());
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.i iVar2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.i(this);
                hashMap.put(valueOf, iVar2);
                iVar = iVar2;
            }
            bVar = new fm5.b(abstractC20980x9b9ad01d, iVar);
            synchronized (iVar) {
                iVar.f345714d.add(bVar);
            }
        }
        return bVar;
    }

    public synchronized boolean b(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d) {
        int size;
        boolean contains;
        iz5.a.d("EventPoolImpl.hadListened", abstractC20980x9b9ad01d);
        java.util.List list = (java.util.List) this.f273905b.get(java.lang.Integer.valueOf(abstractC20980x9b9ad01d.m77669x78c2cdf()));
        if (list != null && !list.isEmpty() && list.contains(abstractC20980x9b9ad01d)) {
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.i iVar = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.i) this.f273906c.get(java.lang.Integer.valueOf(abstractC20980x9b9ad01d.m77669x78c2cdf()));
        if (iVar != null) {
            synchronized (iVar) {
                size = iVar.f345714d.size();
            }
            if (size > 0) {
                synchronized (iVar) {
                    contains = iVar.f345714d.contains(new fm5.b(abstractC20980x9b9ad01d, iVar));
                }
                if (contains) {
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized boolean c(java.lang.Class cls) {
        int size;
        iz5.a.d("EventPoolImpl.hasListener", cls);
        java.util.List list = (java.util.List) this.f273905b.get(java.lang.Integer.valueOf(cls.getName().hashCode()));
        if (list != null && list.size() > 0) {
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.i iVar = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.i) this.f273906c.get(java.lang.Integer.valueOf(cls.getName().hashCode()));
        if (iVar != null) {
            synchronized (iVar) {
                size = iVar.f345714d.size();
            }
            if (size > 0) {
                return true;
            }
        }
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.p314xaae8f345.mm.sdk.p2600x5c6729a.n.class)).all()).iterator();
        while (it.hasNext()) {
            if (((fs.q) it.next()).mo210xb7045565(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean d(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1, boolean z17) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.i iVar;
        int i17;
        boolean z18;
        java.lang.Runnable runnable;
        java.util.LinkedList linkedList;
        iz5.a.d("EventPoolImpl.publish", abstractC20979x809547d1);
        abstractC20979x809547d1.a();
        java.lang.Class<?> cls = abstractC20979x809547d1.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(32);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.p314xaae8f345.mm.sdk.p2600x5c6729a.n.class)).all()).iterator();
        while (true) {
            fs.f fVar = (fs.f) it;
            if (!fVar.hasNext()) {
                break;
            }
            fs.q qVar = (fs.q) fVar.next();
            if (fs.g.e(context, qVar) && qVar.mo210xb7045565(cls)) {
                arrayList.add((com.p314xaae8f345.mm.sdk.p2600x5c6729a.n) qVar.get());
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EventCenter", "publishing " + abstractC20979x809547d1 + " to " + arrayList.size() + "listeners:");
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EventCenter", " - " + ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.n) it6.next()));
            }
        }
        boolean z19 = !arrayList.isEmpty();
        synchronized (this) {
            int a17 = abstractC20979x809547d1.a();
            java.util.List list = (java.util.List) this.f273905b.get(java.lang.Integer.valueOf(a17));
            if (list != null) {
                new java.util.ArrayList(list);
                z19 = true;
            }
            iVar = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.i) this.f273906c.get(java.lang.Integer.valueOf(a17));
            if (iVar != null) {
                z19 = true;
            }
            i17 = 0;
            if (!z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EventCenter", "No listener for this event %s(%d), Stack: %s.", abstractC20979x809547d1, java.lang.Integer.valueOf(a17), "");
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.sdk.p2600x5c6729a.e(this));
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.n nVar = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.n) it7.next();
                bm5.u1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, nVar.getClass().getName());
                if (nVar.mo778xf5bc2045(abstractC20979x809547d1) && abstractC20979x809547d1.f273898e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EventCenter", "event '%s' was consumed by listener '%s' so it will not be passed to other listeners.", abstractC20979x809547d1, arrayList);
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (iVar != null) {
            nm5.b c17 = nm5.j.c(abstractC20979x809547d1, java.lang.Boolean.valueOf(z18));
            synchronized (iVar) {
                linkedList = new java.util.LinkedList(iVar.f345714d);
            }
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d12 = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1) c17.a(0);
            if (abstractC20979x809547d12 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EventCenter", "event is null! fatal!");
            } else {
                if (!((java.lang.Boolean) c17.a(1)).booleanValue()) {
                    if (abstractC20979x809547d12.f273898e) {
                        java.util.Collections.sort(linkedList, new com.p314xaae8f345.mm.sdk.p2600x5c6729a.h(iVar));
                    }
                    int size = linkedList.size();
                    fm5.b[] bVarArr = new fm5.b[size];
                    linkedList.toArray(bVarArr);
                    while (true) {
                        if (i17 >= size) {
                            break;
                        }
                        fm5.b bVar = bVarArr[i17];
                        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) bVar.f345717e;
                        bm5.u1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, abstractC20980x9b9ad01d.getClass().getName());
                        if (abstractC20980x9b9ad01d.mo1xf5bc2045(abstractC20979x809547d12) && abstractC20979x809547d12.f273898e) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EventCenter", "event '%s' was consumed by listener '%s' so it will not be passed to other listeners.", abstractC20979x809547d12, bVar.f345717e);
                            break;
                        }
                        i17++;
                    }
                }
                java.lang.Runnable runnable2 = abstractC20979x809547d12.f273897d;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        } else if (!arrayList.isEmpty() && (runnable = abstractC20979x809547d1.f273897d) != null) {
            runnable.run();
        }
        return z19;
    }
}
