package dh4;

/* loaded from: classes15.dex */
public class e0 extends ah4.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.f0 f314044d;

    public e0(dh4.f0 f0Var) {
        this.f314044d = f0Var;
    }

    @Override // ah4.h
    public void A4(int i17, int i18, boolean z17) {
        dh4.f0 f0Var = this.f314044d;
        if (z17) {
            f0Var.f314054p = 0;
            f0Var.f314062x.a("");
            return;
        }
        if (i18 > f0Var.f314052n) {
            f0Var.f314052n = i18;
            if (f0Var.f314047f >= 3) {
                f0Var.f314062x.d(311);
            }
            f0Var.g();
        }
        if (f0Var.f314054p == i17) {
            return;
        }
        f0Var.f314054p = i17;
        java.lang.String j17 = f0Var.j();
        if (!f0Var.f314048g && j17 == null) {
            f0Var.f314048g = true;
            int i19 = f0Var.f314050i;
            long j18 = f0Var.f314051m;
            java.lang.String str = f0Var.f314049h;
            c01.d9.e().g(new eh4.c(i19, j18, str, f0Var.l(str)));
            dh4.l.Bi().f314130j++;
            dh4.l.Bi().f314131k++;
        }
        f0Var.f314062x.a(j17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f574850jq1);
    }
}
