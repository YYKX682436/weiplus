package ry4;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f483114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f483115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 f483116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483117g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ry4.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f483115e = c0Var;
        this.f483116f = c19510x90fb7cb8;
        this.f483117g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ry4.b0(this.f483115e, this.f483116f, this.f483117g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ry4.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f483114d;
        java.lang.String str = this.f483117g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8 = this.f483116f;
        boolean z17 = false;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                r45.l56 l56Var = new r45.l56();
                l56Var.set(0, java.lang.Integer.valueOf(c19510x90fb7cb8.f269612d));
                l56Var.set(1, c19510x90fb7cb8.f269613e);
                l56Var.set(2, c19510x90fb7cb8.f269614f);
                r45.vo4 vo4Var = new r45.vo4();
                vo4Var.set(0, str);
                vo4Var.set(1, l56Var);
                xg3.a aVar2 = new xg3.a(24, 8, vo4Var);
                ry4.c0 c0Var = this.f483115e;
                this.f483114d = 1;
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
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = booleanValue ? ya.b.f77504xbb80cbe3 : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d;
            objArr[1] = new java.lang.Integer(c19510x90fb7cb8.f269612d);
            objArr[2] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandEditUIC", "syncModShortcutCommand: %s id:%d for username:%s", objArr);
            z17 = booleanValue;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutCommandEditUIC", e17, "syncModShortcutCommand failed", new java.lang.Object[0]);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
