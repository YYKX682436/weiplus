package cg2;

/* loaded from: classes3.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cg2.a f122606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yh1 f122607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg2.c0 f122608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f122609g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f122610h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ al5.w f122611i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(cg2.a aVar, r45.yh1 yh1Var, cg2.c0 c0Var, android.graphics.Bitmap bitmap, android.text.SpannableStringBuilder spannableStringBuilder, al5.w wVar) {
        super(0);
        this.f122606d = aVar;
        this.f122607e = yh1Var;
        this.f122608f = c0Var;
        this.f122609g = bitmap;
        this.f122610h = spannableStringBuilder;
        this.f122611i = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cg2.a aVar = this.f122606d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f122601d.getTag(), this.f122607e.m75945x2fec8307(4))) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f122608f.f122626a.getResources(), this.f122609g);
            cg2.z zVar = cg2.c0.f122624d;
            bitmapDrawable.setBounds(0, 0, zVar.a(), zVar.a());
            al5.w wVar = new al5.w(bitmapDrawable, 1);
            android.text.SpannableStringBuilder spannableStringBuilder = this.f122610h;
            al5.w wVar2 = this.f122611i;
            int spanStart = spannableStringBuilder.getSpanStart(wVar2);
            int spanEnd = spannableStringBuilder.getSpanEnd(wVar2);
            if (spanStart == -1 || spanEnd == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveFeedTextDanmakuRender", "[load giftThumbUrl] placeholderImageSpan not found");
            } else {
                spannableStringBuilder.removeSpan(wVar2);
                spannableStringBuilder.setSpan(wVar, spanStart, spanEnd, 33);
                aVar.f122602e.setText(spannableStringBuilder);
            }
        }
        return jz5.f0.f384359a;
    }
}
