package cl;

/* loaded from: classes7.dex */
public class q2 implements com.p159x477cd522.p160x333422.InterfaceC1457xf776215b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.w2 f124280a;

    public q2(cl.w2 w2Var) {
        this.f124280a = w2Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1457xf776215b
    /* renamed from: invoke */
    public void mo15012xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        if (c1469x28b0ccd7.mo16304xbe0e3ae6() < 1 || c1469x28b0ccd7.mo16302xfb85f7b0(0) != 1) {
            return;
        }
        int mo16294xb282bd08 = c1469x28b0ccd7.mo16294xb282bd08(0);
        android.util.SparseArray sparseArray = this.f124280a.f124347c;
        cl.u2 u2Var = (cl.u2) sparseArray.get(mo16294xb282bd08);
        if (u2Var != null) {
            u2Var.a();
            sparseArray.remove(mo16294xb282bd08);
        }
    }
}
