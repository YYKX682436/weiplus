package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.nj2 f105238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.j f105239e;

    public i(r45.nj2 nj2Var, com.tencent.mm.plugin.finder.drama.drawer.j jVar) {
        this.f105238d = nj2Var;
        this.f105239e = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$updateNativeDramaInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        r45.nj2 nj2Var = this.f105238d;
        intent.putExtra("finder_username", (nj2Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) nj2Var.getCustom(0)) == null) ? null : finderContact.getUsername());
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(this.f105239e.getContext(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$updateNativeDramaInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
