package df2;

/* loaded from: classes3.dex */
public final class q8 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f312672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f312673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f312674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f312675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f312676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f312677g;

    public q8(df2.s8 s8Var, android.text.SpannableString spannableString, int i17, int i18, android.widget.TextView textView, long j17, boolean z17) {
        this.f312671a = s8Var;
        this.f312672b = spannableString;
        this.f312673c = i17;
        this.f312674d = i18;
        this.f312675e = textView;
        this.f312676f = j17;
        this.f312677g = z17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new df2.p8(bitmap, this.f312671a, this.f312672b, this.f312673c, this.f312674d, this.f312675e, this.f312676f, this.f312677g));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312671a.f312832m, "resource is null!");
        }
    }
}
