package pv0;

/* loaded from: classes5.dex */
public abstract class y extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f440093n;

    /* renamed from: o, reason: collision with root package name */
    public final gw0.e f440094o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f440095p;

    /* renamed from: q, reason: collision with root package name */
    public final pv0.w f440096q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f440097r;

    /* renamed from: s, reason: collision with root package name */
    public pv0.o f440098s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f440093n = jz5.h.b(new pv0.u(this));
        this.f440094o = new gw0.e(Q6());
        this.f440095p = new pv0.v(this);
        this.f440096q = new pv0.w(this);
        this.f440097r = new java.util.HashMap();
        this.f440098s = new pv0.o(new java.util.concurrent.atomic.AtomicInteger(0), false);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        pv0.m mVar = new pv0.m(m158354x19263085());
        mVar.m159066x6a45c2e4(this.f440096q);
        return mVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        this.f440094o.f357679c.mo522xb5bdeb7a(this.f440095p);
        gx0.hf.b7((gx0.hf) ((jz5.n) this.f440093n).mo141623x754a37bb(), null, null, 3, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void c7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        pv0.m panel = (pv0.m) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(gx0.bf.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        gx0.bf bfVar = (gx0.bf) a17;
        bfVar.D = -1;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 PositiveInfiniteTimeRange = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16109x79d591a3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PositiveInfiniteTimeRange, "PositiveInfiniteTimeRange");
        bfVar.o7(PositiveInfiniteTimeRange, true);
    }

    public final dw0.c k7() {
        dw0.d dVar = (dw0.d) this.f440094o.f357679c.mo3195x754a37bb();
        if (dVar == null) {
            return null;
        }
        return (dw0.c) kz5.n0.a0(dVar.f325623a, dVar.f325624b.f325627b);
    }

    public final dw0.c l7(java.lang.String roleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        dw0.d dVar = (dw0.d) this.f440094o.f357679c.mo3195x754a37bb();
        java.lang.Object obj = null;
        if (dVar == null) {
            return null;
        }
        java.util.Iterator it = dVar.f325623a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dw0.f.a(((dw0.c) next).f325619a), roleID)) {
                obj = next;
                break;
            }
        }
        return (dw0.c) obj;
    }

    public final boolean m7() {
        pv0.m mVar = (pv0.m) this.f150773i;
        return mVar != null && mVar.M;
    }

    public abstract gx0.hf n7();

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    /* renamed from: o7, reason: merged with bridge method [inline-methods] */
    public void a7(pv0.m panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        pv0.h m159065x3fab8e2e = panel.m159065x3fab8e2e();
        pp0.r0 r0Var = null;
        if (m159065x3fab8e2e == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            m159065x3fab8e2e = null;
        }
        if (m159065x3fab8e2e == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = m159065x3fab8e2e.f440058a;
        boolean z17 = m159065x3fab8e2e.f440062e;
        pv0.a aVar = m159065x3fab8e2e.f440059b;
        pv0.j jVar = m159065x3fab8e2e.f440061d;
        pp0.s0 s0Var = S6().f324978i;
        if (s0Var == null) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            s0Var = null;
        }
        if (s0Var != null) {
            pp0.r0 r0Var2 = Q6().f324976g;
            if (r0Var2 == null) {
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else {
                r0Var = r0Var2;
            }
            if (r0Var != null) {
                this.f440098s = new pv0.o(new java.util.concurrent.atomic.AtomicInteger(0), false);
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = c4190xd8dd3713.B();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
                if (B.m34010x7b953cf2()) {
                    android.app.Activity context = m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(gx0.bf.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    ((gx0.bf) a17).o7(B, true);
                }
                pv0.g gVar = new pv0.g(new pv0.n(this, aVar), s0Var, r0Var);
                java.util.HashMap hashMap = this.f440097r;
                ug.m C = c4190xd8dd3713.C();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
                hashMap.put(C, gVar);
                java.lang.String b17 = ru0.a.b(c4190xd8dd3713);
                if (b17 == null) {
                    b17 = "";
                }
                p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new pv0.r(jVar, b17, this, c4190xd8dd3713, z17, null), 3, null);
            }
        }
        this.f440094o.f357679c.mo7806x9d92d11c(panel, this.f440095p);
        java.lang.String b18 = ru0.a.b(m159065x3fab8e2e.f440058a);
        panel.m47074x209a1f1f(java.lang.Boolean.TRUE);
        panel.I(new pv0.s(this, b18), new pv0.t(this, b18));
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        java.util.HashMap hashMap = this.f440097r;
        java.util.Set entrySet = hashMap.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            vu0.s sVar = (vu0.s) ((jz5.n) ((pv0.g) ((java.util.Map.Entry) it.next()).getValue()).f440056d).mo141623x754a37bb();
            sVar.a();
            yu0.m mVar = (yu0.m) ((jz5.n) sVar.f521686e).mo141623x754a37bb();
            if (mVar != null) {
                mVar.b();
            }
        }
        hashMap.clear();
    }

    public final void p7(ug.m segmentType, java.util.List timbreRequestGroupList) {
        dw0.c k76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentType, "segmentType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreRequestGroupList, "timbreRequestGroupList");
        segmentType.toString();
        java.lang.Object obj = this.f440097r.get(segmentType);
        if (obj == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            obj = null;
        }
        pv0.g gVar = (pv0.g) obj;
        if (gVar == null) {
            return;
        }
        if (!m7() && (k76 = k7()) != null) {
            this.f440098s = new pv0.o(new java.util.concurrent.atomic.AtomicInteger(timbreRequestGroupList.size()), true);
            pv0.m mVar = (pv0.m) this.f150773i;
            if (mVar != null) {
                mVar.B();
            }
            this.f440094o.f(k76);
        }
        gVar.a(timbreRequestGroupList);
    }

    public final boolean q7(yz5.p pVar) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713;
        dw0.c k76 = k7();
        if (k76 == null || (c4190xd8dd3713 = k76.f325620b) == null) {
            return true;
        }
        java.lang.Object obj = this.f440097r.get(c4190xd8dd3713.C());
        if (obj == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            obj = null;
        }
        pv0.g gVar = (pv0.g) obj;
        if (gVar == null) {
            return true;
        }
        return ((java.lang.Boolean) pVar.mo149xb9724478(gVar, k76)).booleanValue();
    }

    public final void r7(dw0.c cVar, boolean z17) {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new pv0.x(this, z17, cVar, null), 3, null);
    }
}
