package ls0;

/* loaded from: classes10.dex */
public final class j implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f402378d;

    public j(ls0.k kVar) {
        this.f402378d = kVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.String str = this.f402378d.f402381b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFrameAvailable, thread:");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(", surface timestamp:");
        android.graphics.SurfaceTexture surfaceTexture2 = this.f402378d.f402387h;
        sb6.append(surfaceTexture2 != null ? java.lang.Long.valueOf(surfaceTexture2.getTimestamp()) : null);
        sb6.append(", drawInOnFrameAvailable:");
        sb6.append(this.f402378d.f402394o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ls0.k kVar = this.f402378d;
        android.graphics.SurfaceTexture surfaceTexture3 = kVar.f402387h;
        if (surfaceTexture3 != null) {
            if (surfaceTexture3.getTimestamp() <= 0) {
                kVar.f402398s++;
            } else {
                kVar.f402398s = 0;
            }
            if (!kVar.f402388i || surfaceTexture3.getTimestamp() > 0) {
                kVar.f402403x = surfaceTexture3.getTimestamp();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f402381b, "first frame available and new timestamp still zero!!");
                if (kVar.f402398s >= 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f402381b, "continue 3 frames pts is zero!!!");
                    kVar.f402394o = false;
                    yz5.a aVar = kVar.f402396q;
                    if (aVar != null) {
                        aVar.mo152xb9724478();
                        return;
                    }
                    return;
                }
            }
            if (!kVar.f402388i) {
                kVar.f402388i = true;
            }
            if (kVar.f402394o) {
                android.graphics.Bitmap bitmap = kVar.f402392m;
                if (bitmap != null) {
                    ls0.k.a(kVar, kVar.f402403x, bitmap, null);
                    return;
                }
                long j17 = kVar.f402403x;
                yz5.l lVar = kVar.f402391l;
                android.graphics.Bitmap bitmap2 = lVar != null ? (android.graphics.Bitmap) lVar.mo146xb9724478(java.lang.Long.valueOf(surfaceTexture3.getTimestamp() / 1000)) : null;
                yz5.l lVar2 = kVar.f402393n;
                ls0.k.a(kVar, j17, bitmap2, lVar2 != null ? (android.graphics.Bitmap) lVar2.mo146xb9724478(java.lang.Long.valueOf(surfaceTexture3.getTimestamp() / 1000)) : null);
            }
        }
    }
}
