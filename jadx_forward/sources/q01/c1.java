package q01;

/* loaded from: classes12.dex */
public final class c1 extends java.util.Vector {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f440799d = new java.util.ArrayList();

    @Override // java.util.Vector, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean add(java.lang.Object obj) {
        boolean add;
        add = super.add(obj);
        if (add) {
            d(obj, super.size() - 1);
        }
        return add;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean addAll(java.util.Collection elements) {
        boolean addAll;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        int size = super.size();
        addAll = super.addAll(elements);
        if (addAll) {
            java.util.Iterator it = elements.iterator();
            while (it.hasNext()) {
                int i17 = size + 1;
                d(it.next(), size);
                size = i17;
            }
        }
        return addAll;
    }

    @Override // java.util.Vector
    public synchronized void addElement(java.lang.Object obj) {
        super.addElement(obj);
        d(obj, super.size() - 1);
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        super.clear();
    }

    public final void d(java.lang.Object obj, int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f440799d).iterator();
        while (it.hasNext()) {
            q01.b0 b0Var = (q01.b0) ((q01.b1) it.next());
            b0Var.getClass();
            com.p314xaae8f345.mm.p944x882e457a.m1 element = (com.p314xaae8f345.mm.p944x882e457a.m1) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
            int size = super.size();
            q01.e0 e0Var = q01.e0.f440803a;
            if (size >= gm0.j1.d().f152299f) {
                e0Var.b();
            }
            b0Var.b(element);
        }
    }

    public final void e(java.lang.Object obj, int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f440799d).iterator();
        while (it.hasNext()) {
            q01.b0 b0Var = (q01.b0) ((q01.b1) it.next());
            b0Var.getClass();
            com.p314xaae8f345.mm.p944x882e457a.m1 element = (com.p314xaae8f345.mm.p944x882e457a.m1) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
            int size = super.size();
            q01.e0 e0Var = q01.e0.f440803a;
            if (size < gm0.j1.d().f152299f) {
                e0Var.b();
            }
            b0Var.a(element);
        }
    }

    public final void g(java.lang.Object obj, java.lang.Object obj2, int i17) {
        java.util.Iterator it = this.f440799d.iterator();
        while (it.hasNext()) {
            q01.b0 b0Var = (q01.b0) ((q01.b1) it.next());
            b0Var.getClass();
            com.p314xaae8f345.mm.p944x882e457a.m1 oldElement = (com.p314xaae8f345.mm.p944x882e457a.m1) obj;
            com.p314xaae8f345.mm.p944x882e457a.m1 newElement = (com.p314xaae8f345.mm.p944x882e457a.m1) obj2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldElement, "oldElement");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newElement, "newElement");
            b0Var.b(newElement);
            b0Var.a(oldElement);
        }
    }

    public final void h(java.util.Collection removes) {
        java.util.Iterator it = ((java.util.ArrayList) this.f440799d).iterator();
        while (it.hasNext()) {
            q01.b0 b0Var = (q01.b0) ((q01.b1) it.next());
            b0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(removes, "removes");
            int size = super.size();
            q01.e0 e0Var = q01.e0.f440803a;
            if (size < gm0.j1.d().f152299f) {
                e0Var.b();
            }
            java.util.Iterator it6 = removes.iterator();
            while (it6.hasNext()) {
                b0Var.a((com.p314xaae8f345.mm.p944x882e457a.m1) it6.next());
            }
        }
    }

    @Override // java.util.Vector
    public synchronized void insertElementAt(java.lang.Object obj, int i17) {
        super.insertElementAt(obj, i17);
        d(obj, i17);
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i17) {
        java.lang.Object remove;
        synchronized (this) {
            remove = super.remove(i17);
            e(remove, i17);
        }
        return remove;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean removeAll(java.util.Collection elements) {
        boolean removeAll;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.ArrayList<jz5.l> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : elements) {
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                arrayList.add(new jz5.l(obj, java.lang.Integer.valueOf(indexOf)));
            }
        }
        removeAll = super.removeAll(elements);
        if (removeAll) {
            for (jz5.l lVar : arrayList) {
                e(lVar.f384366d, ((java.lang.Number) lVar.f384367e).intValue());
            }
        }
        return removeAll;
    }

    @Override // java.util.Vector
    public synchronized void removeAllElements() {
        java.util.List S0 = kz5.n0.S0(this);
        super.removeAllElements();
        h(S0);
    }

    @Override // java.util.Vector
    public synchronized boolean removeElement(java.lang.Object obj) {
        return super.removeElement(obj);
    }

    @Override // java.util.Vector
    public synchronized void removeElementAt(int i17) {
        java.lang.Object obj = get(i17);
        super.removeElementAt(i17);
        e(obj, i17);
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean retainAll(java.util.Collection elements) {
        boolean retainAll;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.ArrayList<jz5.l> arrayList = new java.util.ArrayList();
        int size = super.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = get(i17);
            if (!elements.contains(obj)) {
                arrayList.add(new jz5.l(obj, java.lang.Integer.valueOf(i17)));
            }
        }
        retainAll = super.retainAll(elements);
        if (retainAll) {
            for (jz5.l lVar : arrayList) {
                e(lVar.f384366d, ((java.lang.Number) lVar.f384367e).intValue());
            }
        }
        return retainAll;
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public synchronized java.lang.Object set(int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        obj2 = super.set(i17, obj);
        g(obj2, obj, i17);
        return obj2;
    }

    @Override // java.util.Vector
    public synchronized void setElementAt(java.lang.Object obj, int i17) {
        java.lang.Object obj2 = get(i17);
        super.setElementAt(obj, i17);
        g(obj2, obj, i17);
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        super.add(i17, obj);
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public synchronized boolean addAll(int i17, java.util.Collection elements) {
        boolean addAll;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        addAll = super.addAll(i17, elements);
        if (addAll) {
            java.util.Iterator it = elements.iterator();
            while (it.hasNext()) {
                int i18 = i17 + 1;
                d(it.next(), i17);
                i17 = i18;
            }
        }
        return addAll;
    }
}
