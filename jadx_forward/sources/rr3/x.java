package rr3;

/* loaded from: classes3.dex */
public final class x implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr3.z f480750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.tc5 f480751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f480752c;

    public x(rr3.z zVar, r45.tc5 tc5Var, int i17) {
        this.f480750a = zVar;
        this.f480751b = tc5Var;
        this.f480752c = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        rr3.z zVar = this.f480750a;
        if (zVar.m158354x19263085().isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoAuthScopeUIC", "activity.isFinishing");
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = zVar.f480757g;
            if (u3Var != null) {
                u3Var.dismiss();
                zVar.f480757g = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoAuthScopeUIC", "mode: cgi result: " + fVar.f152148a + ", " + fVar.f152149b);
            if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                db5.t7.h(zVar.m158354x19263085(), zVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572479bc0));
                r45.n14 n14Var = qr3.o.f447635m;
                if (n14Var != null) {
                    java.util.LinkedList<r45.tc5> privacy_scope_item_list = n14Var.f462525f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(privacy_scope_item_list, "privacy_scope_item_list");
                    for (r45.tc5 tc5Var : privacy_scope_item_list) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tc5Var.f467843d, this.f480751b.f467843d)) {
                            tc5Var.f467845f = this.f480752c;
                        }
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O6 = zVar.O6();
                    if (O6 != null && (mo7946xf939df19 = O6.mo7946xf939df19()) != null) {
                        mo7946xf939df19.m8146xced61ae5();
                    }
                }
            } else {
                db5.t7.g(zVar.m80379x76847179(), zVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bc_));
            }
        }
        return jz5.f0.f384359a;
    }
}
