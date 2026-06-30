package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map;

/* renamed from: com.tencent.tencentmap.mapsdk.map.QSupportMapFragment */
/* loaded from: classes13.dex */
public class C25944x25b4faae extends p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 {

    /* renamed from: mapView */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 f49147x31e04621;

    /* renamed from: newInstance */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25944x25b4faae m98933x6bff0255() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25944x25b4faae();
    }

    /* renamed from: getMapView */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 m98934x6fad81eb() {
        return this.f49147x31e04621;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7497x3b13c504(android.app.Activity activity) {
        super.mo7497x3b13c504(activity);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = m7436x8619eaa0();
        }
        if (this.f49147x31e04621 == null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 c25942x9518de01 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01(layoutInflater.getContext());
            this.f49147x31e04621 = c25942x9518de01;
            c25942x9518de01.mo98902x3e5a77bb(bundle);
        }
        com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.C4422xd8343bf2.v("js", "QSupportMapFragment onCreateView ");
        return this.f49147x31e04621;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        this.f49147x31e04621.mo98903xac79a11b();
        super.mo7504xac79a11b();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        this.f49147x31e04621.mo98904xa6664a60();
        super.mo7399xa6664a60();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onInflate */
    public void mo7507xc3995328(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        super.mo7507xc3995328(activity, attributeSet, bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        this.f49147x31e04621.mo98906xb01dfb57();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        this.f49147x31e04621.mo98908x57429eec();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        this.f49147x31e04621.mo98909xa71a2260(bundle);
        super.mo7404xa71a2260(bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setArguments */
    public void mo7562xe26dab14(android.os.Bundle bundle) {
        super.mo7562xe26dab14(bundle);
    }
}
