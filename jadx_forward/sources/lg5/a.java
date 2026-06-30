package lg5;

/* loaded from: classes15.dex */
public final class a extends android.text.Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f400112a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile android.text.Editable.Factory f400113b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Class f400114c;

    public a() {
        try {
            f400114c = lg5.a.class.getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        java.lang.Class cls = f400114c;
        return cls != null ? new lg5.d(cls, charSequence) : super.newEditable(charSequence);
    }
}
