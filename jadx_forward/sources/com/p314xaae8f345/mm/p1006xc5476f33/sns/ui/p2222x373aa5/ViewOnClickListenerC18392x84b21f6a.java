package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5;

/* renamed from: com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView */
/* loaded from: classes.dex */
public class ViewOnClickListenerC18392x84b21f6a extends android.widget.RelativeLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f252181d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f252182e;

    public ViewOnClickListenerC18392x84b21f6a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/view/HalfScreenAddBrandView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.f565014b01) {
            throw null;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.bys) {
            throw null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/view/HalfScreenAddBrandView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
    }

    public ViewOnClickListenerC18392x84b21f6a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570701bj5, this);
        this.f252181d = inflate;
        this.f252182e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.bys);
        ((android.widget.Button) this.f252181d.findViewById(com.p314xaae8f345.mm.R.id.f565014b01)).setOnClickListener(this);
        this.f252182e.setOnClickListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
    }
}
