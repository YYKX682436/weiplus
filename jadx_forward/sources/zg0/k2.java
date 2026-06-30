package zg0;

/* loaded from: classes8.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final zg0.p2 f554281a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f554282b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f554283c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f554284d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f554285e;

    /* renamed from: f, reason: collision with root package name */
    public int f554286f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f554287g;

    public k2(zg0.p2 webViewOptions, boolean z17, boolean z18, boolean z19, boolean z27, int i17, boolean z28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewOptions, "webViewOptions");
        this.f554281a = webViewOptions;
        this.f554282b = z17;
        this.f554283c = z18;
        this.f554284d = z19;
        this.f554285e = z27;
        this.f554286f = i17;
        this.f554287g = z28;
    }

    public /* synthetic */ k2(zg0.p2 p2Var, boolean z17, boolean z18, boolean z19, boolean z27, int i17, boolean z28, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? new zg0.p2(new android.content.Intent()) : p2Var, (i18 & 2) != 0 ? false : z17, (i18 & 4) != 0 ? true : z18, (i18 & 8) == 0 ? z19 : true, (i18 & 16) != 0 ? false : z27, (i18 & 32) != 0 ? 0 : i17, (i18 & 64) == 0 ? z28 : false);
    }
}
