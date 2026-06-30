package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a f293583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f293584e;

    public z(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar) {
        this.f293584e = j0Var;
        this.f293583d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f293584e;
        android.text.Layout layout = j0Var.f293363h.getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.MMAlertDialog", "NegativeButton text too long, show updown mode!!", new java.lang.Object[0]);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0.c(j0Var, this.f293583d);
    }
}
