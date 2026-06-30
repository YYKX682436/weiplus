package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileListView;", "Landroid/widget/ListView;", "Ln3/d0;", "", "enabled", "Ljz5/f0;", "setNestedScrollingEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileListView */
/* loaded from: classes14.dex */
public final class C16913x5b91e3b9 extends android.widget.ListView implements n3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final n3.f0 f236176d;

    public C16913x5b91e3b9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f236176d = new n3.f0(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.f236176d.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.f236176d.b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return this.f236176d.c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return this.f236176d.e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f236176d.h(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f236176d.f415867d;
    }

    @Override // n3.d0
    public void p(int i17) {
        this.f236176d.k(i17);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        this.f236176d.i(z17);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return this.f236176d.j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f236176d.k(0);
    }

    public C16913x5b91e3b9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f236176d = new n3.f0(this);
        setNestedScrollingEnabled(true);
    }
}
