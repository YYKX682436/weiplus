package vw3;

/* loaded from: classes5.dex */
public final class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUDRUI f522514d;

    public h6(com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI) {
        this.f522514d = repairerUDRUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI = this.f522514d;
        vw3.e6 e6Var = repairerUDRUI.e;
        if (e6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listAdapter");
            throw null;
        }
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).getClass();
        e6Var.f522475d = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w) com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.g().orElse(null);
        vw3.e6 e6Var2 = repairerUDRUI.e;
        if (e6Var2 != null) {
            e6Var2.notifyDataSetChanged();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listAdapter");
            throw null;
        }
    }
}
