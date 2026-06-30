package mh2;

/* loaded from: classes10.dex */
public final class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.r1 f407958d;

    public n1(mh2.r1 r1Var) {
        this.f407958d = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KtvNoSingerWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mh2.r1 r1Var = this.f407958d;
        if (r1Var.f407981d.a0().H()) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqk), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KtvNoSingerWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            r1Var.f407980c.d(true);
            r1Var.f407980c.i();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KtvNoSingerWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
