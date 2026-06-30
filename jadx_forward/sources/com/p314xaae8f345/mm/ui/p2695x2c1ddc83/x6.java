package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class x6 implements ih5.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d f289766d;

    public x6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d) {
        this.f289766d = c22376x88ed722d;
    }

    @Override // ih5.d
    /* renamed from: onFragmentVisibilityChanged */
    public void mo78675x611401b3(boolean z17) {
        if (this.f289766d.f288905o != null) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288826d.getClass();
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288836q.set(z17);
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p6(this, z17));
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289766d.f288905o;
            if (viewOnTouchListenerC22366xcd5c2226.f288844J) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "onFragmentVisibilityChanged visible: %b", java.lang.Boolean.valueOf(z17));
                viewOnTouchListenerC22366xcd5c2226.y();
            }
        }
    }
}
