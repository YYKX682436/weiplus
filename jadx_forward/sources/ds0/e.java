package ds0;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f324347d;

    public e(ds0.d0 d0Var) {
        this.f324347d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ds0.d0 d0Var = this.f324347d;
        d0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", "mixMusic onDecodeEnd delay check, isPostEncodeEnd:" + d0Var.f324345v + ", mixCount:" + d0Var.f324346w + ", decodeMusicFrameCount:" + d0Var.f324340q);
        if (d0Var.f324345v) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        d0Var.h(new byte[0], android.os.SystemClock.elapsedRealtime(), true);
    }
}
