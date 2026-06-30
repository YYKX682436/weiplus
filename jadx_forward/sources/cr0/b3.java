package cr0;

/* loaded from: classes12.dex */
public final class b3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.d3 f303128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(cr0.d3 d3Var) {
        super(0);
        this.f303128d = d3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        boolean a17 = cr0.k3.f303199a.a();
        cr0.e3 e3Var = cr0.e3.f303153d;
        if (a17) {
            cr0.k3.f303201c.m40834x32c52b(e3Var);
        }
        for (q01.s0 req : ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).Bi()) {
            cr0.k3 k3Var = cr0.k3.f303199a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
            if (k3Var.a()) {
                cr0.k3.f303201c.m40834x32c52b(new cr0.j3(req, android.os.SystemClock.uptimeMillis() - req.f440864c));
            }
        }
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10872x28d91e0f accStats = cr0.k3.f303201c;
        cr0.d3 snapshot = this.f303128d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accStats, "accStats");
        java.util.Map t17 = kz5.c1.t(accStats.m46651x8894e5fa());
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> entry : accStats.m46653xf6be947a().entrySet()) {
            java.lang.String key = entry.getKey();
            for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry2 : entry.getValue().entrySet()) {
                java.lang.String key2 = entry2.getKey();
                long longValue = entry2.getValue().longValue();
                java.lang.Object obj = ((java.util.LinkedHashMap) t17).get(key);
                if (obj == null) {
                    obj = new java.util.LinkedHashMap();
                    t17.put(key, obj);
                }
                com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795.f29664x233c02ec.getClass();
                java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c((java.util.Map) obj);
                java.lang.Object obj2 = c17.get(key2);
                if (obj2 == null) {
                    obj2 = new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f(0, 0L, 3, null);
                    c17.put(key2, obj2);
                }
                com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f c10871xcc6f010f = (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) obj2;
                c10871xcc6f010f.f150222d++;
                c10871xcc6f010f.f150223e = longValue;
            }
        }
        java.util.Set<java.util.Map.Entry> entrySet = ((java.util.LinkedHashMap) t17).entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry3 : entrySet) {
            java.lang.String str = (java.lang.String) entry3.getKey();
            java.util.Map map = (java.util.Map) entry3.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry4 : map.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry4.getKey();
                com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f c10871xcc6f010f2 = (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) entry4.getValue();
                if ((str2 == null || str2.length() == 0) || !r26.n0.D(str2, "/", false, 2, null)) {
                    z17 = false;
                } else {
                    z17 = false;
                    str2 = str2.substring(r26.n0.P(str2, "/", 0, false, 6, null) + 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append('-');
                if ((str2 == null || str2.length() == 0) ? true : z17) {
                    str2 = "";
                }
                sb6.append(str2);
                arrayList2.add(new jz5.l(sb6.toString(), c10871xcc6f010f2));
            }
            kz5.h0.u(arrayList, arrayList2);
        }
        for (java.util.Map.Entry entry5 : kz5.c1.q(kz5.n0.F0(kz5.n0.S0(arrayList), new cr0.x2())).entrySet()) {
            snapshot.b().add(new cr0.w2((java.lang.String) entry5.getKey(), ((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) entry5.getValue()).f150222d, ((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) entry5.getValue()).f150223e));
        }
        snapshot.c();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - accStats.getAccBeginTime();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        snapshot.f303115d = rh.x2.b(java.lang.Long.valueOf(currentTimeMillis));
        if (cr0.k3.f303199a.a()) {
            cr0.k3.f303201c.m40834x32c52b(e3Var);
        }
        return jz5.f0.f384359a;
    }
}
