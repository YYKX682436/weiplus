package bg2;

/* loaded from: classes2.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.o4 f101730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(bg2.o4 o4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101730e = o4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.j4(this.f101730e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.j4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.res.AssetManager assets;
        android.content.Context context;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101729d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bg2.o4 o4Var = this.f101730e;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = o4Var.f101887h;
            if (c22789xd23e9a9b != null) {
                in5.s0 s0Var = o4Var.f498674d.f498682i;
                if (s0Var == null || (context = s0Var.f374654e) == null || (assets = context.getAssets()) == null) {
                    assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(assets);
                c22789xd23e9a9b.k(assets, "finder_feed_small_lottery_anim.pag");
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            bg2.i4 i4Var = new bg2.i4(o4Var, null);
            this.f101729d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, i4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
