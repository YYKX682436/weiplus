package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.MapFragment */
/* loaded from: classes13.dex */
public class FragmentC25955xd80b77ac extends android.app.Fragment {

    /* renamed from: mTencentMap */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 f49192xd6e0b024;

    /* renamed from: mapV */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 f49193x33067a = null;

    /* renamed from: isOnTop */
    private boolean f49191x7b3827ec = true;

    /* renamed from: newInstance */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.FragmentC25955xd80b77ac m99131x6bff0255(android.content.Context context) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.FragmentC25955xd80b77ac fragmentC25955xd80b77ac = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.FragmentC25955xd80b77ac();
        fragmentC25955xd80b77ac.m99133x7420ee2c(context);
        return fragmentC25955xd80b77ac;
    }

    /* renamed from: getMap */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 m99132xb5885626() {
        if (this.f49192xd6e0b024 == null) {
            this.f49192xd6e0b024 = this.f49193x33067a.mo99086xb5885626();
        }
        return this.f49192xd6e0b024;
    }

    /* renamed from: initMap */
    public void m99133x7420ee2c(android.content.Context context) {
        if (this.f49193x33067a == null) {
            this.f49193x33067a = m99134xead64de6(context.getApplicationContext(), null);
        }
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: onCreateMapView */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01 m99134xead64de6(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01(context, c25966x7e4576a7);
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (this.f49193x33067a == null) {
            this.f49193x33067a = m99134xead64de6(getActivity().getBaseContext(), null);
        }
        this.f49193x33067a.m99141x537b3bb4(this.f49191x7b3827ec);
        return this.f49193x33067a;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f49193x33067a.mo99090xac79a11b();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f49193x33067a.mo99090xac79a11b();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.f49193x33067a.mo99091xb01dfb57();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        this.f49193x33067a.mo99093x57429eec();
        super.onResume();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        this.f49193x33067a.mo99094xb05099c3();
        super.onStart();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.f49193x33067a.mo99095xc39f8281();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
    }

    /* renamed from: setOnTop */
    public void m99135x537b3bb4(boolean z17) {
        this.f49191x7b3827ec = z17;
    }
}
