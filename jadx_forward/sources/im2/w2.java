package im2;

/* loaded from: classes2.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f374126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f374128f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(im2.z3 z3Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f374127e = z3Var;
        this.f374128f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new im2.w2(this.f374127e, this.f374128f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.w2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f374126d;
        im2.z3 z3Var = this.f374127e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            new qx2.g(z3Var.m80379x76847179());
            qx2.g gVar = new qx2.g(z3Var.m80379x76847179());
            java.lang.String string = z3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572996d55);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = z3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572997d56);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            qx2.a aVar2 = new qx2.a(string, string2, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/BsB5Jid0M6gtMOz8");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String string3 = z3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d57);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            arrayList.add(new qx2.a(string3, null, null, 6, null));
            java.lang.String string4 = z3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d58);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            arrayList.add(new qx2.a(string4, null, null, 6, null));
            this.f374126d = 1;
            b17 = gVar.b(aVar2, arrayList, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) b17).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            return f0Var;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_PRE_SALE_ANCHOR_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        z3Var.v7(true);
        im2.z3.q7(z3Var, this.f374128f);
        return f0Var;
    }
}
