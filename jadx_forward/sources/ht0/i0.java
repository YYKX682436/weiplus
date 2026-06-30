package ht0;

/* loaded from: classes10.dex */
public class i0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ht0.o0 f366233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ht0.o0 o0Var, android.os.Looper looper) {
        super(looper);
        this.f366233a = o0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        ht0.o0 o0Var = this.f366233a;
        if (o0Var.f366276u == -1) {
            o0Var.f366276u = android.os.Process.myTid();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "writeCameraTid: %s", java.lang.Integer.valueOf(o0Var.f366276u));
        }
        if (message.what == 1) {
            ht0.a aVar = o0Var.f366256a;
            if (aVar != null) {
                aVar.f334666j = true;
            }
            byte[] bArr = (byte[]) message.obj;
            if (o0Var.f366278w) {
                o0Var.f366257b.c(bArr, bArr.length, o0Var.f366270o, o0Var.f366271p);
            } else {
                ei3.y0 y0Var = o0Var.f366257b;
                int length = bArr.length;
                int i17 = o0Var.f366272q;
                y0Var.c(bArr, length, (i17 == 90 || i17 == 270) ? o0Var.f366270o : o0Var.f366271p, (i17 == 90 || i17 == 270) ? o0Var.f366271p : o0Var.f366270o);
            }
            ei3.x.f334720d.o(bArr);
            o0Var.E = true;
        }
    }
}
