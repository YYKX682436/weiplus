package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKLoadingImage */
/* loaded from: classes9.dex */
public class C3340x33d113ca extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.LinearLayout> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3480x3d1c796a {

    /* renamed from: context */
    private android.content.Context f13082x38b735af;

    /* renamed from: loadingImageStype */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3577x31b3c752 f13083x46ef87ee;

    /* renamed from: progressBar */
    private android.widget.ProgressBar f13084x437176a6;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3480x3d1c796a
    /* renamed from: getStyle */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3577x31b3c752 mo26993x7528c3fb() {
        return this.f13083x46ef87ee;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3480x3d1c796a
    /* renamed from: setStyle */
    public void mo26994x53b6de6f(com.p314xaae8f345.p347x615374d.gen.EnumC3577x31b3c752 enumC3577x31b3c752) {
        android.content.Context context = this.f13082x38b735af;
        if (context != null) {
            this.f13083x46ef87ee = enumC3577x31b3c752;
            if (enumC3577x31b3c752 == com.p314xaae8f345.p347x615374d.gen.EnumC3577x31b3c752.WHITE) {
                this.f13084x437176a6.setIndeterminateDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.avp));
            } else if (enumC3577x31b3c752 == com.p314xaae8f345.p347x615374d.gen.EnumC3577x31b3c752.WHITELARGE) {
                this.f13084x437176a6.setIndeterminateDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.avp));
            } else if (enumC3577x31b3c752 == com.p314xaae8f345.p347x615374d.gen.EnumC3577x31b3c752.GRAY) {
                this.f13084x437176a6.setIndeterminateDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.avh));
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3480x3d1c796a
    /* renamed from: startAnimating */
    public void mo26995x2d8c451c() {
        this.f13084x437176a6.setVisibility(0);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3480x3d1c796a
    /* renamed from: stopAnimating */
    public void mo26996xcac3157c() {
        this.f13084x437176a6.setVisibility(8);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.LinearLayout mo26107x519d71c1(android.content.Context context) {
        this.f13082x38b735af = context;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(context);
        this.f13084x437176a6 = progressBar;
        progressBar.setIndeterminateDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.avh));
        this.f13084x437176a6.setVisibility(8);
        linearLayout.addView(this.f13084x437176a6, new android.widget.LinearLayout.LayoutParams(-1, -1));
        return linearLayout;
    }
}
