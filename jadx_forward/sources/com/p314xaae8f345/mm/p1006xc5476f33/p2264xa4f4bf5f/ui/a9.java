package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class a9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f255253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e8 f255256g;

    public a9(android.graphics.Bitmap bitmap, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e8 e8Var) {
        this.f255253d = bitmap;
        this.f255254e = str;
        this.f255255f = activityC18639xf6f98078;
        this.f255256g = e8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String path = this.f255254e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "$path");
        dj4.w.c(this.f255253d, path);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255255f;
        activityC18639xf6f98078.q7().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.z8(activityC18639xf6f98078, path, this.f255256g));
    }
}
