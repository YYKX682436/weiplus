package bm5;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f22544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f22545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22546g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22547h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22548i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f22549m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z18) {
        super(0);
        this.f22543d = z17;
        this.f22544e = context;
        this.f22545f = intent;
        this.f22546g = str;
        this.f22547h = str2;
        this.f22548i = str3;
        this.f22549m = z18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!this.f22543d || com.tencent.mm.app.w.INSTANCE.f53889n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use activity");
            android.content.Context context = this.f22544e;
            android.content.Intent intent = this.f22545f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$startActivity$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$startActivity$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use service");
            android.content.Context context2 = this.f22544e;
            android.content.Intent intent2 = this.f22545f;
            java.lang.String description = this.f22546g;
            java.lang.String str = this.f22547h;
            java.lang.String channelId = this.f22548i;
            boolean z17 = this.f22549m;
            kotlin.jvm.internal.o.g(context2, "context");
            kotlin.jvm.internal.o.g(intent2, "intent");
            kotlin.jvm.internal.o.g(description, "description");
            kotlin.jvm.internal.o.g(channelId, "channelId");
            bm5.k0.a(context2, intent2, null, description, str, channelId, z17, true);
        }
        return jz5.f0.f302826a;
    }
}
