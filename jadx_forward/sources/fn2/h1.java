package fn2;

/* loaded from: classes10.dex */
public final class h1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final fn2.u1 f345800d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f345801e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv f345802f;

    /* renamed from: g, reason: collision with root package name */
    public sf2.d3 f345803g;

    /* renamed from: h, reason: collision with root package name */
    public fn2.q1 f345804h;

    /* renamed from: i, reason: collision with root package name */
    public bm2.k7 f345805i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f345806m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f345807n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f345808o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h1(android.content.Context r1, android.util.AttributeSet r2, int r3, fn2.u1 r4, int r5, p3321xbce91901.jvm.p3324x21ffc6bd.i r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r3 = 0
        La:
            java.lang.String r5 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r5)
            java.lang.String r5 = "sourceScene"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r5)
            r0.<init>(r1, r2, r3)
            r0.f345800d = r4
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131496102(0x7f0c0ca6, float:1.861576E38)
            r3 = 1
            r1.inflate(r2, r0, r3)
            r1 = 2131321280(0x7f0961c0, float:1.8261178E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            androidx.recyclerview.widget.RecyclerView r1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) r1
            r0.f345801e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.h1.<init>(android.content.Context, android.util.AttributeSet, int, fn2.u1, int, kotlin.jvm.internal.i):void");
    }

    public static final void a(fn2.h1 h1Var, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        bm2.k7 k7Var = h1Var.f345805i;
        if (k7Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
            throw null;
        }
        if (i17 >= 0) {
            java.util.ArrayList arrayList = (java.util.ArrayList) k7Var.f103578q;
            if (i17 < arrayList.size()) {
                if (((bm2.v6) arrayList.get(i17)).f103920a != bm2.w6.f103946f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveRequestSongPlayListAdapter", "Position " + i17 + " is not a song item");
                    return;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = k7Var.f103575n;
                if (c1163xf1deaba4 == null || (p07 = c1163xf1deaba4.p0(i17)) == null || !(p07 instanceof bm2.t6)) {
                    return;
                }
                bm2.t6 t6Var = (bm2.t6) p07;
                fn2.c cVar = t6Var.f103864v;
                if (cVar != null) {
                    cVar.a();
                }
                fn2.d dVar = fn2.d.f345775a;
                android.view.View itemView = t6Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                t6Var.f103864v = dVar.a(itemView, t6Var.f103865w.f103572h);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongPlayListAdapter", "Playing highlight animation for position: " + i17);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveRequestSongPlayListAdapter", "Invalid highlight position: " + i17);
    }

    public static final void b(fn2.h1 h1Var, sf2.d3 d3Var, r45.ox1 ox1Var) {
        h1Var.getClass();
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.k5) d3Var.m56788xbba4bfc0(mm2.k5.class)).f410731g).k(ox1Var);
    }

    public static void c(fn2.h1 h1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        fn2.q1 q1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar;
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        boolean z27 = (i17 & 4) != 0 ? false : z18;
        sf2.d3 d3Var = h1Var.f345803g;
        if (d3Var == null || (q1Var = h1Var.f345804h) == null) {
            return;
        }
        if (z19 && (dvVar = h1Var.f345802f) != null) {
            dvVar.e();
        }
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new fn2.c1(h1Var, q1Var, z27, d3Var, null), 3, null);
        }
    }

    /* renamed from: getMarkNeedRefresh */
    public final boolean m129815x9ef90e22() {
        return this.f345808o;
    }

    /* renamed from: getSongRv */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m129816x2fa4312f() {
        return this.f345801e;
    }

    /* renamed from: setMarkNeedRefresh */
    public final void m129817xd5cfa796(boolean z17) {
        this.f345808o = z17;
    }
}
