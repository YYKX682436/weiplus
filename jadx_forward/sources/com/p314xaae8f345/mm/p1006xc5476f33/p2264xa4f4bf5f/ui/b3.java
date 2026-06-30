package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class b3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 f255278d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 c18619x86b32cd1) {
        this.f255278d = c18619x86b32cd1;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.ipp);
        fj4.a aVar = tag instanceof fj4.a ? (fj4.a) tag : null;
        if (aVar == null) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1 c18619x86b32cd1 = this.f255278d;
        android.app.Activity mo7438x76847179 = c18619x86b32cd1.mo7438x76847179();
        if (mo7438x76847179 == null) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        android.view.LayoutInflater.from(mo7438x76847179);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo7438x76847179, 1, false);
        db5.g4 g4Var = new db5.g4(mo7438x76847179);
        new db5.g4(mo7438x76847179);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.z2 z2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.z2.f256004d;
        mj4.h hVar = aVar.f344757e;
        if (hVar == null) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a3 a3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a3(c18619x86b32cd1, mo7438x76847179, ((mj4.k) hVar).l());
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(mo7438x76847179);
        z2Var.mo887xc459429a(g4Var2);
        if (g4Var2.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f293405n = z2Var;
            k0Var.f293414s = a3Var;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
