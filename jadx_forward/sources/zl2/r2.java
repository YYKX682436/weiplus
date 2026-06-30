package zl2;

/* loaded from: classes.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f555478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f555479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(android.graphics.Bitmap bitmap, yz5.l lVar, java.lang.String str) {
        super(0);
        this.f555478d = bitmap;
        this.f555479e = lVar;
        this.f555480f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPlayerBackground bitmap: ");
        android.graphics.Bitmap bitmap = this.f555478d;
        sb6.append(bitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", sb6.toString());
        if (bitmap != null) {
            this.f555479e.mo146xb9724478(bitmap);
            ((java.util.HashMap) zl2.r4.f555493k).put(this.f555480f, bitmap);
        }
        return jz5.f0.f384359a;
    }
}
