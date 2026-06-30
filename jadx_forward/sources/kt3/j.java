package kt3;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt3.l f393522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kt3.l lVar) {
        super(2);
        this.f393522d = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.util.Map metadata = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metadata, "metadata");
        kt3.l lVar = this.f393522d;
        at0.n nVar = lVar.f393529p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        nVar.f95127b.s(false);
        if (bitmap == null) {
            bi3.i iVar = lVar.f393531r;
            if (iVar != null) {
                iVar.a();
            }
            int i17 = kt3.l.F;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCameraPluginLayout", "record picture error cause null bitmap ");
        } else if (lVar.f393526m != lVar.f393524h) {
            di3.d dVar = lVar.f393530q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            float b17 = dVar.b();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_photo_align_long_side, true);
            int i18 = wo.v1.f529362i.B;
            if (i18 != -1) {
                if (i18 == 0) {
                    fj6 = false;
                } else if (i18 == 1) {
                    fj6 = true;
                }
            }
            if (fj6) {
                if (bitmap.getHeight() > bitmap.getWidth()) {
                    if (bitmap.getHeight() > 1920.0f) {
                        float height = 1920.0f / bitmap.getHeight();
                        bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z0(bitmap, b17, height, height);
                    } else {
                        if (!(b17 == 0.0f)) {
                            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, b17);
                        }
                    }
                } else if (bitmap.getWidth() > 1920.0f) {
                    float width = 1920.0f / bitmap.getWidth();
                    bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z0(bitmap, b17, width, width);
                } else {
                    if (!(b17 == 0.0f)) {
                        bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, b17);
                    }
                }
            } else if (bitmap.getHeight() > bitmap.getWidth()) {
                if (bitmap.getWidth() > 1080.0f) {
                    float width2 = 1080.0f / bitmap.getWidth();
                    bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z0(bitmap, b17, width2, width2);
                } else {
                    if (!(b17 == 0.0f)) {
                        bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, b17);
                    }
                }
            } else if (bitmap.getHeight() > 1080.0f) {
                float height2 = 1080.0f / bitmap.getHeight();
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z0(bitmap, b17, height2, height2);
            } else {
                if (!(b17 == 0.0f)) {
                    bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, b17);
                }
            }
            bi3.i iVar2 = lVar.f393531r;
            if (iVar2 != null) {
                iVar2.b(bitmap, metadata);
            }
        } else {
            bi3.i iVar3 = lVar.f393531r;
            if (iVar3 != null) {
                iVar3.b(bitmap, metadata);
            }
        }
        return jz5.f0.f384359a;
    }
}
