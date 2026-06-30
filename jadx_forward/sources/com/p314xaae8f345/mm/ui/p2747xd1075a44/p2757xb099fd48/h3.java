package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f293350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f293351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f293352f;

    public h3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        this.f293352f = z2Var;
        this.f293350d = charSequence;
        this.f293351e = charSequence2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f293352f;
        android.text.Layout layout = z2Var.f293602u.getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.MMHalfBottomDialog", "RightButton text too long, show updown mode!!", new java.lang.Object[0]);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2.a(z2Var, this.f293350d, this.f293351e);
    }
}
