package df2;

/* loaded from: classes3.dex */
public final class p8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f312580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f312582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f312583g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f312584h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f312585i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f312586m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f312587n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(android.graphics.Bitmap bitmap, df2.s8 s8Var, android.text.SpannableString spannableString, int i17, int i18, android.widget.TextView textView, long j17, boolean z17) {
        super(0);
        this.f312580d = bitmap;
        this.f312581e = s8Var;
        this.f312582f = spannableString;
        this.f312583g = i17;
        this.f312584h = i18;
        this.f312585i = textView;
        this.f312586m = j17;
        this.f312587n = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), this.f312580d);
        df2.s8 s8Var = this.f312581e;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) s8Var.C1).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) s8Var.C1).mo141623x754a37bb()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        java.lang.String str = s8Var.f312847x1;
        int length = str.length();
        int i17 = this.f312584h;
        android.text.SpannableString spannableString = this.f312582f;
        int i18 = this.f312583g;
        al5.w[] wVarArr = (al5.w[]) spannableString.getSpans(i18, length + i17, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                spannableString.removeSpan(wVar2);
            }
        }
        spannableString.setSpan(wVar, i18, i17 + str.length(), 33);
        android.widget.TextView textView = this.f312585i;
        textView.setText(spannableString);
        textView.invalidate();
        long j17 = this.f312586m;
        boolean z17 = this.f312587n;
        android.widget.TextView textView2 = s8Var.E;
        if (textView2 != null) {
            textView2.invalidate();
            textView2.post(new df2.p7(textView2, s8Var, j17, z17));
        }
        return jz5.f0.f384359a;
    }
}
