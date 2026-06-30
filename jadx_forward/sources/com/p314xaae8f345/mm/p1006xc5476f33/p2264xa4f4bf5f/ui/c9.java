package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class c9 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e8 f255304c;

    public c9(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e8 e8Var) {
        this.f255302a = str;
        this.f255303b = activityC18639xf6f98078;
        this.f255304c = e8Var;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "trydownload imgback end:" + this.f255302a + " path:" + str2 + " bitmap:" + bitmap + " exist:" + j17 + " len:" + com.p314xaae8f345.mm.vfs.w6.k(str2));
        if (bitmap == null) {
            ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.y8(this.f255303b));
            return;
        }
        if (j17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255303b;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
            activityC18639xf6f98078.t7(str2, 1);
            this.f255303b.Q7();
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e8 e8Var = this.f255304c;
            if (e8Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j9) e8Var).a(str2);
            }
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a9(bitmap, str2, this.f255303b, this.f255304c));
        }
        ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b9(this.f255303b));
    }
}
