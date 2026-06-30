package yw3;

/* loaded from: classes11.dex */
public final class h7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17164x1a40ce4c f548297d;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.ActivityC17164x1a40ce4c activityC17164x1a40ce4c) {
        this.f548297d = activityC17164x1a40ce4c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.LinkedList<bw5.sm0> linkedList;
        java.util.LinkedList linkedList2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((we0.c1) ((xe0.f0) i95.n0.c(xe0.f0.class))).getClass();
        if ((z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) && ai4.b0.f86658c) {
            java.util.Set set = si4.c.f489849c;
            bw5.um0 m117490x103247b8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8("", 0, -1, -1L);
            int size = (m117490x103247b8 == null || (linkedList2 = m117490x103247b8.f115520g) == null) ? 0 : linkedList2.size();
            if (m117490x103247b8 == null || (linkedList = m117490x103247b8.f115520g) == null) {
                i17 = 0;
            } else {
                i17 = 0;
                for (bw5.sm0 sm0Var : linkedList) {
                    if (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117479x7b98302c(sm0Var.m12979xca73e223(), sm0Var.f114592o).f115517d) {
                        i17++;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "debugClearAffDB: origin size=" + size + ", deleteCount=" + i17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27538xe183bdda.m117383x9cf0d20b().m117384x5deb0d53();
        }
        android.widget.Toast.makeText(this.f548297d.mo55332x76847179(), "done", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
