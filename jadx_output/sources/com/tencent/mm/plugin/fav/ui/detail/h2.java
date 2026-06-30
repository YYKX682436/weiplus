package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes5.dex */
public class h2 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f100733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI f100734c;

    public h2(com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI favoriteVideoPlayUI, java.lang.String str, android.content.Context context) {
        this.f100734c = favoriteVideoPlayUI;
        this.f100732a = str;
        this.f100733b = context;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f100732a, str2);
        dp.a.makeText(this.f100734c.getContext(), this.f100733b.getString(com.tencent.mm.R.string.k7b, q75.c.c(str2)), 1).show();
        q75.c.f(str2, this.f100734c.getContext());
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.fav.ui.detail.g2(this, str2));
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f100732a, str2);
        android.content.Context context = this.f100733b;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.k7a), 1).show();
    }
}
