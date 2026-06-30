package ds2;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ds2.h f324399a = new ds2.h();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f324400b = jz5.h.b(ds2.c.f324394d);

    /* renamed from: c, reason: collision with root package name */
    public static final float f324401c = ((c61.l7) i95.n0.c(c61.l7.class)).ek().M;

    public static final boolean b(java.lang.String str, int i17) {
        if (i17 == 1) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "h264");
        }
        if (i17 == 2) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "h265");
        }
        if (i17 != 3) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "h266");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    public final mn2.g4 a(r45.mb4 mb4Var) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z65.c.a()) {
            return null;
        }
        java.lang.String str2 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().E;
        if (!android.text.TextUtils.isEmpty(str2)) {
            java.util.LinkedList m75941xfb821914 = mb4Var.m75941xfb821914(44);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getHdr_spec(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.vf2) obj).m75945x2fec8307(0), str2) && !android.text.TextUtils.isEmpty(str2)) {
                    break;
                }
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar5 = (r45.vf2) obj;
            if (fVar5 == null) {
                java.util.LinkedList m75941xfb8219142 = mb4Var.m75941xfb821914(43);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getHls_spec(...)");
                java.util.Iterator it6 = m75941xfb8219142.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        fVar = 0;
                        break;
                    }
                    fVar = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.jb1) fVar).m75945x2fec8307(0), str2) && !android.text.TextUtils.isEmpty(str2)) {
                        break;
                    }
                }
                fVar5 = (r45.jb1) fVar;
                if (fVar5 == null) {
                    java.util.LinkedList m75941xfb8219143 = mb4Var.m75941xfb821914(15);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getSpec(...)");
                    java.util.Iterator it7 = m75941xfb8219143.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            fVar2 = 0;
                            break;
                        }
                        fVar2 = it7.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.vf2) fVar2).m75945x2fec8307(0), str2) && !android.text.TextUtils.isEmpty(str2)) {
                            break;
                        }
                    }
                    fVar5 = (r45.vf2) fVar2;
                }
            }
            if (fVar5 == null) {
                return null;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.vf2().mo11468x92b714fd(fVar5.mo14344x5f01b1f6());
            r45.vf2 vf2Var = mo11468x92b714fd instanceof r45.vf2 ? (r45.vf2) mo11468x92b714fd : null;
            if (vf2Var != null) {
                return new mn2.g4(mb4Var, yr2.k.X.c(vf2Var.m75945x2fec8307(0)), vf2Var.m75945x2fec8307(0), yr2.l.a(vf2Var), vf2Var.m75939xb282bd08(4), null, fVar5 instanceof r45.jb1, vf2Var, 32, null);
            }
            return null;
        }
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209595ze).mo141623x754a37bb()).r()).intValue();
        if (intValue == 0) {
            return null;
        }
        java.util.LinkedList m75941xfb8219144 = mb4Var.m75941xfb821914(44);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getHdr_spec(...)");
        java.util.Iterator it8 = m75941xfb8219144.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it8.next();
            if (b(((r45.vf2) obj2).m75945x2fec8307(3), intValue)) {
                break;
            }
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar6 = (r45.vf2) obj2;
        if (fVar6 == null) {
            java.util.LinkedList m75941xfb8219145 = mb4Var.m75941xfb821914(43);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219145, "getHls_spec(...)");
            java.util.Iterator it9 = m75941xfb8219145.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    fVar3 = 0;
                    break;
                }
                fVar3 = it9.next();
                if (b(((r45.jb1) fVar3).m75945x2fec8307(3), intValue)) {
                    break;
                }
            }
            fVar6 = (r45.jb1) fVar3;
            if (fVar6 == null) {
                java.util.LinkedList m75941xfb8219146 = mb4Var.m75941xfb821914(15);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219146, "getSpec(...)");
                java.util.Iterator it10 = m75941xfb8219146.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        fVar4 = 0;
                        break;
                    }
                    fVar4 = it10.next();
                    if (b(((r45.vf2) fVar4).m75945x2fec8307(3), intValue)) {
                        break;
                    }
                }
                fVar6 = (r45.vf2) fVar4;
            }
        }
        if (fVar6 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd2 = new r45.vf2().mo11468x92b714fd(fVar6.mo14344x5f01b1f6());
        r45.vf2 vf2Var2 = mo11468x92b714fd2 instanceof r45.vf2 ? (r45.vf2) mo11468x92b714fd2 : null;
        if (vf2Var2 != null) {
            return new mn2.g4(mb4Var, yr2.k.X.c(vf2Var2.m75945x2fec8307(0)), vf2Var2.m75945x2fec8307(0), yr2.l.a(vf2Var2), vf2Var2.m75939xb282bd08(4), null, fVar6 instanceof r45.jb1, null, 160, null);
        }
        return null;
    }

    public final mn2.g4 c(long j17, r45.mb4 media, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            mn2.g4 a17 = a(media);
            if (a17 == null) {
                try {
                    a17 = f(((yr2.k) ((jz5.n) f324400b).mo141623x754a37bb()).b(j17, media), media, z17);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMediaSpecSelector", "quickFindBestVideoToPlay: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms feedId=" + pm0.v.u(j17) + " mediaCache:" + cu2.x.c(cu2.x.f303982a, "", false, false, false, 14, null).I0());
                    throw th;
                }
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            cu2.x xVar = cu2.x.f303982a;
            java.lang.String n17 = a17.n();
            if (n17 == null) {
                n17 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMediaSpecSelector", "quickFindBestVideoToPlay: " + currentTimeMillis2 + "ms feedId=" + pm0.v.u(j17) + " mediaCache:" + cu2.x.c(xVar, n17, false, false, false, 14, null).I0());
            return a17;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mn2.g4 d(r45.mb4 r17, yz5.l r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ds2.h.d(r45.mb4, yz5.l):mn2.g4");
    }

    public final mn2.g4 e(r45.mb4 mb4Var, yz5.l lVar) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(mb4Var.m75941xfb821914(15));
        java.util.LinkedList m75941xfb821914 = mb4Var.m75941xfb821914(43);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getHls_spec(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.vf2().mo11468x92b714fd(((r45.jb1) it.next()).mo14344x5f01b1f6());
            r45.vf2 vf2Var = mo11468x92b714fd instanceof r45.vf2 ? (r45.vf2) mo11468x92b714fd : null;
            if (vf2Var != null) {
                vf2Var.set(20, java.lang.Boolean.TRUE);
                linkedList.add(vf2Var);
            }
        }
        linkedList.addAll(mb4Var.m75941xfb821914(44));
        for (r45.vf2 vf2Var2 : kz5.n0.F0(linkedList, new ds2.b())) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vf2Var2, "<this>");
            boolean z17 = false;
            java.lang.String k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.k(vf2Var2.m75945x2fec8307(0), mb4Var.m75945x2fec8307(9), mb4Var.m75945x2fec8307(0));
            so2.i3 c17 = cu2.x.c(cu2.x.f303982a, k17, false, false, false, 14, null);
            boolean booleanValue = ((java.lang.Boolean) lVar.mo146xb9724478(c17)).booleanValue();
            java.lang.String field_mediaId = c17.f68981xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            mn2.g4 g4Var = bs2.f.f105365c;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(field_mediaId, g4Var != null ? g4Var.n() : null);
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(c17.u0());
            if ((booleanValue || b17) && j17) {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMediaSpecSelector", "findCacheSpecFromSvr: mediaId=" + k17 + "} ret:" + z17 + " isPreloadComplete=" + booleanValue + " isPlayerPreloaded=" + b17 + " cachePercent=" + c17.y0() + " isExist:" + j17 + " maxPercent:" + f324401c);
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("findCacheSpecFromSvr: hit cache:");
                sb6.append(c17);
                sb6.append(" svrSpec:");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    arrayList.add(yr2.l.b((r45.vf2) it6.next()));
                }
                sb6.append(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderMediaSpecSelector", sb6.toString());
                return new mn2.g4(mb4Var, yr2.k.X.c(c17.f68976xe1500f8), c17.f68976xe1500f8, c17.f68987x74535930, c17.f68971xc0e4813d, null, c17.f68980xb45ee2bb, vf2Var2, 32, null);
            }
            if (z17) {
                break;
            }
        }
        return null;
    }

    public final mn2.g4 f(mn2.g4 result, r45.mb4 media, boolean z17) {
        mn2.g4 d17;
        mn2.g4 d18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        so2.i3 c17 = cu2.x.c(cu2.x.f303982a, result.n(), false, false, false, 14, null);
        float y07 = c17.y0();
        boolean F0 = c17.F0();
        float f17 = f324401c;
        if (f17 == -1.0f) {
            if (F0) {
                return result;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209157be).mo141623x754a37bb()).r()).intValue() == 1) {
                d18 = e(media, new ds2.d(z17));
                if (d18 == null) {
                    return result;
                }
            } else {
                d18 = d(media, new ds2.e(z17));
                if (d18 == null) {
                    return result;
                }
            }
            return d18;
        }
        if (y07 >= f17) {
            return result;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209157be).mo141623x754a37bb()).r()).intValue() == 1) {
            d17 = e(media, new ds2.f(z17));
            if (d17 == null) {
                return result;
            }
        } else {
            d17 = d(media, new ds2.g(z17));
            if (d17 == null) {
                return result;
            }
        }
        return d17;
    }
}
