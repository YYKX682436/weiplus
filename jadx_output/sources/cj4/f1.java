package cj4;

/* loaded from: classes4.dex */
public final class f1 implements zy2.r9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f41928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f41929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f41930c;

    public f1(r45.f96 f96Var, android.content.Intent intent, cj4.i1 i1Var) {
        this.f41928a = f96Var;
        this.f41929b = intent;
        this.f41930c = i1Var;
    }

    @Override // zy2.r9
    public void a(zy2.p9 type) {
        kotlin.jvm.internal.o.g(type, "type");
        zy2.p9 p9Var = zy2.p9.f477528d;
        r45.f96 f96Var = this.f41928a;
        boolean z17 = type == p9Var ? !com.tencent.mm.sdk.platformtools.t8.K0(f96Var.getString(5)) : type != zy2.p9.f477529e;
        cj4.i1 i1Var = this.f41930c;
        android.content.Intent intent = this.f41929b;
        if (z17) {
            java.lang.String MM_NEAR_LIFE_URI = o45.yf.f343037a;
            kotlin.jvm.internal.o.f(MM_NEAR_LIFE_URI, "MM_NEAR_LIFE_URI");
            java.lang.String format = java.lang.String.format(MM_NEAR_LIFE_URI, java.util.Arrays.copyOf(new java.lang.Object[]{f96Var.getString(5)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, i1Var.w());
            return;
        }
        intent.putExtra("map_view_type", 14);
        intent.putExtra("kwebmap_slat", f96Var.getFloat(1));
        intent.putExtra("kwebmap_lng", f96Var.getFloat(0));
        intent.putExtra("kPoiName", f96Var.getString(3));
        intent.putExtra("Kwebmap_locaion", f96Var.getString(4));
        j45.l.j(i1Var.w(), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }
}
