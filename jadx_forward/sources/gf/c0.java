package gf;

/* loaded from: classes7.dex */
public class c0 implements com.p314xaae8f345.p2936x80def495.InterfaceC25570x528f558e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gf.d0 f352561a;

    public c0(gf.d0 d0Var) {
        this.f352561a = d0Var;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25570x528f558e
    /* renamed from: onScrollViewChange */
    public void mo95679xc13a0561(double d17, double d18, double d19, double d27, double d28, double d29) {
        if (d29 <= 0.0d) {
            java.util.Iterator it = new java.util.HashSet(this.f352561a.H).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la laVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la) it.next();
                if (laVar != null) {
                    laVar.a(0, 0, false, true);
                }
            }
        }
    }
}
