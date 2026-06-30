package bg2;

/* loaded from: classes3.dex */
public final class s0 implements vp.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f20481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f20482b;

    public s0(bg2.x0 x0Var, in5.s0 s0Var) {
        this.f20481a = x0Var;
        this.f20482b = s0Var;
    }

    @Override // vp.w
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f20481a.f20613e, "[onClickEvent]");
    }

    @Override // vp.w
    public void b(wp.a danmaku, zp.m touchPoint, zp.d dVar) {
        float f17;
        float f18;
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        android.content.Context context;
        zy2.ra Sj;
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        kotlin.jvm.internal.o.g(touchPoint, "touchPoint");
        com.tencent.mars.xlog.Log.i(this.f20481a.f20613e, "[onClickEvent]");
        in5.s0 s0Var = this.f20481a.f417141d.f417149i;
        r45.qt2 V6 = (s0Var == null || (context = s0Var.f293121e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6();
        bg2.x0 x0Var = this.f20481a;
        tc2.g gVar = x0Var.f417141d;
        in5.s0 s0Var2 = gVar.f417149i;
        so2.j5 j5Var = s0Var2 != null ? (so2.j5) s0Var2.f293125i : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        if (!(V6 == null)) {
            if (!(baseFinderFeed == null)) {
                com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
                ml2.t1 t1Var = ml2.t1.f327963l3;
                jz5.l[] lVarArr = new jz5.l[1];
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
                if (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
                    str = "";
                }
                lVarArr[0] = new jz5.l("liveid", str);
                v3Var.d(V6, t1Var, kz5.c1.i(lVarArr));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 123);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                v3Var.a(V6, baseFinderFeed, jSONObject2);
                java.lang.Object obj = danmaku.f448354y;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg");
                dk2.zf zfVar = (dk2.zf) obj;
                f17 = touchPoint.f474925d + (danmaku.f448350u / 2.0f);
                f18 = touchPoint.f474926e + danmaku.f448351v;
                if (f17 > 0.0f || f18 <= 0.0f) {
                    com.tencent.mars.xlog.Log.w(this.f20481a.f20613e, "danmakuClick: error xOffset=" + f17 + ", yOffset=" + f18);
                }
                wp.i iVar = danmaku instanceof wp.i ? (wp.i) danmaku : null;
                if (iVar != null) {
                    bg2.x0 x0Var2 = this.f20481a;
                    in5.s0 s0Var3 = this.f20482b;
                    com.tencent.mars.xlog.Log.i(x0Var2.f20613e, "danmakuClick: xOffset=" + f17 + ", yOffset=" + f18 + ", info=" + zfVar + ", touchPoint=" + touchPoint + '}');
                    yp.o oVar = iVar.H;
                    cg2.a aVar = oVar instanceof cg2.a ? (cg2.a) oVar : null;
                    if (aVar == null) {
                        com.tencent.mars.xlog.Log.w(x0Var2.f20613e, "clicked on invalid danmaku: " + danmaku);
                        return;
                    }
                    aVar.f41068d.setBackgroundResource(com.tencent.mm.R.drawable.d2d);
                    danmaku.f448353x = true;
                    aVar.f41072h.setOnClickListener(new bg2.q0(x0Var2, zfVar, aVar, danmaku));
                    iVar.f448347r = true;
                    cg2.i iVar2 = cg2.i.f41106a;
                    android.content.Context context2 = s0Var3.f293121e;
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    android.view.View view = x0Var2.f20617i;
                    kotlin.jvm.internal.o.d(view);
                    bg2.r0 r0Var = new bg2.r0(aVar, danmaku, iVar, zfVar, x0Var2);
                    cg2.i.f41108c = false;
                    view.getLocationInWindow(new int[2]);
                    int i17 = (int) (r1[0] + f17);
                    int i18 = (int) (r1[1] + f18);
                    cg2.g gVar2 = new cg2.g(zfVar, context2);
                    cg2.e eVar = new cg2.e(x0Var2, zfVar, s0Var3, context2, r0Var);
                    cg2.h hVar = new cg2.h(r0Var);
                    if (i17 > 0 && i18 > 0) {
                        rl5.r rVar = cg2.i.f41107b;
                        if (rVar != null) {
                            rVar.a();
                        }
                        rl5.r rVar2 = new rl5.r(view.getContext());
                        rVar2.C = true;
                        rVar2.V = true;
                        rVar2.L = hVar;
                        rVar2.Y = new cg2.f(rVar2);
                        cg2.i.f41107b = rVar2;
                        rVar2.f(view, gVar2, eVar, i17, i18);
                    }
                    iVar2.b(s0Var3, ml2.u1.f328037c3);
                    iVar2.b(s0Var3, ml2.u1.f328039d3);
                    return;
                }
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report danmaku click fail, ");
        sb6.append(V6 == null);
        sb6.append(", ");
        sb6.append(baseFinderFeed == null);
        com.tencent.mars.xlog.Log.e(x0Var.f20613e, sb6.toString());
        java.lang.Object obj2 = danmaku.f448354y;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg");
        dk2.zf zfVar2 = (dk2.zf) obj2;
        f17 = touchPoint.f474925d + (danmaku.f448350u / 2.0f);
        f18 = touchPoint.f474926e + danmaku.f448351v;
        if (f17 > 0.0f) {
        }
        com.tencent.mars.xlog.Log.w(this.f20481a.f20613e, "danmakuClick: error xOffset=" + f17 + ", yOffset=" + f18);
    }

    @Override // vp.w
    public void c(java.util.List list) {
    }
}
