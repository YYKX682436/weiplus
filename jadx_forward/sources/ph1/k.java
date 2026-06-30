package ph1;

/* loaded from: classes7.dex */
public class k implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f435868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph1.l f435869e;

    public k(ph1.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f435869e = lVar;
        this.f435868d = c11510xdd90c2f2;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        ph1.l lVar = this.f435869e;
        if (!lVar.f435876m && !lVar.f435877n) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f435868d;
            android.content.Context r07 = c11510xdd90c2f2.r0();
            if (r07 == null) {
                r07 = c11510xdd90c2f2.f156328d;
            }
            r.a aVar = lVar.f435870d;
            fl1.a2 a2Var = aVar == null ? null : (fl1.a2) aVar.mo1850x58b836e(r07);
            if (a2Var == null) {
                a2Var = new fl1.g1(r07);
            }
            fl1.g1 g1Var = (fl1.g1) a2Var;
            g1Var.setOnCancelListener(lVar.f435874h);
            g1Var.setCancelable(true);
            g1Var.setCanceledOnTouchOutside(false);
            ((fl1.c0) c11510xdd90c2f2.m48801x784fb1e3()).c(g1Var);
            lVar.f435872f = g1Var;
            int i17 = lVar.f435875i;
            if (i17 > 0 && (g1Var instanceof fl1.g1)) {
                g1Var.setProgress(i17);
            }
        }
        return false;
    }
}
