package s8;

/* loaded from: classes15.dex */
public final class g implements s8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s8.i f486178a;

    public g(s8.i iVar, s8.f fVar) {
        this.f486178a = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f8, code lost:
    
        throw new m8.x("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r22, int r23, q8.f r24) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.g.a(int, int, q8.f):void");
    }

    public void b(int i17, double d17) {
        s8.i iVar = this.f486178a;
        if (i17 == 181) {
            iVar.f486232t.I = (int) d17;
            return;
        }
        if (i17 == 17545) {
            iVar.f486230r = (long) d17;
            return;
        }
        switch (i17) {
            case 21969:
                iVar.f486232t.f486202w = (float) d17;
                return;
            case 21970:
                iVar.f486232t.f486203x = (float) d17;
                return;
            case 21971:
                iVar.f486232t.f486204y = (float) d17;
                return;
            case 21972:
                iVar.f486232t.f486205z = (float) d17;
                return;
            case 21973:
                iVar.f486232t.A = (float) d17;
                return;
            case 21974:
                iVar.f486232t.B = (float) d17;
                return;
            case 21975:
                iVar.f486232t.C = (float) d17;
                return;
            case 21976:
                iVar.f486232t.D = (float) d17;
                return;
            case 21977:
                iVar.f486232t.E = (float) d17;
                return;
            case 21978:
                iVar.f486232t.F = (float) d17;
                return;
            default:
                iVar.getClass();
                return;
        }
    }

    public void c(int i17, long j17) {
        s8.i iVar = this.f486178a;
        iVar.getClass();
        if (i17 == 20529) {
            if (j17 == 0) {
                return;
            }
            throw new m8.x("ContentEncodingOrder " + j17 + " not supported");
        }
        if (i17 == 20530) {
            if (j17 == 1) {
                return;
            }
            throw new m8.x("ContentEncodingScope " + j17 + " not supported");
        }
        switch (i17) {
            case 131:
                iVar.f486232t.f486182c = (int) j17;
                return;
            case 136:
                iVar.f486232t.L = j17 == 1;
                return;
            case 155:
                iVar.G = iVar.h(j17);
                return;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de /* 159 */:
                iVar.f486232t.G = (int) j17;
                return;
            case 176:
                iVar.f486232t.f486189j = (int) j17;
                return;
            case 179:
                t9.i iVar2 = iVar.B;
                long h17 = iVar.h(j17);
                int i18 = iVar2.f498050a;
                long[] jArr = iVar2.f498051b;
                if (i18 == jArr.length) {
                    iVar2.f498051b = java.util.Arrays.copyOf(jArr, i18 * 2);
                }
                long[] jArr2 = iVar2.f498051b;
                int i19 = iVar2.f498050a;
                iVar2.f498050a = i19 + 1;
                jArr2[i19] = h17;
                return;
            case 186:
                iVar.f486232t.f486190k = (int) j17;
                return;
            case 215:
                iVar.f486232t.f486181b = (int) j17;
                return;
            case 231:
                iVar.A = iVar.h(j17);
                return;
            case 241:
                if (iVar.D) {
                    return;
                }
                t9.i iVar3 = iVar.C;
                int i27 = iVar3.f498050a;
                long[] jArr3 = iVar3.f498051b;
                if (i27 == jArr3.length) {
                    iVar3.f498051b = java.util.Arrays.copyOf(jArr3, i27 * 2);
                }
                long[] jArr4 = iVar3.f498051b;
                int i28 = iVar3.f498050a;
                iVar3.f498050a = i28 + 1;
                jArr4[i28] = j17;
                iVar.D = true;
                return;
            case 251:
                iVar.X = true;
                return;
            case 16980:
                if (j17 == 3) {
                    return;
                }
                throw new m8.x("ContentCompAlgo " + j17 + " not supported");
            case 17029:
                if (j17 < 1 || j17 > 2) {
                    throw new m8.x("DocTypeReadVersion " + j17 + " not supported");
                }
                return;
            case 17143:
                if (j17 == 1) {
                    return;
                }
                throw new m8.x("EBMLReadVersion " + j17 + " not supported");
            case 18401:
                if (j17 == 5) {
                    return;
                }
                throw new m8.x("ContentEncAlgo " + j17 + " not supported");
            case 18408:
                if (j17 == 1) {
                    return;
                }
                throw new m8.x("AESSettingsCipherMode " + j17 + " not supported");
            case 21420:
                iVar.f486235w = j17 + iVar.f486228p;
                return;
            case 21432:
                int i29 = (int) j17;
                if (i29 == 0) {
                    iVar.f486232t.f486195p = 0;
                    return;
                }
                if (i29 == 1) {
                    iVar.f486232t.f486195p = 2;
                    return;
                } else if (i29 == 3) {
                    iVar.f486232t.f486195p = 1;
                    return;
                } else {
                    if (i29 != 15) {
                        return;
                    }
                    iVar.f486232t.f486195p = 3;
                    return;
                }
            case 21680:
                iVar.f486232t.f486191l = (int) j17;
                return;
            case 21682:
                iVar.f486232t.f486193n = (int) j17;
                return;
            case 21690:
                iVar.f486232t.f486192m = (int) j17;
                return;
            case 21930:
                iVar.f486232t.M = j17 == 1;
                return;
            case 22186:
                iVar.f486232t.f486179J = j17;
                return;
            case 22203:
                iVar.f486232t.K = j17;
                return;
            case 25188:
                iVar.f486232t.H = (int) j17;
                return;
            case 2352003:
                iVar.f486232t.f486183d = (int) j17;
                return;
            case 2807729:
                iVar.f486229q = j17;
                return;
            default:
                switch (i17) {
                    case 21945:
                        int i37 = (int) j17;
                        if (i37 == 1) {
                            iVar.f486232t.f486199t = 2;
                            return;
                        } else {
                            if (i37 != 2) {
                                return;
                            }
                            iVar.f486232t.f486199t = 1;
                            return;
                        }
                    case 21946:
                        int i38 = (int) j17;
                        if (i38 != 1) {
                            if (i38 == 16) {
                                iVar.f486232t.f486198s = 6;
                                return;
                            } else if (i38 == 18) {
                                iVar.f486232t.f486198s = 7;
                                return;
                            } else if (i38 != 6 && i38 != 7) {
                                return;
                            }
                        }
                        iVar.f486232t.f486198s = 3;
                        return;
                    case 21947:
                        s8.h hVar = iVar.f486232t;
                        hVar.f486196q = true;
                        int i39 = (int) j17;
                        if (i39 == 1) {
                            hVar.f486197r = 1;
                            return;
                        }
                        if (i39 == 9) {
                            hVar.f486197r = 6;
                            return;
                        } else {
                            if (i39 == 4 || i39 == 5 || i39 == 6 || i39 == 7) {
                                hVar.f486197r = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        iVar.f486232t.f486200u = (int) j17;
                        return;
                    case 21949:
                        iVar.f486232t.f486201v = (int) j17;
                        return;
                    default:
                        return;
                }
        }
    }

    public void d(int i17, java.lang.String str) {
        s8.i iVar = this.f486178a;
        iVar.getClass();
        if (i17 == 134) {
            iVar.f486232t.f486180a = str;
            return;
        }
        if (i17 != 17026) {
            if (i17 != 2274716) {
                return;
            }
            iVar.f486232t.N = str;
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw new m8.x("DocType " + str + " not supported");
        }
    }
}
