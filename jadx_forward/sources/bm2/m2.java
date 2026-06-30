package bm2;

/* loaded from: classes3.dex */
public final class m2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f103623d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f103624e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f103625f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f103626g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f103627h;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103624e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.g2 holder = (bm2.g2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.util.ArrayList arrayList = this.f103624e;
        h0Var.f391656d = ((bm2.l2) arrayList.get(i17)).f103596a;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21473x5d116ff c21473x5d116ff = holder.f103438e;
        c21473x5d116ff.setVisibility(0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String m75945x2fec8307 = ((r45.ty1) h0Var.f391656d).m75945x2fec8307(1);
        ((ke0.e) xVar).getClass();
        c21473x5d116ff.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec8307));
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.l().b(new mn2.n(((r45.ty1) h0Var.f391656d).m75945x2fec8307(4), null, 2, null), g1Var.h(mn2.f1.f411494o));
        bm2.i2 i2Var = new bm2.i2(holder);
        b17.getClass();
        b17.f529406d = i2Var;
        b17.f();
        holder.f103439f.setChecked(((bm2.l2) arrayList.get(i17)).f103597b);
        holder.f103440g.setOnClickListener(new bm2.j2(this, h0Var));
        holder.f3639x46306858.setOnClickListener(new bm2.k2(this, i17, holder));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aua, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.g2(this, inflate);
    }

    public final java.util.List x() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f103624e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((bm2.l2) next).f103597b) {
                arrayList3.add(next);
            }
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            java.lang.String m75945x2fec8307 = ((bm2.l2) it6.next()).f103596a.m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                arrayList.add(m75945x2fec8307);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "matchStr"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.util.ArrayList r0 = r9.f103624e
            r0.clear()
            int r1 = r10.length()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L14
            r1 = r2
            goto L15
        L14:
            r1 = r3
        L15:
            java.util.ArrayList r4 = r9.f103623d
            if (r1 == 0) goto L1d
            r0.addAll(r4)
            goto L5f
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L26:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5c
            java.lang.Object r5 = r4.next()
            r6 = r5
            bm2.l2 r6 = (bm2.l2) r6
            r45.ty1 r6 = r6.f103596a
            java.lang.String r6 = r6.m75945x2fec8307(r2)
            if (r6 == 0) goto L55
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.String r8 = "toLowerCase(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r8)
            java.lang.String r7 = r10.toLowerCase(r7)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)
            boolean r6 = r26.n0.B(r6, r7, r3)
            if (r6 != r2) goto L55
            r6 = r2
            goto L56
        L55:
            r6 = r3
        L56:
            if (r6 == 0) goto L26
            r1.add(r5)
            goto L26
        L5c:
            r0.addAll(r1)
        L5f:
            yz5.l r10 = r9.f103627h
            if (r10 == 0) goto L72
            int r0 = r0.size()
            if (r0 != 0) goto L6a
            goto L6b
        L6a:
            r2 = r3
        L6b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r10.mo146xb9724478(r0)
        L72:
            r9.m8146xced61ae5()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.m2.y(java.lang.String):void");
    }
}
