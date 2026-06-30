package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class h implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.i f111369d;

    public h(com.tencent.mm.plugin.finder.gallery.i iVar) {
        this.f111369d = iVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.finder.gallery.i0 i0Var;
        com.tencent.mm.plugin.finder.gallery.i iVar = this.f111369d;
        iVar.f111380j.a(i17);
        com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment mMFinderFragment = (com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment) kz5.n0.a0(iVar.f111378h, i17);
        if (mMFinderFragment != null) {
            mMFinderFragment.o0();
        }
        if (mMFinderFragment == null) {
            com.tencent.mars.xlog.Log.e(iVar.f111374d, "onPageSelected position:" + i17 + ", size:" + iVar.f111378h.size());
        }
        if (iVar.f111382l != -1) {
            com.tencent.mm.plugin.finder.gallery.b0 b0Var = com.tencent.mm.plugin.finder.gallery.b0.f111350a;
            com.tencent.mm.plugin.finder.gallery.j0 j0Var = (com.tencent.mm.plugin.finder.gallery.j0) kz5.n0.a0(iVar.f111376f, i17);
            int i18 = (j0Var == null || (i0Var = j0Var.f111386d) == null) ? 0 : i0Var.f111383a;
            com.tencent.mm.plugin.finder.gallery.b0.f111353d = b0Var.b(i18);
            com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
            finderPickerDataReportStruct.q(com.tencent.mm.plugin.finder.gallery.b0.f111351b);
            finderPickerDataReportStruct.f57492e = com.tencent.mm.plugin.finder.gallery.b0.f111352c;
            finderPickerDataReportStruct.f57493f = 2L;
            finderPickerDataReportStruct.p(b0Var.a(i18));
            finderPickerDataReportStruct.f57495h = com.tencent.mm.plugin.finder.gallery.b0.f111353d;
            finderPickerDataReportStruct.s("");
            finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
            finderPickerDataReportStruct.k();
            b0Var.h(finderPickerDataReportStruct);
        }
        iVar.f111382l = i17;
    }
}
