package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKDashLineView */
/* loaded from: classes9.dex */
public class C3330x906ebcb6 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.LinearLayout> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3448x99ba2256 {

    /* renamed from: contentView */
    private android.widget.LinearLayout f12994xe8cefebe;

    /* renamed from: isVertical */
    private boolean f12995x5a740ec0 = false;

    /* renamed from: mDashColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f12996x3a8d8504 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(-1, 0);

    /* renamed from: mDashWidth */
    private float f12997x3ba48367 = com.p314xaae8f345.mm.ui.zk.a(this.f13206xd6cfe882, 2);

    /* renamed from: mLine */
    private android.view.View f12998x6242601;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3448x99ba2256
    /* renamed from: getDashColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26811xbf43ac3b() {
        return this.f12996x3a8d8504;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3448x99ba2256
    /* renamed from: getDashWidth */
    public float mo26812xc05aaa9e() {
        return this.f12997x3ba48367;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3448x99ba2256
    /* renamed from: getVertical */
    public boolean mo26813x596a4ec() {
        return this.f12995x5a740ec0;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3448x99ba2256
    /* renamed from: setDashColor */
    public void mo26814x1b976caf(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.f12996x3a8d8504 = c3392x2ae78284;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3448x99ba2256
    /* renamed from: setDashWidth */
    public void mo26815x1cae6b12(float f17) {
        this.f12997x3ba48367 = f17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3448x99ba2256
    /* renamed from: setVertical */
    public void mo26816x4f05f8(boolean z17) {
        this.f12995x5a740ec0 = z17;
        if (z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            this.f12994xe8cefebe.setGravity(17);
            this.f12994xe8cefebe.setLayoutParams(layoutParams);
            android.view.View findViewById = this.f12994xe8cefebe.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11578xb05a25d7);
            this.f12998x6242601 = findViewById;
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            layoutParams2.width = com.p314xaae8f345.mm.ui.zk.a(this.f13206xd6cfe882, java.lang.Math.round(mo26216x1c4fb41d()));
            layoutParams2.height = -1;
            android.graphics.drawable.Drawable drawable = this.f13206xd6cfe882.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562423et);
            drawable.setTint((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12996x3a8d8504));
            this.f12998x6242601.setBackground(drawable);
            this.f12998x6242601.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.LinearLayout mo26107x519d71c1(android.content.Context context) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(context, com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11643xbd744ad5, null);
        this.f12994xe8cefebe = linearLayout;
        return linearLayout;
    }
}
