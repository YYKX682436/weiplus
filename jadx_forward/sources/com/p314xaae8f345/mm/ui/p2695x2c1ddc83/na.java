package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class na implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa f289439d;

    public na(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa paVar) {
        this.f289439d = paVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa paVar = this.f289439d;
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54 = (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) paVar.f289502d;
        if (activityC21387x976b8e54 == null || activityC21387x976b8e54.f7().f278458e == 0) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = paVar.f289504f;
            int m80521xd9c5ba4b = viewOnTouchListenerC22366xcd5c2226.m80521xd9c5ba4b() + 16;
            if (viewOnTouchListenerC22366xcd5c2226.getFirstVisiblePosition() > m80521xd9c5ba4b) {
                viewOnTouchListenerC22366xcd5c2226.setSelection(m80521xd9c5ba4b);
            }
            viewOnTouchListenerC22366xcd5c2226.post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f3(viewOnTouchListenerC22366xcd5c2226));
        }
    }
}
