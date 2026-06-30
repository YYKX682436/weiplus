package qv2;

/* loaded from: classes10.dex */
public abstract class e extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f448471h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f448472i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.qb4 f448473m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f448474n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f448475o;

    /* renamed from: p, reason: collision with root package name */
    public long f448476p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f448477q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f448478r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f448479s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f448480t;

    /* renamed from: u, reason: collision with root package name */
    public final qv2.c f448481u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj, java.lang.String taskId) {
        super(taskId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        this.f448471h = finderObj;
        this.f448473m = finderObj.f66945x4aebb6f3;
        this.f448474n = new java.util.LinkedHashMap();
        this.f448475o = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f448477q = new java.util.ArrayList();
        this.f448480t = new java.util.concurrent.CountDownLatch(1);
        this.f448481u = new qv2.c(this);
    }

    public static final boolean k(qv2.e eVar, java.lang.String str) {
        java.util.LinkedList linkedList;
        r45.q23 m76980xaa7f977e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = eVar.f448471h.getFeedObject().m76802x2dd01666();
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
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a((java.lang.String) next), eVar.x(str))) {
                obj = next;
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        if (str2 == null) {
            return false;
        }
        linkedList.set(linkedList.indexOf(str2), "");
        eVar.f448475o.remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.s(), "handleTemplateScyThumb upload fail target:" + str2 + " to mediaId:" + str);
        return true;
    }

    public abstract void A(pv2.g gVar);

    public abstract void B();

    public final void C(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem = this.f448471h;
        r45.qb4 qb4Var = this.f448473m;
        try {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.v(p2Var, finderItem, "CDNUpload", null, null, 0, 0L, 60, null);
                qb4Var.set(2, 1);
            } else {
                qb4Var.set(2, 2);
            }
            qb4Var.set(9, java.lang.Long.valueOf(c01.id.a() - this.f448476p));
            finderItem.m59408xa3acbff0(qb4Var);
            p().c().b(qb4Var.m75942xfb822ef2(9), finderItem.m59314x4d5c4d55());
            y();
            ov2.e.i(this, z17 ? "andr_CDN_Upload_Suc" : z18 ? "andr_CDN_Upload_Fail" : "andr_CDN_Upload_Check_Fail", this.f448471h, 0, null, 12, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(s(), e17, "", new java.lang.Object[0]);
        }
    }

    public final void D(int i17, r45.mb4 updateMedia) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateMedia, "updateMedia");
        l(updateMedia);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) updateMedia.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76731x604bb642(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f448471h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76430xd706ad49(c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(1));
            c19783xd9a946b7.m76358x25b46b5d(c01.id.c());
            if (i17 == 0) {
                c19783xd9a946b7.m76296x7efe73ec().add((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) updateMedia.m75936x14adae67(69));
            }
        }
    }

    public void E(java.lang.String str, dn.g gVar) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map map = this.f448474n;
        if (!map.containsKey(str) || gVar == null) {
            return;
        }
        float f17 = (((float) gVar.f69496x83ec3dd) * 1.0f) / ((float) gVar.f69500x8ab84c59);
        s();
        java.lang.Float f18 = (java.lang.Float) ((java.util.LinkedHashMap) map).get(str);
        if (f17 > (f18 != null ? f18.floatValue() : 0.0f)) {
            map.put(str, java.lang.Float.valueOf(f17));
        }
        float H0 = kz5.n0.H0(((java.util.LinkedHashMap) map).values()) / map.size();
        int i17 = ((int) (45 * H0)) + 45;
        java.lang.String s17 = s();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f448471h;
        sb6.append(c14994x9b99c079.m59260x51f8f5b0());
        sb6.append(" updateProgress  ");
        sb6.append(H0);
        sb6.append(", ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s17, sb6.toString());
        if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i17) {
            c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i17));
            y();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
        long m59260x51f8f5b0 = c14994x9b99c079.m59260x51f8f5b0();
        am.ga gaVar = c5442xd807898f.f135783g;
        gaVar.f88282a = m59260x51f8f5b0;
        gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
        c5442xd807898f.e();
    }

    @Override // pv2.g
    public int a() {
        return 3;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        p().a().c(this.f448471h.m59314x4d5c4d55());
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        p().a().c(this.f448471h.m59314x4d5c4d55());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:16|(1:18)|19|(1:21)|22|(4:24|(2:25|(3:27|(2:107|108)(2:31|32)|(1:34)(1:106))(2:109|110))|35|(13:37|38|39|40|41|(2:47|(3:51|(1:53)|(1:55)))|56|(1:58)(1:102)|59|(1:61)(1:101)|62|(1:64)|(4:66|(1:68)|69|70)(6:(3:72|(4:75|(5:77|78|(1:80)|81|(1:87)(3:83|84|85))(1:88)|86|73)|89)|90|(1:92)|93|(1:95)|(2:97|98)(2:99|100))))|111|38|39|40|41|(4:43|45|47|(4:49|51|(0)|(0)))|56|(0)(0)|59|(0)(0)|62|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x013d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x013e, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(s(), r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0228  */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qv2.e.j():pv2.g");
    }

    public final void l(r45.mb4 mb4Var) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
        if (c19791x8d6e6bf1 != null) {
            c19791x8d6e6bf1.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf1.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf1.m76732xf0dfd739((int) (c01.id.c() - this.f448476p));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1();
            c19791x8d6e6bf12.m76736xdb5612fc(mb4Var.m75939xb282bd08(2));
            c19791x8d6e6bf12.m76735xe951995d(mb4Var.m75945x2fec8307(9));
            c19791x8d6e6bf12.m76732xf0dfd739((int) (c01.id.c() - this.f448476p));
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

    public abstract pv2.g m();

    public abstract pv2.g n();

    public abstract com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d o();

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k5 p();

    public abstract pv2.g q();

    public abstract pv2.g r();

    public abstract java.lang.String s();

    public final void t(java.lang.String str, int i17) {
        r45.zi2 zi2Var;
        java.lang.Object obj;
        r45.el2 m76948xfa25bce2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f448471h;
        java.util.Iterator<T> it = c14994x9b99c079.m59264x7efe73ec().iterator();
        while (true) {
            zi2Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) obj).m75945x2fec8307(9), x(str))) {
                    break;
                }
            }
        }
        r45.mb4 mb4Var = (r45.mb4) obj;
        if (mb4Var != null) {
            D(i17, mb4Var);
        }
        C(false, true);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
        if (m76802x2dd01666 != null && (m76948xfa25bce2 = m76802x2dd01666.m76948xfa25bce2()) != null) {
            zi2Var = (r45.zi2) m76948xfa25bce2.m75936x14adae67(0);
        }
        if (zi2Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(zi2Var.m75945x2fec8307(5)), x(str))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1530L, 3L, 1L);
        }
        z(n());
    }

    public final boolean u() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.qo5) this.f448471h.m59277xa8f45ee4().m75936x14adae67(12)) != null ? r0.m75945x2fec8307(2) : null);
    }

    public final void v() {
        this.f448472i = true;
        uv2.i.f512922a.e(this.f448471h.m59264x7efe73ec(), false);
        z(m());
    }

    public void w() {
        ov2.e.i(this, "andr_CDN_Upload_Begin", this.f448471h, 0, null, 12, null);
    }

    public final java.lang.String x(java.lang.String str) {
        return uv2.i.f512922a.j(str);
    }

    public abstract void y();

    public final void z(pv2.g stage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        o().mo48814x2efc64();
        A(stage);
        this.f448480t.countDown();
    }
}
