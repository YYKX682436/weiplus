package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.fb f288225d;

    public eb(com.p314xaae8f345.mm.ui.p2690x38b72420.fb fbVar) {
        this.f288225d = fbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.fb fbVar = this.f288225d;
        if (fbVar.f288243d.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            return;
        }
        fbVar.f288243d.moveTaskToBack(true);
    }
}
