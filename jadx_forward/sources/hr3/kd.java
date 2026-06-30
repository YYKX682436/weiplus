package hr3;

/* loaded from: classes11.dex */
public final class kd implements com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.ld f365256a;

    public kd(hr3.ld ldVar) {
        this.f365256a = ldVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    public void a(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f365256a.m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    public void c() {
        hr3.ld ldVar = this.f365256a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = ldVar.f365299d;
        if (c19645x574159e9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editPhoneNumberView");
            throw null;
        }
        if (c19645x574159e9.f()) {
            ldVar.getClass();
            android.widget.TextView textView = ldVar.f365301f;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maxPhoneTv");
                throw null;
            }
            textView.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = ldVar.f365300e;
            if (c21475x81dbaa18 != null) {
                c21475x81dbaa18.setVisibility(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendPhoneFlowLayout");
                throw null;
            }
        }
        ldVar.getClass();
        android.widget.TextView textView2 = ldVar.f365301f;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maxPhoneTv");
            throw null;
        }
        textView2.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa182 = ldVar.f365300e;
        if (c21475x81dbaa182 != null) {
            c21475x81dbaa182.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendPhoneFlowLayout");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.h2
    /* renamed from: onChange */
    public void mo67648x3dcbea6f() {
    }
}
