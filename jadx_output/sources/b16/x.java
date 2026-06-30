package b16;

/* loaded from: classes16.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.e0 f17259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a16.l f17260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b16.e0 e0Var, a16.l lVar) {
        super(0);
        this.f17259d = e0Var;
        this.f17260e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        b16.e0 e0Var;
        a16.l lVar;
        a16.l lVar2;
        z06.b bVar;
        z06.b J0;
        java.lang.String str;
        java.lang.String str2;
        java.util.List emptyList;
        c16.e eVar;
        jz5.l lVar3;
        boolean z17;
        java.util.List e17;
        b16.e0 e0Var2 = this.f17259d;
        java.lang.reflect.Constructor<?>[] declaredConstructors = ((u06.x) e0Var2.f17152o).f423533a.getDeclaredConstructors();
        kotlin.jvm.internal.o.f(declaredConstructors, "getDeclaredConstructors(...)");
        java.util.List y17 = q26.h0.y(q26.h0.o(q26.h0.j(kz5.z.C(declaredConstructors), u06.p.f423525d), u06.q.f423526d));
        java.util.ArrayList arrayList = new java.util.ArrayList(y17.size());
        java.util.Iterator it = y17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            boolean z18 = false;
            a16.l lVar4 = e0Var2.f17163b;
            o06.g gVar = e0Var2.f17151n;
            if (!hasNext) {
                e16.g gVar2 = e0Var2.f17152o;
                u06.x xVar = (u06.x) gVar2;
                boolean j17 = xVar.j();
                p06.k kVar = p06.i.f350765a;
                a16.l lVar5 = this.f17260e;
                if (j17) {
                    z06.b J02 = z06.b.J0(gVar, kVar, true, ((t06.m) lVar4.f649a.f624j).a(gVar2));
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) ((u06.x) gVar2).g();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
                    c16.a a17 = c16.b.a(f26.x2.f259236e, false, false, null, 6, null);
                    java.util.Iterator it6 = arrayList2.iterator();
                    int i17 = 0;
                    while (it6.hasNext()) {
                        u06.j0 j0Var = (u06.j0) ((e16.t) it6.next());
                        arrayList3.add(new r06.s1(J02, null, i17, kVar, j0Var.d(), lVar4.f653e.e(j0Var.g(), a17), false, false, false, null, ((t06.m) lVar4.f649a.f624j).a(j0Var)));
                        lVar5 = lVar5;
                        i17++;
                        e0Var2 = e0Var2;
                        lVar4 = lVar4;
                        a17 = a17;
                        z18 = false;
                    }
                    e0Var = e0Var2;
                    lVar = lVar4;
                    lVar2 = lVar5;
                    bVar = null;
                    J02.B0(z18);
                    o06.g0 PROTECTED_AND_PACKAGE = gVar.getVisibility();
                    kotlin.jvm.internal.o.f(PROTECTED_AND_PACKAGE, "getVisibility(...)");
                    if (kotlin.jvm.internal.o.b(PROTECTED_AND_PACKAGE, x06.d0.f451226b)) {
                        PROTECTED_AND_PACKAGE = x06.d0.f451227c;
                        kotlin.jvm.internal.o.f(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                    }
                    J02.G0(arrayList3, PROTECTED_AND_PACKAGE);
                    boolean z19 = false;
                    J02.A0(false);
                    J02.C0(gVar.k());
                    java.lang.String a18 = g16.w0.a(J02, false, false, 2, null);
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it7 = arrayList.iterator();
                        while (it7.hasNext()) {
                            if (kotlin.jvm.internal.o.b(g16.w0.a((o06.f) it7.next(), z19, z19, 2, null), a18)) {
                                z17 = false;
                                break;
                            }
                            z19 = false;
                        }
                    }
                    z17 = true;
                    if (z17) {
                        arrayList.add(J02);
                        ((y06.m) lVar2.f649a.f621g).getClass();
                    }
                } else {
                    e0Var = e0Var2;
                    lVar = lVar4;
                    lVar2 = lVar5;
                    bVar = null;
                }
                ((w16.a) lVar2.f649a.f638x).a(lVar2, gVar, arrayList);
                f16.y0 y0Var = lVar2.f649a.f632r;
                boolean isEmpty = arrayList.isEmpty();
                java.util.Collection collection = arrayList;
                if (isEmpty) {
                    boolean h17 = xVar.h();
                    if (!xVar.f423533a.isInterface()) {
                        gVar2.getClass();
                    }
                    if (h17) {
                        a16.l lVar6 = lVar;
                        J0 = z06.b.J0(gVar, kVar, true, ((t06.m) lVar6.f649a.f624j).a(gVar2));
                        if (h17) {
                            java.util.Collection e18 = ((u06.x) gVar2).e();
                            emptyList = new java.util.ArrayList(e18.size());
                            c16.a a19 = c16.b.a(f26.x2.f259236e, true, false, null, 6, null);
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            for (java.lang.Object obj : e18) {
                                if (kotlin.jvm.internal.o.b(((u06.f0) ((e16.q) obj)).d(), x06.p0.f451285b)) {
                                    arrayList4.add(obj);
                                } else {
                                    arrayList5.add(obj);
                                }
                            }
                            arrayList4.size();
                            e16.q qVar = (e16.q) kz5.n0.Z(arrayList4);
                            c16.e eVar2 = lVar6.f653e;
                            if (qVar != null) {
                                e16.u g17 = ((u06.g0) qVar).g();
                                if (g17 instanceof e16.f) {
                                    e16.f fVar = (e16.f) g17;
                                    lVar3 = new jz5.l(eVar2.c(fVar, a19, true), eVar2.e(((u06.o) fVar).f423523b, a19));
                                } else {
                                    lVar3 = new jz5.l(eVar2.e(g17, a19), bVar);
                                }
                                eVar = eVar2;
                                str = "getVisibility(...)";
                                str2 = "PROTECTED_AND_PACKAGE";
                                e0Var.x(emptyList, J0, 0, qVar, (f26.o0) lVar3.f302833d, (f26.o0) lVar3.f302834e);
                            } else {
                                eVar = eVar2;
                                str = "getVisibility(...)";
                                str2 = "PROTECTED_AND_PACKAGE";
                            }
                            int i18 = qVar != null ? 1 : 0;
                            java.util.Iterator it8 = arrayList5.iterator();
                            int i19 = 0;
                            while (it8.hasNext()) {
                                u06.g0 g0Var = (u06.g0) ((e16.q) it8.next());
                                c16.e eVar3 = eVar;
                                e0Var.x(emptyList, J0, i19 + i18, g0Var, eVar3.e(g0Var.g(), a19), null);
                                i19++;
                                eVar = eVar3;
                            }
                        } else {
                            str = "getVisibility(...)";
                            str2 = "PROTECTED_AND_PACKAGE";
                            emptyList = java.util.Collections.emptyList();
                        }
                        J0.B0(false);
                        o06.g0 visibility = gVar.getVisibility();
                        kotlin.jvm.internal.o.f(visibility, str);
                        if (kotlin.jvm.internal.o.b(visibility, x06.d0.f451226b)) {
                            visibility = x06.d0.f451227c;
                            kotlin.jvm.internal.o.f(visibility, str2);
                        }
                        J0.G0(emptyList, visibility);
                        J0.A0(true);
                        J0.C0(gVar.k());
                        ((y06.m) lVar6.f649a.f621g).getClass();
                    } else {
                        J0 = bVar;
                    }
                    collection = kz5.c0.j(J0);
                }
                return kz5.n0.S0(y0Var.c(lVar2, collection));
            }
            e16.k kVar2 = (e16.k) it.next();
            p06.k a27 = a16.i.a(lVar4, kVar2);
            a16.d dVar = lVar4.f649a;
            z06.b J03 = z06.b.J0(gVar, a27, false, ((t06.m) dVar.f624j).a(kVar2));
            a16.l lVar7 = new a16.l(dVar, new a16.n(lVar4, J03, kVar2, gVar.m().size()), lVar4.f651c);
            u06.a0 a0Var = (u06.a0) kVar2;
            java.lang.reflect.Constructor constructor = a0Var.f423487a;
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.o.d(genericParameterTypes);
            if (genericParameterTypes.length == 0) {
                e17 = kz5.p0.f313996d;
            } else {
                java.lang.Class declaringClass = constructor.getDeclaringClass();
                if (declaringClass.getDeclaringClass() != null && !java.lang.reflect.Modifier.isStatic(declaringClass.getModifiers())) {
                    genericParameterTypes = (java.lang.reflect.Type[]) kz5.v.s(genericParameterTypes, 1, genericParameterTypes.length);
                }
                java.lang.annotation.Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                if (parameterAnnotations.length < genericParameterTypes.length) {
                    throw new java.lang.IllegalStateException("Illegal generic signature: " + constructor);
                }
                if (parameterAnnotations.length > genericParameterTypes.length) {
                    parameterAnnotations = (java.lang.annotation.Annotation[][]) kz5.v.s(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                }
                e17 = a0Var.e(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
            }
            b16.s0 u17 = e0Var2.u(lVar7, J03, e17);
            java.util.List m17 = gVar.m();
            kotlin.jvm.internal.o.f(m17, "getDeclaredTypeParameters(...)");
            java.util.List typeParameters = a0Var.getTypeParameters();
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(typeParameters, 10));
            java.util.Iterator it9 = ((java.util.ArrayList) typeParameters).iterator();
            while (it9.hasNext()) {
                o06.e2 a28 = lVar7.f650b.a((e16.v) it9.next());
                kotlin.jvm.internal.o.d(a28);
                arrayList6.add(a28);
            }
            J03.H0(u17.f17251a, x06.h1.a(((u06.f0) kVar2).f()), kz5.n0.t0(m17, arrayList6));
            J03.A0(false);
            J03.B0(u17.f17252b);
            J03.C0(gVar.k());
            ((y06.m) lVar7.f649a.f621g).getClass();
            arrayList.add(J03);
        }
    }
}
