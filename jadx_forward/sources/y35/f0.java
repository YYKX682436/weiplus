package y35;

/* loaded from: classes11.dex */
public class f0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19714x36ab4d57 f540743a;

    public f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19714x36ab4d57 c19714x36ab4d57) {
        this.f540743a = c19714x36ab4d57;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        int id6 = compoundButton.getId();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19714x36ab4d57 c19714x36ab4d57 = this.f540743a;
        if (id6 == com.p314xaae8f345.mm.R.id.m78) {
            if (c19714x36ab4d57.P != null) {
                if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).K(c19714x36ab4d57.P.d1())) {
                    c01.e2.B0(c19714x36ab4d57.P.d1(), true, true);
                    return;
                } else {
                    c01.e2.t0(c19714x36ab4d57.P.d1(), true, true);
                    return;
                }
            }
            return;
        }
        if (id6 == com.p314xaae8f345.mm.R.id.m77) {
            boolean z18 = !c19714x36ab4d57.V;
            c19714x36ab4d57.V = z18;
            if (c19714x36ab4d57.S) {
                int i17 = !z18 ? 1 : 0;
                ((e21.z0) c01.d9.b().w()).c(new mn.a(c19714x36ab4d57.R, i17, 0));
                c19714x36ab4d57.P.J2(i17);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(c19714x36ab4d57.R, c19714x36ab4d57.P);
            }
            c19714x36ab4d57.M();
            return;
        }
        if (id6 != com.p314xaae8f345.mm.R.id.m79 || (z3Var = c19714x36ab4d57.P) == null) {
            return;
        }
        boolean r27 = z3Var.r2();
        android.content.Context context = c19714x36ab4d57.Q;
        if (!r27) {
            c01.e2.d0(c19714x36ab4d57.P);
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574432i65));
        } else {
            c19714x36ab4d57.P.s3();
            c01.e2.g0(c19714x36ab4d57.P, true);
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574429i62));
        }
    }
}
