package wq4;

/* loaded from: classes14.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 f530227d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65) {
        this.f530227d = c18924x4c862f65;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "onSurfaceDestroyed release renderer");
        ar4.b bVar = this.f530227d.f258596k;
        if (bVar != null) {
            synchronized (bVar) {
                if (bVar.f94933d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilterRenderer", "%s do destroy", java.lang.Integer.valueOf(bVar.hashCode()));
                    bVar.getClass();
                    os0.e eVar = bVar.f94932c;
                    if (eVar != null) {
                        eVar.n();
                        bVar.f94932c = null;
                    }
                    is0.c[] cVarArr = {null, null, null, null, null};
                    for (int i18 = 0; i18 < 5; i18++) {
                        is0.c cVar = cVarArr[i18];
                        if (cVar != null) {
                            cVar.close();
                        }
                    }
                    android.opengl.GLES20.glDeleteProgram(0);
                    android.opengl.GLES20.glDeleteProgram(0);
                    bVar.getClass();
                    android.opengl.GLES20.glBindTexture(3553, 0);
                    android.opengl.GLES20.glBindFramebuffer(36160, 0);
                    android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    android.opengl.GLES20.glClear(16640);
                    android.opengl.GLES20.glFinish();
                    java.nio.ByteBuffer byteBuffer = bVar.f94930a;
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                    }
                    java.nio.ByteBuffer byteBuffer2 = bVar.f94931b;
                    if (byteBuffer2 != null) {
                        byteBuffer2.clear();
                    }
                    bVar.f94930a = null;
                    bVar.f94931b = null;
                    bVar.f94933d = false;
                }
            }
        }
        br4.g gVar = this.f530227d.f258597l;
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderer", "%s do destroy", java.lang.Integer.valueOf(gVar.hashCode()));
            if (gVar.f105255a != null) {
                gVar.f105255a.f();
            }
            if (gVar.f105256b != null) {
                br4.b bVar2 = gVar.f105256b;
                synchronized (bVar2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipGLHProgram", "%s do destroy", java.lang.Integer.valueOf(bVar2.hashCode()));
                    android.opengl.GLES20.glDeleteProgram(bVar2.f105220a);
                    bVar2.f105220a = -1;
                }
            }
            gVar.f105255a = null;
            gVar.f105256b = null;
        }
        p05.l4 l4Var = this.f530227d.f258598m;
        if (l4Var != null) {
            l4Var.o();
            this.f530227d.f258598m = null;
        }
    }
}
