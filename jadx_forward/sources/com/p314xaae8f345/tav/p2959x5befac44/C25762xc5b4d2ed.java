package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.DecoderUtils */
/* loaded from: classes14.dex */
public class C25762xc5b4d2ed {

    /* renamed from: MIME_AUDIO */
    public static final java.lang.String f48021xe83b2beb = "audio/";

    /* renamed from: MIME_VIDEO */
    public static final java.lang.String f48022xe95da490 = "video/";

    /* renamed from: TIMEOUT_US */
    public static final int f48023x7c09825c = 1000;

    /* renamed from: getAudioDuration */
    public static long m97460xd375d3d4(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
        try {
            int m97968x31d73e7a = c25820xcadb1d34.m97968x31d73e7a();
            for (int i17 = 0; i17 < m97968x31d73e7a; i17++) {
                android.media.MediaFormat m97969xe2db7ec = c25820xcadb1d34.m97969xe2db7ec(i17);
                if (m97969xe2db7ec.getString("mime").startsWith("audio/") && m97969xe2db7ec.containsKey("durationUs")) {
                    return m97969xe2db7ec.getLong("durationUs");
                }
            }
            return 0L;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return 0L;
        }
    }

    /* renamed from: getDuration */
    public static long m97461x51e8b0a(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
        try {
            int m97968x31d73e7a = c25820xcadb1d34.m97968x31d73e7a();
            long j17 = 0;
            long j18 = 0;
            for (int i17 = 0; i17 < m97968x31d73e7a; i17++) {
                android.media.MediaFormat m97969xe2db7ec = c25820xcadb1d34.m97969xe2db7ec(i17);
                java.lang.String string = m97969xe2db7ec.getString("mime");
                if (string.startsWith("video/")) {
                    if (m97969xe2db7ec.containsKey("durationUs")) {
                        j17 = m97969xe2db7ec.getLong("durationUs");
                    }
                } else if (string.startsWith("audio/") && m97969xe2db7ec.containsKey("durationUs")) {
                    j18 = m97969xe2db7ec.getLong("durationUs");
                }
            }
            return j17 > 0 ? j17 : j18;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return 0L;
        }
    }

    /* renamed from: getFirstFormat */
    public static android.media.MediaFormat m97463x85cd3991(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34, java.lang.String str) {
        try {
            int m97968x31d73e7a = c25820xcadb1d34.m97968x31d73e7a();
            for (int i17 = 0; i17 < m97968x31d73e7a; i17++) {
                android.media.MediaFormat m97969xe2db7ec = c25820xcadb1d34.m97969xe2db7ec(i17);
                if (m97969xe2db7ec.getString("mime").startsWith(str)) {
                    return m97969xe2db7ec;
                }
            }
            return null;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getFirstTrackIndex */
    public static int m97464x334942e1(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34, java.lang.String str) {
        try {
            int m97968x31d73e7a = c25820xcadb1d34.m97968x31d73e7a();
            for (int i17 = 0; i17 < m97968x31d73e7a; i17++) {
                if (c25820xcadb1d34.m97969xe2db7ec(i17).getString("mime").startsWith(str)) {
                    return i17;
                }
            }
            return -1;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -1;
        }
    }

    /* renamed from: getInputBuffer */
    public static java.nio.ByteBuffer m97465xaa9f9f74(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17) {
        return c25653x39170d61.m96273x7444b660().getInputBuffer(i17);
    }

    /* renamed from: getMatrixAndCropRect */
    public static com.p314xaae8f345.tav.p2959x5befac44.C25778xba47cd4f m97466x118bbc54(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, int i17, float f17, float f18, android.graphics.Point point, android.graphics.Matrix matrix) {
        float f19;
        float f27;
        while (i17 < 0) {
            i17 += 4;
        }
        int i18 = i17 % 4;
        m97469xa52d49d5(matrix, i18, c25732x76648a85.f47833x6be2dc6, c25732x76648a85.f47832xb7389127);
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97470xda86f576 = m97470xda86f576(c25732x76648a85, i18, f18);
        if (f18 <= 0.0f && f17 <= 1.0f) {
            return null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85();
        if (i18 % 2 == 1) {
            c25732x76648a852.f47833x6be2dc6 = c25732x76648a85.f47832xb7389127;
            c25732x76648a852.f47832xb7389127 = c25732x76648a85.f47833x6be2dc6;
        } else {
            c25732x76648a852.f47833x6be2dc6 = c25732x76648a85.f47833x6be2dc6;
            c25732x76648a852.f47832xb7389127 = c25732x76648a85.f47832xb7389127;
        }
        float f28 = m97470xda86f576.f47833x6be2dc6;
        float f29 = c25732x76648a852.f47833x6be2dc6;
        if (f28 != f29) {
            f27 = (f29 - f28) * 0.5f;
            f19 = 0.0f;
        } else {
            float f37 = m97470xda86f576.f47832xb7389127;
            float f38 = c25732x76648a852.f47832xb7389127;
            if (f37 != f38) {
                f19 = (f38 - f37) * 0.5f;
                f27 = 0.0f;
            } else {
                f19 = 0.0f;
                f27 = 0.0f;
            }
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setTranslate(-f27, -f19);
        float f39 = m97470xda86f576.f47833x6be2dc6;
        float f47 = m97470xda86f576.f47832xb7389127;
        float f48 = f39 / f17;
        float f49 = f47 / f17;
        float f57 = (f17 - 1.0f) / f17;
        float f58 = (((-f39) * 0.5f) * f57) - point.x;
        float f59 = (((-f47) * 0.5f) * f57) - point.y;
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        matrix3.setTranslate(f58, f59);
        float f66 = f27 - f58;
        float f67 = f19 - f59;
        matrix2.postConcat(matrix3);
        matrix2.postScale(f17, f17);
        android.graphics.Matrix matrix4 = new android.graphics.Matrix();
        matrix.invert(matrix4);
        android.graphics.RectF rectF = new android.graphics.RectF(f66, f67, f48 + f66, f49 + f67);
        matrix4.mapRect(rectF);
        com.p314xaae8f345.tav.p2959x5befac44.C25778xba47cd4f c25778xba47cd4f = new com.p314xaae8f345.tav.p2959x5befac44.C25778xba47cd4f(rectF.left, rectF.top, rectF.width(), rectF.height());
        float f68 = c25778xba47cd4f.f296867x;
        if (f68 < 0.0f) {
            c25778xba47cd4f.f48185x6be2dc6 += f68;
            c25778xba47cd4f.f296867x = 0.0f;
        }
        float f69 = c25778xba47cd4f.f296868y;
        if (f69 < 0.0f) {
            c25778xba47cd4f.f48184xb7389127 += f69;
            c25778xba47cd4f.f296868y = 0.0f;
        }
        float f76 = c25778xba47cd4f.f296867x;
        if (c25778xba47cd4f.f48185x6be2dc6 + f76 > c25732x76648a85.f47833x6be2dc6) {
            c25778xba47cd4f.f48185x6be2dc6 = c25732x76648a852.f47833x6be2dc6 - f76;
        }
        float f77 = c25778xba47cd4f.f296868y;
        if (c25778xba47cd4f.f48184xb7389127 + f77 > c25732x76648a85.f47832xb7389127) {
            c25778xba47cd4f.f48184xb7389127 = c25732x76648a852.f47832xb7389127 - f77;
        }
        matrix.postConcat(matrix2);
        return c25778xba47cd4f;
    }

    /* renamed from: getOutputBuffer */
    public static java.nio.ByteBuffer m97467x3c33a717(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17) {
        return c25653x39170d61.m96273x7444b660().getOutputBuffer(i17);
    }

    /* renamed from: getPreferMatrix */
    public static android.graphics.Matrix m97468x940ffc67(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852, int i17) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        m97466x118bbc54(c25732x76648a852, i17, 1.0f, 0.0f, new android.graphics.Point(0, 0), matrix);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97470xda86f576 = m97470xda86f576(c25732x76648a852, i17, 0.0f);
        float f17 = m97470xda86f576.f47833x6be2dc6;
        float f18 = c25732x76648a85.f47833x6be2dc6;
        float f19 = (f17 * 1.0f) / f18;
        float f27 = m97470xda86f576.f47832xb7389127;
        float f28 = c25732x76648a85.f47832xb7389127;
        if (f19 > (1.0f * f27) / f28) {
            float f29 = f18 / f17;
            matrix2.setScale(f29, f29);
            matrix2.postTranslate(0.0f, java.lang.Math.round((c25732x76648a85.f47832xb7389127 - (m97470xda86f576.f47832xb7389127 * f29)) * 0.5f));
        } else {
            float f37 = f28 / f27;
            matrix2.setScale(f37, f37);
            matrix2.postTranslate(java.lang.Math.round((c25732x76648a85.f47833x6be2dc6 - (m97470xda86f576.f47833x6be2dc6 * f37)) * 0.5f), 0.0f);
        }
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: getRotationMatrix */
    public static void m97469xa52d49d5(android.graphics.Matrix matrix, int i17, float f17, float f18) {
        float f19;
        float f27;
        float f28;
        int i18 = i17 % 4;
        if (i18 < 0) {
            i18 += 4;
        }
        float f29 = -1.0f;
        if (i18 != 1) {
            if (i18 == 2) {
                f28 = -1.0f;
                f19 = 0.0f;
                f27 = 0.0f;
            } else if (i18 != 3) {
                f29 = 1.0f;
                f28 = 1.0f;
                f19 = 0.0f;
                f17 = 0.0f;
                f18 = 0.0f;
                f27 = 0.0f;
            } else {
                f18 = f17;
                f27 = -1.0f;
                f19 = 1.0f;
                f17 = 0.0f;
                f29 = 0.0f;
            }
            matrix.setValues(new float[]{f29, f19, f17, f27, f28, f18, 0.0f, 0.0f, 1.0f});
        }
        f17 = f18;
        f19 = -1.0f;
        f27 = 1.0f;
        f18 = 0.0f;
        f29 = 0.0f;
        f28 = f29;
        matrix.setValues(new float[]{f29, f19, f17, f27, f28, f18, 0.0f, 0.0f, 1.0f});
    }

    /* renamed from: getTransformedSize */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97470xda86f576(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, int i17, float f17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97177x5a5dd5d = c25732x76648a85.m97177x5a5dd5d();
        if (java.lang.Math.abs(i17) % 2 == 1) {
            float f18 = m97177x5a5dd5d.f47833x6be2dc6;
            m97177x5a5dd5d.f47833x6be2dc6 = m97177x5a5dd5d.f47832xb7389127;
            m97177x5a5dd5d.f47832xb7389127 = f18;
        }
        if (f17 > 0.0f) {
            float f19 = m97177x5a5dd5d.f47833x6be2dc6;
            if ((f19 * 1.0f) / m97177x5a5dd5d.f47832xb7389127 > f17) {
                m97177x5a5dd5d.f47833x6be2dc6 = (int) java.lang.Math.ceil(r2 * f17);
            } else {
                m97177x5a5dd5d.f47832xb7389127 = (int) java.lang.Math.ceil((f19 * 1.0f) / f17);
            }
        }
        return m97177x5a5dd5d;
    }

    /* renamed from: swap */
    private static void m97471x361193(float[] fArr, int i17, int i18) {
        float f17 = fArr[i17];
        fArr[i17] = fArr[i18];
        fArr[i18] = f17;
    }

    /* renamed from: to4x4OpenGL2DMatrix */
    public static float[] m97472x80cb7b57(android.graphics.Matrix matrix) {
        float[] fArr = new float[16];
        if (matrix == null) {
            for (int i17 = 0; i17 < 16; i17++) {
                fArr[i17] = i17 % 4 == 0 ? 1.0f : 0.0f;
            }
        } else {
            float[] fArr2 = new float[9];
            matrix.getValues(fArr2);
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr2[6];
            fArr[4] = fArr2[1];
            fArr[5] = fArr2[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr2[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr2[2];
            fArr[13] = fArr2[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr2[8];
        }
        return fArr;
    }

    /* renamed from: toOpenGL2DMatrix */
    public static float[] m97473xe11f11bd(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        if (matrix == null) {
            for (int i17 = 0; i17 < 9; i17++) {
                fArr[i17] = i17 % 4 == 0 ? 1.0f : 0.0f;
            }
        } else {
            matrix.getValues(fArr);
            m97471x361193(fArr, 1, 3);
            m97471x361193(fArr, 2, 6);
            m97471x361193(fArr, 5, 7);
        }
        return fArr;
    }

    /* renamed from: getAudioDuration */
    public static long m97459xd375d3d4(long j17, int i17, int i18) {
        return (j17 * 1000000) / ((i17 * 2) * i18);
    }

    /* renamed from: getDuration */
    public static long m97462x51e8b0a(java.lang.String str) {
        try {
            com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
            c25820xcadb1d34.m97977x683d6267(str);
            long m97461x51e8b0a = m97461x51e8b0a(c25820xcadb1d34);
            try {
                c25820xcadb1d34.m97973x41012807();
            } catch (java.lang.Error | java.lang.Exception unused) {
            }
            return m97461x51e8b0a;
        } catch (java.lang.Error | java.lang.Exception unused2) {
            return 0L;
        }
    }
}
