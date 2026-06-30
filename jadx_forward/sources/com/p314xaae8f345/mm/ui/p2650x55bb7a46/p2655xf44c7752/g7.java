package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 f282491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.AnonymousClass62 f282492e;

    public g7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.AnonymousClass62 anonymousClass62, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
        this.f282492e = anonymousClass62;
        this.f282491d = c5974x1d8a7409;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.this.J2 == this.f282491d.f136272g.f87933a) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.this.y7(false);
            am.ct ctVar = this.f282491d.f136272g;
            if (ctVar.f87935c) {
                if (com.p314xaae8f345.mm.vfs.w6.j(ctVar.f87936d)) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.this.f282144g;
                    if (k1Var != null) {
                        k1Var.R(k1Var.w(), true, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.this.O3);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.this;
                        viewOnClickListenerC21748xb3d38e6b.h7(viewOnClickListenerC21748xb3d38e6b.f282144g.w(), true);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "adapter is null, fail to set translate status.");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryUI", "trans result path %s not exist!", this.f282491d.f136272g.f87936d);
                }
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.this.J2 = 0;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.this;
            db5.e1.G(viewOnClickListenerC21748xb3d38e6b2, viewOnClickListenerC21748xb3d38e6b2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iaw), "", false, null);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.this.f282124a3.a(2);
        }
    }
}
