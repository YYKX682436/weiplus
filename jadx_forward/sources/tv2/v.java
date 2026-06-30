package tv2;

/* loaded from: classes10.dex */
public final class v extends ov2.e {

    /* renamed from: z, reason: collision with root package name */
    public static final tv2.r f503863z = new tv2.r(null);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f503864h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qb4 f503865i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f503866m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f503867n;

    /* renamed from: o, reason: collision with root package name */
    public long f503868o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f503869p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f503870q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f503871r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f503872s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f503873t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f503874u;

    /* renamed from: v, reason: collision with root package name */
    public pv2.g f503875v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f503876w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1649x76847298.C15162xfb165b37 f503877x;

    /* renamed from: y, reason: collision with root package name */
    public final tv2.s f503878y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$feedDeleteListener$1] */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f503864h = finderObj;
        this.f503865i = finderObj.f66945x4aebb6f3;
        this.f503866m = new java.util.LinkedHashMap();
        this.f503867n = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f503870q = new java.util.ArrayList();
        this.f503872s = new java.util.ArrayList();
        this.f503873t = new java.util.ArrayList();
        this.f503875v = new tv2.x(finderObj, 2);
        this.f503876w = new java.util.concurrent.CountDownLatch(1);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f503877x = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$feedDeleteListener$1
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
                tv2.v vVar = tv2.v.this;
                if (j17 != vVar.f503864h.m59260x51f8f5b0()) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "feedDeleteListener localId:" + daVar.f87971b);
                cu2.t tVar = cu2.u.f303974a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = vVar.f503864h;
                if (tVar.k(c14994x9b99c079.m59260x51f8f5b0())) {
                    return false;
                }
                vVar.f503869p = true;
                vVar.s(100);
                pm0.v.K(null, new tv2.t(vVar));
                tv2.v.l(vVar, new tv2.x(c14994x9b99c079, 1));
                return false;
            }
        };
        this.f503878y = new tv2.s(this);
    }

    public static final boolean k(tv2.v vVar, java.lang.String str) {
        java.util.LinkedList linkedList;
        r45.q23 m76980xaa7f977e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = vVar.f503864h.getFeedObject().m76802x2dd01666();
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
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a((java.lang.String) next), vVar.q(str))) {
                obj = next;
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        if (str2 == null) {
            return false;
        }
        linkedList.set(linkedList.indexOf(str2), "");
        vVar.f503867n.remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "handleTemplateScyThumb upload fail target:" + str2 + " to mediaId:" + str);
        return true;
    }

    public static final void l(tv2.v vVar, pv2.g gVar) {
        vVar.f503877x.mo48814x2efc64();
        vVar.f503875v = gVar;
        vVar.f503876w.countDown();
    }

    public static final void m(tv2.v vVar, int i17, r45.mb4 mb4Var) {
        vVar.p(mb4Var);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76731x604bb642(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = vVar.f503864h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76430xd706ad49(c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(1));
            c19783xd9a946b7.m76358x25b46b5d(c01.id.c());
            if (i17 == 0) {
                c19783xd9a946b7.m76296x7efe73ec().add((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69));
            }
        }
    }

    public static /* synthetic */ void o(tv2.v vVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, yz5.l lVar, int i27, java.lang.Object obj) {
        vVar.n(str, str2, str3, i17, i18, i19, (i27 & 64) != 0 ? null : str4, (i27 & 128) != 0 ? null : lVar);
    }

    @Override // pv2.g
    public int a() {
        return 3;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f503864h.m59314x4d5c4d55();
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
        boolean m59314x4d5c4d55 = this.f503864h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 22L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 22L, 1L);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:16|(1:18)|19|(1:21)|22|(1:238)(1:26)|27|(2:29|(28:31|(4:34|(5:40|41|(1:43)|44|45)(3:36|37|38)|39|32)|46|(1:48)|49|50|51|52|(1:233)(1:56)|57|(1:232)(1:63)|64|(1:66)(1:231)|67|(3:69|(1:98)(1:75)|(3:77|(1:97)(1:81)|(2:93|(1:95)(1:96))))|99|(1:101)(1:230)|102|(4:104|(3:107|(3:109|(9:111|(2:136|(1:138)(2:139|(6:141|120|121|122|(1:134)|(3:131|132|133)(2:128|129))(23:142|(1:144)|145|(5:147|(1:149)|150|(1:152)(1:180)|153)(1:181)|154|(1:156)(1:179)|157|(1:159)(1:178)|160|(1:162)(1:177)|163|(1:165)(1:176)|166|(1:168)(1:175)|169|(7:(1:174)|172|121|122|(1:124)|134|(0)(0))|171|172|121|122|(0)|134|(0)(0))))(3:115|(1:(1:118))|135)|119|120|121|122|(0)|134|(0)(0))(2:182|(2:189|190)(1:191))|130)(3:194|195|196)|105)|197|198)(3:219|(2:221|(2:223|224)(2:225|(2:227|228)))|229)|199|(2:202|200)|203|204|(1:206)|207|(1:209)|210|(2:212|213)(4:214|(1:216)|217|218)))|237|(0)|49|50|51|52|(1:54)|233|57|(1:59)|232|64|(0)(0)|67|(0)|99|(0)(0)|102|(0)(0)|199|(1:200)|203|204|(0)|207|(0)|210|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x014b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x014c, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LogPost.FinderUploadStage", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0664 A[LOOP:2: B:200:0x065e->B:202:0x0664, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [int] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [int] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv2.v.j():pv2.g");
    }

    public final void n(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, yz5.l lVar) {
        tv2.r rVar = f503863z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f503864h;
        tv2.s sVar = this.f503878y;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str2.getBytes());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
        uv2.i iVar = uv2.i.f512922a;
        dn.m a17 = rVar.a(c14994x9b99c079, sVar, str, "upload_".concat(b17), str2, str3, i17, i18, i19, str4, lVar);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f503867n;
        concurrentLinkedQueue.add(a17.f69601xaca5bdda);
        java.util.Map map = this.f503866m;
        java.lang.String field_mediaId = a17.f69601xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
        map.put(field_mediaId, java.lang.Float.valueOf(0.0f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "[addCdnTaskInfo] before cancel " + a17.f69601xaca5bdda + " size:" + concurrentLinkedQueue.size() + " appType:" + a17.f69580x454032b6 + " fileType:" + a17.f69592xf1ebe47b);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(a17.f69601xaca5bdda);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "[addCdnTaskInfo] after cancel " + a17.f69601xaca5bdda + " size:" + concurrentLinkedQueue.size() + " appType:" + a17.f69580x454032b6 + " fileType:" + a17.f69592xf1ebe47b);
        ((java.util.ArrayList) this.f503873t).add(a17);
    }

    public final void p(r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf1.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf1.m76732xf0dfd739((int) (c01.id.c() - this.f503868o));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1();
            c19791x8d6e6bf12.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf12.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf12.m76732xf0dfd739((int) (c01.id.c() - this.f503868o));
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

    public final java.lang.String q(java.lang.String str) {
        return uv2.i.f512922a.j(str);
    }

    public final void r(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem = this.f503864h;
        r45.qb4 qb4Var = this.f503865i;
        try {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.v(p2Var, finderItem, "CDNUpload", null, null, 0, 0L, 60, null);
                qb4Var.set(2, 1);
            } else {
                qb4Var.set(2, 2);
            }
            qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - this.f503868o));
            finderItem.m59408xa3acbff0(qb4Var);
            long m75942xfb822ef2 = qb4Var.m75942xfb822ef2(9);
            boolean m59314x4d5c4d55 = finderItem.m59314x4d5c4d55();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u4.f206917a;
            u4Var.d(1253L, 9L, 1L, m59314x4d5c4d55);
            u4Var.d(1253L, 10L, m75942xfb822ef2, m59314x4d5c4d55);
            cu2.u.f303974a.l(finderItem);
            ov2.e.i(this, z17 ? "andr_CDN_Upload_Suc" : z18 ? "andr_CDN_Upload_Fail" : "andr_CDN_Upload_Check_Fail", this.f503864h, 0, null, 12, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LogPost.FinderUploadStage", e17, "", new java.lang.Object[0]);
        }
    }

    public final void s(int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = this.f503864h.f66946x284ddcb8;
        if (c19783xd9a946b7 == null) {
            return;
        }
        c19783xd9a946b7.m76447x75f6f6ad(i17);
    }

    public final int t(r45.mb4 mb4Var) {
        if (mb4Var.m75939xb282bd08(2) == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16))) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(23))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "mediaObject svr_coverUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(16))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "upload failed, coverUrl not exist, " + mb4Var.m75945x2fec8307(16));
                return 5;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "upload cover file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(16)));
            o(this, "task_FinderUploadTask_2", mb4Var.m75945x2fec8307(16), mb4Var.m75945x2fec8307(16), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int u(r45.mb4 mb4Var) {
        if (mb4Var.m75939xb282bd08(2) == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(41))) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(40))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "mediaObject svr_fullCoverUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(41))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "upload failed, fullCoverUrl not exist, " + mb4Var.m75945x2fec8307(41));
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "upload fullCover file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(41)));
            o(this, "task_FinderUploadTask_2", mb4Var.m75945x2fec8307(41), mb4Var.m75945x2fec8307(41), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int v(r45.mb4 mb4Var) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(25))) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(27))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "mediaObject svr_fullThumbUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(25))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "upload failed, fullThumbUrl not exist, " + mb4Var.m75945x2fec8307(25));
                return 6;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "upload fullthumb file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(25)));
            o(this, "task_FinderUploadTask_2", mb4Var.m75945x2fec8307(25), mb4Var.m75945x2fec8307(25), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }

    public final int w(r45.mb4 mb4Var) {
        if (mb4Var.m75939xb282bd08(2) == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(62))) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(65))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "mediaObject svr_shareCoverUrl exist");
                return 0;
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(62))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "upload failed, shareCoverUrl not exist, " + mb4Var.m75945x2fec8307(62));
                return 7;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderUploadStage", "upload shareCover file length " + com.p314xaae8f345.mm.vfs.w6.k(mb4Var.m75945x2fec8307(62)));
            o(this, "task_FinderUploadTask_2", mb4Var.m75945x2fec8307(62), mb4Var.m75945x2fec8307(62), 20304, 120, 300, null, null, 192, null);
        }
        return 0;
    }
}
