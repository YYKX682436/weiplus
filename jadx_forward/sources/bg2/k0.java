package bg2;

/* loaded from: classes3.dex */
public final class k0 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101769e;

    /* renamed from: f, reason: collision with root package name */
    public long f101770f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f101771g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f101772h;

    /* renamed from: i, reason: collision with root package name */
    public r45.eq1 f101773i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f101774m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101769e = "Finder.LiveConvertCommonDataController";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    @Override // tc2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H0(r45.r71 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "resp"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            r0 = 3
            com.tencent.mm.protobuf.f r0 = r5.m75936x14adae67(r0)
            r45.nw1 r0 = (r45.nw1) r0
            if (r0 == 0) goto L58
            r1 = 7
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            r45.vp1 r0 = (r45.vp1) r0
            if (r0 == 0) goto L58
            r1 = 0
            com.tencent.mm.protobuf.g r0 = r0.m75934xbce7f2f(r1)
            if (r0 == 0) goto L58
            r45.t74 r1 = new r45.t74
            r1.<init>()
            byte[] r0 = r0.f273689a
            if (r0 != 0) goto L28
            goto L38
        L28:
            r1.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L2c
            goto L39
        L2c:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "safeParser"
            java.lang.String r2 = ""
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r2, r0)
        L38:
            r1 = 0
        L39:
            if (r1 == 0) goto L58
            long r2 = r1.f467729e
            r4.f101770f = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "processLiveMsgResponse anchorStatusFlag:"
            r0.<init>(r2)
            long r1 = r1.f467729e
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r4.f101769e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
        L58:
            r0 = 19
            java.util.LinkedList r0 = r5.m75941xfb821914(r0)
            r4.Z6(r0)
            r0 = 28
            com.tencent.mm.protobuf.f r0 = r5.m75936x14adae67(r0)
            r45.eq1 r0 = (r45.eq1) r0
            r4.a7(r0)
            r0 = 11
            int r5 = r5.m75939xb282bd08(r0)
            java.lang.String r0 = "getLiveMsg"
            r4.Y6(r0, r5)
            long r0 = r4.f101770f
            int r5 = (int) r0
            r0 = 8192(0x2000, float:1.148E-41)
            boolean r5 = pm0.v.z(r5, r0)
            r4.f101772h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.k0.H0(r45.r71):void");
    }

    @Override // tc2.c
    public void U6() {
        this.f101770f = 0L;
        this.f101771g = false;
        this.f101772h = false;
        a7(null);
        Z6(null);
    }

    public final void Y6(java.lang.String str, int i17) {
        this.f101771g = pm0.v.z(i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101769e, str + ", checkMaskNickname flag:" + i17 + ", isVisitorNickNameShowMask:" + this.f101771g);
    }

    public final void Z6(java.util.LinkedList linkedList) {
        java.lang.String str;
        java.lang.Object obj;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.yl1) obj).m75939xb282bd08(0) == 4) {
                        break;
                    }
                }
            }
            r45.yl1 yl1Var = (r45.yl1) obj;
            if (yl1Var != null) {
                java.lang.String m75945x2fec8307 = yl1Var.m75945x2fec8307(4);
                if (m75945x2fec8307 == null) {
                    r45.eq1 eq1Var = this.f101773i;
                    if (eq1Var != null) {
                        str = eq1Var.m75945x2fec8307(0);
                    }
                } else {
                    str = m75945x2fec8307;
                }
                yl1Var.set(4, str);
            }
        }
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Z).mo141623x754a37bb()).r()).intValue() == 1 && linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.yl1 yl1Var2 = (r45.yl1) it6.next();
                if (yl1Var2.m75939xb282bd08(0) == 2) {
                    yl1Var2.set(2, 70);
                }
            }
        }
        mm2.c1.f410306y6.c(this.f101774m, linkedList);
        this.f101774m = linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5 != null ? java.lang.Boolean.valueOf(r5.m75933x41a8a7f2(1)) : null, r0 != null ? java.lang.Boolean.valueOf(r0.m75933x41a8a7f2(1)) : null) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(r45.eq1 r5) {
        /*
            r4 = this;
            r45.eq1 r0 = r4.f101773i
            r1 = 0
            r2 = 0
            if (r5 == 0) goto Lb
            java.lang.String r3 = r5.m75945x2fec8307(r1)
            goto Lc
        Lb:
            r3 = r2
        Lc:
            if (r0 == 0) goto L13
            java.lang.String r1 = r0.m75945x2fec8307(r1)
            goto L14
        L13:
            r1 = r2
        L14:
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r1)
            if (r1 == 0) goto L56
            r1 = 2
            if (r5 == 0) goto L26
            int r3 = r5.m75939xb282bd08(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L27
        L26:
            r3 = r2
        L27:
            if (r0 == 0) goto L32
            int r1 = r0.m75939xb282bd08(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r1)
            if (r1 == 0) goto L56
            r1 = 1
            if (r5 == 0) goto L45
            boolean r3 = r5.m75933x41a8a7f2(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L46
        L45:
            r3 = r2
        L46:
            if (r0 == 0) goto L50
            boolean r0 = r0.m75933x41a8a7f2(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L50:
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r2)
            if (r0 != 0) goto L73
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "printNewFansClubInfo "
            r0.<init>(r1)
            if (r5 != 0) goto L62
            java.lang.String r1 = ""
            goto L63
        L62:
            r1 = r5
        L63:
            org.json.JSONObject r1 = pm0.b0.g(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LiveFansClubSlice"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
        L73:
            r4.f101773i = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.k0.a7(r45.eq1):void");
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        r45.nw1 nw1Var = (r45.nw1) resp.m75936x14adae67(3);
        this.f101770f = nw1Var != null ? nw1Var.m75942xfb822ef2(32) : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101769e, "processJoinLiveResponse anchorStatusFlag:" + this.f101770f);
        r45.xn1 xn1Var = (r45.xn1) resp.m75936x14adae67(7);
        Z6(xn1Var != null ? xn1Var.m75941xfb821914(11) : null);
        a7((r45.eq1) resp.m75936x14adae67(36));
        Y6("joinLive", resp.m75939xb282bd08(47));
        this.f101772h = pm0.v.z((int) this.f101770f, 8192);
    }
}
