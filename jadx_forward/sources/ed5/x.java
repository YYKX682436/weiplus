package ed5;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21833xd4015cd6 f332936d;

    public x(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21833xd4015cd6 c21833xd4015cd6) {
        this.f332936d = c21833xd4015cd6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTypeFilterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21833xd4015cd6 c21833xd4015cd6 = this.f332936d;
        if (c21833xd4015cd6.f283355i) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTypeFilterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        c21833xd4015cd6.f283355i = true;
        c21833xd4015cd6.m79750x2fe4b3b(true ^ c21833xd4015cd6.isExpanded);
        ed5.y onFilterClickListener = c21833xd4015cd6.getOnFilterClickListener();
        if (onFilterClickListener != null) {
            boolean z17 = c21833xd4015cd6.isExpanded;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a3 = ((vc5.c) onFilterClickListener).f516847a;
            if (z17) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3.b(c21816x74d192a3).f334519r = new vc5.b(c21816x74d192a3);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3.b(c21816x74d192a3).show();
            } else {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3.b(c21816x74d192a3).dismiss();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTypeFilterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
