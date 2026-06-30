package cw1;

/* loaded from: classes3.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304477g;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view) {
        this.f304474d = activityC13107x4291ddb8;
        this.f304475e = textView;
        this.f304476f = textView2;
        this.f304477g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8 = this.f304474d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13107x4291ddb8, 1, true);
        k0Var.q(activityC13107x4291ddb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_j), 17);
        k0Var.f293405n = new cw1.d0(activityC13107x4291ddb8);
        k0Var.f293387d = new cw1.e0(activityC13107x4291ddb8);
        k0Var.f293414s = new cw1.f0(this.f304475e, activityC13107x4291ddb8, this.f304476f, this.f304477g);
        k0Var.v();
        activityC13107x4291ddb8.f177181e = k0Var;
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
