package bp4;

/* loaded from: classes10.dex */
public final class e4 extends yt3.a implements bp4.a0, bp4.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f104691f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f104692g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d f104693h;

    /* renamed from: i, reason: collision with root package name */
    public final int f104694i;

    /* renamed from: m, reason: collision with root package name */
    public final int f104695m;

    /* renamed from: n, reason: collision with root package name */
    public long f104696n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(android.view.View layout, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104691f = layout;
        android.view.View findViewById = layout.findViewById(com.p314xaae8f345.mm.R.id.p4d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f104692g = findViewById;
        android.view.View findViewById2 = layout.findViewById(com.p314xaae8f345.mm.R.id.p4k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d) findViewById2;
        this.f104693h = c18833x82cf22d;
        this.f104694i = 112;
        this.f104695m = 63;
        c18833x82cf22d.m72715xa921a1a2(new bp4.c4(status));
        this.f104696n = -1L;
    }

    @Override // bp4.b0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17, boolean z17) {
        int i17;
        kp4.c1 c1Var;
        if (this.f104692g.getVisibility() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogThumbViewPlugin", "thumbViewRoot not visible ignore update");
            return;
        }
        if (h1Var != null) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 i18 = h1Var.i();
            long j18 = 1000;
            long m97261xccb87a6a = i18.m97261xccb87a6a() / j18;
            long m97259x74606f23 = i18.m97259x74606f23() / j18;
            long g17 = h1Var.g();
            java.util.List m17 = h1Var.m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i19 = 0;
            for (java.lang.Object obj : m17) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
                rm5.j jVar = i1Var.f257160l;
                long j19 = j18;
                if (jVar.f479036e < m97261xccb87a6a || jVar.f479035d > m97259x74606f23) {
                    i17 = i27;
                    c1Var = null;
                } else {
                    c1Var = new kp4.c1(i1Var);
                    c1Var.f392612i = i19;
                    rm5.j jVar2 = c1Var.f392630n.f257160l;
                    i17 = i27;
                    if (jVar2.f479035d < m97261xccb87a6a) {
                        c1Var.f392607d = jVar2.f479037f + (((float) (m97261xccb87a6a - r12)) * jVar2.f479039h);
                    }
                    if (jVar2.f479036e > m97259x74606f23) {
                        c1Var.f392608e = jVar2.f479038g - (((float) (r12 - m97259x74606f23)) * jVar2.f479039h);
                    }
                    c1Var.f392605b = this.f104694i;
                    c1Var.f392604a = this.f104695m;
                }
                if (c1Var != null) {
                    arrayList.add(c1Var);
                }
                j18 = j19;
                i19 = i17;
            }
            long j27 = j18;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f104693h;
            c18833x82cf22d.getClass();
            c18833x82cf22d.f257667e.setVisibility(0);
            java.util.LinkedList linkedList = c18833x82cf22d.C;
            linkedList.clear();
            linkedList.addAll(arrayList);
            c18833x82cf22d.f257670h = 0;
            c18833x82cf22d.E = g17;
            c18833x82cf22d.f257671i = i18.m97261xccb87a6a() / j27;
            long m97259x74606f232 = i18.m97259x74606f23() / j27;
            c18833x82cf22d.f257672m = m97259x74606f232;
            long j28 = m97259x74606f232 - c18833x82cf22d.f257671i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogThumbView", "onUpdate, duration:" + (c18833x82cf22d.f257672m - c18833x82cf22d.f257671i) + ", visibility:" + c18833x82cf22d.isShown() + " seekTo:" + j17 + " seekToOrigin:" + z17);
            c18833x82cf22d.recyclerView.removeCallbacks(c18833x82cf22d.f257677r);
            c18833x82cf22d.f257677r = new cq4.v(c18833x82cf22d, j28, j17, z17);
            c18833x82cf22d.B = false;
            c18833x82cf22d.f257673n = false;
            c18833x82cf22d.f257674o = c18833x82cf22d.f257675p;
            c18833x82cf22d.f257675p = 0;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = c18833x82cf22d.f257668f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1162x665295de, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "updateTracks", "(JLcom/tencent/tav/coremedia/CMTimeRange;JZLjava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "updateTracks", "(JLcom/tencent/tav/coremedia/CMTimeRange;JZLjava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            java.lang.Runnable runnable = c18833x82cf22d.f257677r;
            if (runnable != null) {
                ((cq4.v) runnable).run();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r0) >= 1000) goto L6;
     */
    @Override // bp4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r5) {
        /*
            r4 = this;
            long r0 = r4.f104696n
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L15
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
        L15:
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r0 = r4.f104693h
            java.util.Objects.toString(r0)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.f104696n = r0
        L22:
            android.view.View r0 = r4.f104692g
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L2b
            return
        L2b:
            bp4.d4 r0 = new bp4.d4
            r0.<init>(r4, r5)
            pm0.v.X(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bp4.e4.c(long):void");
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f104693h;
        c18833x82cf22d.f257684y = c0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogThumbView", "onStart: ");
        if (c18833x82cf22d.isShown()) {
            c18833x82cf22d.f257673n = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogThumbView", "onStart thumbViewRoot not visible ignore");
        }
    }

    @Override // bp4.a0
    /* renamed from: onFinish */
    public void mo10982x42fe6352() {
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f104693h.recyclerView;
        e06.k m17 = e06.p.m(0, c1163xf1deaba4.getChildCount());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        kz5.x0 it = m17.iterator();
        while (((e06.j) it).f327747f) {
            arrayList.add(c1163xf1deaba4.getChildAt(it.b()));
        }
        java.util.Iterator it6 = ((java.util.ArrayList) kz5.j0.I(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0.class)).iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 c18807xe5ec60d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0) it6.next();
            rm5.k kVar = c18807xe5ec60d0.f257551x;
            if (kVar != null) {
                kVar.mo122875x5cd39ffa();
            }
            c18807xe5ec60d0.f257551x = null;
            c18807xe5ec60d0.f257536f = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18807xe5ec60d0.f257534d, "clearThumb");
            c18807xe5ec60d0.f257537g.clear();
            c18807xe5ec60d0.f257538h = null;
            c18807xe5ec60d0.postInvalidate();
        }
        rm5.c cVar = rm5.h.f479022h;
        rm5.h.f479023i.evictAll();
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f104693h.a(-1, 0L, 0L);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.View view = this.f104692g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/VLogThumbViewPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/VLogThumbViewPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = i17 == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f104693h;
        c18833x82cf22d.D = z17;
        c18833x82cf22d.f257667e.setVisibility(i17);
    }

    public final void z(int i17, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogThumbViewPlugin", "selectTrack:" + i17);
        this.f104693h.a(i17, j17, j18);
    }
}
