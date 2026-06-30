package b26;

/* loaded from: classes15.dex */
public final class e implements b26.d {

    /* renamed from: a, reason: collision with root package name */
    public final a26.a f98959a;

    /* renamed from: b, reason: collision with root package name */
    public final b26.g f98960b;

    public e(o06.v0 module, o06.c1 notFoundClasses, a26.a protocol) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notFoundClasses, "notFoundClasses");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protocol, "protocol");
        this.f98959a = protocol;
        this.f98960b = new b26.g(module, notFoundClasses);
    }

    @Override // b26.h
    public java.util.List a(b26.x0 container, i16.u0 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p16.u uVar = this.f98959a.f82462k;
        java.util.List list = uVar != null ? (java.util.List) proto.f(uVar) : null;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98960b.a((i16.k) it.next(), container.f99070a));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List b(b26.x0 container, p16.h0 proto, b26.c kind) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        boolean z17 = proto instanceof i16.r;
        a26.a aVar = this.f98959a;
        if (z17) {
            list = (java.util.List) ((i16.r) proto).f(aVar.f82453b);
        } else if (proto instanceof i16.j0) {
            list = (java.util.List) ((i16.j0) proto).f(aVar.f82455d);
        } else {
            if (!(proto instanceof i16.u0)) {
                throw new java.lang.IllegalStateException(("Unknown message: " + proto).toString());
            }
            int ordinal = kind.ordinal();
            if (ordinal == 1) {
                list = (java.util.List) ((i16.u0) proto).f(aVar.f82457f);
            } else if (ordinal == 2) {
                list = (java.util.List) ((i16.u0) proto).f(aVar.f82458g);
            } else {
                if (ordinal != 3) {
                    throw new java.lang.IllegalStateException("Unsupported callable kind with property proto".toString());
                }
                list = (java.util.List) ((i16.u0) proto).f(aVar.f82459h);
            }
        }
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98960b.a((i16.k) it.next(), container.f99070a));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List c(b26.x0 container, p16.h0 proto, b26.c kind) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        boolean z17 = proto instanceof i16.j0;
        java.util.List list = null;
        a26.a aVar = this.f98959a;
        if (z17) {
            p16.u uVar = aVar.f82456e;
            if (uVar != null) {
                list = (java.util.List) ((i16.j0) proto).f(uVar);
            }
        } else {
            if (!(proto instanceof i16.u0)) {
                throw new java.lang.IllegalStateException(("Unknown message: " + proto).toString());
            }
            int ordinal = kind.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                throw new java.lang.IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            p16.u uVar2 = aVar.f82460i;
            if (uVar2 != null) {
                list = (java.util.List) ((i16.u0) proto).f(uVar2);
            }
        }
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98960b.a((i16.k) it.next(), container.f99070a));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List d(b26.x0 container, p16.h0 callableProto, b26.c kind, int i17, i16.y1 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callableProto, "callableProto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        java.lang.Iterable iterable = (java.util.List) proto.f(this.f98959a.f82465n);
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98960b.a((i16.k) it.next(), container.f99070a));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List e(i16.s1 proto, k16.g nameResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        java.lang.Iterable iterable = (java.util.List) proto.f(this.f98959a.f82467p);
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98960b.a((i16.k) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List f(b26.v0 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        java.lang.Iterable iterable = (java.util.List) container.f99062d.f(this.f98959a.f82454c);
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98960b.a((i16.k) it.next(), container.f99070a));
        }
        return arrayList;
    }

    @Override // b26.d
    public java.lang.Object g(b26.x0 container, i16.u0 proto, f26.o0 expectedType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expectedType, "expectedType");
        i16.h hVar = (i16.h) k16.i.a(proto, this.f98959a.f82464m);
        if (hVar == null) {
            return null;
        }
        return this.f98960b.c(expectedType, hVar, container.f99070a);
    }

    @Override // b26.h
    public java.util.List h(b26.x0 container, i16.u0 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p16.u uVar = this.f98959a.f82461j;
        java.util.List list = uVar != null ? (java.util.List) proto.f(uVar) : null;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98960b.a((i16.k) it.next(), container.f99070a));
        }
        return arrayList;
    }

    @Override // b26.d
    public java.lang.Object i(b26.x0 container, i16.u0 proto, f26.o0 expectedType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expectedType, "expectedType");
        return null;
    }

    @Override // b26.h
    public java.util.List j(i16.l1 proto, k16.g nameResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        java.lang.Iterable iterable = (java.util.List) proto.f(this.f98959a.f82466o);
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98960b.a((i16.k) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List k(b26.x0 container, i16.c0 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        java.lang.Iterable iterable = (java.util.List) proto.f(this.f98959a.f82463l);
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f98960b.a((i16.k) it.next(), container.f99070a));
        }
        return arrayList;
    }
}
