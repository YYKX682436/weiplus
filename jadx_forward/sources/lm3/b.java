package lm3;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.d f400999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.q f401001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f401002g;

    public b(lm3.d dVar, int i17, fm3.q qVar, in5.s0 s0Var) {
        this.f400999d = dVar;
        this.f401000e = i17;
        this.f401001f = qVar;
        this.f401002g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d3 d3Var = this.f400999d.f401012e;
        android.view.View itemView = this.f401002g.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f3 f3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f3) d3Var;
        f3Var.getClass();
        fm3.q item = this.f401001f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRollback: ");
        int i17 = this.f401000e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = f3Var.f232657a;
        java.util.ArrayList arrayList2 = h4Var.f232695f;
        if (i17 < arrayList2.size()) {
            java.lang.Object obj = arrayList2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            fm3.q qVar = (fm3.q) obj;
            qVar.f345643h = item.f345643h;
            item.f345647o = null;
            h4Var.f232694e.set(i17, qVar);
            h4Var.R6().m8147xed6e4d18(i17);
            h4Var.V6(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g3 g3Var = h4Var.f232704r;
        if (g3Var != null) {
            jm3.c0 c0Var = (jm3.c0) g3Var;
            if (!c0Var.f381834b.P6()) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.V6(c0Var.f381833a);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
