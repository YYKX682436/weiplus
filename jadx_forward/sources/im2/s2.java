package im2;

/* loaded from: classes3.dex */
public final class s2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374056d;

    public s2(im2.z3 z3Var) {
        this.f374056d = z3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        im2.z3 z3Var = this.f374056d;
        for (r45.d32 d32Var : z3Var.E1) {
            if (d32Var.f453565d == menuItem.getItemId()) {
                int i18 = d32Var.f453565d;
                if (i18 == 1) {
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c17;
                    ml2.y2 y2Var = ml2.y2.f409800w;
                    cl0.g gVar = new cl0.g();
                    ml2.x2[] x2VarArr = ml2.x2.f409754d;
                    gVar.o("type", 10);
                    zy2.zb.qg(zbVar, y2Var, gVar.toString(), null, null, 12, null);
                } else if (i18 == 2) {
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    zy2.zb zbVar2 = (zy2.zb) c18;
                    ml2.y2 y2Var2 = ml2.y2.f409800w;
                    cl0.g gVar2 = new cl0.g();
                    ml2.x2[] x2VarArr2 = ml2.x2.f409754d;
                    gVar2.o("type", 11);
                    zy2.zb.qg(zbVar2, y2Var2, gVar2.toString(), null, null, 12, null);
                }
                z3Var.n7(d32Var);
                return;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
