package androidx.appcompat.app;

/* loaded from: classes13.dex */
public class m extends androidx.appcompat.app.i0 implements android.content.DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final androidx.appcompat.app.k f9196f;

    public m(android.content.Context context, int i17) {
        super(context, D(context, i17));
        this.f9196f = new androidx.appcompat.app.k(getContext(), this, getWindow());
    }

    public static int D(android.content.Context context, int i17) {
        if (((i17 >>> 24) & 255) >= 1) {
            return i17;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478090ae, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0421  */
    @Override // androidx.appcompat.app.i0, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.m.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.f9196f.f9181w;
        if (nestedScrollView != null && nestedScrollView.c(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.f9196f.f9181w;
        if (nestedScrollView != null && nestedScrollView.c(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        androidx.appcompat.app.k kVar = this.f9196f;
        kVar.f9163e = charSequence;
        android.widget.TextView textView = kVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
