package bp4;

/* loaded from: classes10.dex */
public final class g0 implements ru3.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f104706a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f104707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f104708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 f104709d;

    public g0(bp4.k0 k0Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var) {
        this.f104707b = k0Var;
        this.f104708c = j17;
        this.f104709d = i1Var;
    }

    @Override // ru3.n
    public void b(android.graphics.RectF rectF) {
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1> linkedList;
        float centerY;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "rectF");
        bp4.k0 k0Var = this.f104707b;
        long j17 = k0Var.f104753s;
        if (j17 == this.f104708c || j17 == 0) {
            k0Var.f104755u.set(rectF);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = k0Var.f104756v;
        if (u0Var != null && (linkedList = u0Var.f257266g) != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var : linkedList) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var.f257157i;
                rectF.round(yVar.f257318b);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f104709d, i1Var) && !k0Var.A) {
                    android.graphics.Rect rect = yVar.f257318b;
                    int i17 = rect.bottom;
                    android.graphics.Rect rect2 = yVar.f257320d;
                    int i18 = i17 - rect2.bottom;
                    int i19 = rect.top - rect2.top;
                    if (i18 > 0 || i19 < 0) {
                        android.graphics.Matrix matrix = new android.graphics.Matrix();
                        android.graphics.RectF rectF2 = new android.graphics.RectF(rect2);
                        float height = rectF.height() / rectF2.height();
                        if (height < 1.0f) {
                            centerY = i19 < 0 ? i19 : i18;
                            height = 1.0f;
                        } else {
                            centerY = rectF.centerY() - rectF2.centerY();
                        }
                        matrix.postTranslate(0.0f, centerY);
                        matrix.postScale(height, height, rectF.centerX(), rectF.centerY());
                        matrix.mapRect(rectF2);
                        rectF2.round(rect2);
                        yVar.f257317a.postConcat(matrix);
                    }
                }
            }
        }
        k0Var.f104743f.z(rectF, false);
        ml5.h hVar = k0Var.f104752r;
        if (hVar != null) {
            hVar.mo10990x3dcbea6f();
        }
        if (!this.f104706a) {
            k0Var.f104757w++;
        }
        this.f104706a = true;
    }

    @Override // ru3.n
    public void c(boolean z17) {
        this.f104706a = false;
    }
}
