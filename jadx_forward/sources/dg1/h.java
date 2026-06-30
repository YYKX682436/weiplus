package dg1;

/* loaded from: classes13.dex */
public class h extends vc1.p1 {
    public android.view.Surface G0;
    public int H0;
    public int I0;

    @Override // vc1.p1, vc1.a3
    public void a(int i17, int i18) {
        if (this.G0 != null) {
            this.H0 = i17;
            this.I0 = i18;
        }
        try {
            this.f516601e.mo128406x6521d014(i17, i18, i17, i18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayerMapView", "onSizeChanged :%s", e17);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
    }

    @Override // vc1.p1, vc1.a3
    public void b(android.view.Surface surface) {
        android.view.Surface surface2;
        if (surface == null || (surface2 = this.G0) == surface) {
            return;
        }
        this.G0 = surface;
        this.f516601e.mo98912xd8f18906(surface, this.H0, this.I0);
        if (surface2 != null) {
            surface2.release();
        }
    }

    @Override // vc1.p1, vc1.a3
    /* renamed from: onTouchEvent */
    public void mo124372x667eb1da(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 c16320xe3e95109;
        if (this.G0 == null || (c16320xe3e95109 = this.f516601e) == null) {
            return;
        }
        c16320xe3e95109.dispatchTouchEvent(motionEvent);
    }

    @Override // vc1.p1
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 v(java.util.Map map) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 v17 = super.v(map);
        android.view.Surface surface = null;
        if (map != null) {
            java.lang.Object obj = map.get("surface");
            if (obj instanceof android.view.Surface) {
                surface = (android.view.Surface) obj;
            }
        }
        this.G0 = surface;
        if (surface == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayerMapView", "mSurface is null, return");
            this.G0 = new android.view.Surface(new android.graphics.SurfaceTexture(0));
        }
        v17.m99059x43d894e(this.G0);
        this.H0 = vc1.e3.d(map, "width", 0);
        this.I0 = vc1.e3.d(map, "height", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerMapView", "handler insert, position:[%d, %d]", java.lang.Integer.valueOf(this.H0), java.lang.Integer.valueOf(this.I0));
        v17.m99060x627a9bb8(this.H0, this.I0);
        v17.m99062xe31e23f4(2);
        return v17;
    }
}
