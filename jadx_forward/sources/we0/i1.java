package we0;

/* loaded from: classes4.dex */
public final class i1 implements zy2.r9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f526657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f526658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f526659c;

    public i1(r45.f96 f96Var, android.content.Intent intent, android.content.Context context) {
        this.f526657a = f96Var;
        this.f526658b = intent;
        this.f526659c = context;
    }

    @Override // zy2.r9
    public void a(zy2.p9 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        zy2.p9 p9Var = zy2.p9.f559061d;
        r45.f96 f96Var = this.f526657a;
        boolean z17 = type == p9Var ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f96Var.m75945x2fec8307(5)) : type != zy2.p9.f559062e;
        android.content.Context context = this.f526659c;
        android.content.Intent intent = this.f526658b;
        if (z17) {
            java.lang.String MM_NEAR_LIFE_URI = o45.yf.f424570a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MM_NEAR_LIFE_URI, "MM_NEAR_LIFE_URI");
            java.lang.String format = java.lang.String.format(MM_NEAR_LIFE_URI, java.util.Arrays.copyOf(new java.lang.Object[]{f96Var.m75945x2fec8307(5)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, context);
            return;
        }
        intent.putExtra("map_view_type", 14);
        intent.putExtra("kwebmap_slat", f96Var.m75938x746dc8a6(1));
        intent.putExtra("kwebmap_lng", f96Var.m75938x746dc8a6(0));
        intent.putExtra("kPoiName", f96Var.m75945x2fec8307(3));
        intent.putExtra("Kwebmap_locaion", f96Var.m75945x2fec8307(4));
        j45.l.j(context, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
    }
}
