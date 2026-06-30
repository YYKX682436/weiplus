package c22;

/* loaded from: classes15.dex */
public final class e extends lr.z {

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.q0 f37998o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f37999p;

    public e() {
        super(null, 1, null);
        this.f37998o = com.tencent.mm.plugin.emoji.ui.q0.NORMAL;
        this.f37999p = new java.util.LinkedList();
    }

    @Override // lr.z, androidx.recyclerview.widget.f2
    /* renamed from: B */
    public lr.s0 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 3) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.a6d, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new c22.a(this, inflate, this.f320620g);
        }
        if (i17 == 8) {
            android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.f488733a72, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new lr.g(inflate2, this.f320620g);
        }
        if (i17 == 11) {
            android.content.Context context = parent.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            return new c22.d(context);
        }
        if (i17 != 100) {
            android.view.View inflate3 = from.inflate(com.tencent.mm.R.layout.a6f, parent, false);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            return new c22.c(this, inflate3, this.f320620g);
        }
        android.view.View inflate4 = from.inflate(com.tencent.mm.R.layout.a6h, parent, false);
        kotlin.jvm.internal.o.f(inflate4, "inflate(...)");
        return new c22.b(inflate4, this.f320620g);
    }

    public final void I() {
        java.util.ArrayList arrayList = this.f320619f;
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
            if ((u0Var instanceof ir.g) && this.f37999p.contains(((ir.g) u0Var).f293836b.getMd5())) {
                notifyItemRemoved(i17 - i18);
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
        kotlin.jvm.internal.o.g(list, "list");
        java.util.LinkedList linkedList = this.f37999p;
        linkedList.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.mm.storage.emotion.EmojiInfo) it.next()).getMd5());
        }
        linkedList.addAll(arrayList);
        ot5.g.c("MicroMsg.EmojiCustomAdapter", "updateSelected: ".concat(kz5.n0.g0(linkedList, "\n", null, null, 0, null, null, 62, null)));
    }
}
