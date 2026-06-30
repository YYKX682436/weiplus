package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes15.dex */
public final class e implements ir.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f179076a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final int f179077b;

    public e() {
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4> b17 = gr.t.g().b(false);
        this.f179077b = b17.size();
        pr.z zVar = pr.k0.f439256q;
        int a17 = zVar.a(false).a();
        int g17 = zVar.a(false).g();
        int i17 = 0;
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 : b17) {
            if (i17 >= g17) {
                break;
            }
            if (i17 >= a17) {
                java.util.List list = this.f179076a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21053xdbf1e5f4);
                list.add(new ir.g(c21053xdbf1e5f4, 3, null, 0, 12, null));
            } else {
                java.util.List list2 = this.f179076a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21053xdbf1e5f4);
                list2.add(new ir.g(c21053xdbf1e5f4, 1, null, 0, 12, null));
            }
            i17++;
        }
        if (pr.k0.f439256q.a(false).c()) {
            this.f179076a.add(new ir.e0(1));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f179077b;
    }

    @Override // ir.k0
    public java.util.List b() {
        return this.f179076a;
    }

    @Override // ir.k0
    public ir.r p() {
        return ir.v0.a();
    }
}
