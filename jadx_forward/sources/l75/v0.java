package l75;

/* loaded from: classes12.dex */
public abstract class v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f398502d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public int f398503a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Hashtable f398504b = new java.util.Hashtable();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f398505c = new java.util.HashSet();

    public synchronized void a(java.lang.Object obj, android.os.Looper looper) {
        if (!this.f398504b.containsKey(obj)) {
            if (looper != null) {
                this.f398504b.put(obj, new l75.u0(looper));
            } else {
                this.f398504b.put(obj, new java.lang.Object());
            }
        }
    }

    public synchronized void b(java.lang.Object obj, xu5.b bVar) {
        if (!this.f398504b.containsKey(obj)) {
            if (bVar != null) {
                this.f398504b.put(obj, new l75.u0(bVar));
            } else {
                this.f398504b.put(obj, new java.lang.Object());
            }
        }
    }

    public void c() {
        if (this.f398503a > 0) {
            return;
        }
        e();
    }

    public boolean d(java.lang.Object obj) {
        boolean add;
        synchronized (this.f398505c) {
            add = this.f398505c.add(obj);
        }
        return add;
    }

    public final void e() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f398504b.keySet());
        }
        if (arrayList.size() == 0 && !g()) {
            this.f398505c.clear();
            return;
        }
        synchronized (this.f398505c) {
            arrayList2 = new java.util.ArrayList(this.f398505c);
            this.f398505c.clear();
        }
        f(arrayList2);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            java.lang.Object obj = this.f398504b.get(next);
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (next2 != null && obj != null) {
                    if (obj instanceof l75.u0) {
                        l75.u0 u0Var = (l75.u0) obj;
                        l75.t0 t0Var = new l75.t0(this, next, next2);
                        xu5.b bVar = u0Var.f398501b;
                        if (bVar != null) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) hashMap.get(bVar);
                            if (n3Var == null) {
                                n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(u0Var.f398501b);
                                hashMap.put(u0Var.f398501b, n3Var);
                            }
                            n3Var.mo50293x3498a0(t0Var);
                        } else {
                            android.os.Looper looper = u0Var.f398500a;
                            if (looper != null) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) hashMap.get(looper);
                                if (n3Var2 == null) {
                                    n3Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(u0Var.f398500a);
                                    hashMap.put(u0Var.f398500a, n3Var2);
                                }
                                n3Var2.mo50293x3498a0(t0Var);
                            } else {
                                f398502d.mo50293x3498a0(t0Var);
                            }
                        }
                    } else {
                        h(next, next2);
                    }
                }
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            i(it7.next());
        }
    }

    public void f(java.util.List list) {
    }

    public boolean g() {
        return this instanceof r01.r;
    }

    public abstract void h(java.lang.Object obj, java.lang.Object obj2);

    public void i(java.lang.Object obj) {
    }

    public synchronized void j(java.lang.Object obj) {
        this.f398504b.remove(obj);
    }
}
