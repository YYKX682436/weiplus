package ry2;

/* loaded from: classes10.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f482937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f482938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ry2.q0 q0Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f482937d = q0Var;
        this.f482938e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostVideoWidget", "postToShowThumb");
        ry2.q0 q0Var = this.f482937d;
        q0Var.z(this.f482938e);
        android.widget.ImageView imageView = q0Var.f482983r;
        if (imageView != null) {
            imageView.setOnClickListener(new ry2.k0(q0Var));
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
        throw null;
    }
}
