package cp2;

/* loaded from: classes2.dex */
public final class u0 implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f302452d;

    public u0(cp2.v0 v0Var) {
        this.f302452d = v0Var;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g17 = ((cp2.q1) this.f302452d.z()).g();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = g17 != null ? g17.mo7946xf939df19() : null;
        if (mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) {
            return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19;
        }
        return null;
    }

    @Override // ym5.m1
    /* renamed from: onChanged */
    public void mo56048x7bb163d5() {
        cp2.v0 v0Var = this.f302452d;
        ((cp2.q1) v0Var.z()).f302431w.mo56048x7bb163d5();
        nq2.d.f420513a.f(v0Var.f302461e, v0Var.f302467n);
        tq2.c.f502753i.a(v0Var.v()).f502761g = java.lang.System.currentTimeMillis();
        tq2.d.f502763a.c("recyclerOnChange");
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56049xa44dd169(int i17, int i18) {
        cp2.q1 q1Var = (cp2.q1) this.f302452d.z();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a17 = a();
        q1Var.f302431w.mo56049xa44dd169(i17 + (a17 != null ? a17.a0() : 0), i18);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeInserted */
    public void mo56051xb0566d03(int i17, int i18) {
        int i19;
        cp2.p1 p1Var = ((cp2.q1) this.f302452d.z()).f302431w;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a17 = a();
        p1Var.mo56051xb0566d03(i17 + (a17 != null ? a17.a0() : 0), i18);
        nq2.d dVar = nq2.d.f420513a;
        cp2.v0 v0Var = this.f302452d;
        dVar.f(v0Var.f302461e, v0Var.f302467n);
        tq2.c.f502753i.a(this.f302452d.v()).f502761g = java.lang.System.currentTimeMillis();
        rq2.s sVar = rq2.s.f480412a;
        int y17 = this.f302452d.y();
        rq2.q b17 = sVar.b(y17);
        if (b17 != null) {
            b17.f480399g = c01.id.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "onUIShowEnd tabType: " + y17);
            rq2.q b18 = sVar.b(y17);
            if (b18 != null) {
                long j17 = b18.f480394b;
                long j18 = b18.f480393a;
                long j19 = j17 - j18;
                b18.f480404l = j19;
                long j27 = b18.f480395c - j17;
                b18.f480405m = j27;
                long j28 = b18.f480397e - b18.f480396d;
                b18.f480407o = j28;
                long j29 = b18.f480399g - b18.f480398f;
                b18.f480406n = j29;
                if (rq2.s.f480415d) {
                    long j37 = rq2.s.f480414c;
                    b18.f480408p = j37 - j18;
                    b18.f480409q = j17 - j37;
                }
                b18.f480404l = j19;
                b18.f480405m = j27;
                b18.f480407o = j28;
                b18.f480406n = j29;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add to report list: pullType = ");
                sb6.append(b18.f480401i);
                sb6.append(", tabType = ");
                i19 = y17;
                sb6.append(i19);
                sb6.append(", enterCost = ");
                sb6.append(b18.f480404l);
                sb6.append(", cgiCost = ");
                sb6.append(b18.f480405m);
                sb6.append(",dbCost = ");
                sb6.append(b18.f480407o);
                sb6.append(",uiCost = ");
                sb6.append(b18.f480406n);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", sb6.toString());
                java.util.HashSet hashSet = rq2.s.f480419h;
                synchronized (hashSet) {
                    long j38 = b18.f480404l;
                    if (j38 >= 0 && j38 <= 60000 && b18.f480405m >= 0 && b18.f480406n >= 0 && b18.f480407o >= 0) {
                        hashSet.add(b18);
                    }
                }
            } else {
                i19 = y17;
            }
            if (rq2.s.f480416e) {
                rq2.s.f480419h.clear();
            }
            if (!rq2.s.f480419h.isEmpty()) {
                if (i19 == 10000) {
                    new rq2.y().l();
                } else {
                    new rq2.t().l();
                }
            }
        }
        tq2.d.f502763a.c("recyclerOnInsert");
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeMoved */
    public void mo56052x5e3cd6a8(int i17, int i18, int i19) {
        cp2.q1 q1Var = (cp2.q1) this.f302452d.z();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a17 = a();
        int a07 = i17 + (a17 != null ? a17.a0() : 0);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a18 = a();
        q1Var.f302431w.mo56052x5e3cd6a8(a07, i18 + (a18 != null ? a18.a0() : 0), i19);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeRemoved */
    public void mo56053xb9568715(int i17, int i18) {
        cp2.q1 q1Var = (cp2.q1) this.f302452d.z();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a17 = a();
        q1Var.f302431w.mo56053xb9568715(i17 + (a17 != null ? a17.a0() : 0), i18);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMore */
    public void mo15403x2053b072(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        ((cp2.q1) this.f302452d.z()).f302431w.mo15403x2053b072(reason);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMoreSmooth */
    public void mo56054xc12c74c0(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        cp2.v0 v0Var = this.f302452d;
        ((cp2.q1) v0Var.z()).f302431w.mo56054xc12c74c0(reason);
        qq2.b bVar = v0Var.f302471r;
        if (bVar != null) {
            bVar.a(reason.f545054f);
        }
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishRefresh */
    public void mo15404x8041b4e4(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        ((cp2.q1) this.f302452d.z()).f302431w.mo15404x8041b4e4(reason);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56050xa44dd169(int i17, int i18, java.lang.Object obj) {
        cp2.q1 q1Var = (cp2.q1) this.f302452d.z();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a17 = a();
        q1Var.f302431w.mo56050xa44dd169(i17 + (a17 != null ? a17.a0() : 0), i18, obj);
    }
}
