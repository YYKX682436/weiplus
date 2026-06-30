package bu3;

/* loaded from: classes10.dex */
public final class j implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de f106140d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de c17001x433744de) {
        this.f106140d = c17001x433744de;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.view.View childAt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
        bu3.a aVar = (bu3.a) view;
        int m11315xfb85f7b0 = aVar.m11315xfb85f7b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de c17001x433744de = this.f106140d;
        if (m11315xfb85f7b0 == c17001x433744de.getSelectType()) {
            c17001x433744de.b(aVar.m11315xfb85f7b0());
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        view.announceForAccessibility(i65.a.r(aVar.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571493gp));
        c17001x433744de.m67921xb9b16058(aVar.m11315xfb85f7b0());
        c17001x433744de.b(aVar.m11315xfb85f7b0());
        int i18 = 0;
        for (java.lang.Object obj : c17001x433744de.m67916xf61bd335()) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (i18 == i17) {
                android.widget.GridView colorList = c17001x433744de.getColorList();
                android.view.View childAt2 = colorList != null ? colorList.getChildAt(i18) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                if (!((bu3.a) childAt2).f106116h) {
                    android.widget.GridView colorList2 = c17001x433744de.getColorList();
                    childAt = colorList2 != null ? colorList2.getChildAt(i18) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    ((bu3.a) childAt).m11319x62966993(true);
                }
            } else {
                android.widget.GridView colorList3 = c17001x433744de.getColorList();
                android.view.View childAt3 = colorList3 != null ? colorList3.getChildAt(i18) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt3, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                if (((bu3.a) childAt3).f106116h) {
                    android.widget.GridView colorList4 = c17001x433744de.getColorList();
                    childAt = colorList4 != null ? colorList4.getChildAt(i18) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    ((bu3.a) childAt).m11319x62966993(false);
                }
            }
            i18 = i19;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
