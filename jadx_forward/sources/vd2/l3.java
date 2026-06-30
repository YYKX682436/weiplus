package vd2;

/* loaded from: classes3.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f517330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f517332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15418xa028bed2 f517334h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(r45.h32 h32Var, android.content.Context context, xc2.p0 p0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15418xa028bed2 c15418xa028bed2) {
        super(2);
        this.f517330d = h32Var;
        this.f517331e = context;
        this.f517332f = p0Var;
        this.f517333g = str;
        this.f517334h = c15418xa028bed2;
    }

    public static final void a(java.lang.String str, android.content.Context context, r45.h32 h32Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15418xa028bed2 c15418xa028bed2, r45.h32 h32Var2, int i17) {
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String m75945x2fec8307 = h32Var2.m75945x2fec8307(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
        gm0.j1.d().g(c61.zb.x3((c61.zb) c17, str, m75945x2fec8307, i17, null, null, 11, null, null, null, null, null, null, null, 8144, null));
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String m75945x2fec83072 = h32Var2.m75945x2fec8307(4);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        if (((b92.d1) zbVar).bj(str, m75945x2fec83072) == null) {
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String m75945x2fec83073 = h32Var2.m75945x2fec8307(4);
            ((b92.d1) zbVar2).Ai(str, m75945x2fec83073 != null ? m75945x2fec83073 : "", h32Var2);
        } else {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String m75945x2fec83074 = h32Var2.m75945x2fec8307(4);
            r45.h32 bj6 = ((b92.d1) zbVar3).bj(str, m75945x2fec83074 != null ? m75945x2fec83074 : "");
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(h32Var2.m75939xb282bd08(1)));
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.g8.class))).f499507d.M0(str);
        if (h32Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15418xa028bed2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf.g(c15418xa028bed2, str, false, new vd2.i3(h32Var), 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if ((r3.length() > 0) == true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(r45.h32 r28, java.lang.String r29, android.content.Context r30, xc2.p0 r31, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15418xa028bed2 r32) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.l3.d(r45.h32, java.lang.String, android.content.Context, xc2.p0, com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView):void");
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.ov2 a17;
        java.lang.String m75945x2fec8307;
        r45.q65 q65Var;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        xc2.p0 p0Var = this.f517332f;
        android.content.Context context = this.f517331e;
        r45.h32 h32Var = this.f517330d;
        if (intValue != -1) {
            boolean z17 = false;
            if (h32Var != null) {
                h32Var.set(1, 0);
            }
            if (intValue == 1) {
                ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).wi(context, 2, false, new vd2.g3(h32Var, context));
                cl0.g gVar = new cl0.g();
                gVar.s("pay_type", java.lang.Integer.valueOf((h32Var == null || (q65Var = (r45.q65) h32Var.m75936x14adae67(10)) == null || !q65Var.m75933x41a8a7f2(0)) ? 0 : 1));
                if (h32Var != null && (m75945x2fec8307 = h32Var.m75945x2fec8307(8)) != null) {
                    if (m75945x2fec8307.length() > 0) {
                        z17 = true;
                    }
                }
                gVar.s("page_type", z17 ? "get_ticket" : "");
                cl0.g gVar2 = new cl0.g();
                gVar2.h("coupon_id", (h32Var == null || (a17 = zl2.t.a(h32Var)) == null) ? null : a17.m75945x2fec8307(1));
                gVar2.o("ui_position", 1);
                c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
                ml2.i5 i5Var = ml2.i5.f409104f;
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String valueOf = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
                java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(3);
                java.lang.String str = m75945x2fec83072 == null ? "" : m75945x2fec83072;
                java.lang.String gVar3 = gVar.toString();
                java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = p0Var.f534777f;
                long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
                int m75939xb282bd08 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(5);
                java.lang.String gVar4 = gVar2.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1Var);
                c50.c1.l9(c1Var, i5Var, this.f517333g, 0L, 0, valueOf, null, null, null, null, str, gVar3, m75945x2fec83073, gVar4, mo2128x1ed62e84, m75939xb282bd08, null, 33248, null);
                if (h32Var != null) {
                    a(this.f517333g, this.f517331e, h32Var, this.f517334h, h32Var, 1);
                }
            }
        } else if (intValue2 != 0) {
            d(h32Var, this.f517333g, context, p0Var, this.f517334h);
        } else if (h32Var != null) {
            vd2.h3 h3Var = new vd2.h3(h32Var, this.f517333g, context, p0Var, this.f517334h);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
            k0Var.f293405n = new vd2.j3(context);
            k0Var.f293414s = new vd2.k3(h3Var);
            k0Var.v();
        }
        return jz5.f0.f384359a;
    }
}
