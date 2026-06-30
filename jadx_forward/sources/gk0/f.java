package gk0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgk0/f;", "Lg75/f0;", "Lgk0/d;", "Lgk0/e;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "imageloader-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class f extends g75.f0<gk0.d, gk0.e> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.graphics.Bitmap I;
        gk0.d dVar = (gk0.d) bVar;
        boolean h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(dVar.f353950c);
        gk0.k kVar = dVar.f353951d;
        byte[] bArr = dVar.f353950c;
        if (h17) {
            byte[] wi6 = ((yq.e) ((gk0.o0) i95.n0.c(gk0.o0.class))).wi(bArr);
            if (wi6 == null || (I = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(wi6, kVar.f353963a, kVar.f353964b, kVar.f353970h)) == null) {
                I = null;
            }
        } else {
            I = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(bArr, kVar.f353963a, kVar.f353964b, kVar.f353970h);
        }
        if (I != null) {
            I = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.B0(I, com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43588x80a06bca(new java.io.ByteArrayInputStream(bArr)));
            float f17 = kVar.f353965c;
            if (f17 > 0.0f) {
                I = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(I, false, f17);
            } else {
                float f18 = kVar.f353966d;
                if (f18 > 0.0f) {
                    I = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(I, false, f18 * I.getWidth());
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonConvertDataToBitmapPPC", "convert to bitmap " + gk0.x.a(I));
        return new gk0.e(dVar.f353949b, I);
    }
}
