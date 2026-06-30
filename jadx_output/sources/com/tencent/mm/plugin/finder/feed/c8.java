package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class c8 implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f106460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f106462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f106464f;

    public c8(java.lang.String str, com.tencent.mm.plugin.finder.feed.f8 f8Var, java.lang.String str2, android.widget.TextView textView, int i17, int i18) {
        this.f106459a = str;
        this.f106460b = f8Var;
        this.f106461c = str2;
        this.f106462d = textView;
        this.f106463e = i17;
        this.f106464f = i18;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", "setImageDownloadListener iconUrl:" + this.f106459a + " success：" + z17);
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.b8(z17, this.f106460b, this.f106461c, this.f106462d, this.f106463e, this.f106464f));
    }
}
