package w82;

/* loaded from: classes11.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 f525345d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504) {
        this.f525345d = c13624x28778504;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTopTagPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "core editTextView onClick");
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504.f183092x1;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504 = this.f525345d;
        c13624x28778504.m79119xbc895012().setCursorVisible(true);
        w82.n0 n0Var = c13624x28778504.U;
        if (n0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "[on input panel edit text click]");
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.o7) n0Var).f182854a;
            if (z7Var.f183198k.getVisibility() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13582xd706766c c13582xd706766c = z7Var.f183200m;
                if (c13582xd706766c == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFlRvContains");
                    throw null;
                }
                c13582xd706766c.startAnimation(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.b(z7Var));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavTopTagPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
