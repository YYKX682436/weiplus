package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class na implements zy2.ma {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f187262a;

    public na(zy2.fa manager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        this.f187262a = manager;
    }

    public void a() {
        zy2.fa faVar = this.f187262a;
        if (faVar.L0("NearbyPeopleFooterprintClear") != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotTransform", "addNearbyFootRedDot: duplicate red dot");
            return;
        }
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f470023h = java.lang.String.valueOf(c01.id.c());
        vs2Var.f470019d = 300000;
        vs2Var.f470020e = 1014;
        r45.f03 f03Var = new r45.f03();
        f03Var.f455420d = 101;
        f03Var.f455424h = 2;
        f03Var.f455425i = "NearbyEntrance";
        vs2Var.f470022g.add(f03Var);
        r45.f03 f03Var2 = new r45.f03();
        f03Var2.f455420d = 101;
        f03Var2.f455424h = 2;
        f03Var2.f455426m = "NearbyEntrance";
        f03Var2.f455425i = "NearbyPeopleTab";
        vs2Var.f470022g.add(f03Var2);
        r45.f03 f03Var3 = new r45.f03();
        f03Var3.f455420d = 101;
        f03Var3.f455424h = 1;
        f03Var3.f455426m = "NearbyPeopleTab";
        f03Var3.f455425i = "NearbyPeopleFooterprintClear";
        vs2Var.f470022g.add(f03Var3);
        faVar.w(vs2Var, "addNearByFootRedDot");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.na.b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (r0 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            g92.b r0 = g92.b.f351302e
            java.lang.String r0 = r0.T0()
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r1 = 1
            r0 = r0 ^ r1
            gm0.b0 r2 = gm0.j1.u()
            com.tencent.mm.storage.n3 r2 = r2.c()
            com.tencent.mm.storage.u3 r3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LOCAL_RED_DOT_INT_SYNC
            int r4 = r9.d()
            int r2 = r2.r(r3, r4)
            java.lang.Class<c61.l7> r4 = c61.l7.class
            i95.m r4 = i95.n0.c(r4)
            c61.l7 r4 = (c61.l7) r4
            boolean r4 = r4.gl()
            r5 = 0
            if (r4 == 0) goto L39
            r6 = r2 & 2
            if (r6 <= 0) goto L33
            r6 = r1
            goto L34
        L33:
            r6 = r5
        L34:
            if (r6 == 0) goto L39
            if (r0 != 0) goto L39
            goto L3a
        L39:
            r1 = r5
        L3a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[isShowLocalRedDot] ret="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = " hasPostEntry="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " local="
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = " hasCreatedIdentity="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r2 = "Finder.RedDotTransform"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            if (r1 == 0) goto La6
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            int r1 = r9.d()
            int r0 = r0.r(r3, r1)
            r1 = r0 & (-3)
            if (r1 == r0) goto L8a
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5.x(r3, r6)
        L8a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "[setLocalRedDot] flag=2 unset=true newLocal="
            r3.<init>(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            java.lang.String r0 = "[transformPostRedDot] done"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
        La6:
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.P1
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto Lcd
            zy2.fa r3 = r9.f187262a
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            zy2.fa.y0(r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "[checkPostRedDot] clear TIMELINE_CAMERA"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.na.c():void");
    }

    public final int d() {
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LOCAL_RED_DOT_INT_SYNC, -1);
        if (r17 == -1) {
            return (!((c61.l7) i95.n0.c(c61.l7.class)).gl() || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g92.b.f351302e.T0()) ^ true)) ? 0 : 2;
        }
        return r17;
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = this.f187262a.L0("FinderEntrance");
        if (L0 != null && L0.f65874xb5f7102a.f470020e == -1) {
            r45.f03 I0 = L0.I0("FinderEntrance");
            java.lang.Integer valueOf = I0 != null ? java.lang.Integer.valueOf(I0.f455424h) : null;
            if (valueOf != null && valueOf.intValue() == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotTransform", "[checkPostRedDot] has old post red dot, ret=" + zy2.fa.y0(this.f187262a, -1, null, null, 6, null));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotTransform", "[checkPostRedDot] has old fav red dot, ret=" + zy2.fa.y0(this.f187262a, 1001, null, null, 6, null));
        zy2.fa faVar = this.f187262a;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_POSTER_CENTER_REDDOT_CLEAR_BOOLEAN_SYNC;
        java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotTransform", "clearOldVersionRedDot " + zy2.fa.y0(faVar, 1000, null, null, 6, null) + ", " + zy2.fa.y0(faVar, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46406xaf4081cb, null, null, 6, null));
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
    }
}
