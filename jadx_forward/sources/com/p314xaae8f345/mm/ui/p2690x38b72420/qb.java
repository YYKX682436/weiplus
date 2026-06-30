package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.rb f288678d;

    public qb(com.p314xaae8f345.mm.ui.p2690x38b72420.rb rbVar) {
        this.f288678d = rbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.rb rbVar = this.f288678d;
        if (rbVar.f288694d.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            return;
        }
        rbVar.f288694d.moveTaskToBack(true);
    }
}
