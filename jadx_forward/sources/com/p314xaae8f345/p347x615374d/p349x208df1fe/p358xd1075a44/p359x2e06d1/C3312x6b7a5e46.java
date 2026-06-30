package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaSwitchViewImpl */
/* loaded from: classes15.dex */
public class C3312x6b7a5e46 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4 {

    /* renamed from: mmSwitchBtn */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f12880x4284f8c8;

    /* renamed from: onChangeSwitchCallback */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3527xc1844fac f12881xaae60fe8;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: getEnabled */
    public boolean mo26661xdddcc70b() {
        return this.f12880x4284f8c8.isEnabled();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: getOffImage */
    public com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 mo26662x4c7e56a2() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: getOn */
    public boolean mo26663x5db1bd5() {
        return this.f12880x4284f8c8.f292896x;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: getOnImage */
    public com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 mo26664xed8dba86() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: getOnTintColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26665x272214d3() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: getThumbTintColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26666x60937ce8() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: getTintColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26667x4e8f0272() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: setEnabled */
    public void mo26668x514e147f(boolean z17) {
        this.f12880x4284f8c8.setEnabled(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: setOffImage */
    public void mo26669x4736b7ae(com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 interfaceC3471x84332fd0) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: setOn */
    public void mo26670x68435e1(boolean z17) {
        this.f12880x4284f8c8.m81392x52cfa5c6(z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: setOnChangeSwitchCallback */
    public void mo26671x46f822ea(com.p314xaae8f345.p347x615374d.gen.AbstractC3527xc1844fac abstractC3527xc1844fac) {
        this.f12881xaae60fe8 = abstractC3527xc1844fac;
        this.f12880x4284f8c8.m81396xb3e0a10a(new al5.c2() { // from class: com.tencent.kinda.framework.widget.base.KindaSwitchViewImpl.1
            @Override // al5.c2
            /* renamed from: onStatusChange */
            public void mo2289xd6191dc1(boolean z17) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3312x6b7a5e46.this.f12881xaae60fe8.mo28151x6fe8be83();
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: setOnImage */
    public void mo26672x60ff07fa(com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 interfaceC3471x84332fd0) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: setOnTintColor */
    public void mo26673xbd878847(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: setThumbTintColor */
    public void mo26674x2889e4f4(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3526x11fe6a4
    /* renamed from: setTintColor */
    public void mo26675xaae2c2e6(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 mo26107x519d71c1(android.content.Context context) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8(context);
        this.f12880x4284f8c8 = viewOnClickListenerC22631x1cc07cc8;
        return viewOnClickListenerC22631x1cc07cc8;
    }
}
