package b26;

/* loaded from: classes15.dex */
public final class e implements b26.d {

    /* renamed from: a, reason: collision with root package name */
    public final a26.a f17426a;

    /* renamed from: b, reason: collision with root package name */
    public final b26.g f17427b;

    public e(o06.v0 module, o06.c1 notFoundClasses, a26.a protocol) {
        kotlin.jvm.internal.o.g(module, "module");
        kotlin.jvm.internal.o.g(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.o.g(protocol, "protocol");
        this.f17426a = protocol;
        this.f17427b = new b26.g(module, notFoundClasses);
    }

    @Override // b26.h
    public java.util.List a(b26.x0 container, i16.u0 proto) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        p16.u uVar = this.f17426a.f929k;
        java.util.List list = uVar != null ? (java.util.List) proto.f(uVar) : null;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f17427b.a((i16.k) it.next(), container.f17537a));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List b(b26.x0 container, p16.h0 proto, b26.c kind) {
        java.util.List list;
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(kind, "kind");
        boolean z17 = proto instanceof i16.r;
        a26.a aVar = this.f17426a;
        if (z17) {
            list = (java.util.List) ((i16.r) proto).f(aVar.f920b);
        } else if (proto instanceof i16.j0) {
            list = (java.util.List) ((i16.j0) proto).f(aVar.f922d);
        } else {
            if (!(proto instanceof i16.u0)) {
                throw new java.lang.IllegalStateException(("Unknown message: " + proto).toString());
            }
            int ordinal = kind.ordinal();
            if (ordinal == 1) {
                list = (java.util.List) ((i16.u0) proto).f(aVar.f924f);
            } else if (ordinal == 2) {
                list = (java.util.List) ((i16.u0) proto).f(aVar.f925g);
            } else {
                if (ordinal != 3) {
                    throw new java.lang.IllegalStateException("Unsupported callable kind with property proto".toString());
                }
                list = (java.util.List) ((i16.u0) proto).f(aVar.f926h);
            }
        }
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f17427b.a((i16.k) it.next(), container.f17537a));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List c(b26.x0 container, p16.h0 proto, b26.c kind) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(kind, "kind");
        boolean z17 = proto instanceof i16.j0;
        java.util.List list = null;
        a26.a aVar = this.f17426a;
        if (z17) {
            p16.u uVar = aVar.f923e;
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
            p16.u uVar2 = aVar.f927i;
            if (uVar2 != null) {
                list = (java.util.List) ((i16.u0) proto).f(uVar2);
            }
        }
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f17427b.a((i16.k) it.next(), container.f17537a));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List d(b26.x0 container, p16.h0 callableProto, b26.c kind, int i17, i16.y1 proto) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(callableProto, "callableProto");
        kotlin.jvm.internal.o.g(kind, "kind");
        kotlin.jvm.internal.o.g(proto, "proto");
        java.lang.Iterable iterable = (java.util.List) proto.f(this.f17426a.f932n);
        if (iterable == null) {
            iterable = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f17427b.a((i16.k) it.next(), container.f17537a));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List e(i16.s1 proto, k16.g nameResolver) {
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        java.lang.Iterable iterable = (java.util.List) proto.f(this.f17426a.f934p);
        if (iterable == null) {
            iterable = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f17427b.a((i16.k) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List f(b26.v0 container) {
        kotlin.jvm.internal.o.g(container, "container");
        java.lang.Iterable iterable = (java.util.List) container.f17529d.f(this.f17426a.f921c);
        if (iterable == null) {
            iterable = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f17427b.a((i16.k) it.next(), container.f17537a));
        }
        return arrayList;
    }

    @Override // b26.d
    public java.lang.Object g(b26.x0 container, i16.u0 proto, f26.o0 expectedType) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(expectedType, "expectedType");
        i16.h hVar = (i16.h) k16.i.a(proto, this.f17426a.f931m);
        if (hVar == null) {
            return null;
        }
        return this.f17427b.c(expectedType, hVar, container.f17537a);
    }

    @Override // b26.h
    public java.util.List h(b26.x0 container, i16.u0 proto) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        p16.u uVar = this.f17426a.f928j;
        java.util.List list = uVar != null ? (java.util.List) proto.f(uVar) : null;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f17427b.a((i16.k) it.next(), container.f17537a));
        }
        return arrayList;
    }

    @Override // b26.d
    public java.lang.Object i(b26.x0 container, i16.u0 proto, f26.o0 expectedType) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(expectedType, "expectedType");
        return null;
    }

    @Override // b26.h
    public java.util.List j(i16.l1 proto, k16.g nameResolver) {
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        java.lang.Iterable iterable = (java.util.List) proto.f(this.f17426a.f933o);
        if (iterable == null) {
            iterable = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f17427b.a((i16.k) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List k(b26.x0 container, i16.c0 proto) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        java.lang.Iterable iterable = (java.util.List) proto.f(this.f17426a.f930l);
        if (iterable == null) {
            iterable = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f17427b.a((i16.k) it.next(), container.f17537a));
        }
        return arrayList;
    }
}
