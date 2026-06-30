package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb f201498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f201499e;

    public ua(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb nbVar, android.view.View view) {
        this.f201498d = nbVar;
        this.f201499e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        this.f201498d.getClass();
        for (java.lang.Object context = this.f201499e.getContext(); context != null; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Dialog) {
                window = ((android.app.Dialog) context).getWindow();
                break;
            } else if (context instanceof android.app.Activity) {
                window = ((android.app.Activity) context).getWindow();
                break;
            } else {
                if (!(context instanceof android.content.ContextWrapper)) {
                    break;
                }
            }
        }
        window = null;
        if (window != null) {
            window.addFlags(8192);
        }
    }
}
