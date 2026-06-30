package ir;

/* loaded from: classes12.dex */
public final class d1 extends ir.a {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.LinkedList f375359g = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f375360d;

    /* renamed from: e, reason: collision with root package name */
    public final int f375361e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f375362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ir.t groupInfo, boolean z17) {
        super(groupInfo);
        boolean contains;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupInfo, "groupInfo");
        if (!c()) {
            this.f375360d = new java.util.ArrayList();
            this.f375346c.add(new ir.f0(groupInfo.f375433b));
            return;
        }
        if (z17) {
            this.f375360d = new java.util.ArrayList();
        } else {
            java.util.ArrayList f17 = gr.t.g().f(groupInfo.f375433b.f68396x5bec8145);
            this.f375360d = f17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PanelItemGroup", "StoreItemGroup: " + groupInfo.c() + " count: " + f17.size() + '[' + groupInfo.f375433b.f68377x28f0318a + ']');
            int size = f17.size();
            int i17 = groupInfo.f375433b.f68377x28f0318a;
            if (size != i17 && i17 > 0) {
                java.lang.String c17 = groupInfo.c();
                int i18 = groupInfo.f375433b.f68377x28f0318a;
                java.util.LinkedList linkedList = f375359g;
                synchronized (linkedList) {
                    contains = linkedList.contains(c17);
                }
                if (!contains) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6418x9c232c56 c6418x9c232c56 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6418x9c232c56();
                    c6418x9c232c56.f137600f = i18;
                    c6418x9c232c56.f137601g = f17.size();
                    c6418x9c232c56.f137598d = c6418x9c232c56.b("ProductId", c17, true);
                    synchronized (linkedList) {
                        linkedList.add(c17);
                    }
                    r45.se3 se3Var = new r45.se3();
                    z85.s y07 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().d().y0(c17);
                    if ((y07 != null ? y07.f65848xad49e234 : null) != null) {
                        try {
                            se3Var.mo11468x92b714fd(y07.f65848xad49e234);
                            r45.qj0 qj0Var = se3Var.f467185d;
                            if ((qj0Var != null ? qj0Var.f465583y : null) == null || qj0Var.f465583y.size() != i18) {
                                z18 = false;
                            } else {
                                java.util.LinkedList<r45.m35> ThumbExtList = se3Var.f467185d.f465583y;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ThumbExtList, "ThumbExtList");
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(ThumbExtList, 10));
                                for (r45.m35 m35Var : ThumbExtList) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m35Var);
                                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(m35Var.f461650f);
                                    if (u17 == null) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PanelItemGroup", "repair emoji create " + m35Var.f461650f);
                                        u17 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                                        u17.f68671x4b6e68b9 = m35Var.f461650f;
                                        u17.f68686x7b284d5e = m35Var.f461653i;
                                        u17.f68654xf47770e7 = m35Var.f461652h;
                                        u17.f68642xf11e6e15 = m35Var.f461651g;
                                        u17.f68659x5efe714f = m35Var.f461654m;
                                        u17.f68661x765114aa = m35Var.f461655n;
                                        u17.f68660x7650f4b9 = m35Var.f461656o;
                                        u17.f68641x3342accf = m35Var.f461657p;
                                        u17.f68663x861009b5 = c17;
                                    } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u17.f68663x861009b5, c17)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PanelItemGroup", "repair emoji " + u17.mo42933xb5885648() + " from [" + u17.f68663x861009b5 + "] to [" + c17 + ']');
                                        u17.f68663x861009b5 = c17;
                                    }
                                    arrayList.add(u17);
                                }
                                z18 = f17.size() != arrayList.size();
                                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().h2(arrayList, c17);
                            }
                            if (z18) {
                                gr.t.g().f356224j.m77803xc84af884(c17);
                                java.util.ArrayList f18 = gr.t.g().f(c17);
                                if (!f18.isEmpty()) {
                                    this.f375360d.clear();
                                    this.f375360d.addAll(f18);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PanelItemGroup", "StoreItemGroup: " + this.f375344a.c() + " repair count: " + this.f375360d.size());
                                }
                            }
                            c6418x9c232c56.f137602h = this.f375360d.size();
                            c6418x9c232c56.k();
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PanelItemGroup", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                        }
                    } else {
                        c6418x9c232c56.f137599e = 1;
                        c6418x9c232c56.k();
                    }
                }
            }
            r45.v75 c18 = gr.t.g().c(groupInfo.f375433b.f68396x5bec8145);
            if (c18 != null) {
                ir.i0 i0Var = this.f375345b;
                i0Var.f375400c = c18;
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.m6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.m6.class)) != null) {
                    y12.p.f540410a.b(c18.f469497d, false, new ir.h0(i0Var));
                }
                this.f375345b.f375401d = com.p314xaae8f345.mm.p2621x8fb0427b.d5.f275369a.a(c18.f469497d).a();
                this.f375362f = this.f375345b.f375401d;
            }
            this.f375346c.add(this.f375345b);
        }
        this.f375361e = this.f375360d.size();
        java.util.Iterator it = this.f375360d.iterator();
        while (it.hasNext()) {
            this.f375346c.add(new ir.g((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it.next(), 2, null, 0, 12, null));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f375361e;
    }

    public final boolean c() {
        ir.r rVar = this.f375344a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(rVar, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.EmojiPanelGroupItemGroup");
        return ((ir.t) rVar).f375433b.f68402x2261bec0 == 2 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((ir.t) rVar).f375433b.f68396x5bec8145, "17");
    }
}
