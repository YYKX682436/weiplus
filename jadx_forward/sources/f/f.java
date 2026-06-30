package f;

/* loaded from: classes14.dex */
public abstract class f {
    public static final f.r a(h.b contract, yz5.l onResult, n0.o oVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onResult, "onResult");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1672766681);
        n0.e5 e17 = n0.s4.e(contract, y0Var, 8);
        n0.e5 e18 = n0.s4.e(onResult, y0Var, (i17 >> 3) & 14);
        java.lang.Object a17 = w0.g.a(new java.lang.Object[0], null, null, f.e.f339510d, y0Var, 8, 6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "rememberSaveable { UUID.randomUUID().toString() }");
        java.lang.String str = (java.lang.String) a17;
        n0.h3 h3Var = f.o.f339524a;
        y0Var.U(1972133187);
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i iVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i) y0Var.i(f.o.f339524a);
        if (iVar == null) {
            java.lang.Object obj = (android.content.Context) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92036b);
            while (true) {
                if (!(obj instanceof android.content.ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i) {
                    break;
                }
                obj = ((android.content.ContextWrapper) obj).getBaseContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "innerContext.baseContext");
            }
            iVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i) obj;
        }
        y0Var.o(false);
        if (iVar == null) {
            throw new java.lang.IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h mo2507xfe541f5f = iVar.mo2507xfe541f5f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo2507xfe541f5f, "checkNotNull(LocalActivi… }.activityResultRegistry");
        y0Var.U(-3687241);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f415162a;
        java.lang.Object obj2 = n0.n.f415153a;
        if (y17 == obj2) {
            y17 = new f.a();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        f.a aVar = (f.a) y17;
        y0Var.U(-3687241);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj2) {
            y18 = new f.r(aVar, e17);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        f.r rVar = (f.r) y18;
        n0.d2.a(mo2507xfe541f5f, str, contract, new f.d(aVar, mo2507xfe541f5f, str, contract, e18), y0Var, 520);
        y0Var.o(false);
        return rVar;
    }
}
