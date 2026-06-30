package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class p6 implements oc5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282800a;

    public p6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282800a = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // oc5.o
    public void a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 c5751x758c1063) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "handleCode callback notifyEvent: %d", java.lang.Integer.valueOf(c5751x758c1063.f136072g.f88701c));
        am.kl klVar = c5751x758c1063.f136072g;
        android.app.Activity activity = klVar.f88700b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282800a;
        if (activity != viewOnClickListenerC21748xb3d38e6b || !klVar.f88699a.equals(viewOnClickListenerC21748xb3d38e6b.f282199v2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "handleCode callback not the same");
            return;
        }
        int i17 = klVar.f88701c;
        oc5.d dVar = viewOnClickListenerC21748xb3d38e6b.f282124a3;
        if (i17 == 0 || i17 == 1 || i17 == 2) {
            dVar.a(2);
            if (viewOnClickListenerC21748xb3d38e6b.f282180p1 == null) {
                viewOnClickListenerC21748xb3d38e6b.f282180p1 = viewOnClickListenerC21748xb3d38e6b.findViewById(com.p314xaae8f345.mm.R.id.f568266ma3);
            }
            viewOnClickListenerC21748xb3d38e6b.h9(viewOnClickListenerC21748xb3d38e6b.f282180p1, 8);
            viewOnClickListenerC21748xb3d38e6b.f282199v2 = null;
            return;
        }
        if (i17 != 3) {
            return;
        }
        android.os.Bundle bundle = klVar.f88702d;
        dVar.a(bundle != null ? bundle.getBoolean("key_scan_qr_code_result", true) : true ? 1 : 2);
        viewOnClickListenerC21748xb3d38e6b.f282199v2 = null;
        viewOnClickListenerC21748xb3d38e6b.m81179x83e1199b();
    }
}
