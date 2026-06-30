package bu3;

/* loaded from: classes10.dex */
public final class e implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bu3.f f106126d;

    public e(bu3.f fVar) {
        this.f106126d = fVar;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
        bu3.a aVar = (bu3.a) view;
        int m11315xfb85f7b0 = aVar.m11315xfb85f7b0();
        bu3.f fVar = this.f106126d;
        if (m11315xfb85f7b0 == fVar.f106132i) {
            fVar.a(aVar.m11315xfb85f7b0());
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        fVar.f106132i = aVar.m11315xfb85f7b0();
        fVar.a(aVar.m11315xfb85f7b0());
        int i18 = 0;
        for (java.lang.Object obj : fVar.f106128e) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (i18 == i17) {
                android.widget.GridView gridView = fVar.f106131h;
                android.view.View childAt2 = gridView != null ? gridView.getChildAt(i18) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                if (!((bu3.a) childAt2).f106116h) {
                    android.widget.GridView gridView2 = fVar.f106131h;
                    childAt = gridView2 != null ? gridView2.getChildAt(i18) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    ((bu3.a) childAt).m11319x62966993(true);
                }
            } else {
                android.widget.GridView gridView3 = fVar.f106131h;
                android.view.View childAt3 = gridView3 != null ? gridView3.getChildAt(i18) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt3, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                if (((bu3.a) childAt3).f106116h) {
                    android.widget.GridView gridView4 = fVar.f106131h;
                    childAt = gridView4 != null ? gridView4.getChildAt(i18) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                    ((bu3.a) childAt).m11319x62966993(false);
                }
            }
            i18 = i19;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
