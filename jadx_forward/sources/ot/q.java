package ot;

@j95.b
/* loaded from: classes9.dex */
public final class q extends jm0.o implements pt.k0 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f429861m = jz5.h.b(ot.n.f429856d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f429862n = jz5.h.b(ot.m.f429855d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f429863o = jz5.h.b(ot.p.f429859d);

    public void Zi(java.lang.String mediaId) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        tt.f.f503290f.a();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 Ai = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(mediaId);
        gm0.b bVar = gm0.j1.b().f354778h;
        if (bVar == null || (c20976x6ba6452a = bVar.f354678e) == null) {
            return;
        }
        v65.i.b(c20976x6ba6452a, null, new tt.c(Ai, mediaId, null), 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String aj(s15.h r17) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.q.aj(s15.h):java.lang.String");
    }

    public java.lang.String bj(s15.w recordInfoItem) {
        java.lang.String aj6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordInfoItem, "recordInfoItem");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (s15.h hVar : recordInfoItem.j()) {
            if (arrayList.size() < 5 && (aj6 = aj(hVar)) != null) {
                arrayList.add(hVar.m163588xabfe893c() + ": " + r26.i0.t(aj6, "\n", " ", false));
            }
        }
        java.lang.String g07 = kz5.n0.g0(arrayList, "\n", null, null, 0, null, null, 62, null);
        return arrayList.size() >= 5 ? g07.concat("...") : g07;
    }

    public java.lang.String cj(oi3.g msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        int i17 = msgInfo.f427150d;
        if (msgInfo.m75939xb282bd08(i17 + 4) == 1) {
            java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572103ys);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
            return g17;
        }
        if (msgInfo.m75939xb282bd08(i17 + 4) == 3) {
            java.lang.String g18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572050xd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getString(...)");
            return g18;
        }
        if (msgInfo.m75939xb282bd08(i17 + 4) == 43) {
            java.lang.String g19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g19, "getString(...)");
            return g19;
        }
        if (msgInfo.m75939xb282bd08(i17 + 4) == 49) {
            int m75939xb282bd08 = msgInfo.m75939xb282bd08(i17 + 5);
            if (m75939xb282bd08 == 1) {
                java.lang.String g27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572103ys);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g27, "getString(...)");
                return g27;
            }
            if (m75939xb282bd08 == 2) {
                java.lang.String g28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572050xd);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g28, "getString(...)");
                return g28;
            }
            if (m75939xb282bd08 != 6) {
                if (m75939xb282bd08 == 16) {
                    java.lang.String g29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572058xl);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g29, "getString(...)");
                    return g29;
                }
                if (m75939xb282bd08 == 48) {
                    java.lang.String g37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571983ve);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g37, "getString(...)");
                    return g37;
                }
                if (m75939xb282bd08 == 75) {
                    java.lang.String g38 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g38, "getString(...)");
                    return g38;
                }
                if (m75939xb282bd08 == 118) {
                    java.lang.String g39 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n3s);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g39, "getString(...)");
                    return g39;
                }
                if (m75939xb282bd08 != 130) {
                    if (m75939xb282bd08 == 2000 || m75939xb282bd08 == 2011) {
                        java.lang.String g47 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572045x6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g47, "getString(...)");
                        return g47;
                    }
                }
            }
            java.lang.String g48 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571963uv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g48, "getString(...)");
            return g48;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572015wb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public void fj(s15.w recordInfoItem, java.util.concurrent.atomic.AtomicLong maxSingleFileSize, java.util.concurrent.atomic.AtomicLong totalFileSize) {
        s15.w j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordInfoItem, "recordInfoItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(maxSingleFileSize, "maxSingleFileSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(totalFileSize, "totalFileSize");
        for (s15.h hVar : recordInfoItem.j()) {
            long m75942xfb822ef2 = hVar.m75942xfb822ef2(hVar.f384955d + 7);
            long j18 = maxSingleFileSize.get();
            int i17 = hVar.f384955d;
            if (m75942xfb822ef2 > j18) {
                maxSingleFileSize.set(hVar.m75942xfb822ef2(i17 + 7));
            }
            if (hVar.m75942xfb822ef2(i17 + 11) > maxSingleFileSize.get()) {
                maxSingleFileSize.set(hVar.m75942xfb822ef2(i17 + 11));
            }
            if (hVar.m75939xb282bd08(i17 + 2) == 17 || hVar.m75939xb282bd08(i17 + 2) == 21) {
                s15.i0 H = hVar.H();
                if (H != null && (j17 = H.j()) != null) {
                    fj(j17, maxSingleFileSize, totalFileSize);
                }
            } else {
                totalFileSize.set(totalFileSize.get() + hVar.m75942xfb822ef2(i17 + 11) + hVar.m75942xfb822ef2(i17 + 7));
            }
        }
    }

    public com.p314xaae8f345.mm.vfs.r6 hj() {
        return lp0.b.h0(gm0.j1.b().j() + "_BaseRecordSendApi");
    }

    public final java.util.HashMap ij() {
        return (java.util.HashMap) ((jz5.n) this.f429863o).mo141623x754a37bb();
    }

    public boolean mj(s15.h recordDataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        int i17 = recordDataItem.f384955d;
        return (r26.n0.N(recordDataItem.m75945x2fec8307(i17 + 4)) ^ true) || (r26.n0.N(recordDataItem.m75945x2fec8307(i17 + 8)) ^ true) || (r26.n0.N(recordDataItem.c0()) ^ true) || (r26.n0.N(recordDataItem.a0()) ^ true);
    }

    public boolean nj(java.lang.String fromTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromTalker, "fromTalker");
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20510xdc2c7c59()) == 1) {
            ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
            if (!r01.z.g(fromTalker)) {
                return true;
            }
        }
        return false;
    }

    public boolean oj(java.lang.String fromTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromTalker, "fromTalker");
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20527x9fe0c926()) == 1) {
            ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
            if (!r01.z.g(fromTalker)) {
                return true;
            }
        }
        return false;
    }

    @Override // jm0.o, i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        qj(1, ku.i.class);
        qj(34, ku.l.class);
        qj(48, ku.g.class);
        qj(3, ku.f.class);
        qj(43, ku.k.class);
        qj(42, ku.e.class);
        qj(66, ku.e.class);
        qj(67, ku.h.class);
        qj(47, ku.b.class);
        qj(49, lu.f.class);
        rj(8, ku.b.class);
        rj(2000, ku.j.class);
        rj(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, ku.j.class);
        rj(57, lu.d.class);
        rj(1, lu.e.class);
        rj(53, lu.e.class);
        rj(74, lu.i.class);
        rj(131, lu.i.class);
        rj(2, lu.b.class);
        rj(3, ou.a.class);
        rj(76, ou.c.class);
        rj(92, ou.c.class);
        rj(93, ou.b.class);
        rj(133, ou.d.class);
        rj(4, lu.l.class);
        rj(5, lu.l.class);
        rj(129, nu.j.class);
        rj(51, nu.j.class);
        rj(63, nu.f.class);
        rj(88, nu.f.class);
        rj(82, nu.a.class);
        rj(94, nu.b.class);
        rj(111, nu.b.class);
        rj(113, nu.g.class);
        rj(72, nu.k.class);
        rj(59, nu.k.class);
        rj(50, nu.i.class);
        rj(105, nu.h.class);
        rj(73, nu.e.class);
        rj(6, lu.h.class);
        rj(130, lu.h.class);
        rj(7, ku.j.class);
        rj(46, ku.j.class);
        rj(36, lu.a.class);
        rj(33, lu.a.class);
        rj(44, ku.d.class);
        rj(48, ku.j.class);
        rj(68, lu.j.class);
        rj(19, lu.k.class);
        rj(24, lu.k.class);
        rj(16, ku.j.class);
        rj(75, nu.c.class);
        rj(101, lu.g.class);
        rj(119, nu.d.class);
        rj(120, nu.d.class);
        rj(132, mu.a.class);
        sj(2, iu.n.class);
        sj(15, iu.z.class);
        sj(4, iu.z.class);
        sj(8, iu.j.class);
        sj(36, iu.v.class);
        sj(5, iu.v.class);
        sj(19, iu.v.class);
        sj(29, iu.v.class);
        sj(32, iu.v.class);
        sj(33, iu.v.class);
        pj(133, iu.v.class);
        sj(7, iu.v.class);
        sj(17, iu.r.class);
        sj(1, iu.t.class);
        pj(130, iu.j.class);
        pj(44, iu.v.class);
    }

    public final void pj(int i17, java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        ij().put(java.lang.Integer.valueOf(i17 + 10000), clazz);
    }

    public void qj(int i17, java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        ((java.util.HashMap) ((jz5.n) this.f429861m).mo141623x754a37bb()).put(java.lang.Integer.valueOf(i17), clazz);
    }

    public void rj(int i17, java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        ((java.util.HashMap) ((jz5.n) this.f429862n).mo141623x754a37bb()).put(java.lang.Integer.valueOf(i17), clazz);
    }

    public void sj(int i17, java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        ij().put(java.lang.Integer.valueOf(i17), clazz);
    }
}
