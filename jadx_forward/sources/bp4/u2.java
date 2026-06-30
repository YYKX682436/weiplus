package bp4;

/* loaded from: classes10.dex */
public final class u2 implements ru3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.w2 f104924a;

    public u2(bp4.w2 w2Var) {
        this.f104924a = w2Var;
    }

    @Override // ru3.n
    public void a(boolean z17) {
        pm0.v.U(3000L, this.f104924a.f104945q);
    }

    @Override // ru3.n
    public void b(android.graphics.RectF rectF) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar;
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1> arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "rectF");
        bp4.w2 w2Var = this.f104924a;
        w2Var.f104941m.set(rectF);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w2Var.f104936e, "operationCallback onChange:" + rectF);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = w2Var.f104939h;
        if (h1Var != null && (arrayList = h1Var.f257130c) != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var : arrayList) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar2 = i1Var.f257157i;
                rectF.round(yVar2.f257318b);
                android.graphics.RectF rectF2 = w2Var.f104940i;
                yVar2.f257318b.offset(-((int) rectF2.left), -((int) rectF2.top));
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(w2Var.f104938g, i1Var) && !w2Var.f104943o) {
                    android.graphics.RectF rectF3 = w2Var.f104940i;
                    int i17 = (int) rectF3.top;
                    android.graphics.Rect rect = yVar2.f257320d;
                    rect.offset(0, i17);
                    float f17 = rectF.bottom - rect.bottom;
                    float f18 = rectF.top - rect.top;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar3 = i1Var.f257157i;
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
                        rm5.j jVar = i1Var.f257160l;
                        rectF4.round(jVar.f479045n);
                        yVar3.f257320d.offset(-((int) rectF3.left), -((int) rectF3.top));
                        jVar.f479045n.offset(-((int) rectF3.left), -((int) rectF3.top));
                        yVar2.f257317a.postConcat(matrix);
                    } else {
                        yVar3.f257320d.offset(-((int) rectF3.left), -((int) rectF3.top));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w2Var.f104936e, "operationCallback track info, id:" + i1Var.f257152d + ", contentRect:" + yVar3.f257320d);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = w2Var.f104938g;
        if (((i1Var2 == null || (yVar = i1Var2.f257157i) == null) ? null : yVar.f257320d) == null || !((bp4.y) w2Var.f104935d).f104960a.f104743f.getContentRect().isEmpty()) {
            ((bp4.y) w2Var.f104935d).f104960a.f104743f.z(rectF, false);
        }
    }

    @Override // ru3.n
    public void c(boolean z17) {
        bp4.w2 w2Var = this.f104924a;
        pm0.v.C(w2Var.f104945q);
        ((bp4.y) w2Var.f104935d).f104960a.f104744g.e();
    }
}
