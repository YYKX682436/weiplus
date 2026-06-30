package ir;

/* loaded from: classes15.dex */
public final class e extends ir.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f375363d;

    public e(boolean z17, boolean z18) {
        super(ir.v0.b());
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4> a17 = gr.t.g().a();
        this.f375363d = a17.size();
        this.f375346c.add(this.f375345b);
        if (z17) {
            this.f375346c.add(new ir.z(0));
        }
        pr.z zVar = pr.k0.f439256q;
        int a18 = zVar.b(false).a();
        int g17 = zVar.b(false).g();
        int i17 = 0;
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 : a17) {
            if (z18 || !n22.m.l(c21053xdbf1e5f4)) {
                if (i17 >= g17) {
                    break;
                }
                if (i17 >= a18) {
                    java.util.LinkedList linkedList = this.f375346c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21053xdbf1e5f4);
                    linkedList.add(new ir.g(c21053xdbf1e5f4, 3, null, 0, 12, null));
                } else {
                    java.util.LinkedList linkedList2 = this.f375346c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21053xdbf1e5f4);
                    linkedList2.add(new ir.g(c21053xdbf1e5f4, 0, null, 0, 12, null));
                }
                i17++;
            }
        }
        if (pr.k0.f439256q.b(false).c()) {
            this.f375346c.add(new ir.e0(0));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f375363d;
    }
}
