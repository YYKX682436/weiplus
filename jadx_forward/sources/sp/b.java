package sp;

/* loaded from: classes8.dex */
public class b extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f492472d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f492473e;

    public b(android.content.Context context, int i17) {
        super(context, i17);
        this.f492473e = new sp.a(this);
        if (android.os.Build.VERSION.SDK_INT > 28) {
            return;
        }
        try {
            java.lang.reflect.Field declaredField = android.app.Dialog.class.getDeclaredField("mDismissAction");
            declaredField.setAccessible(true);
            try {
                java.lang.reflect.Field declaredField2 = java.lang.reflect.Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (java.lang.Exception unused) {
            }
            this.f492472d = (java.lang.Runnable) declaredField.get(this);
            declaredField.set(this, this.f492473e);
        } catch (java.lang.IllegalAccessException unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SafeDismissDialog", "hijack fail IllegalAccessException");
        } catch (java.lang.NoSuchFieldException unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SafeDismissDialog", "hijack fail NoSuchFieldException");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SafeDismissDialog", e17, "", new java.lang.Object[0]);
        }
    }
}
