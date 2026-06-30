package i06;

/* loaded from: classes15.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.y1 f368310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(i06.y1 y1Var) {
        super(0);
        this.f368310d = y1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.reflect.GenericDeclaration declaredConstructor;
        j06.j0 j0Var;
        j06.j0 d0Var;
        i06.k4 k4Var = i06.k4.f368219a;
        i06.y1 y1Var = this.f368310d;
        i06.t c17 = k4Var.c(y1Var.l());
        boolean z17 = c17 instanceof i06.s;
        i06.u1 u1Var = y1Var.f368327m;
        if (z17) {
            o06.n0 l17 = y1Var.l();
            o06.m e17 = l17.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getContainingDeclaration(...)");
            if (r16.m.c(e17) && (l17 instanceof o06.l) && ((o06.l) l17).mo150370xcaae5578()) {
                throw new i06.a4(y1Var.l().e() + " cannot have default arguments");
            }
            m16.e eVar = ((i06.s) c17).f368276a;
            java.lang.String name = eVar.f404423a;
            java.lang.reflect.Member b17 = y1Var.i().b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            boolean z18 = !java.lang.reflect.Modifier.isStatic(b17.getModifiers());
            u1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
            java.lang.String desc = eVar.f404424b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "<init>")) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (z18) {
                    arrayList.add(u1Var.f());
                }
                u1Var.i(arrayList, desc, false);
                declaredConstructor = u1Var.r(u1Var.o(), name.concat("$default"), (java.lang.Class[]) arrayList.toArray(new java.lang.Class[0]), u1Var.s(desc, r26.n0.K(desc, ')', 0, false, 6, null) + 1, desc.length()), z18);
            }
            declaredConstructor = null;
        } else {
            if (c17 instanceof i06.r) {
                if (y1Var.n()) {
                    java.lang.Class f17 = u1Var.f();
                    java.util.List mo128635x99879e0 = y1Var.mo128635x99879e0();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(mo128635x99879e0, 10));
                    java.util.Iterator it = mo128635x99879e0.iterator();
                    while (it.hasNext()) {
                        java.lang.String m134408xfb82e301 = ((i06.u2) ((f06.o) it.next())).m134408xfb82e301();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m134408xfb82e301);
                        arrayList2.add(m134408xfb82e301);
                    }
                    return new j06.c(f17, arrayList2, j06.a.f378569d, j06.b.f378574e, null, 16, null);
                }
                java.lang.String desc2 = ((i06.r) c17).f368270a.f404424b;
                u1Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc2, "desc");
                java.lang.Class f18 = u1Var.f();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                u1Var.i(arrayList3, desc2, true);
                try {
                    java.lang.Class[] clsArr = (java.lang.Class[]) arrayList3.toArray(new java.lang.Class[0]);
                    declaredConstructor = f18.getDeclaredConstructor((java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
                } catch (java.lang.NoSuchMethodException unused) {
                }
            } else if (c17 instanceof i06.n) {
                java.lang.Class f19 = u1Var.f();
                java.util.List list = ((i06.n) c17).f368230a;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(((java.lang.reflect.Method) it6.next()).getName());
                }
                return new j06.c(f19, arrayList4, j06.a.f378569d, j06.b.f378573d, list);
            }
            declaredConstructor = null;
        }
        if (declaredConstructor instanceof java.lang.reflect.Constructor) {
            j0Var = i06.y1.p(y1Var, (java.lang.reflect.Constructor) declaredConstructor, y1Var.l(), true);
        } else if (declaredConstructor instanceof java.lang.reflect.Method) {
            if (((p06.b) y1Var.l()).mo9601xa083c1ee().a(i06.o4.f368248a) != null) {
                o06.m e18 = y1Var.l().e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(e18, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (!((o06.g) e18).g0()) {
                    java.lang.reflect.Method method = (java.lang.reflect.Method) declaredConstructor;
                    d0Var = y1Var.o() ? new j06.c0(method) : new j06.g0(method);
                    j0Var = d0Var;
                }
            }
            java.lang.reflect.Method method2 = (java.lang.reflect.Method) declaredConstructor;
            d0Var = y1Var.o() ? new j06.d0(method2, j06.s0.a(y1Var.f368329o, y1Var.l())) : new j06.h0(method2);
            j0Var = d0Var;
        } else {
            j0Var = null;
        }
        return j0Var != null ? j06.s0.b(j0Var, y1Var.l(), true) : null;
    }
}
