package ax2;

/* loaded from: classes4.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b f96576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f96577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f96578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f96579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f96580h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f96581i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b, android.graphics.Bitmap bitmap, android.text.SpannableString spannableString, int i17, int i18, android.widget.TextView textView) {
        super(0);
        this.f96576d = c15393xd4ca7d1b;
        this.f96577e = bitmap;
        this.f96578f = spannableString;
        this.f96579g = i17;
        this.f96580h = i18;
        this.f96581i = textView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b = this.f96576d;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(c15393xd4ca7d1b.getContext().getResources(), this.f96577e);
        bitmapDrawable.setBounds(0, 0, c15393xd4ca7d1b.m62592xc409e08e(), c15393xd4ca7d1b.m62592xc409e08e());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        android.text.SpannableString spannableString = this.f96578f;
        int i17 = this.f96579g;
        int i18 = this.f96580h;
        al5.w[] wVarArr = (al5.w[]) spannableString.getSpans(i17, i18, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                spannableString.removeSpan(wVar2);
            }
        }
        spannableString.setSpan(wVar, i17, i18, 33);
        android.widget.TextView textView = this.f96581i;
        textView.setText(spannableString);
        textView.invalidate();
        return jz5.f0.f384359a;
    }
}
