package e22;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520 f328149d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520 activityC13334x22686520) {
        this.f328149d = activityC13334x22686520;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/picker/EmojiMediaPickerUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clicked the title of gallery tab, selectedTabPosition: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520 activityC13334x22686520 = this.f328149d;
        sb6.append(activityC13334x22686520.X6().m20352xe06bcb0d());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAlbumPickerUI", sb6.toString());
        boolean z17 = false;
        if (activityC13334x22686520.X6().m20352xe06bcb0d() == 0) {
            e33.f2 f2Var = activityC13334x22686520.f179677f;
            if (f2Var != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) f2Var).f220073r.f220098m) {
                z17 = true;
            }
            if (z17) {
                activityC13334x22686520.W6().a();
            } else {
                activityC13334x22686520.W6().f179686e.animate().rotation(180.0f).setDuration(300L).start();
            }
            e33.f2 f2Var2 = activityC13334x22686520.f179677f;
            if (f2Var2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) f2Var2).f220073r.d();
            }
        } else {
            oa.i k17 = activityC13334x22686520.X6().k(0);
            if (k17 != null) {
                k17.b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/picker/EmojiMediaPickerUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
