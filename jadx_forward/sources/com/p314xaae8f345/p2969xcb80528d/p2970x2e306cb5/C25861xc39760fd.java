package com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5;

/* renamed from: com.tencent.tavkit.ciimage.GLBlendStateCache */
/* loaded from: classes10.dex */
class C25861xc39760fd {
    private static final java.lang.String TAG = "GLBlendStateCache";

    /* renamed from: pNames */
    private final int[] f48823xc397acb8 = {32777, 32777, 34877, 32969, 32968, 32971, 32970};

    /* renamed from: params */
    private final int[] f48824xc4aaf986 = new int[7];

    /* renamed from: cache */
    public synchronized void m98385x5a0af82() {
        int i17 = 0;
        while (true) {
            int[] iArr = this.f48823xc397acb8;
            if (i17 < iArr.length) {
                android.opengl.GLES20.glGetIntegerv(iArr[i17], this.f48824xc4aaf986, i17);
                i17++;
            }
        }
    }

    /* renamed from: restore */
    public synchronized void m98386x416ad28e() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "restore: params = " + java.util.Arrays.toString(this.f48824xc4aaf986));
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendEquation(this.f48824xc4aaf986[0]);
        int[] iArr = this.f48824xc4aaf986;
        android.opengl.GLES20.glBlendEquationSeparate(iArr[1], iArr[2]);
        int[] iArr2 = this.f48824xc4aaf986;
        android.opengl.GLES20.glBlendFuncSeparate(iArr2[3], iArr2[4], iArr2[5], iArr2[6]);
    }
}
