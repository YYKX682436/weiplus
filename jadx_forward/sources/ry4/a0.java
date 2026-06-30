package ry4;

/* loaded from: classes.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f483106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f483107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 f483109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ry4.c0 c0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f483107e = c0Var;
        this.f483108f = str;
        this.f483109g = c19510x90fb7cb8;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ry4.a0(this.f483107e, this.f483108f, this.f483109g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ry4.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f483106d;
        java.lang.String str = this.f483108f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                r45.l56 l56Var = new r45.l56();
                com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8 = this.f483109g;
                l56Var.set(1, c19510x90fb7cb8.f269613e);
                l56Var.set(2, c19510x90fb7cb8.f269614f);
                r45.x4 x4Var = new r45.x4();
                x4Var.set(0, str);
                x4Var.set(1, l56Var);
                xg3.a aVar2 = new xg3.a(24, 6, x4Var);
                ry4.c0 c0Var = this.f483107e;
                this.f483106d = 1;
                obj = ry4.c0.T6(c0Var, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                return new java.lang.Integer((int) (java.lang.System.currentTimeMillis() & 2147483647L));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutCommandEditUIC", "[-] syncAddShortcutCommand: failed for username:%s", str);
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutCommandEditUIC", e17, "syncAddShortcutCommand failed", new java.lang.Object[0]);
            return null;
        }
    }
}
