package in2;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.t f374439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f374440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f374441f;

    public u(in2.t tVar, in2.f0 f0Var, int i17) {
        this.f374439d = tVar;
        this.f374440e = f0Var;
        this.f374441f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f374439d.f374435h.setText("");
        dk2.yg ygVar = (dk2.yg) this.f374440e.f374359h.get(this.f374441f);
        ygVar.getClass();
        ygVar.f315926a = "";
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
