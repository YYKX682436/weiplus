package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes15.dex */
public class AppBrandDatePickerV2 implements com.tencent.mm.plugin.appbrand.jsapi.picker.f {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f91783d = null;

    /* renamed from: e, reason: collision with root package name */
    public final w51.g f91784e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f91785f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Date f91786g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Date f91787h;

    /* renamed from: i, reason: collision with root package name */
    public int f91788i;

    /* renamed from: m, reason: collision with root package name */
    public int f91789m;

    /* renamed from: n, reason: collision with root package name */
    public int f91790n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f91791o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f91792p;

    public AppBrandDatePickerV2(android.content.Context context) {
        this.f91785f = context;
        this.f91784e = new w51.g(context);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public java.lang.Object currentValue() {
        this.f91784e.f();
        return this.f91791o ? java.lang.String.format(java.util.Locale.US, "%04d-%02d-%02d", java.lang.Integer.valueOf(this.f91788i), java.lang.Integer.valueOf(this.f91789m), java.lang.Integer.valueOf(this.f91790n)) : this.f91792p ? java.lang.String.format(java.util.Locale.US, "%04d-%02d", java.lang.Integer.valueOf(this.f91788i), java.lang.Integer.valueOf(this.f91789m)) : java.lang.String.format(java.util.Locale.US, "%04d", java.lang.Integer.valueOf(this.f91788i));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public android.view.View getView() {
        if (this.f91783d == null) {
            this.f91783d = this.f91784e.d();
        }
        return this.f91783d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onAttach(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onDetach(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onHide(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onShow(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void stopSmoothScrollingAndCalibrateSelectedData() {
        this.f91784e.i();
    }
}
