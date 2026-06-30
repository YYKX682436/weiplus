package cw1;

/* loaded from: classes3.dex */
public final class a7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da f304319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f304320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304322g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304323h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304324i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304325m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f304326n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304327o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ cw1.j7 f304328p;

    public a7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da, yv1.g1 g1Var, android.view.View view, android.view.View view2, android.view.View view3, android.widget.TextView textView, android.widget.TextView textView2, int i17, android.view.View view4, cw1.j7 j7Var) {
        this.f304319d = activityC13123x212a66da;
        this.f304320e = g1Var;
        this.f304321f = view;
        this.f304322g = view2;
        this.f304323h = view3;
        this.f304324i = textView;
        this.f304325m = textView2;
        this.f304326n = i17;
        this.f304327o = view4;
        this.f304328p = j7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da = this.f304319d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13123x212a66da, 1, true);
        yv1.g1 g1Var = this.f304320e;
        android.view.View view2 = this.f304321f;
        android.view.View view3 = this.f304322g;
        android.view.View view4 = this.f304323h;
        android.widget.TextView textView = this.f304324i;
        android.widget.TextView textView2 = this.f304325m;
        int i17 = this.f304326n;
        android.view.View view5 = this.f304327o;
        cw1.j7 j7Var = this.f304328p;
        k0Var.q(activityC13123x212a66da.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyi), 17);
        k0Var.f293405n = new cw1.v6(activityC13123x212a66da);
        k0Var.f293414s = new cw1.z6(activityC13123x212a66da, g1Var, view2, view3, view4, textView, textView2, i17, view5, j7Var);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
