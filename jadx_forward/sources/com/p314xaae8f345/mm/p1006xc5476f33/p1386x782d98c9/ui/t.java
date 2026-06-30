package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public final class t extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f181195d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final o11.g f181196e;

    public t() {
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.c1o;
        this.f181196e = fVar.a();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u uVar : this.f181195d) {
            if (str.equalsIgnoreCase(uVar.f181215b)) {
                return uVar;
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f181195d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u) ((java.util.LinkedList) this.f181195d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u) ((java.util.LinkedList) this.f181195d).get(i17);
        if (view == null) {
            sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s(null);
            view2 = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a9d, null);
            sVar.f181177a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.h5u);
            sVar.f181178b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k3h);
            view2.setTag(sVar);
        } else {
            view2 = view;
            sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s) view.getTag();
        }
        sVar.f181178b.setText(uVar.f181214a);
        n11.a.b().h(uVar.f181217d, sVar.f181177a, this.f181196e);
        return view2;
    }
}
