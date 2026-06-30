package jf;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f380865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f380866e;

    public h(android.content.Context context, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        this.f380865d = context;
        this.f380866e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.m125854x26a183b(this.f380865d, "renderer: auto", 0).show();
        this.f380866e.t3().l0();
    }
}
