package cg2;

/* loaded from: classes3.dex */
public final class b0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cg2.a f41081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.yh1 f41082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cg2.c0 f41083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f41084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al5.w f41085e;

    public b0(cg2.a aVar, r45.yh1 yh1Var, cg2.c0 c0Var, android.text.SpannableStringBuilder spannableStringBuilder, al5.w wVar) {
        this.f41081a = aVar;
        this.f41082b = yh1Var;
        this.f41083c = c0Var;
        this.f41084d = spannableStringBuilder;
        this.f41085e = wVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new cg2.a0(this.f41081a, this.f41082b, this.f41083c, bitmap, this.f41084d, this.f41085e));
        } else {
            com.tencent.mars.xlog.Log.w("LiveFeedTextDanmakuRender", "[load giftThumbUrl] resource not found");
        }
    }
}
