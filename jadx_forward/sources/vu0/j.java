package vu0;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uu0.k f521633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.s0 f521634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vu0.k f521636h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521637i;

    public j(java.lang.String str, uu0.k kVar, pp0.s0 s0Var, java.lang.String str2, vu0.k kVar2, java.lang.String str3) {
        this.f521632d = str;
        this.f521633e = kVar;
        this.f521634f = s0Var;
        this.f521635g = str2;
        this.f521636h = kVar2;
        this.f521637i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.nio.ByteBuffer d17 = ru0.a.d(new com.p314xaae8f345.mm.vfs.r6(this.f521632d));
        uu0.k kVar = this.f521633e;
        int capacity = d17.capacity();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("vr_domain", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0);
        hashMap.put("max_result_count", "1");
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.String.valueOf(java.lang.System.nanoTime()));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, "0");
        hashMap.put("len", java.lang.String.valueOf(capacity));
        hashMap.put("samples_per_sec", java.lang.String.valueOf(kVar.f512777b));
        hashMap.put("bits_per_sample", "16");
        hashMap.put("voice_file_type", "1");
        hashMap.put("voice_encode_type", "6");
        hashMap.put("result_type", "1");
        hashMap.put("end", "1");
        hashMap.put("cont_res", "1");
        hashMap.put("stable_results", "1");
        hashMap.toString();
        pp0.s0 s0Var = this.f521634f;
        java.lang.String voiceID = this.f521635g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(voiceID, "$voiceID");
        vu0.k kVar2 = this.f521636h;
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 iLinkAppRequest = kVar2.f521641c;
        vu0.i iVar = new vu0.i(kVar2, this.f521637i, this.f521635g);
        dz0.s2 s2Var = (dz0.s2) s0Var;
        s2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iLinkAppRequest, "iLinkAppRequest");
        synchronized (s2Var) {
            if (s2Var.f326539b) {
                return;
            }
            s2Var.f326538a.f(d17, hashMap, voiceID, iLinkAppRequest, "getfullspeechrecognition", iVar);
        }
    }
}
