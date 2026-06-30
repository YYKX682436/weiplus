package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes10.dex */
public class u1 extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f72820n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f72821o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f72822p;

    public u1(com.tencent.mm.ui.contact.l4 l4Var, java.lang.String str, java.util.List list, java.util.List list2, boolean z17) {
        super(l4Var, null, true, true);
        this.f72821o = str;
        this.f72820n = list;
        this.f72822p = z17;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f72820n.size();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        java.lang.String str = (java.lang.String) this.f72820n.get(i17);
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        com.tencent.mm.plugin.aa.ui.j1 j1Var = new com.tencent.mm.plugin.aa.ui.j1(i17);
        java.lang.String str2 = this.f72821o;
        j1Var.f206849r = str2;
        j1Var.f(n17);
        j1Var.f206836e = true;
        j1Var.f206845n = java.lang.Boolean.valueOf(this.f72822p).booleanValue();
        j1Var.f206846o = java.lang.Boolean.valueOf(h61.o.o(str2, str)).booleanValue();
        return j1Var;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AASelectInitAdapter", "resetData");
        if (c01.e2.R(this.f72821o)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.List<java.lang.String> list = this.f72820n;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (java.lang.String str : list) {
                if (com.tencent.mm.storage.z3.m4(str)) {
                    arrayList.add(str);
                } else {
                    arrayList2.add(str);
                }
            }
            if (arrayList.size() > 0) {
                list.clear();
                list.addAll(arrayList2);
                list.addAll(arrayList);
            }
        }
    }
}
