package wh5;

/* loaded from: classes12.dex */
public final class l0 implements kg3.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 f527608d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams f527609e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f527608d = view;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.f527609e = layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams ? (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams) layoutParams : null;
    }

    @Override // kg3.o
    public void b(boolean z17) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams = this.f527609e;
        if (layoutParams == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 c16497x8d9d36e2 = this.f527608d;
        if (!z17) {
            c16497x8d9d36e2.setLayoutParams(layoutParams);
            return;
        }
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams2 = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams(layoutParams);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
        c16497x8d9d36e2.setLayoutParams(layoutParams2);
    }
}
