package in2;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.t f374443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f374444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f374445f;

    public v(in2.t tVar, in2.f0 f0Var, int i17) {
        this.f374443d = tVar;
        this.f374444e = f0Var;
        this.f374445f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f374443d.f374435h.setText("");
        in2.f0 f0Var = this.f374444e;
        java.util.ArrayList arrayList2 = f0Var.f374359h;
        int i17 = this.f374445f;
        arrayList2.remove(i17);
        int i18 = f0Var.f374365q;
        if (i18 == i17) {
            f0Var.f374365q = -1;
        } else if (i18 > i17) {
            f0Var.f374365q = i18 - 1;
        }
        f0Var.m8155x27702c4(i17);
        f0Var.m8152xc67946d3(i17, f0Var.f374359h.size() - i17, f0Var.f374356e);
        yz5.l lVar = f0Var.f374362n;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(f0Var.f374359h.size() - 1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
