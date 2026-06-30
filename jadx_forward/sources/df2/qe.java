package df2;

/* loaded from: classes3.dex */
public final class qe extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f312691m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f312692n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.f1 f312693o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(java.util.List data) {
        android.widget.ImageView j17;
        xt2.m6 m6Var;
        android.widget.ImageView j18;
        android.view.View f17;
        android.view.View f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g b76 = b7();
        if (b76 != null) {
            java.util.Iterator it = data.iterator();
            while (it.hasNext()) {
                r45.xm1 xm1Var = (r45.xm1) it.next();
                boolean z17 = ((xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.m75939xb282bd08(0)))) != null;
                pf5.u uVar = pf5.u.f435469a;
                if (z17) {
                    java.lang.String m75945x2fec8307 = xm1Var.m75945x2fec8307(2);
                    if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                        xt2.m6 m6Var2 = (xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.m75939xb282bd08(0)));
                        if (m6Var2 != null && (f18 = m6Var2.f()) != null) {
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qf0(f18, b76.f194147r));
                        }
                    } else {
                        xt2.m6 m6Var3 = (xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.m75939xb282bd08(0)));
                        if (m6Var3 != null && (f17 = m6Var3.f()) != null) {
                            java.lang.String m75945x2fec83072 = xm1Var.m75945x2fec8307(2);
                            if (m75945x2fec83072 == null) {
                                m75945x2fec83072 = "";
                            }
                            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).M).mo141623x754a37bb()).a(new mn2.n(m75945x2fec83072, null, 2, null));
                            a17.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nf0(m75945x2fec83072, f17);
                            a17.f();
                        }
                    }
                }
                java.lang.String m75945x2fec83073 = xm1Var.m75945x2fec8307(1);
                if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
                    if2.z zVar = if2.z.f372686a;
                    qo0.c cVar = b76.f194858g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                    int ordinal = zVar.c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar).ordinal();
                    java.lang.Integer num = (java.lang.Integer) ((ordinal == 1 || ordinal == 2) ? b76.f194145p : b76.f194146q).get(java.lang.Integer.valueOf(xm1Var.m75939xb282bd08(0)));
                    if (num != null && (m6Var = (xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.m75939xb282bd08(0)))) != null && (j18 = m6Var.j()) != null) {
                        android.view.ViewGroup viewGroup = b76.f446856d;
                        android.graphics.drawable.Drawable drawable = viewGroup.getContext().getResources().getDrawable(num.intValue());
                        com.p314xaae8f345.mm.ui.uk.f(drawable, viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                        j18.setImageDrawable(drawable);
                    }
                } else {
                    xt2.m6 m6Var4 = (xt2.m6) b76.u1().get(java.lang.Integer.valueOf(xm1Var.m75939xb282bd08(0)));
                    if (m6Var4 != null && (j17 = m6Var4.j()) != null) {
                        java.lang.String m75945x2fec83074 = xm1Var.m75945x2fec8307(1);
                        wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(m75945x2fec83074, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
                        a18.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pf0(m75945x2fec83074, j17);
                        a18.f();
                    }
                }
                ((mm2.c1) b76.P0(mm2.c1.class)).f410354i4.put(java.lang.Integer.valueOf(xm1Var.m75939xb282bd08(0)), xm1Var);
                int m75939xb282bd08 = xm1Var.m75939xb282bd08(0);
                if (m75939xb282bd08 == 15) {
                    ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                    ml2.h5 h5Var = ml2.h5.f409071v;
                    java.lang.String m75945x2fec83075 = xm1Var.m75945x2fec8307(1);
                    java.lang.String m75945x2fec83076 = xm1Var.m75945x2fec8307(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0Var);
                    c50.c1.gb(r0Var, h5Var, "", 0, null, m75945x2fec83076, m75945x2fec83075, 8, null);
                } else if (m75939xb282bd08 == 16) {
                    ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
                    ml2.f4 f4Var = ml2.f4.F;
                    java.lang.String m75945x2fec83077 = xm1Var.m75945x2fec8307(1);
                    java.lang.String m75945x2fec83078 = xm1Var.m75945x2fec8307(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0Var2);
                    ml2.r0.Dj(r0Var2, f4Var, null, null, null, null, null, 0, 0L, null, null, m75945x2fec83078, m75945x2fec83077, false, null, 13304, null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(java.util.LinkedList r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qe.a7(java.util.LinkedList, boolean):void");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g b7() {
        if2.z zVar = if2.z.f372686a;
        java.lang.Object obj = this.f372632e;
        int ordinal = zVar.c(obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null).ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class);
        }
        if (ordinal != 3) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c7(r45.xm1 r17, java.lang.String r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qe.c7(r45.xm1, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d5, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:5:0x000e, B:8:0x0019, B:10:0x0027, B:15:0x0033, B:19:0x00d9, B:61:0x0060, B:63:0x0066, B:65:0x0074, B:70:0x0080, B:74:0x00ac), top: B:4:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0080 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:5:0x000e, B:8:0x0019, B:10:0x0027, B:15:0x0033, B:19:0x00d9, B:61:0x0060, B:63:0x0066, B:65:0x0074, B:70:0x0080, B:74:0x00ac), top: B:4:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qe.d7():void");
    }

    public final void e7() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveButtonChangeController", "startJob", null);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f312692n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f312692n = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.pe(this, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        java.util.LinkedList m75941xfb821914;
        if (r71Var == null || (m75941xfb821914 = r71Var.m75941xfb821914(15)) == null) {
            return;
        }
        a7(m75941xfb821914, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        java.util.LinkedList m75941xfb821914;
        if (hc1Var == null || (m75941xfb821914 = hc1Var.m75941xfb821914(9)) == null) {
            return;
        }
        a7(m75941xfb821914, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        for (java.util.Map.Entry entry : ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410359j4.entrySet()) {
            r45.vm1 vm1Var = (r45.vm1) ((jz5.l) entry.getValue()).f384366d;
            java.lang.Object obj = ((jz5.l) entry.getValue()).f384367e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g b76 = b7();
            if (b76 != null) {
                b76.A1(vm1Var, obj, false);
            }
        }
        e7();
        d7();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410354i4;
        java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((r45.xm1) ((java.util.Map.Entry) it.next()).getValue());
        }
        Z6(arrayList);
    }
}
