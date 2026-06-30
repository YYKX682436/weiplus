package gx0;

/* loaded from: classes5.dex */
public final class a6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f357720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357720e = w8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.a6(this.f357720e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.a6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar;
        int i17;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f357719d;
        gx0.w8 w8Var = this.f357720e;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f357719d = 1;
            if (gx0.w8.i7(w8Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        float Ni = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Ni();
        java.util.ArrayList<zu0.a> arrayList = w8Var.f358656y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<this>");
        boolean isEmpty = arrayList.isEmpty();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar2 = com.p314xaae8f345.p457x3304c6.p479x4179489f.c.ASPECT_RATIO_9x16;
        if (!isEmpty) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (zu0.a aVar2 : arrayList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar2, "<this>");
                int i19 = aVar2.f557195b;
                if (i19 <= 0 || (i17 = aVar2.f557196c) <= 0) {
                    cVar = cVar2;
                } else {
                    float f17 = (i19 * 1.0f) / i17;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    java.util.Iterator it = ((kz5.h) by0.a.f117855a).iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar3 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.c) it.next();
                        java.lang.Float a17 = by0.b.a(cVar3);
                        if (a17 != null) {
                            linkedHashMap.put(a17, cVar3);
                        }
                    }
                    java.util.Iterator it6 = linkedHashMap.keySet().iterator();
                    if (it6.hasNext()) {
                        java.lang.Object next = it6.next();
                        if (it6.hasNext()) {
                            float abs = java.lang.Math.abs(f17 - ((java.lang.Number) next).floatValue());
                            do {
                                java.lang.Object next2 = it6.next();
                                float abs2 = java.lang.Math.abs(f17 - ((java.lang.Number) next2).floatValue());
                                if (java.lang.Float.compare(abs, abs2) > 0) {
                                    next = next2;
                                    abs = abs2;
                                }
                            } while (it6.hasNext());
                        }
                        obj2 = next;
                    } else {
                        obj2 = null;
                    }
                    cVar = (com.p314xaae8f345.p457x3304c6.p479x4179489f.c) linkedHashMap.getOrDefault((java.lang.Float) obj2, cVar2);
                }
                arrayList2.add(cVar);
            }
            java.util.Iterator it7 = arrayList2.iterator();
            if (!it7.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.c next3 = it7.next();
            if (it7.hasNext()) {
                java.lang.Float a18 = by0.b.a((com.p314xaae8f345.p457x3304c6.p479x4179489f.c) next3);
                float floatValue = a18 != null ? a18.floatValue() : Ni;
                do {
                    java.lang.Object next4 = it7.next();
                    java.lang.Float a19 = by0.b.a((com.p314xaae8f345.p457x3304c6.p479x4179489f.c) next4);
                    float floatValue2 = a19 != null ? a19.floatValue() : Ni;
                    next3 = next3;
                    if (java.lang.Float.compare(floatValue, floatValue2) > 0) {
                        next3 = next4;
                        floatValue = floatValue2;
                    }
                } while (it7.hasNext());
            }
            cVar2 = next3;
        }
        w8Var.A7().getViewTreeObserver().addOnGlobalLayoutListener(new gx0.z5(w8Var, cVar2));
        return cVar2;
    }
}
