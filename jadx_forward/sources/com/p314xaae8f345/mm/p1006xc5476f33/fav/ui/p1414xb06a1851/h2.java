package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes5.dex */
public class h2 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7 f182267c;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7 activityC13594x1487ddc7, java.lang.String str, android.content.Context context) {
        this.f182267c = activityC13594x1487ddc7;
        this.f182265a = str;
        this.f182266b = context;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f182265a, str2);
        dp.a.m125854x26a183b(this.f182267c.mo55332x76847179(), this.f182266b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7b, q75.c.c(str2)), 1).show();
        q75.c.f(str2, this.f182267c.mo55332x76847179());
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.g2(this, str2));
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f182265a, str2);
        android.content.Context context = this.f182266b;
        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7a), 1).show();
    }
}
