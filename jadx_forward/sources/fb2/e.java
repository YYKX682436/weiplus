package fb2;

/* loaded from: classes2.dex */
public final class e implements fb2.m {
    @Override // fb2.m
    public boolean a(db2.c3 resp, int i17, int i18) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        bs2.b0 b0Var;
        db2.c3 c3Var;
        java.util.LinkedList m75941xfb8219143;
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        r45.lb lbVar;
        r45.v80 v80Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb u07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().u0();
        if (i17 == 4 && i18 == 0) {
            r45.f03 I0 = u07 != null ? u07.I0("FinderEntrance") : null;
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) a17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onIntercept] tipsId=");
            sb6.append(u07 != null ? u07.f65880x11c19d58 : null);
            sb6.append(" title=[");
            sb6.append(I0 != null ? I0.f455422f : null);
            sb6.append('-');
            sb6.append((I0 == null || (lbVar = I0.f455437x) == null || (v80Var = lbVar.f460817d) == null) ? null : v80Var.f469514d);
            sb6.append("] sync_show_info is null? ");
            sb6.append(((u07 == null || (xs2Var2 = u07.N) == null) ? null : (r45.bz2) xs2Var2.m75936x14adae67(23)) == null);
            sb6.append(", respShowInfo is null? ");
            sb6.append(((r45.px2) resp.m75936x14adae67(24)) != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TipBubbleInterceptor", sb6.toString());
            if (((u07 == null || (xs2Var = u07.N) == null) ? null : (r45.bz2) xs2Var.m75936x14adae67(23)) != null) {
                r45.bz2 bz2Var = (r45.bz2) u07.N.m75936x14adae67(23);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bz2Var);
                r45.px2 px2Var = new r45.px2();
                px2Var.set(0, java.lang.Integer.valueOf(bz2Var.f452700d));
                px2Var.set(1, bz2Var.f452701e);
                px2Var.set(3, java.lang.Long.valueOf(bz2Var.f452703g));
                px2Var.set(4, bz2Var.f452704h);
                resp.set(24, px2Var);
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                    org.json.JSONObject mo12245xcc313de3 = bz2Var.mo12245xcc313de3();
                    if (mo12245xcc313de3.toString().length() > 4000) {
                        java.lang.String jSONObject = mo12245xcc313de3.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject.substring(0, 4000), "substring(...)");
                        java.lang.String jSONObject2 = mo12245xcc313de3.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2.substring(4000), "substring(...)");
                    }
                }
                bs2.n1 R6 = c14614xb913e379.R6(4);
                boolean d17 = d(u07, resp);
                if (R6 != null && (b0Var = R6.f105458s) != null && (c3Var = b0Var.f105339b) != null) {
                    java.util.LinkedList m75941xfb8219144 = c3Var.m75941xfb821914(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getObject(...)");
                    java.util.Iterator it = m75941xfb8219144.iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        }
                        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11() == resp.d().m75942xfb822ef2(12)) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 >= 0) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("requestId=");
                        r45.kv0 kv0Var = (r45.kv0) resp.d().m75936x14adae67(4);
                        sb7.append(kv0Var != null ? java.lang.Long.valueOf(kv0Var.m75942xfb822ef2(5)) : null);
                        sb7.append(" index=");
                        sb7.append(i19);
                        sb7.append(" feedId=");
                        sb7.append(pm0.v.u(resp.d().m75942xfb822ef2(12)));
                        java.lang.String sb8 = sb7.toString();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.TipBubbleInterceptor", "热门预拉取存在一条跟朋友气泡红点一样的feed. " + sb8);
                        pm0.z.b(xy2.b.f539688b, "", false, null, null, false, false, new fb2.b(sb8), 60, null);
                        if (d17 && (m75941xfb8219143 = c3Var.m75941xfb821914(1)) != null) {
                        }
                    }
                }
                if (d17 && (m75941xfb8219142 = resp.m75941xfb821914(1)) != null) {
                    m75941xfb8219142.removeIf(new fb2.c(resp));
                }
            } else {
                resp.set(24, null);
            }
        } else if (i17 == 4) {
            if (d(u07, resp) && (m75941xfb821914 = resp.m75941xfb821914(1)) != null) {
                m75941xfb821914.removeIf(new fb2.d(resp));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.TipBubbleInterceptor", " pullType(" + i18 + ") invalid.");
        }
        return false;
    }

    @Override // fb2.m
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d loadedInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedInfo, "loadedInfo");
        return false;
    }

    @Override // fb2.m
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d loadedInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedInfo, "loadedInfo");
        return false;
    }

    public final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, db2.c3 c3Var) {
        r45.xs2 xs2Var;
        r45.bz2 bz2Var;
        return (jbVar != null && (xs2Var = jbVar.N) != null && (bz2Var = (r45.bz2) xs2Var.m75936x14adae67(23)) != null && bz2Var.f452700d == 4) && c3Var.d().m75942xfb822ef2(12) == jbVar.N.m75942xfb822ef2(3);
    }
}
