package th5;

/* loaded from: classes12.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.g0 f501016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.o f501017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(th5.g0 g0Var, th5.o oVar) {
        super(0);
        this.f501016d = g0Var;
        this.f501017e = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        th5.g0 g0Var = this.f501016d;
        g0Var.getClass();
        th5.o item = this.f501017e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String mo2110x5db1b11 = item.mo2110x5db1b11();
        java.util.Map map = g0Var.f500914g;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) ((java.util.LinkedHashMap) map).get(mo2110x5db1b11);
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        map.remove(mo2110x5db1b11);
        item.f500957i = 0.0f;
        item.f500959k = null;
        v65.i.c(g0Var.f500481f, null, new th5.y(item, null), 1, null);
        item.f500954f = mf3.w.f407661d;
        g0Var.X6(item);
        return jz5.f0.f384359a;
    }
}
