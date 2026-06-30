package pk4;

/* loaded from: classes15.dex */
public final class h0 implements mk4.a {

    /* renamed from: d, reason: collision with root package name */
    public long f438020d = -1;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f438021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b f438022f;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b) {
        this.f438022f = c18695xb390043b;
    }

    @Override // mk4.a
    public boolean a(java.lang.Object surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b = this.f438022f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c18695xb390043b.f256108d, "onSurfaceTextureDestroyed");
        int i17 = c18695xb390043b.f256121t;
        if (i17 != 11 && i17 != 8 && i17 != 9) {
            c18695xb390043b.f256118q.e(c18695xb390043b.f256119r);
        }
        kk4.c cVar = c18695xb390043b.f256109e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100970x42c875eb(null);
        }
        android.view.Surface surface2 = this.f438021e;
        if (surface2 != null) {
            surface2.release();
        }
        this.f438021e = null;
        c18695xb390043b.f256116o = false;
        return false;
    }

    @Override // mk4.a
    public void b(java.lang.Object surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438022f.f256108d, "onSurfaceTextureSizeChanged: " + i17 + " x " + i18);
    }

    @Override // mk4.a
    public void c(java.lang.Object surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18695xb390043b c18695xb390043b = this.f438022f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18695xb390043b.f256108d, "onSurfaceTextureAvailable： " + surface + '(' + i17 + " x " + i18 + ')');
        android.view.Surface surface2 = this.f438021e;
        if (surface2 != null || !(surface instanceof android.view.SurfaceHolder)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c18695xb390043b.f256108d, "surface is already valid");
            return;
        }
        if (surface2 != null) {
            surface2.release();
        }
        android.view.Surface surface3 = ((android.view.SurfaceHolder) surface).getSurface();
        this.f438021e = surface3;
        kk4.c cVar = c18695xb390043b.f256109e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100971x42c875eb(surface3, 2);
        }
        c18695xb390043b.f256116o = false;
        c18695xb390043b.l();
        java.lang.Double d17 = c18695xb390043b.f256112h;
        if (d17 != null) {
            c18695xb390043b.a(d17.doubleValue(), c18695xb390043b.f256111g);
        }
    }

    @Override // mk4.a
    public void d(java.lang.Object surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        if (surface instanceof android.view.SurfaceHolder) {
            this.f438020d = java.lang.System.currentTimeMillis();
        }
    }
}
