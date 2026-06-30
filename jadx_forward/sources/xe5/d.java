package xe5;

/* loaded from: classes3.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.f f535539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f535541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f535542g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f535543h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535544i;

    public d(xe5.f fVar, java.lang.String str, long j17, yb5.d dVar, long j18, xe5.i iVar) {
        this.f535539d = fVar;
        this.f535540e = str;
        this.f535541f = j17;
        this.f535542g = dVar;
        this.f535543h = j18;
        this.f535544i = iVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        xe5.f fVar = this.f535539d;
        fVar.getClass();
        xe5.i iVar = this.f535544i;
        java.lang.String str = this.f535540e;
        if (itemId == 2) {
            if (str != null) {
                long j17 = this.f535541f;
                long j18 = this.f535543h;
                s40.o0 o0Var = (s40.o0) i95.n0.c(s40.o0.class);
                s40.o0 o0Var2 = (s40.o0) i95.n0.c(s40.o0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                pq5.g l17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a) o0Var).wi(j17, j18, 3, ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a) o0Var2).Ai(str, false)).l();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
                pm0.v.T(l17, new xe5.b(fVar, str, iVar));
                return;
            }
            return;
        }
        fVar.getClass();
        if (itemId == 3) {
            if (str != null) {
                long j19 = this.f535541f;
                long j27 = this.f535543h;
                s40.o0 o0Var3 = (s40.o0) i95.n0.c(s40.o0.class);
                s40.o0 o0Var4 = (s40.o0) i95.n0.c(s40.o0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                pq5.g l18 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a) o0Var3).wi(j19, j27, 3, ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a) o0Var4).Ai(str, true)).l();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l18, "run(...)");
                pm0.v.T(l18, new xe5.c(fVar, str, iVar));
                return;
            }
            return;
        }
        fVar.getClass();
        if (itemId == 1) {
            fVar.getClass();
            java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=62&liveid=%s&liveidentityid=%s&wechat_real_lang=%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(this.f535541f), str, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f535555h, "go to complain page");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.h(intent, this.f535542g.x());
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
