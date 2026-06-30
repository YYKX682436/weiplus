package bb2;

/* loaded from: classes10.dex */
public final class w1 {

    /* renamed from: x */
    public static final bb2.b1 f19035x = new bb2.b1(null);

    /* renamed from: a */
    public final android.view.View f19036a;

    /* renamed from: b */
    public so2.u1 f19037b;

    /* renamed from: c */
    public vp.x f19038c;

    /* renamed from: d */
    public long f19039d;

    /* renamed from: e */
    public long f19040e;

    /* renamed from: f */
    public un2.k f19041f;

    /* renamed from: g */
    public boolean f19042g;

    /* renamed from: h */
    public vp.w f19043h;

    /* renamed from: i */
    public long f19044i;

    /* renamed from: j */
    public float f19045j;

    /* renamed from: k */
    public boolean f19046k;

    /* renamed from: l */
    public java.util.LinkedList f19047l;

    /* renamed from: m */
    public boolean f19048m;

    /* renamed from: n */
    public boolean f19049n;

    /* renamed from: o */
    public boolean f19050o;

    /* renamed from: p */
    public java.util.List f19051p;

    /* renamed from: q */
    public final java.util.concurrent.ConcurrentHashMap f19052q;

    /* renamed from: r */
    public final java.util.concurrent.ConcurrentHashMap f19053r;

    /* renamed from: s */
    public java.lang.String f19054s;

    /* renamed from: t */
    public final kotlinx.coroutines.y0 f19055t;

    /* renamed from: u */
    public kotlinx.coroutines.y0 f19056u;

    /* renamed from: v */
    public kotlinx.coroutines.r2 f19057v;

    /* renamed from: w */
    public final bb2.f1 f19058w;

    static {
        xp.i f17 = xp.d.f();
        int i17 = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.N0().r()).booleanValue() ? 1 : 3;
        f17.f455846c = i17;
        f17.f455861r = i17;
        f17.f455851h = true;
        f17.f455844a = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127675e8).getValue()).r()).intValue();
        f17.f455845b = xp.i.a(0);
        f17.f455857n = xp.i.a(0.0f);
        f17.f455858o = xp.i.a(0.0f);
        f17.f455847d = xp.i.a(6.0f);
        f17.f455848e = xp.i.a(24);
        f17.b(true);
    }

    public w1(android.view.View bulletView) {
        kotlin.jvm.internal.o.g(bulletView, "bulletView");
        this.f19036a = bulletView;
        xp.c cVar = new xp.c(null);
        cVar.f455823a = new bb2.l1(this);
        cVar.f455826d = bb2.m1.f18919a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bb2.x2 x2Var = new bb2.x2(context);
        x2Var.f19074b = new bb2.g1(this);
        x2Var.f19075c = new bb2.h1(this);
        android.content.Context context2 = bulletView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        bb2.z0 z0Var = new bb2.z0(context2);
        z0Var.f19093b = new bb2.i1(this);
        z0Var.f19094c = new bb2.j1(this);
        z0Var.f19095d = new bb2.k1(this);
        ((java.util.ArrayList) cVar.f455825c).addAll(kz5.c0.i(x2Var, z0Var));
        cVar.f455824b = new bb2.o1(this);
        cVar.f455827e = "FinderBullet";
        xp.d dVar = new xp.d(cVar, null);
        cq.k1.a();
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.P().r()).booleanValue();
        this.f19048m = booleanValue;
        this.f19038c = new vp.x(bulletView, dVar, booleanValue);
        this.f19039d = -1L;
        this.f19040e = -1L;
        this.f19045j = 1.0f;
        this.f19052q = new java.util.concurrent.ConcurrentHashMap();
        this.f19053r = new java.util.concurrent.ConcurrentHashMap();
        this.f19055t = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
        this.f19058w = new bb2.f1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(bb2.w1 r38, java.lang.String r39, boolean r40, int r41, long r42, long r44, long r46, boolean r48, int r49, java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bb2.w1.k(bb2.w1, java.lang.String, boolean, int, long, long, long, boolean, int, java.lang.Object):void");
    }

    public static /* synthetic */ void o(bb2.w1 w1Var, long j17, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 0;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        w1Var.n(j17, z17, z18);
    }

    public final void a(java.util.List list, java.lang.String str, boolean z17) {
        int i17;
        com.tencent.mars.xlog.Log.i("FinderBulletManager", "addDanmaku: size = " + list.size() + ", source = " + str);
        vp.x d17 = d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            bb2.o oVar = (bb2.o) next;
            long j17 = oVar.f18926a.getLong(1);
            r45.oo ooVar = oVar.f18926a;
            if ((j17 == 0 && ooVar.getInteger(12) == 0) || (ooVar.getLong(1) == 1 && ooVar.getInteger(12) == 1)) {
                z18 = true;
            }
            if (z18) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            bb2.o oVar2 = (bb2.o) next2;
            int i27 = oVar2.f18926a.getInteger(12) == 1 ? -2147483646 : 0;
            wp.a f57 = d().f5(i27, oVar2);
            cq.k1.a();
            boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.P().r()).booleanValue();
            r45.oo ooVar2 = oVar2.f18926a;
            if (booleanValue) {
                cq.k1.a();
                i17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127839n6).getValue()).r()).intValue();
            } else if (i27 == -2147483646) {
                r45.no noVar = (r45.no) ooVar2.getCustom(13);
                i17 = noVar != null ? noVar.getInteger(0) : xp.d.f().f455844a;
            } else {
                i17 = 3000;
            }
            f57.f448345p = i17;
            f57.f448335f = ooVar2.getLong(3);
            java.util.LinkedList linkedList = this.f19047l;
            if (linkedList != null && linkedList.contains(java.lang.Long.valueOf(oVar2.a()))) {
                f57.f448348s = true;
            }
            f57.f448355z = i18;
            boolean z19 = this.f19048m;
            f57.A = z19;
            if (z19) {
                f57.a();
            }
            arrayList2.add(f57);
            i18 = i19;
        }
        d17.f438852d.k1(arrayList2, false, false);
        if (z17) {
            bb2.z0.f19091e.clear();
        }
    }

    public final void b(java.util.List list, java.lang.String str, boolean z17) {
        if (!this.f19048m) {
            a(list, str, z17);
            return;
        }
        kotlinx.coroutines.y0 y0Var = this.f19056u;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new bb2.c1(this, list, str, z17, null), 3, null);
        } else {
            kotlin.jvm.internal.o.o("addDanmakuScope");
            throw null;
        }
    }

    public final void c(float f17, boolean z17) {
        this.f19045j = f17;
        int a17 = bb2.b1.a(f19035x, !z17, f17);
        xp.d.f().f455844a = a17;
        xp.d.f().f455860q = this.f19045j;
        com.tencent.mars.xlog.Log.i("FinderBulletManager", "changeSpeed: duration=" + a17 + ", ratio=" + f17 + ", isLandscape=" + z17);
        d().j5();
    }

    public final vp.x d() {
        vp.x xVar = this.f19038c;
        if (xVar != null) {
            return xVar;
        }
        kotlin.jvm.internal.o.o("danmakuManager");
        throw null;
    }

    public final so2.u1 e() {
        so2.u1 u1Var = this.f19037b;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.o.o("feedObject");
        throw null;
    }

    public final float f() {
        long j17 = this.f19040e;
        if (j17 <= 0) {
            return 0.0f;
        }
        return ((float) this.f19039d) / ((float) j17);
    }

    public final boolean g() {
        return this.f19042g && this.f19037b != null;
    }

    public final void h(so2.u1 feed, boolean z17, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mars.xlog.Log.i("FinderBulletManager", "onAttach: id = " + pm0.v.u(feed.getItemId()) + "， this=" + hashCode());
        i();
        this.f19042g = true;
        this.f19046k = z17;
        this.f19041f = new un2.k();
        this.f19037b = feed;
        this.f19047l = linkedList;
        kotlinx.coroutines.c0 a17 = kotlinx.coroutines.t3.a(null, 1, null);
        this.f19057v = a17;
        this.f19056u = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a.plus(a17));
        un2.k kVar = this.f19041f;
        if (kVar == null) {
            kotlin.jvm.internal.o.o("bulletLoader");
            throw null;
        }
        android.content.Context context = this.f19036a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bb2.f1 listener = this.f19058w;
        kotlin.jvm.internal.o.g(listener, "listener");
        kVar.f429478h = context;
        kVar.f429471a = feed;
        kVar.f429473c = listener;
        kVar.f429480j = linkedList;
        com.tencent.mars.xlog.Log.i("FinderBulletLoader", "onAttach " + feed + ' ' + listener.hashCode() + ' ' + linkedList);
        int length = kVar.f429479i.length;
        for (int i17 = 0; i17 < length; i17++) {
            kVar.f429479i[i17] = 0;
        }
        if (m()) {
            u();
        } else {
            un2.k kVar2 = this.f19041f;
            if (kVar2 == null) {
                kotlin.jvm.internal.o.o("bulletLoader");
                throw null;
            }
            kVar2.d();
        }
        vp.w wVar = this.f19043h;
        if (wVar != null) {
            d().f438852d.i6(wVar);
        }
        d().f438852d.f0(false);
        if (feed.h2(this.f19046k)) {
            if (this.f19039d >= 0) {
                d().n(0L);
            }
            if (!((java.util.ArrayList) e().f410634h).isEmpty()) {
                b(e().f410634h, "onAttach", true);
            }
        }
        this.f19045j = 1.0f;
    }

    public final void i() {
        if (g()) {
            this.f19042g = false;
            this.f19039d = -1L;
            com.tencent.mars.xlog.Log.i("FinderBulletManager", "onDetach: id = " + pm0.v.u(e().getFeedObject().getId()) + "， this=" + hashCode());
            l();
            d().f438852d.release();
            un2.k kVar = this.f19041f;
            if (kVar == null) {
                kotlin.jvm.internal.o.o("bulletLoader");
                throw null;
            }
            kVar.f429478h = null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach ");
            sb6.append(kVar.c());
            sb6.append(' ');
            un2.a aVar = kVar.f429473c;
            sb6.append(aVar != null ? aVar.hashCode() : 0);
            com.tencent.mars.xlog.Log.i("FinderBulletLoader", sb6.toString());
            this.f19044i = 0L;
            bb2.z0.f19091e.clear();
            this.f19054s = null;
            this.f19051p = null;
            xp.d.f().f455864u = null;
            kotlinx.coroutines.r2 r2Var = this.f19057v;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f19049n = false;
            this.f19050o = false;
        }
    }

    public final void j() {
        if (g()) {
            com.tencent.mars.xlog.Log.i("FinderBulletManager", "pause: id = ".concat(pm0.v.u(e().getItemId())));
            if (d().isPlaying()) {
                d().f(false);
            }
        }
    }

    public final void l() {
        com.tencent.mm.plugin.finder.report.n4 n4Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f19052q;
        java.util.Collection values = concurrentHashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.List S0 = kz5.n0.S0(values);
        concurrentHashMap.clear();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f19053r;
        java.util.Collection values2 = concurrentHashMap2.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        java.util.List S02 = kz5.n0.S0(values2);
        concurrentHashMap2.clear();
        android.view.View view = this.f19036a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.r0 a76 = nyVar != null ? nyVar.a7(-1) : null;
        com.tencent.mm.plugin.finder.report.k4 k4Var = a76 instanceof com.tencent.mm.plugin.finder.report.k4 ? (com.tencent.mm.plugin.finder.report.k4) a76 : null;
        if (k4Var == null || (n4Var = k4Var.f125108z) == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.util.Map a17 = d2Var.a(context2, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(n4Var.f125153a)), new jz5.l("start_time", java.lang.Long.valueOf(n4Var.f125157c)), new jz5.l("end_time", java.lang.Long.valueOf(currentTimeMillis)), new jz5.l("request_report_json", this.f19054s)));
        if (a17 != null) {
            kotlinx.coroutines.l.d(this.f19055t, null, null, new bb2.v1(S0, S02, a17, null), 3, null);
        }
    }

    public final boolean m() {
        cq.k1.a();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.P().r()).booleanValue()) {
            cq.k1.a();
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127767j6).getValue()).r()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void n(long j17, boolean z17, boolean z18) {
        if (g() && !d().isPlaying() && e().h2(this.f19046k)) {
            com.tencent.mars.xlog.Log.i("FinderBulletManager", "restart: timeStamp = " + j17 + ", id = " + pm0.v.u(e().getItemId()));
            b(e().f410634h, "restart", z18);
            d().n(j17);
            if (z17) {
                d().f(false);
            }
        }
    }

    public final void p() {
        if (g()) {
            com.tencent.mars.xlog.Log.i("FinderBulletManager", "resume: id = ".concat(pm0.v.u(e().getItemId())));
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127803l6).getValue()).r()).booleanValue() || !d().isPlaying()) {
                d().f438852d.resume();
            }
        }
    }

    public final void q(int i17) {
        long j17 = i17 * 1000;
        if (!g()) {
            com.tencent.mars.xlog.Log.i("FinderBulletManager", "no attach seek seek: timeStamp = " + i17);
            this.f19039d = j17;
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderBulletManager", "seek: timeStamp = " + i17 + ", isAttached=" + this.f19042g + ", id = " + pm0.v.u(e().getItemId()));
        d().f438852d.seek(j17);
        if (j17 < this.f19039d) {
            this.f19039d = j17;
            d().f438852d.t2();
            d().f438852d.U4();
            b(e().f410634h, "seek", true);
        }
    }

    public final void r(int i17, boolean z17) {
        xp.i f17 = xp.d.f();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.N0().r()).booleanValue()) {
            i17 = 1;
        }
        f17.f455846c = i17;
        f17.f455861r = i17;
        f17.b(z17);
        f17.f455844a = bb2.b1.a(f19035x, z17, f17.f455860q);
        f17.f455860q = this.f19045j;
        com.tencent.mars.xlog.Log.i("FinderBulletManager", "setDanmakuRow: rowCount=" + f17.f455846c + ", isVertical=" + z17 + ", duration=" + f17.f455844a + ", playSpeedRatio=" + f17.f455860q);
        d().j5();
    }

    public final void s(long j17, long j18) {
        if (g()) {
            pm0.v.u(e().getItemId());
            if (this.f19039d == -1 && e().h2(this.f19046k)) {
                d().n(j17);
            }
            this.f19039d = j17;
            this.f19040e = j18;
            un2.k kVar = this.f19041f;
            if (kVar != null) {
                pm0.v.V(0L, new un2.b(kVar, j18, j17));
            } else {
                kotlin.jvm.internal.o.o("bulletLoader");
                throw null;
            }
        }
    }

    public final void t() {
        if (g()) {
            com.tencent.mars.xlog.Log.i("FinderBulletManager", "stop: id = ".concat(pm0.v.u(e().getItemId())));
            d().f438852d.h5();
            d().f438852d.clear();
            d().f438852d.quit();
        }
    }

    public final void u() {
        synchronized (this) {
            if (g() && this.f19050o && !this.f19049n) {
                this.f19049n = true;
                un2.k kVar = this.f19041f;
                if (kVar == null) {
                    kotlin.jvm.internal.o.o("bulletLoader");
                    throw null;
                }
                kVar.d();
            }
        }
    }
}
