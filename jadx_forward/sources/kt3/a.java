package kt3;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt3.l f393510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f393511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kt3.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f393510d = lVar;
        this.f393511e = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            di3.d dVar = this.f393510d.f393530q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            float b17 = dVar.b();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_photo_align_long_side, true);
            int i17 = wo.v1.f529362i.B;
            if (i17 != -1) {
                if (i17 == 0) {
                    fj6 = false;
                } else if (i17 == 1) {
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
            this.f393511e.f391656d = bitmap;
        }
        return jz5.f0.f384359a;
    }
}
