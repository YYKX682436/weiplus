package p012xc85e97e9.p114xa324943e.p115xd1075a44;

/* loaded from: classes13.dex */
public class e extends android.text.method.SingleLineTransformationMethod {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Locale f93969d;

    public e(android.content.Context context) {
        this.f93969d = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        java.lang.CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.f93969d);
        }
        return null;
    }
}
