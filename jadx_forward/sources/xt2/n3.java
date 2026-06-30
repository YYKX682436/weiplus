package xt2;

/* loaded from: classes2.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f538438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f538439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f538440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f538441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f538442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(java.lang.String str, xt2.r3 r3Var, android.view.View view, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538439e = str;
        this.f538440f = r3Var;
        this.f538441g = view;
        this.f538442h = c22789xd23e9a9b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.n3(this.f538439e, this.f538440f, this.f538441g, this.f538442h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.n3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object h17;
        java.lang.Object h18;
        org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f538438d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str = this.f538439e;
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FinderLiveShoppingCartAnimWidget", th6, "playPromotePag error", new java.lang.Object[0]);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            xt2.m3 m3Var = new xt2.m3(this.f538442h, null);
            this.f538438d = 4;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, m3Var, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nn2.d dVar = nn2.d.f420204a;
            java.lang.String g17 = ((b51.m) dVar.a()).g(str);
            java.io.File file = new java.io.File(g17);
            if (!file.exists() || file.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag: cache miss, fallback download, url=" + str);
                rj.j a17 = dVar.a();
                this.f538438d = 2;
                h17 = ((b51.m) a17).h(str, "MicroMsg.FinderLiveShoppingCartAnimWidget", this);
                if (h17 == aVar) {
                    return aVar;
                }
                c29690xfae77312 = (org.p3363xbe4143f1.C29690xfae77312) h17;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag: cache hit, path=" + g17);
                rj.j a18 = dVar.a();
                this.f538438d = 1;
                h18 = ((b51.m) a18).h(str, "MicroMsg.FinderLiveShoppingCartAnimWidget", this);
                if (h18 == aVar) {
                    return aVar;
                }
                c29690xfae77312 = (org.p3363xbe4143f1.C29690xfae77312) h18;
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h18 = obj;
            c29690xfae77312 = (org.p3363xbe4143f1.C29690xfae77312) h18;
        } else {
            if (i17 != 2) {
                if (i17 == 3) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                } else {
                    if (i17 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h17 = obj;
            c29690xfae77312 = (org.p3363xbe4143f1.C29690xfae77312) h17;
        }
        org.p3363xbe4143f1.C29690xfae77312 c29690xfae773122 = c29690xfae77312;
        if (c29690xfae773122 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag: load failed, url=" + str);
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        xt2.l3 l3Var = new xt2.l3(this.f538440f, this.f538441g, this.f538442h, c29690xfae773122, this.f538439e, null);
        this.f538438d = 3;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var2, l3Var, this) == aVar ? aVar : f0Var;
    }
}
