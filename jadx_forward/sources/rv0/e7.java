package rv0;

/* loaded from: classes5.dex */
public final class e7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final rv0.d7 f481521c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f481522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(int i17, int i18, rv0.d7 itemTouchListener, yz5.l canDrag) {
        super(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTouchListener, "itemTouchListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canDrag, "canDrag");
        this.f481521c = itemTouchListener;
        this.f481522d = canDrag;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.e1
    public int a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        if (((java.lang.Boolean) this.f481522d.mo146xb9724478(viewHolder)).booleanValue()) {
            return this.f93542b;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onChildDraw */
    public void mo8128xf876e561(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, float f17, float f18, int i17, boolean z17) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        super.mo8128xf876e561(c17, recyclerView, viewHolder, f17, f18, i17, z17);
        viewHolder.f3639x46306858.getX();
        viewHolder.f3639x46306858.getY();
        ((wv0.l) this.f481521c).getClass();
        sv0.i iVar = viewHolder instanceof sv0.i ? (sv0.i) viewHolder : null;
        if (iVar == null || (view = iVar.f3639x46306858) == null) {
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(new int[2]);
        int i18 = width / 2;
        int i19 = height / 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMoved */
    public void mo8133xaffa1414(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 target, int i18, int i19, int i27) {
        sv0.j m174519xdf919e9b;
        sv0.j m174519xdf919e9b2;
        vv0.n nVar;
        vv0.n nVar2;
        sv0.j m174519xdf919e9b3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        super.mo8133xaffa1414(recyclerView, viewHolder, i17, target, i18, i19, i27);
        wv0.l lVar = (wv0.l) this.f481521c;
        lVar.getClass();
        lVar.f531454a = i18;
        wv0.q qVar = lVar.f531456c;
        m174519xdf919e9b = qVar.m174519xdf919e9b();
        vv0.n nVar3 = (vv0.n) kz5.n0.a0(m174519xdf919e9b.f357503d, i17);
        if (i18 > i17) {
            m174519xdf919e9b3 = qVar.m174519xdf919e9b();
            nVar2 = (vv0.n) kz5.n0.a0(m174519xdf919e9b3.f357503d, i18);
            nVar = nVar3;
        } else {
            m174519xdf919e9b2 = qVar.m174519xdf919e9b();
            nVar = (vv0.n) kz5.n0.a0(m174519xdf919e9b2.f357503d, i18);
            nVar2 = nVar3;
        }
        if (nVar != null && nVar2 != null && nVar3 != null) {
            lVar.f531455b = nVar3.f521931a;
            yz5.p m174525xdf208672 = qVar.m174525xdf208672();
            if (m174525xdf208672 != null) {
                m174525xdf208672.mo149xb9724478(nVar2, nVar);
            }
        }
        wv0.q.L(qVar, i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (((java.lang.Boolean) r17.f481522d.mo146xb9724478(r18)).booleanValue() == true) goto L9;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSelectedChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8134xb54743ba(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            rv0.d7 r3 = r0.f481521c
            r4 = 0
            r5 = 2
            r6 = r19
            if (r6 != r5) goto L6b
            if (r1 == 0) goto L1f
            yz5.l r6 = r0.f481522d
            java.lang.Object r6 = r6.mo146xb9724478(r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = 1
            if (r6 != r7) goto L1f
            goto L20
        L1f:
            r7 = r4
        L20:
            if (r7 == 0) goto L6b
            wv0.l r3 = (wv0.l) r3
            if (r1 == 0) goto L2e
            r3.getClass()
            int r6 = r18.m8183xf806b362()
            goto L30
        L2e:
            int r6 = r3.f531454a
        L30:
            r3.f531454a = r6
            wv0.q r6 = r3.f531456c
            sv0.j r7 = wv0.q.K(r6)
            r7.m165374x9dcc288c()
            sv0.j r7 = wv0.q.K(r6)
            int r8 = r3.f531454a
            r7.z(r8, r2)
            if (r1 == 0) goto L4d
            android.view.View r1 = r1.f3639x46306858
            if (r1 == 0) goto L4d
            r1.performHapticFeedback(r4, r5)
        L4d:
            sv0.j r1 = wv0.q.K(r6)
            java.util.ArrayList r1 = r1.f357503d
            int r2 = r3.f531454a
            java.lang.Object r1 = kz5.n0.a0(r1, r2)
            vv0.n r1 = (vv0.n) r1
            if (r1 == 0) goto Lc4
            com.tencent.maas.base.MJID r1 = r1.f521931a
            if (r1 == 0) goto Lc4
            yz5.l r2 = r6.m174522xcaca950d()
            if (r2 == 0) goto Lc4
            r2.mo146xb9724478(r1)
            goto Lc4
        L6b:
            wv0.l r3 = (wv0.l) r3
            wv0.q r1 = r3.f531456c
            sv0.j r5 = wv0.q.K(r1)
            int r6 = r3.f531454a
            r5.m8147xed6e4d18(r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            sv0.j r6 = wv0.q.K(r1)
            java.util.ArrayList r6 = r6.f357503d
            int r6 = r6.size()
        L87:
            if (r4 >= r6) goto Lae
            sv0.j r7 = wv0.q.K(r1)
            java.util.ArrayList r7 = r7.f357503d
            java.lang.Object r7 = r7.get(r4)
            java.lang.String r8 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)
            r9 = r7
            vv0.n r9 = (vv0.n) r9
            r10 = 0
            r11 = 0
            int r4 = r4 + 1
            r13 = 0
            r14 = 0
            r15 = 27
            r16 = 0
            r12 = r4
            vv0.n r7 = vv0.n.a(r9, r10, r11, r12, r13, r14, r15, r16)
            r5.add(r7)
            goto L87
        Lae:
            sv0.j r4 = wv0.q.K(r1)
            r4.y(r5)
            com.tencent.maas.base.MJID r4 = r3.f531455b
            if (r4 == 0) goto Lc2
            yz5.l r1 = r1.m174523x68734de5()
            if (r1 == 0) goto Lc2
            r1.mo146xb9724478(r4)
        Lc2:
            r3.f531455b = r2
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.e7.mo8134xb54743ba(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }
}
