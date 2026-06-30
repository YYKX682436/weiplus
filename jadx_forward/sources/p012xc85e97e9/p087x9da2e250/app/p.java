package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class p extends p012xc85e97e9.p087x9da2e250.app.n3 {
    @Override // p012xc85e97e9.p087x9da2e250.app.n3
    public void b(java.util.List list, boolean z17) {
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var;
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap;
        java.util.ArrayList arrayList2;
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var2;
        boolean z18;
        java.util.Iterator it;
        boolean z19;
        java.lang.Object obj;
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var3;
        android.view.View view;
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var4;
        android.view.View view2;
        java.lang.Object obj2;
        p012xc85e97e9.p087x9da2e250.app.m3 m3Var;
        x.b bVar;
        java.util.ArrayList arrayList3;
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var5;
        p012xc85e97e9.p087x9da2e250.app.m3 m3Var2;
        java.util.ArrayList arrayList4;
        java.util.HashMap hashMap2;
        java.util.ArrayList arrayList5;
        android.graphics.Rect rect;
        java.util.ArrayList arrayList6;
        p012xc85e97e9.p087x9da2e250.app.b3 b3Var;
        android.view.View view3;
        java.lang.Object obj3;
        java.lang.Object obj4;
        android.view.View view4;
        java.util.Iterator it6;
        java.util.ArrayList arrayList7;
        boolean z27 = z17;
        java.util.Iterator it7 = list.iterator();
        p012xc85e97e9.p087x9da2e250.app.m3 m3Var3 = null;
        p012xc85e97e9.p087x9da2e250.app.m3 m3Var4 = null;
        while (true) {
            boolean hasNext = it7.hasNext();
            l3Var = p012xc85e97e9.p087x9da2e250.app.l3.VISIBLE;
            if (!hasNext) {
                break;
            }
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var5 = (p012xc85e97e9.p087x9da2e250.app.m3) it7.next();
            p012xc85e97e9.p087x9da2e250.app.l3 d17 = p012xc85e97e9.p087x9da2e250.app.l3.d(m3Var5.f92935c.f3462x628b0b2);
            int ordinal = m3Var5.f92933a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                    }
                } else if (d17 != l3Var) {
                    m3Var4 = m3Var5;
                }
            }
            if (d17 == l3Var && m3Var3 == null) {
                m3Var3 = m3Var5;
            }
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.util.ArrayList arrayList10 = new java.util.ArrayList(list);
        java.util.Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var6 = (p012xc85e97e9.p087x9da2e250.app.m3) it8.next();
            j3.h hVar = new j3.h();
            m3Var6.d();
            m3Var6.f92937e.add(hVar);
            arrayList8.add(new p012xc85e97e9.p087x9da2e250.app.m(m3Var6, hVar, z27));
            j3.h hVar2 = new j3.h();
            m3Var6.d();
            m3Var6.f92937e.add(hVar2);
            arrayList9.add(new p012xc85e97e9.p087x9da2e250.app.o(m3Var6, hVar2, z27, !z27 ? m3Var6 != m3Var4 : m3Var6 != m3Var3));
            ((java.util.ArrayList) m3Var6.f92936d).add(new p012xc85e97e9.p087x9da2e250.app.c(this, arrayList10, m3Var6));
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.Iterator it9 = arrayList9.iterator();
        p012xc85e97e9.p087x9da2e250.app.b3 b3Var2 = null;
        while (it9.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.o oVar = (p012xc85e97e9.p087x9da2e250.app.o) it9.next();
            if (oVar.b()) {
                it6 = it9;
                arrayList7 = arrayList10;
            } else {
                java.lang.Object obj5 = oVar.f92958c;
                p012xc85e97e9.p087x9da2e250.app.b3 c17 = oVar.c(obj5);
                java.lang.Object obj6 = oVar.f92960e;
                p012xc85e97e9.p087x9da2e250.app.b3 c18 = oVar.c(obj6);
                it6 = it9;
                arrayList7 = arrayList10;
                p012xc85e97e9.p087x9da2e250.app.m3 m3Var7 = oVar.f92940a;
                if (c17 != null && c18 != null && c17 != c18) {
                    throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m3Var7.f92935c + " returned Transition " + obj5 + " which uses a different Transition  type than its shared element transition " + obj6);
                }
                if (c17 == null) {
                    c17 = c18;
                }
                if (b3Var2 == null) {
                    b3Var2 = c17;
                } else if (c17 != null && b3Var2 != c17) {
                    throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m3Var7.f92935c + " returned Transition " + obj5 + " which uses a different Transition  type than other Fragments.");
                }
            }
            it9 = it6;
            arrayList10 = arrayList7;
        }
        java.util.ArrayList arrayList11 = arrayList10;
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var6 = p012xc85e97e9.p087x9da2e250.app.l3.GONE;
        android.view.ViewGroup viewGroup = this.f92953a;
        if (b3Var2 == null) {
            java.util.Iterator it10 = arrayList9.iterator();
            while (it10.hasNext()) {
                p012xc85e97e9.p087x9da2e250.app.o oVar2 = (p012xc85e97e9.p087x9da2e250.app.o) it10.next();
                hashMap3.put(oVar2.f92940a, java.lang.Boolean.FALSE);
                oVar2.a();
            }
            l3Var2 = l3Var6;
            arrayList = arrayList8;
            arrayList2 = arrayList11;
            z18 = false;
            hashMap = hashMap3;
        } else {
            android.view.View view5 = new android.view.View(viewGroup.getContext());
            android.graphics.Rect rect2 = new android.graphics.Rect();
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            x.b bVar2 = new x.b();
            java.util.Iterator it11 = arrayList9.iterator();
            java.util.HashMap hashMap4 = hashMap3;
            android.graphics.Rect rect3 = rect2;
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var8 = m3Var3;
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var9 = m3Var4;
            arrayList = arrayList8;
            java.lang.Object obj7 = null;
            android.view.View view6 = null;
            boolean z28 = false;
            while (it11.hasNext()) {
                p012xc85e97e9.p087x9da2e250.app.l3 l3Var7 = l3Var;
                java.lang.Object obj8 = ((p012xc85e97e9.p087x9da2e250.app.o) it11.next()).f92960e;
                if (!(obj8 != null) || m3Var8 == null || m3Var9 == null) {
                    bVar = bVar2;
                    arrayList3 = arrayList12;
                    l3Var5 = l3Var6;
                    m3Var2 = m3Var4;
                    arrayList4 = arrayList9;
                    hashMap2 = hashMap4;
                    arrayList5 = arrayList11;
                    rect = rect3;
                    arrayList6 = arrayList13;
                    b3Var = b3Var2;
                    view3 = view5;
                } else {
                    java.lang.Object x17 = b3Var2.x(b3Var2.g(obj8));
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = m3Var9.f92935c;
                    java.util.ArrayList<java.lang.String> m7465x8dbd760c = componentCallbacksC1101xa17d4670.m7465x8dbd760c();
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = m3Var8.f92935c;
                    p012xc85e97e9.p087x9da2e250.app.b3 b3Var3 = b3Var2;
                    java.util.ArrayList<java.lang.String> m7465x8dbd760c2 = componentCallbacksC1101xa17d46702.m7465x8dbd760c();
                    l3Var5 = l3Var6;
                    java.util.ArrayList<java.lang.String> m7466x1688e656 = componentCallbacksC1101xa17d46702.m7466x1688e656();
                    android.view.View view7 = view5;
                    arrayList4 = arrayList9;
                    int i17 = 0;
                    while (true) {
                        obj3 = x17;
                        if (i17 >= m7466x1688e656.size()) {
                            break;
                        }
                        int indexOf = m7465x8dbd760c.indexOf(m7466x1688e656.get(i17));
                        if (indexOf != -1) {
                            m7465x8dbd760c.set(indexOf, m7465x8dbd760c2.get(i17));
                        }
                        i17++;
                        x17 = obj3;
                    }
                    java.util.ArrayList<java.lang.String> m7466x1688e6562 = componentCallbacksC1101xa17d4670.m7466x1688e656();
                    if (z27) {
                        componentCallbacksC1101xa17d46702.m7441x84a1f17c();
                        componentCallbacksC1101xa17d4670.m7444x8a6aed6e();
                    } else {
                        componentCallbacksC1101xa17d46702.m7444x8a6aed6e();
                        componentCallbacksC1101xa17d4670.m7441x84a1f17c();
                    }
                    int size = m7465x8dbd760c.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        bVar2.put(m7465x8dbd760c.get(i18), m7466x1688e6562.get(i18));
                    }
                    x.b bVar3 = new x.b();
                    k(bVar3, componentCallbacksC1101xa17d46702.f3462x628b0b2);
                    x.m.k(bVar3, m7465x8dbd760c);
                    x.m.k(bVar2, bVar3.keySet());
                    x.b bVar4 = new x.b();
                    k(bVar4, componentCallbacksC1101xa17d4670.f3462x628b0b2);
                    x.m.k(bVar4, m7466x1688e6562);
                    x.m.k(bVar4, bVar2.values());
                    int[] iArr = p012xc85e97e9.p087x9da2e250.app.r2.f93000a;
                    for (int i19 = bVar2.f532379f - 1; i19 >= 0; i19--) {
                        if (!bVar4.m174748xc6607c0((java.lang.String) bVar2.l(i19))) {
                            bVar2.j(i19);
                        }
                    }
                    l(bVar3, bVar2.keySet());
                    l(bVar4, bVar2.values());
                    if (bVar2.m174752x7aab3243()) {
                        arrayList12.clear();
                        arrayList13.clear();
                        bVar = bVar2;
                        arrayList3 = arrayList12;
                        m3Var8 = m3Var3;
                        m3Var9 = m3Var4;
                        m3Var2 = m3Var9;
                        hashMap2 = hashMap4;
                        arrayList5 = arrayList11;
                        rect = rect3;
                        b3Var = b3Var3;
                        obj7 = null;
                        arrayList6 = arrayList13;
                        view3 = view7;
                    } else {
                        p012xc85e97e9.p087x9da2e250.app.r2.c(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d46702, z27, bVar3, true);
                        bVar = bVar2;
                        b3Var = b3Var3;
                        p012xc85e97e9.p087x9da2e250.app.m3 m3Var10 = m3Var4;
                        p012xc85e97e9.p087x9da2e250.app.m3 m3Var11 = m3Var4;
                        java.util.HashMap hashMap5 = hashMap4;
                        arrayList6 = arrayList13;
                        arrayList3 = arrayList12;
                        p012xc85e97e9.p087x9da2e250.app.m3 m3Var12 = m3Var3;
                        arrayList5 = arrayList11;
                        android.graphics.Rect rect4 = rect3;
                        n3.m0.a(viewGroup, new p012xc85e97e9.p087x9da2e250.app.i(this, m3Var10, m3Var3, z17, bVar4));
                        java.util.Iterator it12 = ((x.l) bVar3.values()).iterator();
                        while (true) {
                            x.h hVar3 = (x.h) it12;
                            if (!hVar3.hasNext()) {
                                break;
                            } else {
                                j(arrayList3, (android.view.View) hVar3.next());
                            }
                        }
                        if (m7465x8dbd760c.isEmpty()) {
                            obj4 = obj3;
                        } else {
                            android.view.View view8 = (android.view.View) bVar3.m174751x4aabfc28((java.lang.String) m7465x8dbd760c.get(0), null);
                            obj4 = obj3;
                            b3Var.s(obj4, view8);
                            view6 = view8;
                        }
                        java.util.Iterator it13 = ((x.l) bVar4.values()).iterator();
                        while (true) {
                            x.h hVar4 = (x.h) it13;
                            if (!hVar4.hasNext()) {
                                break;
                            } else {
                                j(arrayList6, (android.view.View) hVar4.next());
                            }
                        }
                        if (m7466x1688e6562.isEmpty() || (view4 = (android.view.View) bVar4.m174751x4aabfc28((java.lang.String) m7466x1688e6562.get(0), null)) == null) {
                            rect = rect4;
                            view3 = view7;
                        } else {
                            rect = rect4;
                            n3.m0.a(viewGroup, new p012xc85e97e9.p087x9da2e250.app.j(this, b3Var, view4, rect));
                            view3 = view7;
                            z28 = true;
                        }
                        b3Var.v(obj4, view3, arrayList3);
                        b3Var.q(obj4, null, null, null, null, obj4, arrayList6);
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        hashMap2 = hashMap5;
                        m3Var3 = m3Var12;
                        hashMap2.put(m3Var3, bool);
                        m3Var2 = m3Var11;
                        hashMap2.put(m3Var2, bool);
                        obj7 = obj4;
                        m3Var8 = m3Var3;
                        m3Var9 = m3Var2;
                    }
                }
                view5 = view3;
                rect3 = rect;
                arrayList12 = arrayList3;
                hashMap4 = hashMap2;
                arrayList13 = arrayList6;
                m3Var4 = m3Var2;
                b3Var2 = b3Var;
                bVar2 = bVar;
                l3Var = l3Var7;
                l3Var6 = l3Var5;
                arrayList9 = arrayList4;
                arrayList11 = arrayList5;
                z27 = z17;
            }
            x.b bVar5 = bVar2;
            java.util.ArrayList arrayList14 = arrayList12;
            p012xc85e97e9.p087x9da2e250.app.l3 l3Var8 = l3Var6;
            p012xc85e97e9.p087x9da2e250.app.l3 l3Var9 = l3Var;
            java.util.ArrayList arrayList15 = arrayList9;
            hashMap = hashMap4;
            arrayList2 = arrayList11;
            android.graphics.Rect rect5 = rect3;
            p012xc85e97e9.p087x9da2e250.app.b3 b3Var4 = b3Var2;
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var13 = m3Var4;
            java.util.ArrayList arrayList16 = arrayList13;
            android.view.View view9 = view5;
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            java.util.Iterator it14 = arrayList15.iterator();
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var14 = m3Var9;
            java.lang.Object obj9 = null;
            java.lang.Object obj10 = null;
            while (it14.hasNext()) {
                java.util.Iterator it15 = it14;
                p012xc85e97e9.p087x9da2e250.app.o oVar3 = (p012xc85e97e9.p087x9da2e250.app.o) it14.next();
                boolean b17 = oVar3.b();
                p012xc85e97e9.p087x9da2e250.app.m3 m3Var15 = m3Var13;
                p012xc85e97e9.p087x9da2e250.app.m3 m3Var16 = oVar3.f92940a;
                if (b17) {
                    hashMap.put(m3Var16, java.lang.Boolean.FALSE);
                    oVar3.a();
                    view = view9;
                    obj2 = obj9;
                    obj = obj7;
                    obj10 = obj10;
                    view2 = view6;
                    l3Var4 = l3Var9;
                    m3Var = m3Var14;
                    l3Var3 = l3Var8;
                } else {
                    java.lang.Object obj11 = obj10;
                    java.lang.Object g17 = b3Var4.g(oVar3.f92958c);
                    boolean z29 = obj7 != null && (m3Var16 == m3Var8 || m3Var16 == m3Var14);
                    if (g17 == null) {
                        if (!z29) {
                            hashMap.put(m3Var16, java.lang.Boolean.FALSE);
                            oVar3.a();
                        }
                        view = view9;
                        obj2 = obj9;
                        obj = obj7;
                        obj10 = obj11;
                        view2 = view6;
                        l3Var4 = l3Var9;
                        l3Var3 = l3Var8;
                    } else {
                        obj = obj7;
                        java.util.ArrayList arrayList18 = new java.util.ArrayList();
                        java.lang.Object obj12 = obj9;
                        j(arrayList18, m3Var16.f92935c.f3462x628b0b2);
                        if (z29) {
                            if (m3Var16 == m3Var8) {
                                arrayList18.removeAll(arrayList14);
                            } else {
                                arrayList18.removeAll(arrayList16);
                            }
                        }
                        if (arrayList18.isEmpty()) {
                            b3Var4.a(g17, view9);
                            l3Var3 = l3Var8;
                        } else {
                            b3Var4.b(g17, arrayList18);
                            b3Var4.q(g17, g17, arrayList18, null, null, null, null);
                            l3Var3 = l3Var8;
                            if (m3Var16.f92933a == l3Var3) {
                                b3Var4.p(g17, m3Var16.f92935c.f3462x628b0b2, arrayList18);
                                n3.m0.a(viewGroup, new p012xc85e97e9.p087x9da2e250.app.k(this, arrayList18));
                            }
                        }
                        view = view9;
                        l3Var4 = l3Var9;
                        if (m3Var16.f92933a == l3Var4) {
                            arrayList17.addAll(arrayList18);
                            if (z28) {
                                b3Var4.r(g17, rect5);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            b3Var4.s(g17, view2);
                        }
                        hashMap.put(m3Var16, java.lang.Boolean.TRUE);
                        if (oVar3.f92959d) {
                            obj2 = b3Var4.l(obj12, g17, null);
                            obj10 = obj11;
                        } else {
                            obj2 = obj12;
                            obj10 = b3Var4.l(obj11, g17, null);
                        }
                    }
                    m3Var = m3Var15;
                }
                l3Var9 = l3Var4;
                view6 = view2;
                l3Var8 = l3Var3;
                m3Var14 = m3Var;
                view9 = view;
                obj7 = obj;
                m3Var13 = m3Var15;
                obj9 = obj2;
                it14 = it15;
            }
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var17 = m3Var13;
            l3Var2 = l3Var8;
            java.lang.Object obj13 = obj7;
            java.lang.Object k17 = b3Var4.k(obj9, obj10, obj13);
            java.util.Iterator it16 = arrayList15.iterator();
            while (it16.hasNext()) {
                p012xc85e97e9.p087x9da2e250.app.o oVar4 = (p012xc85e97e9.p087x9da2e250.app.o) it16.next();
                if (!oVar4.b()) {
                    p012xc85e97e9.p087x9da2e250.app.m3 m3Var18 = oVar4.f92940a;
                    p012xc85e97e9.p087x9da2e250.app.m3 m3Var19 = m3Var17;
                    if (obj13 == null || !(m3Var18 == m3Var8 || m3Var18 == m3Var19)) {
                        it = it16;
                        z19 = false;
                    } else {
                        it = it16;
                        z19 = true;
                    }
                    if (oVar4.f92958c != null || z19) {
                        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                        if (n3.x0.c(viewGroup)) {
                            b3Var4.t(m3Var18.f92935c, k17, oVar4.f92941b, new p012xc85e97e9.p087x9da2e250.app.l(this, oVar4));
                        } else {
                            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                                java.util.Objects.toString(viewGroup);
                                java.util.Objects.toString(m3Var18);
                            }
                            oVar4.a();
                        }
                    }
                    it16 = it;
                    m3Var17 = m3Var19;
                }
            }
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            if (n3.x0.c(viewGroup)) {
                p012xc85e97e9.p087x9da2e250.app.r2.k(arrayList17, 4);
                java.util.ArrayList m17 = b3Var4.m(arrayList16);
                b3Var4.c(viewGroup, k17);
                b3Var4.u(this.f92953a, arrayList14, arrayList16, m17, bVar5);
                z18 = false;
                p012xc85e97e9.p087x9da2e250.app.r2.k(arrayList17, 0);
                b3Var4.w(obj13, arrayList14, arrayList16);
            } else {
                z18 = false;
            }
        }
        boolean containsValue = hashMap.containsValue(java.lang.Boolean.TRUE);
        android.content.Context context = viewGroup.getContext();
        java.util.ArrayList arrayList19 = new java.util.ArrayList();
        java.util.Iterator it17 = arrayList.iterator();
        boolean z37 = z18;
        while (it17.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.m mVar = (p012xc85e97e9.p087x9da2e250.app.m) it17.next();
            if (mVar.b()) {
                mVar.a();
            } else {
                p012xc85e97e9.p087x9da2e250.app.p0 c19 = mVar.c(context);
                if (c19 == null) {
                    mVar.a();
                } else {
                    android.animation.Animator animator = c19.f92982b;
                    if (animator == null) {
                        arrayList19.add(mVar);
                    } else {
                        p012xc85e97e9.p087x9da2e250.app.m3 m3Var20 = mVar.f92940a;
                        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46703 = m3Var20.f92935c;
                        if (java.lang.Boolean.TRUE.equals(hashMap.get(m3Var20))) {
                            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                                java.util.Objects.toString(componentCallbacksC1101xa17d46703);
                            }
                            mVar.a();
                        } else {
                            boolean z38 = m3Var20.f92933a == l3Var2 ? true : z18;
                            java.util.ArrayList arrayList20 = arrayList2;
                            if (z38) {
                                arrayList20.remove(m3Var20);
                            }
                            android.view.View view10 = componentCallbacksC1101xa17d46703.f3462x628b0b2;
                            viewGroup.startViewTransition(view10);
                            animator.addListener(new p012xc85e97e9.p087x9da2e250.app.d(this, viewGroup, view10, z38, m3Var20, mVar));
                            animator.setTarget(view10);
                            animator.start();
                            mVar.f92941b.b(new p012xc85e97e9.p087x9da2e250.app.e(this, animator));
                            arrayList2 = arrayList20;
                            z18 = false;
                            z37 = true;
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList21 = arrayList2;
        java.util.Iterator it18 = arrayList19.iterator();
        while (it18.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.m mVar2 = (p012xc85e97e9.p087x9da2e250.app.m) it18.next();
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var21 = mVar2.f92940a;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46704 = m3Var21.f92935c;
            if (containsValue) {
                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                    java.util.Objects.toString(componentCallbacksC1101xa17d46704);
                }
                mVar2.a();
            } else if (z37) {
                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                    java.util.Objects.toString(componentCallbacksC1101xa17d46704);
                }
                mVar2.a();
            } else {
                android.view.View view11 = componentCallbacksC1101xa17d46704.f3462x628b0b2;
                p012xc85e97e9.p087x9da2e250.app.p0 c27 = mVar2.c(context);
                c27.getClass();
                android.view.animation.Animation animation = c27.f92981a;
                animation.getClass();
                if (m3Var21.f92933a != p012xc85e97e9.p087x9da2e250.app.l3.REMOVED) {
                    view11.startAnimation(animation);
                    mVar2.a();
                } else {
                    viewGroup.startViewTransition(view11);
                    p012xc85e97e9.p087x9da2e250.app.q0 q0Var = new p012xc85e97e9.p087x9da2e250.app.q0(animation, viewGroup, view11);
                    q0Var.setAnimationListener(new p012xc85e97e9.p087x9da2e250.app.g(this, viewGroup, view11, mVar2));
                    view11.startAnimation(q0Var);
                }
                mVar2.f92941b.b(new p012xc85e97e9.p087x9da2e250.app.h(this, view11, viewGroup, mVar2));
            }
        }
        java.util.Iterator it19 = arrayList21.iterator();
        while (it19.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var22 = (p012xc85e97e9.p087x9da2e250.app.m3) it19.next();
            m3Var22.f92933a.a(m3Var22.f92935c.f3462x628b0b2);
        }
        arrayList21.clear();
    }

    public void j(java.util.ArrayList arrayList, android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (n3.q1.b(viewGroup)) {
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt.getVisibility() == 0) {
                j(arrayList, childAt);
            }
        }
    }

    public void k(java.util.Map map, android.view.View view) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        java.lang.String k17 = n3.a1.k(view);
        if (k17 != null) {
            map.put(k17, view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(x.b bVar, java.util.Collection collection) {
        java.util.Iterator it = ((x.i) bVar.entrySet()).iterator();
        while (true) {
            x.k kVar = (x.k) it;
            if (!kVar.hasNext()) {
                return;
            }
            kVar.next();
            android.view.View view = (android.view.View) kVar.getValue();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (!collection.contains(n3.a1.k(view))) {
                kVar.remove();
            }
        }
    }
}
