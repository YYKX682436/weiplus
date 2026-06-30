package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.DisplayOrientedMeteringPointFactory */
/* loaded from: classes14.dex */
public final class C0490xd9d4fb39 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0549x195d1fd3 {

    /* renamed from: mCameraInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 f934x643e79c0;

    /* renamed from: mDisplay */
    private final android.view.Display f935x1bdcb95;

    /* renamed from: mHeight */
    private final float f936x6a4b7f4;

    /* renamed from: mWidth */
    private final float f937xbefb7959;

    public C0490xd9d4fb39(android.view.Display display, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93, float f17, float f18) {
        this.f937xbefb7959 = f17;
        this.f936x6a4b7f4 = f18;
        this.f935x1bdcb95 = display;
        this.f934x643e79c0 = interfaceC0472xfede5d93;
    }

    /* renamed from: getRelativeCameraOrientation */
    private int m4380x93f13549(boolean z17) {
        try {
            int mo3173x3b4734f9 = this.f934x643e79c0.mo3173x3b4734f9(this.f935x1bdcb95.getRotation());
            return z17 ? (360 - mo3173x3b4734f9) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 : mo3173x3b4734f9;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0549x195d1fd3
    /* renamed from: convertPoint */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.PointF mo4381x2ce0df9d(float r9, float r10) {
        /*
            r8 = this;
            float r0 = r8.f937xbefb7959
            float r1 = r8.f936x6a4b7f4
            androidx.camera.core.CameraInfo r2 = r8.f934x643e79c0
            int r2 = r2.mo3168x5f62de6e()
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            int r3 = r8.m4380x93f13549(r2)
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            if (r3 == r5) goto L22
            if (r3 != r4) goto L1c
            goto L22
        L1c:
            r6 = r10
            r10 = r9
            r9 = r6
            r7 = r1
            r1 = r0
            r0 = r7
        L22:
            if (r3 == r5) goto L30
            r5 = 180(0xb4, float:2.52E-43)
            if (r3 == r5) goto L2e
            if (r3 == r4) goto L2b
            goto L32
        L2b:
            float r10 = r1 - r10
            goto L32
        L2e:
            float r10 = r1 - r10
        L30:
            float r9 = r0 - r9
        L32:
            if (r2 == 0) goto L36
            float r10 = r1 - r10
        L36:
            float r10 = r10 / r1
            float r9 = r9 / r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0490xd9d4fb39.mo4381x2ce0df9d(float, float):android.graphics.PointF");
    }
}
