package gn4;

/* loaded from: classes15.dex */
public class c1 extends fn4.e {

    /* renamed from: h, reason: collision with root package name */
    public final fn4.b f355134h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f355135i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f355136m;

    /* renamed from: n, reason: collision with root package name */
    public gn4.d0 f355137n;

    public c1(fn4.b bVar) {
        super(bVar);
        this.f355134h = bVar;
    }

    @Override // fn4.e
    public int B(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        fn4.m mVar = (fn4.m) k3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryOnlyFSVideoAdapter", "onBindViewHolder %d", java.lang.Integer.valueOf(i17));
        if ((i17 < z()) || I(i17)) {
            return;
        }
        int z17 = i17 - z();
        gn4.d0 d0Var = (gn4.d0) mVar;
        fn4.b bVar = this.f355134h;
        r45.xn6 d17 = bVar.s4().d(z17);
        d0Var.q(d17);
        ((java.util.HashMap) this.f346024f).put(d17.f471792h, new java.lang.ref.WeakReference(d0Var));
        if (z17 == 0) {
            this.f355137n = d0Var;
        }
        if (this.f355135i && z17 == 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17.f471789e)) {
                this.f355136m = true;
            } else {
                d0Var.s(!bVar.s1().f346100a);
                this.f355135i = false;
                this.f355136m = false;
            }
        }
        if (bVar.o4().f346012f != null) {
            bVar.o4().f346012f.f478991g = 1L;
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
        return new gn4.d1(inflate, this.f355134h);
    }

    @Override // fn4.e
    public void x(java.util.List list, boolean z17) {
        super.x(list, z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gn4.b1(this, list, z17));
    }
}
