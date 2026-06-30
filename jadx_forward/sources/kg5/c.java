package kg5;

/* loaded from: classes15.dex */
public final class c implements android.text.method.TransformationMethod {

    /* renamed from: d, reason: collision with root package name */
    public final android.text.method.TransformationMethod f389275d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f389276e;

    public c(android.text.method.TransformationMethod transformationMethod, float f17, android.content.Context mContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f389275d = transformationMethod;
        this.f389276e = mContext;
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (view.isInEditMode()) {
            return charSequence;
        }
        android.text.method.TransformationMethod transformationMethod = this.f389275d;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null) {
            return charSequence;
        }
        charSequence.toString();
        return pg5.d.a(this.f389276e, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z17, int i17, android.graphics.Rect rect) {
        android.text.method.TransformationMethod transformationMethod = this.f389275d;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z17, i17, rect);
        }
    }
}
