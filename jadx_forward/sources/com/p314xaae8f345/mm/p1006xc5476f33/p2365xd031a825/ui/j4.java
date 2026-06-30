package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class j4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public int f261888d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f261889e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public vr4.l0 f261890f = null;

    /* renamed from: g, reason: collision with root package name */
    public final at4.o0 f261891g = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i4(this);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m4 f261892h;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m4 m4Var) {
        this.f261892h = m4Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f261889e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f261889e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l4 l4Var;
        android.view.View view2;
        vr4.j jVar;
        int i18;
        java.util.LinkedList linkedList;
        if (view == null) {
            view2 = this.f261892h.f262023d.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d66, viewGroup, false);
            l4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l4();
            l4Var.f261935a = view2.findViewById(com.p314xaae8f345.mm.R.id.pbu);
            l4Var.f261937c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pbt);
            l4Var.f261938d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pbs);
            l4Var.f261939e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pbr);
            l4Var.f261940f = (android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.pbq);
            l4Var.f261936b = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.pbp);
            view2.setTag(l4Var);
        } else {
            l4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l4) view.getTag();
            view2 = view;
        }
        vr4.i1 i1Var = (vr4.i1) getItem(i17);
        int i19 = this.f261888d;
        if (i17 != i19 || i19 <= 0) {
            android.view.View view3 = l4Var.f261935a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$CouponListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$CouponListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l4Var.f261936b.setVisibility(0);
        } else {
            android.view.View view4 = l4Var.f261935a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$CouponListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$CouponListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l4Var.f261936b.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f521272i)) {
            l4Var.f261937c.setVisibility(8);
        } else {
            l4Var.f261937c.setText(i1Var.f521272i);
            l4Var.f261937c.setVisibility(0);
        }
        java.lang.String str = i1Var.f521271h;
        vr4.l0 l0Var = this.f261890f;
        if (l0Var != null && (linkedList = l0Var.f521309g) != null) {
            for (int i27 = 0; i27 < linkedList.size(); i27++) {
                if (str.equals(((vr4.j) linkedList.get(i27)).f521283d)) {
                    jVar = (vr4.j) linkedList.get(i27);
                    break;
                }
            }
        }
        jVar = null;
        java.lang.String str2 = i1Var.f521274n;
        java.lang.String str3 = i1Var.f521275o;
        if (jVar != null) {
            str2 = jVar.f521284e;
            str3 = jVar.f521285f;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            i18 = 8;
            l4Var.f261938d.setVisibility(8);
        } else {
            l4Var.f261938d.setText(str2);
            l4Var.f261938d.setVisibility(0);
            i18 = 8;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            l4Var.f261939e.setVisibility(i18);
        } else {
            l4Var.f261939e.setText(str3);
            l4Var.f261939e.setVisibility(0);
        }
        at4.m0 m0Var = ((at4.n0) this.f261891g.f95444c.get(i17)).f95438b;
        if (m0Var == at4.m0.DISABLED) {
            l4Var.f261940f.setChecked(false);
            l4Var.f261940f.setEnabled(false);
        } else {
            l4Var.f261940f.setEnabled(true);
            if (m0Var == at4.m0.CHECKED) {
                l4Var.f261940f.setChecked(true);
            } else {
                l4Var.f261940f.setChecked(false);
            }
        }
        return view2;
    }
}
