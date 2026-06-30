package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class sl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 f214594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 f214595e;

    public sl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 tagView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagView, "tagView");
        this.f214595e = c15352x8ed10a39;
        this.f214594d = tagView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderTagView$expandOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39 = this.f214594d;
        if (c15352x8ed10a39.isFolded) {
            java.util.Iterator it = c15352x8ed10a39.foldedView.iterator();
            while (it.hasNext()) {
                c15352x8ed10a39.m62411x5aa37cae().addView((android.view.View) it.next());
            }
            c15352x8ed10a39.foldedView.clear();
            c15352x8ed10a39.isFolded = false;
            c15352x8ed10a39.b();
            yz5.a aVar = c15352x8ed10a39.onExpandListener;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        this.f214595e.m62413xa8970480(1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderTagView$expandOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
