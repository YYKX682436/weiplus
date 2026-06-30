package or1;

/* loaded from: classes9.dex */
public class g1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.i1 f429030d;

    public g1(or1.i1 i1Var) {
        this.f429030d = i1Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        java.lang.String str;
        qk.o6 o6Var = (qk.o6) i95.n0.c(qk.o6.class);
        or1.i1 i1Var = this.f429030d;
        java.lang.String str2 = i1Var.f429039d.f429044b;
        android.util.LruCache lruCache = ((c01.j0) o6Var).f118800d;
        w01.c cVar = (w01.c) lruCache.get(str2);
        if (cVar == null) {
            cVar = new w01.c();
            lruCache.put(str2, cVar);
        }
        cVar.a(str2);
        qk.o6 o6Var2 = (qk.o6) i95.n0.c(qk.o6.class);
        or1.j1 j1Var = i1Var.f429039d;
        java.lang.String str3 = j1Var.f429044b;
        ((c01.j0) o6Var2).getClass();
        try {
            z17 = r01.q3.bj().y0(str3).f66035x86411b2a;
        } catch (java.lang.Throwable unused) {
            z17 = true;
        }
        if (!z17) {
            qk.o6 o6Var3 = (qk.o6) i95.n0.c(qk.o6.class);
            java.lang.String str4 = j1Var.f429044b;
            ((c01.j0) o6Var3).getClass();
            try {
                r01.m y07 = r01.q3.bj().y0(str4);
                r45.ik ikVar = new r45.ik();
                ikVar.mo11468x92b714fd(y07.f66039x3c18ecc6);
                str = ikVar.f458637f;
            } catch (java.lang.Throwable unused2) {
                str = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                g4Var.b(2, com.p314xaae8f345.mm.R.C30867xcad56011.anz, com.p314xaae8f345.mm.R.raw.f80770x68220200);
            } else {
                g4Var.g(2, str, com.p314xaae8f345.mm.R.raw.f80770x68220200);
            }
        }
        g4Var.b(3, com.p314xaae8f345.mm.R.C30867xcad56011.c1_, com.p314xaae8f345.mm.R.raw.f78348x3648ab0e);
        g4Var.b(4, com.p314xaae8f345.mm.R.C30867xcad56011.f571351cm, com.p314xaae8f345.mm.R.raw.f78369xf2581580);
    }
}
