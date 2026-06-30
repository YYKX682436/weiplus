package cl;

/* loaded from: classes7.dex */
public class f2 implements com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.h2 f124167a;

    public f2(cl.h2 h2Var) {
        this.f124167a = h2Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1456x656040a7
    /* renamed from: invoke */
    public java.lang.Object mo15014xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 1 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8DirectApiSharedBuffer", "get invalid parameters");
            return null;
        }
        int mo16294xb282bd08 = c1469x28b0ccd7.mo16294xb282bd08(0);
        ((cl.j0) this.f124167a.f124188c).b(mo16294xb282bd08);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8DirectApiSharedBuffer", "untrace, bufferId:%d", java.lang.Integer.valueOf(mo16294xb282bd08));
        return null;
    }
}
