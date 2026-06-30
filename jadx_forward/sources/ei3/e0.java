package ei3;

/* loaded from: classes10.dex */
public class e0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.k0 f334571a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ei3.k0 k0Var, android.os.Looper looper) {
        super(looper);
        this.f334571a = k0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        ei3.k0 k0Var = this.f334571a;
        if (k0Var.f334624u == -1) {
            k0Var.f334624u = android.os.Process.myTid();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "writeCameraTid: %s", java.lang.Integer.valueOf(k0Var.f334624u));
        }
        if (message.what == 1) {
            k0Var.f334604a.d();
            byte[] bArr = (byte[]) message.obj;
            if (k0Var.f334626w) {
                k0Var.f334605b.c(bArr, bArr.length, k0Var.f334618o, k0Var.f334619p);
            } else {
                ei3.y0 y0Var = k0Var.f334605b;
                int length = bArr.length;
                int i17 = k0Var.f334620q;
                y0Var.c(bArr, length, (i17 == 0 || i17 == 180) ? k0Var.f334618o : k0Var.f334619p, (i17 == 0 || i17 == 180) ? k0Var.f334619p : k0Var.f334618o);
            }
            ei3.x.f334720d.o(bArr);
            k0Var.D = true;
        }
    }
}
