package dv5;

/* loaded from: classes16.dex */
public abstract class b {
    public static short a(int i17, int i18) {
        if ((i17 & (-256)) != 0) {
            throw new java.lang.IllegalArgumentException("bogus lowByte");
        }
        if ((i18 & (-256)) == 0) {
            return (short) (i17 | (i18 << 8));
        }
        throw new java.lang.IllegalArgumentException("bogus highByte");
    }

    public static short b(int i17, int i18, int i19, int i27) {
        if ((i17 & (-16)) != 0) {
            throw new java.lang.IllegalArgumentException("bogus nibble0");
        }
        if ((i18 & (-16)) != 0) {
            throw new java.lang.IllegalArgumentException("bogus nibble1");
        }
        if ((i19 & (-16)) != 0) {
            throw new java.lang.IllegalArgumentException("bogus nibble2");
        }
        if ((i27 & (-16)) == 0) {
            return (short) (i17 | (i18 << 4) | (i19 << 8) | (i27 << 12));
        }
        throw new java.lang.IllegalArgumentException("bogus nibble3");
    }

    public static void c(dv5.h hVar, dv5.f fVar) {
        int i17 = fVar.f325577e;
        int d17 = d(i17);
        int i18 = 0;
        switch (d17) {
            case 1:
            case 3:
                hVar.b((short) i17);
                return;
            case 2:
                int i19 = fVar.f325579g - hVar.f325569b;
                if (i19 == ((byte) i19)) {
                    hVar.b(a(i17, i19 & 255));
                    return;
                }
                throw new av5.z("Target out of range: " + ev5.a.a(i19) + ", perhaps you need to enable force jumbo mode.");
            case 4:
                int i27 = fVar.f325582j;
                long j17 = fVar.f325580h;
                if (j17 < -8 || j17 > 7) {
                    throw new av5.z("Literal out of range: ".concat(ev5.a.e(j17)));
                }
                hVar.b(a(i17, g(i27, ((int) j17) & 15)));
                return;
            case 5:
                hVar.b(a(i17, fVar.f325582j));
                return;
            case 6:
                hVar.b(a(i17, g(fVar.f325582j, fVar.f325583k)));
                return;
            case 7:
                hVar.c((short) i17, f(fVar.f325579g, hVar.f325569b));
                return;
            case 8:
                hVar.c(a(i17, fVar.f325582j), (short) fVar.f325578f);
                return;
            case 9:
                hVar.c(a(i17, fVar.f325582j), (short) (fVar.f325580h >> (i17 == 21 ? (char) 16 : '0')));
                return;
            case 10:
                short a17 = a(i17, fVar.f325582j);
                long j18 = fVar.f325580h;
                short s17 = (short) j18;
                if (j18 != s17) {
                    throw new av5.z("Literal out of range: ".concat(ev5.a.e(j18)));
                }
                hVar.c(a17, s17);
                return;
            case 11:
                hVar.c(a(i17, fVar.f325582j), f(fVar.f325579g, hVar.f325569b));
                return;
            case 12:
                short a18 = a(i17, fVar.f325582j);
                int i28 = fVar.f325583k;
                long j19 = fVar.f325580h;
                int i29 = (int) j19;
                if (j19 != ((byte) i29)) {
                    throw new av5.z("Literal out of range: ".concat(ev5.a.e(j19)));
                }
                hVar.c(a18, a(i28, i29 & 255));
                return;
            case 13:
                hVar.c(a(i17, g(fVar.f325582j, fVar.f325583k)), (short) fVar.f325578f);
                return;
            case 14:
                short a19 = a(i17, g(fVar.f325582j, fVar.f325583k));
                long j27 = fVar.f325580h;
                short s18 = (short) j27;
                if (j27 != s18) {
                    throw new av5.z("Literal out of range: ".concat(ev5.a.e(j27)));
                }
                hVar.c(a19, s18);
                return;
            case 15:
                hVar.c(a(i17, g(fVar.f325582j, fVar.f325583k)), f(fVar.f325579g, hVar.f325569b));
                return;
            case 16:
                short a27 = a(i17, fVar.f325582j);
                int i37 = fVar.f325583k;
                if ((i37 & (-65536)) != 0) {
                    throw new av5.z("Register B out of range: ".concat(ev5.a.e(i37)));
                }
                hVar.c(a27, (short) i37);
                return;
            case 17:
                hVar.c(a(i17, fVar.f325582j), a(fVar.f325583k, fVar.f325584l));
                return;
            case 18:
                int i38 = fVar.f325579g - hVar.f325569b;
                hVar.d((short) i17, (short) i38, (short) (i38 >> 16));
                return;
            case 19:
                int i39 = fVar.f325578f;
                hVar.d(a(i17, fVar.f325582j), (short) i39, (short) (i39 >> 16));
                return;
            case 20:
                long j28 = fVar.f325580h;
                int i47 = (int) j28;
                if (j28 != i47) {
                    throw new av5.z("Literal out of range: ".concat(ev5.a.e(j28)));
                }
                hVar.d(a(i17, fVar.f325582j), (short) i47, (short) (i47 >> 16));
                return;
            case 21:
                if (i17 == 43 || i17 == 44) {
                    hVar.f325568a.f(fVar.f325579g, hVar.f325569b);
                }
                int i48 = fVar.f325579g - hVar.f325569b;
                hVar.d(a(i17, fVar.f325582j), (short) i48, (short) (i48 >> 16));
                return;
            case 22:
                short s19 = (short) i17;
                int i49 = fVar.f325582j;
                if ((i49 & (-65536)) != 0) {
                    throw new av5.z("Register A out of range: ".concat(ev5.a.e(i49)));
                }
                short s27 = (short) i49;
                int i57 = fVar.f325583k;
                if ((i57 & (-65536)) != 0) {
                    throw new av5.z("Register B out of range: ".concat(ev5.a.e(i57)));
                }
                hVar.d(s19, s27, (short) i57);
                return;
            case 23:
                hVar.d(a(i17, g(fVar.f325586n, fVar.f325581i)), (short) fVar.f325578f, b(fVar.f325582j, fVar.f325583k, fVar.f325584l, fVar.f325585m));
                return;
            case 24:
                short a28 = a(i17, fVar.f325581i);
                short s28 = (short) fVar.f325578f;
                int i58 = fVar.f325582j;
                if ((i58 & (-65536)) != 0) {
                    throw new av5.z("Register A out of range: ".concat(ev5.a.e(i58)));
                }
                hVar.d(a28, s28, (short) i58);
                return;
            case 25:
                long j29 = fVar.f325580h;
                hVar.b(a(i17, fVar.f325582j));
                hVar.b((short) j29);
                hVar.b((short) (j29 >> 16));
                hVar.b((short) (j29 >> 32));
                hVar.b((short) (j29 >> 48));
                return;
            case 26:
                short a29 = a(i17, g(fVar.f325588p, fVar.f325581i));
                short s29 = (short) fVar.f325578f;
                short b17 = b(fVar.f325584l, fVar.f325585m, fVar.f325586n, fVar.f325587o);
                short s37 = (short) fVar.f325589q;
                hVar.b(a29);
                hVar.b(s29);
                hVar.b(b17);
                hVar.b(s37);
                return;
            case 27:
                short a37 = a(i17, fVar.f325581i);
                short s38 = (short) fVar.f325578f;
                int i59 = fVar.f325584l;
                if ((i59 & (-65536)) != 0) {
                    throw new av5.z("Register C out of range: ".concat(ev5.a.e(i59)));
                }
                short s39 = (short) fVar.f325589q;
                hVar.b(a37);
                hVar.b(s38);
                hVar.b((short) i59);
                hVar.b(s39);
                return;
            case 28:
                int[] iArr = fVar.f325591s;
                int a38 = hVar.a();
                hVar.b((short) i17);
                int length = iArr.length;
                if ((length & (-65536)) != 0) {
                    throw new java.lang.IllegalArgumentException("bogus unsigned code unit");
                }
                hVar.b((short) length);
                hVar.e(fVar.f325592t);
                int length2 = iArr.length;
                while (i18 < length2) {
                    hVar.e(iArr[i18] - a38);
                    i18++;
                }
                return;
            case 29:
                int[] iArr2 = fVar.f325590r;
                int[] iArr3 = fVar.f325591s;
                int a39 = hVar.a();
                hVar.b((short) i17);
                int length3 = iArr3.length;
                if ((length3 & (-65536)) != 0) {
                    throw new java.lang.IllegalArgumentException("bogus unsigned code unit");
                }
                hVar.b((short) length3);
                for (int i66 : iArr2) {
                    hVar.e(i66);
                }
                int length4 = iArr3.length;
                while (i18 < length4) {
                    hVar.e(iArr3[i18] - a39);
                    i18++;
                }
                return;
            case 30:
                short s47 = (short) fVar.f325593u;
                hVar.b((short) i17);
                hVar.b(s47);
                hVar.e(fVar.f325595w);
                java.lang.Object obj = fVar.f325594v;
                if (s47 == 1) {
                    boolean z17 = true;
                    int i67 = 0;
                    for (byte b18 : (byte[]) obj) {
                        if (z17) {
                            i67 = b18 & 255;
                            z17 = false;
                        } else {
                            int i68 = (b18 << 8) | i67;
                            hVar.b((short) i68);
                            i67 = i68;
                            z17 = true;
                        }
                    }
                    if (z17) {
                        return;
                    }
                    hVar.b((short) i67);
                    return;
                }
                if (s47 == 2) {
                    short[] sArr = (short[]) obj;
                    int length5 = sArr.length;
                    while (i18 < length5) {
                        hVar.b(sArr[i18]);
                        i18++;
                    }
                    return;
                }
                if (s47 == 4) {
                    int[] iArr4 = (int[]) obj;
                    int length6 = iArr4.length;
                    while (i18 < length6) {
                        hVar.e(iArr4[i18]);
                        i18++;
                    }
                    return;
                }
                if (s47 != 8) {
                    throw new av5.z("bogus element_width: ".concat(ev5.a.b(s47)));
                }
                long[] jArr = (long[]) obj;
                int length7 = jArr.length;
                while (i18 < length7) {
                    hVar.b((short) jArr[i18]);
                    hVar.b((short) (r1 >> 16));
                    hVar.b((short) (r1 >> 32));
                    hVar.b((short) (r1 >> 48));
                    i18++;
                }
                return;
            default:
                throw new av5.z("Unknown instruction format: " + d17);
        }
    }

    public static int d(int i17) {
        if (i17 == 512) {
            return 29;
        }
        if (i17 == 768) {
            return 30;
        }
        switch (i17) {
            case -1:
                return 1;
            case 0:
            case 14:
                return 3;
            case 1:
            case 4:
            case 7:
            case 33:
                return 6;
            case 2:
            case 5:
            case 8:
                return 16;
            case 3:
            case 6:
            case 9:
                return 22;
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 29:
            case 30:
            case 39:
                return 5;
            case 18:
                return 4;
            case 19:
            case 22:
                return 10;
            case 20:
            case 23:
                return 20;
            case 21:
            case 25:
                return 9;
            case 24:
                return 25;
            case 26:
            case 28:
            case 31:
            case 34:
                return 8;
            case 27:
                return 19;
            case 32:
            case 35:
                return 13;
            case 36:
                return 23;
            case 37:
                return 24;
            case 38:
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
            case 44:
                return 21;
            case 40:
                return 2;
            case 41:
                return 7;
            case 42:
                return 18;
            case 45:
            case 46:
            case 47:
            case 48:
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                return 17;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                return 15;
            case 56:
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
            case 58:
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
            case 60:
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                return 11;
            default:
                switch (i17) {
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.k.f34811x366c91de /* 73 */:
                    case 74:
                    case 75:
                    case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33152x107efc1c /* 76 */:
                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51705xc4897837 /* 77 */:
                    case qc1.u.f76443x366c91de /* 78 */:
                    case 79:
                    case 80:
                    case 81:
                        return 17;
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                    case 83:
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.l.f34676x366c91de /* 84 */:
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.q2.f34648x366c91de /* 85 */:
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.l.f34624x366c91de /* 86 */:
                    case 87:
                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45659xd352f050 /* 89 */:
                    case 90:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45661x609425dd /* 91 */:
                    case 92:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45660xcb53804c /* 93 */:
                    case 94:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45664xedca4d42 /* 95 */:
                        return 13;
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45665x7309a58f /* 96 */:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45662xb48f40dd /* 97 */:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                        return 8;
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                        return 23;
                    default:
                        switch (i17) {
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                                return 24;
                            default:
                                switch (i17) {
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                    case 140:
                                    case 141:
                                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd /* 143 */:
                                    case 176:
                                    case 177:
                                    case 178:
                                    case 179:
                                    case 180:
                                    case 181:
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                    case 186:
                                    case 187:
                                    case 188:
                                    case 189:
                                    case 190:
                                    case 191:
                                    case 192:
                                    case 193:
                                    case 194:
                                    case 195:
                                    case 196:
                                    case 197:
                                    case nd1.d1.f72919x366c91de /* 198 */:
                                    case 199:
                                    case 200:
                                    case 201:
                                    case 202:
                                    case 203:
                                    case 204:
                                    case 205:
                                    case 206:
                                    case 207:
                                        return 6;
                                    case 144:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 148:
                                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de /* 149 */:
                                    case 150:
                                    case 151:
                                    case 152:
                                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5 /* 153 */:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de /* 159 */:
                                    case 160:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727 /* 167 */:
                                    case be1.r0.f4232x366c91de /* 168 */:
                                    case be1.r.f4230x366c91de /* 169 */:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case ib1.t.f69911x366c91de /* 173 */:
                                    case 174:
                                    case 175:
                                        return 17;
                                    case 208:
                                    case 209:
                                    case 210:
                                    case 211:
                                    case 212:
                                    case 213:
                                    case 214:
                                    case 215:
                                        return 14;
                                    case 216:
                                    case 217:
                                    case 218:
                                    case 219:
                                    case 220:
                                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23 /* 221 */:
                                    case com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508 /* 222 */:
                                    case 223:
                                    case 224:
                                    case 225:
                                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de /* 226 */:
                                        return 12;
                                    default:
                                        switch (i17) {
                                            case 250:
                                                return 26;
                                            case 251:
                                                return 27;
                                            case 252:
                                                return 23;
                                            case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432 /* 253 */:
                                                return 24;
                                            case 254:
                                            case 255:
                                                return 8;
                                            case 256:
                                                return 28;
                                            default:
                                                return 0;
                                        }
                                }
                        }
                }
        }
    }

    public static int e(int i17) {
        if (i17 == 512 || i17 == 768) {
            return 1;
        }
        switch (i17) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 33:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
            case 58:
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
            case 60:
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                return 1;
            case 26:
            case 27:
                return 3;
            case 28:
            case 31:
            case 32:
            case 34:
            case 35:
            case 36:
            case 37:
                return 2;
            default:
                switch (i17) {
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.k.f34811x366c91de /* 73 */:
                    case 74:
                    case 75:
                    case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33152x107efc1c /* 76 */:
                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51705xc4897837 /* 77 */:
                    case qc1.u.f76443x366c91de /* 78 */:
                    case 79:
                    case 80:
                    case 81:
                        return 1;
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                    case 83:
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.l.f34676x366c91de /* 84 */:
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.q2.f34648x366c91de /* 85 */:
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.l.f34624x366c91de /* 86 */:
                    case 87:
                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45659xd352f050 /* 89 */:
                    case 90:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45661x609425dd /* 91 */:
                    case 92:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45660xcb53804c /* 93 */:
                    case 94:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45664xedca4d42 /* 95 */:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45665x7309a58f /* 96 */:
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45662xb48f40dd /* 97 */:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                        return 5;
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                        return 4;
                    default:
                        switch (i17) {
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                                return 4;
                            default:
                                switch (i17) {
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                    case 140:
                                    case 141:
                                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd /* 143 */:
                                    case 144:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 148:
                                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de /* 149 */:
                                    case 150:
                                    case 151:
                                    case 152:
                                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5 /* 153 */:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de /* 159 */:
                                    case 160:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727 /* 167 */:
                                    case be1.r0.f4232x366c91de /* 168 */:
                                    case be1.r.f4230x366c91de /* 169 */:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case ib1.t.f69911x366c91de /* 173 */:
                                    case 174:
                                    case 175:
                                    case 176:
                                    case 177:
                                    case 178:
                                    case 179:
                                    case 180:
                                    case 181:
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                    case 186:
                                    case 187:
                                    case 188:
                                    case 189:
                                    case 190:
                                    case 191:
                                    case 192:
                                    case 193:
                                    case 194:
                                    case 195:
                                    case 196:
                                    case 197:
                                    case nd1.d1.f72919x366c91de /* 198 */:
                                    case 199:
                                    case 200:
                                    case 201:
                                    case 202:
                                    case 203:
                                    case 204:
                                    case 205:
                                    case 206:
                                    case 207:
                                    case 208:
                                    case 209:
                                    case 210:
                                    case 211:
                                    case 212:
                                    case 213:
                                    case 214:
                                    case 215:
                                    case 216:
                                    case 217:
                                    case 218:
                                    case 219:
                                    case 220:
                                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23 /* 221 */:
                                    case com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508 /* 222 */:
                                    case 223:
                                    case 224:
                                    case 225:
                                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de /* 226 */:
                                        return 1;
                                    default:
                                        switch (i17) {
                                            case 250:
                                            case 251:
                                                return 6;
                                            case 252:
                                            case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432 /* 253 */:
                                                return 7;
                                            case 254:
                                                return 8;
                                            case 255:
                                                return 9;
                                            case 256:
                                                return 1;
                                            default:
                                                return 0;
                                        }
                                }
                        }
                }
        }
    }

    public static short f(int i17, int i18) {
        int i19 = i17 - i18;
        short s17 = (short) i19;
        if (i19 == s17) {
            return s17;
        }
        throw new av5.z("Target out of range: " + ev5.a.a(i19) + ", perhaps you need to enable force jumbo mode.");
    }

    public static int g(int i17, int i18) {
        if ((i17 & (-16)) != 0) {
            throw new java.lang.IllegalArgumentException("bogus lowNibble");
        }
        if ((i18 & (-16)) == 0) {
            return i17 | (i18 << 4);
        }
        throw new java.lang.IllegalArgumentException("bogus highNibble");
    }
}
