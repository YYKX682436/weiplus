package hn4;

/* loaded from: classes15.dex */
public class j extends fn4.e {

    /* renamed from: h, reason: collision with root package name */
    public boolean f364110h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364111i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f364112m;

    /* renamed from: n, reason: collision with root package name */
    public hn4.d0 f364113n;

    public j(hn4.b bVar) {
        super(bVar);
    }

    @Override // fn4.e
    public int B(int i17) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) ((hn4.b) this.f346025g)).K.d(i17 - z()).D) ? 0 : 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        fn4.m mVar = (fn4.m) k3Var;
        if ((i17 < z()) || I(i17)) {
            return;
        }
        int z17 = i17 - z();
        hn4.d0 d0Var = (hn4.d0) mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) ((hn4.b) this.f346025g);
        r45.xn6 d17 = abstractActivityC18755xab3fd75e.K.d(z17);
        d0Var.q(d17);
        ((java.util.HashMap) this.f346024f).put(d17.f471792h, new java.lang.ref.WeakReference(d0Var));
        if (z17 == 0) {
            this.f364113n = d0Var;
        }
        if (!this.f364110h || z17 != 0) {
            abstractActivityC18755xab3fd75e.H.e(d17);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17.f471789e)) {
            this.f364112m = true;
        } else {
            d0Var.s(true ^ abstractActivityC18755xab3fd75e.G.f346100a);
            this.f364110h = false;
            abstractActivityC18755xab3fd75e.H.e(d17);
            this.f364112m = false;
        }
        if (this.f364111i && z17 == abstractActivityC18755xab3fd75e.f256668o.f469049v) {
            boolean d18 = abstractActivityC18755xab3fd75e.f256659J.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoAdapter", "full screen play %d %b", java.lang.Integer.valueOf(abstractActivityC18755xab3fd75e.f256668o.f469049v), java.lang.Boolean.valueOf(d18));
            this.f364111i = false;
            fn4.g gVar = abstractActivityC18755xab3fd75e.f256659J.f346107c;
            fn4.g gVar2 = d0Var.f364083h;
            if (gVar.e()) {
                gVar2.m();
            }
            fn4.l1 l1Var = abstractActivityC18755xab3fd75e.f256659J;
            fn4.g gVar3 = d0Var.f364083h;
            ((hn4.z) gVar3).getClass();
            l1Var.b(gVar3, com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
            if (gVar != gVar2) {
                fn4.f m129847x6ba61aa4 = gVar.m129847x6ba61aa4();
                if (m129847x6ba61aa4 == fn4.f.MOBILE_NET) {
                    gVar2.g();
                } else if (m129847x6ba61aa4 == fn4.f.NO_NET) {
                    gVar2.c();
                    gVar2.k(gVar2.m129846x994e8055(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80));
                }
            }
            gVar2.mo129842x143e7d6c().mo61296x11f3be80(d18);
            gVar2.mo129842x143e7d6c().m129853xc49ceedf(abstractActivityC18755xab3fd75e.f256668o.f469050w);
            abstractActivityC18755xab3fd75e.a2(d0Var.f346117e);
            gVar2.i();
            gVar2.f346058w.setVisibility(0);
            d0Var.v();
            d0Var.t();
            d0Var.m();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        x.o oVar = this.f346022d;
        java.lang.Object e17 = oVar.e(i17, null);
        fn4.b bVar = this.f346025g;
        if (e17 != null) {
            return new fn4.d0((android.view.View) oVar.e(i17, null), bVar);
        }
        x.o oVar2 = this.f346023e;
        if (oVar2.e(i17, null) != null) {
            return new fn4.d0((android.view.View) oVar2.e(i17, null), bVar);
        }
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571119d23, (android.view.ViewGroup) null);
        inflate.setTag("video");
        return i17 == 0 ? new hn4.d0(inflate, (hn4.b) bVar, false) : new hn4.d0(inflate, (hn4.b) bVar, true);
    }

    @Override // fn4.e
    public void x(java.util.List list, boolean z17) {
        super.x(list, z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new hn4.i(this, list, z17));
    }
}
