package bu3;

/* loaded from: classes10.dex */
public final class e implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bu3.f f24593d;

    public e(bu3.f fVar) {
        this.f24593d = fVar;
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
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
        bu3.a aVar = (bu3.a) view;
        int type = aVar.getType();
        bu3.f fVar = this.f24593d;
        if (type == fVar.f24599i) {
            fVar.a(aVar.getType());
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        fVar.f24599i = aVar.getType();
        fVar.a(aVar.getType());
        int i18 = 0;
        for (java.lang.Object obj : fVar.f24595e) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (i18 == i17) {
                android.widget.GridView gridView = fVar.f24598h;
                android.view.View childAt2 = gridView != null ? gridView.getChildAt(i18) : null;
                kotlin.jvm.internal.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                if (!((bu3.a) childAt2).f24583h) {
                    android.widget.GridView gridView2 = fVar.f24598h;
                    childAt = gridView2 != null ? gridView2.getChildAt(i18) : null;
                    kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    ((bu3.a) childAt).setHasSelected(true);
                }
            } else {
                android.widget.GridView gridView3 = fVar.f24598h;
                android.view.View childAt3 = gridView3 != null ? gridView3.getChildAt(i18) : null;
                kotlin.jvm.internal.o.e(childAt3, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                if (((bu3.a) childAt3).f24583h) {
                    android.widget.GridView gridView4 = fVar.f24598h;
                    childAt = gridView4 != null ? gridView4.getChildAt(i18) : null;
                    kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    ((bu3.a) childAt).setHasSelected(false);
                }
            }
            i18 = i19;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
