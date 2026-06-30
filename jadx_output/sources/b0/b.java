package b0;

/* loaded from: classes14.dex */
public final class b implements b0.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final b0.z1 f16208a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.EdgeEffect f16209b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.EdgeEffect f16210c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.EdgeEffect f16211d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.EdgeEffect f16212e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f16213f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.EdgeEffect f16214g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.EdgeEffect f16215h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.EdgeEffect f16216i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.EdgeEffect f16217j;

    /* renamed from: k, reason: collision with root package name */
    public final n0.v2 f16218k;

    /* renamed from: l, reason: collision with root package name */
    public long f16219l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16220m;

    public b(android.content.Context context, b0.z1 overScrollConfig) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(overScrollConfig, "overScrollConfig");
        this.f16208a = overScrollConfig;
        b0.p1 p1Var = b0.p1.f16471a;
        android.widget.EdgeEffect a17 = p1Var.a(context, null);
        this.f16209b = a17;
        android.widget.EdgeEffect a18 = p1Var.a(context, null);
        this.f16210c = a18;
        android.widget.EdgeEffect a19 = p1Var.a(context, null);
        this.f16211d = a19;
        android.widget.EdgeEffect a27 = p1Var.a(context, null);
        this.f16212e = a27;
        java.util.List i17 = kz5.c0.i(a19, a17, a27, a18);
        this.f16213f = i17;
        this.f16214g = p1Var.a(context, null);
        this.f16215h = p1Var.a(context, null);
        this.f16216i = p1Var.a(context, null);
        this.f16217j = p1Var.a(context, null);
        int size = i17.size();
        for (int i18 = 0; i18 < size; i18++) {
            ((android.widget.EdgeEffect) i17.get(i18)).setColor(e1.a0.h(this.f16208a.f16618a));
        }
        this.f16218k = n0.s4.b(jz5.f0.f302826a, n0.w2.f333739a);
        int i19 = d1.k.f225643d;
        this.f16219l = d1.k.f225641b;
    }

    @Override // b0.c2
    public boolean a() {
        boolean z17;
        long b17 = d1.l.b(this.f16219l);
        b0.p1 p1Var = b0.p1.f16471a;
        if (p1Var.b(this.f16211d) == 0.0f) {
            z17 = false;
        } else {
            int i17 = d1.e.f225626e;
            n(d1.e.f225623b, b17);
            z17 = true;
        }
        if (!(p1Var.b(this.f16212e) == 0.0f)) {
            int i18 = d1.e.f225626e;
            o(d1.e.f225623b, b17);
            z17 = true;
        }
        if (!(p1Var.b(this.f16209b) == 0.0f)) {
            int i19 = d1.e.f225626e;
            p(d1.e.f225623b, b17);
            z17 = true;
        }
        if (p1Var.b(this.f16210c) == 0.0f) {
            return z17;
        }
        int i27 = d1.e.f225626e;
        m(d1.e.f225623b, b17);
        return true;
    }

    @Override // b0.c2
    public void b(g1.i iVar) {
        boolean z17;
        kotlin.jvm.internal.o.g(iVar, "<this>");
        e1.u a17 = ((g1.b) iVar.p()).a();
        ((n0.q4) this.f16218k).getValue();
        if (k()) {
            return;
        }
        android.graphics.Canvas canvas = e1.c.f246229a;
        kotlin.jvm.internal.o.g(a17, "<this>");
        android.graphics.Canvas canvas2 = ((e1.b) a17).f246225a;
        b0.p1 p1Var = b0.p1.f16471a;
        android.widget.EdgeEffect edgeEffect = this.f16216i;
        boolean z18 = true;
        if (!(p1Var.b(edgeEffect) == 0.0f)) {
            j(iVar, edgeEffect, canvas2);
            edgeEffect.finish();
        }
        android.widget.EdgeEffect edgeEffect2 = this.f16211d;
        if (edgeEffect2.isFinished()) {
            z17 = false;
        } else {
            z17 = i(iVar, edgeEffect2, canvas2);
            p1Var.c(edgeEffect, p1Var.b(edgeEffect2), 0.0f);
        }
        android.widget.EdgeEffect edgeEffect3 = this.f16214g;
        if (!(p1Var.b(edgeEffect3) == 0.0f)) {
            h(iVar, edgeEffect3, canvas2);
            edgeEffect3.finish();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f16209b;
        boolean isFinished = edgeEffect4.isFinished();
        b0.z1 z1Var = this.f16208a;
        if (!isFinished) {
            int save = canvas2.save();
            canvas2.translate(0.0f, iVar.R(((d0.e2) z1Var.f16620c).f225109b));
            boolean draw = edgeEffect4.draw(canvas2);
            canvas2.restoreToCount(save);
            z17 = draw || z17;
            p1Var.c(edgeEffect3, p1Var.b(edgeEffect4), 0.0f);
        }
        android.widget.EdgeEffect edgeEffect5 = this.f16217j;
        if (!(p1Var.b(edgeEffect5) == 0.0f)) {
            i(iVar, edgeEffect5, canvas2);
            edgeEffect5.finish();
        }
        android.widget.EdgeEffect edgeEffect6 = this.f16212e;
        if (!edgeEffect6.isFinished()) {
            z17 = j(iVar, edgeEffect6, canvas2) || z17;
            p1Var.c(edgeEffect5, p1Var.b(edgeEffect6), 0.0f);
        }
        android.widget.EdgeEffect edgeEffect7 = this.f16215h;
        if (!(p1Var.b(edgeEffect7) == 0.0f)) {
            int save2 = canvas2.save();
            canvas2.translate(0.0f, iVar.R(((d0.e2) z1Var.f16620c).f225109b));
            edgeEffect7.draw(canvas2);
            canvas2.restoreToCount(save2);
            edgeEffect7.finish();
        }
        android.widget.EdgeEffect edgeEffect8 = this.f16210c;
        if (!edgeEffect8.isFinished()) {
            if (!h(iVar, edgeEffect8, canvas2) && !z17) {
                z18 = false;
            }
            p1Var.c(edgeEffect7, p1Var.b(edgeEffect8), 0.0f);
            z17 = z18;
        }
        if (z17) {
            l();
        }
    }

    @Override // b0.c2
    public void c(long j17, long j18, d1.e eVar, int i17) {
        boolean z17;
        boolean z18;
        if (k()) {
            return;
        }
        if (i17 == 1) {
            long b17 = eVar != null ? eVar.f225627a : d1.l.b(this.f16219l);
            if (d1.e.c(j18) > 0.0f) {
                n(j18, b17);
            } else if (d1.e.c(j18) < 0.0f) {
                o(j18, b17);
            }
            if (d1.e.d(j18) > 0.0f) {
                p(j18, b17);
            } else if (d1.e.d(j18) < 0.0f) {
                m(j18, b17);
            }
            int i18 = d1.e.f225626e;
            z17 = !d1.e.a(j18, d1.e.f225623b);
        } else {
            z17 = false;
        }
        android.widget.EdgeEffect edgeEffect = this.f16211d;
        if (edgeEffect.isFinished() || d1.e.c(j17) >= 0.0f) {
            z18 = false;
        } else {
            edgeEffect.onRelease();
            z18 = edgeEffect.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.f16212e;
        if (!edgeEffect2.isFinished() && d1.e.c(j17) > 0.0f) {
            edgeEffect2.onRelease();
            z18 = z18 || edgeEffect2.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.f16209b;
        if (!edgeEffect3.isFinished() && d1.e.d(j17) < 0.0f) {
            edgeEffect3.onRelease();
            z18 = z18 || edgeEffect3.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f16210c;
        if (!edgeEffect4.isFinished() && d1.e.d(j17) > 0.0f) {
            edgeEffect4.onRelease();
            z18 = z18 || edgeEffect4.isFinished();
        }
        if (z18 || z17) {
            l();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    @Override // b0.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d(long r8, d1.e r10, int r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.b.d(long, d1.e, int):long");
    }

    @Override // b0.c2
    public void e(long j17) {
        if (k()) {
            return;
        }
        if (p2.w.b(j17) > 0.0f) {
            int b17 = a06.d.b(p2.w.b(j17));
            android.widget.EdgeEffect edgeEffect = this.f16211d;
            kotlin.jvm.internal.o.g(edgeEffect, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                edgeEffect.onAbsorb(b17);
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb(b17);
            }
        } else if (p2.w.b(j17) < 0.0f) {
            int i17 = -a06.d.b(p2.w.b(j17));
            android.widget.EdgeEffect edgeEffect2 = this.f16212e;
            kotlin.jvm.internal.o.g(edgeEffect2, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                edgeEffect2.onAbsorb(i17);
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb(i17);
            }
        }
        if (p2.w.c(j17) > 0.0f) {
            int b18 = a06.d.b(p2.w.c(j17));
            android.widget.EdgeEffect edgeEffect3 = this.f16209b;
            kotlin.jvm.internal.o.g(edgeEffect3, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                edgeEffect3.onAbsorb(b18);
            } else if (edgeEffect3.isFinished()) {
                edgeEffect3.onAbsorb(b18);
            }
        } else if (p2.w.c(j17) < 0.0f) {
            int i18 = -a06.d.b(p2.w.c(j17));
            android.widget.EdgeEffect edgeEffect4 = this.f16210c;
            kotlin.jvm.internal.o.g(edgeEffect4, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                edgeEffect4.onAbsorb(i18);
            } else if (edgeEffect4.isFinished()) {
                edgeEffect4.onAbsorb(i18);
            }
        }
        if (j17 == p2.w.f351404b) {
            return;
        }
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    @Override // b0.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long f(long r11) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.b.f(long):long");
    }

    @Override // b0.c2
    public void g(long j17, boolean z17) {
        boolean z18 = !d1.k.a(j17, this.f16219l);
        boolean z19 = this.f16220m != z17;
        this.f16219l = j17;
        this.f16220m = z17;
        if (z18) {
            this.f16209b.setSize(a06.d.b(d1.k.d(j17)), a06.d.b(d1.k.b(j17)));
            this.f16210c.setSize(a06.d.b(d1.k.d(j17)), a06.d.b(d1.k.b(j17)));
            this.f16211d.setSize(a06.d.b(d1.k.b(j17)), a06.d.b(d1.k.d(j17)));
            this.f16212e.setSize(a06.d.b(d1.k.b(j17)), a06.d.b(d1.k.d(j17)));
            this.f16214g.setSize(a06.d.b(d1.k.d(j17)), a06.d.b(d1.k.b(j17)));
            this.f16215h.setSize(a06.d.b(d1.k.d(j17)), a06.d.b(d1.k.b(j17)));
            this.f16216i.setSize(a06.d.b(d1.k.b(j17)), a06.d.b(d1.k.d(j17)));
            this.f16217j.setSize(a06.d.b(d1.k.b(j17)), a06.d.b(d1.k.d(j17)));
        }
        if (z19 || z18) {
            l();
            release();
        }
    }

    public final boolean h(g1.i iVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-d1.k.d(this.f16219l), (-d1.k.b(this.f16219l)) + iVar.R(((d0.e2) this.f16208a.f16620c).f225111d));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean i(g1.i iVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-d1.k.b(this.f16219l), iVar.R(((d0.e2) this.f16208a.f16620c).a(iVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean j(g1.i iVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        int b17 = a06.d.b(d1.k.d(this.f16219l));
        float b18 = ((d0.e2) this.f16208a.f16620c).b(iVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-b17) + iVar.R(b18));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean k() {
        return (this.f16208a.f16619b || this.f16220m) ? false : true;
    }

    public final void l() {
        ((n0.q4) this.f16218k).setValue(jz5.f0.f302826a);
    }

    public final float m(long j17, long j18) {
        float c17 = d1.e.c(j18) / d1.k.d(this.f16219l);
        float f17 = -(d1.e.d(j17) / d1.k.b(this.f16219l));
        float f18 = 1 - c17;
        android.widget.EdgeEffect edgeEffect = this.f16210c;
        kotlin.jvm.internal.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            f17 = b0.e.f16265a.c(edgeEffect, f17, f18);
        } else {
            edgeEffect.onPull(f17, f18);
        }
        return (-f17) * d1.k.b(this.f16219l);
    }

    public final float n(long j17, long j18) {
        float d17 = d1.e.d(j18) / d1.k.b(this.f16219l);
        float c17 = d1.e.c(j17) / d1.k.d(this.f16219l);
        float f17 = 1 - d17;
        android.widget.EdgeEffect edgeEffect = this.f16211d;
        kotlin.jvm.internal.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            c17 = b0.e.f16265a.c(edgeEffect, c17, f17);
        } else {
            edgeEffect.onPull(c17, f17);
        }
        return c17 * d1.k.d(this.f16219l);
    }

    public final float o(long j17, long j18) {
        float d17 = d1.e.d(j18) / d1.k.b(this.f16219l);
        float f17 = -(d1.e.c(j17) / d1.k.d(this.f16219l));
        android.widget.EdgeEffect edgeEffect = this.f16212e;
        kotlin.jvm.internal.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            f17 = b0.e.f16265a.c(edgeEffect, f17, d17);
        } else {
            edgeEffect.onPull(f17, d17);
        }
        return (-f17) * d1.k.d(this.f16219l);
    }

    public final float p(long j17, long j18) {
        float c17 = d1.e.c(j18) / d1.k.d(this.f16219l);
        float d17 = d1.e.d(j17) / d1.k.b(this.f16219l);
        android.widget.EdgeEffect edgeEffect = this.f16209b;
        kotlin.jvm.internal.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            d17 = b0.e.f16265a.c(edgeEffect, d17, c17);
        } else {
            edgeEffect.onPull(d17, c17);
        }
        return d17 * d1.k.b(this.f16219l);
    }

    @Override // b0.c2
    public void release() {
        if (k()) {
            return;
        }
        java.util.List list = this.f16213f;
        int size = list.size();
        boolean z17 = false;
        for (int i17 = 0; i17 < size; i17++) {
            android.widget.EdgeEffect edgeEffect = (android.widget.EdgeEffect) list.get(i17);
            edgeEffect.onRelease();
            z17 = edgeEffect.isFinished() || z17;
        }
        if (z17) {
            l();
        }
    }
}
