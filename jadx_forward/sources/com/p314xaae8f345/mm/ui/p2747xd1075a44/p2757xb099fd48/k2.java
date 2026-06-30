package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes13.dex */
public class k2 extends android.app.Dialog {
    private static final java.lang.String TAG = "MicroMsg.MMDialog";

    /* renamed from: iOnDialogDismissListener */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l f39753xab3b97ae;

    /* renamed from: mHijackDismissAction */
    private java.lang.Runnable f39754x38b79b33;

    /* renamed from: mReplaceRunnable */
    private final java.lang.Runnable f39755x1f8125c4;

    public k2(android.content.Context context) {
        super(context);
        this.f39755x1f8125c4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j2(this);
        b();
    }

    private void b() {
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
            this.f39754x38b79b33 = (java.lang.Runnable) declaredField.get(this);
            declaredField.set(this, this.f39755x1f8125c4);
        } catch (java.lang.IllegalAccessException unused2) {
            com.p314xaae8f345.mm.ui.yk.b(TAG, "hijack fail IllegalAccessException", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException unused3) {
            com.p314xaae8f345.mm.ui.yk.b(TAG, "hijack fail NoSuchFieldException", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.d(TAG, e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l lVar = this.f39753xab3b97ae;
        if (lVar != null) {
            lVar.mo48629xdbdf3083(this);
        }
    }

    /* renamed from: setiOnDialogDismissListener */
    public void m81955xb46ce10(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l lVar) {
        this.f39753xab3b97ae = lVar;
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.d(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    public k2(android.content.Context context, int i17) {
        super(context, i17);
        this.f39755x1f8125c4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j2(this);
        b();
    }
}
