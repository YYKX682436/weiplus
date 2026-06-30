package cl;

/* loaded from: classes7.dex */
public class d2 implements com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.h2 f124147a;

    public d2(cl.h2 h2Var) {
        this.f124147a = h2Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1456x656040a7
    /* renamed from: invoke */
    public java.lang.Object mo15014xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 1 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
            return null;
        }
        int mo16294xb282bd08 = c1469x28b0ccd7.mo16294xb282bd08(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8DirectApiSharedBuffer", "get, id:%d", java.lang.Integer.valueOf(mo16294xb282bd08));
        java.util.HashMap hashMap = (java.util.HashMap) ((cl.n0) this.f124147a.f124187b).f124236b;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(mo16294xb282bd08))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SharedV8ArrayBufferMgr", "get: id %d not exist", java.lang.Integer.valueOf(mo16294xb282bd08));
            return null;
        }
        cl.m0 m0Var = (cl.m0) hashMap.get(java.lang.Integer.valueOf(mo16294xb282bd08));
        if (m0Var.f124228d == null) {
            com.p159x477cd522.p160x333422.C1455x795052ca c1455x795052ca = m0Var.f124226b;
            if (!c1455x795052ca.m15824xafdb8087()) {
                m0Var.f124228d = m0Var.f124225a.f().mo16394xed94e9f2(c1455x795052ca);
            }
        }
        return m0Var.f124228d;
    }
}
