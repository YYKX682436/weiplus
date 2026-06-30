package ju3;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f383495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f383496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 f383497f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(jz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 c17018x4aa057d6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f383496e = lVar;
        this.f383497f = c17018x4aa057d6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ju3.k0(this.f383496e, this.f383497f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f383495d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 c17018x4aa057d6 = this.f383497f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.os.Bundle bundle = (android.os.Bundle) this.f383496e.f384367e;
            boolean z17 = bundle != null ? bundle.getBoolean("camera_boolean") : false;
            c17018x4aa057d6.getCameraSwitchPlugin().a(z17);
            nu3.i.f421751a.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(z17 ? 1 : 2));
            yt3.b recordPlugin = c17018x4aa057d6.getRecordPlugin();
            if ((recordPlugin == null || recordPlugin.c()) ? false : true) {
                c17018x4aa057d6.getSwitchFlashPlugin().f546878d.setVisibility(z17 ? 4 : 0);
                if (z17) {
                    yt3.a4 switchFlashPlugin = c17018x4aa057d6.getSwitchFlashPlugin();
                    this.f383495d = 1;
                    switchFlashPlugin.getClass();
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new yt3.z3(switchFlashPlugin, false, null), this);
                    if (g17 != aVar) {
                        g17 = f0Var;
                    }
                    if (g17 == aVar) {
                        return aVar;
                    }
                }
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        c17018x4aa057d6.getCameraUsage().e(false);
        return f0Var;
    }
}
