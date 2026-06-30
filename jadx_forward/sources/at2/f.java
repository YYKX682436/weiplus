package at2;

/* loaded from: classes3.dex */
public final class f implements vp.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xs2.q0 f95187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ at2.i f95188b;

    public f(xs2.q0 q0Var, at2.i iVar) {
        this.f95187a = q0Var;
        this.f95188b = iVar;
    }

    @Override // vp.w
    public void a(boolean z17) {
    }

    @Override // vp.w
    public void b(wp.a danmaku, zp.m touchPoint, zp.d clickResult) {
        android.view.View f206442h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchPoint, "touchPoint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickResult, "clickResult");
        float f17 = touchPoint.f556458d + (danmaku.f529883u / 2.0f);
        float f18 = touchPoint.f556459e + danmaku.f529884v;
        if (f17 <= 0.0f || f18 <= 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f95187a.f537904k, "danmakuClick: error xOffset=" + f17 + ", yOffset=" + f18);
            return;
        }
        at2.i iVar = this.f95188b;
        long j17 = this.f95187a.f537851e;
        iVar.getClass();
        wp.i iVar2 = danmaku instanceof wp.i ? (wp.i) danmaku : null;
        if (iVar2 != null) {
            yp.o oVar = iVar2.H;
            xs2.z0 z0Var = oVar instanceof xs2.z0 ? (xs2.z0) oVar : null;
            if (z0Var != null) {
                java.lang.Object obj = ((wp.i) danmaku).f529887y;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveMsgProxy");
                r45.z12 z12Var = (r45.z12) obj;
                java.lang.String str = iVar.f95216p;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("danmakuClick: xOffset=");
                sb6.append(f17);
                sb6.append(", yOffset=");
                sb6.append(f18);
                sb6.append(", info=[time:");
                r45.t12 t12Var = (r45.t12) z12Var.m75936x14adae67(0);
                sb6.append(t12Var != null ? java.lang.Integer.valueOf(t12Var.m75939xb282bd08(17)) : null);
                sb6.append(",nickname:");
                r45.t12 t12Var2 = (r45.t12) z12Var.m75936x14adae67(0);
                sb6.append(t12Var2 != null ? t12Var2.m75945x2fec8307(0) : null);
                sb6.append(",content:");
                r45.t12 t12Var3 = (r45.t12) z12Var.m75936x14adae67(0);
                sb6.append(t12Var3 != null ? t12Var3.m75945x2fec8307(2) : null);
                sb6.append("}]");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                r45.t12 t12Var4 = (r45.t12) z12Var.m75936x14adae67(0);
                if (t12Var4 != null) {
                    t12Var4.m75945x2fec8307(6);
                }
                z0Var.f537930d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a1l);
                danmaku.f529886x = true;
                xs2.o oVar2 = iVar.f95219s;
                if (oVar2 != null) {
                    vp.x i17 = ((xs2.q0) oVar2).i();
                    i17.f(true);
                    i17.f520385d.mo172410x31e85dfb();
                    at2.y1 y1Var = (at2.y1) iVar.X0(at2.y1.class);
                    if (y1Var != null) {
                        y1Var.f95315r.performClick();
                    }
                }
                xs2.p pVar = iVar.f95217q;
                if (pVar == null || (f206442h = pVar.getF206442h()) == null) {
                    return;
                }
                android.content.Context context = f206442h.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                gk2.e buContext = iVar.S0();
                at2.g gVar = new at2.g(z0Var, z12Var, danmaku, iVar);
                at2.h hVar = new at2.h(iVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
                f206442h.getLocationInWindow(new int[2]);
                int i18 = (int) (r0[0] + f17);
                int i19 = (int) (r0[1] + f18);
                xs2.t0 t0Var = new xs2.t0(z12Var, hVar, buContext, context);
                xs2.v0 v0Var = new xs2.v0(gVar);
                if (i18 <= 0 || i19 <= 0) {
                    return;
                }
                rl5.r rVar = xs2.w0.f537925a;
                if (rVar != null) {
                    rVar.a();
                }
                rl5.r rVar2 = new rl5.r(f206442h.getContext());
                rVar2.C = true;
                rVar2.V = true;
                rVar2.L = v0Var;
                rVar2.Y = xs2.u0.f537922a;
                xs2.w0.f537925a = rVar2;
                rVar2.f478887x = t0Var;
                rVar2.f478871f = f206442h;
                if (!(f206442h instanceof android.widget.TextView) && (i18 == 0 || i19 == 0)) {
                    rVar2.l();
                }
                rVar2.f478889z.clear();
                rVar2.f478889z.h(1, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573232dy4), com.p314xaae8f345.mm.R.raw.f79891x20253fac, -1);
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
