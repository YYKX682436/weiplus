package eh0;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f334425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh0.o f334426e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(eh0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f334426e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new eh0.m(this.f334426e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((eh0.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f334425d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f334425d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        e70.a0 wi6 = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(false);
        eh0.o oVar = this.f334426e;
        oVar.f334430f = wi6;
        e70.a0 a0Var = oVar.f334430f;
        if (a0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("streamController");
            throw null;
        }
        ((d83.t0) a0Var).c();
        fh0.k kVar = fh0.k.f344063a;
        if (!fh0.k.f344065c) {
            fh0.k.f344065c = true;
            boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2521xeb7fcef.C20085xa08be47f()), 0);
            fh0.k.f344066d = z17;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.DataShower", "onInit: enabled, creating float view");
                d75.b.g(fh0.f.f344059d);
                com.p314xaae8f345.mm.app.w.INSTANCE.a(new fh0.i());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.DataShower", "onInit: disabled by RepairerConfig");
            }
        }
        oVar.getClass();
        eh0.g gVar = eh0.g.f334408a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String[] b17 = gVar.a().b();
        if (b17 != null) {
            for (java.lang.String str : b17) {
                java.lang.String string = eh0.g.f334408a.a().getString(str, null);
                if (string != null) {
                    try {
                        eh0.i a17 = eh0.i.f334410j.a(string);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        linkedHashMap.put(str, a17);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StreamMMKVHelper", "parse stream info error: %s", e17.getMessage());
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StreamMMKVHelper", "getAllUnfinishedStreams count:%d", java.lang.Integer.valueOf(linkedHashMap.size()));
        }
        linkedHashMap.forEach(new eh0.n(oVar));
        return jz5.f0.f384359a;
    }
}
