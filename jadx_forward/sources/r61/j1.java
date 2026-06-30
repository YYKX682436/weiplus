package r61;

/* loaded from: classes12.dex */
public class j1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.k1 f474423d;

    public j1(r61.k1 k1Var) {
        this.f474423d = k1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        r61.k1 k1Var = this.f474423d;
        if (i17 == 0 && i18 == 0) {
            r61.m1 m1Var2 = k1Var.f474427e;
            m1Var2.mo807x6c193ac1(m1Var2.m47995xb7ba1aa7(), k1Var.f474427e.f474440e);
        } else {
            r61.m1 m1Var3 = k1Var.f474427e;
            m1Var3.f474440e.mo815x76e0bfae(i17, i18, "", m1Var3);
        }
    }
}
