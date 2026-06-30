package xe2;

/* loaded from: classes3.dex */
public final class n1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535421c;

    /* renamed from: d, reason: collision with root package name */
    public long f535422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535421c = "LiveUpdateFinderObjectInterceptor";
    }

    @Override // we2.x
    public void c() {
        this.f535422d = 0L;
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        java.lang.Object next;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664;
        r45.nw1 m76794xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        java.util.Iterator it = msgList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long m75942xfb822ef2 = ((r45.ch1) next).m75942xfb822ef2(12);
                do {
                    java.lang.Object next2 = it.next();
                    long m75942xfb822ef22 = ((r45.ch1) next2).m75942xfb822ef2(12);
                    if (m75942xfb822ef2 < m75942xfb822ef22) {
                        next = next2;
                        m75942xfb822ef2 = m75942xfb822ef22;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        r45.ch1 ch1Var = (r45.ch1) next;
        if ((ch1Var != null ? ch1Var.m75942xfb822ef2(12) : 0L) < this.f535422d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("skip this updateFinderObject by invalid seq. [");
            sb6.append(ch1Var != null ? ch1Var.m75942xfb822ef2(12) : 0L);
            sb6.append(" : ");
            sb6.append(this.f535422d);
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535421c, sb6.toString());
            return;
        }
        gk2.e eVar = this.f526800a;
        if (ch1Var != null && (m75934xbce7f2f = ch1Var.m75934xbce7f2f(4)) != null) {
            this.f535422d = ch1Var.m75942xfb822ef2(12);
            r45.nk1 nk1Var = new r45.nk1();
            try {
                nk1Var.mo11468x92b714fd(m75934xbce7f2f.g());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            int i17 = 5;
            if (pm0.v.z((int) nk1Var.m75942xfb822ef2(5), 2)) {
                mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                java.lang.String str = "updateCoverInfo updateFinderInfo.cover_img:" + ((r45.c84) nk1Var.m75936x14adae67(1));
                java.lang.String str2 = c1Var.f410333f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
                r45.c84 c84Var = (r45.c84) nk1Var.m75936x14adae67(1);
                if (c84Var != null) {
                    java.lang.String m75945x2fec8307 = c84Var.m75945x2fec8307(0);
                    java.lang.String m75945x2fec83072 = nk1Var.m75945x2fec8307(2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "updateCoverInfo url:" + m75945x2fec8307 + " token:" + m75945x2fec83072);
                    if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(m75945x2fec8307);
                        sb7.append(m75945x2fec83072 != null ? m75945x2fec83072 : "");
                        java.lang.String sb8 = sb7.toString();
                        c1Var.f410424u2 = sb8;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c1Var.f410379n;
                        if (!((c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null || m76794xd0557130.m75939xb282bd08(17) != 1) ? false : true)) {
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = c1Var.f410379n;
                            r45.uo1 m76959xd0530b13 = (c19792x256d27252 == null || (m76802x2dd016664 = c19792x256d27252.m76802x2dd01666()) == null) ? null : m76802x2dd016664.m76959xd0530b13();
                            if (m76959xd0530b13 != null) {
                                m76959xd0530b13.set(0, sb8);
                            }
                        }
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = c1Var.f410379n;
                        if (c19792x256d27253 != null && (m76802x2dd016663 = c19792x256d27253.m76802x2dd01666()) != null && (m76962x74cd162e2 = m76802x2dd016663.m76962x74cd162e()) != null && (c19788xd7cfd73e2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e2)) != null) {
                            c19788xd7cfd73e2.m76676xd3f7e23b(sb8);
                            c19788xd7cfd73e2.m76685x53e9ee84(c84Var.m75939xb282bd08(2));
                            c19788xd7cfd73e2.m76658xf84e829(c84Var.m75939xb282bd08(1));
                            c19788xd7cfd73e2.m76638x619ae8ba(m75945x2fec8307);
                            c19788xd7cfd73e2.m76640xb83193df(m75945x2fec83072);
                        }
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) c1Var.m147920xbba4bfc0(mm2.g1.class)).f410608p).k(sb8);
                    }
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = c1Var.f410379n;
                if (c19792x256d27254 != null && (m76802x2dd016662 = c19792x256d27254.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd016662.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                    java.util.LinkedList m75941xfb821914 = nk1Var.m75941xfb821914(3);
                    if ((m75941xfb821914 != null ? m75941xfb821914.size() : 0) > 0) {
                        c19788xd7cfd73e.m76661x2cc20509(nk1Var.m75941xfb821914(3));
                    }
                }
                i17 = 5;
            }
            if (pm0.v.z((int) nk1Var.m75942xfb822ef2(i17), 1)) {
                mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
                c1Var2.V1 = nk1Var.m75945x2fec8307(0);
                c1Var2.W1 = nk1Var.m75945x2fec8307(4);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27255 = c1Var2.f410379n;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016665 = c19792x256d27255 != null ? c19792x256d27255.m76802x2dd01666() : null;
                if (m76802x2dd016665 != null) {
                    m76802x2dd016665.m76982x9713e3a(nk1Var.m75945x2fec8307(0));
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27256 = c1Var2.f410379n;
                r45.uo1 m76959xd0530b132 = (c19792x256d27256 == null || (m76802x2dd01666 = c19792x256d27256.m76802x2dd01666()) == null) ? null : m76802x2dd01666.m76959xd0530b13();
                if (m76959xd0530b132 != null) {
                    m76959xd0530b132.set(1, nk1Var.m75945x2fec8307(4));
                }
            }
            if (pm0.v.z((int) nk1Var.m75942xfb822ef2(5), 3)) {
                ((mm2.c1) eVar.a(mm2.c1.class)).f410320c4 = (r45.ze2) nk1Var.m75936x14adae67(6);
                dk2.xa.f315877a.d(eVar);
            }
        }
        ((mm2.c1) eVar.a(mm2.c1.class)).S9();
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20036};
    }
}
