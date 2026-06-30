package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class v0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.w0 f235671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p670x38b72420.o f235672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 f235673c;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.w0 w0Var, com.p314xaae8f345.mm.p670x38b72420.o oVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9) {
        this.f235671a = w0Var;
        this.f235672b = oVar;
        this.f235673c = c19645x574159e9;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    public void a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.requestFocus();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f235671a.m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo26063x7b383410();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    public void b() {
        c01.e2.e0(((yq3.v) this.f235672b).f546068f);
        w11.d2 wi6 = w11.w1.wi();
        if (wi6 != null) {
            wi6.h(7);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ModProfile.ModPhoneUIC", "onCancelMatchPhoneMD5() SubCoreSync.getSyncService() is [" + w11.w1.wi() + ']');
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    public void c() {
        boolean f17 = this.f235673c.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.w0 w0Var = this.f235671a;
        if (f17) {
            android.widget.TextView textView = w0Var.f393011f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = w0Var.f393010e;
            if (c21475x81dbaa18 != null) {
                c21475x81dbaa18.setVisibility(0);
            }
        } else {
            android.widget.TextView textView2 = w0Var.f393011f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa182 = w0Var.f393010e;
            if (c21475x81dbaa182 != null) {
                c21475x81dbaa182.setVisibility(8);
            }
        }
        mo67648x3dcbea6f();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    /* renamed from: onChange */
    public void mo67648x3dcbea6f() {
        this.f235671a.d7();
    }
}
