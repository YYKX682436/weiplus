package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes8.dex */
public class q implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d f182313b;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d, java.lang.String str) {
        this.f182313b = activityC13590x9555381d;
        this.f182312a = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteFileDetailUI", "%d save video now video path %s out path %s", java.lang.Integer.valueOf(hashCode()), this.f182312a, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182313b;
        android.widget.Toast.makeText(activityC13590x9555381d.mo55332x76847179(), activityC13590x9555381d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7b, q75.c.c(str2)), 1).show();
        q75.c.f(str2, activityC13590x9555381d.mo55332x76847179());
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteFileDetailUI", "%d save video now video path %s out path %s", java.lang.Integer.valueOf(hashCode()), this.f182312a, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182313b;
        android.widget.Toast.makeText(activityC13590x9555381d.mo55332x76847179(), activityC13590x9555381d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7a), 1).show();
    }
}
