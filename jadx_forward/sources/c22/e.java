package c22;

/* loaded from: classes15.dex */
public final class e extends lr.z {

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0 f119531o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f119532p;

    public e() {
        super(null, 1, null);
        this.f119531o = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.NORMAL;
        this.f119532p = new java.util.LinkedList();
    }

    @Override // lr.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B */
    public lr.s0 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 3) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6d, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new c22.a(this, inflate, this.f402153g);
        }
        if (i17 == 8) {
            android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570266a72, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new lr.g(inflate2, this.f402153g);
        }
        if (i17 == 11) {
            android.content.Context context = parent.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            return new c22.d(context);
        }
        if (i17 != 100) {
            android.view.View inflate3 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6f, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            return new c22.c(this, inflate3, this.f402153g);
        }
        android.view.View inflate4 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6h, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate4, "inflate(...)");
        return new c22.b(inflate4, this.f402153g);
    }

    public final void I() {
        java.util.ArrayList arrayList = this.f402152f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Object obj : arrayList) {
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ir.u0 u0Var = (ir.u0) obj;
            boolean z17 = true;
            if ((u0Var instanceof ir.g) && this.f119532p.contains(((ir.g) u0Var).f375369b.mo42933xb5885648())) {
                m8155x27702c4(i17 - i18);
                i18++;
                z17 = false;
            }
            if (z17) {
                arrayList2.add(obj);
            }
            i17 = i19;
        }
        E(arrayList2);
    }

    public final void J(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.LinkedList linkedList = this.f119532p;
        linkedList.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it.next()).mo42933xb5885648());
        }
        linkedList.addAll(arrayList);
        ot5.g.c("MicroMsg.EmojiCustomAdapter", "updateSelected: ".concat(kz5.n0.g0(linkedList, "\n", null, null, 0, null, null, 62, null)));
    }
}
