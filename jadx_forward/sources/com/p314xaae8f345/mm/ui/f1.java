package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class f1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f289940d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f289941e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f289942f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.c1 f289943g = new com.p314xaae8f345.mm.ui.z0(this);

    /* renamed from: h, reason: collision with root package name */
    public final o11.g f289944h;

    public f1(android.view.LayoutInflater layoutInflater) {
        this.f289940d = layoutInflater;
        o11.f fVar = new o11.f();
        fVar.f423629t = true;
        fVar.f423627r = l01.a.h();
        this.f289944h = fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f289941e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.ui.a1) this.f289941e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.e1 e1Var;
        android.view.View view2;
        com.p314xaae8f345.mm.ui.a1 a1Var = (com.p314xaae8f345.mm.ui.a1) this.f289941e.get(i17);
        if (view == null) {
            view2 = this.f289940d.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569677id, viewGroup, false);
            e1Var = new com.p314xaae8f345.mm.ui.e1(null);
            e1Var.f289889a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a9o);
            e1Var.f289890b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.obg);
            e1Var.f289891c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) view2.findViewById(com.p314xaae8f345.mm.R.id.a2v);
            e1Var.f289892d = view2.findViewById(com.p314xaae8f345.mm.R.id.a2x);
            view2.setTag(e1Var);
        } else {
            e1Var = (com.p314xaae8f345.mm.ui.e1) view.getTag();
            view2 = view;
        }
        n11.a.b().h(a1Var.f278646b, e1Var.f289889a, this.f289944h);
        e1Var.f289890b.setText(a1Var.f278647c);
        e1Var.f289891c.m81392x52cfa5c6(a1Var.f278648d);
        if (e1Var.f289891c.getTag() == null) {
            com.p314xaae8f345.mm.ui.d1 d1Var = new com.p314xaae8f345.mm.ui.d1(null);
            d1Var.f289853a = a1Var;
            d1Var.f289854b = this.f289943g;
            e1Var.f289891c.m81396xb3e0a10a(d1Var.f289855c);
            e1Var.f289891c.setTag(d1Var);
        } else {
            ((com.p314xaae8f345.mm.ui.d1) e1Var.f289891c.getTag()).f289853a = a1Var;
        }
        if (i17 == r2.size() - 1) {
            android.view.View view3 = e1Var.f289892d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = e1Var.f289892d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }
}
