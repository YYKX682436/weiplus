package jf;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f380859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f380860e;

    public e(android.content.Context context, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        this.f380859d = context;
        this.f380860e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.m125854x26a183b(this.f380859d, "renderer: webview", 0).show();
        this.f380860e.t3().l0();
    }
}
