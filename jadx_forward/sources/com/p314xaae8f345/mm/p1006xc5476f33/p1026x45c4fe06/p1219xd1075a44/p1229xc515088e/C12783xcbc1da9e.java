package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2 */
/* loaded from: classes15.dex */
public class C12783xcbc1da9e implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f173316d = null;

    /* renamed from: e, reason: collision with root package name */
    public final w51.g f173317e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f173318f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Date f173319g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Date f173320h;

    /* renamed from: i, reason: collision with root package name */
    public int f173321i;

    /* renamed from: m, reason: collision with root package name */
    public int f173322m;

    /* renamed from: n, reason: collision with root package name */
    public int f173323n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f173324o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f173325p;

    public C12783xcbc1da9e(android.content.Context context) {
        this.f173318f = context;
        this.f173317e = new w51.g(context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: currentValue */
    public java.lang.Object mo51206x57066778() {
        this.f173317e.f();
        return this.f173324o ? java.lang.String.format(java.util.Locale.US, "%04d-%02d-%02d", java.lang.Integer.valueOf(this.f173321i), java.lang.Integer.valueOf(this.f173322m), java.lang.Integer.valueOf(this.f173323n)) : this.f173325p ? java.lang.String.format(java.util.Locale.US, "%04d-%02d", java.lang.Integer.valueOf(this.f173321i), java.lang.Integer.valueOf(this.f173322m)) : java.lang.String.format(java.util.Locale.US, "%04d", java.lang.Integer.valueOf(this.f173321i));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: getView */
    public android.view.View mo51207xfb86a31b() {
        if (this.f173316d == null) {
            this.f173316d = this.f173317e.d();
        }
        return this.f173316d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onAttach */
    public void mo51208x3b13c504(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onDetach */
    public void mo51209x3f5eee52(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onHide */
    public void mo51210xc39a57c1(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onShow */
    public void mo51211xc39f557c(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: stopSmoothScrollingAndCalibrateSelectedData */
    public void mo51212x4b31185a() {
        this.f173317e.i();
    }
}
