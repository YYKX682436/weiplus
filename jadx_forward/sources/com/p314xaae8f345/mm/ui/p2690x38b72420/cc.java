package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class cc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.dc f288180d;

    public cc(com.p314xaae8f345.mm.ui.p2690x38b72420.dc dcVar) {
        this.f288180d = dcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.dc dcVar = this.f288180d;
        if (dcVar.f288203d.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            return;
        }
        dcVar.f288203d.moveTaskToBack(true);
    }
}
