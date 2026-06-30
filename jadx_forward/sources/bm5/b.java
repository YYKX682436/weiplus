package bm5;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f104055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RemoteViews f104056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f104057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104059h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f104060i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104061m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104062n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f104063o;

    public b(boolean z17, android.widget.RemoteViews remoteViews, android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Context context, java.lang.String str3, java.lang.String str4, boolean z18) {
        this.f104055d = z17;
        this.f104056e = remoteViews;
        this.f104057f = intent;
        this.f104058g = str;
        this.f104059h = str2;
        this.f104060i = context;
        this.f104061m = str3;
        this.f104062n = str4;
        this.f104063o = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        if (!this.f104055d || com.p314xaae8f345.mm.app.w.INSTANCE.f135422n || this.f104056e == null) {
            this.f104057f.putExtra("startMethod", 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use activity");
            j45.l.j(this.f104060i, this.f104058g, this.f104059h, this.f104057f, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use service");
        this.f104057f.putExtra("startMethod", 0);
        java.lang.String str2 = "com.tencent.mm.plugin." + this.f104058g;
        if (r26.i0.A(this.f104059h, ".", false, 2, null)) {
            str = str2 + this.f104059h;
        } else {
            str = this.f104059h;
        }
        java.lang.String str3 = str;
        java.lang.Class.forName(str3, false, this.f104060i.getClassLoader());
        android.content.Context context = this.f104060i;
        android.content.Intent intent = this.f104057f;
        android.widget.RemoteViews remoteViews = this.f104056e;
        java.lang.String description = this.f104061m;
        java.lang.String channelId = this.f104062n;
        boolean z17 = this.f104063o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channelId, "channelId");
        bm5.k0.a(context, intent, remoteViews, description, str3, channelId, z17, true);
    }
}
