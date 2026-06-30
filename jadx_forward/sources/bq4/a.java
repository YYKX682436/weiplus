package bq4;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct0.b f105119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2342xa4f4bf5f.C18826x415dbe7e f105120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ct0.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2342xa4f4bf5f.C18826x415dbe7e c18826x415dbe7e) {
        super(3);
        this.f105119d = bVar;
        this.f105120e = c18826x415dbe7e;
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
            ct0.b bVar = this.f105119d;
            if (com.p314xaae8f345.mm.vfs.w6.j(bVar != null ? bVar.f303737a : null)) {
                dw3.e0 e0Var = dw3.e0.f325735a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
                dw3.d0 a17 = e0Var.a(bVar.f303737a);
                if (a17 != null) {
                    int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_image_size, 1920);
                    int i18 = a17.f325724b;
                    int i19 = a17.f325723a;
                    if (i19 > i18) {
                        i17 = Ni;
                        Ni = (i18 * Ni) / i19;
                    } else {
                        i17 = (i19 * Ni) / i18;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("outputHeight:");
                    sb6.append(Ni);
                    sb6.append(" outputWidth:");
                    sb6.append(i17);
                    sb6.append(" startTime:");
                    int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2342xa4f4bf5f.C18826x415dbe7e.f257642p1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2342xa4f4bf5f.C18826x415dbe7e c18826x415dbe7e = this.f105120e;
                    sb6.append(c18826x415dbe7e.m67965xcd7d0565().f547100o);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusEditVideoPluginLayout", sb6.toString());
                    r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
                    java.lang.String str = bVar.f303737a;
                    long j17 = c18826x415dbe7e.m67965xcd7d0565().f547100o;
                    ((q90.i) lVar).getClass();
                    android.graphics.Bitmap q17 = ai3.d.q(str, j17);
                    if (Ni < i18 || i17 < i19) {
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
        }
        return jz5.f0.f384359a;
    }
}
