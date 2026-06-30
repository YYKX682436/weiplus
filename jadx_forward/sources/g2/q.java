package g2;

/* loaded from: classes14.dex */
public abstract class q {
    public static final android.view.inputmethod.ExtractedText a(g2.e0 e0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e0Var, "<this>");
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        a2.d dVar = e0Var.f349226a;
        java.lang.String str = dVar.f82214d;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j17 = e0Var.f349227b;
        extractedText.selectionStart = a2.m1.f(j17);
        extractedText.selectionEnd = a2.m1.e(j17);
        extractedText.flags = !r26.n0.C(dVar.f82214d, '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
