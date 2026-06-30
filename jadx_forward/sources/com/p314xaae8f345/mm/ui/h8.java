package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 f290316d;

    public h8(com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54) {
        this.f290316d = activityC21387x976b8e54;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 h17 = this.f290316d.m78446x1cde66a9().f278294t.h(0);
        if (h17 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) h17).f288905o;
            int m80521xd9c5ba4b = viewOnTouchListenerC22366xcd5c2226.m80521xd9c5ba4b() + 16;
            if (viewOnTouchListenerC22366xcd5c2226.getFirstVisiblePosition() > m80521xd9c5ba4b) {
                viewOnTouchListenerC22366xcd5c2226.setSelection(m80521xd9c5ba4b);
            }
            viewOnTouchListenerC22366xcd5c2226.post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f3(viewOnTouchListenerC22366xcd5c2226));
        }
    }
}
