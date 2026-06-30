package ei3;

/* loaded from: classes10.dex */
public class m0 implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.w0 f334645d;

    public m0(ei3.w0 w0Var) {
        this.f334645d = w0Var;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preview callback data is null");
            return false;
        }
        ei3.w0 w0Var = this.f334645d;
        ei3.e1 e1Var = w0Var.f334709p;
        ei3.l lVar = e1Var.f334572a;
        ei3.l lVar2 = ei3.l.Start;
        ei3.l lVar3 = ei3.l.PrepareStop;
        if (lVar != lVar2 && lVar != lVar3) {
            return false;
        }
        if (lVar == lVar3) {
            e1Var.f334572a = ei3.l.WaitStop;
        }
        w0Var.A.a(1L);
        ei3.j jVar = this.f334645d.f334701h;
        if (jVar != null) {
            jVar.d();
        }
        ei3.w0 w0Var2 = this.f334645d;
        if (w0Var2.f334702i != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            obtain.obj = bArr;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = w0Var2.f334713t;
            if (n3Var != null) {
                n3Var.mo50308x2936bf5f(obtain);
            }
        }
        return true;
    }
}
