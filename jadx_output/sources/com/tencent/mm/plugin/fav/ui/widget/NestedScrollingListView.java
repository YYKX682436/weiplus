package com.tencent.mm.plugin.fav.ui.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/widget/NestedScrollingListView;", "Landroid/widget/ListView;", "Ln3/d0;", "", "enabled", "Ljz5/f0;", "setNestedScrollingEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class NestedScrollingListView extends android.widget.ListView implements n3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final n3.f0 f101586d;

    public NestedScrollingListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f101586d = new n3.f0(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.f101586d.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.f101586d.b(f17, f18);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f101586d.f334334d;
    }

    @Override // n3.d0
    public void p(int i17) {
        this.f101586d.k(i17);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        this.f101586d.i(z17);
    }

    public NestedScrollingListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f101586d = new n3.f0(this);
        setNestedScrollingEnabled(true);
    }
}
