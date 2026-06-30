package or1;

/* loaded from: classes12.dex */
public class c2 implements or1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ or1.d2 f429003a;

    public c2(or1.d2 d2Var) {
        this.f429003a = d2Var;
    }

    @Override // or1.l
    public void a(or1.m mVar, fb5.c cVar, int i17, java.lang.String str, int i18, int i19) {
        or1.d2 d2Var = this.f429003a;
        r45.qp j17 = d2Var.j(i19);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = d2Var.f429063m;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(",");
        sb6.append(i18);
        sb6.append(",");
        sb6.append(mVar.f429067q);
        sb6.append(",");
        if (j17 != null) {
            str3 = j17.f465693m + ",0";
        }
        sb6.append(str3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10866, sb6.toString());
    }
}
