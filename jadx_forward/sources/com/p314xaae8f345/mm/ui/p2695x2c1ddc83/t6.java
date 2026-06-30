package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class t6 implements ul5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d f289612a;

    public t6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d) {
        this.f289612a = c22376x88ed722d;
    }

    @Override // ul5.b
    public boolean a() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = this.f289612a;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = c22376x88ed722d.f288905o;
        android.view.View childAt = viewOnTouchListenerC22366xcd5c2226.getChildAt(viewOnTouchListenerC22366xcd5c2226.getChildCount() - 1);
        return childAt != null && childAt.getBottom() <= c22376x88ed722d.f288905o.getHeight() && (c22376x88ed722d.f288905o.getLastVisiblePosition() == c22376x88ed722d.f288905o.getAdapter().getCount() - 1 || childAt.getId() == com.p314xaae8f345.mm.R.id.bp9);
    }
}
