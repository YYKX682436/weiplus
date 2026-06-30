package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.CGMathFunctions */
/* loaded from: classes14.dex */
public class C25675xf530736f {
    /* renamed from: initGLViewportDefault */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m96702xde551406(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852) {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(new android.graphics.PointF((c25732x76648a85.f47833x6be2dc6 - c25732x76648a852.f47833x6be2dc6) / 2.0f, (c25732x76648a85.f47832xb7389127 - c25732x76648a852.f47832xb7389127) / 2.0f), c25732x76648a852);
    }

    /* renamed from: initGLViewportFill */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m96703x182415de(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852) {
        float f17;
        float f18 = c25732x76648a852.f47832xb7389127;
        float f19 = c25732x76648a852.f47833x6be2dc6;
        float f27 = c25732x76648a85.f47832xb7389127;
        float f28 = c25732x76648a85.f47833x6be2dc6;
        float f29 = 0.0f;
        if (f28 / f27 > f19 / f18) {
            float f37 = (f18 * f28) / f19;
            f17 = (f27 - f37) / 2.0f;
            f27 = f37;
        } else {
            float f38 = (f19 * f27) / f18;
            f29 = (f28 - f38) / 2.0f;
            f28 = f38;
            f17 = 0.0f;
        }
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(new android.graphics.PointF(f29, f17), new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(f28, f27));
    }

    /* renamed from: initGLViewportFit */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m96704x8d2a7456(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852) {
        float f17;
        float f18 = c25732x76648a852.f47832xb7389127;
        float f19 = c25732x76648a852.f47833x6be2dc6;
        float f27 = c25732x76648a85.f47832xb7389127;
        float f28 = c25732x76648a85.f47833x6be2dc6;
        float f29 = 0.0f;
        if (f28 / f27 > f19 / f18) {
            float f37 = (f19 * f27) / f18;
            f29 = (f28 - f37) / 2.0f;
            f28 = f37;
            f17 = 0.0f;
        } else {
            float f38 = (f18 * f28) / f19;
            f17 = (f27 - f38) / 2.0f;
            f27 = f38;
        }
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(new android.graphics.PointF(f29, f17), new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(f28, f27));
    }

    /* renamed from: rectFill */
    private static com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m96705xd08f3187(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x766404682) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96707x32756124 = m96707x32756124(c25731x76640468.f47830x35e001, c25731x766404682.f47830x35e001);
        android.graphics.PointF pointF = c25731x766404682.f47829xc3e1af26;
        float f17 = pointF.x;
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = c25731x766404682.f47830x35e001;
        float f18 = c25732x76648a85.f47833x6be2dc6;
        float f19 = m96707x32756124.f47833x6be2dc6;
        float f27 = pointF.y;
        float f28 = c25732x76648a85.f47832xb7389127;
        float f29 = m96707x32756124.f47832xb7389127;
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(f17 + ((f18 - f19) / 2.0f), f27 + ((f28 - f29) / 2.0f), f19, f29);
    }

    /* renamed from: rectFit */
    private static com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m96706x4088bf8d(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x766404682) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96708x7d7fa850 = m96708x7d7fa850(c25731x76640468.f47830x35e001, c25731x766404682.f47830x35e001);
        android.graphics.PointF pointF = c25731x766404682.f47829xc3e1af26;
        float f17 = pointF.x;
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = c25731x766404682.f47830x35e001;
        float f18 = c25732x76648a85.f47833x6be2dc6;
        float f19 = m96708x7d7fa850.f47833x6be2dc6;
        float f27 = pointF.y;
        float f28 = c25732x76648a85.f47832xb7389127;
        float f29 = m96708x7d7fa850.f47832xb7389127;
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(f17 + ((f18 - f19) / 2.0f), f27 + ((f28 - f29) / 2.0f), f19, f29);
    }

    /* renamed from: sizeFill */
    private static com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96707x32756124(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97177x5a5dd5d = c25732x76648a852.m97177x5a5dd5d();
        float f17 = c25732x76648a852.f47833x6be2dc6;
        float f18 = c25732x76648a85.f47833x6be2dc6;
        float f19 = f17 / f18;
        float f27 = c25732x76648a852.f47832xb7389127;
        float f28 = c25732x76648a85.f47832xb7389127;
        float f29 = f27 / f28;
        if (f29 > f19) {
            m97177x5a5dd5d.f47833x6be2dc6 = f29 * f18;
        } else if (f19 > f29) {
            m97177x5a5dd5d.f47832xb7389127 = f19 * f28;
        }
        return m97177x5a5dd5d;
    }

    /* renamed from: sizeFit */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96708x7d7fa850(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97177x5a5dd5d = c25732x76648a852.m97177x5a5dd5d();
        float f17 = c25732x76648a852.f47833x6be2dc6 / c25732x76648a85.f47833x6be2dc6;
        float f18 = c25732x76648a852.f47832xb7389127 / c25732x76648a85.f47832xb7389127;
        if (f18 < f17) {
            m97177x5a5dd5d.f47833x6be2dc6 = java.lang.Math.round(f18 * r2);
        } else if (f17 < f18) {
            m97177x5a5dd5d.f47832xb7389127 = java.lang.Math.round(f17 * r4);
        }
        return m97177x5a5dd5d;
    }

    /* renamed from: transformByScaleFitRect */
    public static android.graphics.Matrix m96709x8b91b16e(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x766404682) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = c25731x766404682.f47830x35e001;
        float f17 = c25732x76648a85.f47833x6be2dc6;
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852 = c25731x76640468.f47830x35e001;
        matrix.postScale(f17 / c25732x76648a852.f47833x6be2dc6, c25732x76648a85.f47832xb7389127 / c25732x76648a852.f47832xb7389127);
        return matrix;
    }

    /* renamed from: transformBySourceRectFill */
    public static android.graphics.Matrix m96710xee12fe85(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x766404682) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m96705xd08f3187 = m96705xd08f3187(c25731x76640468, c25731x766404682);
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = m96705xd08f3187.f47830x35e001;
        float f17 = c25732x76648a85.f47833x6be2dc6;
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852 = c25731x76640468.f47830x35e001;
        float f18 = f17 / c25732x76648a852.f47833x6be2dc6;
        float f19 = c25732x76648a85.f47832xb7389127 / c25732x76648a852.f47832xb7389127;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(f18, f19);
        android.graphics.PointF pointF = m96705xd08f3187.f47829xc3e1af26;
        float f27 = pointF.x;
        android.graphics.PointF pointF2 = c25731x76640468.f47829xc3e1af26;
        matrix.postTranslate(f27 - (pointF2.x * f18), pointF.y - (pointF2.y * f19));
        return matrix;
    }

    /* renamed from: transformBySourceRectFit */
    public static android.graphics.Matrix m96711x30f85acf(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x766404682) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m96706x4088bf8d = m96706x4088bf8d(c25731x76640468, c25731x766404682);
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = m96706x4088bf8d.f47830x35e001;
        float f17 = c25732x76648a85.f47833x6be2dc6;
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852 = c25731x76640468.f47830x35e001;
        float f18 = f17 / c25732x76648a852.f47833x6be2dc6;
        float f19 = c25732x76648a85.f47832xb7389127 / c25732x76648a852.f47832xb7389127;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.PointF pointF = m96706x4088bf8d.f47829xc3e1af26;
        float f27 = pointF.x;
        android.graphics.PointF pointF2 = c25731x76640468.f47829xc3e1af26;
        float f28 = f27 - (pointF2.x * f18);
        float f29 = pointF.y - (pointF2.y * f19);
        matrix.postScale(f18, f19);
        matrix.postTranslate(f28, f29);
        return matrix;
    }
}
