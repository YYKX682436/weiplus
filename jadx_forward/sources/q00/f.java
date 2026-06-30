package q00;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f440783f = jz5.h.b(q00.c.f440780d);

    /* renamed from: a, reason: collision with root package name */
    public bw5.c7 f440784a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f440785b;

    /* renamed from: c, reason: collision with root package name */
    public ep0.e f440786c;

    /* renamed from: d, reason: collision with root package name */
    public final vo0.d f440787d = (vo0.d) ((jz5.n) f440783f).mo141623x754a37bb();

    /* renamed from: e, reason: collision with root package name */
    public float f440788e;

    public final void a() {
        android.widget.ImageView imageView;
        bw5.c7 c7Var = this.f440784a;
        java.lang.String b17 = c7Var != null ? c7Var.b() : null;
        if (b17 == null || b17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsImgLoader", "url is empty");
            return;
        }
        bw5.c7 c7Var2 = this.f440784a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c7Var2);
        wo0.c a17 = this.f440787d.a(new q00.h(c7Var2));
        ep0.e eVar = this.f440786c;
        if (eVar != null) {
            a17.getClass();
            a17.f529406d = eVar;
        }
        if (this.f440788e > 0.0f && (imageView = this.f440785b) != null) {
            if (imageView != null) {
                imageView.setOutlineProvider(new q00.d(this));
            }
            android.widget.ImageView imageView2 = this.f440785b;
            if (imageView2 != null) {
                imageView2.setClipToOutline(true);
            }
        }
        android.widget.ImageView imageView3 = this.f440785b;
        if (imageView3 == null) {
            a17.a();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView3);
            a17.c(imageView3);
        }
    }

    public final q00.f b(yz5.l onSuc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuc, "onSuc");
        this.f440786c = new q00.e(onSuc);
        return this;
    }
}
