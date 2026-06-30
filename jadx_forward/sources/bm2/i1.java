package bm2;

/* loaded from: classes3.dex */
public final class i1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o1 f103497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f103498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f103499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103500g;

    public i1(bm2.o1 o1Var, bm2.h1 h1Var, dk2.zf zfVar, int i17) {
        this.f103497d = o1Var;
        this.f103498e = h1Var;
        this.f103499f = zfVar;
        this.f103500g = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        bm2.o1 o1Var = this.f103497d;
        jz5.l lVar = o1Var.f103717q;
        boolean z17 = false;
        if (lVar != null) {
            ae2.in inVar = ae2.in.f85221a;
            int intValue = ((java.lang.Number) ae2.in.f85279f7.r()).intValue();
            bm2.h1 h1Var = this.f103498e;
            dk2.zf zfVar = this.f103499f;
            int i17 = this.f103500g;
            if (intValue == 1) {
                if (pm0.v.r(h1Var.f103462g).contains(((java.lang.Number) lVar.f384366d).intValue(), ((java.lang.Number) lVar.f384367e).intValue())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o1Var.f103712i, "onSingleTapConfirmed: topComment,content:" + zfVar.j() + ",position:" + i17);
                    yz5.q qVar = o1Var.f103714n;
                    if (qVar != null) {
                        android.view.View itemView = h1Var.f3639x46306858;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                        qVar.mo147xb9724478(zfVar, itemView, h1Var);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o1Var.f103712i, "OnLongClickListener-result = " + z17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o1Var.f103712i, "onSingleTapConfirmed: topComment,content:" + zfVar.j() + ",position:" + i17);
                yz5.q qVar2 = o1Var.f103714n;
                if (qVar2 != null) {
                    android.view.View itemView2 = h1Var.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
                    qVar2.mo147xb9724478(zfVar, itemView2, h1Var);
                }
            }
            z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o1Var.f103712i, "OnLongClickListener-result = " + z17);
        }
        o1Var.f103718r = z17;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
