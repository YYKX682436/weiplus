package td4;

/* loaded from: classes4.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ td4.g0 f499262d;

    public t(td4.g0 g0Var) {
        this.f499262d = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        td4.f2 f2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.g0 g0Var = this.f499262d;
        g0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.n6f);
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Number) tag).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            if (intValue >= g0Var.mo1894x7e414b06()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                f2Var = null;
            } else {
                td4.f2 f2Var2 = (td4.f2) g0Var.N().get(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                f2Var = f2Var2;
            }
            if (f2Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                int indexOf = g0Var.Q().indexOf(f2Var);
                boolean z17 = true;
                if (indexOf == -1) {
                    if (g0Var.Q().size() < g0Var.f499201g) {
                        g0Var.Q().add(f2Var);
                        g0Var.Q().size();
                        z17 = false;
                    }
                    g0Var.m8147xed6e4d18(intValue);
                } else if (indexOf != -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeSelectedItemWithNotifyChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    if (indexOf < 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeSelectedItemWithNotifyChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int size = g0Var.Q().size();
                        while (indexOf < size) {
                            int O = g0Var.O((td4.f2) g0Var.Q().get(indexOf));
                            if (O != -1) {
                                arrayList2.add(java.lang.Integer.valueOf(O));
                            }
                            indexOf++;
                        }
                        if (g0Var.Q().remove(f2Var) && !g0Var.Q().contains(f2Var)) {
                            java.util.Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                g0Var.m8147xed6e4d18(((java.lang.Number) it.next()).intValue());
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeSelectedItemWithNotifyChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    }
                    z17 = false;
                }
                if (z17) {
                    yz5.a aVar = g0Var.f499212u;
                    if (aVar != null) {
                        aVar.mo152xb9724478();
                    }
                } else {
                    td4.j jVar = g0Var.f499208q;
                    if (jVar != null) {
                        int size2 = g0Var.Q().size();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSelectItemChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$3");
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.I;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                        ((td4.j1) jVar).f499228a.l7(size2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectItemChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$3");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$select", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$2");
    }
}
