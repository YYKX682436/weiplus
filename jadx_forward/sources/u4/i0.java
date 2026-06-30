package u4;

/* loaded from: classes3.dex */
public class i0 implements android.animation.TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f506023a;

    public i0(android.graphics.Rect rect) {
        this.f506023a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float f17, java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Rect rect = (android.graphics.Rect) obj;
        android.graphics.Rect rect2 = (android.graphics.Rect) obj2;
        int i17 = rect.left + ((int) ((rect2.left - r0) * f17));
        int i18 = rect.top + ((int) ((rect2.top - r1) * f17));
        int i19 = rect.right + ((int) ((rect2.right - r2) * f17));
        int i27 = rect.bottom + ((int) ((rect2.bottom - r6) * f17));
        android.graphics.Rect rect3 = this.f506023a;
        if (rect3 == null) {
            return new android.graphics.Rect(i17, i18, i19, i27);
        }
        rect3.set(i17, i18, i19, i27);
        return rect3;
    }
}
