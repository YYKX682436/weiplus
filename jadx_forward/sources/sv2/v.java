package sv2;

/* loaded from: classes10.dex */
public final class v extends ov2.e {
    public final sv2.s A;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494887h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f494888i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f494889m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.qb4 f494890n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f494891o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f494892p;

    /* renamed from: q, reason: collision with root package name */
    public long f494893q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f494894r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f494895s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f494896t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f494897u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f494898v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f494899w;

    /* renamed from: x, reason: collision with root package name */
    public pv2.g f494900x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f494901y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1648xafb425fd.C15156xc7a396ba f494902z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$draftModifyListener$1] */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494887h = draftItem;
        this.f494888i = "LogPost.FinderDraftUploadStage";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 t07 = draftItem.t0();
        this.f494889m = t07;
        this.f494890n = t07.m59277xa8f45ee4();
        this.f494891o = new java.util.LinkedHashMap();
        this.f494892p = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f494895s = new java.util.ArrayList();
        this.f494897u = new java.util.ArrayList();
        this.f494898v = new java.util.ArrayList();
        this.f494900x = new sv2.c(draftItem, 2);
        this.f494901y = new java.util.concurrent.CountDownLatch(1);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f494902z = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$draftModifyListener$1
            {
                this.f39173x3fe91575 = -881666027;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 c5463x73bc5a05) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 event = c5463x73bc5a05;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.za zaVar = event.f135802g;
                if (!(zaVar != null && zaVar.f90082a == 0)) {
                    sv2.v vVar = sv2.v.this;
                    if (zaVar != null && zaVar.f90082a == vVar.f494887h.f66236x88be67a1) {
                        java.lang.String str = vVar.f494888i;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("draftModifyListener cancel localId:");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = vVar.f494887h;
                        sb6.append(x80Var.f66236x88be67a1);
                        sb6.append(", ");
                        sb6.append(x80Var.f66238x2327e25f);
                        sb6.append(" modifyType:");
                        sb6.append(zaVar != null ? java.lang.Integer.valueOf(zaVar.f90083b) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                        vVar.f494894r = true;
                        pm0.v.K(null, new sv2.t(vVar));
                        sv2.v.l(vVar, new sv2.c(x80Var, 3));
                    }
                }
                return false;
            }
        };
        this.A = new sv2.s(this);
    }

    public static final java.lang.String k(sv2.v vVar, java.lang.String str) {
        vVar.getClass();
        boolean z17 = false;
        if (str != null && r26.i0.y(str, "uploaddraft_", false)) {
            z17 = true;
        }
        if (z17) {
            java.lang.String substring = str.substring(12);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            return substring;
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    public static final void l(sv2.v vVar, pv2.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, "");
        vVar.f494902z.mo48814x2efc64();
        vVar.f494900x = gVar;
        vVar.f494901y.countDown();
    }

    public static final void m(sv2.v vVar, int i17, r45.mb4 mb4Var) {
        vVar.p(mb4Var);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76731x604bb642(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = vVar.f494889m;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76430xd706ad49(c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(1));
            c19783xd9a946b7.m76358x25b46b5d(c01.id.c());
            if (i17 == 0) {
                c19783xd9a946b7.m76296x7efe73ec().add((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69));
            }
        }
    }

    public static /* synthetic */ void o(sv2.v vVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, yz5.l lVar, int i27, java.lang.Object obj) {
        vVar.n(str, str2, str3, i17, i18, i19, (i27 & 64) != 0 ? null : str4, (i27 & 128) != 0 ? null : lVar);
    }

    public static void q(sv2.v vVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? false : z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = vVar.f494889m;
        r45.qb4 qb4Var = vVar.f494890n;
        if (!z17) {
            try {
                qb4Var.set(2, 2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f494888i, e17, "", new java.lang.Object[0]);
                return;
            }
        }
        qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - vVar.f494893q));
        c14994x9b99c079.m59408xa3acbff0(qb4Var);
        long m75942xfb822ef2 = qb4Var.m75942xfb822ef2(9);
        boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0 f0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0.f206548a;
        f0Var.d(1718L, 9L, 1L, m59314x4d5c4d55);
        f0Var.d(1718L, 10L, m75942xfb822ef2, m59314x4d5c4d55);
        cu2.o.f303963a.b(vVar.f494887h);
        ov2.e.i(vVar, z17 ? "andr_CDN_Upload_Suc" : z19 ? "andr_CDN_Upload_Fail" : "andr_CDN_Upload_Check_Fail", vVar.f494889m, 0, null, 12, null);
    }

    @Override // pv2.g
    public int a() {
        return 3;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f494889m.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 22L, 1L);
        if (m59314x4d5c4d55) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 22L, 1L);
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
        boolean m59314x4d5c4d55 = this.f494889m.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 22L, 1L);
        if (m59314x4d5c4d55) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 22L, 1L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0422 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x051e A[LOOP:1: B:156:0x0518->B:158:0x051e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0437  */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.v.j():pv2.g");
    }

    public final void n(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, yz5.l lVar) {
        tv2.r rVar = tv2.v.f503863z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f494889m;
        sv2.s sVar = this.A;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str2.getBytes());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
        dn.m a17 = rVar.a(c14994x9b99c079, sVar, str, "uploaddraft_".concat(b17), str2, str3, i17, i18, i19, str4, lVar);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f494892p;
        concurrentLinkedQueue.add(a17.f69601xaca5bdda);
        java.util.Map map = this.f494891o;
        java.lang.String field_mediaId = a17.f69601xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
        map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
        java.lang.String str5 = "[addCdnTaskInfo] before cancel " + a17.f69601xaca5bdda + " size:" + concurrentLinkedQueue.size() + " appType:" + a17.f69580x454032b6 + " fileType:" + a17.f69592xf1ebe47b;
        java.lang.String str6 = this.f494888i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str6, str5);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(a17.f69601xaca5bdda);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str6, "[addCdnTaskInfo] after cancel " + a17.f69601xaca5bdda + " size:" + concurrentLinkedQueue.size() + " appType:" + a17.f69580x454032b6 + " fileType:" + a17.f69592xf1ebe47b);
        ((java.util.ArrayList) this.f494898v).add(a17);
    }

    public final void p(r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf1.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf1.m76732xf0dfd739((int) (c01.id.c() - this.f494893q));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1();
            c19791x8d6e6bf12.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf12.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf12.m76732xf0dfd739((int) (c01.id.c() - this.f494893q));
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

    public final int r(r45.mb4 mb4Var) {
        if (mb4Var.m75939xb282bd08(2) == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16))) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(23));
            java.lang.String str = this.f494888i;
            if (!K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mediaObject svr_coverUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(16))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload failed, coverUrl not exist, " + mb4Var.m75945x2fec8307(16));
                return 5;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload cover file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(16)));
            o(this, "task_FinderUploadTask_2", mb4Var.m75945x2fec8307(16), mb4Var.m75945x2fec8307(16), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int s(r45.mb4 mb4Var) {
        if (mb4Var.m75939xb282bd08(2) == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(41))) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(40));
            java.lang.String str = this.f494888i;
            if (!K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mediaObject svr_fullCoverUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(41))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload failed, fullCoverUrl not exist, " + mb4Var.m75945x2fec8307(41));
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload fullCover file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(41)));
            o(this, "task_FinderUploadTask_2", mb4Var.m75945x2fec8307(41), mb4Var.m75945x2fec8307(41), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int t(r45.mb4 mb4Var) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(25))) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(27));
            java.lang.String str = this.f494888i;
            if (!K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mediaObject svr_fullThumbUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(25))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload failed, fullThumbUrl not exist, " + mb4Var.m75945x2fec8307(25));
                return 6;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload fullthumb file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(25)));
            o(this, "task_FinderUploadTask_2", mb4Var.m75945x2fec8307(25), mb4Var.m75945x2fec8307(25), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int u(r45.mb4 mb4Var) {
        if (mb4Var.m75939xb282bd08(2) == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(62))) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(65));
            java.lang.String str = this.f494888i;
            if (!K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mediaObject svr_shareCoverUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(62))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload failed, shareCoverUrl not exist, " + mb4Var.m75945x2fec8307(62));
                return 7;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "upload shareCoverUrl file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(62)));
            o(this, "task_FinderUploadTask_2", mb4Var.m75945x2fec8307(62), mb4Var.m75945x2fec8307(62), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }
}
