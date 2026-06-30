package df2;

/* loaded from: classes3.dex */
public final class d1 extends if2.b implements df2.y6 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f311465p = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183668d + "FallingGift/";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311466m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f311467n;

    /* renamed from: o, reason: collision with root package name */
    public final df2.x0 f311468o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311466m = "Finder.FallingGiftAnimController";
        this.f311468o = new df2.x0(this);
    }

    @Override // df2.y6
    public java.lang.Object G6(df2.w6 w6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object b76;
        r45.qv1 qv1Var;
        r45.kv1 kv1Var = (r45.kv1) w6Var.f313201b.f197125g.m75936x14adae67(3);
        int m75939xb282bd08 = (kv1Var == null || (qv1Var = (r45.qv1) kv1Var.m75936x14adae67(23)) == null) ? 0 : qv1Var.m75939xb282bd08(1);
        int m75939xb282bd082 = w6Var.f313201b.f197125g.m75939xb282bd08(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[playGiftEffect] giftId = ");
        sb6.append(kv1Var != null ? kv1Var.m75945x2fec8307(0) : null);
        sb6.append(", dropBatchSize = ");
        sb6.append(m75939xb282bd08);
        sb6.append(", comboSumSize = ");
        sb6.append(m75939xb282bd082);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311466m, sb6.toString());
        return (kv1Var == null || m75939xb282bd08 <= 0 || (b76 = b7(kv1Var, (int) (((float) m75939xb282bd082) / ((float) m75939xb282bd08)), interfaceC29045xdcb5ca57)) != pz5.a.f440719d) ? jz5.f0.f384359a : b76;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Z6() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FallingGift");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(java.lang.String r21, java.lang.String r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.d1.a7(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(r45.kv1 r18, int r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.d1.b7(r45.kv1, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c7(java.lang.String r11, int r12, long r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof df2.a1
            if (r0 == 0) goto L13
            r0 = r15
            df2.a1 r0 = (df2.a1) r0
            int r1 = r0.f311190h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311190h = r1
            goto L18
        L13:
            df2.a1 r0 = new df2.a1
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.f311188f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f311190h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r11 = r0.f311187e
            in0.q r11 = (in0.q) r11
            java.lang.Object r12 = r0.f311186d
            df2.d1 r12 = (df2.d1) r12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L7b
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            tn0.w0 r15 = dk2.ef.f314911d
            boolean r2 = r15 instanceof in0.q
            if (r2 == 0) goto L43
            in0.q r15 = (in0.q) r15
            goto L44
        L43:
            r15 = 0
        L44:
            if (r15 == 0) goto La9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "[playOnce] giftImgPath:"
            r2.<init>(r4)
            r2.append(r11)
            java.lang.String r4 = ", cnt:"
            r2.append(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = r10.f311466m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
            df2.c1 r2 = new df2.c1
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r15
            r7 = r12
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f311186d = r10
            r0.f311187e = r15
            r0.f311190h = r3
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.a4.c(r13, r2, r0)
            if (r11 != r1) goto L79
            return r1
        L79:
            r12 = r10
            r11 = r15
        L7b:
            r11.getClass()
            java.lang.String r13 = "MicroMsg.LiveCore"
            java.lang.String r14 = "removeFallingGiftEffectRes"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r13, r14)
            go0.f0 r13 = r11.f502304r
            in0.h r14 = new in0.h
            r14.<init>(r11)
            r13.l(r14)
            java.lang.String r11 = r12.f311466m
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r12 = r12.hashCode()
            r13.append(r12)
            java.lang.String r12 = ", playOnce finally finish!"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r12)
        La9:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.d1.c7(java.lang.String, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // df2.y6
    public boolean j1(df2.w6 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var = event.f313201b;
        r45.kv1 kv1Var = (r45.kv1) l1Var.f197125g.m75936x14adae67(3);
        if (kv1Var == null || !l1Var.f197135t) {
            return false;
        }
        r45.qv1 qv1Var = (r45.qv1) kv1Var.m75936x14adae67(23);
        return (qv1Var != null ? qv1Var.m75939xb282bd08(1) : 0) > 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        super.mo8997x8001c97e();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410339g).n(this.f311468o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410339g).l(this.f311468o);
    }

    @Override // df2.y6
    public void p6() {
        tn0.w0 w0Var = dk2.ef.f314911d;
        in0.q qVar = w0Var instanceof in0.q ? (in0.q) w0Var : null;
        if (qVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "removeFallingGiftEffectRes");
            qVar.f502304r.l(new in0.h(qVar));
        }
    }
}
