package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFourFragment;", "Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "Landroid/widget/AdapterView$OnItemClickListener;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment */
/* loaded from: classes15.dex */
public final class C17169xebd2a739 extends com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f239618f;

    /* renamed from: g, reason: collision with root package name */
    public bx3.a f239619g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239620h = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    /* renamed from: getLayoutId */
    public int mo68447x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cfa;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    /* renamed from: initData */
    public void mo68448xff8c0da() {
        if (this.f239620h) {
            this.f239620h = false;
            m0().c();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void n0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f568116lr1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f239611e = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.i3a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ListView listView = (android.widget.ListView) findViewById2;
        this.f239618f = listView;
        listView.setOnItemClickListener(this);
        android.content.Context mo7438x76847179 = mo7438x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
        bx3.a aVar = new bx3.a(mo7438x76847179, this.f239610d);
        this.f239619g = aVar;
        android.widget.ListView listView2 = this.f239618f;
        if (listView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView2.setAdapter((android.widget.ListAdapter) aVar);
        m0().m82945xba09cf09(new cx3.l(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.AbstractC17166x43ef4061
    public void o0() {
        bx3.a aVar = this.f239619g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFourFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        dp.a.m125854x26a183b(mo7438x76847179(), i17 + "", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/DemoFourFragment", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
