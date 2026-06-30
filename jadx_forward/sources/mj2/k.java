package mj2;

/* loaded from: classes10.dex */
public final class k extends mj2.e {

    /* renamed from: v, reason: collision with root package name */
    public int f408570v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, gk2.e liveData, android.view.View root, zh2.c pluginAbility, zh2.e micUserInterface, zh2.d dVar) {
        super(context, liveData, root, pluginAbility, micUserInterface, dVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserInterface, "micUserInterface");
        this.f408570v = 1;
    }

    @Override // mj2.e
    public void k(java.lang.String source) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (this.f408570v == 2) {
            dk2.u4 u4Var = ((mm2.o4) this.f408547e.a(mm2.o4.class)).Z;
            boolean z17 = false;
            if (u4Var != null && u4Var.k()) {
                z17 = true;
            }
            if (z17) {
                this.f408558s.clear();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.List list = ((mm2.o4) this.f408547e.a(mm2.o4.class)).f410860v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
                synchronized (list) {
                    arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390722t, java.lang.Boolean.TRUE)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                synchronized (arrayList2) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        km2.q qVar = (km2.q) it.next();
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f390703a, ((mm2.e1) this.f408547e.a(mm2.e1.class)).f410520q.f461834n)) {
                            hashMap.put(java.lang.Integer.valueOf(qVar.f390725w), qVar);
                            linkedList.add(qVar);
                        }
                    }
                }
                java.util.ArrayList arrayList3 = this.f408558s;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(new vi2.j((km2.q) it6.next()));
                }
                arrayList3.addAll(arrayList4);
                this.f408557r.clear();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                km2.q qVar2 = (km2.q) hashMap.get(2);
                if (qVar2 != null) {
                    arrayList5.add(new vi2.j(qVar2));
                }
                km2.q qVar3 = (km2.q) hashMap.get(3);
                if (qVar3 != null) {
                    arrayList5.add(new vi2.j(qVar3));
                }
                km2.q qVar4 = (km2.q) hashMap.get(6);
                if (qVar4 != null) {
                    arrayList5.add(new vi2.j(qVar4));
                }
                km2.q qVar5 = (km2.q) hashMap.get(7);
                if (qVar5 != null) {
                    arrayList5.add(new vi2.j(qVar5));
                }
                if (arrayList5.size() > 0) {
                    this.f408557r.add(new vi2.c(fj2.k.f344708d));
                    this.f408557r.addAll(arrayList5);
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                km2.q qVar6 = (km2.q) hashMap.get(4);
                if (qVar6 != null) {
                    arrayList6.add(new vi2.j(qVar6));
                }
                km2.q qVar7 = (km2.q) hashMap.get(5);
                if (qVar7 != null) {
                    arrayList6.add(new vi2.j(qVar7));
                }
                km2.q qVar8 = (km2.q) hashMap.get(8);
                if (qVar8 != null) {
                    arrayList6.add(new vi2.j(qVar8));
                }
                km2.q qVar9 = (km2.q) hashMap.get(9);
                if (qVar9 != null) {
                    arrayList6.add(new vi2.j(qVar9));
                }
                if (arrayList6.size() > 0) {
                    this.f408557r.add(new vi2.c(fj2.k.f344709e));
                    this.f408557r.addAll(arrayList6);
                    return;
                }
                return;
            }
        }
        this.f408558s.clear();
        java.util.ArrayList arrayList7 = this.f408558s;
        java.util.List list2 = ((mm2.o4) this.f408547e.a(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-audienceLinkMicUserList>(...)");
        synchronized (list2) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390722t, java.lang.Boolean.TRUE)) {
                    arrayList.add(obj2);
                }
            }
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList8.add(new vi2.j((km2.q) it7.next()));
        }
        arrayList7.addAll(arrayList8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f408552m, "onSoloFillData applyRealSize: " + this.f408558s.size() + " audienceLinkMicUserList: " + ((mm2.o4) this.f408547e.a(mm2.o4.class)).f410860v);
        this.f408557r.clear();
        this.f408557r.addAll(this.f408558s);
    }

    @Override // mj2.e
    public java.lang.String l() {
        return "PkAcceptPanelWidget";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3 != null ? r3.f390703a : null, r10.f390703a) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        db5.t7.m123883x26a183b(r8.f408548f.getContext(), r8.f408548f.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzz), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0 != null ? r0.f390703a : null, r10.f390703a) != false) goto L26;
     */
    @Override // mj2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(int r9, km2.q r10) {
        /*
            r8 = this;
            java.lang.String r0 = "hungupUser"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            gk2.e r0 = r8.f408547e
            java.lang.Class<mm2.o4> r1 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm2.o4 r0 = (mm2.o4) r0
            dk2.u4 r0 = r0.Z
            if (r0 == 0) goto Lec
            boolean r1 = r0.h()
            if (r1 == 0) goto Lec
            int r0 = r0.f315693g
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L90
            r3 = 2
            if (r0 == r3) goto L24
            goto Lec
        L24:
            gk2.e r0 = r8.f408547e
            java.lang.Class<mm2.y2> r3 = mm2.y2.class
            androidx.lifecycle.c1 r0 = r0.a(r3)
            mm2.y2 r0 = (mm2.y2) r0
            jz5.l r0 = r0.V6()
            java.lang.Object r3 = r0.f384366d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r4 = 0
            if (r3 != r2) goto L55
            java.lang.Object r3 = r0.f384366d
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = kz5.n0.a0(r3, r1)
            km2.q r3 = (km2.q) r3
            if (r3 == 0) goto L4c
            java.lang.String r3 = r3.f390703a
            goto L4d
        L4c:
            r3 = r4
        L4d:
            java.lang.String r5 = r10.f390703a
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r5)
            if (r3 != 0) goto L75
        L55:
            java.lang.Object r3 = r0.f384367e
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            if (r3 != r2) goto Lec
            java.lang.Object r0 = r0.f384367e
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = kz5.n0.a0(r0, r1)
            km2.q r0 = (km2.q) r0
            if (r0 == 0) goto L6d
            java.lang.String r4 = r0.f390703a
        L6d:
            java.lang.String r0 = r10.f390703a
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r0)
            if (r0 == 0) goto Lec
        L75:
            android.view.View r0 = r8.f408548f
            android.content.Context r0 = r0.getContext()
            android.view.View r2 = r8.f408548f
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131764843(0x7f10266b, float:1.916083E38)
            java.lang.String r2 = r2.getString(r3)
            db5.t7.m123883x26a183b(r0, r2, r1)
            goto Lec
        L90:
            gk2.e r0 = r8.f408547e
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r0.a(r3)
            mm2.o4 r0 = (mm2.o4) r0
            java.util.List r0 = r0.f410860v
            java.lang.String r3 = "<get-audienceLinkMicUserList>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            monitor-enter(r0)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le9
            r3.<init>()     // Catch: java.lang.Throwable -> Le9
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> Le9
        Lab:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Le9
            if (r5 == 0) goto Lc7
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Le9
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> Le9
            java.lang.Boolean r6 = r6.f390722t     // Catch: java.lang.Throwable -> Le9
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le9
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r7)     // Catch: java.lang.Throwable -> Le9
            r6 = r6 ^ r2
            if (r6 == 0) goto Lab
            r3.add(r5)     // Catch: java.lang.Throwable -> Le9
            goto Lab
        Lc7:
            monitor-exit(r0)
            int r0 = r3.size()
            if (r0 != r2) goto Lec
            android.view.View r0 = r8.f408548f
            android.content.Context r0 = r0.getContext()
            android.view.View r2 = r8.f408548f
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131764841(0x7f102669, float:1.9160827E38)
            java.lang.String r2 = r2.getString(r3)
            db5.t7.m123883x26a183b(r0, r2, r1)
            goto Lec
        Le9:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        Lec:
            super.n(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mj2.k.n(int, km2.q):void");
    }

    @Override // mj2.e
    public void p() {
        android.view.View view = this.f408556q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorPkAcceptPanelWidget", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorPkAcceptPanelWidget", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f408555p.setVisibility(0);
        this.f408554o.setText(this.f408548f.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzd, java.lang.Integer.valueOf(this.f408558s.size())));
    }

    @Override // mj2.e
    public void q() {
        android.view.View view = this.f408556q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorPkAcceptPanelWidget", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicVisitorPkAcceptPanelWidget", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f408555p.setVisibility(8);
        this.f408554o.setText(this.f408548f.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzv));
    }

    public void s() {
        dk2.u4 u4Var = ((mm2.o4) this.f408547e.a(mm2.o4.class)).Z;
        this.f408570v = u4Var != null ? u4Var.f315693g : 1;
        r("onBind");
    }
}
