package cj5;

/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final cj5.i1 f42142d = new cj5.i1();

    public i1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        java.util.HashMap hashMap = state.E;
        java.util.HashMap hashMap2 = state.f446330z;
        java.util.LinkedList linkedList = state.f446319o;
        if (dVar != null && (dVar instanceof wi5.t0)) {
            wi5.t0 t0Var = (wi5.t0) dVar;
            boolean contains = linkedList.contains(t0Var.f446341b.f396111f);
            ri5.j jVar = t0Var.f446341b;
            if (contains) {
                linkedList.remove(jVar.f396111f);
                j75.d dVar2 = state.f298066d;
                if (dVar2 != null) {
                    dVar2.a(new wi5.w0(wi5.v0.f446352e, wi5.u0.f446345d));
                }
                hashMap.remove(jVar.f396111f);
            } else if (state.f446316i <= 0 || linkedList.size() < state.f446316i) {
                linkedList.add(jVar.f396111f);
                java.lang.Long valueOf = java.lang.Long.valueOf(c01.id.a());
                java.lang.String str = jVar.f396111f;
                hashMap2.put(str, valueOf);
                j75.d dVar3 = state.f298066d;
                if (dVar3 != null) {
                    dVar3.a(new wi5.w0(wi5.v0.f446351d, wi5.u0.f446345d));
                }
                wi5.l0 l0Var = new wi5.l0();
                l0Var.f446305a = t0Var.f446343d;
                hashMap.put(str, l0Var);
            } else {
                j75.d dVar4 = state.f298066d;
                if (dVar4 != null) {
                    dVar4.a(new wi5.w0(wi5.v0.f446351d, wi5.u0.f446346e));
                }
            }
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof wi5.x0)) {
            wi5.x0 x0Var = (wi5.x0) dVar5;
            if (linkedList.contains(x0Var.f446361b)) {
                java.lang.String str2 = x0Var.f446361b;
                linkedList.remove(str2);
                hashMap.remove(str2);
            }
        }
        j75.d dVar6 = state.f298066d;
        if (dVar6 != null && (dVar6 instanceof wi5.y)) {
            wi5.y yVar = (wi5.y) dVar6;
            java.util.List f07 = r26.n0.f0(yVar.f446363c, new java.lang.String[]{" "}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : f07) {
                if (!r26.n0.N((java.lang.String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            java.lang.String str3 = yVar.f446363c;
            if (!r26.n0.N(str3)) {
                java.lang.String str4 = yVar.f446362b;
                state.f446326v = str4;
                state.f446329y = arrayList;
                state.f446328x = str3;
                state.f446327w = null;
                if (arrayList.size() > 1) {
                    j75.d dVar7 = state.f298066d;
                    if (dVar7 != null) {
                        dVar7.a(new wi5.z(str4, str3, arrayList, true));
                    }
                } else {
                    j75.d dVar8 = state.f298066d;
                    if (dVar8 != null) {
                        dVar8.a(new wi5.z(str4, str3, arrayList, false));
                    }
                }
            } else {
                state.f446326v = null;
                state.f446328x = null;
                state.f446329y = null;
                state.f446327w = null;
            }
        }
        j75.d dVar9 = state.f298066d;
        if (dVar9 != null && (dVar9 instanceof wi5.w)) {
            state.f446325u = ((wi5.w) dVar9).f446354b;
            if (!(!r26.n0.N(r0.f446355c))) {
                state.f446326v = null;
                state.f446328x = null;
                state.f446329y = null;
                state.f446327w = null;
            }
        }
        j75.d dVar10 = state.f298066d;
        if (dVar10 != null && (dVar10 instanceof wi5.j0)) {
            wi5.j0 j0Var = (wi5.j0) dVar10;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : j0Var.f446300b) {
                if (!linkedList.contains((java.lang.String) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            if (state.f446316i <= 0 || linkedList.size() + arrayList2.size() <= state.f446316i) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.List list = j0Var.f446300b;
                for (java.lang.Object obj4 : list) {
                    if (!linkedList.contains((java.lang.String) obj4)) {
                        arrayList3.add(obj4);
                    }
                }
                linkedList.addAll(arrayList3);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashMap2.put((java.lang.String) it.next(), java.lang.Long.valueOf(c01.id.c()));
                }
            } else {
                j75.d dVar11 = state.f298066d;
                if (dVar11 != null) {
                    dVar11.a(new wi5.w0(wi5.v0.f446351d, wi5.u0.f446346e));
                }
            }
        }
        j75.d dVar12 = state.f298066d;
        if (dVar12 != null && (dVar12 instanceof wi5.r)) {
            wi5.r rVar = (wi5.r) dVar12;
            linkedList.clear();
            linkedList.addAll(rVar.f446336b);
            java.util.Iterator it6 = rVar.f446336b.iterator();
            while (it6.hasNext()) {
                hashMap2.put((java.lang.String) it6.next(), java.lang.Long.valueOf(c01.id.c()));
            }
        }
        j75.d dVar13 = state.f298066d;
        if (dVar13 != null && (dVar13 instanceof wi5.k0)) {
            wi5.k0 k0Var = (wi5.k0) dVar13;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj5 : k0Var.f446301b) {
                if (!linkedList.contains((java.lang.String) obj5)) {
                    arrayList4.add(obj5);
                }
            }
            linkedList.addAll(arrayList4);
            linkedList.removeAll(kz5.n0.X0(k0Var.f446302c));
            java.util.Iterator it7 = k0Var.f446301b.iterator();
            while (it7.hasNext()) {
                hashMap2.put((java.lang.String) it7.next(), java.lang.Long.valueOf(c01.id.c()));
            }
        }
        j75.d dVar14 = state.f298066d;
        if (dVar14 != null && (dVar14 instanceof wi5.m0)) {
            wi5.m0 m0Var = (wi5.m0) dVar14;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj6 : m0Var.f446310b) {
                if (!linkedList.contains((java.lang.String) obj6)) {
                    arrayList5.add(obj6);
                }
            }
            java.util.Iterator it8 = arrayList5.iterator();
            while (it8.hasNext()) {
                java.lang.String str5 = (java.lang.String) it8.next();
                wi5.l0 l0Var2 = new wi5.l0();
                l0Var2.f446305a = m0Var.f446311c;
                hashMap.put(str5, l0Var2);
            }
            linkedList.clear();
            java.util.List list2 = m0Var.f446310b;
            linkedList.addAll(list2);
            java.util.Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                hashMap2.put((java.lang.String) it9.next(), java.lang.Long.valueOf(c01.id.c()));
            }
        }
        j75.d dVar15 = state.f298066d;
        if (dVar15 != null && (dVar15 instanceof p0.h)) {
            java.util.HashSet hashSet = state.Q;
            hashSet.clear();
            hashSet.addAll(((p0.h) dVar15).f350346k);
        }
        return jz5.f0.f302826a;
    }
}
