package bb2;

/* loaded from: classes10.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f100504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f100506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f100507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f100508h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100509i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(long j17, bb2.w1 w1Var, long j18, boolean z17, int i17, java.lang.String str) {
        super(1);
        this.f100504d = j17;
        this.f100505e = w1Var;
        this.f100506f = j18;
        this.f100507g = z17;
        this.f100508h = i17;
        this.f100509i = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList<bb2.o> arrayList;
        r45.oo ooVar;
        int i17;
        r45.kp2 resp = (r45.kp2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        bb2.w1 w1Var = this.f100505e;
        if (this.f100504d == w1Var.e().getFeedObject().m59251x5db1b11()) {
            boolean z17 = true;
            r45.oo ooVar2 = (r45.oo) resp.m75936x14adae67(1);
            java.lang.Long l17 = null;
            bb2.o oVar = ooVar2 != null ? new bb2.o(ooVar2) : null;
            java.util.LinkedList<r45.oo> m75941xfb821914 = resp.m75941xfb821914(2);
            if (m75941xfb821914 != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                for (r45.oo ooVar3 : m75941xfb821914) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ooVar3);
                    arrayList.add(new bb2.o(ooVar3));
                }
            } else {
                arrayList = null;
            }
            if (oVar != null) {
                w1Var.e().k2(kz5.b0.c(oVar));
                long j17 = this.f100506f;
                r45.oo ooVar4 = oVar.f100459a;
                wp.a f57 = w1Var.d().f5(j17 > 0 ? -2147483645 : ooVar4.m75939xb282bd08(12) == 1 ? -2147483646 : 0, oVar);
                f57.f529881s = true;
                cq.k1.a();
                if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P().r()).booleanValue()) {
                    cq.k1.a();
                    i17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209372n6).mo141623x754a37bb()).r()).intValue();
                } else {
                    i17 = 3000;
                }
                f57.f529878p = i17;
                f57.f529868f = ooVar4.m75942xfb822ef2(3);
                boolean z18 = w1Var.f100581m;
                f57.A = z18;
                if (z18) {
                    f57.a();
                }
                if (j17 == 0) {
                    w1Var.d().f520385d.k0(f57, false);
                }
                pm0.v.X(new bb2.p1(this.f100505e, oVar, this.f100507g, this.f100508h, this.f100509i));
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                z17 = false;
            }
            if (!z17) {
                w1Var.e().k2(arrayList);
                for (bb2.o oVar2 : arrayList) {
                    bb2.m0 m0Var = bb2.m0.f100451a;
                    android.content.Context context = w1Var.f100569a.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    m0Var.c(context, oVar2.f100459a, w1Var.e(), (int) (w1Var.f100572d / 1000), true);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postBullet onSceneEnd: addDanmaku ");
            sb6.append(pm0.v.u(w1Var.e().getFeedObject().m59251x5db1b11()));
            sb6.append(", addTime=");
            if (oVar != null && (ooVar = oVar.f100459a) != null) {
                l17 = java.lang.Long.valueOf(ooVar.m75942xfb822ef2(3));
            }
            sb6.append(l17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletManager", sb6.toString());
            pm0.v.X(new bb2.q1(w1Var));
        }
        return jz5.f0.f384359a;
    }
}
