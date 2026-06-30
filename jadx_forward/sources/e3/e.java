package e3;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public char f328581a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f328582b;

    public e(char c17, float[] fArr) {
        this.f328581a = c17;
        this.f328582b = fArr;
    }

    public static void a(android.graphics.Path path, float f17, float f18, float f19, float f27, float f28, float f29, float f37, boolean z17, boolean z18) {
        double d17;
        double d18;
        double radians = java.lang.Math.toRadians(f37);
        double cos = java.lang.Math.cos(radians);
        double sin = java.lang.Math.sin(radians);
        double d19 = f17;
        double d27 = f18;
        double d28 = (d19 * cos) + (d27 * sin);
        double d29 = d19;
        double d37 = f28;
        double d38 = d28 / d37;
        double d39 = d27;
        double d47 = f29;
        double d48 = (((-f17) * sin) + (d27 * cos)) / d47;
        double d49 = f27;
        double d57 = ((f19 * cos) + (d49 * sin)) / d37;
        double d58 = (((-f19) * sin) + (d49 * cos)) / d47;
        double d59 = d38 - d57;
        double d66 = d48 - d58;
        double d67 = (d38 + d57) / 2.0d;
        double d68 = (d48 + d58) / 2.0d;
        double d69 = (d59 * d59) + (d66 * d66);
        if (d69 == 0.0d) {
            return;
        }
        double d76 = (1.0d / d69) - 0.25d;
        if (d76 < 0.0d) {
            float sqrt = (float) (java.lang.Math.sqrt(d69) / 1.99999d);
            a(path, f17, f18, f19, f27, f28 * sqrt, f29 * sqrt, f37, z17, z18);
            return;
        }
        double sqrt2 = java.lang.Math.sqrt(d76);
        double d77 = d59 * sqrt2;
        double d78 = sqrt2 * d66;
        if (z17 == z18) {
            d17 = d67 - d78;
            d18 = d68 + d77;
        } else {
            d17 = d67 + d78;
            d18 = d68 - d77;
        }
        double atan2 = java.lang.Math.atan2(d48 - d18, d38 - d17);
        double atan22 = java.lang.Math.atan2(d58 - d18, d57 - d17) - atan2;
        if (z18 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d79 = d17 * d37;
        double d86 = d18 * d47;
        double d87 = (d79 * cos) - (d86 * sin);
        double d88 = (d79 * sin) + (d86 * cos);
        int ceil = (int) java.lang.Math.ceil(java.lang.Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = java.lang.Math.cos(radians);
        double sin2 = java.lang.Math.sin(radians);
        double cos3 = java.lang.Math.cos(atan2);
        double sin3 = java.lang.Math.sin(atan2);
        double d89 = d37;
        double d96 = -d89;
        double d97 = d96 * cos2;
        double d98 = d47 * sin2;
        double d99 = (d97 * sin3) - (d98 * cos3);
        double d100 = d96 * sin2;
        double d101 = d47 * cos2;
        double d102 = (sin3 * d100) + (cos3 * d101);
        double d103 = d100;
        double d104 = atan22 / ceil;
        double d105 = atan2;
        int i17 = 0;
        while (i17 < ceil) {
            double d106 = d105 + d104;
            double sin4 = java.lang.Math.sin(d106);
            double cos4 = java.lang.Math.cos(d106);
            double d107 = d87;
            double d108 = (d87 + ((d89 * cos2) * cos4)) - (d98 * sin4);
            double d109 = d104;
            double d110 = d88 + (d89 * sin2 * cos4) + (d101 * sin4);
            double d111 = (d97 * sin4) - (d98 * cos4);
            double d112 = d103;
            double d113 = (sin4 * d112) + (cos4 * d101);
            double d114 = d106 - d105;
            double tan = java.lang.Math.tan(d114 / 2.0d);
            double sin5 = (java.lang.Math.sin(d114) * (java.lang.Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            double d115 = d101;
            double d116 = d29 + (d99 * sin5);
            double d117 = d89;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) d116, (float) (d39 + (d102 * sin5)), (float) (d108 - (sin5 * d111)), (float) (d110 - (sin5 * d113)), (float) d108, (float) d110);
            i17++;
            d101 = d115;
            cos2 = cos2;
            d39 = d110;
            d105 = d106;
            sin2 = sin2;
            ceil = ceil;
            d89 = d117;
            d102 = d113;
            d99 = d111;
            d103 = d112;
            d104 = d109;
            d29 = d108;
            d87 = d107;
        }
    }

    public static void b(e3.e[] eVarArr, android.graphics.Path path) {
        int i17;
        int i18;
        float[] fArr;
        char c17;
        int i19;
        float f17;
        float f18;
        float f19;
        float f27;
        float f28;
        float f29;
        float f37;
        float f38;
        float f39;
        float f47;
        float f48;
        float f49;
        float f57;
        float f58;
        float f59;
        float f66;
        float f67;
        float f68;
        float f69;
        float f76;
        float f77;
        e3.e[] eVarArr2 = eVarArr;
        int i27 = 6;
        float[] fArr2 = new float[6];
        char c18 = 'm';
        int i28 = 0;
        char c19 = 'm';
        int i29 = 0;
        while (i29 < eVarArr2.length) {
            e3.e eVar = eVarArr2[i29];
            char c27 = eVar.f328581a;
            float[] fArr3 = eVar.f328582b;
            float f78 = fArr2[i28];
            float f79 = fArr2[1];
            float f86 = fArr2[2];
            float f87 = fArr2[3];
            float f88 = fArr2[4];
            float f89 = fArr2[5];
            switch (c27) {
                case 'A':
                case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45662xb48f40dd /* 97 */:
                    i17 = 7;
                    break;
                case 'C':
                case 'c':
                    i17 = i27;
                    break;
                case 'H':
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.l.f34624x366c91de /* 86 */:
                case 'h':
                case 'v':
                    i17 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i17 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f88, f89);
                    f78 = f88;
                    f86 = f78;
                    f79 = f89;
                    f87 = f79;
                    break;
            }
            i17 = 2;
            float f96 = f88;
            float f97 = f89;
            float f98 = f78;
            float f99 = f79;
            int i37 = i28;
            while (i37 < fArr3.length) {
                if (c27 != 'A') {
                    if (c27 != 'C') {
                        if (c27 == 'H') {
                            i18 = i37;
                            fArr = fArr3;
                            c17 = c27;
                            i19 = i29;
                            int i38 = i18 + 0;
                            path.lineTo(fArr[i38], f99);
                            f98 = fArr[i38];
                        } else if (c27 == 'Q') {
                            i18 = i37;
                            fArr = fArr3;
                            c17 = c27;
                            i19 = i29;
                            int i39 = i18 + 0;
                            int i47 = i18 + 1;
                            int i48 = i18 + 2;
                            int i49 = i18 + 3;
                            path.quadTo(fArr[i39], fArr[i47], fArr[i48], fArr[i49]);
                            f17 = fArr[i39];
                            f18 = fArr[i47];
                            f98 = fArr[i48];
                            f99 = fArr[i49];
                        } else if (c27 == 'V') {
                            i18 = i37;
                            fArr = fArr3;
                            c17 = c27;
                            i19 = i29;
                            int i57 = i18 + 0;
                            path.lineTo(f98, fArr[i57]);
                            f99 = fArr[i57];
                        } else if (c27 != 'a') {
                            if (c27 != 'c') {
                                if (c27 == 'h') {
                                    i18 = i37;
                                    int i58 = i18 + 0;
                                    path.rLineTo(fArr3[i58], 0.0f);
                                    f98 += fArr3[i58];
                                } else if (c27 != 'q') {
                                    if (c27 != 'v') {
                                        if (c27 != 'L') {
                                            if (c27 == 'M') {
                                                i18 = i37;
                                                f49 = fArr3[i18 + 0];
                                                f57 = fArr3[i18 + 1];
                                                if (i18 > 0) {
                                                    path.lineTo(f49, f57);
                                                } else {
                                                    path.moveTo(f49, f57);
                                                    f98 = f49;
                                                    f99 = f57;
                                                }
                                            } else if (c27 == 'S') {
                                                i18 = i37;
                                                float f100 = f99;
                                                float f101 = f98;
                                                if (c19 == 'c' || c19 == 's' || c19 == 'C' || c19 == 'S') {
                                                    f58 = (f100 * 2.0f) - f87;
                                                    f59 = (f101 * 2.0f) - f86;
                                                } else {
                                                    f59 = f101;
                                                    f58 = f100;
                                                }
                                                int i59 = i18 + 0;
                                                int i66 = i18 + 1;
                                                int i67 = i18 + 2;
                                                int i68 = i18 + 3;
                                                path.cubicTo(f59, f58, fArr3[i59], fArr3[i66], fArr3[i67], fArr3[i68]);
                                                float f102 = fArr3[i59];
                                                float f103 = fArr3[i66];
                                                f39 = fArr3[i67];
                                                f38 = fArr3[i68];
                                                f86 = f102;
                                                f87 = f103;
                                                f98 = f39;
                                                f99 = f38;
                                            } else if (c27 == 'T') {
                                                i18 = i37;
                                                float f104 = f99;
                                                float f105 = f98;
                                                if (c19 == 'q' || c19 == 't' || c19 == 'Q' || c19 == 'T') {
                                                    f66 = (f105 * 2.0f) - f86;
                                                    f67 = (f104 * 2.0f) - f87;
                                                } else {
                                                    f66 = f105;
                                                    f67 = f104;
                                                }
                                                int i69 = i18 + 0;
                                                int i76 = i18 + 1;
                                                path.quadTo(f66, f67, fArr3[i69], fArr3[i76]);
                                                f87 = f67;
                                                f86 = f66;
                                                fArr = fArr3;
                                                c17 = c27;
                                                i19 = i29;
                                                f98 = fArr3[i69];
                                                f99 = fArr3[i76];
                                            } else if (c27 == 'l') {
                                                i18 = i37;
                                                f47 = f99;
                                                int i77 = i18 + 0;
                                                int i78 = i18 + 1;
                                                path.rLineTo(fArr3[i77], fArr3[i78]);
                                                f98 += fArr3[i77];
                                                f48 = fArr3[i78];
                                            } else if (c27 == c18) {
                                                i18 = i37;
                                                float f106 = fArr3[i18 + 0];
                                                f98 += f106;
                                                float f107 = fArr3[i18 + 1];
                                                f99 += f107;
                                                if (i18 > 0) {
                                                    path.rLineTo(f106, f107);
                                                } else {
                                                    path.rMoveTo(f106, f107);
                                                }
                                            } else if (c27 != 's') {
                                                if (c27 == 't') {
                                                    if (c19 == 'q' || c19 == 't' || c19 == 'Q' || c19 == 'T') {
                                                        f76 = f98 - f86;
                                                        f77 = f99 - f87;
                                                    } else {
                                                        f77 = 0.0f;
                                                        f76 = 0.0f;
                                                    }
                                                    int i79 = i37 + 0;
                                                    int i86 = i37 + 1;
                                                    path.rQuadTo(f76, f77, fArr3[i79], fArr3[i86]);
                                                    f86 = f76 + f98;
                                                    float f108 = f77 + f99;
                                                    f98 += fArr3[i79];
                                                    f99 += fArr3[i86];
                                                    f87 = f108;
                                                }
                                                i18 = i37;
                                            } else {
                                                if (c19 == 'c' || c19 == 's' || c19 == 'C' || c19 == 'S') {
                                                    f68 = f99 - f87;
                                                    f69 = f98 - f86;
                                                } else {
                                                    f69 = 0.0f;
                                                    f68 = 0.0f;
                                                }
                                                int i87 = i37 + 0;
                                                int i88 = i37 + 1;
                                                int i89 = i37 + 2;
                                                int i96 = i37 + 3;
                                                i18 = i37;
                                                f19 = f99;
                                                float f109 = f98;
                                                path.rCubicTo(f69, f68, fArr3[i87], fArr3[i88], fArr3[i89], fArr3[i96]);
                                                f27 = fArr3[i87] + f109;
                                                f28 = fArr3[i88] + f19;
                                                f29 = f109 + fArr3[i89];
                                                f37 = fArr3[i96];
                                            }
                                            f97 = f99;
                                            f96 = f98;
                                        } else {
                                            i18 = i37;
                                            int i97 = i18 + 0;
                                            int i98 = i18 + 1;
                                            path.lineTo(fArr3[i97], fArr3[i98]);
                                            f49 = fArr3[i97];
                                            f57 = fArr3[i98];
                                        }
                                        f98 = f49;
                                        f99 = f57;
                                    } else {
                                        i18 = i37;
                                        f47 = f99;
                                        int i99 = i18 + 0;
                                        path.rLineTo(0.0f, fArr3[i99]);
                                        f48 = fArr3[i99];
                                    }
                                    f99 = f47 + f48;
                                } else {
                                    i18 = i37;
                                    f19 = f99;
                                    float f110 = f98;
                                    int i100 = i18 + 0;
                                    int i101 = i18 + 1;
                                    int i102 = i18 + 2;
                                    int i103 = i18 + 3;
                                    path.rQuadTo(fArr3[i100], fArr3[i101], fArr3[i102], fArr3[i103]);
                                    f27 = fArr3[i100] + f110;
                                    f28 = fArr3[i101] + f19;
                                    float f111 = f110 + fArr3[i102];
                                    float f112 = fArr3[i103];
                                    f29 = f111;
                                    f37 = f112;
                                }
                                fArr = fArr3;
                                c17 = c27;
                                i19 = i29;
                            } else {
                                i18 = i37;
                                f19 = f99;
                                float f113 = f98;
                                int i104 = i18 + 2;
                                int i105 = i18 + 3;
                                int i106 = i18 + 4;
                                int i107 = i18 + 5;
                                path.rCubicTo(fArr3[i18 + 0], fArr3[i18 + 1], fArr3[i104], fArr3[i105], fArr3[i106], fArr3[i107]);
                                f27 = fArr3[i104] + f113;
                                f28 = fArr3[i105] + f19;
                                f29 = f113 + fArr3[i106];
                                f37 = fArr3[i107];
                            }
                            f38 = f19 + f37;
                            f86 = f27;
                            f87 = f28;
                            f39 = f29;
                            f98 = f39;
                            f99 = f38;
                            fArr = fArr3;
                            c17 = c27;
                            i19 = i29;
                        } else {
                            i18 = i37;
                            float f114 = f99;
                            float f115 = f98;
                            int i108 = i18 + 5;
                            int i109 = i18 + 6;
                            fArr = fArr3;
                            c17 = c27;
                            i19 = i29;
                            a(path, f115, f114, fArr3[i108] + f115, fArr3[i109] + f114, fArr3[i18 + 0], fArr3[i18 + 1], fArr3[i18 + 2], fArr3[i18 + 3] != 0.0f, fArr3[i18 + 4] != 0.0f);
                            f98 = f115 + fArr[i108];
                            f99 = f114 + fArr[i109];
                        }
                        i37 = i18 + i17;
                        c19 = c17;
                        c27 = c19;
                        fArr3 = fArr;
                        i29 = i19;
                        c18 = 'm';
                        i28 = 0;
                    } else {
                        i18 = i37;
                        fArr = fArr3;
                        c17 = c27;
                        i19 = i29;
                        int i110 = i18 + 2;
                        int i111 = i18 + 3;
                        int i112 = i18 + 4;
                        int i113 = i18 + 5;
                        path.cubicTo(fArr[i18 + 0], fArr[i18 + 1], fArr[i110], fArr[i111], fArr[i112], fArr[i113]);
                        f98 = fArr[i112];
                        f99 = fArr[i113];
                        f17 = fArr[i110];
                        f18 = fArr[i111];
                    }
                    f86 = f17;
                    f87 = f18;
                    i37 = i18 + i17;
                    c19 = c17;
                    c27 = c19;
                    fArr3 = fArr;
                    i29 = i19;
                    c18 = 'm';
                    i28 = 0;
                } else {
                    i18 = i37;
                    fArr = fArr3;
                    c17 = c27;
                    i19 = i29;
                    int i114 = i18 + 5;
                    int i115 = i18 + 6;
                    a(path, f98, f99, fArr[i114], fArr[i115], fArr[i18 + 0], fArr[i18 + 1], fArr[i18 + 2], fArr[i18 + 3] != 0.0f, fArr[i18 + 4] != 0.0f);
                    f98 = fArr[i114];
                    f99 = fArr[i115];
                }
                f87 = f99;
                f86 = f98;
                i37 = i18 + i17;
                c19 = c17;
                c27 = c19;
                fArr3 = fArr;
                i29 = i19;
                c18 = 'm';
                i28 = 0;
            }
            int i116 = i29;
            int i117 = i28;
            fArr2[i117] = f98;
            fArr2[1] = f99;
            fArr2[2] = f86;
            fArr2[3] = f87;
            fArr2[4] = f96;
            fArr2[5] = f97;
            i29 = i116 + 1;
            i27 = 6;
            c18 = 'm';
            i28 = i117;
            c19 = eVarArr[i116].f328581a;
            eVarArr2 = eVarArr;
        }
    }
}
