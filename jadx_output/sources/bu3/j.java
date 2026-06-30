package bu3;

/* loaded from: classes10.dex */
public final class j implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin f24607d;

    public j(com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin photoDoodlePlugin) {
        this.f24607d = photoDoodlePlugin;
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
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
        bu3.a aVar = (bu3.a) view;
        int type = aVar.getType();
        com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin photoDoodlePlugin = this.f24607d;
        if (type == photoDoodlePlugin.getSelectType()) {
            photoDoodlePlugin.b(aVar.getType());
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        view.announceForAccessibility(i65.a.r(aVar.getContext(), com.tencent.mm.R.string.f489960gp));
        photoDoodlePlugin.setSelectType(aVar.getType());
        photoDoodlePlugin.b(aVar.getType());
        int i18 = 0;
        for (java.lang.Object obj : photoDoodlePlugin.getResourceArray()) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (i18 == i17) {
                android.widget.GridView colorList = photoDoodlePlugin.getColorList();
                android.view.View childAt2 = colorList != null ? colorList.getChildAt(i18) : null;
                kotlin.jvm.internal.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                if (!((bu3.a) childAt2).f24583h) {
                    android.widget.GridView colorList2 = photoDoodlePlugin.getColorList();
                    childAt = colorList2 != null ? colorList2.getChildAt(i18) : null;
                    kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    ((bu3.a) childAt).setHasSelected(true);
                }
            } else {
                android.widget.GridView colorList3 = photoDoodlePlugin.getColorList();
                android.view.View childAt3 = colorList3 != null ? colorList3.getChildAt(i18) : null;
                kotlin.jvm.internal.o.e(childAt3, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                if (((bu3.a) childAt3).f24583h) {
                    android.widget.GridView colorList4 = photoDoodlePlugin.getColorList();
                    childAt = colorList4 != null ? colorList4.getChildAt(i18) : null;
                    kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    ((bu3.a) childAt).setHasSelected(false);
                }
            }
            i18 = i19;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$initView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
