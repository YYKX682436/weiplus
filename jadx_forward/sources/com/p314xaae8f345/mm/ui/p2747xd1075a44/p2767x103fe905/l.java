package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905;

/* loaded from: classes10.dex */
public class l implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 f294013a;

    public l(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 c22721xaf9ba7f3) {
        this.f294013a = c22721xaf9ba7f3;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 c22721xaf9ba7f3 = this.f294013a;
        c22721xaf9ba7f3.removeAllViews();
        java.util.Queue queue = c22721xaf9ba7f3.f293992d;
        if (!queue.isEmpty() && (hVar = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n) ((java.util.LinkedList) queue).poll()).f294020e) != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.f294010a = false;
            hVar.mo50890xc39a57c1();
        }
        if (queue.isEmpty()) {
            c22721xaf9ba7f3.setVisibility(8);
        } else {
            c22721xaf9ba7f3.b((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n) ((java.util.LinkedList) queue).peek(), false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 c22721xaf9ba7f3 = this.f294013a;
        if (c22721xaf9ba7f3.f293992d.isEmpty()) {
            return;
        }
        java.util.Queue queue = c22721xaf9ba7f3.f293992d;
        if (((java.util.LinkedList) queue).peek() == null || ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n) ((java.util.LinkedList) queue).peek()).f294020e == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.f294010a = false;
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n) ((java.util.LinkedList) queue).peek()).f294020e.a();
    }
}
