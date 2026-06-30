package bp4;

/* loaded from: classes10.dex */
public final class u2 implements ru3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.w2 f23391a;

    public u2(bp4.w2 w2Var) {
        this.f23391a = w2Var;
    }

    @Override // ru3.n
    public void a(boolean z17) {
        pm0.v.U(3000L, this.f23391a.f23412q);
    }

    @Override // ru3.n
    public void b(android.graphics.RectF rectF) {
        com.tencent.mm.plugin.vlog.model.y yVar;
        java.util.ArrayList<com.tencent.mm.plugin.vlog.model.i1> arrayList;
        kotlin.jvm.internal.o.g(rectF, "rectF");
        bp4.w2 w2Var = this.f23391a;
        w2Var.f23408m.set(rectF);
        com.tencent.mars.xlog.Log.i(w2Var.f23403e, "operationCallback onChange:" + rectF);
        com.tencent.mm.plugin.vlog.model.h1 h1Var = w2Var.f23406h;
        if (h1Var != null && (arrayList = h1Var.f175597c) != null) {
            for (com.tencent.mm.plugin.vlog.model.i1 i1Var : arrayList) {
                com.tencent.mm.plugin.vlog.model.y yVar2 = i1Var.f175624i;
                rectF.round(yVar2.f175785b);
                android.graphics.RectF rectF2 = w2Var.f23407i;
                yVar2.f175785b.offset(-((int) rectF2.left), -((int) rectF2.top));
                if (!kotlin.jvm.internal.o.b(w2Var.f23405g, i1Var) && !w2Var.f23410o) {
                    android.graphics.RectF rectF3 = w2Var.f23407i;
                    int i17 = (int) rectF3.top;
                    android.graphics.Rect rect = yVar2.f175787d;
                    rect.offset(0, i17);
                    float f17 = rectF.bottom - rect.bottom;
                    float f18 = rectF.top - rect.top;
                    com.tencent.mm.plugin.vlog.model.y yVar3 = i1Var.f175624i;
                    if (f17 > 0.0f || f18 < 0.0f) {
                        android.graphics.Matrix matrix = new android.graphics.Matrix();
                        android.graphics.RectF rectF4 = new android.graphics.RectF(rect);
                        float height = rectF.height() / rectF4.height();
                        if (height < 1.0f) {
                            if (f18 < 0.0f) {
                                f17 = f18;
                            }
                            height = 1.0f;
                        } else {
                            f17 = rectF.centerY() - rectF4.centerY();
                        }
                        matrix.postTranslate(0.0f, f17);
                        matrix.postScale(height, height, rectF.centerX(), rectF.centerY());
                        matrix.mapRect(rectF4);
                        rectF4.round(rect);
                        rm5.j jVar = i1Var.f175627l;
                        rectF4.round(jVar.f397512n);
                        yVar3.f175787d.offset(-((int) rectF3.left), -((int) rectF3.top));
                        jVar.f397512n.offset(-((int) rectF3.left), -((int) rectF3.top));
                        yVar2.f175784a.postConcat(matrix);
                    } else {
                        yVar3.f175787d.offset(-((int) rectF3.left), -((int) rectF3.top));
                    }
                    com.tencent.mars.xlog.Log.i(w2Var.f23403e, "operationCallback track info, id:" + i1Var.f175619d + ", contentRect:" + yVar3.f175787d);
                }
            }
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var2 = w2Var.f23405g;
        if (((i1Var2 == null || (yVar = i1Var2.f175624i) == null) ? null : yVar.f175787d) == null || !((bp4.y) w2Var.f23402d).f23427a.f23210f.getContentRect().isEmpty()) {
            ((bp4.y) w2Var.f23402d).f23427a.f23210f.z(rectF, false);
        }
    }

    @Override // ru3.n
    public void c(boolean z17) {
        bp4.w2 w2Var = this.f23391a;
        pm0.v.C(w2Var.f23412q);
        ((bp4.y) w2Var.f23402d).f23427a.f23211g.e();
    }
}
