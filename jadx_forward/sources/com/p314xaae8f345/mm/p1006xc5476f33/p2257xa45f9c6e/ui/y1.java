package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes7.dex */
public class y1 implements ft.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f254292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f254293b;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3, int i17) {
        this.f254292a = null;
        this.f254293b = 0;
        this.f254292a = new java.lang.ref.WeakReference(c18557xc00aa3f3);
        this.f254293b = i17;
    }

    public void a(final boolean z17, final boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "stopLoading");
        java.lang.ref.WeakReference weakReference = this.f254292a;
        final com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) weakReference.get() : null;
        if (c18557xc00aa3f3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TaskBarView", "stopLoading view is recycle");
            return;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
        final int i17 = this.f254293b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "ljd stopLoading refreshImmediately:%b, dataCanUpdated:%b, dataRefreshType:%d", valueOf, valueOf2, java.lang.Integer.valueOf(i17));
        c18557xc00aa3f3.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarView$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f32 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.this;
                rh4.m mVar = c18557xc00aa3f32.f254066m2;
                if (mVar != null) {
                    mVar.u();
                }
                boolean z19 = z17;
                c18557xc00aa3f32.H2 = z19;
                c18557xc00aa3f32.I2 = false;
                int i18 = i17;
                c18557xc00aa3f32.J2 = i18;
                if (z19) {
                    c18557xc00aa3f32.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.h1(c18557xc00aa3f32, i18), 1000L);
                } else if (z18) {
                    c18557xc00aa3f32.I2 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "need update common data after header close");
                }
            }
        });
    }
}
