package y16;

/* loaded from: classes16.dex */
public abstract class t implements y16.s {
    @Override // y16.s
    public java.util.Set a() {
        y16.i iVar = y16.i.f540489p;
        int i17 = o26.l.f424137a;
        java.util.Collection f17 = f(iVar, o26.j.f424135d);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : f17) {
            if (obj instanceof o06.v1) {
                n16.g mo132800xfb82e301 = ((r06.v) ((o06.v1) obj)).mo132800xfb82e301();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
                linkedHashSet.add(mo132800xfb82e301);
            }
        }
        return linkedHashSet;
    }

    @Override // y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return kz5.p0.f395529d;
    }

    @Override // y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return kz5.p0.f395529d;
    }

    @Override // y16.s
    public java.util.Set d() {
        return null;
    }

    @Override // y16.w
    public o06.j e(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return null;
    }

    @Override // y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        return kz5.p0.f395529d;
    }

    @Override // y16.s
    public java.util.Set g() {
        y16.i iVar = y16.i.f540490q;
        int i17 = o26.l.f424137a;
        java.util.Collection f17 = f(iVar, o26.j.f424135d);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : f17) {
            if (obj instanceof o06.v1) {
                n16.g mo132800xfb82e301 = ((r06.v) ((o06.v1) obj)).mo132800xfb82e301();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
                linkedHashSet.add(mo132800xfb82e301);
            }
        }
        return linkedHashSet;
    }
}
