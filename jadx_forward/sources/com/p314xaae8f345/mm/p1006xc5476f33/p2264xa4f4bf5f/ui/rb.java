package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class rb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct0.b f255780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18643x9527e50f f255781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(ct0.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18643x9527e50f c18643x9527e50f) {
        super(3);
        this.f255780d = bVar;
        this.f255781e = c18643x9527e50f;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i17;
        java.lang.String mixVideo = (java.lang.String) obj;
        java.lang.String mixThumb = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixVideo, "mixVideo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixThumb, "mixThumb");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusEditVideoPluginLayout", "is in main thread:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e());
        if (booleanValue) {
            ct0.b bVar = this.f255780d;
            if (com.p314xaae8f345.mm.vfs.w6.j(bVar != null ? bVar.f303737a : null)) {
                e60.k1 k1Var = (e60.k1) i95.n0.c(e60.k1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
                java.lang.String str = bVar.f303737a;
                ((d60.c0) k1Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b c17 = j33.s.f378989a.c(str);
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_image_size, 1920);
                int i18 = c17.f243917c;
                int i19 = c17.f243918d;
                if (i18 > i19) {
                    int i27 = (i19 * Ni) / i18;
                    i17 = Ni;
                    Ni = i27;
                } else {
                    i17 = (i18 * Ni) / i19;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("outputHeight:");
                sb6.append(Ni);
                sb6.append(" outputWidth:");
                sb6.append(i17);
                sb6.append(" startTime:");
                int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18643x9527e50f.G;
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18643x9527e50f c18643x9527e50f = this.f255781e;
                sb6.append(c18643x9527e50f.m67965xcd7d0565().f547100o);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusEditVideoPluginLayout", sb6.toString());
                r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
                java.lang.String str2 = bVar.f303737a;
                long j17 = c18643x9527e50f.m67965xcd7d0565().f547100o;
                ((q90.i) lVar).getClass();
                android.graphics.Bitmap q17 = ai3.d.q(str2, j17);
                if (Ni < c17.f243918d || i17 < c17.f243917c) {
                    android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(q17, i17, Ni, true);
                    q17.recycle();
                    q17 = createScaledBitmap;
                }
                if (q17 != null) {
                    com.p314xaae8f345.mm.vfs.w6.h(mixThumb);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(q17, 100, android.graphics.Bitmap.CompressFormat.JPEG, mixThumb, true);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
