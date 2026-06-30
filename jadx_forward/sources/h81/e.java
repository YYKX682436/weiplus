package h81;

/* loaded from: classes10.dex */
public class e extends bi3.l {

    /* renamed from: b, reason: collision with root package name */
    public ei3.m f361058b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f361059c;

    @Override // bi3.l
    public ei3.m a() {
        ei3.m k0Var;
        ei3.m mVar;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = this.f361059c;
        if (c11120x15dce88d != null) {
            int i17 = di3.w.f314303d.f314233a;
            if (i17 == 1) {
                k0Var = new ei3.k0(c11120x15dce88d);
            } else if (i17 != 2) {
                mVar = null;
                this.f361058b = mVar;
            } else {
                k0Var = new ei3.w0(c11120x15dce88d);
            }
            mVar = k0Var;
            this.f361058b = mVar;
        }
        ei3.m mVar2 = this.f361058b;
        if (mVar2 instanceof ei3.k0) {
            ei3.k0 k0Var2 = (ei3.k0) mVar2;
            k0Var2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "setStopOnCameraDataThread: %s", java.lang.Boolean.TRUE);
            k0Var2.f334603J = true;
        }
        return this.f361058b;
    }
}
