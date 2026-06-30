package kh;

/* loaded from: classes12.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.d2 f389280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.t1 f389281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(kh.d2 d2Var, kh.t1 t1Var) {
        super(0);
        this.f389280d = d2Var;
        this.f389281e = t1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List<jz5.l> list;
        kh.d2 d2Var = this.f389280d;
        d2Var.getClass();
        if (kh.d2.f389311c.a()) {
            d2Var.b().m40834x32c52b(new kh.z1(d2Var));
        }
        yz5.a aVar = d2Var.f389314b;
        if (aVar != null && (list = (java.util.List) aVar.mo152xb9724478()) != null) {
            for (jz5.l lVar : list) {
                java.lang.String str = (java.lang.String) lVar.f384366d;
                long longValue = ((java.lang.Number) lVar.f384367e).longValue();
                if (kh.d2.f389311c.a()) {
                    d2Var.b().m40834x32c52b(new kh.c2(d2Var, str, longValue));
                }
            }
        }
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4625xbe665255 accStats = d2Var.b();
        kh.t1 snapshot = this.f389281e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accStats, "accStats");
        java.util.Map t17 = kz5.c1.t(accStats.m40762x2b761f3a());
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : accStats.m40764x828240ba().entrySet()) {
            java.lang.String key = entry.getKey();
            long longValue2 = entry.getValue().longValue();
            java.lang.Object obj = ((java.util.LinkedHashMap) t17).get(key);
            if (obj == null) {
                obj = new com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af(0, 0L, 3, null);
                t17.put(key, obj);
            }
            com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af c4626xf3e017af = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af) obj;
            c4626xf3e017af.f134081d++;
            c4626xf3e017af.f134082e = longValue2;
        }
        for (jz5.l lVar2 : kz5.n0.F0(kz5.e1.v(t17), new kh.n1())) {
            java.util.List c17 = snapshot.c();
            java.lang.String str2 = (java.lang.String) lVar2.f384366d;
            com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af c4626xf3e017af2 = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af) lVar2.f384367e;
            c17.add(new kh.r1(str2, c4626xf3e017af2.f134081d, c4626xf3e017af2.f134082e));
        }
        snapshot.d();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - accStats.getAccBeginTime();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        snapshot.f389451e = rh.x2.b(java.lang.Long.valueOf(currentTimeMillis));
        snapshot.f389452f = rh.x2.b(java.lang.Integer.valueOf(accStats.m40764x828240ba().size() + accStats.m40762x2b761f3a().size()));
        if (kh.d2.f389311c.a()) {
            d2Var.b().m40834x32c52b(new kh.z1(d2Var));
        }
        return jz5.f0.f384359a;
    }
}
