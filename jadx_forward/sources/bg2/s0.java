package bg2;

/* loaded from: classes3.dex */
public final class s0 implements vp.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f102014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102015b;

    public s0(bg2.x0 x0Var, in5.s0 s0Var) {
        this.f102014a = x0Var;
        this.f102015b = s0Var;
    }

    @Override // vp.w
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102014a.f102146e, "[onClickEvent]");
    }

    @Override // vp.w
    public void b(wp.a danmaku, zp.m touchPoint, zp.d dVar) {
        float f17;
        float f18;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        android.content.Context context;
        zy2.ra Sj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchPoint, "touchPoint");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102014a.f102146e, "[onClickEvent]");
        in5.s0 s0Var = this.f102014a.f498674d.f498682i;
        r45.qt2 V6 = (s0Var == null || (context = s0Var.f374654e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6();
        bg2.x0 x0Var = this.f102014a;
        tc2.g gVar = x0Var.f498674d;
        in5.s0 s0Var2 = gVar.f498682i;
        so2.j5 j5Var = s0Var2 != null ? (so2.j5) s0Var2.f374658i : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        if (!(V6 == null)) {
            if (!(abstractC14490x69736cb5 == null)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
                ml2.t1 t1Var = ml2.t1.f409496l3;
                jz5.l[] lVarArr = new jz5.l[1];
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar.f498681h;
                if (abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
                    str = "";
                }
                lVarArr[0] = new jz5.l("liveid", str);
                v3Var.d(V6, t1Var, kz5.c1.i(lVarArr));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 123);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                v3Var.a(V6, abstractC14490x69736cb5, jSONObject2);
                java.lang.Object obj = danmaku.f529887y;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg");
                dk2.zf zfVar = (dk2.zf) obj;
                f17 = touchPoint.f556458d + (danmaku.f529883u / 2.0f);
                f18 = touchPoint.f556459e + danmaku.f529884v;
                if (f17 > 0.0f || f18 <= 0.0f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f102014a.f102146e, "danmakuClick: error xOffset=" + f17 + ", yOffset=" + f18);
                }
                wp.i iVar = danmaku instanceof wp.i ? (wp.i) danmaku : null;
                if (iVar != null) {
                    bg2.x0 x0Var2 = this.f102014a;
                    in5.s0 s0Var3 = this.f102015b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var2.f102146e, "danmakuClick: xOffset=" + f17 + ", yOffset=" + f18 + ", info=" + zfVar + ", touchPoint=" + touchPoint + '}');
                    yp.o oVar = iVar.H;
                    cg2.a aVar = oVar instanceof cg2.a ? (cg2.a) oVar : null;
                    if (aVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(x0Var2.f102146e, "clicked on invalid danmaku: " + danmaku);
                        return;
                    }
                    aVar.f122601d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d2d);
                    danmaku.f529886x = true;
                    aVar.f122605h.setOnClickListener(new bg2.q0(x0Var2, zfVar, aVar, danmaku));
                    iVar.f529880r = true;
                    cg2.i iVar2 = cg2.i.f122639a;
                    android.content.Context context2 = s0Var3.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    android.view.View view = x0Var2.f102150i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                    bg2.r0 r0Var = new bg2.r0(aVar, danmaku, iVar, zfVar, x0Var2);
                    cg2.i.f122641c = false;
                    view.getLocationInWindow(new int[2]);
                    int i17 = (int) (r1[0] + f17);
                    int i18 = (int) (r1[1] + f18);
                    cg2.g gVar2 = new cg2.g(zfVar, context2);
                    cg2.e eVar = new cg2.e(x0Var2, zfVar, s0Var3, context2, r0Var);
                    cg2.h hVar = new cg2.h(r0Var);
                    if (i17 > 0 && i18 > 0) {
                        rl5.r rVar = cg2.i.f122640b;
                        if (rVar != null) {
                            rVar.a();
                        }
                        rl5.r rVar2 = new rl5.r(view.getContext());
                        rVar2.C = true;
                        rVar2.V = true;
                        rVar2.L = hVar;
                        rVar2.Y = new cg2.f(rVar2);
                        cg2.i.f122640b = rVar2;
                        rVar2.f(view, gVar2, eVar, i17, i18);
                    }
                    iVar2.b(s0Var3, ml2.u1.f409570c3);
                    iVar2.b(s0Var3, ml2.u1.f409572d3);
                    return;
                }
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report danmaku click fail, ");
        sb6.append(V6 == null);
        sb6.append(", ");
        sb6.append(abstractC14490x69736cb5 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(x0Var.f102146e, sb6.toString());
        java.lang.Object obj2 = danmaku.f529887y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg");
        dk2.zf zfVar2 = (dk2.zf) obj2;
        f17 = touchPoint.f556458d + (danmaku.f529883u / 2.0f);
        f18 = touchPoint.f556459e + danmaku.f529884v;
        if (f17 > 0.0f) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f102014a.f102146e, "danmakuClick: error xOffset=" + f17 + ", yOffset=" + f18);
    }

    @Override // vp.w
    public void c(java.util.List list) {
    }
}
