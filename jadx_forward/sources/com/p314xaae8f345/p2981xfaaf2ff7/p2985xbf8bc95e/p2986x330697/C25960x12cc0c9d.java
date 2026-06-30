package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.SupportMapFragment */
/* loaded from: classes13.dex */
public class C25960x12cc0c9d extends p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 {

    /* renamed from: mTencentMap */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 f49224xd6e0b024;

    /* renamed from: mapV */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 f49225x33067a = null;

    /* renamed from: isOnTop */
    private boolean f49223x7b3827ec = false;

    /* renamed from: newInstance */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25960x12cc0c9d m99143x6bff0255(android.content.Context context) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25960x12cc0c9d c25960x12cc0c9d = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25960x12cc0c9d();
        c25960x12cc0c9d.m99145x7420ee2c(context);
        return c25960x12cc0c9d;
    }

    /* renamed from: getMap */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 m99144xb5885626() {
        if (this.f49224xd6e0b024 == null) {
            this.f49224xd6e0b024 = this.f49225x33067a.mo99086xb5885626();
        }
        return this.f49224xd6e0b024;
    }

    /* renamed from: initMap */
    public void m99145x7420ee2c(android.content.Context context) {
        this.f49225x33067a = m99146xead64de6(context, null);
    }

    /* renamed from: onCreateMapView */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 m99146xead64de6(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01(context, c25966x7e4576a7);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (this.f49225x33067a == null) {
            this.f49225x33067a = m99146xead64de6(mo7430x19263085().getBaseContext(), null);
        }
        this.f49225x33067a.m99141x537b3bb4(this.f49223x7b3827ec);
        return this.f49225x33067a;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        this.f49225x33067a.mo99090xac79a11b();
        super.mo7504xac79a11b();
        this.f49225x33067a = null;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        this.f49225x33067a.mo99090xac79a11b();
        super.mo7399xa6664a60();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        this.f49225x33067a.mo99091xb01dfb57();
        super.mo7512xb01dfb57();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        this.f49225x33067a.mo99093x57429eec();
        super.mo7517x57429eec();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        this.f49225x33067a.mo99094xb05099c3();
        super.mo7405xb05099c3();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        this.f49225x33067a.mo99095xc39f8281();
        super.mo7406xc39f8281();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setArguments */
    public void mo7562xe26dab14(android.os.Bundle bundle) {
        super.mo7562xe26dab14(bundle);
    }

    /* renamed from: setOnTop */
    public void m99147x537b3bb4(boolean z17) {
        this.f49223x7b3827ec = z17;
    }
}
