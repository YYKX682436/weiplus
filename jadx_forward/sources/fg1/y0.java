package fg1;

/* loaded from: classes7.dex */
public class y0 implements bg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f343452a;

    public y0(fg1.g1 g1Var) {
        this.f343452a = g1Var;
    }

    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895;
        fg1.f1 f1Var = this.f343452a.f343402b;
        pd1.m mVar = f1Var.f343392b;
        if (mVar != null) {
            float f17 = (i17 * 100.0f) / i18;
            int i19 = i18 - i17;
            if (f17 >= 99.0f && i19 <= 1000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar;
                yVar.getClass();
                f1Var.mo129528xb5884f29();
                java.lang.String str = yVar.f169100a.f169051a;
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar;
            yVar2.getClass();
            java.lang.String mo129528xb5884f29 = f1Var.mo129528xb5884f29();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = yVar2.f169100a;
            java.lang.String str2 = o0Var.f169063m;
            if (str2 == null || !str2.equals(mo129528xb5884f29) || (cVar = o0Var.f169066p) == null || (c12753x672cc895 = o0Var.f169056f) == null) {
                return;
            }
            c12753x672cc895.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.v(yVar2, cVar.f168964c, f17));
        }
    }
}
