package y94;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y94.i f541891d;

    public d(y94.i iVar) {
        this.f541891d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$initThumbBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getInfo$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        y94.i iVar = this.f541891d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar = iVar.f541915n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getInfo$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        int i17 = (bVar != null ? bVar.f243915a : 0) * 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = iVar.f541914m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        if (c16993xacc19624 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("configProvider");
            throw null;
        }
        int i18 = c16993xacc19624.f237218w;
        ju3.d0 d0Var = iVar.f546865d;
        if (i17 > i18) {
            ju3.d0.k(d0Var, ju3.c0.S2, null, 2, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1991x4e5f73eb.C16999x1ee3168f z17 = iVar.z();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a = z17.recyclerThumbSeekBar.f230414p;
            if (c16543xabefc23a != null) {
                c16543xabefc23a.d();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            iVar.B();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
            ju3.d0.k(d0Var, ju3.c0.f383450y1, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$initThumbBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$2");
    }
}
