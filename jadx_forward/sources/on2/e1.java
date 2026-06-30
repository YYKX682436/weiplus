package on2;

/* loaded from: classes3.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f428421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z0 f428422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f428424g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f428425h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(android.graphics.Bitmap bitmap, on2.z0 z0Var, java.lang.String str, on2.j1 j1Var, r45.dz1 dz1Var) {
        super(0);
        this.f428421d = bitmap;
        this.f428422e = z0Var;
        this.f428423f = str;
        this.f428424g = j1Var;
        this.f428425h = dz1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        on2.z0 z0Var = this.f428422e;
        android.graphics.Bitmap bitmap = this.f428421d;
        if (bitmap != null) {
            z0Var.f428618m.setImageBitmap(bitmap);
            android.widget.ImageView imageView = z0Var.f428618m;
            imageView.setVisibility(0);
            imageView.setOnClickListener(new on2.d1(this.f428424g, z0Var, this.f428425h));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryPanelListAdapter", this.f428423f + " resource is null");
            z0Var.f428618m.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
