package bm5;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RemoteViews f22514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f22515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f22516g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22517h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22518i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22519m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f22520n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f22521o;

    public a(boolean z17, android.widget.RemoteViews remoteViews, android.content.Intent intent, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z18, boolean z19) {
        this.f22513d = z17;
        this.f22514e = remoteViews;
        this.f22515f = intent;
        this.f22516g = context;
        this.f22517h = str;
        this.f22518i = str2;
        this.f22519m = str3;
        this.f22520n = z18;
        this.f22521o = z19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f22513d || com.tencent.mm.app.w.INSTANCE.f53889n || this.f22514e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use activity");
            this.f22515f.putExtra("Voip_Call_From", 1);
            android.content.Context context = this.f22516g;
            android.content.Intent intent = this.f22515f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use service");
        this.f22515f.putExtra("Voip_Call_From", 0);
        android.content.Context context2 = this.f22516g;
        android.content.Intent intent2 = this.f22515f;
        android.widget.RemoteViews remoteViews = this.f22514e;
        java.lang.String description = this.f22517h;
        java.lang.String str = this.f22518i;
        java.lang.String channelId = this.f22519m;
        boolean z17 = this.f22520n;
        boolean z18 = this.f22521o;
        kotlin.jvm.internal.o.g(context2, "context");
        kotlin.jvm.internal.o.g(intent2, "intent");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(channelId, "channelId");
        bm5.k0.a(context2, intent2, remoteViews, description, str, channelId, z17, z18);
    }
}
