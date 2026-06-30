package rt1;

/* loaded from: classes7.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f480958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(rt1.l lVar) {
        super(0);
        this.f480958d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (int i17 = 0; i17 < 7; i17++) {
            android.widget.TextView[] textViewArr = this.f480958d.f480982f;
            if (textViewArr == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("charViews");
                throw null;
            }
            android.widget.TextView textView = textViewArr[i17];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            java.lang.CharSequence text = textView.getText();
            if (text == null || text.length() == 0) {
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
