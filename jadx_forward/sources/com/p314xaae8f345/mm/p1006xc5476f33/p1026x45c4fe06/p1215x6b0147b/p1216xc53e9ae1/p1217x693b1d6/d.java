package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes15.dex */
public final class d implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l f172412d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar) {
        this.f172412d = lVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public final void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        int i18;
        java.lang.String str = this.f172412d.f172422r;
        java.util.Objects.toString(obj);
        if (201 == i17 && 7 == this.f172412d.f172423s.mo100916xb7d72d0e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172412d.f172422r, "onInfo, buffering end when COMPLETE, notify seek complete");
            this.f172412d.K();
        }
        int i19 = 3;
        int i27 = 0;
        if (i17 == 200) {
            if (!(3 == this.f172412d.f172423s.mo100916xb7d72d0e()) && !this.f172412d.f172428x) {
                i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.m.b(this.f172412d.f172423s);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar = this.f172412d;
                lVar.f172429y = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = lVar.E;
                if (aVar != null) {
                    pk1.r rVar = (pk1.r) aVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "onWaitingBegin");
                    rVar.f437045v = java.lang.System.currentTimeMillis();
                }
                i19 = 701;
                i18 = -1;
            }
            i18 = -1;
            i19 = -1;
        } else if (i17 != 201) {
            if (i17 == 203) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar2 = this.f172412d.E;
                if (aVar2 != null) {
                    pk1.r rVar2 = (pk1.r) aVar2;
                    rVar2.A = j17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar2.f437019a, "updateAudioDecodeType decodeType:%d", java.lang.Long.valueOf(j17));
                }
            } else if (i17 == 204) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar3 = this.f172412d.E;
                if (aVar3 != null) {
                    pk1.r rVar3 = (pk1.r) aVar3;
                    rVar3.B = j17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar3.f437019a, "updateVideoDecodeType decodeType:%d", java.lang.Long.valueOf(j17));
                }
            } else if (i17 != 209) {
                switch (i17) {
                    case 103:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar4 = this.f172412d.E;
                        if (aVar4 != null) {
                            pk1.r rVar4 = (pk1.r) aVar4;
                            if (rVar4.N == 0 && rVar4.f437037n > 0) {
                                rVar4.N = java.lang.System.currentTimeMillis() - rVar4.f437037n;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar4.f437019a, "markAudioDecoderCreateTime costTime:%d", java.lang.Long.valueOf(rVar4.N));
                            break;
                        }
                        break;
                    case 104:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar5 = this.f172412d.E;
                        if (aVar5 != null) {
                            pk1.r rVar5 = (pk1.r) aVar5;
                            if (rVar5.O == 0 && rVar5.f437037n > 0) {
                                rVar5.O = java.lang.System.currentTimeMillis() - rVar5.f437037n;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar5.f437019a, "markVideoDecoderCreateTime costTime:%d", java.lang.Long.valueOf(rVar5.O));
                            break;
                        }
                        break;
                    case 105:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar6 = this.f172412d.E;
                        if (aVar6 != null) {
                            pk1.r rVar6 = (pk1.r) aVar6;
                            if (rVar6.P == 0 && rVar6.f437038o > 0) {
                                rVar6.P = java.lang.System.currentTimeMillis() - rVar6.f437038o;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar6.f437019a, "markFirstAudioFrameRenderedTime costTime:%d", java.lang.Long.valueOf(rVar6.P));
                            break;
                        }
                        break;
                    case 106:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar7 = this.f172412d.E;
                        if (aVar7 != null) {
                            pk1.r rVar7 = (pk1.r) aVar7;
                            if (rVar7.Q == 0 && rVar7.f437038o > 0) {
                                rVar7.Q = java.lang.System.currentTimeMillis() - rVar7.f437038o;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar7.f437019a, "markFirstVideoFrameRenderedTime costTime:%d", java.lang.Long.valueOf(rVar7.Q));
                        }
                        i18 = -1;
                        break;
                }
            } else {
                float f17 = j18 > 0 ? ((float) (100 * j17)) / ((float) j18) : 0.0f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar8 = this.f172412d.E;
                if (aVar8 != null) {
                    pk1.r rVar8 = (pk1.r) aVar8;
                    if (f17 > 0.0f && f17 >= rVar8.S) {
                        rVar8.S = f17;
                    }
                    int i28 = rVar8.R + 1;
                    rVar8.R = i28;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar8.f437019a, "markDropFrame dropFrameCount:%d, dropFrameRate:%f", java.lang.Integer.valueOf(i28), java.lang.Float.valueOf(rVar8.S));
                }
            }
            i18 = -1;
            i19 = -1;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar2 = this.f172412d;
            if (lVar2.f172429y) {
                lVar2.f172429y = false;
                i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.m.b(lVar2.f172423s);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar9 = this.f172412d.E;
                if (aVar9 != null) {
                    pk1.r rVar9 = (pk1.r) aVar9;
                    if (rVar9.f437045v > 0) {
                        rVar9.f437046w += java.lang.System.currentTimeMillis() - rVar9.f437045v;
                        rVar9.f437044u++;
                        rVar9.f437045v = 0L;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar9.f437019a, "onWaitingEnd waitingCount：%d, totalWaitingTime:%d", java.lang.Integer.valueOf(rVar9.f437044u), java.lang.Long.valueOf(rVar9.f437046w));
                }
                i19 = 702;
                i18 = -1;
            }
            i18 = -1;
            i19 = -1;
        }
        if (i18 != i19) {
            this.f172412d.I(i19, i27);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar3 = this.f172412d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC26164x73fc6bc6);
        lVar3.R(interfaceC26164x73fc6bc6, i17, j17, j18, obj);
    }
}
