package xv2;

/* loaded from: classes10.dex */
public final class j extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f538946h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f538947i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.qb4 f538948m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f538949n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f538950o;

    /* renamed from: p, reason: collision with root package name */
    public long f538951p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f538952q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f538953r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f538954s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f538955t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f538956u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f538957v;

    /* renamed from: w, reason: collision with root package name */
    public pv2.g f538958w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f538959x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1651x898d3be2.C15167x8091b38d f538960y;

    /* renamed from: z, reason: collision with root package name */
    public final xv2.g f538961z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeUploadStage$feedDeleteListener$1] */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f538946h = finderObj;
        this.f538947i = "LogPost.FinderUploadStage";
        this.f538948m = finderObj.f66945x4aebb6f3;
        this.f538949n = new java.util.LinkedHashMap();
        this.f538950o = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f538953r = new java.util.ArrayList();
        this.f538955t = new java.util.ArrayList();
        this.f538956u = new java.util.ArrayList();
        this.f538958w = new tv2.x(finderObj, 2);
        this.f538959x = new java.util.concurrent.CountDownLatch(1);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f538960y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.newlifestage.NewLifeUploadStage$feedDeleteListener$1
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
                xv2.j jVar = xv2.j.this;
                if (j17 != jVar.f538946h.m59260x51f8f5b0()) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "feedDeleteListener localId:" + daVar.f87971b);
                cu2.t tVar = cu2.u.f303974a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = jVar.f538946h;
                if (tVar.k(c14994x9b99c079.m59260x51f8f5b0())) {
                    return false;
                }
                jVar.f538952q = true;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
                if (c19783xd9a946b7 != null) {
                    c19783xd9a946b7.m76447x75f6f6ad(100);
                }
                pm0.v.K(null, new xv2.h(jVar));
                xv2.j.l(jVar, new tv2.x(c14994x9b99c079, 1));
                return false;
            }
        };
        this.f538961z = new xv2.g(this);
    }

    public static final boolean k(xv2.j jVar, java.lang.String str) {
        java.util.LinkedList linkedList;
        r45.q23 m76980xaa7f977e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = jVar.f538946h.getFeedObject().m76802x2dd01666();
        java.lang.Object obj = null;
        r45.iy5 iy5Var = (m76802x2dd01666 == null || (m76980xaa7f977e = m76802x2dd01666.m76980xaa7f977e()) == null) ? null : m76980xaa7f977e.f465125n;
        if (iy5Var == null || (linkedList = iy5Var.f458945d) == null) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a((java.lang.String) next), jVar.o(str))) {
                obj = next;
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        if (str2 == null) {
            return false;
        }
        linkedList.set(linkedList.indexOf(str2), "");
        jVar.f538950o.remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "handleTemplateScyThumb upload fail target:" + str2 + " to mediaId:" + str);
        return true;
    }

    public static final void l(xv2.j jVar, pv2.g gVar) {
        jVar.f538960y.mo48814x2efc64();
        jVar.f538958w = gVar;
        jVar.f538959x.countDown();
    }

    public static final void m(xv2.j jVar, int i17, r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        jVar.getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf1.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf1.m76732xf0dfd739((int) (c01.id.c() - jVar.f538951p));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1();
            c19791x8d6e6bf12.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf12.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf12.m76732xf0dfd739((int) (c01.id.c() - jVar.f538951p));
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf13 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf13 != null) {
            c19791x8d6e6bf13.m76731x604bb642(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = jVar.f538946h;
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
        boolean m59314x4d5c4d55 = this.f538946h.m59314x4d5c4d55();
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
        boolean m59314x4d5c4d55 = this.f538946h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 22L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 22L, 1L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0461 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0491 A[SYNTHETIC] */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xv2.j.j():pv2.g");
    }

    public final java.lang.String n(java.lang.String str) {
        return "upload_" + str;
    }

    public final java.lang.String o(java.lang.String str) {
        boolean z17 = false;
        if (str != null && r26.i0.y(str, "upload_", false)) {
            z17 = true;
        }
        if (!z17) {
            return str == null ? "" : str;
        }
        java.lang.String substring = str.substring(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public final void p(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f538946h;
        r45.qb4 qb4Var = this.f538948m;
        try {
            if (z17) {
                qb4Var.set(2, 1);
            } else {
                qb4Var.set(2, 2);
            }
            qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - this.f538951p));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qb4Var);
            c14994x9b99c079.m59408xa3acbff0(qb4Var);
            long m75942xfb822ef2 = qb4Var.m75942xfb822ef2(9);
            boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u4.f206917a;
            u4Var.d(1253L, 9L, 1L, m59314x4d5c4d55);
            u4Var.d(1253L, 10L, m75942xfb822ef2, m59314x4d5c4d55);
            cu2.u.f303974a.l(c14994x9b99c079);
            ov2.e.i(this, z17 ? "andr_CDN_Upload_Suc" : z18 ? "andr_CDN_Upload_Fail" : "andr_CDN_Upload_Check_Fail", this.f538946h, 0, null, 12, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f538947i, e17, "", new java.lang.Object[0]);
        }
    }

    public final int q(r45.mb4 mb4Var) {
        if (mb4Var.m75939xb282bd08(2) == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16))) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(23));
            java.lang.String str = this.f538947i;
            if (!K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mediaObject svr_coverUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(16))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload failed, coverUrl not exist, " + mb4Var.m75945x2fec8307(16));
                return 5;
            }
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_FinderUploadTask_2";
            mVar.f323320f = this.f538961z;
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var.m75945x2fec8307(16));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            mVar.f69601xaca5bdda = n(a17);
            mVar.f69595x6d25b0d9 = mb4Var.m75945x2fec8307(16);
            mVar.f69619xe9ed65f6 = mb4Var.m75945x2fec8307(16);
            mVar.f69618x114ef53e = "";
            mVar.f69606xccdbf540 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload cover file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(16)));
            mVar.f69592xf1ebe47b = 20304;
            mVar.f69580x454032b6 = 251;
            mVar.f69584x89a4c0cf = 2;
            mVar.A = 120;
            mVar.B = 300;
            mVar.f69609xd84b8349 = 2;
            this.f538950o.add(mVar.f69601xaca5bdda);
            java.util.Map map = this.f538949n;
            java.lang.String field_mediaId = mVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f538956u).add(mVar);
        }
        return 0;
    }

    public final int r(r45.mb4 mb4Var) {
        if (mb4Var.m75939xb282bd08(2) == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(41))) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(40));
            java.lang.String str = this.f538947i;
            if (!K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mediaObject svr_fullCoverUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(41))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload failed, fullCoverUrl not exist, " + mb4Var.m75945x2fec8307(41));
                return 0;
            }
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_FinderUploadTask_2";
            mVar.f323320f = this.f538961z;
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var.m75945x2fec8307(41));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            mVar.f69601xaca5bdda = n(a17);
            mVar.f69595x6d25b0d9 = mb4Var.m75945x2fec8307(41);
            mVar.f69619xe9ed65f6 = mb4Var.m75945x2fec8307(41);
            mVar.f69618x114ef53e = "";
            mVar.f69606xccdbf540 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload fullCover file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(41)));
            mVar.f69592xf1ebe47b = 20304;
            mVar.f69580x454032b6 = 251;
            mVar.f69584x89a4c0cf = 2;
            mVar.A = 120;
            mVar.B = 300;
            mVar.f69609xd84b8349 = 2;
            this.f538950o.add(mVar.f69601xaca5bdda);
            java.util.Map map = this.f538949n;
            java.lang.String field_mediaId = mVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
            ((java.util.ArrayList) this.f538956u).add(mVar);
        }
        return 0;
    }
}
