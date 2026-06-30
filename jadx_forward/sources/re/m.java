package re;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f475810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(re.n nVar) {
        super(0);
        this.f475810d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        re.n nVar = this.f475810d;
        java.util.Iterator v17 = nVar.f475811a.v1();
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z2) v17;
            if (!z2Var.hasNext()) {
                return jz5.f0.f384359a;
            }
            java.util.Iterator h07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3) z2Var.next()).h0(false);
            while (true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4 g4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4) h07;
                if (g4Var.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) g4Var.next();
                    int i18 = i17 + 1;
                    if (i17 >= nVar.f475813c) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w2Var);
                        re.n.a(nVar, w2Var);
                    }
                    i17 = i18;
                }
            }
        }
    }
}
