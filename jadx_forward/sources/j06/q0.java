package j06;

/* loaded from: classes16.dex */
public final class q0 implements j06.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f378611a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f378612b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f378613c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f378614d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f378615e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    public q0(o06.n0 descriptor, i06.u1 container, java.lang.String constructorDesc, java.util.List originalParameters) {
        ?? c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(constructorDesc, "constructorDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalParameters, "originalParameters");
        java.lang.reflect.Method j17 = container.j("constructor-impl", constructorDesc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        this.f378611a = j17;
        java.lang.reflect.Method j18 = container.j("box-impl", r26.n0.Z(constructorDesc, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a) + u06.i.b(container.f()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j18);
        this.f378612b = j18;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(originalParameters, 10));
        java.util.Iterator it = originalParameters.iterator();
        while (true) {
            java.util.List list = null;
            if (!it.hasNext()) {
                break;
            }
            f26.o0 mo132802xfb85f7b0 = ((o06.l1) it.next()).mo132802xfb85f7b0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
            f26.z0 a17 = f26.r2.a(mo132802xfb85f7b0);
            java.util.List e17 = j06.s0.e(a17);
            if (e17 == null) {
                java.lang.Class g17 = j06.s0.g(a17);
                if (g17 != null) {
                    list = kz5.b0.c(j06.s0.d(g17, descriptor));
                }
            } else {
                list = e17;
            }
            arrayList.add(list);
        }
        this.f378613c = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(originalParameters, 10));
        int i17 = 0;
        for (java.lang.Object obj : originalParameters) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            o06.j i19 = ((o06.l1) obj).mo132802xfb85f7b0().w0().i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i19, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            o06.g gVar = (o06.g) i19;
            java.util.List list2 = (java.util.List) ((java.util.ArrayList) this.f378613c).get(i17);
            if (list2 != null) {
                c17 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    c17.add(((java.lang.reflect.Method) it6.next()).getReturnType());
                }
            } else {
                java.lang.Class k17 = i06.o4.k(gVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
                c17 = kz5.b0.c(k17);
            }
            arrayList2.add(c17);
            i17 = i18;
        }
        this.f378614d = arrayList2;
        this.f378615e = kz5.d0.r(arrayList2);
    }

    @Override // j06.k
    public java.util.List a() {
        return this.f378615e;
    }

    @Override // j06.k
    public /* bridge */ /* synthetic */ java.lang.reflect.Member b() {
        return null;
    }

    @Override // j06.k
    /* renamed from: call */
    public java.lang.Object mo140163x2e7a5e(java.lang.Object[] args) {
        java.util.Collection c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        java.util.List other = this.f378613c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int length = args.length;
        java.util.ArrayList<jz5.l> arrayList = new java.util.ArrayList(java.lang.Math.min(kz5.d0.q(other, 10), length));
        int i17 = 0;
        for (java.lang.Object obj : other) {
            if (i17 >= length) {
                break;
            }
            arrayList.add(new jz5.l(args[i17], obj));
            i17++;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (jz5.l lVar : arrayList) {
            java.lang.Object obj2 = lVar.f384366d;
            java.util.List list = (java.util.List) lVar.f384367e;
            if (list != null) {
                c17 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    c17.add(((java.lang.reflect.Method) it.next()).invoke(obj2, new java.lang.Object[0]));
                }
            } else {
                c17 = kz5.b0.c(obj2);
            }
            kz5.h0.u(arrayList2, c17);
        }
        java.lang.Object[] array = arrayList2.toArray(new java.lang.Object[0]);
        this.f378611a.invoke(null, java.util.Arrays.copyOf(array, array.length));
        return this.f378612b.invoke(null, java.util.Arrays.copyOf(array, array.length));
    }

    @Override // j06.k
    /* renamed from: getReturnType */
    public java.lang.reflect.Type mo140167x3df4e080() {
        java.lang.Class<?> returnType = this.f378612b.getReturnType();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(returnType, "getReturnType(...)");
        return returnType;
    }
}
