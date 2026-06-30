package pr1;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 f439469d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1) {
        this.f439469d = viewOnCreateContextMenuListenerC12986xffd38cd1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = this.f439469d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd1.m79354xfb82a219() == 1) {
            viewOnCreateContextMenuListenerC12986xffd38cd1.m79359x764d6925(0);
            viewOnCreateContextMenuListenerC12986xffd38cd1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1.g(viewOnCreateContextMenuListenerC12986xffd38cd1, viewOnCreateContextMenuListenerC12986xffd38cd1.f175582t.a(viewOnCreateContextMenuListenerC12986xffd38cd1.f175583u)));
            viewOnCreateContextMenuListenerC12986xffd38cd1.m79359x764d6925(1);
        } else {
            viewOnCreateContextMenuListenerC12986xffd38cd1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1.g(viewOnCreateContextMenuListenerC12986xffd38cd1, viewOnCreateContextMenuListenerC12986xffd38cd1.f175582t.a(viewOnCreateContextMenuListenerC12986xffd38cd1.f175583u)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1.h(viewOnCreateContextMenuListenerC12986xffd38cd1);
        viewOnCreateContextMenuListenerC12986xffd38cd1.E = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = viewOnCreateContextMenuListenerC12986xffd38cd1.D;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        viewOnCreateContextMenuListenerC12986xffd38cd1.D.dismiss();
        viewOnCreateContextMenuListenerC12986xffd38cd1.D.setCancelMessage(null);
        viewOnCreateContextMenuListenerC12986xffd38cd1.D.setDismissMessage(null);
    }
}
