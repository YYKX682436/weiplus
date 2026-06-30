package tt2;

/* loaded from: classes2.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f503444d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f503445e;

    /* renamed from: f, reason: collision with root package name */
    public int f503446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f503447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f503448h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f503447g = h0Var;
        this.f503448h = h0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tt2.g0(this.f503447g, this.f503448h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tt2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f503446f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f503447g;
            if (h0Var2.f391656d != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveGetProductPromoteReplayWidgetResponse has_replay:");
                r45.ju1 ju1Var = (r45.ju1) h0Var2.f391656d;
                sb6.append(ju1Var != null ? java.lang.Boolean.valueOf(ju1Var.m75933x41a8a7f2(0)) : null);
                sb6.append(", video_url:");
                r45.ju1 ju1Var2 = (r45.ju1) h0Var2.f391656d;
                sb6.append(ju1Var2 != null ? ju1Var2.m75945x2fec8307(1) : null);
                sb6.append(", video_img_url:");
                r45.ju1 ju1Var3 = (r45.ju1) h0Var2.f391656d;
                sb6.append(ju1Var3 != null ? ju1Var3.m75945x2fec8307(2) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", sb6.toString());
                r45.ju1 ju1Var4 = (r45.ju1) h0Var2.f391656d;
                if (ju1Var4 != null && ju1Var4.m75933x41a8a7f2(0)) {
                    r45.ju1 ju1Var5 = (r45.ju1) h0Var2.f391656d;
                    java.lang.String m75945x2fec8307 = ju1Var5 != null ? ju1Var5.m75945x2fec8307(2) : null;
                    if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                        r45.ju1 ju1Var6 = (r45.ju1) h0Var2.f391656d;
                        if (ju1Var6 == null || (str = ju1Var6.m75945x2fec8307(2)) == null) {
                            str = "";
                        }
                        this.f503444d = str;
                        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = this.f503448h;
                        this.f503445e = h0Var3;
                        this.f503446f = 1;
                        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                        rVar.k();
                        v65.n nVar = new v65.n(rVar);
                        mn2.g1 g1Var = mn2.g1.f411508a;
                        wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411498s));
                        tt2.f0 f0Var = new tt2.f0(nVar);
                        b17.getClass();
                        b17.f529406d = f0Var;
                        b17.f();
                        obj = rVar.j();
                        if (obj == aVar) {
                            return aVar;
                        }
                        h0Var = h0Var3;
                    }
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f503445e;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h0Var.f391656d = obj;
        return jz5.f0.f384359a;
    }
}
