package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a f292143d;

    public o(com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a) {
        this.f292143d = c22496x54525e2a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a = this.f292143d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = c22496x54525e2a.f291495e;
        if (actionBarEditText == null) {
            return;
        }
        actionBarEditText.requestFocus();
        if (c22496x54525e2a.hasWindowFocus()) {
            c22496x54525e2a.l();
        } else {
            c22496x54525e2a.getViewTreeObserver().addOnWindowFocusChangeListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.n(this));
        }
    }
}
