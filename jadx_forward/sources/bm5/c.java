package bm5;

/* loaded from: classes11.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f104076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f104077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f104078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104079g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104080h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104081i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f104082m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z18) {
        super(0);
        this.f104076d = z17;
        this.f104077e = context;
        this.f104078f = intent;
        this.f104079g = str;
        this.f104080h = str2;
        this.f104081i = str3;
        this.f104082m = z18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (!this.f104076d || com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use activity");
            android.content.Context context = this.f104077e;
            android.content.Intent intent = this.f104078f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$startActivity$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/util/ActivityHelper$checkAndStartActivityWithoutOp$startActivity$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityHelper", "start permission notification in Q and use service");
            android.content.Context context2 = this.f104077e;
            android.content.Intent intent2 = this.f104078f;
            java.lang.String description = this.f104079g;
            java.lang.String str = this.f104080h;
            java.lang.String channelId = this.f104081i;
            boolean z17 = this.f104082m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent2, "intent");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channelId, "channelId");
            bm5.k0.a(context2, intent2, null, description, str, channelId, z17, true);
        }
        return jz5.f0.f384359a;
    }
}
