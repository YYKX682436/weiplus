package at2;

/* loaded from: classes3.dex */
public final class f implements vp.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xs2.q0 f13654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ at2.i f13655b;

    public f(xs2.q0 q0Var, at2.i iVar) {
        this.f13654a = q0Var;
        this.f13655b = iVar;
    }

    @Override // vp.w
    public void a(boolean z17) {
    }

    @Override // vp.w
    public void b(wp.a danmaku, zp.m touchPoint, zp.d clickResult) {
        android.view.View f124909h;
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        kotlin.jvm.internal.o.g(touchPoint, "touchPoint");
        kotlin.jvm.internal.o.g(clickResult, "clickResult");
        float f17 = touchPoint.f474925d + (danmaku.f448350u / 2.0f);
        float f18 = touchPoint.f474926e + danmaku.f448351v;
        if (f17 <= 0.0f || f18 <= 0.0f) {
            com.tencent.mars.xlog.Log.w(this.f13654a.f456371k, "danmakuClick: error xOffset=" + f17 + ", yOffset=" + f18);
            return;
        }
        at2.i iVar = this.f13655b;
        long j17 = this.f13654a.f456318e;
        iVar.getClass();
        wp.i iVar2 = danmaku instanceof wp.i ? (wp.i) danmaku : null;
        if (iVar2 != null) {
            yp.o oVar = iVar2.H;
            xs2.z0 z0Var = oVar instanceof xs2.z0 ? (xs2.z0) oVar : null;
            if (z0Var != null) {
                java.lang.Object obj = ((wp.i) danmaku).f448354y;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveMsgProxy");
                r45.z12 z12Var = (r45.z12) obj;
                java.lang.String str = iVar.f13683p;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("danmakuClick: xOffset=");
                sb6.append(f17);
                sb6.append(", yOffset=");
                sb6.append(f18);
                sb6.append(", info=[time:");
                r45.t12 t12Var = (r45.t12) z12Var.getCustom(0);
                sb6.append(t12Var != null ? java.lang.Integer.valueOf(t12Var.getInteger(17)) : null);
                sb6.append(",nickname:");
                r45.t12 t12Var2 = (r45.t12) z12Var.getCustom(0);
                sb6.append(t12Var2 != null ? t12Var2.getString(0) : null);
                sb6.append(",content:");
                r45.t12 t12Var3 = (r45.t12) z12Var.getCustom(0);
                sb6.append(t12Var3 != null ? t12Var3.getString(2) : null);
                sb6.append("}]");
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                r45.t12 t12Var4 = (r45.t12) z12Var.getCustom(0);
                if (t12Var4 != null) {
                    t12Var4.getString(6);
                }
                z0Var.f456397d.setBackgroundResource(com.tencent.mm.R.drawable.a1l);
                danmaku.f448353x = true;
                xs2.o oVar2 = iVar.f13686s;
                if (oVar2 != null) {
                    vp.x i17 = ((xs2.q0) oVar2).i();
                    i17.f(true);
                    i17.f438852d.postInvalidate();
                    at2.y1 y1Var = (at2.y1) iVar.X0(at2.y1.class);
                    if (y1Var != null) {
                        y1Var.f13782r.performClick();
                    }
                }
                xs2.p pVar = iVar.f13684q;
                if (pVar == null || (f124909h = pVar.getF124909h()) == null) {
                    return;
                }
                android.content.Context context = f124909h.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                gk2.e buContext = iVar.S0();
                at2.g gVar = new at2.g(z0Var, z12Var, danmaku, iVar);
                at2.h hVar = new at2.h(iVar);
                kotlin.jvm.internal.o.g(buContext, "buContext");
                f124909h.getLocationInWindow(new int[2]);
                int i18 = (int) (r0[0] + f17);
                int i19 = (int) (r0[1] + f18);
                xs2.t0 t0Var = new xs2.t0(z12Var, hVar, buContext, context);
                xs2.v0 v0Var = new xs2.v0(gVar);
                if (i18 <= 0 || i19 <= 0) {
                    return;
                }
                rl5.r rVar = xs2.w0.f456392a;
                if (rVar != null) {
                    rVar.a();
                }
                rl5.r rVar2 = new rl5.r(f124909h.getContext());
                rVar2.C = true;
                rVar2.V = true;
                rVar2.L = v0Var;
                rVar2.Y = xs2.u0.f456389a;
                xs2.w0.f456392a = rVar2;
                rVar2.f397354x = t0Var;
                rVar2.f397338f = f124909h;
                if (!(f124909h instanceof android.widget.TextView) && (i18 == 0 || i19 == 0)) {
                    rVar2.l();
                }
                rVar2.f397356z.clear();
                rVar2.f397356z.h(1, context.getResources().getString(com.tencent.mm.R.string.f491699dy4), com.tencent.mm.R.raw.icons_filled_report_problem, -1);
                if (i18 == 0 && i19 == 0) {
                    rVar2.m();
                } else {
                    rVar2.n(i18, i19);
                }
            }
        }
    }

    @Override // vp.w
    public void c(java.util.List list) {
    }
}
