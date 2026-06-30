package cg2;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cg2.a f41073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yh1 f41074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg2.c0 f41075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f41076g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f41077h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ al5.w f41078i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(cg2.a aVar, r45.yh1 yh1Var, cg2.c0 c0Var, android.graphics.Bitmap bitmap, android.text.SpannableStringBuilder spannableStringBuilder, al5.w wVar) {
        super(0);
        this.f41073d = aVar;
        this.f41074e = yh1Var;
        this.f41075f = c0Var;
        this.f41076g = bitmap;
        this.f41077h = spannableStringBuilder;
        this.f41078i = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cg2.a aVar = this.f41073d;
        if (kotlin.jvm.internal.o.b(aVar.f41068d.getTag(), this.f41074e.getString(4))) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f41075f.f41093a.getResources(), this.f41076g);
            cg2.z zVar = cg2.c0.f41091d;
            bitmapDrawable.setBounds(0, 0, zVar.a(), zVar.a());
            al5.w wVar = new al5.w(bitmapDrawable, 1);
            android.text.SpannableStringBuilder spannableStringBuilder = this.f41077h;
            al5.w wVar2 = this.f41078i;
            int spanStart = spannableStringBuilder.getSpanStart(wVar2);
            int spanEnd = spannableStringBuilder.getSpanEnd(wVar2);
            if (spanStart == -1 || spanEnd == -1) {
                com.tencent.mars.xlog.Log.w("LiveFeedTextDanmakuRender", "[load giftThumbUrl] placeholderImageSpan not found");
            } else {
                spannableStringBuilder.removeSpan(wVar2);
                spannableStringBuilder.setSpan(wVar, spanStart, spanEnd, 33);
                aVar.f41069e.setText(spannableStringBuilder);
            }
        }
        return jz5.f0.f302826a;
    }
}
