package sc2;

/* loaded from: classes2.dex */
public final class l7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f487587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f487588e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(sc2.r7 r7Var, int i17) {
        super(1);
        this.f487587d = r7Var;
        this.f487588e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view;
        in5.s0 s0Var;
        int i17;
        int i18;
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        sc2.r7 r7Var = this.f487587d;
        r7Var.getClass();
        xc2.p0 p0Var = observer.f84680h;
        if (p0Var != null && (view = observer.f84676d) != null && (s0Var = observer.f84681i) != null) {
            int i19 = this.f487588e;
            observer.z(s0Var, view, p0Var, i19);
            if (p0Var.B == 1 && !observer.f84687r) {
                if (i19 < p0Var.E || (i19 >= (i18 = p0Var.F) && i18 != 0)) {
                    if (view.getVisibility() == 0 && (i17 = p0Var.F) != 0) {
                        ad2.h hVar = p0Var.f534773d;
                        if (i19 == i17) {
                            observer.d(s0Var, view, p0Var, true, new sc2.k7(hVar, r7Var, s0Var));
                        } else {
                            ad2.k.a(observer, s0Var, view, p0Var, false, null, 16, null);
                        }
                    }
                } else if (view.getVisibility() == 8) {
                    if (i19 != p0Var.E) {
                        ad2.k.b(observer, s0Var, view, p0Var, false, null, 16, null);
                        yz5.l lVar = r7Var.f487748n;
                        if (lVar != null) {
                            lVar.mo146xb9724478(s0Var);
                        }
                    } else if (!p0Var.D) {
                        ad2.k.b(observer, s0Var, view, p0Var, true, null, 16, null);
                        yz5.l lVar2 = r7Var.f487748n;
                        if (lVar2 != null) {
                            lVar2.mo146xb9724478(s0Var);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
