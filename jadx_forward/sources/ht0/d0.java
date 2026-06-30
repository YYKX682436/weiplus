package ht0;

/* loaded from: classes10.dex */
public class d0 implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.o0 f366223d;

    public d0(ht0.o0 o0Var) {
        this.f366223d = o0Var;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            ht0.o0 o0Var = this.f366223d;
            if (o0Var.f366258c.f334572a == ei3.l.Start) {
                if (!o0Var.A) {
                    o0Var.A = true;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    ((ku5.t0) ku5.t0.f394148d).g(new ht0.j0(o0Var, bArr2));
                }
                if (this.f366223d.f366275t != null) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = 1;
                    obtain.obj = bArr;
                    this.f366223d.f366275t.mo50308x2936bf5f(obtain);
                }
                return true;
            }
        }
        return false;
    }
}
