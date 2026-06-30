package k40;

@j95.b
/* loaded from: classes8.dex */
public final class f extends i95.w implements l40.e {
    public java.lang.String Ai(java.lang.String username, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        int i17 = 0;
        m92.b j37 = g92.a.j3(g92.b.f351302e, username, false, 2, null);
        int i18 = j37 != null ? !j37.w0() ? 1 : 0 : 0;
        if (j37 != null && j37.w0()) {
            i17 = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAccountAccessService", "username=" + username + " isOwner=" + i18 + " isClub=" + i17 + " url=" + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isOwner=");
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("isClub=");
        sb8.append(i17);
        java.lang.String a17 = com.p314xaae8f345.mm.ui.p2740x696c9db.qd.a(str, sb7, sb8.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "safelyUrlConcatParam(...)");
        return a17;
    }

    public int Bi(android.content.Context context, java.lang.String finderUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        if (finderUserName.length() == 0) {
            finderUserName = xy2.c.e(context);
        }
        return Di(finderUserName);
    }

    public int Di(java.lang.String finderUsername) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209456s1).mo141623x754a37bb()).r()).intValue();
        if (intValue != -1) {
            return intValue;
        }
        boolean gl6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).gl();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAccountAccessService", "showPostEntry :" + gl6 + " finderUsername:" + finderUsername);
        if (gl6) {
            m92.b b17 = g92.b.f351302e.b1(finderUsername, true);
            if (b17 != null) {
                if ((b17.u0().m75939xb282bd08(1) & 2) != 0) {
                    i17 = 5;
                } else {
                    int i18 = b17.f68719xcaa18d00;
                    if (i18 == 1) {
                        i17 = 4;
                    } else {
                        i17 = (i18 != 2 ? 0 : 1) != 0 ? 6 : 3;
                    }
                }
                r1 = i17;
            } else {
                r1 = 2;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAccountAccessService", "resultState = " + r1);
        return r1;
    }

    public java.util.ArrayList Ni() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList m75941xfb821914 = g92.b.f351302e.k2().d().m75941xfb821914(25);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getExpt_buffers(...)");
        int i17 = 0;
        for (java.lang.Object obj : m75941xfb821914) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj;
            if (gVar != null && gVar.f273689a.length > 0) {
                try {
                    r45.l21 l21Var = new r45.l21();
                    l21Var.m75932x347fbd55(gVar.g());
                    arrayList.add(l21Var);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAccountAccessService", "[getExptBuffers] index:" + i17 + " buf:" + android.util.Base64.encodeToString(gVar.g(), 0) + " err:" + th6.getMessage());
                }
            }
            i17 = i18;
        }
        return arrayList;
    }

    public r45.ct4 Ri(java.lang.String finderUsername, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getMyFinderTabShowWording] finderUsername:");
        sb6.append(finderUsername);
        sb6.append(" position:");
        sb6.append(i17);
        sb6.append(" size:");
        g92.b bVar = g92.b.f351302e;
        java.util.LinkedList m75941xfb821914 = bVar.k2().d().m75941xfb821914(28);
        sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAccountAccessService", sb6.toString());
        java.util.LinkedList m75941xfb8219142 = bVar.k2().d().m75941xfb821914(28);
        if (m75941xfb8219142 != null) {
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.ct4) obj).m75945x2fec8307(0), finderUsername)) {
                    break;
                }
            }
            r45.ct4 ct4Var = (r45.ct4) obj;
            if (ct4Var != null) {
                m92.b j37 = g92.a.j3(g92.b.f351302e, finderUsername, false, 2, null);
                r45.gc4 gc4Var = j37 != null ? j37.f68709xf8290664 : null;
                long j17 = 0;
                if (i17 != 0) {
                    if (i17 == 1 && gc4Var != null) {
                        j17 = gc4Var.m75942xfb822ef2(1);
                    }
                } else if (gc4Var != null) {
                    j17 = gc4Var.m75942xfb822ef2(0);
                }
                if (Vi(ct4Var.m75942xfb822ef2(2) * 1000) && !Vi(j17)) {
                    return ct4Var;
                }
            }
        }
        return null;
    }

    public java.lang.String Ui(android.content.Context context) {
        return g92.b.f351302e.y4(context);
    }

    public final boolean Vi(long j17) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        long timeInMillis = j17 - new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
        return timeInMillis >= 0 && timeInMillis < 86400000;
    }

    public void Zi(java.lang.String finderUsername, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        g92.b.f351302e.P0(finderUsername, source);
    }

    public java.lang.String aj() {
        return g92.b.f351302e.U();
    }

    public void bj(java.lang.String finderUsername, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        g92.b bVar = g92.b.f351302e;
        m92.c cVar = new m92.c(finderUsername);
        r45.gc4 gc4Var = cVar.f68709xf8290664;
        if (gc4Var == null) {
            gc4Var = new r45.gc4();
        }
        if (i17 == 0) {
            gc4Var.set(0, java.lang.Long.valueOf(j17));
        } else if (i17 == 1) {
            gc4Var.set(1, java.lang.Long.valueOf(j17));
        }
        cVar.f68709xf8290664 = gc4Var;
        bVar.C(cVar, m92.j.C);
    }

    public void wi(yz5.l call) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        g92.b.f351302e.h6().f406519i.add(new k40.e(call));
    }
}
