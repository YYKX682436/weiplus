package jn2;

/* loaded from: classes10.dex */
public final class c1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f382100d;

    /* renamed from: e, reason: collision with root package name */
    public final sf2.x f382101e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f382102f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f382103g;

    /* renamed from: h, reason: collision with root package name */
    public final jn2.a2 f382104h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.in f382105i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ch6 f382106m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f382107n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f382108o;

    public c1(android.content.Context context, sf2.x xVar, gk2.e liveData, p3325xe03a0797.p3326xc267989b.y0 y0Var, jn2.a2 sourceType, r45.in inVar, r45.ch6 ch6Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        inVar = (i17 & 32) != 0 ? null : inVar;
        ch6Var = (i17 & 64) != 0 ? null : ch6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceType, "sourceType");
        this.f382100d = context;
        this.f382101e = xVar;
        this.f382102f = liveData;
        this.f382103g = y0Var;
        this.f382104h = sourceType;
        this.f382105i = inVar;
        this.f382106m = ch6Var;
        this.f382107n = new java.util.ArrayList();
        hn2.h hVar = new hn2.h(y0Var, xVar != null ? ((mm2.j5) xVar.m56788xbba4bfc0(mm2.j5.class)).f410715g : null);
        zl2.q4.f555466a.R("FinderLiveAnchorSingSongListAdapter");
        jn2.s0 s0Var = new jn2.s0(this);
        jn2.t0 t0Var = new jn2.t0(this);
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new hn2.g(hVar, s0Var, t0Var, null), 3, null);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f382107n).size() + (this.f382108o ? 1 : 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return i17 < ((java.util.ArrayList) this.f382107n).size() ? 0 : 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder instanceof jn2.b1) {
            jn2.w0 songData = (jn2.w0) ((java.util.ArrayList) this.f382107n).get(i17);
            jn2.b1 b1Var = (jn2.b1) holder;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songData, "songData");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a c14424xe21e01a = b1Var.f382091d;
            r45.ay1 ay1Var = songData.f382273a;
            c14424xe21e01a.A(ay1Var.f451884e, ay1Var.f451886g, ay1Var.f451887h, ay1Var.f451888i, ay1Var.f451893q);
            java.lang.String str = ay1Var.f451883d;
            boolean z17 = ay1Var.f451893q;
            jn2.c1 c1Var = b1Var.f382096i;
            java.util.ArrayList arrayList = ((mm2.m6) c1Var.f382102f.a(mm2.m6.class)).f410782q.f315618a;
            boolean z18 = false;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r45.z22 z22Var = (r45.z22) it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z22Var.f473160d, str) && z22Var.f473161e == z17) {
                        z18 = true;
                        break;
                    }
                }
            }
            b1Var.j(z18 ? jn2.u0.f382246f : jn2.u0.f382244d);
            b1Var.f382092e.setOnClickListener(new jn2.y0(b1Var, c1Var, ay1Var, songData));
            b1Var.f382091d.setOnClickListener(new jn2.z0(b1Var, songData));
            b1Var.i(songData);
            return;
        }
        boolean z19 = holder instanceof jn2.v0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570536ec4, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new jn2.b1(this, inflate);
        }
        if (i17 != 1) {
            throw new java.lang.IllegalArgumentException("Invalid view type");
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ami, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new jn2.v0(inflate2);
    }

    public final void x(java.util.List basicInfoList, java.util.List resourceInfoList, java.lang.String searchKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basicInfoList, "basicInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceInfoList, "resourceInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchKey, "searchKey");
        java.util.List list = this.f382107n;
        int size = ((java.util.ArrayList) list).size();
        int i17 = 0;
        for (java.lang.Object obj : basicInfoList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((java.util.ArrayList) list).add(new jn2.w0((r45.ay1) obj, (r45.cy1) kz5.n0.a0(resourceInfoList, i17)));
            i17 = i18;
        }
        m8153xd399a4d9(size, basicInfoList.size());
    }

    public final void y(java.util.List basicInfoList, java.util.List resourceInfoList, boolean z17, java.lang.String searchKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basicInfoList, "basicInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceInfoList, "resourceInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchKey, "searchKey");
        java.util.List list = this.f382107n;
        ((java.util.ArrayList) list).clear();
        int i17 = 0;
        for (java.lang.Object obj : basicInfoList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((java.util.ArrayList) list).add(new jn2.w0((r45.ay1) obj, (r45.cy1) kz5.n0.a0(resourceInfoList, i17)));
            i17 = i18;
        }
        this.f382108o = z17;
        m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if ((!payloads.isEmpty()) && payloads.contains("payload_audition_state")) {
            if (holder instanceof jn2.b1) {
                java.util.List list = this.f382107n;
                if (i17 < ((java.util.ArrayList) list).size()) {
                    ((jn2.b1) holder).i((jn2.w0) ((java.util.ArrayList) list).get(i17));
                    return;
                }
                return;
            }
            return;
        }
        mo864xe5e2e48d(holder, i17);
    }
}
