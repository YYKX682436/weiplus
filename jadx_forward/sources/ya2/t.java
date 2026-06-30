package ya2;

/* loaded from: classes5.dex */
public final class t implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f542067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542068b;

    public t(java.lang.CharSequence charSequence, android.content.Context context) {
        this.f542067a = charSequence;
        this.f542068b = context;
    }

    @Override // db5.l4
    public final void a(android.widget.TextView titleTV, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleTV, "titleTV");
        titleTV.setText(this.f542067a);
        titleTV.setMaxLines(1);
        titleTV.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.view.ViewGroup.LayoutParams layoutParams = titleTV.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f542068b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        }
    }
}
