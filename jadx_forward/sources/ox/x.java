package ox;

/* loaded from: classes11.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox.z f431065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f431066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f431067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv.e3 f431068g;

    public x(ox.z zVar, l81.b1 b1Var, android.content.Context context, rv.e3 e3Var) {
        this.f431065d = zVar;
        this.f431066e = b1Var;
        this.f431067f = context;
        this.f431068g = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pm0.v.X(new ox.w(this.f431065d, this.f431067f, ox.z.wi(this.f431065d, this.f431066e), this.f431068g, this.f431066e));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPublishRichEditorService", "launchNewImageEditorWithOpenBundle: makeLaunchInfo failed, e=" + e17);
        }
    }
}
