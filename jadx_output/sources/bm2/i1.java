package bm2;

/* loaded from: classes3.dex */
public final class i1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o1 f21964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f21965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f21966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21967g;

    public i1(bm2.o1 o1Var, bm2.h1 h1Var, dk2.zf zfVar, int i17) {
        this.f21964d = o1Var;
        this.f21965e = h1Var;
        this.f21966f = zfVar;
        this.f21967g = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        bm2.o1 o1Var = this.f21964d;
        jz5.l lVar = o1Var.f22184q;
        boolean z17 = false;
        if (lVar != null) {
            ae2.in inVar = ae2.in.f3688a;
            int intValue = ((java.lang.Number) ae2.in.f3746f7.r()).intValue();
            bm2.h1 h1Var = this.f21965e;
            dk2.zf zfVar = this.f21966f;
            int i17 = this.f21967g;
            if (intValue == 1) {
                if (pm0.v.r(h1Var.f21929g).contains(((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue())) {
                    com.tencent.mars.xlog.Log.i(o1Var.f22179i, "onSingleTapConfirmed: topComment,content:" + zfVar.j() + ",position:" + i17);
                    yz5.q qVar = o1Var.f22181n;
                    if (qVar != null) {
                        android.view.View itemView = h1Var.itemView;
                        kotlin.jvm.internal.o.f(itemView, "itemView");
                        qVar.invoke(zfVar, itemView, h1Var);
                    }
                }
                com.tencent.mars.xlog.Log.i(o1Var.f22179i, "OnLongClickListener-result = " + z17);
            } else {
                com.tencent.mars.xlog.Log.i(o1Var.f22179i, "onSingleTapConfirmed: topComment,content:" + zfVar.j() + ",position:" + i17);
                yz5.q qVar2 = o1Var.f22181n;
                if (qVar2 != null) {
                    android.view.View itemView2 = h1Var.itemView;
                    kotlin.jvm.internal.o.f(itemView2, "itemView");
                    qVar2.invoke(zfVar, itemView2, h1Var);
                }
            }
            z17 = true;
            com.tencent.mars.xlog.Log.i(o1Var.f22179i, "OnLongClickListener-result = " + z17);
        }
        o1Var.f22185r = z17;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
