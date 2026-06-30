package zl2;

/* loaded from: classes3.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f555580d;

    public z2(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zl2.z2(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new zl2.z2((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f555580d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vl2.s sVar = vl2.s.f519401a;
            vl2.h hVar = vl2.h.f519353f;
            this.f555580d = 1;
            obj = sVar.a(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "playClickApplaudSound path isNullOrEmpty");
            return f0Var;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "playClickApplaudSound file not exist:".concat(str));
            return f0Var;
        }
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null) {
            java.lang.Integer num = new java.lang.Integer(-10001);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "stopLocalSoundEffect");
            java.lang.Integer valueOf = java.lang.Integer.valueOf(num.intValue());
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                w0Var.T().mo30282x5f1b9a9c().mo29069x17324d6f(intValue);
                w0Var.T().mo30282x5f1b9a9c().mo29055xe624d2d9(intValue, null);
            }
        }
        tn0.w0 w0Var2 = dk2.ef.f314911d;
        if (w0Var2 != null) {
            java.lang.String o17 = r6Var.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            w0Var2.l0(-10001, o17, null);
        }
        return f0Var;
    }
}
