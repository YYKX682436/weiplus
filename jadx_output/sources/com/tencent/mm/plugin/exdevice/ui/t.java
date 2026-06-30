package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public final class t extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f99662d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final o11.g f99663e;

    public t() {
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.drawable.c1o;
        this.f99663e = fVar.a();
    }

    public com.tencent.mm.plugin.exdevice.ui.u a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        for (com.tencent.mm.plugin.exdevice.ui.u uVar : this.f99662d) {
            if (str.equalsIgnoreCase(uVar.f99682b)) {
                return uVar;
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f99662d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.exdevice.ui.u) ((java.util.LinkedList) this.f99662d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.exdevice.ui.s sVar;
        com.tencent.mm.plugin.exdevice.ui.u uVar = (com.tencent.mm.plugin.exdevice.ui.u) ((java.util.LinkedList) this.f99662d).get(i17);
        if (view == null) {
            sVar = new com.tencent.mm.plugin.exdevice.ui.s(null);
            view2 = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.a9d, null);
            sVar.f99644a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.h5u);
            sVar.f99645b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k3h);
            view2.setTag(sVar);
        } else {
            view2 = view;
            sVar = (com.tencent.mm.plugin.exdevice.ui.s) view.getTag();
        }
        sVar.f99645b.setText(uVar.f99681a);
        n11.a.b().h(uVar.f99684d, sVar.f99644a, this.f99663e);
        return view2;
    }
}
