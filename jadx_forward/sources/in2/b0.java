package in2;

/* loaded from: classes10.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f374342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.t f374343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f374344f;

    public b0(in2.f0 f0Var, in2.t tVar, int i17) {
        this.f374342d = f0Var;
        this.f374343e = tVar;
        this.f374344f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in2.t tVar = this.f374343e;
        android.content.Context context = tVar.f374431d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        in2.f0 f0Var = this.f374342d;
        if (f0Var.x(context)) {
            java.util.ArrayList arrayList2 = f0Var.f374359h;
            int i17 = this.f374344f;
            ((dk2.yg) arrayList2.get(i17)).f315928c = 3;
            f0Var.m8147xed6e4d18(i17);
            f0Var.f374366r = true;
            if (i17 < f0Var.f374360i) {
                f0Var.f374359h.add(new dk2.yg("", 0L, 1, false, false, false, false, null, 0, 504, null));
                yz5.l lVar = f0Var.f374362n;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Integer.valueOf(f0Var.f374359h.size() - 1));
                }
                f0Var.m8149x8b456734(f0Var.mo1894x7e414b06());
                f0Var.m8147xed6e4d18(f0Var.mo1894x7e414b06());
                tVar.f374436i.setVisibility(8);
            } else {
                tVar.f374436i.setVisibility(0);
                f0Var.getClass();
            }
            yz5.l lVar2 = f0Var.f374364p;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Integer.valueOf(f0Var.f374359h.size() - 1));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
