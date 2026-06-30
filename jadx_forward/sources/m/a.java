package m;

/* loaded from: classes13.dex */
public class a implements android.text.method.TransformationMethod {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Locale f403956d;

    public a(android.content.Context context) {
        this.f403956d = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f403956d);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z17, int i17, android.graphics.Rect rect) {
    }
}
