package cw1;

/* loaded from: classes3.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da f304454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304457g;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view) {
        this.f304454d = activityC13123x212a66da;
        this.f304455e = textView;
        this.f304456f = textView2;
        this.f304457g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da = this.f304454d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13123x212a66da, 1, true);
        k0Var.q(activityC13123x212a66da.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzy), 17);
        k0Var.f293405n = new cw1.b7(activityC13123x212a66da);
        k0Var.f293387d = new cw1.c7(activityC13123x212a66da);
        k0Var.f293414s = new cw1.d7(this.f304455e, activityC13123x212a66da, this.f304456f, this.f304457g);
        k0Var.v();
        activityC13123x212a66da.f177331h = k0Var;
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
