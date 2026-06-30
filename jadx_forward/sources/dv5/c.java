package dv5;

/* loaded from: classes16.dex */
public final class c extends dv5.e {

    /* renamed from: b, reason: collision with root package name */
    public final fv5.b f325570b;

    /* renamed from: c, reason: collision with root package name */
    public int f325571c;

    public c() {
        super(null);
        this.f325570b = new fv5.b();
        this.f325571c = 0;
    }

    @Override // dv5.e
    public void a(int i17, int i18, java.lang.Object obj, int i19, int i27) {
        n(i17);
        int i28 = this.f325571c + 4;
        this.f325571c = i28;
        if (i27 == 1) {
            int length = ((byte[]) obj).length;
            this.f325571c = i28 + (length >> 1) + (length & 1);
        } else if (i27 == 2) {
            this.f325571c = i28 + (((short[]) obj).length * 1);
        } else if (i27 == 4) {
            this.f325571c = i28 + (((int[]) obj).length * 2);
        } else {
            if (i27 != 8) {
                throw new av5.z("bogus element_width: ".concat(ev5.a.b(i27)));
            }
            this.f325571c = i28 + (((long[]) obj).length * 4);
        }
    }

    @Override // dv5.e
    public void b(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39, int i47) {
        n(i17);
        if (i18 != 36 && i18 != 252) {
            switch (i18) {
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                    break;
                default:
                    throw new java.lang.IllegalStateException("unexpected opcode: ".concat(ev5.a.c(i18)));
            }
        }
        this.f325571c += 3;
    }

    @Override // dv5.e
    public void c(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39) {
        n(i17);
        if (i18 != 36) {
            switch (i18) {
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                    break;
                default:
                    throw new java.lang.IllegalStateException("unexpected opcode: ".concat(ev5.a.c(i18)));
            }
        }
        this.f325571c += 3;
    }

    @Override // dv5.e
    public void d(int i17, int i18, int i19, int i27, int i28, int[] iArr) {
        if (i18 != 250) {
            throw new java.lang.IllegalStateException("unexpected opcode: ".concat(ev5.a.c(i18)));
        }
        this.f325571c += 4;
    }

    @Override // dv5.e
    public void e(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        if (i18 != 251) {
            throw new java.lang.IllegalStateException("unexpected opcode: ".concat(ev5.a.c(i18)));
        }
        this.f325571c += 4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0023. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0026. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0029. Please report as an issue. */
    @Override // dv5.e
    public void f(int i17, int i18, int i19, int i27, int i28, long j17, int i29) {
        n(i17);
        if (i18 != 34) {
            if (i18 != 36 && i18 != 38) {
                if (i18 != 39) {
                    if (i18 != 43 && i18 != 44) {
                        if (i18 != 254 && i18 != 255) {
                            switch (i18) {
                                default:
                                    switch (i18) {
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 29:
                                        case 30:
                                            break;
                                        case 19:
                                        case 21:
                                        case 22:
                                        case 25:
                                        case 28:
                                        case 31:
                                            break;
                                        case 20:
                                        case 23:
                                            break;
                                        case 24:
                                            this.f325571c += 5;
                                            return;
                                        case 26:
                                            if (i19 > 65535) {
                                                this.f325571c += 3;
                                                return;
                                            } else {
                                                this.f325571c += 2;
                                                return;
                                            }
                                        case 27:
                                            this.f325571c += 3;
                                            return;
                                        default:
                                            switch (i18) {
                                                default:
                                                    switch (i18) {
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
                                                            break;
                                                        case 110:
                                                        case 111:
                                                        case 112:
                                                        case 113:
                                                        case 114:
                                                            break;
                                                        default:
                                                            throw new java.lang.IllegalStateException("unexpected opcode: ".concat(ev5.a.c(i18)));
                                                    }
                                                case 56:
                                                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                                                case 58:
                                                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                                                case 60:
                                                case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                                                    this.f325571c += 2;
                                            }
                                    }
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                    this.f325571c++;
                                    return;
                            }
                        }
                    }
                }
                this.f325571c++;
                return;
            }
            this.f325571c += 3;
            return;
        }
        this.f325571c += 2;
    }

    @Override // dv5.e
    public void g(int i17, int i18, int i19, int[] iArr) {
        n(i17);
        int i27 = this.f325571c + 4;
        this.f325571c = i27;
        this.f325571c = i27 + (iArr.length * 2);
    }

    @Override // dv5.e
    public void h(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37) {
        n(i17);
        if (i18 != 37 && i18 != 253) {
            switch (i18) {
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                    break;
                default:
                    throw new java.lang.IllegalStateException("unexpected opcode: ".concat(ev5.a.c(i18)));
            }
        }
        this.f325571c += 3;
    }

    @Override // dv5.e
    public void i(int i17, int i18, int[] iArr, int[] iArr2) {
        n(i17);
        int i19 = this.f325571c + 2;
        this.f325571c = i19;
        int length = i19 + (iArr.length * 2);
        this.f325571c = length;
        this.f325571c = length + (iArr2.length * 2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[FALL_THROUGH] */
    @Override // dv5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r1, int r2, int r3, int r4, int r5, long r6, int r8, int r9, int r10) {
        /*
            r0 = this;
            r0.n(r1)
            r1 = 36
            if (r2 == r1) goto L2a
            switch(r2) {
                case 45: goto L23;
                case 46: goto L23;
                case 47: goto L23;
                case 48: goto L23;
                case 49: goto L23;
                default: goto La;
            }
        La:
            switch(r2) {
                case 68: goto L23;
                case 69: goto L23;
                case 70: goto L23;
                case 71: goto L23;
                case 72: goto L23;
                case 73: goto L23;
                case 74: goto L23;
                case 75: goto L23;
                case 76: goto L23;
                case 77: goto L23;
                case 78: goto L23;
                case 79: goto L23;
                case 80: goto L23;
                case 81: goto L23;
                default: goto Ld;
            }
        Ld:
            switch(r2) {
                case 110: goto L2a;
                case 111: goto L2a;
                case 112: goto L2a;
                case 113: goto L2a;
                case 114: goto L2a;
                default: goto L10;
            }
        L10:
            switch(r2) {
                case 144: goto L23;
                case 145: goto L23;
                case 146: goto L23;
                case 147: goto L23;
                case 148: goto L23;
                case 149: goto L23;
                case 150: goto L23;
                case 151: goto L23;
                case 152: goto L23;
                case 153: goto L23;
                case 154: goto L23;
                case 155: goto L23;
                case 156: goto L23;
                case 157: goto L23;
                case 158: goto L23;
                case 159: goto L23;
                case 160: goto L23;
                case 161: goto L23;
                case 162: goto L23;
                case 163: goto L23;
                case 164: goto L23;
                case 165: goto L23;
                case 166: goto L23;
                case 167: goto L23;
                case 168: goto L23;
                case 169: goto L23;
                case 170: goto L23;
                case 171: goto L23;
                case 172: goto L23;
                case 173: goto L23;
                case 174: goto L23;
                case 175: goto L23;
                default: goto L13;
            }
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = ev5.a.c(r2)
            java.lang.String r3 = "unexpected opcode: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2)
            throw r1
        L23:
            int r1 = r0.f325571c
            int r1 = r1 + 2
            r0.f325571c = r1
            goto L30
        L2a:
            int r1 = r0.f325571c
            int r1 = r1 + 3
            r0.f325571c = r1
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dv5.c.j(int, int, int, int, int, long, int, int, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0016. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0019. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[FALL_THROUGH] */
    @Override // dv5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r1, int r2, int r3, int r4, int r5, long r6, int r8, int r9) {
        /*
            r0 = this;
            r0.n(r1)
            r1 = 32
            if (r2 == r1) goto L4a
            r1 = 33
            if (r2 == r1) goto L43
            r1 = 35
            if (r2 == r1) goto L4a
            r1 = 36
            if (r2 == r1) goto L3c
            switch(r2) {
                case 1: goto L43;
                case 2: goto L35;
                case 3: goto L3c;
                case 4: goto L43;
                case 5: goto L35;
                case 6: goto L3c;
                case 7: goto L43;
                case 8: goto L35;
                case 9: goto L3c;
                default: goto L16;
            }
        L16:
            switch(r2) {
                case 50: goto L4a;
                case 51: goto L4a;
                case 52: goto L4a;
                case 53: goto L4a;
                case 54: goto L4a;
                case 55: goto L4a;
                default: goto L19;
            }
        L19:
            switch(r2) {
                case 82: goto L4a;
                case 83: goto L4a;
                case 84: goto L4a;
                case 85: goto L4a;
                case 86: goto L4a;
                case 87: goto L4a;
                case 88: goto L4a;
                case 89: goto L4a;
                case 90: goto L4a;
                case 91: goto L4a;
                case 92: goto L4a;
                case 93: goto L4a;
                case 94: goto L4a;
                case 95: goto L4a;
                default: goto L1c;
            }
        L1c:
            switch(r2) {
                case 110: goto L3c;
                case 111: goto L3c;
                case 112: goto L3c;
                case 113: goto L3c;
                case 114: goto L3c;
                default: goto L1f;
            }
        L1f:
            switch(r2) {
                case 123: goto L43;
                case 124: goto L43;
                case 125: goto L43;
                case 126: goto L43;
                case 127: goto L43;
                case 128: goto L43;
                case 129: goto L43;
                case 130: goto L43;
                case 131: goto L43;
                case 132: goto L43;
                case 133: goto L43;
                case 134: goto L43;
                case 135: goto L43;
                case 136: goto L43;
                case 137: goto L43;
                case 138: goto L43;
                case 139: goto L43;
                case 140: goto L43;
                case 141: goto L43;
                case 142: goto L43;
                case 143: goto L43;
                default: goto L22;
            }
        L22:
            switch(r2) {
                case 176: goto L43;
                case 177: goto L43;
                case 178: goto L43;
                case 179: goto L43;
                case 180: goto L43;
                case 181: goto L43;
                case 182: goto L43;
                case 183: goto L43;
                case 184: goto L43;
                case 185: goto L43;
                case 186: goto L43;
                case 187: goto L43;
                case 188: goto L43;
                case 189: goto L43;
                case 190: goto L43;
                case 191: goto L43;
                case 192: goto L43;
                case 193: goto L43;
                case 194: goto L43;
                case 195: goto L43;
                case 196: goto L43;
                case 197: goto L43;
                case 198: goto L43;
                case 199: goto L43;
                case 200: goto L43;
                case 201: goto L43;
                case 202: goto L43;
                case 203: goto L43;
                case 204: goto L43;
                case 205: goto L43;
                case 206: goto L43;
                case 207: goto L43;
                case 208: goto L4a;
                case 209: goto L4a;
                case 210: goto L4a;
                case 211: goto L4a;
                case 212: goto L4a;
                case 213: goto L4a;
                case 214: goto L4a;
                case 215: goto L4a;
                case 216: goto L4a;
                case 217: goto L4a;
                case 218: goto L4a;
                case 219: goto L4a;
                case 220: goto L4a;
                case 221: goto L4a;
                case 222: goto L4a;
                case 223: goto L4a;
                case 224: goto L4a;
                case 225: goto L4a;
                case 226: goto L4a;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = ev5.a.c(r2)
            java.lang.String r3 = "unexpected opcode: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2)
            throw r1
        L35:
            int r1 = r0.f325571c
            int r1 = r1 + 2
            r0.f325571c = r1
            goto L50
        L3c:
            int r1 = r0.f325571c
            int r1 = r1 + 3
            r0.f325571c = r1
            goto L50
        L43:
            int r1 = r0.f325571c
            int r1 = r1 + 1
            r0.f325571c = r1
            goto L50
        L4a:
            int r1 = r0.f325571c
            int r1 = r1 + 2
            r0.f325571c = r1
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dv5.c.k(int, int, int, int, int, long, int, int):void");
    }

    @Override // dv5.e
    public void l(int i17, int i18, int i19, int i27, int i28, long j17) {
        n(i17);
        if (i18 == -1 || i18 == 0 || i18 == 14) {
            this.f325571c++;
            return;
        }
        if (i18 != 36) {
            switch (i18) {
                case 40:
                    int i29 = this.f325571c;
                    int i37 = i28 - i29;
                    if (i37 == ((byte) i37)) {
                        this.f325571c = i29 + 1;
                        return;
                    } else if (i37 != ((short) i37)) {
                        this.f325571c = i29 + 3;
                        return;
                    } else {
                        this.f325571c = i29 + 2;
                        return;
                    }
                case 41:
                    int i38 = this.f325571c;
                    int i39 = i28 - i38;
                    if (i39 != ((short) i39)) {
                        this.f325571c = i38 + 3;
                        return;
                    } else {
                        this.f325571c = i38 + 2;
                        return;
                    }
                case 42:
                    this.f325571c += 3;
                    return;
                default:
                    switch (i18) {
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                            break;
                        default:
                            throw new java.lang.IllegalStateException("unexpected opcode: ".concat(ev5.a.c(i18)));
                    }
            }
        }
        this.f325571c += 3;
    }

    public int m(int i17) {
        fv5.b bVar = this.f325570b;
        int d17 = bVar.d(i17);
        return d17 < 0 ? i17 : bVar.f348555e[d17];
    }

    public final void n(int i17) {
        int i18 = this.f325571c;
        if (i17 != i18) {
            fv5.b bVar = this.f325570b;
            int i19 = bVar.f348556f;
            if (i19 != 0 && i17 <= bVar.f348554d[i19 - 1]) {
                bVar.f(i17, i18);
                return;
            }
            bVar.f348554d = bVar.a(bVar.f348554d, i19, i17);
            bVar.f348555e = bVar.a(bVar.f348555e, bVar.f348556f, i18);
            bVar.f348556f++;
        }
    }
}
