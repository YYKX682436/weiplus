package qf2;

/* loaded from: classes3.dex */
public final class q3 extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public lj2.o0 f444081m;

    /* renamed from: n, reason: collision with root package name */
    public pi2.w0 f444082n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f444083o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f444083o = jz5.h.b(new qf2.l3(this));
    }

    public static final km2.q Z6(qf2.q3 q3Var, java.util.List list, r45.if5 if5Var, java.util.HashMap hashMap) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        q3Var.getClass();
        km2.q qVar = (km2.q) hashMap.get(if5Var.m75945x2fec8307(0));
        if (qVar == null) {
            java.lang.String m75945x2fec8307 = if5Var.m75945x2fec8307(0);
            r45.xn1 xn1Var = (r45.xn1) if5Var.m75936x14adae67(1);
            java.lang.String m76175x6d346f39 = (xn1Var == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76175x6d346f39();
            r45.xn1 xn1Var2 = (r45.xn1) if5Var.m75936x14adae67(1);
            java.lang.String m76197x6c03c64c = (xn1Var2 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c();
            r45.xn1 xn1Var3 = (r45.xn1) if5Var.m75936x14adae67(1);
            qVar = new km2.q(m75945x2fec8307, m76175x6d346f39, m76197x6c03c64c, (xn1Var3 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4(), if5Var.m75939xb282bd08(6), if5Var.m75945x2fec8307(5), null, false, ((mm2.c1) q3Var.m56788xbba4bfc0(mm2.c1.class)).l8(), null, null, 0, 0, false, null, false, 0L, (r45.xn1) if5Var.m75936x14adae67(1), false, null, null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -71500096, 1, null);
            int m75939xb282bd08 = if5Var.m75939xb282bd08(2);
            java.lang.String m75945x2fec83072 = if5Var.m75945x2fec8307(3);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            qVar.v(new km2.b0(m75939xb282bd08, m75945x2fec83072));
        }
        int m75939xb282bd082 = if5Var.m75939xb282bd08(2);
        java.lang.String m75945x2fec83073 = if5Var.m75945x2fec8307(3);
        qVar.v(new km2.b0(m75939xb282bd082, m75945x2fec83073 != null ? m75945x2fec83073 : ""));
        list.add(qVar);
        return qVar;
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        qf2.t3 a76 = a7();
        a76.getClass();
        java.util.LinkedHashMap micViewRect = micInfoData.f536055a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micViewRect, "micViewRect");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = a76.f444125c;
        java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            if (!micViewRect.containsKey(entry.getKey())) {
                arrayList.add(entry.getKey());
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qf2.s3 s3Var = (qf2.s3) hashMap.remove((java.lang.String) it.next());
            if (s3Var != null) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var = s3Var.f444110c;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                s3Var.f444111d = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s3Var.f444109b, "stopCountDown");
            }
        }
    }

    public final qf2.t3 a7() {
        return (qf2.t3) ((jz5.n) this.f444083o).mo141623x754a37bb();
    }

    public final void b7() {
        lj2.o0 o0Var = this.f444081m;
        if (o0Var == null || o0Var.f400434a.getVisibility() == 8) {
            return;
        }
        pm0.v.X(new lj2.l0(o0Var));
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        java.util.HashMap hashMap = a7().f444125c;
        java.util.Set entrySet = hashMap.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            qf2.s3 s3Var = (qf2.s3) ((java.util.Map.Entry) it.next()).getValue();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = s3Var.f444110c;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            s3Var.f444111d = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s3Var.f444109b, "stopCountDown");
        }
        hashMap.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.wz1 wz1Var;
        super.mo14863x39a513b7(hc1Var);
        if (hc1Var == null || (wz1Var = (r45.wz1) hc1Var.m75936x14adae67(4)) == null) {
            return;
        }
        ((mm2.g5) m56788xbba4bfc0(mm2.g5.class)).O6(wz1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8998x9f682d55(android.view.ViewGroup r3) {
        /*
            r2 = this;
            java.lang.String r0 = "pluginLayout"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            super.mo8998x9f682d55(r3)
            r0 = 2131307067(0x7f092a3b, float:1.823235E38)
            android.view.View r3 = r3.findViewById(r0)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r0 = 0
            if (r3 == 0) goto L20
            android.view.View r3 = r3.inflate()     // Catch: java.lang.Throwable -> L19
            goto L21
        L19:
            java.lang.String r3 = "genRootViewByStub fail: 2131307067"
            java.lang.String r1 = r2.f372631d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)
        L20:
            r3 = r0
        L21:
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L28
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L28:
            if (r0 == 0) goto L31
            lj2.o0 r3 = new lj2.o0
            r3.<init>(r0, r2)
            r2.f444081m = r3
        L31:
            zl2.r4 r3 = zl2.r4.f555483a
            boolean r3 = r3.x1()
            if (r3 != 0) goto L44
            pi2.w0 r3 = new pi2.w0
            android.content.Context r0 = r2.O6()
            r3.<init>(r0, r2)
            r2.f444082n = r3
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.q3.mo8998x9f682d55(android.view.ViewGroup):void");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f444081m = null;
        this.f444082n = null;
    }
}
