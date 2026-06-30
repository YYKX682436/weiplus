package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class rl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl f211317d;

    public rl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl slVar) {
        this.f211317d = slVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/MaasAlbumTemplateHelper$setupClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        vy0.g gVar = vy0.g.f522947a;
        boolean a17 = gVar.a("scene_finder_v2");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl slVar = this.f211317d;
        if (a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d activityC15010xb447a21d = slVar.f211353a;
            activityC15010xb447a21d.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(activityC15010xb447a21d.f220061m.f328664g);
            if (!arrayList2.isEmpty()) {
                ut3.f.f512709c.f512710a = activityC15010xb447a21d;
                activityC15010xb447a21d.g8(arrayList2);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/MaasAlbumTemplateHelper$setupClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        boolean z17 = gVar.b().getBoolean("scene_finder_v2".concat("_requested"), false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasPermissionCheckHelp", "hasRequested for scene_finder_v2, hasRequestes: " + z17);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasAlbumTemplateHelper", "requested maas permission and denied");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl.a(slVar, true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sl.b(slVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/MaasAlbumTemplateHelper$setupClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
