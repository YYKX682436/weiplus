package wv2;

/* loaded from: classes10.dex */
public final class m extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f531551h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qb4 f531552i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f531553m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f531554n;

    /* renamed from: o, reason: collision with root package name */
    public long f531555o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f531556p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f531557q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f531558r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f531559s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f531560t;

    /* renamed from: u, reason: collision with root package name */
    public pv2.g f531561u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f531562v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1650x55edd6f5.C15165x6b3934ba f531563w;

    /* renamed from: x, reason: collision with root package name */
    public final wv2.i f531564x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage$feedDeleteListener$1] */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f531551h = finderObj;
        this.f531552i = finderObj.f66945x4aebb6f3;
        this.f531553m = new java.util.LinkedHashMap();
        this.f531554n = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f531557q = new java.util.ArrayList();
        this.f531559s = new java.util.ArrayList();
        this.f531560t = new java.util.ArrayList();
        this.f531561u = new wv2.n(finderObj, 2);
        this.f531562v = new java.util.concurrent.CountDownLatch(1);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f531563w = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.da daVar = event.f135780g;
                long j17 = daVar.f87971b;
                if (j17 == 0) {
                    return false;
                }
                wv2.m mVar = wv2.m.this;
                if (j17 != mVar.f531551h.m59260x51f8f5b0()) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvUploadStage", "feedDeleteListener localId:" + daVar.f87971b);
                cu2.t tVar = cu2.u.f303974a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = mVar.f531551h;
                if (tVar.k(c14994x9b99c079.m59260x51f8f5b0())) {
                    return false;
                }
                mVar.f531556p = true;
                pm0.v.K(null, new wv2.j(mVar));
                wv2.m.l(mVar, new wv2.n(c14994x9b99c079, 2));
                return false;
            }
        };
        this.f531564x = new wv2.i(this);
    }

    public static final java.lang.String k(wv2.m mVar, java.lang.String str) {
        mVar.getClass();
        boolean z17 = false;
        if (str != null && r26.i0.y(str, "upload_", false)) {
            z17 = true;
        }
        if (z17) {
            java.lang.String substring = str.substring(7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            return substring;
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    public static final void l(wv2.m mVar, pv2.g gVar) {
        mVar.f531563w.mo48814x2efc64();
        mVar.f531561u = gVar;
        mVar.f531562v.countDown();
    }

    public static final void m(wv2.m mVar, int i17, r45.mb4 mb4Var) {
        mVar.n(mb4Var);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76731x604bb642(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = mVar.f531551h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76430xd706ad49(c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(1));
            c19783xd9a946b7.m76358x25b46b5d(c01.id.c());
            if (i17 == 0) {
                c19783xd9a946b7.m76296x7efe73ec().add((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69));
            }
        }
    }

    @Override // pv2.g
    public int a() {
        return 3;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f531551h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 22L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 22L, 1L);
            }
        }
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f531551h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 22L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 22L, 1L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x045f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x048d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wv2.m.j():pv2.g");
    }

    public final void n(r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf1.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf1.m76732xf0dfd739((int) (c01.id.c() - this.f531555o));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1();
            c19791x8d6e6bf12.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf12.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf12.m76732xf0dfd739((int) (c01.id.c() - this.f531555o));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 c19790xac7db1e0 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0();
            c19790xac7db1e0.m76711x53e9ee84((int) mb4Var.m75938x746dc8a6(4));
            c19790xac7db1e0.m76708xf84e829((int) mb4Var.m75938x746dc8a6(5));
            c19790xac7db1e0.m76706x4abaca1f((int) com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(0)));
            c19790xac7db1e0.m76710xc9923ded(mb4Var.m75939xb282bd08(3));
            c19790xac7db1e0.m76709x885d9bf4(mb4Var.m75939xb282bd08(8));
            c19791x8d6e6bf12.m76743xde9c855e(c19790xac7db1e0.m76699x50026913());
            c19791x8d6e6bf12.m76742x23cac893(c19790xac7db1e0);
            mb4Var.set(69, c19791x8d6e6bf12);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b o(dn.m mVar) {
        mVar.getClass();
        bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
        java.lang.String str = mVar.f69595x6d25b0d9;
        ((b92.u2) vVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 != null) {
            int i17 = d17.f243916b;
            bg0.v vVar2 = (bg0.v) i95.n0.c(bg0.v.class);
            java.lang.String field_fullpath = mVar.f69595x6d25b0d9;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
            ((b92.u2) vVar2).getClass();
            java.lang.String str2 = "videobitrate:" + i17 + "\r\nvideoformat:" + (t21.u2.b(field_fullpath) ? 174 : 28) + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvUploadStage", "customHeader " + str2);
            mVar.N = str2;
        }
        return d17;
    }

    public final boolean p(r45.mb4 mb4Var) {
        java.util.Iterator it = ((java.util.ArrayList) this.f531557q).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) it.next()).m75945x2fec8307(9), mb4Var.m75945x2fec8307(9))) {
                break;
            }
            i17++;
        }
        return i17 >= 0;
    }

    public final java.lang.String q(java.lang.String str) {
        return "upload_" + str;
    }

    public final java.lang.String r() {
        return "upload_" + this.f531551h.m59260x51f8f5b0();
    }

    public final void s(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f531551h;
        r45.qb4 qb4Var = this.f531552i;
        try {
            if (z17) {
                qb4Var.set(2, 1);
            } else {
                qb4Var.set(2, 2);
            }
            qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - this.f531555o));
            c14994x9b99c079.m59408xa3acbff0(qb4Var);
            long m75942xfb822ef2 = qb4Var.m75942xfb822ef2(9);
            boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u4.f206917a;
            u4Var.d(1253L, 9L, 1L, m59314x4d5c4d55);
            u4Var.d(1253L, 10L, m75942xfb822ef2, m59314x4d5c4d55);
            cu2.u.f303974a.n(c14994x9b99c079);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LogPost.MvUploadStage", e17, "", new java.lang.Object[0]);
        }
    }

    public final void t(boolean z17, int i17, r45.mb4 mb4Var) {
        n(mb4Var);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76734x324edfd0(z17 ? 1 : 0);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf12 == null) {
            return;
        }
        c19791x8d6e6bf12.m76730xbe386672(i17);
    }

    public final int u(r45.mb4 mb4Var) {
        if (mb4Var.m75939xb282bd08(2) == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16))) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(23))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvUploadStage", "mediaObject svr_coverUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(16))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LogPost.MvUploadStage", "upload failed, coverUrl not exist, " + mb4Var.m75945x2fec8307(16));
                return 5;
            }
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_FinderUploadTask_2";
            mVar.f323320f = this.f531564x;
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var.m75945x2fec8307(16));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            mVar.f69601xaca5bdda = q(a17);
            mVar.f69595x6d25b0d9 = mb4Var.m75945x2fec8307(16);
            mVar.f69619xe9ed65f6 = mb4Var.m75945x2fec8307(16);
            mVar.f69618x114ef53e = "";
            mVar.f69606xccdbf540 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvUploadStage", "upload cover file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(16)));
            mVar.f69592xf1ebe47b = 20304;
            mVar.f69580x454032b6 = 251;
            mVar.f69584x89a4c0cf = 2;
            mVar.A = 120;
            mVar.B = 300;
            mVar.f69609xd84b8349 = 2;
            this.f531554n.add(mVar.f69601xaca5bdda);
            java.util.Map map = this.f531553m;
            java.lang.String field_mediaId = mVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f531560t).add(mVar);
        }
        return 0;
    }

    public final int v(r45.mb4 mb4Var) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(25))) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(27))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvUploadStage", "mediaObject svr_fullThumbUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(25))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LogPost.MvUploadStage", "upload failed, fullThumbUrl not exist, " + mb4Var.m75945x2fec8307(25));
                return 6;
            }
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_FinderUploadTask_2";
            mVar.f323320f = this.f531564x;
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var.m75945x2fec8307(25));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            mVar.f69601xaca5bdda = q(a17);
            mVar.f69595x6d25b0d9 = mb4Var.m75945x2fec8307(25);
            mVar.f69619xe9ed65f6 = mb4Var.m75945x2fec8307(25);
            mVar.f69618x114ef53e = "";
            mVar.f69606xccdbf540 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvUploadStage", "upload fullthumb file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(25)));
            mVar.f69592xf1ebe47b = 20304;
            mVar.f69580x454032b6 = 251;
            mVar.f69584x89a4c0cf = 2;
            mVar.A = 120;
            mVar.B = 300;
            mVar.f69609xd84b8349 = 2;
            this.f531554n.add(mVar.f69601xaca5bdda);
            java.util.Map map = this.f531553m;
            java.lang.String field_mediaId = mVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f531560t).add(mVar);
        }
        return 0;
    }
}
