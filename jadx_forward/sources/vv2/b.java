package vv2;

/* loaded from: classes10.dex */
public final class b implements pv2.j {
    @Override // pv2.j
    public void a(java.lang.String taskId, pv2.g from, pv2.g to6) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b73;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b74;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b75;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b76;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b77;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b78;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        int i17 = 0;
        boolean z17 = ((to6 instanceof pv2.d) || (to6 instanceof pv2.n)) ? false : true;
        boolean z18 = from instanceof tv2.f;
        ft2.b bVar = ft2.b.f348052a;
        if (z18) {
            ft2.d dVar = ft2.c.f348053a;
            ft2.d dVar2 = z17 ? ft2.c.f348065m : ft2.c.f348064l;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = ((tv2.f) from).f503833h;
            bVar.a(dVar2, c14994x9b99c079, 0, (z17 || (c19783xd9a946b78 = c14994x9b99c079.f66946x284ddcb8) == null) ? 0 : c19783xd9a946b78.m76304x86f51def());
        } else if (from instanceof wv2.c) {
            ft2.d dVar3 = ft2.c.f348053a;
            ft2.d dVar4 = z17 ? ft2.c.f348065m : ft2.c.f348064l;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = ((wv2.c) from).f531533h;
            bVar.a(dVar4, c14994x9b99c0792, 0, (z17 || (c19783xd9a946b77 = c14994x9b99c0792.f66946x284ddcb8) == null) ? 0 : c19783xd9a946b77.m76304x86f51def());
        } else if (from instanceof tv2.v) {
            ft2.d dVar5 = ft2.c.f348053a;
            ft2.d dVar6 = z17 ? ft2.c.f348068p : ft2.c.f348067o;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = ((tv2.v) from).f503864h;
            bVar.a(dVar6, c14994x9b99c0793, 0, (z17 || (c19783xd9a946b76 = c14994x9b99c0793.f66946x284ddcb8) == null) ? 0 : c19783xd9a946b76.m76340xd1fa61a1());
        } else if (from instanceof wv2.m) {
            ft2.d dVar7 = ft2.c.f348053a;
            ft2.d dVar8 = z17 ? ft2.c.f348068p : ft2.c.f348067o;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0794 = ((wv2.m) from).f531551h;
            bVar.a(dVar8, c14994x9b99c0794, 0, (z17 || (c19783xd9a946b75 = c14994x9b99c0794.f66946x284ddcb8) == null) ? 0 : c19783xd9a946b75.m76340xd1fa61a1());
        } else if (from instanceof tv2.m) {
            ft2.d dVar9 = ft2.c.f348053a;
            ft2.d dVar10 = z17 ? ft2.c.f348071s : ft2.c.f348070r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0795 = ((tv2.m) from).f503848h;
            int m76253xffdf88d3 = (z17 || (c19783xd9a946b73 = c14994x9b99c0795.f66946x284ddcb8) == null) ? 0 : c19783xd9a946b73.m76253xffdf88d3();
            if (!z17 && (c19783xd9a946b74 = c14994x9b99c0795.f66946x284ddcb8) != null) {
                i17 = c19783xd9a946b74.m76252xffd7a786();
            }
            bVar.a(dVar10, c14994x9b99c0795, m76253xffdf88d3, i17);
        } else if (from instanceof wv2.f) {
            ft2.d dVar11 = ft2.c.f348053a;
            ft2.d dVar12 = z17 ? ft2.c.f348071s : ft2.c.f348070r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0796 = ((wv2.f) from).f531538h;
            int m76253xffdf88d32 = (z17 || (c19783xd9a946b7 = c14994x9b99c0796.f66946x284ddcb8) == null) ? 0 : c19783xd9a946b7.m76253xffdf88d3();
            if (!z17 && (c19783xd9a946b72 = c14994x9b99c0796.f66946x284ddcb8) != null) {
                i17 = c19783xd9a946b72.m76252xffd7a786();
            }
            bVar.a(dVar12, c14994x9b99c0796, m76253xffdf88d32, i17);
        }
        if (to6 instanceof tv2.f) {
            ft2.d dVar13 = ft2.c.f348053a;
            ft2.b.d(bVar, ft2.c.f348063k, ((tv2.f) to6).f503833h, 0, 0, 12, null);
            return;
        }
        if (to6 instanceof wv2.c) {
            ft2.d dVar14 = ft2.c.f348053a;
            ft2.b.d(bVar, ft2.c.f348063k, ((wv2.c) to6).f531533h, 0, 0, 12, null);
            return;
        }
        if (to6 instanceof tv2.v) {
            ft2.d dVar15 = ft2.c.f348053a;
            ft2.b.d(bVar, ft2.c.f348066n, ((tv2.v) to6).f503864h, 0, 0, 12, null);
            return;
        }
        if (to6 instanceof wv2.m) {
            ft2.d dVar16 = ft2.c.f348053a;
            ft2.b.d(bVar, ft2.c.f348066n, ((wv2.m) to6).f531551h, 0, 0, 12, null);
        } else if (to6 instanceof tv2.m) {
            ft2.d dVar17 = ft2.c.f348053a;
            ft2.b.d(bVar, ft2.c.f348069q, ((tv2.m) to6).f503848h, 0, 0, 12, null);
        } else if (to6 instanceof wv2.f) {
            ft2.d dVar18 = ft2.c.f348053a;
            ft2.b.d(bVar, ft2.c.f348069q, ((wv2.f) to6).f531538h, 0, 0, 12, null);
        }
    }

    @Override // pv2.j
    public void b(java.lang.String taskId, pv2.g endStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endStage, "endStage");
    }

    @Override // pv2.j
    public void c(java.lang.String taskId, pv2.g beginStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beginStage, "beginStage");
        boolean z17 = beginStage instanceof tv2.p;
        ft2.b bVar = ft2.b.f348052a;
        if (z17) {
            ft2.d dVar = ft2.c.f348053a;
            ft2.b.d(bVar, ft2.c.f348061i, ((tv2.p) beginStage).f503858h, 0, 0, 12, null);
        } else if (beginStage instanceof wv2.g) {
            ft2.d dVar2 = ft2.c.f348053a;
            ft2.b.d(bVar, ft2.c.f348061i, ((wv2.g) beginStage).f531545h, 0, 0, 12, null);
        }
    }
}
