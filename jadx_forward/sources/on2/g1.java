package on2;

/* loaded from: classes3.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f428447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z0 f428448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428449f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.graphics.Bitmap bitmap, on2.z0 z0Var, java.lang.String str) {
        super(0);
        this.f428447d = bitmap;
        this.f428448e = z0Var;
        this.f428449f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        on2.z0 z0Var = this.f428448e;
        android.graphics.Bitmap bitmap = this.f428447d;
        if (bitmap != null) {
            z0Var.f428618m.setImageBitmap(bitmap);
            android.widget.ImageView imageView = z0Var.f428618m;
            imageView.setVisibility(0);
            imageView.setOnClickListener(null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryPanelListAdapter", this.f428449f + " resource is null");
            z0Var.f428618m.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
