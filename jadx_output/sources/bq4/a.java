package bq4;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct0.b f23586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.textstatus.RecordTextStatusEditVideoPluginLayout f23587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ct0.b bVar, com.tencent.mm.plugin.vlog.ui.video.textstatus.RecordTextStatusEditVideoPluginLayout recordTextStatusEditVideoPluginLayout) {
        super(3);
        this.f23586d = bVar;
        this.f23587e = recordTextStatusEditVideoPluginLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i17;
        java.lang.String mixVideo = (java.lang.String) obj;
        java.lang.String mixThumb = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(mixVideo, "mixVideo");
        kotlin.jvm.internal.o.g(mixThumb, "mixThumb");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusEditVideoPluginLayout", "is in main thread:" + com.tencent.mm.sdk.platformtools.u3.e());
        if (booleanValue) {
            ct0.b bVar = this.f23586d;
            if (com.tencent.mm.vfs.w6.j(bVar != null ? bVar.f222204a : null)) {
                dw3.e0 e0Var = dw3.e0.f244202a;
                kotlin.jvm.internal.o.d(bVar);
                dw3.d0 a17 = e0Var.a(bVar.f222204a);
                if (a17 != null) {
                    int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_image_size, 1920);
                    int i18 = a17.f244191b;
                    int i19 = a17.f244190a;
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
                    int i27 = com.tencent.mm.plugin.vlog.ui.video.textstatus.RecordTextStatusEditVideoPluginLayout.f176109p1;
                    com.tencent.mm.plugin.vlog.ui.video.textstatus.RecordTextStatusEditVideoPluginLayout recordTextStatusEditVideoPluginLayout = this.f23587e;
                    sb6.append(recordTextStatusEditVideoPluginLayout.getPreviewPlugin().f465567o);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusEditVideoPluginLayout", sb6.toString());
                    r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
                    java.lang.String str = bVar.f222204a;
                    long j17 = recordTextStatusEditVideoPluginLayout.getPreviewPlugin().f465567o;
                    ((q90.i) lVar).getClass();
                    android.graphics.Bitmap q17 = ai3.d.q(str, j17);
                    if (Ni < i18 || i17 < i19) {
                        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(q17, i17, Ni, true);
                        q17.recycle();
                        q17 = createScaledBitmap;
                    }
                    if (q17 != null) {
                        com.tencent.mm.vfs.w6.h(mixThumb);
                        com.tencent.mm.sdk.platformtools.x.D0(q17, 100, android.graphics.Bitmap.CompressFormat.JPEG, mixThumb, true);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
