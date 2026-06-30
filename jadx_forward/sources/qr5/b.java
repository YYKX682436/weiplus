package qr5;

/* loaded from: classes13.dex */
public class b extends qr5.e {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f447665c;

    /* renamed from: b, reason: collision with root package name */
    public android.app.Activity f447666b;

    static {
        try {
            f447665c = java.lang.Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
        } catch (java.lang.Throwable unused) {
            f447665c = null;
        }
    }

    public b() {
        super(null);
        this.f447666b = null;
    }

    @Override // qr5.e
    public android.app.Activity a() {
        android.app.Activity activity = this.f447666b;
        if (activity != null) {
            return activity;
        }
        try {
            android.content.Context context = (android.content.Context) f447665c.getMethod("getContext", null).invoke(null, null);
            if (context instanceof android.app.Activity) {
                this.f447666b = (android.app.Activity) context;
            }
        } catch (java.lang.Throwable th6) {
            or5.b.c(3, th6, "Get Activity failed", new java.lang.Object[0]);
        }
        return this.f447666b;
    }
}
