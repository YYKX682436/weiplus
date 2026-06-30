package gp4;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355971d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        this.f355971d = c18801xf3fcf614;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355971d;
        c18801xf3fcf614.q(c18801xf3fcf614.f257497y, false);
        yz5.l timeEditMenuChangeListener = c18801xf3fcf614.getTimeEditMenuChangeListener();
        if (timeEditMenuChangeListener != null) {
            timeEditMenuChangeListener.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
