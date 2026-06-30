package w82;

/* loaded from: classes11.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 f525467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w82.s0 f525468e;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504, w82.s0 s0Var) {
        this.f525467d = c13624x28778504;
        this.f525468e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTopTagPanel$addPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f525467d.y(this.f525468e, true, 18);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavTopTagPanel$addPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
