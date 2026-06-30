package fi3;

/* loaded from: classes10.dex */
public class b implements fi3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi3.e f344486a;

    public b(fi3.e eVar) {
        this.f344486a = eVar;
    }

    @Override // fi3.p
    public void a(byte[] bArr, boolean z17, long j17) {
        fi3.e eVar = this.f344486a;
        if (eVar.f344508v == null) {
            int i17 = pu5.i.f440006b;
            eVar.f344508v = pu5.f.a("remuxer_encode", -2);
            eVar.f344508v.start();
            eVar.f344509w = new fi3.d(eVar, eVar.f344508v.getLooper());
        }
        if (eVar.f344509w != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            byte[] m17 = bArr != null ? ei3.x.f334720d.m(java.lang.Integer.valueOf(bArr.length)) : null;
            if (m17 != null) {
                java.lang.System.arraycopy(bArr, 0, m17, 0, m17.length);
            }
            obtain.obj = m17;
            obtain.arg1 = z17 ? 1 : 0;
            obtain.arg2 = (int) j17;
            eVar.f344509w.mo50308x2936bf5f(obtain);
        }
    }
}
