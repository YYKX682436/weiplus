package df2;

/* loaded from: classes10.dex */
public final class gs implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f311779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.h f311781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311782g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.bm1 f311783h;

    public gs(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.String str, dk2.h hVar, df2.lt ltVar, r45.bm1 bm1Var) {
        this.f311779d = f0Var;
        this.f311780e = str;
        this.f311781f = hVar;
        this.f311782g = ltVar;
        this.f311783h = bm1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f311779d.f391649d == 1) {
            java.lang.String str = this.f311780e;
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            df2.lt ltVar = this.f311782g;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311781f, ltVar.f312243r)) {
                java.lang.String str2 = df2.lt.W;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "need preload  webview");
                df2.lt.a7(ltVar, str, this.f311783h);
            }
        }
    }
}
