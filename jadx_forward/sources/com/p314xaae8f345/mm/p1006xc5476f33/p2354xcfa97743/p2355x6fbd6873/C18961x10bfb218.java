package com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873;

/* renamed from: com.tencent.mm.plugin.voipmp.platform.ZIDL_SIvakOGDB */
/* loaded from: classes14.dex */
class C18961x10bfb218 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.o {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.p f258731a;

    /* renamed from: ZIDL_II */
    private native void m73255x1964d268(long j17, long j18);

    /* renamed from: ZIDL_A */
    public long m73256x9db8edf9(int i17) {
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = (com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79) this.f258731a;
        c22889xa2f9dd79.getClass();
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(i17);
        kz5.q qVar = c22889xa2f9dd79.f295317c;
        boolean isEmpty = qVar.isEmpty();
        java.util.ArrayList arrayList = c22889xa2f9dd79.f295316b;
        if (isEmpty) {
            arrayList.add(new jo5.m(surfaceTexture, null, 0L, 6, null));
            return arrayList.size();
        }
        int intValue = ((java.lang.Number) qVar.m144680x41771d3a()).intValue();
        java.lang.Object obj = arrayList.get(intValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        jo5.m mVar = (jo5.m) obj;
        mVar.f382498a = surfaceTexture;
        mVar.f382499b = null;
        return intValue + 1;
    }

    /* renamed from: ZIDL_B */
    public void m73257x9db8edfa(long j17) {
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = (com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79) this.f258731a;
        if (c22889xa2f9dd79.a(j17)) {
            return;
        }
        int i17 = (int) (j17 - 1);
        java.util.ArrayList arrayList = c22889xa2f9dd79.f295316b;
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        jo5.m mVar = (jo5.m) obj;
        android.graphics.SurfaceTexture surfaceTexture = mVar.f382498a;
        android.view.Surface surface = mVar.f382499b;
        if (surface != null) {
            c22889xa2f9dd79.m82961x5325f4d1(surface);
            surface.release();
        }
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        mVar.f382498a = null;
        mVar.f382499b = null;
        mVar.f382500c = 0L;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        kz5.q qVar = c22889xa2f9dd79.f295317c;
        qVar.m144678xbb8646d7(valueOf);
        if (arrayList.size() == qVar.d()) {
            arrayList.clear();
            qVar.clear();
        }
    }

    /* renamed from: ZIDL_C */
    public boolean m73258x9db8edfb(long j17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = (com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79) this.f258731a;
        if (c22889xa2f9dd79.a(j17) || (surfaceTexture = ((jo5.m) c22889xa2f9dd79.f295316b.get((int) (j17 - 1))).f382498a) == null) {
            return false;
        }
        surfaceTexture.updateTexImage();
        return true;
    }

    /* renamed from: ZIDL_D */
    public long m73259x9db8edfc(long j17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = (com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79) this.f258731a;
        if (c22889xa2f9dd79.a(j17) || (surfaceTexture = ((jo5.m) c22889xa2f9dd79.f295316b.get((int) (j17 - 1))).f382498a) == null) {
            return 0L;
        }
        return surfaceTexture.getTimestamp();
    }

    /* renamed from: ZIDL_E */
    public long m73260x9db8edfd(long j17) {
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = (com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79) this.f258731a;
        if (c22889xa2f9dd79.a(j17)) {
            return 0L;
        }
        java.lang.Object obj = c22889xa2f9dd79.f295316b.get((int) (j17 - 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        jo5.m mVar = (jo5.m) obj;
        android.view.Surface surface = mVar.f382499b;
        long j18 = mVar.f382500c;
        if (surface != null) {
            return j18;
        }
        android.graphics.SurfaceTexture surfaceTexture = mVar.f382498a;
        if (surfaceTexture == null) {
            return 0L;
        }
        android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
        long m82960x88d6288a = c22889xa2f9dd79.m82960x88d6288a(surface2);
        mVar.f382499b = surface2;
        mVar.f382500c = m82960x88d6288a;
        return m82960x88d6288a;
    }

    /* renamed from: ZIDL_F */
    public long m73261x9db8edfe(long j17) {
        this.f258731a.getClass();
        return 0L;
    }

    /* renamed from: ZIDL_G */
    public boolean m73262x9db8edff(long j17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = (com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79) this.f258731a;
        if (c22889xa2f9dd79.a(j17) || (surfaceTexture = ((jo5.m) c22889xa2f9dd79.f295316b.get((int) (j17 - 1))).f382498a) == null) {
            return false;
        }
        surfaceTexture.setOnFrameAvailableListener(new jo5.n(c22889xa2f9dd79, j17));
        return true;
    }

    /* renamed from: ZIDL_H */
    public boolean m73263x9db8ee00(long j17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = (com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79) this.f258731a;
        if (c22889xa2f9dd79.a(j17) || (surfaceTexture = ((jo5.m) c22889xa2f9dd79.f295316b.get((int) (j17 - 1))).f382498a) == null) {
            return false;
        }
        surfaceTexture.setOnFrameAvailableListener(null);
        return true;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.p) obj;
        this.f258731a = pVar;
        ((com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79) pVar).f295315a = this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.o
    public void y0(long j17) {
        m73255x1964d268(this.f60633xf042a733, j17);
    }
}
