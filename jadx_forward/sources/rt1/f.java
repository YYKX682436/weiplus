package rt1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f480935d;

    public f(rt1.l lVar) {
        this.f480935d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView[] textViewArr = this.f480935d.f480982f;
        if (textViewArr == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("charViews");
            throw null;
        }
        android.widget.TextView textView = textViewArr[7];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        textView.setText("");
    }
}
