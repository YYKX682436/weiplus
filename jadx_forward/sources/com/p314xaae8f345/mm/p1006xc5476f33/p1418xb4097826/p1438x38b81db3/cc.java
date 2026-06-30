package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class cc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f184570d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f184571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f184572f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f184573g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f184574h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f184575i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.pl2 f184576m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184577n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(java.util.List list, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, r45.pl2 pl2Var, in5.s0 s0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f184572f = list;
        this.f184573g = i17;
        this.f184574h = abstractC14490x69736cb5;
        this.f184575i = abstractActivityC21394xb3d2c0cf;
        this.f184576m = pl2Var;
        this.f184577n = s0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cc ccVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cc(this.f184572f, this.f184573g, this.f184574h, this.f184575i, this.f184576m, this.f184577n, interfaceC29045xdcb5ca57);
        ccVar.f184571e = obj;
        return ccVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.lang.Object a17;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.LinkedList m75941xfb821914;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f184570d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f184574h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f184571e;
            r45.fr0 sk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).sk();
            i95.m c17 = i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            az2.j Xh = c61.zb.Xh((c61.zb) c17, this.f184572f, 0, 0, this.f184573g, null, null, null, null, 0, abstractC14490x69736cb5.getProductExtra(), sk6, new java.lang.Integer(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3.f183932a.b(sk6, 1.0E-5f, new java.lang.Integer(68109), 0)), "Finder.FeedFullConvert_openProductIfNeeded", ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(this.f184575i), null, this.f184576m, null, 82422, null);
            this.f184571e = y0Var;
            this.f184570d = 1;
            a17 = rm0.h.a(Xh, 0L, null, this, 3, null);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f184571e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = y0Var2;
            a17 = obj;
        }
        r45.ov0 ov0Var = (r45.ov0) a17;
        if (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            java.util.LinkedList m75941xfb8219142 = ov0Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject_async_info_map(...)");
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (((r45.dl2) obj3).m75942xfb822ef2(0) == abstractC14490x69736cb5.mo2128x1ed62e84()) {
                    break;
                }
            }
            r45.dl2 dl2Var = (r45.dl2) obj3;
            if (dl2Var != null && (m75941xfb821914 = dl2Var.m75941xfb821914(11)) != null) {
                java.util.Iterator it6 = m75941xfb821914.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) next).m76480xe2ee1ca3() == 1) {
                        obj2 = next;
                        break;
                    }
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) obj2;
                if (c19786x6a1e2862 != null) {
                    try {
                        java.lang.String m76489xefafd82 = c19786x6a1e2862.m76489xefafd82();
                        if (m76489xefafd82 == null) {
                            m76489xefafd82 = "";
                        }
                        j17 = new org.json.JSONObject(m76489xefafd82).optLong("product_id", -1L);
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "parse ext_info failed");
                        j17 = -1;
                    }
                    if (j17 != abstractC14490x69736cb5.getAutoShowProductId()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "get productId " + j17 + " does not match " + abstractC14490x69736cb5.getAutoShowProductId());
                    } else {
                        abstractC14490x69736cb5.W0(-1L);
                        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                        p0Var.f534777f = abstractC14490x69736cb5;
                        xc2.y2 y2Var = xc2.y2.f534876a;
                        in5.s0 s0Var = this.f184577n;
                        android.content.Context context = s0Var.f374654e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        xc2.y2.W(y2Var, context, p0Var, s0Var, 0, true, false, 8, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
