package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes13.dex */
public class m extends p012xc85e97e9.p016x746ad0e3.app.i0 implements android.content.DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.k f90729f;

    public m(android.content.Context context, int i17) {
        super(context, D(context, i17));
        this.f90729f = new p012xc85e97e9.p016x746ad0e3.app.k(getContext(), this, getWindow());
    }

    public static int D(android.content.Context context, int i17) {
        if (((i17 >>> 24) & 255) >= 1) {
            return i17;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559623ae, typedValue, true);
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
    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.app.m.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = this.f90729f.f90714w;
        if (c1095x65355f89 != null && c1095x65355f89.c(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = this.f90729f.f90714w;
        if (c1095x65355f89 != null && c1095x65355f89.c(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        p012xc85e97e9.p016x746ad0e3.app.k kVar = this.f90729f;
        kVar.f90696e = charSequence;
        android.widget.TextView textView = kVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
