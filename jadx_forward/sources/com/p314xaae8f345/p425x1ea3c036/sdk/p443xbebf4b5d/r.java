package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d;

/* loaded from: classes7.dex */
public abstract class r {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f129214e = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r f129215f;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f129216d = jz5.h.b(new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.j(this));

    public static /* synthetic */ boolean B(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r rVar, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: taskAlive");
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        return rVar.A(str, i17);
    }

    public static /* synthetic */ void u(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r rVar, java.lang.String str, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: killByAppId");
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        rVar.t(str, i17, z17);
    }

    public static com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x y(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r rVar, android.content.Context context, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.w wVar, ik1.b0 b0Var, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startApp");
        }
        if ((i17 & 1) != 0) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        }
        if ((i17 & 4) != 0) {
            b0Var = null;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        return rVar.x(context, wVar, b0Var, lVar);
    }

    public final boolean A(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        return c(appId, i17) != null;
    }

    public final java.util.List a() {
        java.util.List k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) it.next()).h());
        }
        return arrayList;
    }

    public final void b(java.lang.String excludeInstanceId, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excludeInstanceId, "excludeInstanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.Iterator it = k().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) it.next()).c(excludeInstanceId, appId, true);
        }
    }

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s c(java.lang.String appId, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (appId.length() == 0) {
            return null;
        }
        java.util.List<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h> k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
        for (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar : k17) {
            if ((hVar != null && hVar.l()) && (e17 = hVar.e(appId, i17)) != null) {
                return e17;
            }
            arrayList.add(jz5.f0.f384359a);
        }
        return null;
    }

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        java.util.List<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h> k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
        for (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar : k17) {
            if (hVar != null && hVar.l()) {
                for (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar : hVar.h()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar.f129224h, str)) {
                        return sVar;
                    }
                }
            }
            arrayList.add(jz5.f0.f384359a);
        }
        return null;
    }

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h e(int i17) {
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) k().get(i17);
    }

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h f(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s record) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        java.util.Iterator it = k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.util.ArrayList) ((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj).h()).contains(record)) {
                break;
            }
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj;
        if (hVar != null) {
            return hVar;
        }
        throw new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.y();
    }

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h g(java.lang.String appId) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.Iterator it = k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.util.ArrayList) ((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj).g()).contains(appId)) {
                break;
            }
        }
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj;
    }

    public final java.util.List h(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        java.util.List k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : k17) {
            if (((java.lang.Boolean) predicate.mo146xb9724478((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void i(java.lang.String appId, int i17, yz5.l command) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        java.util.List k17 = k();
        java.util.ArrayList<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s> arrayList = new java.util.ArrayList();
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s f17 = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.f((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) it.next(), appId, 0, 2, null);
            if (f17 != null) {
                arrayList.add(f17);
            }
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.LuggageMiniProgramProcessManager", "findRecords: ([%s][%s]) not found", appId, java.lang.Integer.valueOf(i17));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar : arrayList) {
            if (sVar.f129221e) {
                linkedList.add(sVar);
            } else {
                linkedList2.add(sVar);
            }
        }
        if (arrayList.size() > 2 || linkedList.size() > 1 || linkedList2.size() > 1) {
            java.lang.String format = java.lang.String.format("records(%s %d) size[%d] persistent size[%d] !persistent size[%d]", java.util.Arrays.copyOf(new java.lang.Object[]{appId, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList2.size())}, 5));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageMiniProgramProcessManager", format);
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it6.next();
            if (i17 < 0 || sVar2.f129218b == i17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar2);
                command.mo146xb9724478(sVar2);
                return;
            }
        }
        java.util.Iterator it7 = linkedList.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar3 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it7.next();
            if (i17 < 0 || sVar3.f129218b == i17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar3);
                command.mo146xb9724478(sVar3);
                return;
            }
        }
    }

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s[] j(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        i(appId, i17, new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.l(arrayList));
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s[]) arrayList.toArray(new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s[0]);
    }

    public final java.util.List k() {
        return (java.util.List) ((jz5.n) this.f129216d).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h l(java.util.List availableProcess, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 serviceType) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar;
        java.lang.Class cls;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Class cls2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(availableProcess, "availableProcess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceType, "serviceType");
        if (!(serviceType != com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : availableProcess) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj3;
            if (serviceType == hVar2.f129175c && hVar2.k()) {
                arrayList.add(obj3);
            }
        }
        java.lang.String str = null;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj2).l()) {
                    break;
                }
            }
            hVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj2;
            if (hVar == null) {
                hVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) kz5.n0.X(arrayList);
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = (hVar == null || (cls2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) hVar).f170610h) == null) ? null : cls2.getSimpleName();
            objArr[1] = serviceType;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageMiniProgramProcessManager", "getAvailableTaskToPreload found empty task[%s], which can be used as [%s]", objArr);
        } else {
            hVar = null;
        }
        if (hVar == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj4 : availableProcess) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar3 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj4;
                if (hVar3.f129175c == com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g && hVar3.u(serviceType)) {
                    arrayList2.add(obj4);
                }
            }
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    if (((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj).l()) {
                        break;
                    }
                }
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar4 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj;
                hVar = hVar4 == null ? (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) kz5.n0.X(arrayList2) : hVar4;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = serviceType;
            if (hVar != null && (cls = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) hVar).f170610h) != null) {
                str = cls.getSimpleName();
            }
            if (str == null) {
                str = "null";
            }
            objArr2[1] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageMiniProgramProcessManager", "getAvailableTaskToPreload serviceType = [%s] not reached max limit , got ui task = [%s]", objArr2);
        }
        return hVar;
    }

    public abstract com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h m(java.lang.String str, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.w wVar, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed99);

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h n(java.util.List availableProcess, java.lang.String appId, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.w params, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 type) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed99;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed992;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(availableProcess, "availableProcess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h g17 = g(appId);
        if (g17 != null) {
            return g17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj4 : availableProcess) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj4;
            boolean u17 = hVar.u(type);
            if (u17) {
                hVar.j();
            }
            if (u17) {
                arrayList.add(obj4);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj2;
            if (hVar2.k() && hVar2.l() && ((enumC3941xa739ed992 = hVar2.f129175c) == com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g || enumC3941xa739ed992 == type)) {
                break;
            }
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar3 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj2;
        if (hVar3 == null) {
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it6.next();
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar4 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj3;
                if (hVar4.k() && ((enumC3941xa739ed99 = hVar4.f129175c) == com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g || enumC3941xa739ed99 == type)) {
                    break;
                }
            }
            hVar3 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj3;
        }
        if (hVar3 != null) {
            return hVar3;
        }
        java.util.Iterator it7 = arrayList.iterator();
        if (it7.hasNext()) {
            obj = it7.next();
            if (it7.hasNext()) {
                java.util.Collection h17 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj).h();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(h17, 10));
                java.util.Iterator it8 = h17.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(java.lang.Long.valueOf(((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it8.next()).f129223g));
                }
                java.lang.Long l17 = (java.lang.Long) kz5.n0.o0(arrayList2);
                long longValue = l17 != null ? l17.longValue() : 0L;
                do {
                    java.lang.Object next = it7.next();
                    java.util.Collection h18 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) next).h();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(h18, 10));
                    java.util.Iterator it9 = h18.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(java.lang.Long.valueOf(((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it9.next()).f129223g));
                    }
                    java.lang.Long l18 = (java.lang.Long) kz5.n0.o0(arrayList3);
                    long longValue2 = l18 != null ? l18.longValue() : 0L;
                    if (longValue > longValue2) {
                        obj = next;
                        longValue = longValue2;
                    }
                } while (it7.hasNext());
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj;
    }

    public abstract com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h[] o();

    public final jz5.l p(java.util.List list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj2).f129221e) {
                break;
            }
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj2;
        if (sVar == null) {
            return new jz5.l(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x.f129233e, f((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) kz5.n0.X(list)));
        }
        java.util.Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) next).f129221e) {
                obj = next;
                break;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h f17 = f((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj);
        sVar.f129221e = false;
        return new jz5.l(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x.f129233e, f17);
    }

    public final void q(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.c killType) {
        int i17;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(killType, "killType");
        if (killType == com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.c.f129165f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0) this;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
            for (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar : u0Var.k()) {
                java.lang.String i18 = hVar.i();
                if (i18 != null) {
                    if (hVar.k()) {
                        concurrentHashMap.putIfAbsent(i18, java.lang.Boolean.TRUE);
                    } else {
                        concurrentHashMap.put(i18, java.lang.Boolean.FALSE);
                    }
                }
            }
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageMiniProgramProcessManager", "killAll SILENT_IF_INACTIVE kill process(%s)", str);
                    java.util.Iterator it = u0Var.k().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj).i(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) obj;
                    if (hVar2 != null) {
                        hVar2.m();
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageMiniProgramProcessManager", "killAll SILENT_IF_INACTIVE");
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed99 = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129160f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170355m;
            u0Var.P(enumC3941xa739ed99, x6Var);
            u0Var.P(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e, x6Var);
            return;
        }
        android.util.ArraySet arraySet = new android.util.ArraySet();
        java.util.Iterator it6 = k().iterator();
        while (true) {
            i17 = 0;
            if (!it6.hasNext()) {
                break;
            }
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar3 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) hVar3;
            kVar.getClass();
            kVar.j();
            if (kVar.l() && !((java.util.ArrayList) kVar.g()).isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramProcess", "killAllRuntime process:" + kVar.i() + ", type:" + killType);
                java.util.Iterator it7 = ((java.util.ArrayList) kVar.g()).iterator();
                while (it7.hasNext()) {
                    com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.q(kVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12607x91d5b381((java.lang.String) it7.next(), killType.ordinal()), null, 2, null);
                }
                i17 = 1;
            }
            if (i17 == 0) {
                arraySet.add(hVar3);
            }
        }
        int ordinal = killType.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it8 = arraySet.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                java.lang.Object next = it8.next();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) next).i() != null ? r8 : "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
                    arrayList.add(next);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k[] kVarArr = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k[]) arrayList.toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k[0]);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("killEmptyProcesses for type:");
            sb6.append(killType);
            sb6.append(", processes:");
            java.lang.String arrays = java.util.Arrays.toString(kVarArr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
            sb6.append(arrays);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", sb6.toString());
            java.util.HashSet hashSet = new java.util.HashSet();
            int length = kVarArr.length;
            while (i17 < length) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar2 = kVarArr[i17];
                if (kVar2.l() && !kz5.n0.O(hashSet, kVar2.i())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "killEmptyProcesses for type:" + killType + ", processName:" + kVar2.i() + '}');
                    java.lang.String i19 = kVar2.i();
                    if (i19 == null) {
                        i19 = "";
                    }
                    hashSet.add(i19);
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.l0(kVar2, null), 2, null);
                }
                i17++;
            }
        }
    }

    public final void r() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar;
        java.util.Iterator it = k().iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.ArrayList) ((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) it.next()).h()).iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it6.next();
                w(sVar);
                try {
                    hVar = f(sVar);
                } catch (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.y unused) {
                    hVar = null;
                }
                if (hVar != null) {
                    hVar.b(sVar);
                }
            }
        }
    }

    public final void s(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        u(this, appId, i17, false, 4, null);
    }

    public final void t(java.lang.String appId, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        i(appId, i17, new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.o(z17, this, appId));
    }

    public final void v(java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            runnable.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(runnable);
        }
    }

    public abstract void w(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar);

    /* JADX WARN: Code restructure failed: missing block: B:209:0x016a, code lost:
    
        if (((java.util.ArrayList) r3.g()).contains(r8.f129229a) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x041c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x x(android.content.Context r37, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.w r38, ik1.b0 r39, yz5.l r40) {
        /*
            Method dump skipped, instructions count: 1643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.x(android.content.Context, com.tencent.luggage.sdk.processes.w, ik1.b0, yz5.l):com.tencent.luggage.sdk.processes.x");
    }

    public final boolean z(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        return B(this, appId, 0, 2, null);
    }
}
