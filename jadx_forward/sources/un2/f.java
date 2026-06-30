package un2;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f510994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un2.k f510995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z41 f510996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f510997g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, un2.k kVar, r45.z41 z41Var, int i17) {
        super(0);
        this.f510994d = j17;
        this.f510995e = kVar;
        this.f510996f = z41Var;
        this.f510997g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        un2.a aVar;
        un2.a aVar2;
        un2.a aVar3;
        un2.k kVar = this.f510995e;
        if (this.f510994d == kVar.c().getFeedObject().m59251x5db1b11()) {
            long j17 = kVar.f511007d;
            r45.z41 z41Var = this.f510996f;
            long m75942xfb822ef2 = z41Var.m75942xfb822ef2(3);
            int i17 = this.f510997g;
            if (j17 == m75942xfb822ef2 && kVar.f511008e == z41Var.m75942xfb822ef2(4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletLoader", "onGetBulletCgiSuccess: hasMore = false, id=" + pm0.v.u(kVar.c().getFeedObject().m59251x5db1b11()) + ", pullType=" + i17 + ", minBulletTime = " + kVar.f511007d + ", maxBulletTime = " + kVar.f511008e);
                kVar.f511009f = false;
            } else {
                long j18 = 1000;
                un2.k.a(kVar, (int) (z41Var.m75942xfb822ef2(3) / j18), (int) (z41Var.m75942xfb822ef2(4) / j18));
                kVar.f511007d = z41Var.m75942xfb822ef2(3);
                kVar.f511008e = z41Var.m75942xfb822ef2(4);
                kVar.f511005b = z41Var.m75934xbce7f2f(2);
                java.util.LinkedList m75941xfb821914 = z41Var.m75941xfb821914(6);
                if ((m75941xfb821914 != null && (m75941xfb821914.isEmpty() ^ true)) && (aVar3 = kVar.f511006c) != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
                    bb2.f1 f1Var = (bb2.f1) aVar3;
                    cq.k1.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    if (!((java.lang.Boolean) t70Var.N0().r()).booleanValue()) {
                        cq.k1.a();
                        if (((java.lang.Boolean) t70Var.P().r()).booleanValue()) {
                            cq.k1.a();
                            lb2.j jVar = (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209390o6).mo141623x754a37bb();
                            jVar.l();
                            if (((java.lang.Boolean) jVar.r()).booleanValue()) {
                                bb2.w1 w1Var = f1Var.f100393a;
                                w1Var.f100584p = m75941xfb821914;
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xp.d.f().f537397u, m75941xfb821914)) {
                                    xp.d.f().f537397u = m75941xfb821914;
                                    w1Var.d().j5();
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletManager", "setFollowInfoList: size=" + java.lang.Integer.valueOf(m75941xfb821914.size()));
                            }
                        }
                    }
                }
                java.util.LinkedList<r45.oo> m75941xfb8219142 = z41Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getComment_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                for (r45.oo ooVar : m75941xfb8219142) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ooVar);
                    arrayList.add(new bb2.o(ooVar));
                }
                if ((!arrayList.isEmpty()) && (aVar2 = kVar.f511006c) != null) {
                    bb2.w1 w1Var2 = ((bb2.f1) aVar2).f100393a;
                    w1Var2.b(w1Var2.e().k2(arrayList), "onBulletIncrease", false);
                }
                java.lang.String m75945x2fec8307 = z41Var.m75945x2fec8307(5);
                if (m75945x2fec8307 != null && (aVar = kVar.f511006c) != null) {
                    ((bb2.f1) aVar).f100393a.f100587s = m75945x2fec8307;
                }
                kVar.f511009f = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletLoader", "onGetBulletCgiSuccess: size = " + arrayList.size() + ", hasMore = " + kVar.f511009f + ", id=" + pm0.v.u(kVar.c().getFeedObject().m59251x5db1b11()) + ", pullType=" + i17 + ", minBulletTime = " + kVar.f511007d + ", maxBulletTime = " + kVar.f511008e);
                kVar.f511010g = false;
            }
        }
        return jz5.f0.f384359a;
    }
}
