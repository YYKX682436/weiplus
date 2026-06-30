package bm2;

/* loaded from: classes3.dex */
public final class r7 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.u7 f103810d;

    public r7(bm2.u7 u7Var) {
        this.f103810d = u7Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveSensitiveWordAdapter$WordItemViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.ohu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.FloatArray");
        float[] fArr = (float[]) tag;
        int i17 = (int) fArr[0];
        int i18 = (int) fArr[1];
        bm2.u7 u7Var = this.f103810d;
        bm2.w7 w7Var = u7Var.f103889g;
        ((rl5.r) ((jz5.n) w7Var.f103951f).mo141623x754a37bb()).a();
        ((rl5.r) ((jz5.n) w7Var.f103951f).mo141623x754a37bb()).h(u7Var.f3639x46306858, new bm2.s7(u7Var), new bm2.t7(w7Var, u7Var), i17, i18);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveSensitiveWordAdapter$WordItemViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
