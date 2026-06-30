package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.RepeatKeyTouchImageButton */
/* loaded from: classes15.dex */
public class C12777x4fec1272 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0084x6ce1fb8a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y5 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z5 f172806f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b5 f172807g;

    public C12777x4fec1272(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172806f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z5(this);
        this.f172807g = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y5
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b5 b5Var = this.f172807g;
        if (b5Var != null) {
            b5Var.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y5
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b5 b5Var = this.f172807g;
        if (b5Var != null) {
            b5Var.b();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        this.f172806f.a(this, motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b5 b5Var = this.f172807g;
        if (b5Var == null) {
            return false;
        }
        b5Var.a();
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    /* renamed from: setRepeatKeyTouchListener */
    public void m53431xf8346bb1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b5 b5Var) {
        setClickable(b5Var != null);
        this.f172807g = b5Var;
    }

    public C12777x4fec1272(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172806f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z5(this);
        this.f172807g = null;
    }
}
