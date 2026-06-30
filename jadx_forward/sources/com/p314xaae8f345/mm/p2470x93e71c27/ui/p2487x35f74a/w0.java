package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes4.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0 f272828d;

    public w0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0 y0Var) {
        this.f272828d = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0 y0Var = this.f272828d;
        android.view.View.OnLongClickListener onLongClickListener = y0Var.f272844q;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(y0Var.f272837g);
            y0Var.f272838h = true;
            y0Var.b();
        }
        android.view.View view = y0Var.f272837g;
        if (view == null || !view.isPressed()) {
            return;
        }
        y0Var.f272838h = true;
        y0Var.b();
    }
}
