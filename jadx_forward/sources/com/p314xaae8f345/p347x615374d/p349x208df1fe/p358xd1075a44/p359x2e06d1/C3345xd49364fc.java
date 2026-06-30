package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKOnePxLineView */
/* loaded from: classes9.dex */
public class C3345xd49364fc extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.LinearLayout> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3488xf4b4b35c {
    private static final java.lang.String TAG = "MMKOnePxLineView";

    /* renamed from: mOnePxView */
    private android.view.View f13099xd54178e6;

    /* renamed from: mOnePxViewHeight */
    private float f13100x13be31ad;

    /* renamed from: mOnePxViewWidth */
    private float f13101x9e5f6480;

    /* renamed from: updateOrientation */
    private void m27027x66443d47() {
        this.f13099xd54178e6.setLayoutParams(this.f13101x9e5f6480 >= this.f13100x13be31ad ? new android.widget.LinearLayout.LayoutParams(-1, 1) : new android.widget.LinearLayout.LayoutParams(1, -1));
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setHeight */
    public void mo26288xf84e829(float f17) {
        super.mo26288xf84e829(f17);
        this.f13100x13be31ad = f17;
        m27027x66443d47();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190
    /* renamed from: setWidth */
    public void mo26336x53e9ee84(float f17) {
        super.mo26336x53e9ee84(f17);
        this.f13101x9e5f6480 = f17;
        m27027x66443d47();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.LinearLayout mo26107x519d71c1(android.content.Context context) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.f13099xd54178e6 = new android.view.View(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 1);
        this.f13101x9e5f6480 = -1.0f;
        this.f13100x13be31ad = 1.0f;
        linearLayout.addView(this.f13099xd54178e6, layoutParams);
        return linearLayout;
    }
}
