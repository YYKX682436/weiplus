package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 f191446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 f191447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 c5457xd6bc6fd1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084) {
        super(0);
        this.f191446d = c5457xd6bc6fd1;
        this.f191447e = activityC14126xa5cf9084;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 c5457xd6bc6fd1 = this.f191446d;
        int i17 = c5457xd6bc6fd1.f135796g.f89528c;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.Z;
        am.ta taVar = c5457xd6bc6fd1.f135796g;
        int i19 = -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084 = this.f191447e;
        if (i17 == i18) {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.U;
            java.util.Iterator it = activityC14126xa5cf9084.d7().f191360n.iterator();
            int i28 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((so2.y0) it.next()).mo2128x1ed62e84() == taVar.f89527b) {
                    i19 = i28;
                    break;
                }
                i28++;
            }
            if (i19 >= 0) {
                java.lang.Object obj = activityC14126xa5cf9084.d7().f191360n.get(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                so2.y0 y0Var = (so2.y0) obj;
                if (hc2.o0.H(activityC14126xa5cf9084.d7().O6().getFeedObject())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = y0Var.f492236d;
                    yj0Var.l1(yj0Var.z0() | 1);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 u07 = y0Var.f492236d.u0();
                    r45.dc dcVar = new r45.dc();
                    dcVar.set(0, java.lang.Long.valueOf(c01.id.a() / 1000));
                    u07.m76105x37f04d2(dcVar);
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = activityC14126xa5cf9084.f191313x;
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8148xed6e4d18(i19, 1);
                }
            }
        } else if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.f209792p0) {
            int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.U;
            java.util.Iterator it6 = activityC14126xa5cf9084.d7().f191360n.iterator();
            int i37 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((so2.y0) it6.next()).mo2128x1ed62e84() == taVar.f89527b) {
                    i19 = i37;
                    break;
                }
                i37++;
            }
            if (i19 >= 0) {
                java.lang.Object obj2 = activityC14126xa5cf9084.d7().f191360n.get(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                so2.y0 y0Var2 = (so2.y0) obj2;
                if (hc2.o0.H(activityC14126xa5cf9084.d7().O6().getFeedObject())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2 = y0Var2.f492236d;
                    yj0Var2.l1(yj0Var2.z0() & (-2));
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = activityC14126xa5cf9084.f191313x;
                if (c22848x6ddd90cf2 != null) {
                    c22848x6ddd90cf2.m8148xed6e4d18(i19, 1);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
