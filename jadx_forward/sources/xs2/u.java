package xs2;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final xs2.p f537918a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f537919b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f537920c;

    /* renamed from: d, reason: collision with root package name */
    public xs2.o f537921d;

    public u(gk2.e liveBuContext, xs2.p liveDanmakuView, xs2.f0 config, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveBuContext, "liveBuContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveDanmakuView, "liveDanmakuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f537918a = liveDanmakuView;
        this.f537919b = pVar;
        this.f537920c = "LiveDanmakuAdapter";
        android.view.View mo58803xfb86a31b = liveDanmakuView.mo58803xfb86a31b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initManager,manager:");
        sb6.append(this.f537921d);
        sb6.append(",bulletView:");
        sb6.append(mo58803xfb86a31b.hashCode());
        sb6.append(",manager view:");
        xs2.o oVar = this.f537921d;
        android.view.View view = oVar != null ? ((xs2.e) oVar).f537847a : null;
        sb6.append(view != null ? view.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveDanmakuAdapter", sb6.toString());
        xs2.o oVar2 = this.f537921d;
        if (oVar2 != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo58803xfb86a31b, oVar2 != null ? ((xs2.e) oVar2).f537847a : null)) {
                return;
            }
        }
        xs2.i0 i0Var = new xs2.i0(mo58803xfb86a31b, liveBuContext, config);
        i0Var.f537853g = new xs2.r(this);
        this.f537921d = i0Var;
    }

    public final android.view.View a() {
        return this.f537918a.getF206442h();
    }

    public final void b(wp.i viewDanmaku) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewDanmaku, "viewDanmaku");
        xs2.o oVar = this.f537921d;
        if (oVar != null) {
            vp.x i17 = ((xs2.e) oVar).i();
            yp.o oVar2 = viewDanmaku.H;
            if (oVar2 != null) {
                vp.w0 w0Var = i17.f520385d;
                w0Var.N1(viewDanmaku, oVar2);
                w0Var.mo172410x31e85dfb();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f537920c, "notifyItemChange viewDanmaku:" + viewDanmaku.m174283x8cdac1b() + " data:" + viewDanmaku.f529887y + " ,but it's viewHolder is null!");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs2.u.c(java.lang.Object):void");
    }

    public final void d(wp.i viewDanmaku) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewDanmaku, "viewDanmaku");
        xs2.o oVar = this.f537921d;
        if (oVar != null) {
            vp.x i17 = ((xs2.e) oVar).i();
            viewDanmaku.f529886x = true;
            i17.f520385d.mo172410x31e85dfb();
        }
    }

    public final void e(wp.e eVar) {
        vp.x b17;
        zl2.r4.f555483a.M2(this.f537920c, "setMaskBitmap mask:" + eVar);
        xs2.o oVar = this.f537921d;
        if (oVar == null || (b17 = oVar.b()) == null) {
            return;
        }
        b17.f520385d.L4(eVar);
    }
}
