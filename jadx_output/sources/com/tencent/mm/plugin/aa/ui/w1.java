package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class w1 extends com.tencent.mm.ui.contact.f5 {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String[] f72865n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f72866o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f72867p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f72868q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f72869r;

    public w1(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.lang.String str, java.util.List list, java.util.List list2, boolean z17) {
        super(mMBaseSelectContactUI, null, true, 0);
        this.f72867p = str;
        this.f72869r = z17;
        if (list != null) {
            this.f72865n = com.tencent.mm.sdk.platformtools.t8.d1(list);
        }
    }

    @Override // com.tencent.mm.ui.contact.f5, android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f72866o;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        if (!this.f72866o.moveToPosition(i17)) {
            return null;
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(this.f72866o);
        com.tencent.mm.ui.contact.item.u uVar = new com.tencent.mm.ui.contact.item.u(i17);
        uVar.f(z3Var);
        uVar.f206836e = true;
        uVar.f206842k = true;
        if (com.tencent.mm.storage.z3.m4(z3Var.d1()) || com.tencent.mm.storage.z3.p4(z3Var.d1())) {
            uVar.f206841j = true;
        }
        uVar.f206845n = java.lang.Boolean.valueOf(this.f72869r).booleanValue();
        uVar.f206846o = java.lang.Boolean.valueOf(h61.o.o(this.f72867p, z3Var.d1())).booleanValue();
        return uVar;
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.p4
    public void k() {
        super.k();
        android.database.Cursor cursor = this.f72866o;
        if (cursor != null) {
            cursor.close();
            this.f72866o = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AASelectSearchContactItem", "doSearch: %s", str);
        h();
        this.f72868q = str;
        android.database.Cursor cursor = this.f72866o;
        if (cursor != null) {
            cursor.close();
            this.f72866o = null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f72868q) && this.f72865n != null) {
            gm0.j1.i();
            this.f72866o = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().V(this.f72865n, "@all.chatroom", this.f72868q, new java.util.LinkedList(), null);
        }
        notifyDataSetChanged();
        f(str, true);
    }
}
