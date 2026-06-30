package cl;

/* loaded from: classes7.dex */
public class g2 implements com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.h2 f124179a;

    public g2(cl.h2 h2Var) {
        this.f124179a = h2Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1456x656040a7
    /* renamed from: invoke */
    public java.lang.Object mo15014xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 1 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
            return null;
        }
        cl.k0 a17 = ((cl.j0) this.f124179a.f124188c).a(c1469x28b0ccd7.mo16294xb282bd08(0));
        if (a17 == null) {
            return null;
        }
        if (a17.f124204a == null) {
            com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad f17 = a17.f124207d.f();
            com.p159x477cd522.p160x333422.C1455x795052ca c1455x795052ca = a17.f124205b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1455x795052ca);
            a17.f124204a = f17.mo16394xed94e9f2(c1455x795052ca);
        }
        com.p159x477cd522.p160x333422.C1470x40840ff7 c1470x40840ff7 = a17.f124204a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1470x40840ff7);
        return c1470x40840ff7;
    }
}
