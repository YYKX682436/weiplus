package wu;

/* loaded from: classes9.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.w0 f531148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(wu.w0 w0Var) {
        super(2);
        this.f531148d = w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View v17 = (android.view.View) obj;
        hu.b item = (hu.b) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        s15.m s17 = item.f366530e.s();
        if (s17 != null) {
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f531148d.f531143e.q()) ? 3 : 2;
            int p17 = s17.p();
            ya2.e1 e1Var = ya2.e1.f542005a;
            if (p17 != 0) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context = v17.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                e1Var.u(context, yu.m.a(s17), i17);
            } else {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                android.content.Context context2 = v17.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                e1Var.n(context2, yu.m.a(s17), i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
