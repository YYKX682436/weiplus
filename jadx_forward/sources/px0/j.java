package px0;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d01 f440316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc, r45.d01 d01Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440315e = c10988x551cb0cc;
        this.f440316f = d01Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new px0.j(this.f440315e, this.f440316f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((px0.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String string;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f440314d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_maas_mj_aigc_remind_delay_show_ms, 5000L);
            if (Ui < 0) {
                Ui = 0;
            }
            this.f440314d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(Ui, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int m75939xb282bd08 = this.f440316f.m75939xb282bd08(6) * 60;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc = this.f440315e;
        c10988x551cb0cc.f151189t = m75939xb282bd08;
        int i18 = c10988x551cb0cc.f151189t;
        c10988x551cb0cc.getClass();
        if (i18 < 3600) {
            int ceil = (int) java.lang.Math.ceil(i18 / 60.0d);
            if (ceil < 1) {
                ceil = 1;
            }
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574668oi5, java.lang.Integer.valueOf(ceil));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574667oi4, java.lang.Integer.valueOf(i18 / 3600));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oia);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        c10988x551cb0cc.n0(string, string2, true);
        return jz5.f0.f384359a;
    }
}
