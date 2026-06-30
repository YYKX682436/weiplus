package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes12.dex */
public class i6 implements sw4.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f6 f263880a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.h6(this);

    /* renamed from: b, reason: collision with root package name */
    public sw4.e f263881b;

    @Override // sw4.h
    public void a(android.content.Context context, android.os.Bundle bundle, sw4.e eVar) {
        this.f263881b = eVar;
        java.lang.String string = bundle.getString("local_id");
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
        boolean z17 = bundle.getBoolean("show_progress_tips");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(string);
        if (b17 == null) {
            eVar.f(null);
            return;
        }
        int i17 = b17.f264275n;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f6 f6Var = this.f263880a;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6.a(context, b17, string2, string, 20301, 202, 2, z17, f6Var);
        } else if (i17 != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6.b(context, string2, string, 20302, 202, 2, z17, f6Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6.b(context, string2, string, 20302, 202, 2, z17, f6Var);
        }
    }
}
