package ud2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.d f508116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sh1.f f508118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ud2.d dVar, java.lang.String str, sh1.f fVar) {
        super(0);
        this.f508116d = dVar;
        this.f508117e = str;
        this.f508118f = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ig2.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject3;
        r45.nw1 m76794xd05571302;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject4;
        r45.nw1 m76794xd05571303;
        ud2.d dVar2 = this.f508116d;
        java.lang.String str = dVar2.f508144b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on Action ");
        java.lang.String str2 = this.f508117e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "enterLive")) {
            sh1.f fVar = this.f508118f;
            fVar.l();
            ud2.c0 c0Var = dVar2.f508145c;
            c0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
            int c17 = e8Var.c(null);
            int a17 = e8Var.a();
            c0Var.f508126d = c17;
            c0Var.f508127e = a17;
            mn0.b0 b0Var = c0Var.f508131i;
            if (b0Var != null) {
                b0Var.A(c17, a17);
            }
            c50.s0 s0Var = (c50.s0) i95.n0.c(c50.s0.class);
            long j17 = 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c0Var.f508124b;
            long m76784x5db1b11 = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L;
            boolean wh6 = ((pg2.j0) s0Var).wh();
            android.content.Context context = c0Var.f508123a;
            if (!wh6 || c0Var.f508131i == null) {
                ez2.f fVar2 = ez2.f.f339431e;
                ez2.d dVar3 = ez2.d.f339405h;
                ez2.a aVar = ez2.a.f339399r;
                ez2.g.f339435a = new ez2.e(m76784x5db1b11, fVar2, dVar3, 13, -1L);
                mn0.b0 b0Var2 = c0Var.f508131i;
                boolean z17 = b0Var2 != null && ((mn0.y) b0Var2).b(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = c0Var.f508129g;
                boolean z18 = (c14994x9b99c0792 == null || (feedObject4 = c14994x9b99c0792.getFeedObject()) == null || (m76794xd05571303 = feedObject4.m76794xd0557130()) == null || m76794xd05571303.m75939xb282bd08(2) != 1) ? false : true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = c0Var.f508129g;
                if (c14994x9b99c0793 != null && (feedObject3 = c14994x9b99c0793.getFeedObject()) != null && (m76794xd05571302 = feedObject3.m76794xd0557130()) != null) {
                    m76794xd05571302.m75942xfb822ef2(32);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f508128f, "getSwitchDirector, isPlaying = " + z17 + ", liveStatusOpen = " + z18);
                if (!z17 || (c14994x9b99c079 = c0Var.f508129g) == null || (feedObject = c14994x9b99c079.getFeedObject()) == null) {
                    dVar = null;
                } else {
                    long m76784x5db1b112 = feedObject.m76784x5db1b11();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0794 = c0Var.f508129g;
                    if (c14994x9b99c0794 != null && (feedObject2 = c14994x9b99c0794.getFeedObject()) != null && (m76794xd0557130 = feedObject2.m76794xd0557130()) != null) {
                        j17 = m76794xd0557130.m75942xfb822ef2(0);
                    }
                    ig2.n nVar = new ig2.n(aVar, m76784x5db1b112, j17, null, c0Var.f508132j, c0Var.f508133k, c0Var.f508134l, c0Var.f508131i);
                    c0Var.f508131i = null;
                    ig2.m mVar = ig2.m.f372926a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    long j18 = nVar.f372936b;
                    dVar = new ig2.d();
                    dVar.f372903d = nVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentSwitchManager", "startSwitchOutFromShopWindow feedId: " + j18 + " director: " + dVar + ' ');
                    mVar.g();
                    ig2.m.f372933h.put(java.lang.Long.valueOf(j18), dVar);
                    ez2.g.f339435a = new ez2.e(j18, fVar2, dVar3, nVar.f372935a.ordinal(), -1L);
                }
                c0Var.f508137o = dVar;
                ig2.d dVar4 = dVar instanceof ig2.d ? dVar : null;
                if (dVar4 != null) {
                    dVar4.f372904e = new ud2.s(fVar);
                }
                if (dVar != null) {
                    new ud2.t(c0Var).mo152xb9724478();
                }
            } else {
                ez2.f fVar3 = ez2.f.f339432f;
                ez2.d dVar5 = ez2.d.f339405h;
                ez2.a aVar2 = ez2.a.f339399r;
                ez2.g.f339435a = new ez2.e(m76784x5db1b11, fVar3, dVar5, 13, -1L);
                mn0.b0 b0Var3 = c0Var.f508131i;
                c0Var.f508131i = null;
                android.graphics.Rect b17 = qg2.d.f444326a.b(c0Var.f508132j, c0Var.f508133k, false);
                pg2.j0 j0Var = (pg2.j0) i95.n0.c(pg2.j0.class);
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                int i17 = c0Var.f508132j;
                int i18 = c0Var.f508133k;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var3);
                java.util.HashMap i19 = kz5.c1.i(new jz5.l("key_enter_type", 2), new jz5.l("key_enter_scene", aVar2));
                c50.e1 e1Var = new c50.e1(0, 0L, 0.0f, 0, 12, null);
                ud2.r rVar = new ud2.r(c0Var);
                j0Var.getClass();
                j0Var.Zi(e1Var, b17, b17, activity, m76784x5db1b11, i17, i18, b0Var3, i19, rVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
