package a6;

/* loaded from: classes14.dex */
public final class y implements a6.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f83240a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f83241b;

    public y(h6.k kVar) {
    }

    @Override // a6.d0
    public synchronized void a(int i17) {
        if (i17 >= 10 && i17 != 20) {
            e();
        }
    }

    @Override // a6.d0
    public synchronized a6.r b(p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f83240a.get(key);
        a6.w wVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                a6.x xVar = (a6.x) arrayList.get(i17);
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) xVar.f83237b.get();
                a6.w wVar2 = bitmap == null ? null : new a6.w(bitmap, xVar.f83238c);
                if (wVar2 != null) {
                    wVar = wVar2;
                    break;
                }
                if (i18 > size) {
                    break;
                }
                i17 = i18;
            }
        }
        int i19 = this.f83241b;
        this.f83241b = i19 + 1;
        if (i19 >= 10) {
            e();
        }
        return wVar;
    }

    @Override // a6.d0
    public synchronized void c(p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc key, android.graphics.Bitmap bitmap, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        java.util.HashMap hashMap = this.f83240a;
        java.lang.Object obj = hashMap.get(key);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(key, obj);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        int identityHashCode = java.lang.System.identityHashCode(bitmap);
        a6.x xVar = new a6.x(identityHashCode, new java.lang.ref.WeakReference(bitmap), z17, i17);
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i18 = 0;
            while (true) {
                int i19 = i18 + 1;
                java.lang.Object obj2 = arrayList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "values[index]");
                a6.x xVar2 = (a6.x) obj2;
                if (i17 >= xVar2.f83239d) {
                    if (xVar2.f83236a == identityHashCode && xVar2.f83237b.get() == bitmap) {
                        arrayList.set(i18, xVar);
                    } else {
                        arrayList.add(i18, xVar);
                    }
                } else if (i19 > size) {
                    break;
                } else {
                    i18 = i19;
                }
            }
        }
        arrayList.add(xVar);
        int i27 = this.f83241b;
        this.f83241b = i27 + 1;
        if (i27 >= 10) {
            e();
        }
    }

    @Override // a6.d0
    public synchronized boolean d(android.graphics.Bitmap bitmap) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        int identityHashCode = java.lang.System.identityHashCode(bitmap);
        java.util.Collection values = this.f83240a.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "cache.values");
        java.util.Iterator it = values.iterator();
        loop0: while (true) {
            z17 = false;
            int i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) it.next();
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i18 = i17 + 1;
                    if (((a6.x) arrayList.get(i17)).f83236a == identityHashCode) {
                        arrayList.remove(i17);
                        z17 = true;
                        break loop0;
                    }
                    if (i18 > size) {
                        break;
                    }
                    i17 = i18;
                }
            }
        }
        int i19 = this.f83241b;
        this.f83241b = i19 + 1;
        if (i19 >= 10) {
            e();
        }
        return z17;
    }

    public final void e() {
        this.f83241b = 0;
        java.util.Iterator it = this.f83240a.values().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "iterator.next()");
            java.util.ArrayList arrayList = (java.util.ArrayList) next;
            if (arrayList.size() <= 1) {
                a6.x xVar = (a6.x) kz5.n0.Z(arrayList);
                if ((xVar == null ? null : (android.graphics.Bitmap) xVar.f83237b.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        int i19 = i17 + 1;
                        int i27 = i17 - i18;
                        if (((a6.x) arrayList.get(i27)).f83237b.get() == null) {
                            arrayList.remove(i27);
                            i18++;
                        }
                        if (i19 > size) {
                            break;
                        } else {
                            i17 = i19;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
