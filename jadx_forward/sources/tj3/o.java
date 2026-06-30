package tj3;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f501314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tj3.p pVar) {
        super(0);
        this.f501314d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView = new android.widget.TextView(this.f501314d.f501315a);
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        textView.setGravity(8388627);
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setTextSize(1, 17.0f);
        textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231));
        textView.setVisibility(4);
        return textView;
    }
}
