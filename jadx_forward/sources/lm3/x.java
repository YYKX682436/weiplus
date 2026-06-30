package lm3;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.e f401053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1 f401054e;

    public x(lm3.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1 e1Var) {
        this.f401053d = eVar;
        this.f401054e = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m76197x6c03c64c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$6$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f401053d.f401015d.f345663j;
        if (c19782x23db1cfa != null && (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) != null) {
            this.f401054e.O6(m76197x6c03c64c, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$6$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
