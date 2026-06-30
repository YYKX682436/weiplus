package cl;

/* loaded from: classes7.dex */
public final class p0 implements java.util.Queue {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f124247d;

    /* renamed from: e, reason: collision with root package name */
    public int f124248e;

    public p0(java.util.Queue q17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(q17, "q");
        this.f124247d = q17;
        this.f124248e = -1;
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(java.lang.Object obj) {
        return this.f124247d.add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f124247d.addAll(elements);
    }

    @Override // java.util.Collection
    public void clear() {
        this.f124247d.clear();
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f124247d.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f124247d.containsAll(elements);
    }

    public final void d(java.util.Queue anotherQueue, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anotherQueue, "anotherQueue");
        java.util.Queue queue = this.f124247d;
        int size = z17 ? this.f124248e : queue.size();
        this.f124248e = -1;
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Object obj : queue) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (i18 <= size) {
                anotherQueue.offer(obj);
            }
            i18 = i19;
        }
        if (size < 0) {
            return;
        }
        while (true) {
            queue.poll();
            if (i17 == size) {
                return;
            } else {
                i17++;
            }
        }
    }

    @Override // java.util.Queue
    public java.lang.Object element() {
        return this.f124247d.element();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f124247d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f124247d.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(java.lang.Object obj) {
        return this.f124247d.offer(obj);
    }

    @Override // java.util.Queue
    public java.lang.Object peek() {
        return this.f124247d.peek();
    }

    @Override // java.util.Queue
    public java.lang.Object poll() {
        return this.f124247d.poll();
    }

    @Override // java.util.Queue
    public java.lang.Object remove() {
        return this.f124247d.remove();
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f124247d.removeAll(elements);
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f124247d.retainAll(elements);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f124247d.size();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.f124247d.remove(obj);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}
