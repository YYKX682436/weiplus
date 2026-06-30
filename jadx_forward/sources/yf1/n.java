package yf1;

/* loaded from: classes7.dex */
public class n implements pd1.o {

    /* renamed from: a, reason: collision with root package name */
    public pd1.m f543181a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f543182b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yf1.o f543183c;

    public n(yf1.o oVar, yf1.l lVar) {
        this.f543183c = oVar;
        yf1.m mVar = new yf1.m(this);
        wf.b bVar = oVar.f543184a;
        bVar.N = mVar;
        tf.n0.a(bVar.P, mVar);
    }

    @Override // pd1.o
    public boolean b() {
        return this.f543183c.f543184a.T;
    }

    @Override // pd1.o
    public java.lang.Integer c() {
        wf.b bVar = this.f543183c.f543184a;
        sf.f fVar = bVar.f526955p;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(bVar.w(), "getOriginPageViewId, invokeContext is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f17 = tf.d.f(fVar);
        if (f17 != null) {
            return java.lang.Integer.valueOf(f17.hashCode());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(bVar.w(), "getOriginPageViewId, pageView is null");
        return null;
    }

    @Override // pd1.o
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n.f163477e;
        wf.b bVar = this.f543183c.f543184a;
        return nVar.U2(bVar.f526961u, bVar.f526962v);
    }

    @Override // pd1.o
    /* renamed from: getKey */
    public java.lang.String mo129528xb5884f29() {
        return this.f543183c.f543184a.v();
    }

    @Override // pd1.o
    /* renamed from: getType */
    public pd1.n mo129529xfb85f7b0() {
        return pd1.n.LivePlayer;
    }

    @Override // pd1.o
    /* renamed from: getVideoHeight */
    public int mo129530x463504c() {
        return -1;
    }

    @Override // pd1.o
    /* renamed from: getVideoWidth */
    public int mo129531x8d5c7601() {
        return -1;
    }

    @Override // pd1.o
    public void h(pd1.m mVar) {
        this.f543181a = mVar;
        if (mVar != null) {
            switch (this.f543182b) {
                case 0:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).c(this);
                    return;
                case 1:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).b(this);
                    return;
                case 2:
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar;
                    yVar.b(this);
                    yVar.e(this, true);
                    return;
                case 3:
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar;
                    yVar2.b(this);
                    yVar2.e(this, false);
                    return;
                case 4:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).d(this);
                    return;
                case 5:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).a(this);
                    return;
                case 6:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).g(this);
                    return;
                case 7:
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y) mVar).f(this);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // pd1.o
    /* renamed from: pause */
    public void mo129532x65825f6() {
        this.f543183c.f543184a.C("stop", null);
    }

    @Override // pd1.o
    /* renamed from: release */
    public void mo129533x41012807() {
        final wf.b bVar = this.f543183c.f543184a;
        bVar.getClass();
        bVar.L(new java.lang.Runnable() { // from class: wf.b$$n
            @Override // java.lang.Runnable
            public final void run() {
                wf.b.this.J();
            }
        });
    }

    @Override // pd1.o
    /* renamed from: start */
    public void mo129534x68ac462() {
        this.f543183c.f543184a.H();
    }
}
