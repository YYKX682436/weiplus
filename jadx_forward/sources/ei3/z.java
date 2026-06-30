package ei3;

/* loaded from: classes10.dex */
public class z implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.k0 f334733d;

    public z(ei3.k0 k0Var) {
        this.f334733d = k0Var;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            ei3.k0 k0Var = this.f334733d;
            if (k0Var.f334606c.f334572a == ei3.l.Start) {
                if (!k0Var.f334629z) {
                    k0Var.f334629z = true;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    s75.d.b(new ei3.f0(k0Var, bArr2), "BigSightMediaCodecMP4MuxRecorder_saveThumb");
                }
                if (k0Var.f334623t != null) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = 1;
                    obtain.obj = bArr;
                    k0Var.f334623t.mo50308x2936bf5f(obtain);
                }
                return true;
            }
        }
        return false;
    }
}
