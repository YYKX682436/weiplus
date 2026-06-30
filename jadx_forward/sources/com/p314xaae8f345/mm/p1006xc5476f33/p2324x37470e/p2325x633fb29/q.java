package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q f257246a = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q();

    public final rm5.q a(r45.i70 outputConfig, boolean z17) {
        android.util.Size a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputConfig, "outputConfig");
        android.util.Size size = new android.util.Size(outputConfig.f458313i, outputConfig.f458314m);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f.f257122a;
        boolean z18 = outputConfig.f458325x;
        if (z17) {
            int width = size.getWidth();
            if (width % 8 != 0) {
                while (width % 8 != 0) {
                    width++;
                }
            }
            int height = size.getHeight();
            if (height % 4 != 0) {
                while (height % 4 != 0) {
                    height++;
                }
            }
            a17 = new android.util.Size(width, height);
        } else {
            a17 = !d11.a.a() ? fVar.a(size, 16) : fVar.b(size, z18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionOutputConfigCheck", "afterAlign: videoSoft:" + z17 + " renderSize:" + size + " afterAlign:" + a17);
        if (!z17 && d11.a.a() && (a17.getWidth() != size.getWidth() || a17.getHeight() != size.getHeight())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CompositionOutputConfigCheck", "align error, renderSize:" + size + " afterAlign:" + a17);
            return null;
        }
        outputConfig.f458313i = a17.getWidth();
        outputConfig.f458314m = a17.getHeight();
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_tavkit_encode_high_profile_enable, 1) == 1;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mediacodec_level_limit, true);
        android.util.Size size2 = new android.util.Size(outputConfig.f458313i, outputConfig.f458314m);
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_composition_bsf_enable, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionOutputConfigCheck", "enableBsf:" + fj7 + " videoSoft:" + z17 + " outputAlignFixResolution:" + outputConfig.B);
        rm5.q qVar = new rm5.q(size2, outputConfig.f458315n, outputConfig.f458316o, outputConfig.f458317p, outputConfig.f458318q, outputConfig.f458319r, outputConfig.f458320s, z19, fj6, false, outputConfig.f458325x, 0, (fj7 || outputConfig.B) ? size : null, 2048, null);
        qVar.f479085q = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_composition_codec_check, false);
        return qVar;
    }
}
