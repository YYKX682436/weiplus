package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103037d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f103038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f103039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103041h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f103042i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.pl2 f103043m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103044n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(java.util.List list, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.MMActivity mMActivity, r45.pl2 pl2Var, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103039f = list;
        this.f103040g = i17;
        this.f103041h = baseFinderFeed;
        this.f103042i = mMActivity;
        this.f103043m = pl2Var;
        this.f103044n = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.convert.cc ccVar = new com.tencent.mm.plugin.finder.convert.cc(this.f103039f, this.f103040g, this.f103041h, this.f103042i, this.f103043m, this.f103044n, continuation);
        ccVar.f103038e = obj;
        return ccVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.cc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        java.lang.Object a17;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.LinkedList list;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f103037d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103041h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f103038e;
            r45.fr0 sk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).sk();
            i95.m c17 = i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            az2.j Xh = c61.zb.Xh((c61.zb) c17, this.f103039f, 0, 0, this.f103040g, null, null, null, null, 0, baseFinderFeed.getProductExtra(), sk6, new java.lang.Integer(com.tencent.mm.plugin.finder.assist.n3.f102399a.b(sk6, 1.0E-5f, new java.lang.Integer(68109), 0)), "Finder.FeedFullConvert_openProductIfNeeded", ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(this.f103042i), null, this.f103043m, null, 82422, null);
            this.f103038e = y0Var;
            this.f103037d = 1;
            a17 = rm0.h.a(Xh, 0L, null, this, 3, null);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f103038e;
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = y0Var2;
            a17 = obj;
        }
        r45.ov0 ov0Var = (r45.ov0) a17;
        if (kotlinx.coroutines.z0.h(y0Var)) {
            java.util.LinkedList list2 = ov0Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getObject_async_info_map(...)");
            java.util.Iterator it = list2.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (((r45.dl2) obj3).getLong(0) == baseFinderFeed.getItemId()) {
                    break;
                }
            }
            r45.dl2 dl2Var = (r45.dl2) obj3;
            if (dl2Var != null && (list = dl2Var.getList(11)) != null) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (((com.tencent.mm.protocal.protobuf.FinderJumpInfo) next).getBusiness_type() == 1) {
                        obj2 = next;
                        break;
                    }
                }
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj2;
                if (finderJumpInfo != null) {
                    try {
                        java.lang.String ext_info = finderJumpInfo.getExt_info();
                        if (ext_info == null) {
                            ext_info = "";
                        }
                        j17 = new org.json.JSONObject(ext_info).optLong("product_id", -1L);
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "parse ext_info failed");
                        j17 = -1;
                    }
                    if (j17 != baseFinderFeed.getAutoShowProductId()) {
                        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "get productId " + j17 + " does not match " + baseFinderFeed.getAutoShowProductId());
                    } else {
                        baseFinderFeed.W0(-1L);
                        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                        p0Var.f453244f = baseFinderFeed;
                        xc2.y2 y2Var = xc2.y2.f453343a;
                        in5.s0 s0Var = this.f103044n;
                        android.content.Context context = s0Var.f293121e;
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        xc2.y2.W(y2Var, context, p0Var, s0Var, 0, true, false, 8, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
