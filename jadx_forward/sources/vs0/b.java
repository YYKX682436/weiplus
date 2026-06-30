package vs0;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f521362a;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ((r0.height() == 0.0f) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.hardware.camera2.CameraCharacteristics r6, android.graphics.Rect r7) {
        /*
            r5 = this;
            java.lang.String r0 = "mCameraCharacteristics"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "previewRect"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            r5.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7)
            float r1 = r0.width()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L1f
            r1 = r3
            goto L20
        L1f:
            r1 = r4
        L20:
            if (r1 != 0) goto L2f
            float r1 = r0.height()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2c
            r1 = r3
            goto L2d
        L2c:
            r1 = r4
        L2d:
            if (r1 == 0) goto L47
        L2f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "IllegalArgumentException("
            r1.<init>(r2)
            r1.append(r7)
            r7 = 41
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "MicroMsg.CameraFocusCoordinateTrans"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r7)
        L47:
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r7 = r6.get(r7)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r1 = r6.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L5e
            int r1 = r1.intValue()
            goto L60
        L5e:
            r1 = 90
        L60:
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r7)
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L76
            int r6 = r6.intValue()
            if (r6 != 0) goto L76
            goto L77
        L76:
            r3 = r4
        L77:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L83
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L84
        L83:
            r3 = r7
        L84:
            r6.setScale(r3, r7)
            float r7 = (float) r1
            float r7 = -r7
            r6.postRotate(r7)
            r6.mapRect(r0)
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            android.graphics.Matrix$ScaleToFit r1 = android.graphics.Matrix.ScaleToFit.FILL
            r7.setRectToRect(r0, r2, r1)
            r6.setConcat(r7, r6)
            r5.f521362a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.b.<init>(android.hardware.camera2.CameraCharacteristics, android.graphics.Rect):void");
    }
}
