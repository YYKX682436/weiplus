package dg5;

/* loaded from: classes11.dex */
public class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.n f313907d;

    public j(dg5.n nVar) {
        this.f313907d = nVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String str;
        dg5.n nVar = this.f313907d;
        r01.m mVar = nVar.f313917h;
        java.lang.String str2 = nVar.f313916g;
        boolean z17 = false;
        boolean z18 = true;
        if (!(mVar != null && mVar.f66036x32d3e5e3) && nVar.a()) {
            z17 = true;
        }
        if (z17) {
            g4Var.b(1, com.p314xaae8f345.mm.R.C30867xcad56011.f572289ao0, com.p314xaae8f345.mm.R.raw.f78345xd520f3b3);
        }
        try {
            z18 = r01.q3.bj().y0(str2).f66035x86411b2a;
        } catch (java.lang.Throwable unused) {
        }
        if (!z18) {
            try {
                r01.m y07 = r01.q3.bj().y0(str2);
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
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = nVar.f313913d;
        if (z17) {
            g4Var.m(4, activityC21401x6ce6f73f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.any), com.p314xaae8f345.mm.ui.uk.e(activityC21401x6ce6f73f, com.p314xaae8f345.mm.R.raw.f78347x264ea0db, -1));
        }
        g4Var.m(3, activityC21401x6ce6f73f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571351cm), com.p314xaae8f345.mm.ui.uk.e(activityC21401x6ce6f73f, com.p314xaae8f345.mm.R.raw.f78369xf2581580, -1));
    }
}
