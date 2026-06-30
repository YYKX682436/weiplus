package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class d implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.l f90879d;

    public d(com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar) {
        this.f90879d = lVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public final void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        int i18;
        java.lang.String str = this.f90879d.f90889r;
        java.util.Objects.toString(obj);
        if (201 == i17 && 7 == this.f90879d.f90890s.getCurrentState()) {
            com.tencent.mars.xlog.Log.i(this.f90879d.f90889r, "onInfo, buffering end when COMPLETE, notify seek complete");
            this.f90879d.K();
        }
        int i19 = 3;
        int i27 = 0;
        if (i17 == 200) {
            if (!(3 == this.f90879d.f90890s.getCurrentState()) && !this.f90879d.f90895x) {
                i27 = com.tencent.mm.plugin.appbrand.video.player.thumb.m.b(this.f90879d.f90890s);
                com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar = this.f90879d;
                lVar.f90896y = true;
                com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = lVar.E;
                if (aVar != null) {
                    pk1.r rVar = (pk1.r) aVar;
                    com.tencent.mars.xlog.Log.i(rVar.f355486a, "onWaitingBegin");
                    rVar.f355512v = java.lang.System.currentTimeMillis();
                }
                i19 = 701;
                i18 = -1;
            }
            i18 = -1;
            i19 = -1;
        } else if (i17 != 201) {
            if (i17 == 203) {
                com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar2 = this.f90879d.E;
                if (aVar2 != null) {
                    pk1.r rVar2 = (pk1.r) aVar2;
                    rVar2.A = j17;
                    com.tencent.mars.xlog.Log.i(rVar2.f355486a, "updateAudioDecodeType decodeType:%d", java.lang.Long.valueOf(j17));
                }
            } else if (i17 == 204) {
                com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar3 = this.f90879d.E;
                if (aVar3 != null) {
                    pk1.r rVar3 = (pk1.r) aVar3;
                    rVar3.B = j17;
                    com.tencent.mars.xlog.Log.i(rVar3.f355486a, "updateVideoDecodeType decodeType:%d", java.lang.Long.valueOf(j17));
                }
            } else if (i17 != 209) {
                switch (i17) {
                    case 103:
                        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar4 = this.f90879d.E;
                        if (aVar4 != null) {
                            pk1.r rVar4 = (pk1.r) aVar4;
                            if (rVar4.N == 0 && rVar4.f355504n > 0) {
                                rVar4.N = java.lang.System.currentTimeMillis() - rVar4.f355504n;
                            }
                            com.tencent.mars.xlog.Log.i(rVar4.f355486a, "markAudioDecoderCreateTime costTime:%d", java.lang.Long.valueOf(rVar4.N));
                            break;
                        }
                        break;
                    case 104:
                        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar5 = this.f90879d.E;
                        if (aVar5 != null) {
                            pk1.r rVar5 = (pk1.r) aVar5;
                            if (rVar5.O == 0 && rVar5.f355504n > 0) {
                                rVar5.O = java.lang.System.currentTimeMillis() - rVar5.f355504n;
                            }
                            com.tencent.mars.xlog.Log.i(rVar5.f355486a, "markVideoDecoderCreateTime costTime:%d", java.lang.Long.valueOf(rVar5.O));
                            break;
                        }
                        break;
                    case 105:
                        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar6 = this.f90879d.E;
                        if (aVar6 != null) {
                            pk1.r rVar6 = (pk1.r) aVar6;
                            if (rVar6.P == 0 && rVar6.f355505o > 0) {
                                rVar6.P = java.lang.System.currentTimeMillis() - rVar6.f355505o;
                            }
                            com.tencent.mars.xlog.Log.i(rVar6.f355486a, "markFirstAudioFrameRenderedTime costTime:%d", java.lang.Long.valueOf(rVar6.P));
                            break;
                        }
                        break;
                    case 106:
                        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar7 = this.f90879d.E;
                        if (aVar7 != null) {
                            pk1.r rVar7 = (pk1.r) aVar7;
                            if (rVar7.Q == 0 && rVar7.f355505o > 0) {
                                rVar7.Q = java.lang.System.currentTimeMillis() - rVar7.f355505o;
                            }
                            com.tencent.mars.xlog.Log.i(rVar7.f355486a, "markFirstVideoFrameRenderedTime costTime:%d", java.lang.Long.valueOf(rVar7.Q));
                        }
                        i18 = -1;
                        break;
                }
            } else {
                float f17 = j18 > 0 ? ((float) (100 * j17)) / ((float) j18) : 0.0f;
                com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar8 = this.f90879d.E;
                if (aVar8 != null) {
                    pk1.r rVar8 = (pk1.r) aVar8;
                    if (f17 > 0.0f && f17 >= rVar8.S) {
                        rVar8.S = f17;
                    }
                    int i28 = rVar8.R + 1;
                    rVar8.R = i28;
                    com.tencent.mars.xlog.Log.i(rVar8.f355486a, "markDropFrame dropFrameCount:%d, dropFrameRate:%f", java.lang.Integer.valueOf(i28), java.lang.Float.valueOf(rVar8.S));
                }
            }
            i18 = -1;
            i19 = -1;
        } else {
            com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar2 = this.f90879d;
            if (lVar2.f90896y) {
                lVar2.f90896y = false;
                i27 = com.tencent.mm.plugin.appbrand.video.player.thumb.m.b(lVar2.f90890s);
                com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar9 = this.f90879d.E;
                if (aVar9 != null) {
                    pk1.r rVar9 = (pk1.r) aVar9;
                    if (rVar9.f355512v > 0) {
                        rVar9.f355513w += java.lang.System.currentTimeMillis() - rVar9.f355512v;
                        rVar9.f355511u++;
                        rVar9.f355512v = 0L;
                    }
                    com.tencent.mars.xlog.Log.i(rVar9.f355486a, "onWaitingEnd waitingCount：%d, totalWaitingTime:%d", java.lang.Integer.valueOf(rVar9.f355511u), java.lang.Long.valueOf(rVar9.f355513w));
                }
                i19 = 702;
                i18 = -1;
            }
            i18 = -1;
            i19 = -1;
        }
        if (i18 != i19) {
            this.f90879d.I(i19, i27);
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar3 = this.f90879d;
        kotlin.jvm.internal.o.d(iTPPlayer);
        lVar3.R(iTPPlayer, i17, j17, j18, obj);
    }
}
