package ty2;

/* loaded from: classes9.dex */
public final class h extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f504600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f504642i, config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(12.0f);
        textView.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f504600d = textView;
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (item.X == 0) {
            return null;
        }
        android.widget.TextView textView = this.f504600d;
        textView.setText(item.m12793x6e095e9(8) ? item.f113482n : "");
        return textView;
    }
}
