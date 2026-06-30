package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes15.dex */
public class AppBrandOptionsPickerV3 implements com.tencent.mm.plugin.appbrand.jsapi.picker.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f91807d;

    /* renamed from: e, reason: collision with root package name */
    public final w51.e f91808e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f91809f;

    /* renamed from: g, reason: collision with root package name */
    public int f91810g;

    /* renamed from: h, reason: collision with root package name */
    public int f91811h;

    public AppBrandOptionsPickerV3(android.content.Context context) {
        this.f91809f = context;
        this.f91808e = new w51.e(context);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.picker.base.view.WheelView getView() {
        return this.f91808e.d();
    }

    public void b() {
        tl1.k kVar = new tl1.k(this);
        android.content.Context context = this.f91809f;
        t51.a aVar = new t51.a(context, kVar);
        int i17 = this.f91811h;
        u51.a aVar2 = aVar.f415707a;
        aVar2.f424784e = i17;
        aVar2.f424791l = b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_1);
        w51.e eVar = this.f91808e;
        aVar.a(eVar);
        eVar.f442972p.f442981b.setDividerHeight(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480137pc));
        context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7c);
        eVar.f442972p.getClass();
        int color = b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_1);
        w51.i iVar = eVar.f442972p;
        iVar.f442981b.setDividerColor(color);
        iVar.f442981b.setPadding(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        com.tencent.mm.picker.base.view.WheelView wheelView = iVar.f442981b;
        wheelView.e(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_9));
        wheelView.f72379d = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        wheelView.invalidate();
        wheelView.setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.f478494f));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public java.lang.Object currentValue() {
        this.f91808e.e();
        return this.f91807d[this.f91810g];
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
}
