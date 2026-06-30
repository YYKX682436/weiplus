package hk5;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk5.k f363534d;

    public d(hk5.k kVar) {
        this.f363534d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hk5.k kVar = this.f363534d;
        kVar.f424601e = 1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(kVar.m80379x76847179());
        android.view.View inflate = android.view.View.inflate(kVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.d1g, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oe_);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cgl);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cgm);
        }
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.oed)).setOnClickListener(new hk5.h(y1Var));
        y1Var.k(inflate);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
