package bp4;

/* loaded from: classes10.dex */
public final class g0 implements ru3.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23173a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f23174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23175c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.i1 f23176d;

    public g0(bp4.k0 k0Var, long j17, com.tencent.mm.plugin.vlog.model.i1 i1Var) {
        this.f23174b = k0Var;
        this.f23175c = j17;
        this.f23176d = i1Var;
    }

    @Override // ru3.n
    public void b(android.graphics.RectF rectF) {
        java.util.LinkedList<com.tencent.mm.plugin.vlog.model.i1> linkedList;
        float centerY;
        kotlin.jvm.internal.o.g(rectF, "rectF");
        bp4.k0 k0Var = this.f23174b;
        long j17 = k0Var.f23220s;
        if (j17 == this.f23175c || j17 == 0) {
            k0Var.f23222u.set(rectF);
        }
        com.tencent.mm.plugin.vlog.model.u0 u0Var = k0Var.f23223v;
        if (u0Var != null && (linkedList = u0Var.f175733g) != null) {
            for (com.tencent.mm.plugin.vlog.model.i1 i1Var : linkedList) {
                com.tencent.mm.plugin.vlog.model.y yVar = i1Var.f175624i;
                rectF.round(yVar.f175785b);
                if (!kotlin.jvm.internal.o.b(this.f23176d, i1Var) && !k0Var.A) {
                    android.graphics.Rect rect = yVar.f175785b;
                    int i17 = rect.bottom;
                    android.graphics.Rect rect2 = yVar.f175787d;
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
                        yVar.f175784a.postConcat(matrix);
                    }
                }
            }
        }
        k0Var.f23210f.z(rectF, false);
        ml5.h hVar = k0Var.f23219r;
        if (hVar != null) {
            hVar.onChange();
        }
        if (!this.f23173a) {
            k0Var.f23224w++;
        }
        this.f23173a = true;
    }

    @Override // ru3.n
    public void c(boolean z17) {
        this.f23173a = false;
    }
}
