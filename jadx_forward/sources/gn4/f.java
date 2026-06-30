package gn4;

/* loaded from: classes15.dex */
public class f extends fn4.e {

    /* renamed from: h, reason: collision with root package name */
    public final fn4.b f355143h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f355144i;

    public f(fn4.b bVar) {
        super(bVar);
        this.f355144i = false;
        this.f355143h = bVar;
    }

    @Override // fn4.e
    public int B(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        fn4.m mVar = (fn4.m) k3Var;
        if ((i17 < z()) || I(i17)) {
            return;
        }
        gn4.d0 d0Var = (gn4.d0) mVar;
        r45.xn6 d17 = this.f346025g.s4().d(i17 - z());
        d0Var.q(d17);
        ((java.util.HashMap) this.f346024f).put(d17.f471792h, new java.lang.ref.WeakReference(d0Var));
        if (this.f355144i) {
            fn4.b bVar = this.f355143h;
            if (bVar.r0().f469049v == i17) {
                boolean d18 = bVar.I2().d();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoAdapter", "fs play %d %b", java.lang.Integer.valueOf(bVar.r0().f469049v), java.lang.Boolean.valueOf(d18));
                this.f355144i = false;
                fn4.g gVar = bVar.I2().f346107c;
                gn4.z zVar = d0Var.f355138h;
                fn4.l1 I2 = bVar.I2();
                gn4.z zVar2 = d0Var.f355138h;
                I2.b(zVar2, zVar2.b(d17));
                if (gVar != null && gVar != zVar) {
                    if (gVar.e()) {
                        zVar.m();
                    }
                    fn4.f m129847x6ba61aa4 = gVar.m129847x6ba61aa4();
                    if (m129847x6ba61aa4 == fn4.f.MOBILE_NET) {
                        zVar.g();
                    } else if (m129847x6ba61aa4 == fn4.f.NO_NET) {
                        zVar.c();
                        zVar.k(zVar.m129846x994e8055(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80));
                    }
                }
                zVar.mo129842x143e7d6c().mo61296x11f3be80(d18);
                zVar.mo129842x143e7d6c().w();
                zVar.mo129842x143e7d6c().m129853xc49ceedf(bVar.r0().f469050w);
                zVar.i();
                bVar.a2(d0Var.f346117e);
                d0Var.t();
                d0Var.m();
                zVar.f346058w.setVisibility(0);
                if (bVar.o4().f346012f != null) {
                    bVar.o4().f346012f.f478991g = 1L;
                }
            }
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
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d1q, (android.view.ViewGroup) null);
        inflate.setTag("video");
        return new gn4.d0(inflate, this.f355143h);
    }

    @Override // fn4.e
    public void x(java.util.List list, boolean z17) {
        super.x(list, z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gn4.e(this, list));
    }
}
