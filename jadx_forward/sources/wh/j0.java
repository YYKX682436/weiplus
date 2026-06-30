package wh;

/* loaded from: classes12.dex */
public final class j0 {

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f527339e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f527340f;

    /* renamed from: g, reason: collision with root package name */
    public static final wh.y f527341g = new wh.y(null);

    /* renamed from: a, reason: collision with root package name */
    public final jz5.o f527342a = new jz5.o(new java.util.concurrent.atomic.AtomicInteger(0), new java.util.concurrent.atomic.AtomicInteger(0), new java.util.concurrent.atomic.AtomicInteger(0));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f527343b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f527344c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f527345d;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f527339e = jz5.h.a(iVar, wh.w.f527421d);
        f527340f = jz5.h.a(iVar, wh.x.f527432d);
    }

    public final void a(java.lang.String threadName, int i17, java.lang.String stackTrace) {
        wh.c0 c0Var;
        wh.b0 b0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadName, "threadName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stackTrace, "stackTrace");
        jz5.o oVar = this.f527342a;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) oVar.f384374d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = (java.util.concurrent.atomic.AtomicInteger) oVar.f384375e;
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = (java.util.concurrent.atomic.AtomicInteger) oVar.f384376f;
        wh.y yVar = f527341g;
        boolean a17 = yVar.a(stackTrace, 3);
        java.util.Collection collection = kz5.p0.f395529d;
        int i18 = 32;
        int i19 = 1;
        if (!a17) {
            if (!yVar.b(stackTrace, 3)) {
                atomicInteger3.getAndIncrement();
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List g17 = new r26.t("\n").g(stackTrace, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            java.lang.Object[] array = collection.toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (java.lang.String str : (java.lang.String[]) array) {
                int length = str.length() - 1;
                boolean z17 = false;
                int i27 = 0;
                while (i27 <= length) {
                    boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str.charAt(!z17 ? i27 : length), 32) <= 0;
                    if (z17) {
                        if (!z18) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z18) {
                        i27++;
                    } else {
                        z17 = true;
                    }
                }
                java.lang.String line = str.subSequence(i27, length + 1).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(line, "line");
                r26.m d17 = ((r26.t) f527340f.mo141623x754a37bb()).d(line);
                if (d17 != null) {
                    r26.q qVar = (r26.q) d17;
                    java.lang.String str2 = (java.lang.String) qVar.a().get(1);
                    java.lang.String str3 = (java.lang.String) qVar.a().get(2);
                    java.lang.String str4 = (java.lang.String) qVar.a().get(3);
                    if (!(str4.length() > 0)) {
                        str4 = null;
                    }
                    c0Var = new wh.c0(str2, str3, str4);
                } else {
                    c0Var = null;
                }
                if (c0Var != null) {
                    arrayList.add(c0Var);
                }
            }
            b(threadName, i17, arrayList);
            atomicInteger2.getAndIncrement();
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List g18 = new r26.t("\n").g(stackTrace, 0);
        if (!g18.isEmpty()) {
            java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        java.lang.Object[] array2 = collection.toArray(new java.lang.String[0]);
        if (array2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        java.lang.String[] strArr = (java.lang.String[]) array2;
        int length2 = strArr.length;
        int i28 = 0;
        while (i28 < length2) {
            java.lang.String str5 = strArr[i28];
            int length3 = str5.length() - i19;
            int i29 = 0;
            boolean z19 = false;
            while (i29 <= length3) {
                boolean z27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str5.charAt(!z19 ? i29 : length3), i18) <= 0;
                if (z19) {
                    if (!z27) {
                        break;
                    } else {
                        length3--;
                    }
                } else if (z27) {
                    i29++;
                } else {
                    z19 = true;
                }
            }
            java.lang.String line2 = str5.subSequence(i29, length3 + 1).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(line2, "line");
            r26.m b17 = ((r26.t) f527339e.mo141623x754a37bb()).b(line2, 0);
            if (b17 != null) {
                r26.q qVar2 = (r26.q) b17;
                b0Var = new wh.b0(((java.lang.String) qVar2.a().get(1)) + '.' + ((java.lang.String) qVar2.a().get(2)), (java.lang.String) qVar2.a().get(3), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) qVar2.a().get(4))));
            } else {
                b0Var = null;
            }
            if (b0Var != null) {
                arrayList2.add(b0Var);
            }
            i28++;
            i19 = 1;
            i18 = 32;
        }
        b(threadName, i17, arrayList2);
        atomicInteger.getAndIncrement();
    }

    public final void b(java.lang.String str, int i17, java.util.List list) {
        java.lang.Object obj;
        if (list.isEmpty()) {
            return;
        }
        synchronized (this) {
            ((java.util.HashMap) this.f527343b).put(java.lang.Integer.valueOf(i17), str);
            java.util.List x07 = kz5.n0.x0(list);
            wh.d0 d0Var = (wh.d0) x07.get(0);
            java.util.Iterator it = this.f527344c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((wh.z) obj).f527437c, d0Var)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            wh.z zVar = (wh.z) obj;
            if (zVar == null) {
                zVar = new wh.z(d0Var, null);
                ((java.util.ArrayList) this.f527344c).add(zVar);
            }
            zVar.f527435a++;
            this.f527345d++;
            for (wh.d0 d0Var2 : kz5.n0.R(x07, 1)) {
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) zVar.f527436b;
                java.lang.Object obj2 = linkedHashMap.get(d0Var2);
                if (obj2 == null) {
                    obj2 = new wh.z(d0Var2, zVar);
                    linkedHashMap.put(d0Var2, obj2);
                }
                zVar = (wh.z) obj2;
                zVar.f527435a++;
            }
        }
    }

    public final int c(wh.z zVar) {
        wh.z zVar2 = zVar.f527438d;
        return (zVar2 == null ? 0 : c(zVar2)) + 1;
    }

    public final int d(wh.z zVar) {
        wh.z zVar2 = zVar.f527438d;
        return zVar.f527435a + (zVar2 == null ? 0 : d(zVar2));
    }

    public final java.util.List e(java.util.List list) {
        java.util.List f17 = f(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f17) {
            if (((wh.z) obj).f527436b.isEmpty()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.List f(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, f(kz5.n0.S0(((java.util.LinkedHashMap) ((wh.z) it.next()).f527436b).values())));
        }
        return kz5.n0.t0(list, arrayList);
    }

    public final void g() {
        java.lang.Object obj;
        synchronized (this) {
            java.util.List<wh.z> e17 = e(this.f527344c);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(e17, 10));
            for (wh.z zVar : e17) {
                wh.d0 d0Var = zVar.f527437c;
                if (d0Var instanceof wh.b0) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var.b(), java.lang.Thread.class.getName() + ".start")) {
                        throw new java.lang.IllegalStateException("Reserved java stacktrace:\n" + h(zVar));
                    }
                }
                arrayList.add(new jz5.l(zVar, java.lang.Integer.valueOf(c(zVar))));
            }
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                if (it.hasNext()) {
                    int intValue = ((java.lang.Number) ((jz5.l) next).f384367e).intValue();
                    do {
                        java.lang.Object next2 = it.next();
                        int intValue2 = ((java.lang.Number) ((jz5.l) next2).f384367e).intValue();
                        if (intValue < intValue2) {
                            next = next2;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            jz5.l lVar = (jz5.l) obj;
            if (lVar != null && ((java.lang.Number) lVar.f384367e).intValue() >= 80) {
                throw new java.lang.IllegalStateException("Stacktrace too long:\n" + h((wh.z) lVar.f384366d));
            }
        }
    }

    public final java.lang.String h(wh.z zVar) {
        wh.a0 a0Var = new wh.a0();
        new wh.h0(a0Var).a(zVar);
        return a0Var.m173760x9616526c();
    }
}
