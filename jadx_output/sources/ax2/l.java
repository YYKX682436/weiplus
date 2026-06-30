package ax2;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f15062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f15063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView f15064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f15065g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15066h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15067i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.widget.TextView textView, android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView, android.text.SpannableString spannableString, int i17, int i18) {
        super(0);
        this.f15062d = textView;
        this.f15063e = bitmap;
        this.f15064f = livePkCritAnounceView;
        this.f15065g = spannableString;
        this.f15066h = i17;
        this.f15067i = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int gift_icon_size;
        int gift_icon_size2;
        android.widget.TextView textView = this.f15062d;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(textView.getContext().getResources(), this.f15063e);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView = this.f15064f;
        gift_icon_size = livePkCritAnounceView.getGIFT_ICON_SIZE();
        gift_icon_size2 = livePkCritAnounceView.getGIFT_ICON_SIZE();
        bitmapDrawable.setBounds(0, 0, gift_icon_size, gift_icon_size2);
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        android.text.SpannableString spannableString = this.f15065g;
        int i17 = this.f15066h;
        int i18 = this.f15067i;
        al5.w[] wVarArr = (al5.w[]) spannableString.getSpans(i17, i18, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                spannableString.removeSpan(wVar2);
            }
        }
        spannableString.setSpan(wVar, i17, i18, 33);
        textView.setText(spannableString);
        textView.invalidate();
        return jz5.f0.f302826a;
    }
}
