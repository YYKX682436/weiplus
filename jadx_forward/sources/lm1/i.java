package lm1;

@j95.b
/* loaded from: classes7.dex */
public class i extends i95.w implements fg1.w0 {
    @Override // fg1.w0
    public ye1.e r2(sf.f fVar, final android.os.Handler handler) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17;
        if ((fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) && (m17 = fVar.m()) != null) {
            oe1.b2.a(m17.mo48798x74292566());
        }
        lm1.C29092x3046d8 c29092x3046d8 = new lm1.C29092x3046d8();
        int d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p.d();
        if (-1 != d17) {
            if (d17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandXWebVideoStrategy", "createMediaPlayer, use SysMediaPlayer");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
                return new mk1.u(kz5.c0.i(new ok1.c(handler), ok1.a.f427494a));
            }
            if (d17 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandXWebVideoStrategy", "createMediaPlayer, use ExoMediaPlayer");
                mk1.v vVar = new mk1.v() { // from class: lm1.i$$b
                    @Override // mk1.v
                    public final ye1.r a(mk1.b0 b0Var) {
                        return pk1.q.O.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, handler.getLooper(), false, b0Var);
                    }
                };
                mk1.v vVar2 = new mk1.v() { // from class: lm1.i$$c
                    @Override // mk1.v
                    public final ye1.r a(mk1.b0 b0Var) {
                        return new af1.i0(handler, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p.c(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p.b(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p.a());
                    }
                };
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
                return new mk1.u(kz5.c0.i(new mk1.b(vVar, handler), new mk1.a(vVar2, handler)));
            }
            if (d17 == 5) {
                return c29092x3046d8.r2(fVar, handler);
            }
        }
        return c29092x3046d8.r2(fVar, handler);
    }
}
