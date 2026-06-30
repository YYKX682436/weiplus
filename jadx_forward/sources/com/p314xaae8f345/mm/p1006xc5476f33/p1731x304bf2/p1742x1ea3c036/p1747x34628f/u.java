package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 E;
    public b53.c F;
    public a53.b G;
    public b53.f H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b f221473J;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19265x23988ddd K;
    public m02.u L;
    public android.view.View M;
    public android.view.View N;
    public android.widget.TextView P;
    public java.lang.String Q;
    public java.lang.String R;
    public int S;
    public java.lang.String T;
    public java.lang.String U;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var) {
        super(x0Var);
        this.E = x0Var;
        if (!(x0Var.f488190n.getInt("share_report_from_scene", -1) >= 0)) {
            m74258x9c8c0d33(com.p314xaae8f345.mm.R.raw.f78357x4cad4fd4);
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bgv, (android.view.ViewGroup) this.f264228g, false);
        this.M = inflate;
        this.N = inflate.findViewById(com.p314xaae8f345.mm.R.id.piw);
        this.P = (android.widget.TextView) this.M.findViewById(com.p314xaae8f345.mm.R.id.kbq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getH5GameMenuHelp */
    public b53.c m64585xdb91b5() {
        if (this.F == null) {
            this.F = new b53.c(this.E.f488190n.getString("game_hv_menu_appid"));
        }
        return this.F;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = this.E;
        if (!g53.j.b(x0Var)) {
            x0Var.p(!(x0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.a));
            return;
        }
        if (g53.j.f350453d == 0) {
            return;
        }
        ((vz.x1) i95.n0.c(vz.x1.class)).getClass();
        android.content.Context context = this.f264227f;
        java.lang.String appId = g53.j.f350451b;
        java.lang.String str = g53.j.f350452c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.m(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        c02.l lVar2 = new c02.l();
        lVar2.f119138d = appId;
        lVar.f152197a = lVar2;
        lVar.f152198b = new c02.m();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
        lVar.f152200d = 4786;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.a(lVar.a(), new k02.q(mVar, context, str, appId, 1));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1
    public void d() {
        m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
        m02.u uVar = this.L;
        ((l02.q) sVar).getClass();
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.j0.f178819a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D.remove(uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1
    public void e(boolean z17) {
        android.widget.ImageView imageView = this.f264234p;
        android.widget.ImageView imageView2 = this.f264231m;
        android.widget.TextView textView = this.f264232n;
        if (z17) {
            textView.setTextColor(-1);
            imageView2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.h2(this), 100L);
            if (!this.f264240v) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78360x4cb28642);
            }
        } else {
            textView.setTextColor(-16777216);
            imageView2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.g2(this), 100L);
            if (!this.f264240v) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78355x20db789a);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b c19258xc2f2ab2b = this.f221473J;
        if (c19258xc2f2ab2b != null) {
            c19258xc2f2ab2b.m74210xde5590bb(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1
    /* renamed from: getMenuHelp */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y mo64586x57d7ceb6() {
        if (this.f264236r == null) {
            this.f264236r = new a53.a();
        }
        return this.f264236r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1
    public void i() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.n(this), getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) getContext()).mo53061x30be3ed() : false ? 100L : 0L);
    }

    public synchronized void k() {
        if (this.I != null) {
            return;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdo, (android.view.ViewGroup) this.f264233o, false);
        this.I = inflate;
        this.f221473J = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b) inflate.findViewById(com.p314xaae8f345.mm.R.id.d3w);
        this.K = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19265x23988ddd) this.I.findViewById(com.p314xaae8f345.mm.R.id.d3y);
        this.f264233o.addView(this.I, 0);
        l();
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.p(this);
        m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
        m02.u uVar = this.L;
        ((l02.q) sVar).getClass();
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.j0.f178819a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D.add(uVar);
    }

    public void l() {
        if (this.K == null) {
            return;
        }
        if (((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ni()) {
            this.K.setVisibility(0);
        } else {
            this.K.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1, android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        if (f17 == 0.0f) {
            f17 = 1.0f;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        int i17 = (int) (f17 * 255.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b c19258xc2f2ab2b = this.f221473J;
        if (c19258xc2f2ab2b != null) {
            c19258xc2f2ab2b.setImageAlpha(i17);
        }
    }
}
