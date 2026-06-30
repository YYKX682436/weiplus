package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class k5 implements db5.x7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282677a;

    public k5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282677a = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // db5.x7
    public boolean a(android.view.MotionEvent motionEvent) {
        sy3.c cVar = this.f282677a.f282172n3;
        if (cVar != null) {
            return ((kz3.l) cVar).e(motionEvent);
        }
        return false;
    }
}
