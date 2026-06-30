package ba2;

/* loaded from: classes2.dex */
public final class a extends ir2.c {

    /* renamed from: e, reason: collision with root package name */
    public final int f100214e;

    /* renamed from: f, reason: collision with root package name */
    public final long f100215f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f100216g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f100217h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f100218i;

    /* renamed from: m, reason: collision with root package name */
    public final int f100219m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.qt2 f100220n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f100221o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f100222p;

    /* renamed from: q, reason: collision with root package name */
    public final int f100223q;

    /* renamed from: r, reason: collision with root package name */
    public final r45.a34 f100224r;

    /* renamed from: s, reason: collision with root package name */
    public final ey2.p2 f100225s;

    public a(int i17, long j17, java.lang.Long l17, java.lang.String str, java.lang.String str2, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, java.lang.String str3, java.lang.String key, int i19, r45.a34 a34Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f100214e = i17;
        this.f100215f = j17;
        this.f100216g = l17;
        this.f100217h = str;
        this.f100218i = str2;
        this.f100219m = i18;
        this.f100220n = qt2Var;
        this.f100221o = str3;
        this.f100222p = key;
        this.f100223q = i19;
        this.f100224r = a34Var;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.p2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f100225s = (ey2.p2) a17;
        this.f375651d = gVar;
    }

    @Override // ir2.c
    public ir2.a f(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.oa1 resp = (r45.oa1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        boolean z17 = this.f375651d == null;
        this.f375651d = resp.m75934xbce7f2f(2);
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            r45.qt2 qt2Var = this.f100220n;
            o3Var.rk(c19792x256d2725, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 64);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.I.put(java.lang.Long.valueOf(a17.m59251x5db1b11()), a17);
            arrayList.add(cu2.u.f303974a.p(a17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityCgiSource", "handleResp incrementList:" + arrayList + ", innerTabType: " + this.f100219m + ", mediaTabType: " + this.f100223q);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f375651d;
        ba2.b bVar = new ba2.b(arrayList, gVar == null, gVar);
        bVar.f100226k = (r45.r03) resp.m75936x14adae67(5);
        bVar.f375620i = resp.m75939xb282bd08(3);
        if (z17) {
            java.lang.String str = this.f100222p;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f100225s.O6(str, arrayList, (r45.r03) resp.m75936x14adae67(5));
            }
        }
        return bVar;
    }

    @Override // ir2.c, ir2.a0, ay1.m
    /* renamed from: getKey */
    public ir2.z getF204809h() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f100219m);
        sb6.append('_');
        sb6.append(this.f100223q);
        return new ir2.z(sb6.toString());
    }

    @Override // ir2.c
    public az2.j h() {
        return new db2.t1(this.f100214e, this.f100215f, this.f100216g, this.f100217h, this.f100218i, this.f100219m, this.f375651d, this.f100220n, this.f100221o, this.f100223q, this.f100224r);
    }
}
