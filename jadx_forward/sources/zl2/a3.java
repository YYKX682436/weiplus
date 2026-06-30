package zl2;

/* loaded from: classes3.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f555178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(android.graphics.Bitmap bitmap, java.lang.String str) {
        super(0);
        this.f555178d = bitmap;
        this.f555179e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f555178d;
        if (bitmap != null) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).hj(this.f555179e, null, bitmap, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "resource is null!");
        }
        return jz5.f0.f384359a;
    }
}
