package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes15.dex */
public final class g implements ir.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f179080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f179081b;

    public g(boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f179080a = linkedList;
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4> a17 = gr.t.g().a();
        this.f179081b = a17.size();
        if (z17) {
            linkedList.add(new ir.z(0));
        }
        pr.z zVar = pr.k0.f439256q;
        int a18 = zVar.b(false).a();
        int g17 = zVar.b(false).g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCustomItem", "sync: " + a18 + ", " + g17);
        int i17 = 0;
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 : a17) {
            if (c21053xdbf1e5f4.f68653x95b20dd4 == 18) {
                this.f179081b--;
            } else {
                if (i17 >= g17) {
                    break;
                }
                if (i17 >= a18) {
                    ((java.util.LinkedList) this.f179080a).add(new ir.g(c21053xdbf1e5f4, 3, null, 0, 12, null));
                } else {
                    ((java.util.LinkedList) this.f179080a).add(new ir.g(c21053xdbf1e5f4, 0, null, 0, 12, null));
                }
                i17++;
            }
        }
        if (pr.k0.f439256q.b(false).c()) {
            ((java.util.LinkedList) this.f179080a).add(new ir.e0(0));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f179081b;
    }

    @Override // ir.k0
    public java.util.List b() {
        return this.f179080a;
    }

    @Override // ir.k0
    public ir.r p() {
        return ir.v0.b();
    }
}
