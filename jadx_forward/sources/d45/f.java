package d45;

/* loaded from: classes3.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.widget.TextView textView, int i17) {
        if (textView == null) {
            return;
        }
        if (i17 < 0) {
            textView.setText("--:--");
            return;
        }
        int round = java.lang.Math.round(i17 / 1000.0f);
        java.lang.String valueOf = java.lang.String.valueOf(round % 60);
        if (valueOf.length() < 2) {
            valueOf = "0".concat(valueOf);
        }
        textView.setText((round / 60) + ':' + valueOf);
    }
}
