package ph1;

/* loaded from: classes7.dex */
public class y implements ph1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f435896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph1.c f435897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f435898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f435899d;

    public y(ph1.g0 g0Var, ik1.b0 b0Var, ph1.c cVar, ik1.b0 b0Var2) {
        this.f435899d = g0Var;
        this.f435896a = b0Var;
        this.f435897b = cVar;
        this.f435898c = b0Var2;
    }

    @Override // ph1.c
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f c11666xa31a0b7f) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            java.lang.String str = this.f435899d.f435862f.f156336n;
            java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) this.f435896a.f373357a).f33454x337a8b;
        }
        ph1.c cVar = this.f435897b;
        if (cVar != null) {
            cVar.a(c11666xa31a0b7f);
        }
        ph1.l lVar = (ph1.l) this.f435898c.f373357a;
        if (lVar != null) {
            int i17 = c11666xa31a0b7f.f156927d;
            lVar.getClass();
            int max = java.lang.Math.max(java.lang.Math.min(i17, 100), 0);
            lVar.f435875i = max;
            fl1.a2 a2Var = lVar.f435872f;
            if (a2Var instanceof fl1.g1) {
                ((fl1.g1) a2Var).setProgress(max);
            }
        }
    }
}
