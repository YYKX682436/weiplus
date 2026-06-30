package lm3;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.d f401007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.q f401009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f401010g;

    public c(lm3.d dVar, int i17, fm3.q qVar, in5.s0 s0Var) {
        this.f401007d = dVar;
        this.f401008e = i17;
        this.f401009f = qVar;
        this.f401010g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d3 d3Var = this.f401007d.f401012e;
        android.view.View itemView = this.f401010g.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f3 f3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f3) d3Var;
        f3Var.getClass();
        fm3.q item = this.f401009f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEdit: ");
        int i17 = this.f401008e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.k1o);
        if (imageView != null) {
            fm3.w a17 = fm3.x.a(imageView);
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g3 g3Var = f3Var.f232657a.f232704r;
            if (g3Var != null) {
                ((jm3.c0) g3Var).a(i17, item, false, a17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
