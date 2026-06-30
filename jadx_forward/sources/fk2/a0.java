package fk2;

/* loaded from: classes3.dex */
public final class a0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f344826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f344829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f344831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f344832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f344833h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344834i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344835j;

    public a0(bm2.h1 h1Var, java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var, int i17, int i18, boolean z17, fk2.g0 g0Var, java.lang.String str2, java.lang.String str3) {
        this.f344826a = h1Var;
        this.f344827b = str;
        this.f344828c = context;
        this.f344829d = f0Var;
        this.f344830e = i17;
        this.f344831f = i18;
        this.f344832g = z17;
        this.f344833h = g0Var;
        this.f344834i = str2;
        this.f344835j = str3;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        bm2.h1 h1Var = this.f344826a;
        java.lang.Object tag = h1Var.f3639x46306858.getTag();
        java.lang.String str = this.f344827b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, str)) {
            if (bitmap != null) {
                pm0.v.X(new fk2.z(this.f344828c, bitmap, this.f344829d, this.f344830e, this.f344831f, this.f344832g, this.f344826a, this.f344833h, this.f344834i, this.f344835j));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentItemComboLiveReward", "onBindComboLiveRewardMsg resource is null!");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentItemComboLiveReward", "onBindComboLiveRewardMsg tag:" + h1Var.f3639x46306858.getTag() + ",payload id:" + str);
    }
}
