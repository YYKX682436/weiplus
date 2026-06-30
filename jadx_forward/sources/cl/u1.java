package cl;

/* loaded from: classes7.dex */
public class u1 implements com.p159x477cd522.p160x333422.InterfaceC1457xf776215b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.v1 f124306a;

    public u1(cl.v1 v1Var) {
        this.f124306a = v1Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1457xf776215b
    /* renamed from: invoke */
    public void mo15012xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 2 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 1 || c1469x28b0ccd7.mo16302xfb85f7b0(1) != 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("V8DirectApiBuffer", "setNativeBuffer invalid parameters");
            return;
        }
        c1469x28b0ccd7.mo16294xb282bd08(0);
        com.p159x477cd522.p160x333422.C1470x40840ff7 c1470x40840ff7 = (com.p159x477cd522.p160x333422.C1470x40840ff7) c1469x28b0ccd7.get(1);
        if (c1470x40840ff7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("V8DirectApiBuffer", "setNativeBuffer buffer null");
        } else {
            this.f124306a.f124335b.mo15020x627eb42(c1469x28b0ccd7.mo16294xb282bd08(0), c1470x40840ff7.m16341x3970ce7c());
            c1470x40840ff7.mo15825x41012807();
        }
    }
}
