package ut2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ko f512342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.p f512343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hw0 f512344f;

    public a(r45.ko koVar, ut2.p pVar, r45.hw0 hw0Var) {
        this.f512342d = koVar;
        this.f512343e = pVar;
        this.f512344f = hw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ko koVar = this.f512342d;
        r45.ce0 ce0Var = (r45.ce0) koVar.m75936x14adae67(6);
        if (ce0Var != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            ut2.p pVar = this.f512343e;
            android.content.Context context = pVar.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) ce0Var.m75936x14adae67(9));
            c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
            long m75942xfb822ef2 = koVar.m75942xfb822ef2(0);
            java.lang.String m75945x2fec8307 = koVar.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            pVar.s(this.f512344f, m75942xfb822ef2, m75945x2fec8307);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
