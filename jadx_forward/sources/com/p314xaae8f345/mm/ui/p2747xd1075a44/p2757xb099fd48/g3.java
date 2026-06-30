package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f293332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f293333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f293334f;

    public g3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        this.f293334f = z2Var;
        this.f293332d = charSequence;
        this.f293333e = charSequence2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f293334f;
        android.text.Layout layout = z2Var.f293601t.getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.MMHalfBottomDialog", "RightButton text too long, show updown mode!!", new java.lang.Object[0]);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2.a(z2Var, this.f293332d, this.f293333e);
    }
}
