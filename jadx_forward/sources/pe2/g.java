package pe2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f435158d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f435159e;

    /* renamed from: f, reason: collision with root package name */
    public int f435160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pe2.h f435161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mm2.j0 f435162h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pe2.h hVar, mm2.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f435161g = hVar;
        this.f435162h = j0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pe2.g(this.f435161g, this.f435162h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe2.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.i30 i30Var;
        java.lang.String N6;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f435160f;
        jz5.f0 f0Var = jz5.f0.f384359a;
        pe2.h hVar = this.f435161g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean x07 = hVar.x0();
            mm2.j0 j0Var = this.f435162h;
            i30Var = x07 ? (r45.i30) j0Var.f410684a.m75936x14adae67(3) : (r45.i30) j0Var.f410684a.m75936x14adae67(4);
            N6 = ((mm2.l0) hVar.P0(mm2.l0.class)).N6(i30Var);
            if ((N6 == null || N6.length() == 0) || i30Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveCheerAnimationPlugin", "getPagPath error : " + N6 + " resource: " + i30Var);
                return f0Var;
            }
            java.lang.String e17 = kk.k.e(N6);
            if (com.p314xaae8f345.mm.vfs.w6.j(N6) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i30Var.m75945x2fec8307(1), e17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCheerAnimationPlugin", "showCheerAnimation delete file, md5 not match, tempMd5: " + e17);
                com.p314xaae8f345.mm.vfs.w6.h(N6);
            }
            wh2.l lVar = wh2.l.f527488a;
            java.lang.String m75945x2fec8307 = i30Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            this.f435158d = i30Var;
            this.f435159e = N6;
            this.f435160f = 1;
            a17 = lVar.a(m75945x2fec8307, N6, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N6 = (java.lang.String) this.f435159e;
            i30Var = (r45.i30) this.f435158d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        java.lang.String str = N6;
        r45.i30 i30Var2 = i30Var;
        wh2.i iVar = (wh2.i) a17;
        java.lang.String e18 = kk.k.e(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCheerAnimation load pag isAnchorLive: ");
        sb6.append(zl2.r4.f555483a.w1());
        sb6.append(" resource: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i30Var2, "<this>");
        sb6.append("url: " + i30Var2.m75945x2fec8307(0) + " duration: " + i30Var2.m75942xfb822ef2(2) + " md5: " + i30Var2.m75945x2fec8307(1));
        sb6.append(" md5: ");
        sb6.append(e18);
        sb6.append(" result: ");
        sb6.append(iVar);
        sb6.append(" getVisible: ");
        sb6.append(hVar.w0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCheerAnimationPlugin", sb6.toString());
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        pe2.f fVar = new pe2.f(iVar, i30Var2, e18, this.f435161g, str, this.f435162h, null);
        this.f435158d = null;
        this.f435159e = null;
        this.f435160f = 2;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var, fVar, this) == aVar ? aVar : f0Var;
    }
}
