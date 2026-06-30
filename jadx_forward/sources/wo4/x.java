package wo4;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f529826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wo4.y yVar) {
        super(0);
        this.f529826d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.media.MediaFormat mediaFormat;
        boolean z17;
        java.lang.String str;
        fs0.f lVar;
        boolean z18;
        wo4.y yVar = this.f529826d;
        int i17 = yVar.f529829c.f243948a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1 l1Var = yVar.f529828b;
        if (l1Var.f257199k <= 0) {
            l1Var.f257199k = 1;
        }
        if (l1Var.f257198j <= 0) {
            l1Var.f257198j = 44100;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(yVar.f529836j)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "local has no music ,musicPath:" + yVar.f529836j + "  and set Mute");
            yVar.f529837k = true;
        } else if (yVar.f529828b.f257190b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "mix silent, ignore remuxMusic");
            yVar.f529837k = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "remuxMusic, mixType:" + yVar.f529828b.f257190b + " musicPath:" + yVar.f529836j);
            java.lang.String str2 = yVar.f529836j;
            if (str2 != null) {
                hs0.a aVar = new hs0.a(str2);
                if (aVar.f366090k) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMusicMediaExtractorCreateFailed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 15L, 1L);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VLogRemuxer", "markRemuxMusicMediaExtractorCreateFailed");
                    yVar.f529837k = true;
                    yVar.b();
                    yz5.r rVar = yVar.f529845s;
                    if (rVar != null) {
                        rVar.C("", "", java.lang.Boolean.FALSE, 2);
                    }
                } else {
                    yVar.f529834h = aVar;
                    mediaFormat = aVar.f366085f;
                }
            } else {
                mediaFormat = null;
            }
            wo4.g gVar = new wo4.g(yVar.f529827a.f257207b);
            if (yVar.f529828b.f257190b == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "mix background, delete musicFile:" + yVar.f529836j);
                dw3.c0.f325715a.j(yVar.f529836j);
                yVar.f529836j = null;
                hs0.a aVar2 = yVar.f529834h;
                if (aVar2 != null) {
                    aVar2.d();
                }
                yVar.f529834h = null;
                mediaFormat = gVar.A;
            }
            if (yVar.f529828b.f257190b == 3) {
                if (!gVar.f529795v.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "has video mix all");
                    yVar.f529828b.f257190b = 3;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "do not have video mix music");
                    yVar.f529828b.f257190b = 2;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1 l1Var2 = yVar.f529828b;
            ds0.d0 d0Var = new ds0.d0(l1Var2.f257190b, l1Var2.f257198j, l1Var2.f257199k, new wo4.n(yVar));
            yVar.f529835i = d0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l1 l1Var3 = yVar.f529828b;
            if (l1Var3.f257190b == 2) {
                d0Var.j(null, yVar.f529834h, 0L, l1Var3.f257189a);
                gVar.e();
                z17 = false;
            } else {
                z17 = false;
                hs0.a aVar3 = yVar.f529834h;
                long j17 = l1Var3.f257189a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "initWithBackgroundDecoder, backgroundDecoder:" + gVar + ", music:" + aVar3 + ", startTime:0, endTime:" + j17);
                try {
                    d0Var.f324329f = gVar;
                    gVar.f347748e = new ds0.t(d0Var);
                    gVar.f347749f = new ds0.u(d0Var);
                    if (aVar3 != null) {
                        try {
                            if (fp.h.a(23)) {
                                str = "MicroMsg.MediaCodecAACCodec";
                                lVar = new fs0.h(aVar3, "music", 0L, j17 - 0, new ds0.v(d0Var), new ds0.w(d0Var));
                            } else {
                                str = "MicroMsg.MediaCodecAACCodec";
                                d0Var.f324343t = true;
                                lVar = new fs0.l(aVar3, "music", 0L, j17 - 0, new ds0.x(d0Var), new ds0.y(d0Var));
                            }
                            d0Var.f324328e = lVar;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e, "", new java.lang.Object[0]);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACDecoderInitFailed");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 22L, 1L);
                            throw e;
                        }
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str = "MicroMsg.MediaCodecAACCodec";
                }
            }
            if ((mediaFormat == null || mediaFormat.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63)) ? z17 : true) {
                mediaFormat.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, yVar.f529828b.f257195g);
            }
            if (mediaFormat != null) {
                mediaFormat.setInteger("channel-count", yVar.f529828b.f257199k);
            }
            if (mediaFormat != null) {
                ds0.d0 d0Var2 = yVar.f529835i;
                if (d0Var2 != null) {
                    d0Var2.k(mediaFormat);
                }
                z18 = true;
            } else {
                z18 = z17;
            }
            if (z18) {
                ds0.d0 d0Var3 = yVar.f529835i;
                if (d0Var3 != null) {
                    d0Var3.m(new wo4.o(yVar));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VLogRemuxer", "remuxMusic cannot init encoder, return");
                hs0.a aVar4 = yVar.f529834h;
                if (aVar4 != null) {
                    aVar4.d();
                }
                yVar.f529837k = true;
                yVar.c();
            }
        }
        return jz5.f0.f384359a;
    }
}
