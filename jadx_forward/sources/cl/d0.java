package cl;

/* loaded from: classes7.dex */
public class d0 implements cl.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.e0 f124145a;

    public d0(cl.e0 e0Var) {
        this.f124145a = e0Var;
    }

    @Override // cl.i1
    public com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad a() {
        cl.e0 e0Var = this.f124145a;
        com.p159x477cd522.p160x333422.C1459xa4933cc1 c1459xa4933cc1 = e0Var.A;
        if (c1459xa4933cc1 == null) {
            throw new java.lang.IllegalStateException("getMainContext mNodeJS not ready!");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NodeJSRuntime", "getMainContext %s", java.lang.Integer.valueOf(c1459xa4933cc1.m15851xddccdc80().hashCode()));
        return e0Var.A.m15851xddccdc80();
    }
}
