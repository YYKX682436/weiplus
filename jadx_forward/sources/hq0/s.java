package hq0;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f364593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ iq0.e f364594h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hq0.b0 b0Var, java.lang.String str, java.lang.String str2, android.graphics.Rect rect, iq0.e eVar) {
        super(0);
        this.f364590d = b0Var;
        this.f364591e = str;
        this.f364592f = str2;
        this.f364593g = rect;
        this.f364594h = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hq0.b0 b0Var = this.f364590d;
        java.lang.String str = b0Var.f364503x.f375167a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload, bizName: ");
        sb6.append(str);
        sb6.append(", frameSetName: ");
        java.lang.String str2 = this.f364591e;
        sb6.append(str2);
        sb6.append(", frameSetData.len: ");
        java.lang.String str3 = this.f364592f;
        sb6.append(str3.length());
        sb6.append(", containerRect: ");
        android.graphics.Rect rect = this.f364593g;
        sb6.append(rect);
        sb6.append(", bizConfig: ");
        sb6.append(b0Var.f364503x);
        sb6.append(", rootConfig: ");
        iq0.e eVar = this.f364594h;
        sb6.append(eVar);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str4 = b0Var.f364504y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb7);
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str3.length() == 0)) {
                java.lang.String a17 = vq0.b.a(b0Var, eVar.f375190a, str2);
                if (((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(str, a17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "preload, cover already exists, frameSetName: ".concat(a17));
                } else {
                    jc3.j0 j0Var = b0Var.f364528g;
                    if (j0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "preload but magicBrush null!");
                    } else {
                        java.lang.String str5 = vq0.b.c(((rc3.w0) j0Var).f475620e) + '-' + a17;
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b0Var.F;
                        if (concurrentHashMap.containsKey(str5)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "preload, already in preloading and not expired, frameSetName: ".concat(str2));
                        } else if (concurrentHashMap.size() >= b0Var.G) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "preload, reach preload limit, frameSetName: " + str2 + ", size: " + concurrentHashMap.size());
                        } else {
                            if (!b0Var.H) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "preload, create biz bizName: ".concat(str));
                                b0Var.a2(true);
                            }
                            if (b0Var.C.get(eVar.a()) == null) {
                                b0Var.R1(eVar, true);
                            }
                            concurrentHashMap.put(str5, new hq0.j(this.f364594h, this.f364591e, this.f364592f, this.f364593g, java.lang.System.currentTimeMillis()));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "innerGenerateCover real Start Preload");
                            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                            frameLayout.layout(rect.left, rect.top, rect.width(), rect.height());
                            iq0.e eVar2 = this.f364594h;
                            java.lang.String str6 = this.f364591e;
                            java.lang.String str7 = this.f364592f;
                            b0Var.getClass();
                            d75.b.g(new hq0.q(b0Var, eVar2, str6, frameLayout, true, null, 0, str7));
                            ((mq0.v0) ((mq0.e0) i95.n0.c(mq0.e0.class))).wi("preloadCover", "begin", a17, str, eVar.f375190a, this.f364591e, "");
                            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new hq0.r(this.f364590d, str5, this.f364591e, a17, str, this.f364594h, null), 3, null);
                        }
                    }
                }
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "preload, invalid data");
        return jz5.f0.f384359a;
    }
}
