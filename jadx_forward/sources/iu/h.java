package iu;

/* loaded from: classes12.dex */
public abstract class h implements gu.f {

    /* renamed from: a, reason: collision with root package name */
    public static final iu.a f376220a = new iu.a(null);

    public static /* synthetic */ void e(iu.h hVar, java.lang.String str, s15.h hVar2, oi3.g gVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyData");
        }
        if ((i18 & 8) != 0) {
            i17 = 1;
        }
        hVar.d(str, hVar2, gVar, i17);
    }

    public static /* synthetic */ void g(iu.h hVar, java.lang.String str, s15.h hVar2, oi3.g gVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyThumbImg");
        }
        if ((i18 & 8) != 0) {
            i17 = 1;
        }
        hVar.f(str, hVar2, gVar, i17);
    }

    @Override // gu.f
    public java.lang.Object a(gu.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qi3.f0(0);
    }

    @Override // gu.f
    public java.lang.Object b(gu.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qi3.i0(0);
    }

    public final void c(s15.h recordDataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        int i17 = recordDataItem.f384955d;
        recordDataItem.set(i17 + 9, "");
        recordDataItem.set(i17 + 8, "");
        recordDataItem.set(i17 + 5, "");
        recordDataItem.set(i17 + 4, "");
        recordDataItem.h1("");
        recordDataItem.j1("");
        recordDataItem.l1("");
        recordDataItem.i1("");
        recordDataItem.set(i17 + 7, 0L);
        recordDataItem.set(i17 + 6, "");
        recordDataItem.c1("");
        recordDataItem.set(i17 + 11, 0L);
        recordDataItem.set(i17 + 10, "");
        recordDataItem.D0("");
    }

    public final void d(java.lang.String str, s15.h recordDataItem, oi3.g simpleMsgInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        if (r26.n0.N(recordDataItem.m75945x2fec8307(recordDataItem.f384955d + 3))) {
            throw new java.lang.UnsupportedOperationException("dataId is blank, put in fillRecordDataItemAfterInsertDB");
        }
        int i18 = simpleMsgInfo.f427150d;
        long m75942xfb822ef2 = simpleMsgInfo.m75942xfb822ef2(i18 + 0);
        long m75942xfb822ef22 = simpleMsgInfo.m75942xfb822ef2(i18 + 1);
        java.lang.String msgTalker = simpleMsgInfo.m75945x2fec8307(i18 + 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        java.lang.String fj6 = ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).fj(recordDataItem, msgTalker, m75942xfb822ef2, m75942xfb822ef22, i17);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "copyDataImg not exist from:" + str);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
            int aj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(str, fj6, 1);
            if (aj6 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "copyData success hevc to jpg from:" + str + " to:" + fj6);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "copyData fail hevc to jpg ret:" + aj6 + " from:" + str + " to:" + fj6);
            }
        } else {
            long d17 = com.p314xaae8f345.mm.vfs.w6.d(str, fj6, true);
            if (d17 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "copyData fail from:" + str + " to:" + fj6);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "copyData success length:" + d17 + " from:" + str + " to:" + fj6);
            }
        }
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(fj6, 19, null, null);
        m();
    }

    public final void f(java.lang.String str, s15.h recordDataItem, oi3.g simpleMsgInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i18 = recordDataItem.f384955d + 3;
        if (r26.n0.N(recordDataItem.m75945x2fec8307(i18))) {
            throw new java.lang.UnsupportedOperationException("dataId is blank, put in fillRecordDataItemAfterInsertDB");
        }
        int i19 = simpleMsgInfo.f427150d;
        long m75942xfb822ef2 = simpleMsgInfo.m75942xfb822ef2(i19 + 0);
        long m75942xfb822ef22 = simpleMsgInfo.m75942xfb822ef2(i19 + 1);
        java.lang.String msgTalker = simpleMsgInfo.m75945x2fec8307(i19 + 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
        java.lang.String G = bt3.g2.G(recordDataItem.m75945x2fec8307(i18), msgTalker, m75942xfb822ef2, m75942xfb822ef22, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(G, "getThumbPath(...)");
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "copyThumbImg not exist from:" + str);
            return;
        }
        long d17 = com.p314xaae8f345.mm.vfs.w6.d(str, G, true);
        if (d17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "copyThumbImg fail from:" + str + " to:" + G);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "copyThumbImg success length:" + d17 + " from:" + str + " to:" + G);
        }
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(G, 19, null, null);
        m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x050e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gu.j r23, int r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.h(gu.j, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gu.j r7, java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof iu.c
            if (r0 == 0) goto L13
            r0 = r9
            iu.c r0 = (iu.c) r0
            int r1 = r0.f376191f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f376191f = r1
            goto L18
        L13:
            iu.c r0 = new iu.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f376189d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f376191f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L72
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            qi3.b0 r2 = r7.f357140a
            java.lang.String r2 = r2.id()
            r9.append(r2)
            java.lang.String r2 = "_down_data_"
            r9.append(r2)
            s15.h r2 = r7.f357142c
            int r4 = r2.f384955d
            int r4 = r4 + 3
            java.lang.String r4 = r2.m75945x2fec8307(r4)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            tt.h r4 = new tt.h
            zu.b r5 = zu.b.f557168e
            r4.<init>(r9, r5, r2, r8)
            oi3.e r7 = r7.f357143d
            r4.f503301e = r7
            r4.f503302f = r3
            tt.a r7 = tt.f.f503290f
            tt.f r7 = r7.a()
            r0.f376191f = r3
            java.lang.Object r9 = r7.T6(r4, r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            tt.i r9 = (tt.i) r9
            tt.g r7 = r9.f503306a
            tt.g r8 = tt.g.f503291d
            if (r7 != r8) goto L7b
            goto L7c
        L7b:
            r3 = 0
        L7c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.i(gu.j, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gu.j r7, java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof iu.d
            if (r0 == 0) goto L13
            r0 = r9
            iu.d r0 = (iu.d) r0
            int r1 = r0.f376194f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f376194f = r1
            goto L18
        L13:
            iu.d r0 = new iu.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f376192d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f376194f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L73
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            qi3.b0 r2 = r7.f357140a
            java.lang.String r2 = r2.id()
            r9.append(r2)
            java.lang.String r2 = "_down_thumb_"
            r9.append(r2)
            s15.h r2 = r7.f357142c
            int r4 = r2.f384955d
            int r4 = r4 + 3
            java.lang.String r4 = r2.m75945x2fec8307(r4)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            tt.h r4 = new tt.h
            zu.b r5 = zu.b.f557167d
            r4.<init>(r9, r5, r2, r8)
            oi3.e r7 = r7.f357143d
            r4.f503301e = r7
            r7 = 4
            r4.f503302f = r7
            tt.a r7 = tt.f.f503290f
            tt.f r7 = r7.a()
            r0.f376194f = r3
            java.lang.Object r9 = r7.T6(r4, r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            tt.i r9 = (tt.i) r9
            tt.g r7 = r9.f503306a
            tt.g r8 = tt.g.f503291d
            if (r7 != r8) goto L7c
            goto L7d
        L7c:
            r3 = 0
        L7d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.j(gu.j, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String k(oi3.g recordMsgInfo, s15.h dataItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordMsgInfo, "recordMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o());
        sb6.append('/');
        sb6.append(recordMsgInfo.m75942xfb822ef2(recordMsgInfo.f427150d + 0));
        sb6.append('/');
        sb6.append(i17);
        sb6.append('_');
        byte[] bytes = dataItem.m75945x2fec8307(dataItem.f384955d + 3).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("_t.jpg");
        return sb6.toString();
    }

    public final java.lang.String l(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo instanceof oi3.e ? ((oi3.e) simpleMsgInfo).j() : "";
    }

    public java.lang.String m() {
        return "MicroMsg.AppMsg.BaseRecordSendApi";
    }

    public final java.lang.String n(oi3.g recordMsgInfo, s15.h dataItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordMsgInfo, "recordMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o());
        sb6.append('/');
        sb6.append(recordMsgInfo.m75942xfb822ef2(recordMsgInfo.f427150d + 0));
        sb6.append('/');
        sb6.append(i17);
        sb6.append('_');
        byte[] bytes = dataItem.m75945x2fec8307(dataItem.f384955d + 3).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("_t.jpg");
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0342  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gu.j r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.o(gu.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(gu.j r26, java.lang.String r27, int r28, boolean r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.p(gu.j, java.lang.String, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(gu.j r26, java.lang.String r27, boolean r28, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r29) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.h.q(gu.j, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
