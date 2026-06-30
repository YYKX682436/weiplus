package ei3;

/* loaded from: classes10.dex */
public class n0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.w0 f334646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(ei3.w0 w0Var, android.os.Looper looper) {
        super(looper);
        this.f334646a = w0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        byte[] bArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "carson：writeYuvData ");
        if (message.what != 1 || (bArr = (byte[]) message.obj) == null || this.f334646a.f334702i == null) {
            return;
        }
        ei3.w0 w0Var = this.f334646a;
        java.util.Objects.toString(w0Var.f334702i);
        synchronized (w0Var.f334694a) {
            if (w0Var.f334702i != null) {
                w0Var.f334719z.a(1L);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                android.os.SystemClock.elapsedRealtime();
                w0Var.f334702i.h(bArr, bArr.length, w0Var.f334707n, w0Var.f334708o);
                android.os.SystemClock.elapsedRealtime();
                if (!w0Var.f334716w && w0Var.K) {
                    w0Var.f334716w = true;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    s75.d.b(new ei3.v0(w0Var, bArr2), "BigSightMediaCodecMP4MuxRecorder_saveThumb");
                }
                w0Var.D = true;
            }
        }
    }
}
