package wa2;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f525663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f525664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f525665f;

    public k(android.widget.ImageView imageView, yz5.a aVar, android.app.Activity activity, android.content.Intent intent) {
        this.f525663d = aVar;
        this.f525664e = activity;
        this.f525665f = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa2.u.f525714d.getClass();
        this.f525663d.mo152xb9724478();
        this.f525664e.overridePendingTransition(0, 0);
        this.f525665f.removeExtra("key_intent_animating_flag");
    }
}
