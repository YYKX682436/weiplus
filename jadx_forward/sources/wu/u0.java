package wu;

/* loaded from: classes9.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.u0 f531165d = new wu.u0();

    public u0() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View v17 = (android.view.View) obj;
        hu.b item = (hu.b) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        s15.a w17 = item.f366530e.w();
        if (w17 != null) {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String k17 = w17.k();
            if (!(!r26.n0.N(k17))) {
                k17 = null;
            }
            if (k17 != null) {
                intent.putExtra("KEY_SHARE_TYPE", 4);
                uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
                android.content.Context context = v17.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                ((v40.s) nVar).Bi(context, intent, k17);
            }
        }
        return jz5.f0.f384359a;
    }
}
