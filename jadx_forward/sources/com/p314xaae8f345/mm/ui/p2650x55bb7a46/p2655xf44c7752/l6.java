package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class l6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282711f;

    public l6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.ArrayList arrayList) {
        this.f282711f = viewOnClickListenerC21748xb3d38e6b;
        this.f282709d = f9Var;
        this.f282710e = arrayList;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        int i17;
        g4Var.clear();
        if (c01.ia.e(this.f282709d)) {
            return;
        }
        boolean y17 = c01.ia.y(this.f282709d);
        int i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m;
        boolean z17 = false;
        if (!y17 && !c01.ia.C(this.f282709d)) {
            g4Var.h(0, this.f282711f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, this.f282711f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            this.f282710e.add(1);
            if (this.f282709d.M2() && com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.l()) {
                g4Var.h(10, this.f282711f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hra), com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0);
            }
        }
        j45.l.g("favorite");
        if (!c01.ia.A(this.f282709d)) {
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.N(this.f282709d)) {
                t21.v2 h17 = t21.d3.h(this.f282709d.z0());
                if (h17 != null && ((i17 = h17.f496544i) == 199 || i17 == 199 || t21.d3.u(h17))) {
                    g4Var.h(2, this.f282711f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f78683x36757420, 0);
                    this.f282710e.add(2);
                }
            } else {
                g4Var.h(2, this.f282711f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f78683x36757420, 0);
                this.f282710e.add(2);
            }
        }
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.L(this.f282709d) || com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.K(this.f282709d)) {
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (su4.r2.l() || this.f282709d == null) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282711f;
            int i19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
            if (android.text.TextUtils.isEmpty(viewOnClickListenerC21748xb3d38e6b.H7()) && ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(1, 2)) {
                z17 = true;
            }
            if (z17) {
                java.lang.String Di = ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(1, 2);
                int Bi = ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Bi(1, 2);
                sg0.e eVar = (sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class));
                eVar.getClass();
                android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                int Bi2 = eVar.Bi(1, 2);
                if (Bi2 != com.p314xaae8f345.mm.R.raw.f79767x4e69e538) {
                    i18 = Bi2 == com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac : com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an;
                }
                g4Var.h(14, Di, Bi, resources.getColor(i18));
            } else {
                g4Var.h(11, this.f282711f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca, this.f282711f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            }
            this.f282710e.add(3);
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k6(this, z17));
        }
    }
}
