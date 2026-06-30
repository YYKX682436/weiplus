package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes10.dex */
public class t1 extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f72806n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f72807o;

    public t1(com.tencent.mm.ui.contact.l4 l4Var, java.util.ArrayList arrayList) {
        super(l4Var, null, true, true);
        this.f72807o = arrayList;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f72806n).size();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f72806n).get(i17);
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null && com.tencent.mm.sdk.platformtools.t8.K0(n17.d1())) {
            n17.X1(str);
        }
        com.tencent.mm.plugin.aa.ui.j1 j1Var = new com.tencent.mm.plugin.aa.ui.j1(i17);
        j1Var.f(n17);
        j1Var.f206836e = true;
        return j1Var;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AASelectInitAdapter", "resetData");
        if (this.f72806n == null) {
            this.f72806n = new java.util.ArrayList();
        }
        this.f72806n.clear();
        java.util.Iterator it = this.f72807o.iterator();
        while (it.hasNext()) {
            this.f72806n.add((java.lang.String) it.next());
        }
    }
}
