package ir1;

/* loaded from: classes3.dex */
public final class n1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final ir1.m1 f375555d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f375556e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f375557f;

    /* renamed from: g, reason: collision with root package name */
    public ir1.j2 f375558g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.view.View itemView, ir1.m1 scopeChooseCallback) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scopeChooseCallback, "scopeChooseCallback");
        this.f375555d = scopeChooseCallback;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.v0v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f375556e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.nh8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f375557f = (android.widget.ImageView) findViewById2;
        itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansPrivateMsgScopeViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
        ir1.j2 j2Var = this.f375558g;
        sb6.append(j2Var != null ? java.lang.Integer.valueOf(j2Var.f375541a) : null);
        sb6.append(", ");
        ir1.j2 j2Var2 = this.f375558g;
        sb6.append(j2Var2 != null ? j2Var2.f375542b : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFansPrivateMsgScopeSettingUI", sb6.toString());
        ir1.j2 j2Var3 = this.f375558g;
        ir1.m1 m1Var = this.f375555d;
        if (j2Var3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12972x45ae6e01 activityC12972x45ae6e01 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12972x45ae6e01) m1Var;
            activityC12972x45ae6e01.getClass();
            activityC12972x45ae6e01.f175489f = java.lang.Integer.valueOf(j2Var3.f375541a);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12972x45ae6e01) m1Var).T6().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansPrivateMsgScopeViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
