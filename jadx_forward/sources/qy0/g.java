package qy0;

/* loaded from: classes5.dex */
public final /* synthetic */ class g extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public g(java.lang.Object obj) {
        super(1, obj, com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388.class, "selectMusic", "selectMusic(Ljava/lang/Object;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object p07) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x58386388 = (com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388) this.f72685xcfcbe9ef;
        c11004x58386388.getClass();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1 e1Var = p07 instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1 ? (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1) p07 : null;
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        if (e1Var != null) {
            n0.q4 q4Var = (n0.q4) c11004x58386388.f151278g;
            java.lang.String m33856x92013dca = ((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) q4Var.mo128745x754a37bb()).m33856x92013dca();
            r45.k96 k96Var = (r45.k96) e1Var.f151471a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m33856x92013dca, k96Var.f460050d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMMusicManager", "selectMusic: current play music is " + k96Var.f460050d + ", no need to switch");
                f0Var = f0Var3;
            } else {
                n0.q4 q4Var2 = (n0.q4) c11004x58386388.f151277f;
                java.util.Iterator it = ((java.lang.Iterable) q4Var2.mo128745x754a37bb()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj).m33856x92013dca(), k96Var.f460050d)) {
                        break;
                    }
                }
                if (obj != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMMusicManager", "selectMusic: contains " + k96Var.f460050d);
                    f0Var = f0Var3;
                } else {
                    java.util.List list = c11004x58386388.f151280i;
                    java.util.ArrayList arrayList = (java.util.ArrayList) list;
                    java.util.Iterator it6 = arrayList.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.String.valueOf(((r45.mh4) it6.next()).f462041d), ((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) q4Var.mo128745x754a37bb()).m33856x92013dca())) {
                            break;
                        }
                        i17++;
                    }
                    int i18 = i17 + 1;
                    r45.mh4 mh4Var = new r45.mh4();
                    java.lang.String music_id = k96Var.f460050d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(music_id, "music_id");
                    java.lang.Integer h17 = r26.h0.h(music_id);
                    mh4Var.f462041d = h17 != null ? h17.intValue() : 0;
                    mh4Var.f462046i = k96Var.f460053g;
                    mh4Var.f462047m.add(k96Var.f460054h);
                    mh4Var.f462044g = k96Var.f460051e;
                    java.util.LinkedList linkedList = mh4Var.f462048n;
                    java.util.LinkedList lyrics = k96Var.f460055i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lyrics, "lyrics");
                    f0Var = f0Var3;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(lyrics, 10));
                    for (java.util.Iterator it7 = lyrics.iterator(); it7.hasNext(); it7 = it7) {
                        r45.l96 l96Var = (r45.l96) it7.next();
                        r45.nh4 nh4Var = new r45.nh4();
                        nh4Var.f462933e = l96Var.f460791e;
                        nh4Var.f462932d = l96Var.f460790d;
                        arrayList2.add(nh4Var);
                    }
                    linkedList.addAll(arrayList2);
                    arrayList.add(i18, mh4Var);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                    java.util.Iterator it8 = ((java.util.ArrayList) list).iterator();
                    while (it8.hasNext()) {
                        r45.mh4 mh4Var2 = (r45.mh4) it8.next();
                        java.lang.String valueOf = java.lang.String.valueOf(mh4Var2.f462041d);
                        java.lang.String str = mh4Var2.f462046i;
                        java.util.LinkedList singer_name = mh4Var2.f462047m;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singer_name, "singer_name");
                        java.lang.String g07 = kz5.n0.g0(singer_name, null, null, null, 0, null, null, 63, null);
                        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a();
                        java.util.LinkedList lyrics2 = mh4Var2.f462048n;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lyrics2, "lyrics");
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(lyrics2, 10));
                        java.util.Iterator it9 = lyrics2.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90(null, null, ((r45.nh4) it9.next()).f462933e, null));
                        }
                        arrayList3.add(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356(valueOf, str, g07, c4128x879fba0a, arrayList4.toArray(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90[0])));
                    }
                    q4Var2.mo148714x53d8522f(arrayList3);
                    java.util.Map map = c11004x58386388.f151285q.f504334k;
                    java.lang.String music_id2 = k96Var.f460050d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(music_id2, "music_id");
                    map.put(music_id2, java.lang.Long.valueOf(e1Var.f151472b));
                }
                java.lang.String music_id3 = k96Var.f460050d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(music_id3, "music_id");
                c11004x58386388.a(music_id3);
            }
            f0Var2 = f0Var;
        } else {
            f0Var = f0Var3;
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMMusicManager", "selectMusic: obj is not valued type");
        }
        return f0Var;
    }
}
