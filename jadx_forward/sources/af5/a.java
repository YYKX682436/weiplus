package af5;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f86078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk0.k f86080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86081g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, java.lang.String str, gk0.k kVar, java.lang.String str2) {
        super(1);
        this.f86078d = context;
        this.f86079e = str;
        this.f86080f = kVar;
        this.f86081g = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        a11.c it = (a11.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int color = this.f86078d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = it.f82038b;
        c22699x3dcdb352.m82040x7541828(color);
        ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).wi(c22699x3dcdb352, this.f86079e, this.f86080f);
        it.f82039c.setText(this.f86081g);
        return jz5.f0.f384359a;
    }
}
