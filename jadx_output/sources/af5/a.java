package af5;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk0.k f4547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, java.lang.String str, gk0.k kVar, java.lang.String str2) {
        super(1);
        this.f4545d = context;
        this.f4546e = str;
        this.f4547f = kVar;
        this.f4548g = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a11.c it = (a11.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int color = this.f4545d.getResources().getColor(com.tencent.mm.R.color.a9e);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = it.f505b;
        weImageView.setIconColor(color);
        ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).wi(weImageView, this.f4546e, this.f4547f);
        it.f506c.setText(this.f4548g);
        return jz5.f0.f302826a;
    }
}
