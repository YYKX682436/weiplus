package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class vb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.wb f288755d;

    public vb(com.p314xaae8f345.mm.ui.p2690x38b72420.wb wbVar) {
        this.f288755d = wbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.wb wbVar = this.f288755d;
        if (wbVar.f288773d.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            return;
        }
        wbVar.f288773d.moveTaskToBack(true);
    }
}
