package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class v1 extends com.tencent.mm.ui.contact.f5 {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String[] f72847n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f72848o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f72849p;

    public v1(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.ArrayList arrayList) {
        super(mMBaseSelectContactUI, null, true, 0);
        if (arrayList != null) {
            this.f72847n = com.tencent.mm.sdk.platformtools.t8.d1(arrayList);
        }
    }

    @Override // com.tencent.mm.ui.contact.f5, android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f72848o;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        if (!this.f72848o.moveToPosition(i17)) {
            return null;
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(this.f72848o);
        com.tencent.mm.ui.contact.item.u uVar = new com.tencent.mm.ui.contact.item.u(i17);
        uVar.f(z3Var);
        uVar.f206836e = true;
        return uVar;
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.p4
    public void k() {
        super.k();
        android.database.Cursor cursor = this.f72848o;
        if (cursor != null) {
            cursor.close();
            this.f72848o = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AASelectSearchContactItem", "doSearch: %s", str);
        h();
        this.f72849p = str;
        android.database.Cursor cursor = this.f72848o;
        if (cursor != null) {
            cursor.close();
            this.f72848o = null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f72849p) && this.f72847n != null) {
            gm0.j1.i();
            this.f72848o = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().V(this.f72847n, "@all.chatroom", this.f72849p, new java.util.LinkedList(), null);
        }
        notifyDataSetChanged();
        f(str, true);
    }
}
