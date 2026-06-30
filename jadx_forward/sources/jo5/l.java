package jo5;

/* loaded from: classes14.dex */
public final class l implements com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.n {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.m f382492a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f382493b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f382494c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final cp5.b f382495d;

    /* renamed from: e, reason: collision with root package name */
    public final so5.m f382496e;

    /* renamed from: f, reason: collision with root package name */
    public final so5.y f382497f;

    public l() {
        cp5.b bVar = new cp5.b();
        this.f382495d = bVar;
        yo5.h hVar = new yo5.h();
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(hVar.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        ro5.d dVar = ro5.d.f479711a;
        this.f382496e = new so5.m(dVar, null, hVar, this, new jo5.j(this, null));
        this.f382497f = new so5.y(false, true, true, dVar, new to5.c(bVar, null), new bp5.k(a17), hVar, so5.o0.f492428a.a(), jo5.k.f382491d);
    }

    public final void a(int i17, android.view.Surface surface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.m mVar;
        java.util.HashMap hashMap = this.f382494c;
        if (((jz5.l) hashMap.get(java.lang.Integer.valueOf(i17))) != null && (mVar = this.f382492a) != null) {
            mVar.F1(i17, 0L);
        }
        if (surface == null) {
            return;
        }
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79.f295314d;
        java.lang.Long valueOf = c22889xa2f9dd79 != null ? java.lang.Long.valueOf(c22889xa2f9dd79.m82960x88d6288a(surface)) : null;
        if (valueOf != null) {
            hashMap.put(java.lang.Integer.valueOf(i17), new jz5.l(valueOf, surface));
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.m mVar2 = this.f382492a;
            if (mVar2 != null) {
                mVar2.F1(i17, valueOf.longValue());
            }
        }
    }

    public final void b(boolean z17, int i17, boolean z18, boolean z19, int i18, int i19, int i27, int i28) {
        java.lang.Object mo11009x8dd3293d;
        so5.y yVar = this.f382497f;
        try {
            yVar.f(z17, i17, new uo5.u(i27, i28, (short) i19, (byte) 25, (byte) i18, z17 ? (byte) 4 : (byte) 8, true, z18, z19, Byte.MIN_VALUE, (short) 0, null));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startHardwareEncoding: Started ");
            sb6.append(z17 ? "H265" : "H264");
            sb6.append(" encoding for talkway: ");
            sb6.append(i17);
            sb6.append(", kbps: ");
            sb6.append(i19);
            sb6.append(", resolution: ");
            sb6.append(i27);
            sb6.append('x');
            sb6.append(i28);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoIPMPCodecDriver", sb6.toString());
            bp5.h hVar = yVar.f492465s[i17];
            android.view.Surface surface = null;
            if (hVar != null && (hVar instanceof bp5.f) && (mo11009x8dd3293d = ((bp5.f) hVar).mo11009x8dd3293d()) != null && (mo11009x8dd3293d instanceof android.view.Surface)) {
                surface = (android.view.Surface) mo11009x8dd3293d;
            }
            a(i17, surface);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoIPMPCodecDriver", "startHardwareEncoding: Failed to start encoding", e17);
        }
    }
}
