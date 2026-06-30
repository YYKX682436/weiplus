package ko4;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko4.l f391608d;

    public h(ko4.l lVar) {
        this.f391608d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ko4.l lVar = this.f391608d;
        ko4.d dVar = lVar.f391623k;
        if (dVar != null) {
            android.opengl.GLES20.glDeleteTextures(3, new int[]{dVar.f391591j, dVar.f391592k, dVar.f391593l}, 0);
            android.opengl.GLES20.glDeleteProgram(dVar.f391584c);
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = lVar.f391615c;
        if (c25779x3338e719 != null) {
            c25779x3338e719.mo97551x41012807();
        }
        lVar.f391613a.quit();
        com.p314xaae8f345.mm.p871x7fa16b7e.C10909x8b10b9c6.m46877x62cd7fac(lVar.f391624l);
        lVar.f391624l = 0L;
    }
}
