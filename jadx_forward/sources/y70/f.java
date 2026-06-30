package y70;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly70/f;", "Lg75/f0;", "Lm70/a;", "Lm70/b;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "feature-img_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class f extends g75.f0<m70.a, m70.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.graphics.Bitmap H;
        m70.a aVar = (m70.a) bVar;
        oi3.f fVar = (oi3.f) zVar.i("key_msg_info");
        float g17 = i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        boolean h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(aVar.f405996c);
        android.graphics.Bitmap bitmap = null;
        byte[] bArr = aVar.f405996c;
        if (h17) {
            byte[] wi6 = ((yq.e) ((gk0.o0) i95.n0.c(gk0.o0.class))).wi(bArr);
            if (wi6 != null && (H = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.H(wi6, 0, 0, g17, null)) != null) {
                bitmap = H;
            }
        } else {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.H(bArr, 0, 0, g17, null);
        }
        m70.h hVar = aVar.f405997d;
        java.lang.String str = aVar.f405995b;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            j15.a b17 = c01.gb.b(fVar);
            int q17 = b17.q();
            int n17 = b17.n();
            if (q17 != 0 && n17 != 0) {
                height = n17;
                width = q17;
            }
            o70.f aj6 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(width, height);
            try {
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bitmap, aj6.f424764a, aj6.f424765b, false);
            } catch (java.lang.IllegalArgumentException | java.lang.OutOfMemoryError unused) {
            }
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.p(bitmap, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgConvertDataToBitmapPPC", "bitmap process imageKey:" + str + " thumbFileType:" + hVar.name() + ' ' + gk0.x.a(bitmap));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgConvertDataToBitmapPPC", "convert to bitmap null");
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20096xb142414d()), 1)) {
            bitmap = y70.a.a(bitmap, hVar);
        }
        return new m70.b(str, bitmap);
    }
}
