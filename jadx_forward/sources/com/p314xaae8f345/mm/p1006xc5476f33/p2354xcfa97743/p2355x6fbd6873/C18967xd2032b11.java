package com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873;

/* renamed from: com.tencent.mm.plugin.voipmp.platform.ZIDL_hlVbXEKwB */
/* loaded from: classes14.dex */
class C18967xd2032b11 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.m {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.n f258733a;

    /* renamed from: ZIDL_GI */
    private native void m73275x1964d22a(long j17, int i17, int i18, int i19);

    /* renamed from: ZIDL_HI */
    private native void m73276x1964d249(long j17, int i17, long j18);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.m
    public void F1(int i17, long j17) {
        m73276x1964d249(this.f60633xf042a733, i17, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.m
    public void X0(int i17, int i18, int i19) {
        m73275x1964d22a(this.f60633xf042a733, i17, i18, i19);
    }

    /* renamed from: ZIDL_A */
    public boolean m73277x9db8edf9(long j17, int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19) {
        android.graphics.SurfaceTexture surfaceTexture;
        jo5.l lVar = (jo5.l) this.f258733a;
        lVar.getClass();
        if (byteBuffer == null || i18 <= 0) {
            return false;
        }
        if (!((i19 & 18) == 18 || (i19 & 19) == 19) || byteBuffer.capacity() < i18) {
            return false;
        }
        java.util.HashMap hashMap = lVar.f382493b;
        jz5.l lVar2 = (jz5.l) hashMap.get(java.lang.Integer.valueOf(i17));
        if (!(lVar2 != null && ((java.lang.Number) lVar2.f384366d).longValue() == j17)) {
            com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79.f295314d;
            android.graphics.SurfaceTexture surfaceTexture2 = null;
            if (c22889xa2f9dd79 != null && !c22889xa2f9dd79.a(j17) && (surfaceTexture = ((jo5.m) c22889xa2f9dd79.f295316b.get((int) (j17 - 1))).f382498a) != null) {
                surfaceTexture2 = surfaceTexture;
            }
            if (surfaceTexture2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoIPMPCodecDriver", "Cannot find corresponding surface texture for memberId: " + i17 + ", dstSurfaceTextureHandle: " + j17);
            } else {
                hashMap.put(java.lang.Integer.valueOf(i17), new jz5.l(java.lang.Long.valueOf(j17), surfaceTexture2));
            }
        }
        cp5.a a17 = lVar.f382495d.a(i18, false);
        java.nio.ByteBuffer a18 = a17.a();
        if (a18 == null) {
            return false;
        }
        synchronized (a18) {
            byteBuffer.clear();
            byteBuffer.limit(i18);
            a18.clear();
            a18.put(byteBuffer);
            a18.rewind();
        }
        lVar.f382496e.c(new to5.a(i17, a17, 0, 0, i19, (i19 & 128) == 128, 4, (i19 & 2048) == 2048));
        return true;
    }

    /* renamed from: ZIDL_B */
    public void m73278x9db8edfa() {
        ((jo5.l) this.f258733a).f382496e.close();
    }

    /* renamed from: ZIDL_C */
    public void m73279x9db8edfb(int i17, boolean z17, boolean z18, int i18, int i19, int i27, int i28) {
        ((jo5.l) this.f258733a).b(false, i17, z17, z18, i18, i19, i27, i28);
    }

    /* renamed from: ZIDL_D */
    public void m73280x9db8edfc(int i17, boolean z17, boolean z18, int i18, int i19, int i27, int i28) {
        ((jo5.l) this.f258733a).b(true, i17, z17, z18, i18, i19, i27, i28);
    }

    /* renamed from: ZIDL_E */
    public void m73281x9db8edfd(int i17) {
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79;
        jo5.l lVar = (jo5.l) this.f258733a;
        so5.y yVar = lVar.f382497f;
        so5.t[] tVarArr = yVar.f492463q;
        so5.t tVar = tVarArr[i17];
        so5.q qVar = so5.q.f492439b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar, qVar)) {
            yVar.i(i17);
            tVarArr[i17] = qVar;
        }
        jz5.l lVar2 = (jz5.l) lVar.f382494c.get(java.lang.Integer.valueOf(i17));
        if (lVar2 != null && (c22889xa2f9dd79 = com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79.f295314d) != null) {
            c22889xa2f9dd79.m82961x5325f4d1((android.view.Surface) lVar2.f384367e);
        }
        lVar.a(i17, null);
    }

    /* renamed from: ZIDL_F */
    public void m73282x9db8edfe() {
        jo5.l lVar = (jo5.l) this.f258733a;
        lVar.f382496e.close();
        lVar.f382493b.clear();
        lVar.f382497f.close();
        for (java.util.Map.Entry entry : lVar.f382494c.entrySet()) {
            android.view.Surface surface = (android.view.Surface) ((jz5.l) entry.getValue()).f384367e;
            com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79.f295314d;
            if (c22889xa2f9dd79 != null) {
                c22889xa2f9dd79.m82961x5325f4d1(surface);
            }
            lVar.a(((java.lang.Number) entry.getKey()).intValue(), null);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.n) obj;
        this.f258733a = nVar;
        ((jo5.l) nVar).f382492a = this;
    }
}
