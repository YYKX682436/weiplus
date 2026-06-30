package androidx.viewpager.widget;

/* loaded from: classes13.dex */
public class e extends android.text.method.SingleLineTransformationMethod {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Locale f12436d;

    public e(android.content.Context context) {
        this.f12436d = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        java.lang.CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.f12436d);
        }
        return null;
    }
}
