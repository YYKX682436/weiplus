package k72;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[][] f386235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k72.d0 f386236e;

    public a0(k72.d0 d0Var, byte[][] bArr) {
        this.f386236e = d0Var;
        this.f386235d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            h72.s.e().k();
            for (byte[] bArr : this.f386235d) {
                h72.s e17 = h72.s.e();
                e17.f361002c.m77784x795fa299(new h72.p(e17, bArr));
            }
            h72.s.e().l(new k72.z(this));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceCheckVideoRecordMgr", e18, "recordFrameImpl error", new java.lang.Object[0]);
            k72.b0 b0Var = this.f386236e.f386249f;
            if (b0Var != null) {
                ((k72.r) b0Var).a();
            }
        }
    }
}
