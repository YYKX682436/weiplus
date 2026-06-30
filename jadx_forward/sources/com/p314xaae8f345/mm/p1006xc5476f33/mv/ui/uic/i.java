package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b f232729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q f232730e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar) {
        this.f232729d = bVar;
        this.f232730e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b bVar = this.f232729d;
        im3.j jVar = ((pm3.a) bVar.O6().f379621f).f438402f;
        if (jVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = jVar.f374237m;
            if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC15633xee433078, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem");
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078).f219979x);
                if (valueOf != null && valueOf.intValue() <= 2000) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar = this.f232730e;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(qVar.m158354x19263085());
                    u1Var.g(qVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574135h43));
                    u1Var.n(qVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                    u1Var.q(false);
                    yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            jVar.f374235h = !jVar.f374235h;
            bVar.O6().B3(new pm3.d(pm3.c.f438406f, jVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
