package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map;

/* renamed from: com.tencent.tencentmap.mapsdk.map.MapActivity */
/* loaded from: classes13.dex */
public abstract class AbstractActivityC25940xd7b4886b extends p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f {

    /* renamed from: mapViewList */
    private java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01> f49134x1e42725f = new java.util.ArrayList();

    /* renamed from: mysavedInstanceState */
    private android.os.Bundle f49135x37552461;

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s(this, bundle);
        super.onCreate(bundle);
        this.f49135x37552461 = bundle;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 c25942x9518de01 : this.f49134x1e42725f) {
            if (c25942x9518de01 != null) {
                c25942x9518de01.mo98903xac79a11b();
            }
        }
        this.f49134x1e42725f.clear();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 c25942x9518de01 : this.f49134x1e42725f) {
            if (c25942x9518de01 != null) {
                c25942x9518de01.mo98906xb01dfb57();
            }
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 c25942x9518de01 : this.f49134x1e42725f) {
            if (c25942x9518de01 != null) {
                c25942x9518de01.mo98907x91109f30();
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 c25942x9518de01 : this.f49134x1e42725f) {
            if (c25942x9518de01 != null) {
                c25942x9518de01.mo98908x57429eec();
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 c25942x9518de01 : this.f49134x1e42725f) {
            if (c25942x9518de01 != null) {
                c25942x9518de01.mo98910xb05099c3();
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 c25942x9518de01 : this.f49134x1e42725f) {
            if (c25942x9518de01 != null) {
                c25942x9518de01.mo98911xc39f8281();
            }
        }
    }

    /* renamed from: setMapView */
    public void m98913xe31ecf5f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01 c25942x9518de01) {
        if (c25942x9518de01 != null) {
            this.f49134x1e42725f.add(c25942x9518de01);
        }
    }
}
