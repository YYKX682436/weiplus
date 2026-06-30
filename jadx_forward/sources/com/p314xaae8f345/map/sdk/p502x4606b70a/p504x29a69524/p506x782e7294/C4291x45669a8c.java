package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294;

/* renamed from: com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng */
/* loaded from: classes13.dex */
public class C4291x45669a8c {

    /* renamed from: trailData */
    private com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53[] f16789x35c3e2d0;

    public C4291x45669a8c(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53[] c4290x991d3e53Arr) {
        boolean z17;
        if (c4290x991d3e53Arr == null || c4290x991d3e53Arr.length < 2) {
            this.f16789x35c3e2d0 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53[0];
            return;
        }
        int i17 = 0;
        while (true) {
            z17 = true;
            if (i17 >= c4290x991d3e53Arr.length - 1) {
                break;
            }
            int m35656xfb85bb43 = c4290x991d3e53Arr[i17].m35656xfb85bb43();
            i17++;
            if (m35656xfb85bb43 >= c4290x991d3e53Arr[i17].m35656xfb85bb43()) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            this.f16789x35c3e2d0 = c4290x991d3e53Arr;
        } else {
            this.f16789x35c3e2d0 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53[0];
        }
    }

    /* renamed from: getTrailData */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4290x991d3e53[] m35660x3531541a() {
        return this.f16789x35c3e2d0;
    }
}
