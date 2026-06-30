package q26;

/* loaded from: classes14.dex */
public final class o extends q26.p implements java.util.Iterator, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f441411d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f441412e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Iterator f441413f;

    /* renamed from: g, reason: collision with root package name */
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f441414g;

    @Override // q26.p
    public java.lang.Object b(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 frame) {
        this.f441412e = obj;
        this.f441411d = 3;
        this.f441414g = frame;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
        return aVar;
    }

    public final java.lang.Throwable c() {
        int i17 = this.f441411d;
        if (i17 == 4) {
            return new java.util.NoSuchElementException();
        }
        if (i17 == 5) {
            return new java.lang.IllegalStateException("Iterator has failed.");
        }
        return new java.lang.IllegalStateException("Unexpected state of the iterator: " + this.f441411d);
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return oz5.m.f431862d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i17 = this.f441411d;
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 == 2 || i17 == 3) {
                        return true;
                    }
                    if (i17 == 4) {
                        return false;
                    }
                    throw c();
                }
                java.util.Iterator it = this.f441413f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(it);
                if (it.hasNext()) {
                    this.f441411d = 2;
                    return true;
                }
                this.f441413f = null;
            }
            this.f441411d = 5;
            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f441414g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC29045xdcb5ca57);
            this.f441414g = null;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        }
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441411d;
        if (i17 == 0 || i17 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new java.util.NoSuchElementException();
        }
        if (i17 == 2) {
            this.f441411d = 1;
            java.util.Iterator it = this.f441413f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(it);
            return it.next();
        }
        if (i17 != 3) {
            throw c();
        }
        this.f441411d = 0;
        java.lang.Object obj = this.f441412e;
        this.f441412e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f441411d = 4;
    }
}
