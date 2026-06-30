package lj2;

/* loaded from: classes3.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.i0 f400383d;

    public d0(lj2.i0 i0Var) {
        this.f400383d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lj2.i0 i0Var = this.f400383d;
        i0Var.f400399c.mo152xb9724478();
        i0Var.f400405i = true;
        i0Var.f400401e.dismiss();
        android.content.Context context = i0Var.f400397a;
        db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mme), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
