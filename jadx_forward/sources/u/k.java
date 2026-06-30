package u;

/* loaded from: classes16.dex */
public final class k extends u.n implements oa.c {
    public final jz5.g B6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.B6 = jz5.h.b(new u.j(this));
    }

    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff a() {
        return (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) ((jz5.n) this.B6).mo141623x754a37bb();
    }

    public final void b(oa.i iVar, boolean z17) {
        android.view.View view;
        android.widget.TextView textView = (iVar == null || (view = iVar.f425316f) == null) ? null : (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f569318n6);
        if (textView == null) {
            return;
        }
        textView.setTypeface(textView.getTypeface(), z17 ? 1 : 0);
        textView.setTextColor(b3.l.m9702x7444d5ad(m158354x19263085(), z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.abw : com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        b(iVar, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineTabBarUIC", "onCreate");
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff a17 = a();
        oa.i l17 = a().l();
        android.view.View inflate = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569318n6)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573190fl));
        l17.f425316f = inflate;
        l17.f();
        a17.b(l17);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff a18 = a();
        oa.i l18 = a().l();
        android.view.View inflate2 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f569318n6)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573135fk));
        l18.f425316f = inflate2;
        l18.f();
        a18.b(l18);
        a().a(this);
        int m20353x443e53f0 = a().m20353x443e53f0();
        int i17 = 0;
        while (i17 < m20353x443e53f0) {
            b(a().k(i17), i17 == T6());
            i17++;
        }
        oa.i k17 = a().k(T6());
        if (k17 != null) {
            k17.b();
        }
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        if (iVar != null) {
            int i17 = iVar.f425315e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineTabBarUIC", "onTabSelected position=" + i17);
            P6().m8317x940d026a(i17, false);
            b(iVar, true);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("post_session_id", ca4.z0.l());
            lVarArr[1] = new jz5.l("50479_btn_type", java.lang.Integer.valueOf(i17 == 0 ? 1 : 2));
            ((cy1.a) rVar).Hj("button_50479", "view_clk", kz5.c1.k(lVarArr), 36244);
        }
    }
}
