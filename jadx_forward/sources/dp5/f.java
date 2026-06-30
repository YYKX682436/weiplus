package dp5;

/* loaded from: classes14.dex */
public interface f extends java.io.Closeable {
    static void n(dp5.f fVar, int i17, int i18, int i19, java.nio.Buffer buffer, int i27, int i28, int i29, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: allocTextureMem");
        }
        int i37 = (i29 & 4) != 0 ? 6408 : i19;
        java.nio.Buffer buffer2 = (i29 & 8) != 0 ? null : buffer;
        int i38 = (i29 & 16) != 0 ? 9729 : i27;
        int i39 = (i29 & 32) != 0 ? 10497 : i28;
        dp5.a aVar = (dp5.a) fVar;
        if (i17 == aVar.f323806e && i18 == aVar.f323807f && i37 == aVar.f323808g && buffer2 == null) {
            return;
        }
        int i47 = aVar.f323809h;
        aVar.f323809h = i47 + 1;
        if (i47 % 50 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvOp", aVar.hashCode() + " allocTexMem, width:" + i17 + ", height:" + i18 + ", internalFormat:" + i37 + ", ");
        }
        android.opengl.GLES20.glBindTexture(3553, aVar.f323805d);
        android.opengl.GLES20.glTexImage2D(3553, 0, i37, i17, i18, 0, i37, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, buffer2);
        float f17 = i38;
        android.opengl.GLES20.glTexParameterf(3553, 10241, f17);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, f17);
        float f18 = i39;
        android.opengl.GLES20.glTexParameterf(3553, 10242, f18);
        android.opengl.GLES20.glTexParameterf(3553, 10243, f18);
        aVar.f323806e = i17;
        aVar.f323807f = i18;
        aVar.f323808g = i37;
    }
}
