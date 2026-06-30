package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public final class a2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1 f242325d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f242326e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f242327f;

    /* renamed from: g, reason: collision with root package name */
    public ip.k f242328g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.view.View itemView, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1 iRingtoneChooseCallback) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iRingtoneChooseCallback, "iRingtoneChooseCallback");
        this.f242325d = iRingtoneChooseCallback;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.hjt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f242326e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.nh8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f242327f = (android.widget.ImageView) findViewById2;
        itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/RingtoneViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
        ip.k kVar = this.f242328g;
        sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f375104a) : null);
        sb6.append(", ");
        ip.k kVar2 = this.f242328g;
        sb6.append(kVar2 != null ? kVar2.f375105b : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingMessageRingtoneUI", sb6.toString());
        ip.k kVar3 = this.f242328g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1 z1Var = this.f242325d;
        if (kVar3 != null) {
            z1Var.X3(kVar3);
        }
        z1Var.mo68957xced61ae5();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/RingtoneViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
