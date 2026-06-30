package je2;

/* loaded from: classes3.dex */
public final class t extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f380796f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f380797g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f380798h;

    /* renamed from: i, reason: collision with root package name */
    public it2.z f380799i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f380800m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f380801n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f380802o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f380803p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f380804q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f380805r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f380806s;

    /* renamed from: t, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f380807t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f380808u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f380809v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Set f380810w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f380796f = "LiveGiftSlice";
        this.f380797g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f380800m = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.FALSE);
        this.f380801n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f380802o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f380803p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f380804q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f380806s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f380807t = new p012xc85e97e9.p093xedfae76a.j0(null);
        this.f380808u = new java.util.ArrayList();
        this.f380809v = new java.util.ArrayList();
        this.f380810w = new java.util.LinkedHashSet();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 N6(je2.t tVar, java.lang.String str, android.view.ViewGroup root, int i17, android.view.ViewGroup.LayoutParams layoutParams, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            str = "";
        }
        java.lang.String source = str;
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        int i19 = i17;
        if ((i18 & 8) != 0) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        android.view.ViewGroup.LayoutParams params = layoutParams;
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        it2.z zVar = tVar.f380799i;
        if (zVar == null) {
            zVar = new it2.z();
        }
        it2.z zVar2 = zVar;
        tVar.f380799i = zVar2;
        return zVar2.a(source, kt2.c.f393505e, root, i19, params);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 O6(je2.t tVar, java.lang.String str, android.view.ViewGroup root, int i17, android.view.ViewGroup.LayoutParams layoutParams, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            str = "";
        }
        java.lang.String source = str;
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        int i19 = i17;
        if ((i18 & 8) != 0) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        android.view.ViewGroup.LayoutParams params = layoutParams;
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        it2.z zVar = tVar.f380799i;
        if (zVar == null) {
            zVar = new it2.z();
        }
        it2.z zVar2 = zVar;
        tVar.f380799i = zVar2;
        return zVar2.a(source, kt2.c.f393504d, root, i19, params);
    }

    public final java.util.List P6() {
        java.util.List list = this.f380808u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!kz5.n0.O(this.f380810w, ((r45.oq1) obj).f463974d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void Q6() {
        r45.oq1 oq1Var = (r45.oq1) kz5.n0.Z(P6());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update outer free gift = ");
        sb6.append(oq1Var != null ? je2.u.a(oq1Var) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f380796f, sb6.toString());
        this.f380807t.mo7808x76db6cb1(oq1Var);
    }

    public final void R6(r45.pq1 freeGiftInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(freeGiftInfo, "freeGiftInfo");
        synchronized (this) {
            if (freeGiftInfo.f464835d != ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410516m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f380796f, "sync freegift but objectId " + freeGiftInfo.f464835d + " does not match current Object");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f380796f, "on receive free gift list " + je2.u.b(freeGiftInfo));
            java.lang.String str = this.f380796f;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("on receive free gift list when local received = ");
            java.util.List list = this.f380809v;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(je2.u.a((r45.oq1) it.next()));
            }
            sb6.append(arrayList);
            sb6.append("  sentGiftList = ");
            sb6.append(this.f380810w);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.LinkedList gift = freeGiftInfo.f464836e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gift, "gift");
            arrayList2.addAll(gift);
            java.util.Iterator it6 = ((java.util.ArrayList) this.f380809v).iterator();
            while (it6.hasNext()) {
                r45.oq1 oq1Var = (r45.oq1) it6.next();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    arrayList3.add(((r45.oq1) it7.next()).f463974d);
                }
                if (!arrayList3.contains(oq1Var.f463974d)) {
                    arrayList2.add(0, oq1Var);
                }
            }
            ((java.util.ArrayList) this.f380808u).clear();
            ((java.util.ArrayList) this.f380808u).addAll(arrayList2);
            java.lang.String str2 = this.f380796f;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("save free gift list after merge ");
            java.util.List list2 = this.f380808u;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList4.add(je2.u.a((r45.oq1) it8.next()));
            }
            sb7.append(arrayList4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new je2.r(freeGiftInfo, this, null), 2, null);
        }
    }

    public final r45.ad5 S6(r45.oq1 oq1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oq1Var, "<this>");
        r45.ad5 ad5Var = new r45.ad5();
        ad5Var.set(5, oq1Var.f463974d);
        ad5Var.set(6, java.lang.Long.valueOf(oq1Var.f463976f));
        ad5Var.set(1, 1L);
        return ad5Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f380798h = false;
        it2.z zVar = this.f380799i;
        if (zVar != null) {
            zVar.b("onCleared", kt2.c.f393504d);
        }
        it2.z zVar2 = this.f380799i;
        if (zVar2 != null) {
            zVar2.b("onCleared", kt2.c.f393505e);
        }
        ((java.util.ArrayList) this.f380808u).clear();
        ((java.util.ArrayList) this.f380809v).clear();
        this.f380810w.clear();
        pm0.v.X(new je2.p(this));
    }
}
