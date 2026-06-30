package sj3;

/* loaded from: classes12.dex */
public final class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f490155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f490156e;

    public l3(android.graphics.Bitmap bitmap, android.content.Context context) {
        this.f490155d = bitmap;
        this.f490156e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17 = q75.c.a("jpg");
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(this.f490155d, 100, android.graphics.Bitmap.CompressFormat.JPEG, a17, true);
        android.content.Context context = this.f490156e;
        if (!D0) {
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i87), 1).show();
            return;
        }
        if (D0) {
            q75.c.g(a17, context);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C;
            if (zVar != null) {
                zVar.J5(a17);
            }
        }
    }
}
