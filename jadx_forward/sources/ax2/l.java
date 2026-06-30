package ax2;

/* loaded from: classes4.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f96595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f96596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15391xf2263481 f96597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f96598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f96599h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96600i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.widget.TextView textView, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15391xf2263481 c15391xf2263481, android.text.SpannableString spannableString, int i17, int i18) {
        super(0);
        this.f96595d = textView;
        this.f96596e = bitmap;
        this.f96597f = c15391xf2263481;
        this.f96598g = spannableString;
        this.f96599h = i17;
        this.f96600i = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int m62569xc409e08e;
        int m62569xc409e08e2;
        android.widget.TextView textView = this.f96595d;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(textView.getContext().getResources(), this.f96596e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15391xf2263481 c15391xf2263481 = this.f96597f;
        m62569xc409e08e = c15391xf2263481.m62569xc409e08e();
        m62569xc409e08e2 = c15391xf2263481.m62569xc409e08e();
        bitmapDrawable.setBounds(0, 0, m62569xc409e08e, m62569xc409e08e2);
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        android.text.SpannableString spannableString = this.f96598g;
        int i17 = this.f96599h;
        int i18 = this.f96600i;
        al5.w[] wVarArr = (al5.w[]) spannableString.getSpans(i17, i18, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                spannableString.removeSpan(wVar2);
            }
        }
        spannableString.setSpan(wVar, i17, i18, 33);
        textView.setText(spannableString);
        textView.invalidate();
        return jz5.f0.f384359a;
    }
}
