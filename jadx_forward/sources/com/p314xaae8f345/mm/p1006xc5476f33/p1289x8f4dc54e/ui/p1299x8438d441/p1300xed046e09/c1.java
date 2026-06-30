package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f175731d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f175732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f175733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f175735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f175733f = j17;
        this.f175734g = str;
        this.f175735h = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c1(this.f175733f, this.f175734g, interfaceC29045xdcb5ca57, this.f175735h);
        c1Var.f175732e = obj;
        return c1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.util.ArrayList arrayList;
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f175731d;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f175732e;
            long j17 = this.f175733f;
            this.f175732e = y0Var2;
            this.f175731d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f175732e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.ca caVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274039a;
        java.lang.String str = this.f175734g;
        synchronized (caVar) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274041c;
            java.lang.Object obj2 = hashMap.get(str);
            arrayList = null;
            java.util.Queue queue = obj2 instanceof java.util.Queue ? (java.util.Queue) obj2 : null;
            if (queue != null) {
                hashMap.remove(str);
                arrayList = new java.util.ArrayList(queue);
            }
        }
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadData addToPreload batch:");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.d(((java.util.ArrayList) it.next()).get(0).toString()));
                }
                sb6.append(arrayList2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", sb6.toString());
            }
            java.util.List x07 = kz5.n0.x0(arrayList);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : x07) {
                java.util.ArrayList arrayList4 = (java.util.ArrayList) obj3;
                if (arrayList4 != null && (arrayList4.get(0) instanceof java.lang.String)) {
                    arrayList3.add(obj3);
                }
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                java.lang.Object obj4 = ((java.util.ArrayList) next).get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
                if (hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.d((java.lang.String) obj4))) {
                    arrayList5.add(next);
                }
            }
            if (!arrayList5.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
                int i19 = this.f175735h;
                int i27 = i19 != 1 ? i19 != 2 ? 0 : 2 : 1;
                if (i27 != 0) {
                    java.util.Iterator it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        java.util.ArrayList arrayList6 = (java.util.ArrayList) it7.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        java.lang.Object[] objArr = new java.lang.Object[11];
                        objArr[0] = new java.lang.Integer(i27);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
                        objArr[1] = t1Var3.q(arrayList6, 3, "");
                        java.lang.Object obj5 = arrayList6.get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
                        objArr[2] = fp.s0.a((java.lang.String) obj5);
                        objArr[3] = t1Var3.q(arrayList6, 4, "");
                        objArr[4] = t1Var3.q(arrayList6, 5, "");
                        objArr[5] = new java.lang.Integer(2);
                        objArr[6] = arrayList6.get(1);
                        objArr[7] = t1Var3.q(arrayList6, 6, "");
                        objArr[8] = t1Var3.q(arrayList6, 7, "");
                        objArr[9] = t1Var3.q(arrayList6, 8, "");
                        java.lang.Object obj6 = arrayList6.get(1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj6, "null cannot be cast to non-null type kotlin.Int");
                        if (((java.lang.Integer) obj6).intValue() == -1) {
                            java.lang.Object obj7 = arrayList6.get(0);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj7, "null cannot be cast to non-null type kotlin.String");
                            if (hy4.i.l((java.lang.String) obj7)) {
                                i17 = 1;
                                objArr[10] = new java.lang.Integer(i17);
                                g0Var.d(16468, objArr);
                            }
                        }
                        i17 = 0;
                        objArr[10] = new java.lang.Integer(i17);
                        g0Var.d(16468, objArr);
                    }
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a.s(this.f175735h))) {
                    int m17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.m(this.f175735h);
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.util.Iterator it8 = arrayList5.iterator();
                    while (it8.hasNext()) {
                        java.lang.Object next2 = it8.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(((java.util.ArrayList) next2).get(0), "null cannot be cast to non-null type kotlin.String");
                        if (!(!hy4.i.l((java.lang.String) r7))) {
                            arrayList7.add(next2);
                        }
                    }
                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(arrayList7, 10));
                    java.util.Iterator it9 = arrayList7.iterator();
                    while (it9.hasNext()) {
                        java.util.ArrayList arrayList9 = (java.util.ArrayList) it9.next();
                        java.lang.Object obj8 = arrayList9.get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj8, "null cannot be cast to non-null type kotlin.String");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
                        java.lang.Object obj9 = arrayList9.get(1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj9, "null cannot be cast to non-null type kotlin.Int");
                        int j18 = t1Var4.j(((java.lang.Integer) obj9).intValue());
                        java.lang.Object obj10 = arrayList9.get(2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj10, "null cannot be cast to non-null type kotlin.String");
                        arrayList8.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0((java.lang.String) obj8, j18, (java.lang.String) obj10));
                    }
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.util.Iterator it10 = arrayList8.iterator();
                    while (it10.hasNext()) {
                        java.lang.Object next3 = it10.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0) next3;
                        java.lang.String str2 = z0Var.f176018a;
                        if (!(!hy4.i.p(str2) || com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175976i.b(str2, z0Var.f176019b))) {
                            arrayList10.add(next3);
                        }
                    }
                    int size = arrayList10.size();
                    int max = java.lang.Math.max(arrayList10.size() - m17, 0);
                    java.util.List K0 = kz5.n0.K0(arrayList10, m17);
                    if (true ^ K0.isEmpty()) {
                        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).y(this.f175735h, size, K0.size(), K0.size() / size, max, m17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a.d(K0, this.f175735h, max, 2);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preloadData addToPreload toStrip:");
                        sb7.append(m17);
                        sb7.append(" strip:");
                        sb7.append(max);
                        sb7.append("  dispatch:");
                        java.util.ArrayList arrayList11 = new java.util.ArrayList(kz5.d0.q(K0, 10));
                        java.util.Iterator it11 = K0.iterator();
                        while (it11.hasNext()) {
                            arrayList11.add(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0) it11.next()).f176018a));
                        }
                        sb7.append(arrayList11);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", sb7.toString());
                    }
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274040b.remove(this.f175734g);
        return jz5.f0.f384359a;
    }
}
