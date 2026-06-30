package u4;

/* loaded from: classes13.dex */
public abstract class a2 {
    public float a(android.view.View view) {
        java.lang.Float f17 = (java.lang.Float) view.getTag(com.p314xaae8f345.mm.R.id.m9q);
        return f17 != null ? view.getAlpha() / f17.floatValue() : view.getAlpha();
    }

    public abstract void b(android.view.View view, android.graphics.Matrix matrix);

    public abstract void c(android.view.View view, android.graphics.Matrix matrix);
}
