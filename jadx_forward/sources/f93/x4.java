package f93;

/* loaded from: classes11.dex */
public final class x4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.u4 f342041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.b5 f342042e;

    public x4(f93.u4 u4Var, f93.b5 b5Var) {
        this.f342041d = u4Var;
        this.f342042e = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/HeaderLabelDataItem$HeaderLabelViewItem$setHolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        f93.u4 u4Var = this.f342041d;
        u4Var.a();
        u4Var.a().setText(" ");
        f93.a5 a5Var = this.f342042e.G;
        if (a5Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textListener");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = ((f93.x) a5Var).f342032a;
        activityC16165x57283aea.f224728h = "";
        activityC16165x57283aea.m78501x43e00957(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(""));
        if (u4Var.b().getVisibility() == 0) {
            u4Var.b().setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/HeaderLabelDataItem$HeaderLabelViewItem$setHolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
