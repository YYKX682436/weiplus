package ir;

/* loaded from: classes12.dex */
public final class e1 extends ir.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f375365d;

    /* renamed from: e, reason: collision with root package name */
    public int f375366e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ir.u groupInfo, boolean z17) {
        super(groupInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupInfo, "groupInfo");
        if (z17) {
            return;
        }
        java.util.LinkedList linkedList = groupInfo.f375438c;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) linkedList.getFirst();
        boolean z18 = false;
        if (c21051xbc71d247 != null) {
            r45.v75 c17 = gr.t.g().c(c21051xbc71d247.f68396x5bec8145);
            if (c17 != null) {
                ir.i0 i0Var = this.f375345b;
                i0Var.f375400c = c17;
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.m6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.m6.class)) != null) {
                    y12.p.f540410a.b(c17.f469497d, false, new ir.h0(i0Var));
                }
                this.f375345b.f375401d = com.p314xaae8f345.mm.p2621x8fb0427b.d5.f275369a.a(c17.f469497d).a();
            }
            this.f375346c.add(this.f375345b);
        }
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d2472 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) obj;
            java.lang.String str = groupInfo.f375439d;
            if (!((str == null || str.length() == 0) ? true : z18) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(groupInfo.f375439d, c21051xbc71d2472.f68396x5bec8145)) {
                this.f375366e = this.f375346c.size();
            }
            java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4> f17 = gr.t.g().f(c21051xbc71d2472.f68396x5bec8145);
            for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 : f17) {
                java.util.LinkedList linkedList2 = this.f375346c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21053xdbf1e5f4);
                linkedList2.add(new ir.g(c21053xdbf1e5f4, 2, null, 0, 12, null));
            }
            this.f375365d += f17.size();
            if (i17 < linkedList.size() - 1) {
                this.f375346c.add(new ir.g0());
            }
            i17 = i18;
            z18 = false;
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f375365d;
    }
}
