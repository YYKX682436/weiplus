package ss1;

/* loaded from: classes15.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 f493436d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 c13025x6878a547, int i17, ss1.e eVar) {
        this.f493436d = c13025x6878a547;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/widget/MPCollapseTextLayout$processContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 c13025x6878a547 = this.f493436d;
        if (c13025x6878a547.f176119e) {
            c13025x6878a547.a(c13025x6878a547.f176121g);
            c13025x6878a547.b(c13025x6878a547.f176134w);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = c13025x6878a547.f176123i;
            if (c22624x85d69039 != null) {
                c22624x85d69039.m84175x8dd5167d(Integer.MAX_VALUE);
            }
            android.widget.TextView textView = c13025x6878a547.f176124m;
            if (textView != null) {
                textView.setMaxLines(Integer.MAX_VALUE);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = c13025x6878a547.f176123i;
            ks5.a i17 = c22624x85d690392 != null ? c22624x85d690392.i(c13025x6878a547.f176134w, Integer.MAX_VALUE) : null;
            c13025x6878a547.d(i17, c13025x6878a547.f176134w, i17 != null ? ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) i17).L : 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/widget/MPCollapseTextLayout$processContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
