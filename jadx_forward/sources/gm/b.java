package gm;

@j95.b
/* loaded from: classes4.dex */
public class b extends i95.w implements gm.l {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        gm.a R6 = gm.a.R6();
        R6.getClass();
        boolean O6 = R6.O6(gm0.j1.u().h() + "Basis-1.db");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create basisDB result: ");
        sb6.append(O6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BasisDBService", sb6.toString());
    }
}
