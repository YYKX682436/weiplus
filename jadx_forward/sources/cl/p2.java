package cl;

/* loaded from: classes7.dex */
public class p2 implements com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.w2 f124251b;

    public p2(cl.w2 w2Var, cl.q0 q0Var) {
        this.f124251b = w2Var;
        this.f124250a = q0Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1456x656040a7
    /* renamed from: invoke */
    public java.lang.Object mo15014xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        int d17;
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16396xe8eb0f37;
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 2 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.J2V8.V8DirectApiTimer", "setInterval parameters invalid length:%d type[0]:%d", java.lang.Integer.valueOf(c1469x28b0ccd7.mo16304xbe0e3ae6()), java.lang.Integer.valueOf(c1469x28b0ccd7.mo16302xfb85f7b0(0)));
            return null;
        }
        com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a = (com.p159x477cd522.p160x333422.C1474xd5ce209a) c1469x28b0ccd7.mo16297x2817c635(0);
        if (c1469x28b0ccd7.mo16302xfb85f7b0(1) == 1) {
            d17 = c1469x28b0ccd7.mo16294xb282bd08(1);
        } else if (c1469x28b0ccd7.mo16302xfb85f7b0(1) == 2) {
            d17 = (int) c1469x28b0ccd7.mo16291x160e9ec7(1);
        } else {
            if (c1469x28b0ccd7.mo16302xfb85f7b0(1) != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.J2V8.V8DirectApiTimer", "setInterval parameters[1] type:%d", java.lang.Integer.valueOf(c1469x28b0ccd7.mo16302xfb85f7b0(1)));
                return null;
            }
            d17 = cl.w2.d(c1469x28b0ccd7.mo16298x2fec8307(1), Integer.MIN_VALUE);
            if (d17 == Integer.MIN_VALUE) {
                return null;
            }
        }
        int mo16304xbe0e3ae6 = c1469x28b0ccd7.mo16304xbe0e3ae6();
        cl.q0 q0Var = this.f124250a;
        if (mo16304xbe0e3ae6 > 2) {
            java.util.List<? super java.lang.Object> m16680xcc327db9 = com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.m16680xcc327db9(c1469x28b0ccd7);
            mo16396xe8eb0f37 = com.p159x477cd522.p160x333422.p164x6a710b1.C1526xe59cb0b0.m16689x62558dfc(q0Var.f(), (java.util.List<? extends java.lang.Object>) m16680xcc327db9.subList(1, m16680xcc327db9.size()));
        } else {
            mo16396xe8eb0f37 = q0Var.f().mo16396xe8eb0f37();
        }
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd72 = mo16396xe8eb0f37;
        cl.w2 w2Var = this.f124251b;
        int i17 = w2Var.f124346b + 1;
        w2Var.f124346b = i17;
        cl.v2 v2Var = q0Var.f124257b instanceof cl.h ? new cl.v2(w2Var, q0Var, i17, c1474xd5ce209a, c1469x28b0ccd72, true, d17) : new cl.t2(w2Var, q0Var, i17, c1474xd5ce209a, c1469x28b0ccd72, true, d17);
        v2Var.e();
        w2Var.f124347c.put(w2Var.f124346b, v2Var);
        return java.lang.Integer.valueOf(w2Var.f124346b);
    }
}
