package nt3;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.k f421323d;

    public i(nt3.k kVar) {
        this.f421323d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.p pVar;
        float f17;
        float f18;
        nt3.k kVar = this.f421323d;
        kVar.E += kVar.F;
        nt3.f0 f0Var = kVar.C;
        f0Var.b();
        yz5.l lVar = kVar.H;
        android.graphics.Bitmap bitmap = lVar != null ? (android.graphics.Bitmap) lVar.mo146xb9724478(java.lang.Long.valueOf(kVar.E * 1000)) : null;
        if (bitmap != null) {
            f0Var.getClass();
            nt3.b0 b0Var = f0Var.f421319f;
            android.opengl.GLES20.glUseProgram(b0Var.f421241a);
            int i17 = f0Var.f421314a;
            int i18 = f0Var.f421315b;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            java.lang.System.currentTimeMillis();
            float f19 = i17;
            float f27 = width;
            float f28 = f19 / f27;
            float f29 = i18;
            float f37 = height;
            float f38 = f29 / f37;
            float[] fArr = b0Var.f421279c;
            float[] copyOf = java.util.Arrays.copyOf(fArr, fArr.length);
            float[] fArr2 = b0Var.f421278b;
            float[] copyOf2 = java.util.Arrays.copyOf(fArr2, fArr2.length);
            if (f28 < f38) {
                f18 = f37 * f28;
                f17 = f19;
            } else {
                f17 = f28 > f38 ? f27 * f38 : f19;
                f18 = f29;
            }
            float f39 = f17 / f19;
            float f47 = 0.0f - f39;
            float f48 = f18 / f29;
            float f49 = 0.0f - f48;
            copyOf[0] = 0.0f;
            copyOf[1] = 1.0f;
            copyOf[2] = 1.0f;
            copyOf[3] = 1.0f;
            copyOf[4] = 0.0f;
            copyOf[5] = 0.0f;
            copyOf[6] = 1.0f;
            copyOf[7] = 0.0f;
            copyOf2[0] = f47;
            copyOf2[1] = f49;
            copyOf2[3] = f39;
            copyOf2[4] = f49;
            copyOf2[6] = f47;
            copyOf2[7] = f48;
            copyOf2[9] = f39;
            copyOf2[10] = f48;
            java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(copyOf2.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            b0Var.f421280d = asFloatBuffer;
            asFloatBuffer.put(copyOf2).position(0);
            android.opengl.GLES20.glVertexAttribPointer(0, 3, 5126, false, 0, (java.nio.Buffer) b0Var.f421280d);
            android.opengl.GLES20.glEnableVertexAttribArray(0);
            java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(copyOf.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            b0Var.f421281e = asFloatBuffer2;
            asFloatBuffer2.put(copyOf).position(0);
            android.opengl.GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (java.nio.Buffer) b0Var.f421281e);
            android.opengl.GLES20.glEnableVertexAttribArray(1);
            java.lang.System.currentTimeMillis();
            android.opengl.GLES20.glActiveTexture(33984);
            int b17 = b0Var.b(bitmap, f0Var.f421320g, false);
            f0Var.f421320g = b17;
            android.opengl.GLES20.glBindTexture(3553, b17);
            android.opengl.GLES20.glUniform1f(b0Var.f421282f, 0);
            android.opengl.GLES20.glUniformMatrix4fv(b0Var.f421283g, 1, false, b0Var.f421284h, 0);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
        }
        long j17 = kVar.E * 1000000;
        nt3.f fVar = kVar.D;
        rs0.h hVar = fVar.f421311d;
        if (hVar != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f480825a, hVar.f480826b, j17);
        }
        fVar.getClass();
        rs0.g gVar = rs0.i.f480829a;
        rs0.h hVar2 = fVar.f421311d;
        gVar.x(hVar2.f480825a, hVar2.f480826b);
        yz5.r rVar = kVar.f347771h;
        if (rVar != null) {
        }
        if (!kVar.A && (pVar = kVar.I) != null) {
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, kVar.f421325J);
        }
        if (kVar.E >= 15000) {
            kVar.G = true;
            yz5.a aVar = kVar.f347772i;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }
}
