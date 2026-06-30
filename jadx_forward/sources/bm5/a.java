package bm5;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f104046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RemoteViews f104047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f104048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f104049g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104050h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104051i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f104053n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f104054o;

    public a(boolean z17, android.widget.RemoteViews remoteViews, android.content.Intent intent, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z18, boolean z19) {
        this.f104046d = z17;
        this.f104047e = remoteViews;
        this.f104048f = intent;
        this.f104049g = context;
        this.f104050h = str;
        this.f104051i = str2;
        this.f104052m = str3;
        this.f104053n = z18;
        this.f104054o = z19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f104046d || com.p314xaae8f345.mm.app.w.INSTANCE.f135422n || this.f104047e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use activity");
            this.f104048f.putExtra("Voip_Call_From", 1);
            android.content.Context context = this.f104049g;
            android.content.Intent intent = this.f104048f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use service");
        this.f104048f.putExtra("Voip_Call_From", 0);
        android.content.Context context2 = this.f104049g;
        android.content.Intent intent2 = this.f104048f;
        android.widget.RemoteViews remoteViews = this.f104047e;
        java.lang.String description = this.f104050h;
        java.lang.String str = this.f104051i;
        java.lang.String channelId = this.f104052m;
        boolean z17 = this.f104053n;
        boolean z18 = this.f104054o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent2, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channelId, "channelId");
        bm5.k0.a(context2, intent2, remoteViews, description, str, channelId, z17, z18);
    }
}
