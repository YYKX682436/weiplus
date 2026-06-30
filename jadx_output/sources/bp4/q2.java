package bp4;

/* loaded from: classes10.dex */
public final class q2 implements ml5.i {

    /* renamed from: a, reason: collision with root package name */
    public float f23354a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.w2 f23355b;

    public q2(bp4.w2 w2Var) {
        this.f23355b = w2Var;
    }

    @Override // ml5.i
    public void a() {
        com.tencent.mm.plugin.vlog.model.y yVar;
        android.graphics.Matrix matrix;
        bp4.w2 w2Var = this.f23355b;
        java.lang.String str = w2Var.f23403e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChangeStart: audioSeekable:");
        bp4.c0 c0Var = w2Var.f23411p;
        sb6.append(c0Var != null ? c0Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ((bp4.y) w2Var.f23402d).a().pause();
        bp4.c0 c0Var2 = w2Var.f23411p;
        if (c0Var2 != null) {
            c0Var2.pause();
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var = w2Var.f23405g;
        this.f23354a = (i1Var == null || (yVar = i1Var.f175624i) == null || (matrix = yVar.f175784a) == null) ? 1.0f : com.tencent.mm.plugin.vlog.model.q0.a(matrix);
        pm0.v.C(w2Var.f23412q);
        ((bp4.y) w2Var.f23402d).f23427a.f23211g.e();
    }

    @Override // ml5.i
    public void b() {
        bp4.w2 w2Var = this.f23355b;
        java.lang.String str = w2Var.f23403e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChangeEnd: audioSeekable:");
        bp4.c0 c0Var = w2Var.f23411p;
        sb6.append(c0Var != null ? c0Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        bp4.y yVar = (bp4.y) w2Var.f23402d;
        yVar.getClass();
        ju3.d0.k(yVar.f23428b, ju3.c0.f301913x1, null, 2, null);
        com.tencent.mm.plugin.vlog.model.i1 i1Var = w2Var.f23405g;
        if (i1Var != null) {
            boolean z17 = this.f23354a == com.tencent.mm.plugin.vlog.model.q0.a(i1Var.f175624i.f175784a);
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem editItem = i1Var.f175626k;
            if (z17) {
                editItem.dragCount++;
            } else {
                editItem.scaleCount++;
            }
        }
        pm0.v.U(3000L, w2Var.f23412q);
    }

    @Override // ml5.h
    public void onChange() {
        bp4.w2 w2Var = this.f23355b;
        com.tencent.mars.xlog.Log.i(w2Var.f23403e, "onChange: " + ((bp4.y) w2Var.f23402d).f23427a.f23210f.getContentRect());
        if (((bp4.y) w2Var.f23402d).f23427a.f23210f.getContentRect().isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var = w2Var.f23405g;
        if (i1Var != null) {
            com.tencent.mm.plugin.vlog.model.y yVar = i1Var.f175624i;
            yVar.f175787d.set(((bp4.y) w2Var.f23402d).f23427a.f23210f.getContentRect());
            rm5.j jVar = i1Var.f175627l;
            jVar.f397512n.set(((bp4.y) w2Var.f23402d).f23427a.f23210f.getContentRect());
            android.graphics.Rect rect = yVar.f175787d;
            android.graphics.RectF rectF = w2Var.f23407i;
            rect.offset(-((int) rectF.left), -((int) rectF.top));
            jVar.f397512n.offset(-((int) rectF.left), -((int) rectF.top));
            yVar.f175785b.set(yVar.f175787d);
        }
        if (((bp4.y) w2Var.f23402d).a().isPlaying()) {
            return;
        }
        ((bp4.y) w2Var.f23402d).a().e();
    }
}
