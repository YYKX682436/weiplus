package cg2;

/* loaded from: classes3.dex */
public final class b0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cg2.a f122614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.yh1 f122615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cg2.c0 f122616c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f122617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al5.w f122618e;

    public b0(cg2.a aVar, r45.yh1 yh1Var, cg2.c0 c0Var, android.text.SpannableStringBuilder spannableStringBuilder, al5.w wVar) {
        this.f122614a = aVar;
        this.f122615b = yh1Var;
        this.f122616c = c0Var;
        this.f122617d = spannableStringBuilder;
        this.f122618e = wVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new cg2.a0(this.f122614a, this.f122615b, this.f122616c, bitmap, this.f122617d, this.f122618e));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveFeedTextDanmakuRender", "[load giftThumbUrl] resource not found");
        }
    }
}
