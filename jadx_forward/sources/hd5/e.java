package hd5;

/* loaded from: classes9.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd5.j f362127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hd5.q f362128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hd5.n f362129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hd5.j jVar, hd5.q qVar, hd5.n nVar) {
        super(0);
        this.f362127d = jVar;
        this.f362128e = qVar;
        this.f362129f = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        we5.b o17;
        sb5.j jVar = (sb5.j) this.f362127d.f362145c.f542241c.a(sb5.j.class);
        yb5.d dVar = this.f362127d.f362145c;
        rd5.b bVar = rd5.b.f475786a;
        java.util.List addList = this.f362128e.f362164c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(addList, "addList");
        java.util.List<rd5.d> a17 = bVar.a(dVar, addList);
        hd5.n nVar = this.f362129f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p0 p0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p0) jVar;
        p0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatItemAsyncLoadComponent", "handleItemAsyncLoadStart[ size:(%s) ]", java.lang.Integer.valueOf(a17.size()));
        long nanoTime = java.lang.System.nanoTime();
        int i17 = 0;
        for (rd5.d dVar2 : a17) {
            if (!dVar2.f475790g && (o17 = dVar2.o()) != 0 && o17.c()) {
                long nanoTime2 = java.lang.System.nanoTime();
                we5.y0 y0Var = new we5.y0(null);
                o17.e(dVar, dVar2, dVar.x(), y0Var);
                dVar2.f475790g = true;
                dVar2.f475791h = y0Var;
                dVar2.f475792i = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0) o17;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar2.f475787d.f526833b.Q0(), p0Var.f280113d.x())) {
                    if (dVar2 instanceof qd5.i) {
                        java.util.Map map = p0Var.f281193f;
                        java.lang.String x17 = p0Var.f280113d.x();
                        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                        java.lang.Object obj = linkedHashMap.get(x17);
                        if (obj == null) {
                            obj = new java.util.concurrent.ConcurrentHashMap();
                            linkedHashMap.put(x17, obj);
                        }
                        ((java.util.concurrent.ConcurrentHashMap) obj).put(dVar2.v(), dVar2);
                    } else {
                        java.util.Map map2 = p0Var.f281192e;
                        java.lang.String x18 = p0Var.f280113d.x();
                        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) map2;
                        java.lang.Object obj2 = linkedHashMap2.get(x18);
                        if (obj2 == null) {
                            obj2 = new java.util.concurrent.ConcurrentHashMap();
                            linkedHashMap2.put(x18, obj2);
                        }
                        ((java.util.concurrent.ConcurrentHashMap) obj2).put(dVar2.v(), dVar2);
                    }
                }
                float nanoTime3 = ((float) (java.lang.System.nanoTime() - nanoTime2)) / 1000000.0f;
                java.lang.String format = java.lang.String.format("%.2fms", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(nanoTime3)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatItemAsyncLoadComponent", "handleItemAsyncLoad[%s] cost: %s", o17, format);
                i17++;
                if (nanoTime3 > 200.0f) {
                    tb5.n0 n0Var = (tb5.n0) p0Var.f280113d.f542241c.a(tb5.n0.class);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
                    int i18 = (int) nanoTime3;
                    ((tb5.d0) n0Var).getClass();
                    if (f9Var != null) {
                        ((ku5.t0) ku5.t0.f394148d).g(new tb5.b0(f9Var, i18, nVar));
                    }
                }
            }
        }
        long nanoTime4 = java.lang.System.nanoTime();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(a17.size());
        java.lang.String format2 = java.lang.String.format("%.2fms", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) (nanoTime4 - nanoTime)) / 1000000.0f)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatItemAsyncLoadComponent", "handleItemAsyncLoad[ size:(%s/%s) ] cost: %s", valueOf, valueOf2, format2);
        return jz5.f0.f384359a;
    }
}
