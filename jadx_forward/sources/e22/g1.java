package e22;

/* loaded from: classes10.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 f328188d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 activityC13339x8f3095f9) {
        this.f328188d = activityC13339x8f3095f9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        oa.i k17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clicked the title of gallery tab, selectedTabPosition: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 activityC13339x8f3095f9 = this.f328188d;
        sb6.append(activityC13339x8f3095f9.X6().m20352xe06bcb0d());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEmojiMediaPickerUI", sb6.toString());
        boolean z17 = false;
        if (activityC13339x8f3095f9.X6().m20352xe06bcb0d() == 0) {
            e33.f2 f2Var = activityC13339x8f3095f9.f179677f;
            if (f2Var != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) f2Var).f220073r.f220098m) {
                z17 = true;
            }
            if (z17) {
                activityC13339x8f3095f9.W6().a();
            } else {
                activityC13339x8f3095f9.W6().f179686e.animate().rotation(180.0f).setDuration(300L).start();
            }
            e33.f2 f2Var2 = activityC13339x8f3095f9.f179677f;
            if (f2Var2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) f2Var2).f220073r.d();
            }
        } else if (activityC13339x8f3095f9.c7(0) && (k17 = activityC13339x8f3095f9.X6().k(0)) != null) {
            k17.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
