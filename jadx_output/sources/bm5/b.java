package bm5;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RemoteViews f22523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f22524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f22527i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22529n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f22530o;

    public b(boolean z17, android.widget.RemoteViews remoteViews, android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Context context, java.lang.String str3, java.lang.String str4, boolean z18) {
        this.f22522d = z17;
        this.f22523e = remoteViews;
        this.f22524f = intent;
        this.f22525g = str;
        this.f22526h = str2;
        this.f22527i = context;
        this.f22528m = str3;
        this.f22529n = str4;
        this.f22530o = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        if (!this.f22522d || com.tencent.mm.app.w.INSTANCE.f53889n || this.f22523e == null) {
            this.f22524f.putExtra("startMethod", 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use activity");
            j45.l.j(this.f22527i, this.f22525g, this.f22526h, this.f22524f, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use service");
        this.f22524f.putExtra("startMethod", 0);
        java.lang.String str2 = "com.tencent.mm.plugin." + this.f22525g;
        if (r26.i0.A(this.f22526h, ".", false, 2, null)) {
            str = str2 + this.f22526h;
        } else {
            str = this.f22526h;
        }
        java.lang.String str3 = str;
        java.lang.Class.forName(str3, false, this.f22527i.getClassLoader());
        android.content.Context context = this.f22527i;
        android.content.Intent intent = this.f22524f;
        android.widget.RemoteViews remoteViews = this.f22523e;
        java.lang.String description = this.f22528m;
        java.lang.String channelId = this.f22529n;
        boolean z17 = this.f22530o;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(channelId, "channelId");
        bm5.k0.a(context, intent, remoteViews, description, str3, channelId, z17, true);
    }
}
