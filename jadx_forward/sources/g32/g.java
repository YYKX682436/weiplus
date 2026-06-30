package g32;

/* loaded from: classes12.dex */
public class g implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g32.c0 f349690d;

    public g(g32.h hVar, g32.c0 c0Var) {
        this.f349690d = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        boolean z18;
        if (m1Var.mo808xfb85f7b0() != 1926) {
            return 0;
        }
        if (i17 == 0 && i18 == 0) {
            r45.ds3 ds3Var = (r45.ds3) oVar.f152244b.f152233a;
            z18 = true;
            z17 = ds3Var != null && ds3Var.f454244d;
        } else {
            z17 = false;
            z18 = false;
        }
        g32.c0 c0Var = this.f349690d;
        if (c0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qa) c0Var).a(z18, z17);
        }
        return 0;
    }
}
