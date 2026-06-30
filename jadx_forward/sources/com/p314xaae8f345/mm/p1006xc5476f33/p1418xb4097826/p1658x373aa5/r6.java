package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class r6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214464d;

    public r6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f214464d = c15270x6d877a34;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214464d;
        java.lang.String str = c15270x6d877a34.getPostContent().f214412b;
        if (str != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("nowUrl", str);
            intent.putExtra("urlList", new java.lang.String[]{str});
            intent.putExtra("ShowIndicator", false);
            intent.putExtra("BottomSheetStyle", 0);
            intent.putExtra("shouldRunDragAnimation", true);
            intent.putExtra("showmenu", false);
            intent.putExtra("showGifAsPic", true);
            intent.putExtra("KEY_FINDER_OPEN_CONTEXT_HASH", c15270x6d877a34.getContext().hashCode());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).cl(zy2.z5.f559172d, true);
            j45.l.j(c15270x6d877a34.getContext(), "subapp", ".ui.gallery.GestureGalleryUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
