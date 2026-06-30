package wt3;

/* loaded from: classes5.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a a(r45.vv0 info, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        int i18;
        int i19;
        long j17;
        ll3.h1 h1Var;
        long j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        r45.ug4 ug4Var = info.f470132d;
        if (ug4Var != null) {
            c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
            r45.pg4 pg4Var = ug4Var.f468880d;
            java.lang.String str = pg4Var != null ? pg4Var.f464554g : null;
            if (str == null) {
                str = "";
            }
            if (!(str.length() == 0)) {
                c16997xb0aa383a.f237247h.add(str);
            }
            java.lang.String str2 = pg4Var != null ? pg4Var.f464551d : null;
            if (str2 == null || str2.length() == 0) {
                str2 = java.lang.String.valueOf(ug4Var.hashCode());
            }
            java.lang.String o17 = dw3.c0.f325715a.o(java.lang.String.valueOf(str2));
            c16997xb0aa383a.f237248i = o17;
            java.lang.String str3 = ug4Var.f468882f;
            if (str3 == null) {
                str3 = "";
            }
            c16997xb0aa383a.f237245f = str3;
            i95.m c17 = i95.n0.c(m40.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c16997xb0aa383a.f237249m = ((c61.p7) ((m40.k0) c17)).ij(o17);
            c16997xb0aa383a.f237250n = false;
            java.lang.String str4 = pg4Var != null ? pg4Var.f464553f : null;
            if (str4 == null) {
                str4 = "";
            }
            c16997xb0aa383a.f237256t = str4;
            c16997xb0aa383a.f237251o = i17;
            long j19 = ug4Var.f468884h;
            c16997xb0aa383a.E = j19;
            long j27 = ug4Var.f468885i;
            c16997xb0aa383a.F = j27;
            c16997xb0aa383a.f237253q = (!z17 || j19 < 0 || j27 <= 0 || j27 <= j19) ? pg4Var != null ? pg4Var.f464556i : 0 : (int) (j27 - j19);
            c16997xb0aa383a.B = ug4Var.f468881e == 1;
            c16997xb0aa383a.A = pg4Var;
            java.lang.String str5 = pg4Var != null ? pg4Var.f464555h : null;
            if (str5 == null) {
                str5 = "";
            }
            c16997xb0aa383a.f237258v = str5;
            java.lang.String str6 = ug4Var.f468880d.f464552e == 4 ? "wxfinderobject_" + ug4Var.f468880d.f464557m : "Listen_" + ug4Var.f468880d.f464551d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str6, "<set-?>");
            c16997xb0aa383a.C = str6;
            int i27 = ug4Var.f468887n;
            java.lang.String str7 = pg4Var != null ? pg4Var.f464551d : null;
            if (str7 == null) {
                str7 = "";
            }
            c16997xb0aa383a.f237244e = i27 != 0 ? i27 : str7.length() == 0 ? ug4Var.hashCode() : str7.hashCode();
            c16997xb0aa383a.D = ug4Var.f468895v;
            r45.mh4 mh4Var = c16997xb0aa383a.f237243d;
            mh4Var.f462056v = ug4Var.f468894u;
            mh4Var.f462041d = ug4Var.f468887n;
            mh4Var.f462057w = pm0.v.Z(str7);
            mh4Var.f462049o = c16997xb0aa383a.f237258v;
            mh4Var.f462044g = c16997xb0aa383a.f237245f;
            mh4Var.f462047m = new java.util.LinkedList(c16997xb0aa383a.f237247h);
            mh4Var.f462046i = c16997xb0aa383a.f237256t;
            java.lang.String str8 = ug4Var.f468886m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            ((ja0.m0) ((ka0.q0) i95.n0.c(ka0.q0.class))).getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            ll3.h1 f17 = ll3.h1.f(str8, "", "", true, "", false, false);
            if (f17.e() > 0) {
                int e17 = f17.e();
                for (int i28 = 0; i28 < e17; i28 = i19) {
                    ll3.f1 d17 = f17.d(i28);
                    int i29 = i28 + 1;
                    ll3.f1 d18 = f17.d(i29);
                    if (d17 != null) {
                        i18 = e17;
                        i19 = i29;
                        j17 = d17.f400700a;
                    } else {
                        i18 = e17;
                        i19 = i29;
                        j17 = 0;
                    }
                    java.lang.String str9 = d17 != null ? d17.f400701b : null;
                    java.lang.String str10 = str9 == null ? "" : str9;
                    if (d18 != null) {
                        h1Var = f17;
                        j18 = d18.f400700a;
                    } else {
                        h1Var = f17;
                        j18 = j17;
                    }
                    arrayList2.add(new ll3.s1(str10, j17, j18));
                    f17 = h1Var;
                    e17 = i18;
                }
            }
            java.util.Iterator it = arrayList2.iterator();
            int i37 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i38 = i37 + 1;
                if (i37 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ll3.s1 s1Var = (ll3.s1) next;
                arrayList.add(new wt3.h(s1Var.f400767a, (int) s1Var.f400768b, (int) s1Var.f400769c));
                i37 = i38;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4i);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                arrayList.add(new wt3.h(string, 0, 0));
            }
            c16997xb0aa383a.f237246g = arrayList;
            c16997xb0aa383a.f237254r = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ug4Var.f468886m);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createFromListenBgmItem: ");
            sb6.append(str4);
            sb6.append(" cached:");
            sb6.append(c16997xb0aa383a.f237249m);
            sb6.append(" musicType:");
            sb6.append(ug4Var.f468894u);
            sb6.append(" listenType:");
            r45.pg4 pg4Var2 = ug4Var.f468880d;
            sb6.append(pg4Var2 != null ? java.lang.Integer.valueOf(pg4Var2.f464552e) : null);
            sb6.append(" musicSid:");
            sb6.append(i27);
            sb6.append(" listenId:");
            sb6.append(str7);
            sb6.append(" mjMusicId:");
            sb6.append(c16997xb0aa383a.C);
            sb6.append(" cachePathHash:");
            sb6.append(o17.hashCode());
            sb6.append(" isNewPublisher:");
            sb6.append(z17);
            sb6.append(" duration:");
            sb6.append(pg4Var != null ? java.lang.Integer.valueOf(pg4Var.f464556i) : null);
            sb6.append(" mir_begin:");
            sb6.append(ug4Var.f468884h);
            sb6.append(" mir_end:");
            sb6.append(ug4Var.f468885i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioCacheInfo", sb6.toString());
        } else {
            c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
        }
        c16997xb0aa383a.I = info.f470133e;
        c16997xb0aa383a.f237261y = info.f470134f;
        c16997xb0aa383a.L = info.f470135g;
        c16997xb0aa383a.K = info.f470136h;
        return c16997xb0aa383a;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a b(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
        c16997xb0aa383a.f237251o = i17;
        java.lang.String m33856x92013dca = info.m33856x92013dca();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33856x92013dca, "getMusicID(...)");
        c16997xb0aa383a.C = m33856x92013dca;
        java.lang.String m33858xd75a8eb6 = info.m33858xd75a8eb6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33858xd75a8eb6, "getSongName(...)");
        c16997xb0aa383a.f237256t = m33858xd75a8eb6;
        c16997xb0aa383a.f237247h.add(info.m33857x158977f6());
        c16997xb0aa383a.f237244e = info.m33856x92013dca().hashCode();
        java.lang.String m33853x298d2b35 = info.m33853x298d2b35();
        if (m33853x298d2b35 == null) {
            m33853x298d2b35 = "";
        }
        c16997xb0aa383a.f237258v = m33853x298d2b35;
        c16997xb0aa383a.f237253q = (int) info.m33854x51e8b0a().m33987xd22e7c2d();
        c16997xb0aa383a.f237245f = "";
        c16997xb0aa383a.f237250n = false;
        c16997xb0aa383a.f237249m = false;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90[] m33855xed0634a5 = info.m33855xed0634a5();
        if (m33855xed0634a5 != null) {
            for (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90 c4114xcb0ccc90 : m33855xed0634a5) {
                if (c4114xcb0ccc90 != null) {
                    int m33987xd22e7c2d = (int) c4114xcb0ccc90.m33846x8082fb99().m33987xd22e7c2d();
                    java.lang.String m33844x76847043 = c4114xcb0ccc90.m33844x76847043();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33844x76847043, "getContent(...)");
                    wt3.h hVar = new wt3.h(m33844x76847043, m33987xd22e7c2d, m33987xd22e7c2d);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                        ((wt3.h) arrayList.get(arrayList.size() - 1)).f530956c = m33987xd22e7c2d;
                    }
                    arrayList.add(hVar);
                }
            }
        }
        c16997xb0aa383a.f237246g = arrayList;
        c16997xb0aa383a.f237254r = !arrayList.isEmpty();
        r45.mh4 mh4Var = c16997xb0aa383a.f237243d;
        mh4Var.f462056v = 0;
        mh4Var.f462057w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(info.m33856x92013dca());
        mh4Var.f462049o = c16997xb0aa383a.f237258v;
        mh4Var.f462044g = c16997xb0aa383a.f237245f;
        mh4Var.f462047m = new java.util.LinkedList(c16997xb0aa383a.f237247h);
        mh4Var.f462046i = c16997xb0aa383a.f237256t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioCacheInfo", "createFromMJMusicInfo: musicId=" + c16997xb0aa383a.f237244e + ", name=" + c16997xb0aa383a.f237256t + ", mjMusicId=" + c16997xb0aa383a.C + ", lyricsList=" + c16997xb0aa383a.f237246g + ',');
        return c16997xb0aa383a;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c(r45.mh4 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
        c16997xb0aa383a.f237243d = info;
        c16997xb0aa383a.f237244e = info.f462041d;
        c16997xb0aa383a.f237245f = info.f462044g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList lyrics = info.f462048n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lyrics, "lyrics");
        java.util.Iterator it = lyrics.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.nh4 nh4Var = (r45.nh4) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nh4Var.f462933e)) {
                java.lang.String lyrics_content = nh4Var.f462933e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lyrics_content, "lyrics_content");
                int i18 = nh4Var.f462932d;
                wt3.h hVar = new wt3.h(lyrics_content, i18, i18);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
                    ((wt3.h) arrayList.get(arrayList.size() - 1)).f530956c = nh4Var.f462932d;
                }
                arrayList.add(hVar);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4i);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            arrayList.add(new wt3.h(string, 0, 0));
        }
        c16997xb0aa383a.f237247h.addAll(info.f462047m);
        c16997xb0aa383a.f237246g = arrayList;
        dw3.c0 c0Var = dw3.c0.f325715a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(info.f462041d);
        sb6.append('_');
        sb6.append(c01.id.c());
        java.lang.String o17 = c0Var.o(sb6.toString());
        c16997xb0aa383a.f237248i = o17;
        c16997xb0aa383a.f237249m = com.p314xaae8f345.mm.vfs.w6.k(o17) > 0;
        c16997xb0aa383a.f237250n = false;
        java.lang.String song_name = info.f462046i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_name, "song_name");
        c16997xb0aa383a.f237256t = song_name;
        c16997xb0aa383a.f237251o = i17;
        c16997xb0aa383a.f237253q = info.f462053s;
        c16997xb0aa383a.f237254r = info.f462054t == 1;
        java.lang.String str = info.C;
        if (str == null) {
            str = "";
        }
        c16997xb0aa383a.C = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioCacheInfo", "createFromMusicInfo: musicId=" + c16997xb0aa383a.f237244e + ", name=" + c16997xb0aa383a.f237256t + ", lyricsList=" + c16997xb0aa383a.f237246g + ", mjMusicId=" + c16997xb0aa383a.C);
        return c16997xb0aa383a;
    }
}
