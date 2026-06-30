package id2;

/* loaded from: classes3.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372183d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f372184e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f372185f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f372186g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f372183d = "";
        this.f372184e = true;
        this.f372186g = jz5.h.b(new id2.k(activity));
    }

    public static final void O6(id2.l lVar, mm2.y6 y6Var, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc, android.widget.Button button) {
        java.lang.String string;
        boolean z17 = false;
        if (lVar.f372185f) {
            c23001x9d3a0bdc.b(lVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nvx));
            button.setEnabled(false);
            button.setTextColor(lVar.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
            return;
        }
        button.setEnabled(true);
        if (y6Var.d()) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d3d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (y6Var.f411115f == 1) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ea7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            if (y6Var.f411116g.size() == 1 && pm0.v.z(y6Var.f411114e, 2) && !pm0.v.z(y6Var.f411114e, 229)) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nvv);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else if (pm0.v.z(y6Var.f411114e, 7)) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehc);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else if (y6Var.f411115f == 1) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ea7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            } else {
                int i17 = y6Var.f411114e;
                if (i17 == 8) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573399eh4);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                } else {
                    if (i17 == 16) {
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lvo);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    } else {
                        if (pm0.v.z(i17, 8) && pm0.v.z(y6Var.f411114e, 16)) {
                            z17 = true;
                        }
                        if (z17) {
                            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lvv);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                        } else {
                            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nvw);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                        }
                    }
                }
            }
        }
        c23001x9d3a0bdc.b(string);
        button.setTextColor(lVar.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
    }

    public final id2.z3 P6() {
        return (id2.z3) ((jz5.n) this.f372186g).mo141623x754a37bb();
    }
}
