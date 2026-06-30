package androidx.transition;

/* loaded from: classes13.dex */
public class ChangeImageTransform extends androidx.transition.Transition {
    public static final java.lang.String[] L = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final android.animation.TypeEvaluator M = new u4.l();
    public static final android.util.Property N = new u4.m(android.graphics.Matrix.class, "animatedTransform");

    public ChangeImageTransform(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void T(u4.m1 m1Var) {
        android.graphics.Matrix matrix;
        android.view.View view = m1Var.f424515b;
        if ((view instanceof android.widget.ImageView) && view.getVisibility() == 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            java.util.HashMap hashMap = (java.util.HashMap) m1Var.f424514a;
            hashMap.put("android:changeImageTransform:bounds", new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            int i17 = u4.n.f424517a[imageView.getScaleType().ordinal()];
            if (i17 == 1) {
                android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                matrix2.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
                matrix = matrix2;
            } else if (i17 != 2) {
                matrix = new android.graphics.Matrix(imageView.getImageMatrix());
            } else {
                android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                float width = imageView.getWidth();
                float f17 = intrinsicWidth;
                int intrinsicHeight = drawable2.getIntrinsicHeight();
                float height = imageView.getHeight();
                float f18 = intrinsicHeight;
                float max = java.lang.Math.max(width / f17, height / f18);
                int round = java.lang.Math.round((width - (f17 * max)) / 2.0f);
                int round2 = java.lang.Math.round((height - (f18 * max)) / 2.0f);
                android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                matrix3.postScale(max, max);
                matrix3.postTranslate(round, round2);
                matrix = matrix3;
            }
            hashMap.put("android:changeImageTransform:matrix", matrix);
        }
    }

    @Override // androidx.transition.Transition
    public void g(u4.m1 m1Var) {
        T(m1Var);
    }

    @Override // androidx.transition.Transition
    public void j(u4.m1 m1Var) {
        T(m1Var);
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator n(android.view.ViewGroup viewGroup, u4.m1 m1Var, u4.m1 m1Var2) {
        if (m1Var == null || m1Var2 == null) {
            return null;
        }
        java.util.HashMap hashMap = (java.util.HashMap) m1Var.f424514a;
        android.graphics.Rect rect = (android.graphics.Rect) hashMap.get("android:changeImageTransform:bounds");
        java.util.HashMap hashMap2 = (java.util.HashMap) m1Var2.f424514a;
        android.graphics.Rect rect2 = (android.graphics.Rect) hashMap2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        android.graphics.Matrix matrix = (android.graphics.Matrix) hashMap.get("android:changeImageTransform:matrix");
        android.graphics.Matrix matrix2 = (android.graphics.Matrix) hashMap2.get("android:changeImageTransform:matrix");
        boolean z17 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z17) {
            return null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) m1Var2.f424515b;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        android.util.Property property = N;
        if (intrinsicWidth == 0 || intrinsicHeight == 0) {
            return android.animation.ObjectAnimator.ofObject(imageView, (android.util.Property<android.widget.ImageView, V>) property, M, null, null);
        }
        if (matrix == null) {
            matrix = u4.h0.f424488a;
        }
        if (matrix2 == null) {
            matrix2 = u4.h0.f424488a;
        }
        property.set(imageView, matrix);
        return android.animation.ObjectAnimator.ofObject(imageView, (android.util.Property<android.widget.ImageView, V>) property, new u4.k1(), matrix, matrix2);
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] x() {
        return L;
    }
}
