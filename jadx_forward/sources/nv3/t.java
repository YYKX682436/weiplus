package nv3;

/* loaded from: classes5.dex */
public final class t implements iv3.a {

    /* renamed from: o, reason: collision with root package name */
    public static final nv3.n f422235o = new nv3.n(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f422236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f422237b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f422238c;

    /* renamed from: d, reason: collision with root package name */
    public final dv3.c f422239d;

    /* renamed from: e, reason: collision with root package name */
    public final ev3.d f422240e;

    /* renamed from: f, reason: collision with root package name */
    public final cv3.d f422241f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 f422242g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f422243h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f422244i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f422245j;

    /* renamed from: k, reason: collision with root package name */
    public final nv3.r f422246k;

    /* renamed from: l, reason: collision with root package name */
    public rv3.h f422247l;

    /* renamed from: m, reason: collision with root package name */
    public in5.s0 f422248m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f422249n;

    public t(android.content.Context context, int i17, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, dv3.c cVar, ev3.d dVar, cv3.d dVar2, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 scene, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f422236a = context;
        this.f422237b = i17;
        this.f422238c = c22849x81a93d25;
        this.f422239d = cVar;
        this.f422240e = dVar;
        this.f422241f = dVar2;
        this.f422242g = scene;
        this.f422243h = z17;
        this.f422244i = "MusicPickerFeedHelper#" + i17;
        this.f422245j = jz5.h.b(new nv3.p(this));
        nv3.r rVar = new nv3.r(this);
        this.f422246k = rVar;
        new nv3.o().b(c22849x81a93d25);
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.O(rVar);
        }
        if (dVar != null) {
            dVar.c(i17, new nv3.m(this));
        }
    }

    @Override // iv3.a
    public void a(boolean z17, lv3.a musicData) {
        java.lang.Object obj;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        java.util.ArrayList arrayList;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicData, "musicData");
        long j17 = musicData.f403041a;
        dv3.c cVar = this.f422239d;
        if (cVar == null || (arrayList = cVar.I) == null) {
            obj = null;
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                in5.c cVar2 = (in5.c) obj2;
                rv3.h hVar = cVar2 instanceof rv3.h ? (rv3.h) cVar2 : null;
                boolean z18 = false;
                if (hVar != null && (c16997xb0aa383a2 = hVar.f481928d) != null && (c19792x256d2725 = c16997xb0aa383a2.f237261y) != null && c19792x256d2725.m76784x5db1b11() == j17) {
                    z18 = true;
                }
            }
            obj = (in5.c) obj2;
        }
        rv3.h hVar2 = obj instanceof rv3.h ? (rv3.h) obj : null;
        if (hVar2 == null) {
            return;
        }
        rv3.h hVar3 = this.f422247l;
        if (hVar3 == null || (c16997xb0aa383a = hVar3.f481928d) == null || (str = c16997xb0aa383a.a()) == null) {
            str = "";
        }
        java.lang.String a17 = hVar2.f481928d.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f422244i, "[onFinishDownload] musicKey:" + a17 + " curSelectMusicKey:" + str + " feedId:" + pm0.v.u(j17) + " musicUrl:" + musicData.f403042b + " duration:" + musicData.f403043c);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, a17)) {
            pm0.v.X(new nv3.s(z17, this, hVar2, musicData));
        }
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252;
        rv3.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253;
        int abs;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f422238c;
        if (!z17) {
            if (!(c22849x81a93d25 == null ? false : c22849x81a93d25.getGlobalVisibleRect(new android.graphics.Rect()))) {
                return;
            }
        }
        if (this.f422243h) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c22849x81a93d25 != null ? c22849x81a93d25.getLayoutManager() : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de == null) {
                return;
            }
            int w17 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            int height = (c22849x81a93d25 != null ? c22849x81a93d25.getHeight() : 0) / 2;
            int i17 = -1;
            if (w17 <= y17) {
                int i18 = Integer.MAX_VALUE;
                int i19 = w17;
                while (true) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c22849x81a93d25 != null ? c22849x81a93d25.p0(i19) : null;
                    in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                    if (s0Var != null && (abs = java.lang.Math.abs((s0Var.f3639x46306858.getTop() + (s0Var.f3639x46306858.getHeight() / 2)) - height)) < i18) {
                        i17 = i19;
                        i18 = abs;
                    }
                    if (i19 == y17) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f422244i, "[autoPlayVisibleVideo] firstVisiblePos:" + w17 + " lastVisiblePos:" + y17 + " closestItemPos:" + i17);
            if (i17 >= 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08 = c22849x81a93d25 != null ? c22849x81a93d25.p0(i17) : null;
                in5.s0 s0Var2 = p08 instanceof in5.s0 ? (in5.s0) p08 : null;
                if (s0Var2 != null) {
                    in5.s0 s0Var3 = this.f422248m;
                    long m76784x5db1b11 = (s0Var3 == null || (hVar = (rv3.h) s0Var3.f374658i) == null || (c16997xb0aa383a3 = hVar.f481928d) == null || (c19792x256d27253 = c16997xb0aa383a3.f237261y) == null) ? 0L : c19792x256d27253.m76784x5db1b11();
                    rv3.h hVar2 = (rv3.h) s0Var2.f374658i;
                    java.lang.Long valueOf = (hVar2 == null || (c16997xb0aa383a2 = hVar2.f481928d) == null || (c19792x256d27252 = c16997xb0aa383a2.f237261y) == null) ? null : java.lang.Long.valueOf(c19792x256d27252.m76784x5db1b11());
                    if (valueOf == null || m76784x5db1b11 != valueOf.longValue()) {
                        f("autoPlayVisibleVideo");
                    }
                    this.f422248m = s0Var2;
                    ev3.d dVar = this.f422240e;
                    if (dVar != null) {
                        dVar.a();
                    }
                    pv3.m mVar = (pv3.m) ((jz5.n) this.f422245j).mo141623x754a37bb();
                    mVar.getClass();
                    rv3.h hVar3 = (rv3.h) s0Var2.f374658i;
                    if (hVar3 != null && (c16997xb0aa383a = hVar3.f481928d) != null && (c19792x256d2725 = c16997xb0aa383a.f237261y) != null) {
                        long m76784x5db1b112 = c19792x256d2725.m76784x5db1b11();
                        nv3.l lVar = (nv3.l) ((jz5.n) mVar.f440151e).mo141623x754a37bb();
                        if (lVar != null) {
                            lVar.b(m76784x5db1b112);
                        }
                        p3325xe03a0797.p3326xc267989b.r2 r2Var = mVar.f440150d;
                        if (r2Var != null) {
                            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                        }
                        mVar.f440150d = p3325xe03a0797.p3326xc267989b.l.d(mVar.f440149c, null, null, new pv3.l(s0Var2, m76784x5db1b112, mVar, c19792x256d2725, c16997xb0aa383a, null), 3, null);
                    }
                    this.f422249n = true;
                }
            }
        }
    }

    public final void c(rv3.h item, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = item.f481928d;
        c16997xb0aa383a2.f237259w = i17;
        java.lang.String a17 = c16997xb0aa383a2.a();
        g(this.f422247l, rv3.z.f481953d);
        rv3.h hVar = this.f422247l;
        if (hVar == null || (c16997xb0aa383a = hVar.f481928d) == null || (str = c16997xb0aa383a.a()) == null) {
            str = "";
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, a17);
        ev3.d dVar = this.f422240e;
        java.lang.String str2 = this.f422244i;
        if (b17) {
            rv3.h hVar2 = this.f422247l;
            if (hVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[unSelectMusic] musicKey:" + hVar2.f481928d.a());
                if (dVar != null) {
                    dVar.g();
                }
            }
            this.f422247l = null;
        } else {
            this.f422247l = item;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[selectMusic] musicKey:" + item.f481928d.a());
            if (dVar != null) {
                ev3.d.e(dVar, this.f422237b, item.f481928d, true, true, false, 16, null);
            }
            g(item, rv3.z.f481955f);
            pv3.f.f440122a.b(c16997xb0aa383a2, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onMusicItemClick: position=" + i17 + " feedMusicKey=" + a17 + " enablePlay=" + c16997xb0aa383a2.B);
    }

    public final void d() {
        java.util.List list;
        f("onDeactivate");
        java.util.Collection<dn.m> values = pv3.f.f440125d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (dn.m mVar : values) {
            pv3.f fVar = pv3.f.f440122a;
            c50.y0 y0Var = (c50.y0) ((jz5.n) pv3.f.f440124c).mo141623x754a37bb();
            java.lang.String field_mediaId = mVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            ((mn2.q0) y0Var).c(field_mediaId);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f422238c;
        if (c22849x81a93d25 != null && (list = c22849x81a93d25.H) != null) {
            ((java.util.ArrayList) list).remove(this.f422246k);
        }
        this.f422248m = null;
    }

    public final void e(java.lang.String musicKey) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        java.lang.String a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        rv3.h hVar = this.f422247l;
        if (hVar == null || (c16997xb0aa383a = hVar.f481928d) == null || (a17 = c16997xb0aa383a.a()) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f422244i, "[onUnSelectMusic] musicKey:" + musicKey + " curMusicKey:" + a17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(musicKey, a17)) {
            g(this.f422247l, rv3.z.f481953d);
            this.f422247l = null;
        }
    }

    public final void f(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f422244i, "[stopCurrentVideo] source:".concat(source));
        ((pv3.m) ((jz5.n) this.f422245j).mo141623x754a37bb()).c(this.f422248m);
        this.f422249n = false;
    }

    public final void g(rv3.h hVar, rv3.z useStatus) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        if (hVar == null || (c16997xb0aa383a = hVar.f481928d) == null || (str = c16997xb0aa383a.a()) == null) {
            str = "";
        }
        dv3.c cVar = this.f422239d;
        if (cVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(useStatus, "useStatus");
            int K0 = cVar.K0(str);
            cVar.N0();
            useStatus.toString();
            if (K0 >= 0) {
                java.lang.Object obj = cVar.I.get(K0);
                rv3.h hVar2 = obj instanceof rv3.h ? (rv3.h) obj : null;
                if (hVar2 != null) {
                    hVar2.f481932h = useStatus;
                }
                cVar.m8148xed6e4d18(K0, new jz5.l(rv3.f.f481922d, useStatus));
            }
        }
    }
}
