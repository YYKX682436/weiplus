package rf4;

/* loaded from: classes4.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f f476641d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f) {
        this.f476641d = c18482x82fd8d8f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f = this.f476641d;
        if (!c18482x82fd8d8f.f253500s.f372772g.isEmpty()) {
            if (c18482x82fd8d8f.f253502u == 3) {
                c18482x82fd8d8f.f(2);
                mf4.d.f407693a.a(1);
            } else {
                c18482x82fd8d8f.f(3);
                mf4.d dVar = mf4.d.f407693a;
                dVar.a(2);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6935x89ce03dd c6935x89ce03dd = mf4.d.f407694b;
                c6935x89ce03dd.f142449d = 4L;
                c6935x89ce03dd.f142450e = c6935x89ce03dd.b("StoryId", java.lang.String.valueOf(c18482x82fd8d8f.f253501t), true);
                dVar.b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
