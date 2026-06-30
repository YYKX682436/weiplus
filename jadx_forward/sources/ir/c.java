package ir;

/* loaded from: classes15.dex */
public final class c extends ir.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f375352d;

    public c(boolean z17) {
        super(ir.v0.a());
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4> b17 = gr.t.g().b(true);
        this.f375352d = b17.size();
        if (b17.isEmpty()) {
            if (z17) {
                this.f375346c.add(new ir.b());
                return;
            }
            return;
        }
        this.f375346c.add(this.f375345b);
        if (z17) {
            this.f375346c.add(new ir.z(1));
        }
        pr.z zVar = pr.k0.f439256q;
        int a17 = zVar.a(false).a();
        int g17 = zVar.a(false).g();
        int i17 = 0;
        for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 : b17) {
            if (i17 >= g17) {
                break;
            }
            if (i17 >= a17) {
                java.util.LinkedList linkedList = this.f375346c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21053xdbf1e5f4);
                linkedList.add(new ir.g(c21053xdbf1e5f4, 3, null, 0, 12, null));
            } else {
                java.util.LinkedList linkedList2 = this.f375346c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21053xdbf1e5f4);
                linkedList2.add(new ir.g(c21053xdbf1e5f4, 1, null, 0, 12, null));
            }
            i17++;
        }
        if (pr.k0.f439256q.a(false).c()) {
            this.f375346c.add(new ir.e0(1));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f375352d;
    }
}
