package dk2;

/* loaded from: classes3.dex */
public final class re extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f315570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f315571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(boolean z17, yz5.a aVar) {
        super(0);
        this.f315570d = z17;
        this.f315571e = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r2 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.P6() == 1) goto L8;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r9 = this;
            dk2.ef r0 = dk2.ef.f314905a
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r0.i(r1)
            mm2.c1 r1 = (mm2.c1) r1
            r8 = 0
            if (r1 == 0) goto L15
            int r1 = r1.P6()
            r2 = 1
            if (r1 != r2) goto L15
            goto L16
        L15:
            r2 = r8
        L16:
            r1 = 0
            java.lang.String r3 = "Finder.FinderLiveService"
            if (r2 == 0) goto L57
            co0.s r2 = r0.u0()
            if (r2 == 0) goto L39
            hn0.r r2 = r2.R1
            if (r2 == 0) goto L39
            ko0.t r4 = ko0.t.f391436a
            kn0.g r5 = r2.f363943b
            if (r5 == 0) goto L32
            int r2 = r2.f363946e
            java.lang.String r2 = r5.e(r2)
            goto L33
        L32:
            r2 = r1
        L33:
            java.lang.String r2 = r4.d(r2)
            if (r2 != 0) goto L3b
        L39:
            java.lang.String r2 = ""
        L3b:
            ln0.p r4 = ln0.p.f401204l
            if (r4 != 0) goto L46
            ln0.p r4 = new ln0.p
            r4.<init>()
            ln0.p.f401204l = r4
        L46:
            ln0.p r4 = ln0.p.f401204l
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4)
            r4.b(r2)
            java.lang.String r4 = "releaseP2P streamId="
            java.lang.String r2 = r4.concat(r2)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
        L57:
            com.tencent.mm.plugin.finder.live.util.m0 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197140a
            com.tencent.mm.plugin.finder.live.view.k0 r4 = dk2.ef.f314913e
            if (r4 == 0) goto L62
            android.content.Context r4 = r4.getContext()
            goto L63
        L62:
            r4 = r1
        L63:
            r45.un5 r5 = r45.un5.FloatBall
            km2.n r6 = dk2.ef.H
            if (r6 == 0) goto L72
            km2.t r6 = r6.c()
            if (r6 == 0) goto L72
            km2.m r6 = r6.f390755d
            goto L73
        L72:
            r6 = r1
        L73:
            com.tencent.mm.plugin.finder.live.view.k0 r7 = dk2.ef.f314913e
            if (r7 == 0) goto L7b
            tn0.w0 r1 = r7.mo57476xdd07d18e()
        L7b:
            r2.d(r4, r5, r6, r1)
            java.lang.String r1 = "releaseWithMiniWindow"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            tn0.w0 r1 = dk2.ef.f314911d
            if (r1 == 0) goto L8a
            r1.p0()
        L8a:
            com.tencent.mm.plugin.finder.live.view.k0 r1 = dk2.ef.f314913e
            if (r1 == 0) goto L91
            r1.m57646xb4098c93()
        L91:
            java.lang.String r1 = "releaseWithMiniWindow"
            boolean r2 = r9.f315570d
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 28
            r7 = 0
            dk2.ef.S(r0, r1, r2, r3, r4, r5, r6, r7)
            co0.a r0 = co0.b.f125242e2
            r0.a()
            yz5.a r0 = r9.f315571e
            if (r0 == 0) goto Laa
            r0.mo152xb9724478()
        Laa:
            or2.a r0 = or2.a.f429140a
            boolean r1 = or2.a.f429148i
            if (r1 == 0) goto Lcc
            or2.a.f429148i = r8
            long r1 = or2.a.f429143d
            boolean r3 = r0.a()
            if (r3 != 0) goto Lbd
            r0.e()
        Lbd:
            int r3 = or2.a.f429146g
            if (r3 <= 0) goto Lcc
            long r3 = or2.a.f429143d
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto Lcc
            or2.a.f429143d = r1
            r0.e()
        Lcc:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.re.mo152xb9724478():java.lang.Object");
    }
}
