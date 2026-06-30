package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class t implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f267355b;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c, android.content.Context context) {
        this.f267354a = viewOnClickListenerC19428xb021cc2c;
        this.f267355b = context;
    }

    @Override // z41.b
    public final void a(z41.a aVar, z41.a aVar2) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267354a;
        if (viewOnClickListenerC19428xb021cc2c.L) {
            int i18 = aVar2 == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.s.f267351a[aVar2.ordinal()];
            if (i18 == 1) {
                i17 = 0;
            } else if (i18 != 2) {
                return;
            } else {
                i17 = 8;
            }
            viewOnClickListenerC19428xb021cc2c.K = i17;
            android.content.Context context = this.f267355b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).setRequestedOrientation(viewOnClickListenerC19428xb021cc2c.K);
            int i19 = viewOnClickListenerC19428xb021cc2c.K;
            if (i19 == 0 || i19 == 8) {
                viewOnClickListenerC19428xb021cc2c.j();
            } else {
                viewOnClickListenerC19428xb021cc2c.k();
            }
        }
    }
}
