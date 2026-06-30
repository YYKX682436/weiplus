package tx2;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.s f504148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tx2.s sVar) {
        super(2);
        this.f504148d = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if ((r3.length() > 0) == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(tx2.s r26) {
        /*
            r0 = r26
            r45.h32 r1 = r0.f504182e
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.set(r2, r3)
            cl0.g r1 = new cl0.g
            r1.<init>()
            java.lang.String r3 = "source_type"
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.s(r3, r5)
            r45.h32 r3 = r0.f504182e
            r5 = 10
            com.tencent.mm.protobuf.f r3 = r3.m75936x14adae67(r5)
            r45.q65 r3 = (r45.q65) r3
            if (r3 == 0) goto L2f
            boolean r3 = r3.m75933x41a8a7f2(r4)
            if (r3 != r2) goto L2f
            r3 = r2
            goto L30
        L2f:
            r3 = r4
        L30:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "pay_type"
            r1.s(r5, r3)
            r45.h32 r3 = r0.f504182e
            r5 = 8
            java.lang.String r3 = r3.m75945x2fec8307(r5)
            if (r3 == 0) goto L4f
            int r3 = r3.length()
            if (r3 <= 0) goto L4b
            r3 = r2
            goto L4c
        L4b:
            r3 = r4
        L4c:
            if (r3 != r2) goto L4f
            goto L50
        L4f:
            r2 = r4
        L50:
            java.lang.String r3 = ""
            if (r2 == 0) goto L57
            java.lang.String r2 = "get_ticket"
            goto L58
        L57:
            r2 = r3
        L58:
            java.lang.String r4 = "page_type"
            r1.s(r4, r2)
            java.lang.Class<c50.c1> r2 = c50.c1.class
            i95.m r2 = i95.n0.c(r2)
            java.lang.String r4 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            r5 = r2
            c50.c1 r5 = (c50.c1) r5
            ml2.i5 r6 = ml2.i5.f409105g
            java.lang.String r7 = r0.f504179b
            r8 = 0
            r10 = 0
            int r2 = r0.f504178a
            java.lang.String r11 = java.lang.String.valueOf(r2)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r45.h32 r2 = r0.f504182e
            r4 = 3
            java.lang.String r2 = r2.m75945x2fec8307(r4)
            if (r2 != 0) goto L88
            r16 = r3
            goto L8a
        L88:
            r16 = r2
        L8a:
            java.lang.String r17 = r1.toString()
            r45.h32 r1 = r0.f504182e
            r2 = 4
            java.lang.String r18 = r1.m75945x2fec8307(r2)
            cl0.g r1 = r0.f504187j
            if (r1 == 0) goto L9e
            java.lang.String r1 = r1.toString()
            goto L9f
        L9e:
            r1 = 0
        L9f:
            r19 = r1
            long r1 = r0.f504183f
            r45.qt2 r3 = r0.f504181d
            r4 = 5
            int r22 = r3.m75939xb282bd08(r4)
            r23 = 0
            r24 = 33248(0x81e0, float:4.659E-41)
            r25 = 0
            r20 = r1
            c50.c1.l9(r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25)
            r1 = 2
            tx2.s.a(r0, r1)
            android.app.Activity r1 = r0.f504180c
            r2 = 2131761815(0x7f101a97, float:1.915469E38)
            java.lang.String r2 = r1.getString(r2)
            r3 = 2131690843(0x7f0f055b, float:1.9010741E38)
            db5.t7.i(r1, r2, r3)
            yz5.p r0 = r0.f504186i
            if (r0 == 0) goto Ld2
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.mo149xb9724478(r1, r1)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.n.a(tx2.s):void");
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String m75945x2fec8307;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        tx2.s sVar = this.f504148d;
        boolean z17 = false;
        boolean z18 = sVar.f504182e.m75939xb282bd08(9) == 1;
        if (intValue != -1) {
            sVar.f504182e.set(1, 0);
            if (intValue == 1) {
                ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).wi(sVar.f504180c, 2, false, new tx2.l(sVar, z18));
                cl0.g gVar = new cl0.g();
                gVar.s("source_type", java.lang.Integer.valueOf(intValue2 == 1 ? 1 : 0));
                r45.q65 q65Var = (r45.q65) sVar.f504182e.m75936x14adae67(10);
                gVar.s("pay_type", java.lang.Integer.valueOf((q65Var == null || !q65Var.m75933x41a8a7f2(0)) ? 0 : 1));
                java.lang.String m75945x2fec83072 = sVar.f504182e.m75945x2fec8307(8);
                if (m75945x2fec83072 != null) {
                    if (m75945x2fec83072.length() > 0) {
                        z17 = true;
                    }
                }
                gVar.s("page_type", z17 ? "get_ticket" : "");
                cl0.g gVar2 = sVar.f504187j;
                if (gVar2 == null) {
                    gVar2 = new cl0.g();
                }
                r45.ov2 a17 = zl2.t.a(sVar.f504182e);
                gVar2.h("coupon_id", a17 != null ? a17.m75945x2fec8307(1) : null);
                i95.m c17 = i95.n0.c(c50.c1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c50.c1 c1Var = (c50.c1) c17;
                ml2.i5 i5Var = ml2.i5.f409104f;
                java.lang.String str = sVar.f504179b;
                java.lang.String valueOf = java.lang.String.valueOf(sVar.f504178a);
                r45.h32 h32Var = sVar.f504182e;
                c50.c1.l9(c1Var, i5Var, str, 0L, 0, valueOf, null, null, null, null, (h32Var == null || (m75945x2fec8307 = h32Var.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307, gVar.toString(), sVar.f504182e.m75945x2fec8307(4), gVar2.toString(), sVar.f504183f, sVar.f504181d.m75939xb282bd08(5), null, 33248, null);
                if (z18) {
                    i95.m c18 = i95.n0.c(c61.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    java.lang.String str2 = sVar.f504179b;
                    java.lang.String m75945x2fec83073 = sVar.f504182e.m75945x2fec8307(4);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83073);
                    gm0.j1.d().g(c61.zb.x3((c61.zb) c18, str2, m75945x2fec83073, 1, sVar.f504181d, sVar.f504180c.getIntent().getStringExtra("key_promotion_token"), java.lang.Integer.valueOf(sVar.f504185h), null, null, null, null, null, null, null, 8128, null));
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String str3 = sVar.f504179b;
                    java.lang.String m75945x2fec83074 = sVar.f504182e.m75945x2fec8307(4);
                    if (m75945x2fec83074 == null) {
                        m75945x2fec83074 = "";
                    }
                    if (((b92.d1) zbVar).bj(str3, m75945x2fec83074) == null) {
                        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String str4 = sVar.f504179b;
                        java.lang.String m75945x2fec83075 = sVar.f504182e.m75945x2fec8307(4);
                        if (m75945x2fec83075 == null) {
                            m75945x2fec83075 = "";
                        }
                        ((b92.d1) zbVar2).Ai(str4, m75945x2fec83075, sVar.f504182e);
                    } else {
                        c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String str5 = sVar.f504179b;
                        java.lang.String m75945x2fec83076 = sVar.f504182e.m75945x2fec8307(4);
                        if (m75945x2fec83076 == null) {
                            m75945x2fec83076 = "";
                        }
                        r45.h32 bj6 = ((b92.d1) zbVar3).bj(str5, m75945x2fec83076);
                        if (bj6 != null) {
                            bj6.set(1, java.lang.Integer.valueOf(sVar.f504182e.m75939xb282bd08(1)));
                        }
                    }
                    android.app.Activity context = sVar.f504180c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((te2.e4) ((zy2.g8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.g8.class))).f499507d.M0(sVar.f504179b);
                } else {
                    tx2.s.a(sVar, 1);
                }
                yz5.p pVar = sVar.f504186i;
                if (pVar != null) {
                    pVar.mo149xb9724478(java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(z18));
                }
            }
            if (z18) {
                r45.h32 h32Var2 = sVar.f504182e;
                java.lang.String str6 = sVar.f504179b;
                java.lang.String m75945x2fec83077 = h32Var2.m75945x2fec8307(8);
                java.lang.String str7 = m75945x2fec83077 == null ? "" : m75945x2fec83077;
                java.lang.String m75945x2fec83078 = h32Var2.m75945x2fec8307(4);
                pq5.g l17 = new db2.b2(str7, null, null, 0L, 0L, m75945x2fec83078 == null ? "" : m75945x2fec83078, 1, false, 158, null).l();
                android.app.Activity activity = sVar.f504180c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity);
                l17.K(new tx2.p(sVar, str6));
            }
        } else if (!z18) {
            if (intValue2 != 0) {
                a(sVar);
            } else {
                tx2.m mVar = new tx2.m(sVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) sVar.f504180c, 1, true);
                k0Var.f293405n = new tx2.q(sVar);
                k0Var.f293414s = new tx2.r(mVar);
                k0Var.v();
            }
        }
        return jz5.f0.f384359a;
    }
}
