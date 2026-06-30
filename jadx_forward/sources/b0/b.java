package b0;

/* loaded from: classes14.dex */
public final class b implements b0.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final b0.z1 f97741a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.EdgeEffect f97742b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.EdgeEffect f97743c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.EdgeEffect f97744d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.EdgeEffect f97745e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f97746f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.EdgeEffect f97747g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.EdgeEffect f97748h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.EdgeEffect f97749i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.EdgeEffect f97750j;

    /* renamed from: k, reason: collision with root package name */
    public final n0.v2 f97751k;

    /* renamed from: l, reason: collision with root package name */
    public long f97752l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f97753m;

    public b(android.content.Context context, b0.z1 overScrollConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(overScrollConfig, "overScrollConfig");
        this.f97741a = overScrollConfig;
        b0.p1 p1Var = b0.p1.f98004a;
        android.widget.EdgeEffect a17 = p1Var.a(context, null);
        this.f97742b = a17;
        android.widget.EdgeEffect a18 = p1Var.a(context, null);
        this.f97743c = a18;
        android.widget.EdgeEffect a19 = p1Var.a(context, null);
        this.f97744d = a19;
        android.widget.EdgeEffect a27 = p1Var.a(context, null);
        this.f97745e = a27;
        java.util.List i17 = kz5.c0.i(a19, a17, a27, a18);
        this.f97746f = i17;
        this.f97747g = p1Var.a(context, null);
        this.f97748h = p1Var.a(context, null);
        this.f97749i = p1Var.a(context, null);
        this.f97750j = p1Var.a(context, null);
        int size = i17.size();
        for (int i18 = 0; i18 < size; i18++) {
            ((android.widget.EdgeEffect) i17.get(i18)).setColor(e1.a0.h(this.f97741a.f98151a));
        }
        this.f97751k = n0.s4.b(jz5.f0.f384359a, n0.w2.f415272a);
        int i19 = d1.k.f307176d;
        this.f97752l = d1.k.f307174b;
    }

    @Override // b0.c2
    public boolean a() {
        boolean z17;
        long b17 = d1.l.b(this.f97752l);
        b0.p1 p1Var = b0.p1.f98004a;
        if (p1Var.b(this.f97744d) == 0.0f) {
            z17 = false;
        } else {
            int i17 = d1.e.f307159e;
            n(d1.e.f307156b, b17);
            z17 = true;
        }
        if (!(p1Var.b(this.f97745e) == 0.0f)) {
            int i18 = d1.e.f307159e;
            o(d1.e.f307156b, b17);
            z17 = true;
        }
        if (!(p1Var.b(this.f97742b) == 0.0f)) {
            int i19 = d1.e.f307159e;
            p(d1.e.f307156b, b17);
            z17 = true;
        }
        if (p1Var.b(this.f97743c) == 0.0f) {
            return z17;
        }
        int i27 = d1.e.f307159e;
        m(d1.e.f307156b, b17);
        return true;
    }

    @Override // b0.c2
    public void b(g1.i iVar) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        e1.u a17 = ((g1.b) iVar.p()).a();
        ((n0.q4) this.f97751k).mo128745x754a37bb();
        if (k()) {
            return;
        }
        android.graphics.Canvas canvas = e1.c.f327762a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
        android.graphics.Canvas canvas2 = ((e1.b) a17).f327758a;
        b0.p1 p1Var = b0.p1.f98004a;
        android.widget.EdgeEffect edgeEffect = this.f97749i;
        boolean z18 = true;
        if (!(p1Var.b(edgeEffect) == 0.0f)) {
            j(iVar, edgeEffect, canvas2);
            edgeEffect.finish();
        }
        android.widget.EdgeEffect edgeEffect2 = this.f97744d;
        if (edgeEffect2.isFinished()) {
            z17 = false;
        } else {
            z17 = i(iVar, edgeEffect2, canvas2);
            p1Var.c(edgeEffect, p1Var.b(edgeEffect2), 0.0f);
        }
        android.widget.EdgeEffect edgeEffect3 = this.f97747g;
        if (!(p1Var.b(edgeEffect3) == 0.0f)) {
            h(iVar, edgeEffect3, canvas2);
            edgeEffect3.finish();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f97742b;
        boolean isFinished = edgeEffect4.isFinished();
        b0.z1 z1Var = this.f97741a;
        if (!isFinished) {
            int save = canvas2.save();
            canvas2.translate(0.0f, iVar.R(((d0.e2) z1Var.f98153c).f306642b));
            boolean draw = edgeEffect4.draw(canvas2);
            canvas2.restoreToCount(save);
            z17 = draw || z17;
            p1Var.c(edgeEffect3, p1Var.b(edgeEffect4), 0.0f);
        }
        android.widget.EdgeEffect edgeEffect5 = this.f97750j;
        if (!(p1Var.b(edgeEffect5) == 0.0f)) {
            i(iVar, edgeEffect5, canvas2);
            edgeEffect5.finish();
        }
        android.widget.EdgeEffect edgeEffect6 = this.f97745e;
        if (!edgeEffect6.isFinished()) {
            z17 = j(iVar, edgeEffect6, canvas2) || z17;
            p1Var.c(edgeEffect5, p1Var.b(edgeEffect6), 0.0f);
        }
        android.widget.EdgeEffect edgeEffect7 = this.f97748h;
        if (!(p1Var.b(edgeEffect7) == 0.0f)) {
            int save2 = canvas2.save();
            canvas2.translate(0.0f, iVar.R(((d0.e2) z1Var.f98153c).f306642b));
            edgeEffect7.draw(canvas2);
            canvas2.restoreToCount(save2);
            edgeEffect7.finish();
        }
        android.widget.EdgeEffect edgeEffect8 = this.f97743c;
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
            long b17 = eVar != null ? eVar.f307160a : d1.l.b(this.f97752l);
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
            int i18 = d1.e.f307159e;
            z17 = !d1.e.a(j18, d1.e.f307156b);
        } else {
            z17 = false;
        }
        android.widget.EdgeEffect edgeEffect = this.f97744d;
        if (edgeEffect.isFinished() || d1.e.c(j17) >= 0.0f) {
            z18 = false;
        } else {
            edgeEffect.onRelease();
            z18 = edgeEffect.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.f97745e;
        if (!edgeEffect2.isFinished() && d1.e.c(j17) > 0.0f) {
            edgeEffect2.onRelease();
            z18 = z18 || edgeEffect2.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.f97742b;
        if (!edgeEffect3.isFinished() && d1.e.d(j17) < 0.0f) {
            edgeEffect3.onRelease();
            z18 = z18 || edgeEffect3.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.f97743c;
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
            android.widget.EdgeEffect edgeEffect = this.f97744d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                edgeEffect.onAbsorb(b17);
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb(b17);
            }
        } else if (p2.w.b(j17) < 0.0f) {
            int i17 = -a06.d.b(p2.w.b(j17));
            android.widget.EdgeEffect edgeEffect2 = this.f97745e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect2, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                edgeEffect2.onAbsorb(i17);
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb(i17);
            }
        }
        if (p2.w.c(j17) > 0.0f) {
            int b18 = a06.d.b(p2.w.c(j17));
            android.widget.EdgeEffect edgeEffect3 = this.f97742b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect3, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                edgeEffect3.onAbsorb(b18);
            } else if (edgeEffect3.isFinished()) {
                edgeEffect3.onAbsorb(b18);
            }
        } else if (p2.w.c(j17) < 0.0f) {
            int i18 = -a06.d.b(p2.w.c(j17));
            android.widget.EdgeEffect edgeEffect4 = this.f97743c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect4, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                edgeEffect4.onAbsorb(i18);
            } else if (edgeEffect4.isFinished()) {
                edgeEffect4.onAbsorb(i18);
            }
        }
        if (j17 == p2.w.f432937b) {
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
        boolean z18 = !d1.k.a(j17, this.f97752l);
        boolean z19 = this.f97753m != z17;
        this.f97752l = j17;
        this.f97753m = z17;
        if (z18) {
            this.f97742b.setSize(a06.d.b(d1.k.d(j17)), a06.d.b(d1.k.b(j17)));
            this.f97743c.setSize(a06.d.b(d1.k.d(j17)), a06.d.b(d1.k.b(j17)));
            this.f97744d.setSize(a06.d.b(d1.k.b(j17)), a06.d.b(d1.k.d(j17)));
            this.f97745e.setSize(a06.d.b(d1.k.b(j17)), a06.d.b(d1.k.d(j17)));
            this.f97747g.setSize(a06.d.b(d1.k.d(j17)), a06.d.b(d1.k.b(j17)));
            this.f97748h.setSize(a06.d.b(d1.k.d(j17)), a06.d.b(d1.k.b(j17)));
            this.f97749i.setSize(a06.d.b(d1.k.b(j17)), a06.d.b(d1.k.d(j17)));
            this.f97750j.setSize(a06.d.b(d1.k.b(j17)), a06.d.b(d1.k.d(j17)));
        }
        if (z19 || z18) {
            l();
            mo9424x41012807();
        }
    }

    public final boolean h(g1.i iVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-d1.k.d(this.f97752l), (-d1.k.b(this.f97752l)) + iVar.R(((d0.e2) this.f97741a.f98153c).f306644d));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean i(g1.i iVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-d1.k.b(this.f97752l), iVar.R(((d0.e2) this.f97741a.f98153c).a(iVar.mo130620x6fcfed3f())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean j(g1.i iVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        int b17 = a06.d.b(d1.k.d(this.f97752l));
        float b18 = ((d0.e2) this.f97741a.f98153c).b(iVar.mo130620x6fcfed3f());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-b17) + iVar.R(b18));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean k() {
        return (this.f97741a.f98152b || this.f97753m) ? false : true;
    }

    public final void l() {
        ((n0.q4) this.f97751k).mo148714x53d8522f(jz5.f0.f384359a);
    }

    public final float m(long j17, long j18) {
        float c17 = d1.e.c(j18) / d1.k.d(this.f97752l);
        float f17 = -(d1.e.d(j17) / d1.k.b(this.f97752l));
        float f18 = 1 - c17;
        android.widget.EdgeEffect edgeEffect = this.f97743c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            f17 = b0.e.f97798a.c(edgeEffect, f17, f18);
        } else {
            edgeEffect.onPull(f17, f18);
        }
        return (-f17) * d1.k.b(this.f97752l);
    }

    public final float n(long j17, long j18) {
        float d17 = d1.e.d(j18) / d1.k.b(this.f97752l);
        float c17 = d1.e.c(j17) / d1.k.d(this.f97752l);
        float f17 = 1 - d17;
        android.widget.EdgeEffect edgeEffect = this.f97744d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            c17 = b0.e.f97798a.c(edgeEffect, c17, f17);
        } else {
            edgeEffect.onPull(c17, f17);
        }
        return c17 * d1.k.d(this.f97752l);
    }

    public final float o(long j17, long j18) {
        float d17 = d1.e.d(j18) / d1.k.b(this.f97752l);
        float f17 = -(d1.e.c(j17) / d1.k.d(this.f97752l));
        android.widget.EdgeEffect edgeEffect = this.f97745e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            f17 = b0.e.f97798a.c(edgeEffect, f17, d17);
        } else {
            edgeEffect.onPull(f17, d17);
        }
        return (-f17) * d1.k.d(this.f97752l);
    }

    public final float p(long j17, long j18) {
        float c17 = d1.e.c(j18) / d1.k.d(this.f97752l);
        float d17 = d1.e.d(j17) / d1.k.b(this.f97752l);
        android.widget.EdgeEffect edgeEffect = this.f97742b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            d17 = b0.e.f97798a.c(edgeEffect, d17, c17);
        } else {
            edgeEffect.onPull(d17, c17);
        }
        return d17 * d1.k.b(this.f97752l);
    }

    @Override // b0.c2
    /* renamed from: release */
    public void mo9424x41012807() {
        if (k()) {
            return;
        }
        java.util.List list = this.f97746f;
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
