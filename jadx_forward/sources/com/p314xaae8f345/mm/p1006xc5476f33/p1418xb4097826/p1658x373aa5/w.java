package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public abstract class w extends al5.a0 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f214803o;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f214804e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f214805f;

    /* renamed from: g, reason: collision with root package name */
    public final pj4.t f214806g;

    /* renamed from: h, reason: collision with root package name */
    public al5.z f214807h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f214808i;

    /* renamed from: m, reason: collision with root package name */
    public final im5.c f214809m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.t f214810n;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s(null);
        f214803o = new java.util.HashMap();
    }

    public w(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, pj4.t pullDownParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pullDownParam, "pullDownParam");
        this.f214804e = context;
        this.f214805f = finderObject;
        this.f214806g = pullDownParam;
        im5.c cVar = new im5.c();
        this.f214809m = cVar;
        cVar.mo46316x322b85(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.r.f214447d);
    }

    @Override // al5.a0
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.t tVar;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        this.f87395d = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.t tVar2 = this.f214810n;
        if (tVar2 != null) {
            md0.e eVar = (md0.e) ((nd0.e) i95.n0.c(nd0.e.class));
            android.content.Context context = this.f214804e;
            pj4.p0 p0Var = (pj4.p0) eVar.Ui(context, 9, pj4.p0.class);
            r45.qt2 qt2Var = new r45.qt2();
            if (p0Var != null) {
                qt2Var.set(1, p0Var.f436769d);
                qt2Var.set(5, 106);
            }
            long c17 = c01.id.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed = this.f214805f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
            r45.vd6 vd6Var = new r45.vd6();
            vd6Var.set(0, java.lang.Long.valueOf(feed.m76784x5db1b11()));
            r45.dm2 m76806xdef68064 = feed.m76806xdef68064();
            vd6Var.set(28, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null);
            vd6Var.set(4, feed.m76803x6c285d75());
            vd6Var.set(2, new r45.yw6());
            vd6Var.set(3, new r45.q25());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = feed.m76802x2dd01666();
            vd6Var.set(13, java.lang.Integer.valueOf(m76802x2dd01666 != null ? m76802x2dd01666.m76964x7f025288() : 0));
            java.lang.String m76836x6c03c64c = feed.m76836x6c03c64c();
            if (m76836x6c03c64c == null) {
                m76836x6c03c64c = "";
            }
            vd6Var.set(5, m76836x6c03c64c);
            long j17 = tVar2.f214615a;
            vd6Var.set(6, java.lang.Long.valueOf(j17));
            java.lang.String m76829x97edf6c0 = feed.m76829x97edf6c0();
            if (m76829x97edf6c0 == null) {
                m76829x97edf6c0 = "";
            }
            vd6Var.set(8, m76829x97edf6c0);
            vd6Var.set(16, java.lang.Long.valueOf(j17));
            r45.yw6 yw6Var = (r45.yw6) vd6Var.m75936x14adae67(2);
            if (yw6Var != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = feed.m76802x2dd01666();
                yw6Var.set(0, java.lang.Integer.valueOf((m76802x2dd016662 == null || (m76962x74cd162e = m76802x2dd016662.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) ? 0 : c19788xd7cfd73e.m76629x36bbd779()));
                long j18 = c17 - j17;
                tVar = tVar2;
                yw6Var.set(1, java.lang.Integer.valueOf((int) (j18 / 1000)));
                yw6Var.set(2, java.lang.Long.valueOf(j18));
                yw6Var.set(3, java.lang.Long.valueOf(yw6Var.m75942xfb822ef2(2)));
                yw6Var.set(4, java.lang.Long.valueOf(yw6Var.m75942xfb822ef2(2)));
                yw6Var.set(5, java.lang.Long.valueOf(yw6Var.m75942xfb822ef2(2)));
                yw6Var.set(6, java.lang.Long.valueOf(j17));
                yw6Var.set(7, java.lang.Long.valueOf(c17));
            } else {
                tVar = tVar2;
            }
            r45.q25 q25Var = (r45.q25) vd6Var.m75936x14adae67(3);
            if (q25Var != null) {
                q25Var.set(1, 0);
                r45.yw6 yw6Var2 = (r45.yw6) vd6Var.m75936x14adae67(2);
                q25Var.set(2, java.lang.Integer.valueOf(yw6Var2 != null ? yw6Var2.m75939xb282bd08(1) : 0));
                q25Var.set(14, 0);
                q25Var.set(3, java.lang.Integer.valueOf(tVar.f214616b));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4.f206684r0.c(vd6Var, mo10824xb5887064());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(vd6Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w4.f206955a.b(linkedList, qt2Var, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206812q;
            long m76784x5db1b11 = feed.m76784x5db1b11();
            r45.dm2 m76806xdef680642 = feed.m76806xdef68064();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o0.b(o0Var, qt2Var, m76784x5db1b11, m76806xdef680642 != null ? m76806xdef680642.m75945x2fec8307(62) : null, 20, java.lang.String.valueOf(c17 - j17), 0L, null, null, null, 480, null);
        }
    }

    @Override // al5.a0
    public void l(al5.z zVar) {
        this.f214807h = zVar;
    }

    public void m() {
        if (this.f214808i) {
            return;
        }
        this.f214808i = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo10824xb5887064(), "checkFeedValidFromServer...");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f214805f;
        long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
        java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        db2.g4 g4Var = new db2.g4(m76784x5db1b11, m76803x6c285d75, 106, 2, "", true, null, null, 0L, null, false, false, null, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null, null, 402644928, null);
        g4Var.f97670p = false;
        g4Var.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v(this)).f(this.f214809m);
    }

    public abstract void n(boolean z17);

    public final boolean o() {
        java.lang.Boolean bool = (java.lang.Boolean) f214803o.get(java.lang.Long.valueOf(this.f214805f.m76784x5db1b11()));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void p(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo10824xb5887064(), "resetFinderObject: ");
        java.lang.String encodeToString = android.util.Base64.encodeToString(finderObject.mo14344x5f01b1f6(), 0);
        al5.z zVar = this.f214807h;
        if (zVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
            cj4.b1 b1Var = (cj4.b1) zVar;
            pj4.o0 o0Var = b1Var.f123441a;
            java.util.LinkedList jumpInfos = o0Var.f436749g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfos, "jumpInfos");
            pj4.j0 a17 = sj4.a1.a(jumpInfos);
            java.lang.String str = a17 != null ? a17.f436672d : null;
            if (str == null) {
                str = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResetBusiBuf: jumpType:");
            sb6.append(str);
            sb6.append(" customParts:");
            bi4.o0 o0Var2 = b1Var.f123442b;
            sb6.append(o0Var2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", sb6.toString());
            if (bi4.e.d(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(encodeToString)) {
                java.util.LinkedList jumpInfos2 = o0Var.f436749g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfos2, "jumpInfos");
                pj4.j0 a18 = sj4.a1.a(jumpInfos2);
                if (bi4.e.d(a18 != null ? a18.f436672d : null)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18 != null ? a18.f436674f : null)) {
                        java.util.LinkedList jumpInfos3 = o0Var.f436749g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfos3, "jumpInfos");
                        pj4.j0 a19 = sj4.a1.a(jumpInfos3);
                        if (a19 != null) {
                            a19.f436674f = encodeToString;
                        }
                    }
                }
                java.util.LinkedList jumps = o0Var.f436754o.f436542m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumps, "jumps");
                pj4.j0 a27 = sj4.a1.a(jumps);
                if (bi4.e.d(a27 != null ? a27.f436672d : null)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a27 != null ? a27.f436674f : null)) {
                        java.util.LinkedList jumps2 = o0Var.f436754o.f436542m;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumps2, "jumps");
                        pj4.j0 a28 = sj4.a1.a(jumps2);
                        if (a28 != null) {
                            a28.f436674f = encodeToString;
                        }
                    }
                }
                boolean z17 = o0Var2 instanceof bi4.h0;
                mj4.h hVar = b1Var.f123443c;
                if (z17) {
                    bi4.o0 o0Var3 = ((sj4.v0) ((bi4.h0) o0Var2)).f490430c;
                    if (o0Var3 != null) {
                        java.lang.String l17 = ((mj4.k) hVar).l();
                        java.util.LinkedList jumpInfos4 = o0Var.f436749g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfos4, "jumpInfos");
                        o0Var3.m(l17, sj4.a1.a(jumpInfos4));
                    }
                } else {
                    java.lang.String l18 = ((mj4.k) hVar).l();
                    java.util.LinkedList jumpInfos5 = o0Var.f436749g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfos5, "jumpInfos");
                    o0Var2.m(l18, sj4.a1.a(jumpInfos5));
                }
                mj4.k kVar = (mj4.k) hVar;
                ai4.b.g(ai4.m0.f86706a, kVar.o(), kVar.l(), ni4.z.a(hVar), 2, null, 0L, 0.0f, null, null, false, 1008, null);
                cj4.i1 i1Var = b1Var.f123444d;
                i1Var.C(hVar);
                i1Var.D();
            }
        }
        this.f214807h = null;
    }
}
