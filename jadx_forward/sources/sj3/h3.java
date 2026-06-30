package sj3;

/* loaded from: classes4.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f490081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f490082e;

    public h3(android.graphics.Bitmap bitmap, android.content.Context context) {
        this.f490081d = bitmap;
        this.f490082e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17 = q75.c.a("jpg");
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(this.f490081d, 100, android.graphics.Bitmap.CompressFormat.JPEG, a17, true);
        android.content.Context context = this.f490082e;
        if (!D0) {
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i87), 1).show();
        } else if (D0) {
            q75.c.g(a17, context);
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8b, q75.c.d()), 1).show();
        }
    }
}
