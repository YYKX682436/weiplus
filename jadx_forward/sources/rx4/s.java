package rx4;

/* loaded from: classes8.dex */
public final class s extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482792d;

    /* renamed from: e, reason: collision with root package name */
    public int f482793e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f482794f;

    /* renamed from: g, reason: collision with root package name */
    public rx4.d f482795g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f482796h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f482797i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f482798m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f482799n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f482792d = "FTSNativeTeachDramaBoxUIC";
        this.f482796h = new java.util.ArrayList();
        this.f482797i = new java.util.LinkedHashMap();
    }

    public final void T6(android.view.ViewGroup viewGroup, rx4.c cVar) {
        android.view.View inflate = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efx, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.t59)).setText(cVar.f482643b);
        viewGroup.addView(inflate);
        this.f482798m = inflate;
        inflate.findViewById(com.p314xaae8f345.mm.R.id.t58).setOnClickListener(new rx4.n(this, cVar));
    }

    public final void U6(rx4.c cVar) {
        boolean z17 = cVar.f482646e.length() == 0;
        java.lang.String str = this.f482792d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "jumpToLiteApp: appId is empty");
            return;
        }
        q80.d0 d0Var = new q80.d0();
        java.lang.String str2 = cVar.f482646e;
        d0Var.f442182a = str2;
        java.lang.String str3 = cVar.f482647f;
        d0Var.f442183b = str3;
        d0Var.f442184c = cVar.f482643b;
        d0Var.f442185d = java.lang.Boolean.FALSE;
        d0Var.f442204w = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        d0Var.f442188g = new android.os.Bundle();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "jumpToLiteApp: appId=" + str2 + ", page=" + str3);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(m158354x19263085(), d0Var, new rx4.p(this));
    }

    public final void a(rx4.d dVar, boolean z17) {
        java.util.List list;
        this.f482794f = z17;
        this.f482795g = dVar;
        if (dVar != null && (list = dVar.f482659d) != null) {
            jz5.g gVar = n0.o5.f415197a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((rx4.b) it.next()).f482631e);
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                if (str.length() > 0) {
                    wo0.c a17 = vo0.e.f520001b.a(str);
                    jz5.g gVar2 = n0.o5.f415197a;
                    a17.g((yo0.i) n0.o5.f415197a.mo141623x754a37bb());
                    a17.d();
                }
            }
        }
        pm0.v.X(new rx4.r(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        pm0.v.X(new rx4.r(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
    }
}
