package a66;

/* loaded from: classes16.dex */
public final class c implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Set f83329d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f83330e;

    public static void f(java.util.Collection collection) {
        if (collection == null) {
            return;
        }
        java.util.Iterator it = collection.iterator();
        java.util.ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((p56.s) it.next()).c();
            } catch (java.lang.Throwable th6) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(th6);
            }
        }
        q56.f.a(arrayList);
    }

    public void a(p56.s sVar) {
        if (sVar.b()) {
            return;
        }
        if (!this.f83330e) {
            synchronized (this) {
                if (!this.f83330e) {
                    if (this.f83329d == null) {
                        this.f83329d = new java.util.HashSet(4);
                    }
                    this.f83329d.add(sVar);
                    return;
                }
            }
        }
        sVar.c();
    }

    @Override // p56.s
    public boolean b() {
        return this.f83330e;
    }

    @Override // p56.s
    public void c() {
        if (this.f83330e) {
            return;
        }
        synchronized (this) {
            if (this.f83330e) {
                return;
            }
            this.f83330e = true;
            java.util.Set set = this.f83329d;
            this.f83329d = null;
            f(set);
        }
    }

    public void d() {
        java.util.Set set;
        if (this.f83330e) {
            return;
        }
        synchronized (this) {
            if (!this.f83330e && (set = this.f83329d) != null) {
                this.f83329d = null;
                f(set);
            }
        }
    }

    public void e(p56.s sVar) {
        java.util.Set set;
        if (this.f83330e) {
            return;
        }
        synchronized (this) {
            if (!this.f83330e && (set = this.f83329d) != null) {
                boolean remove = set.remove(sVar);
                if (remove) {
                    sVar.c();
                }
            }
        }
    }
}
