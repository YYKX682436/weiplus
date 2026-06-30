package cl;

/* loaded from: classes7.dex */
public class t1 implements com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.v1 f124301b;

    public t1(cl.v1 v1Var, cl.q0 q0Var) {
        this.f124301b = v1Var;
        this.f124300a = q0Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1456x656040a7
    /* renamed from: invoke */
    public java.lang.Object mo15014xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 1 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("V8DirectApiBuffer", "getNativeBuffer invalid parameters");
            return null;
        }
        c1469x28b0ccd7.mo16294xb282bd08(0);
        java.nio.ByteBuffer mo15018x12f2b736 = this.f124301b.f124335b.mo15018x12f2b736(c1469x28b0ccd7.mo16294xb282bd08(0), false);
        if (mo15018x12f2b736 != null) {
            return this.f124300a.f().mo16398x9edb0a57(mo15018x12f2b736);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("V8DirectApiBuffer", "getNativeBuffer bb null");
        return null;
    }
}
