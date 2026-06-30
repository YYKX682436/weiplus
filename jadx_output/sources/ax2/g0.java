package ax2;

/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView f15043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f15044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f15045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15046g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15047h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f15048i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView, android.graphics.Bitmap bitmap, android.text.SpannableString spannableString, int i17, int i18, android.widget.TextView textView) {
        super(0);
        this.f15043d = livePkCritDoingView;
        this.f15044e = bitmap;
        this.f15045f = spannableString;
        this.f15046g = i17;
        this.f15047h = i18;
        this.f15048i = textView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView = this.f15043d;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(livePkCritDoingView.getContext().getResources(), this.f15044e);
        bitmapDrawable.setBounds(0, 0, livePkCritDoingView.getGIFT_ICON_SIZE(), livePkCritDoingView.getGIFT_ICON_SIZE());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        android.text.SpannableString spannableString = this.f15045f;
        int i17 = this.f15046g;
        int i18 = this.f15047h;
        al5.w[] wVarArr = (al5.w[]) spannableString.getSpans(i17, i18, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                spannableString.removeSpan(wVar2);
            }
        }
        spannableString.setSpan(wVar, i17, i18, 33);
        android.widget.TextView textView = this.f15048i;
        textView.setText(spannableString);
        textView.invalidate();
        return jz5.f0.f302826a;
    }
}
