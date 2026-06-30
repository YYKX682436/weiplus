package x0;

/* loaded from: classes14.dex */
public final class a0 extends x0.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x0.l0 map) {
        super(map);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        x0.m0.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        x0.m0.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!((obj instanceof java.util.Map.Entry) && (!(obj instanceof zz5.a) || (obj instanceof zz5.e)))) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532401d.get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        x0.l0 l0Var = this.f532401d;
        return new x0.u0(l0Var, ((p0.c) l0Var.b().f532434c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        if (!((obj instanceof java.util.Map.Entry) && (!(obj instanceof zz5.a) || (obj instanceof zz5.e)))) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        return this.f532401d.remove(element.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.Iterator it = elements.iterator();
        while (true) {
            boolean z17 = false;
            while (it.hasNext()) {
                if (this.f532401d.remove(((java.util.Map.Entry) it.next()).getKey()) != null || z17) {
                    z17 = true;
                }
            }
            return z17;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        p0.f fVar;
        int i17;
        boolean z17;
        x0.m i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.Collection<java.util.Map.Entry> collection = elements;
        int d17 = kz5.b1.d(kz5.d0.q(collection, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.util.Map.Entry entry : collection) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        x0.l0 l0Var = this.f532401d;
        boolean z18 = false;
        do {
            synchronized (x0.m0.f532445a) {
                x0.k0 k0Var = (x0.k0) x0.z.h((x0.k0) l0Var.f532436d, x0.z.i());
                fVar = k0Var.f532434c;
                i17 = k0Var.f532435d;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
            r0.f fVar2 = new r0.f((r0.d) fVar);
            java.lang.Object it = ((x0.a0) l0Var.f532437e).iterator();
            while (true) {
                z17 = true;
                if (!((x0.v0) it).m174772x2987b4ad()) {
                    break;
                }
                java.util.Map.Entry entry2 = (java.util.Map.Entry) ((x0.u0) it).next();
                if ((linkedHashMap.containsKey(entry2.getKey()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                    fVar2.remove(entry2.getKey());
                    z18 = true;
                }
            }
            r0.d b17 = fVar2.b();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, fVar)) {
                break;
            }
            synchronized (x0.m0.f532445a) {
                x0.k0 k0Var2 = (x0.k0) l0Var.f532436d;
                synchronized (x0.z.f532496b) {
                    i18 = x0.z.i();
                    x0.k0 k0Var3 = (x0.k0) x0.z.u(k0Var2, l0Var, i18);
                    if (k0Var3.f532435d == i17) {
                        k0Var3.c(b17);
                        k0Var3.f532435d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i18, l0Var);
            }
        } while (!z17);
        return z18;
    }
}
