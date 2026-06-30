package hr3;

/* loaded from: classes11.dex */
public class ra implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f365480d;

    public ra(hr3.va vaVar) {
        this.f365480d = vaVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.va vaVar = this.f365480d;
        vaVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = vaVar.f365642e;
        java.lang.String d17 = c16861xdcf09668.L.d1();
        am.w00 w00Var = c6229x2bb765fe.f136476g;
        boolean equals = d17.equals(w00Var.f89781d);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c16861xdcf09668.K1;
        if (!equals && (w00Var.f89779b || w00Var.f89780c)) {
            dp.a.m125853x26a183b(abstractActivityC21394xb3d2c0cf.mo55332x76847179(), w00Var.f89778a ? com.p314xaae8f345.mm.R.C30867xcad56011.aqg : com.p314xaae8f345.mm.R.C30867xcad56011.aqh, 0).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", "voip is running, can't do this");
        } else if (!iq.b.v(abstractActivityC21394xb3d2c0cf) && !iq.b.e(abstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
            c6154xe47ae2d0.f136416g.f89116a = true;
            c6154xe47ae2d0.e();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6154xe47ae2d0.f136417h.f89204a)) {
                vaVar.l();
            } else {
                db5.e1.A(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.joc), "", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.ba(vaVar), new hr3.ca(vaVar));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(vaVar.f365642e.K1.getIntent(), 5, 1, vaVar.f365642e.L.d1());
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
