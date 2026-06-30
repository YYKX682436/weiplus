package th5;

/* loaded from: classes.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f501012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.z0 f501013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f501014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f501015g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(th5.z0 z0Var, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f501013e = z0Var;
        this.f501014f = str;
        this.f501015g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new th5.y0(this.f501013e, this.f501014f, this.f501015g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f501012d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            th5.x0 x0Var = new th5.x0(this.f501014f, this.f501015g, null);
            this.f501012d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, x0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        aq.s0 s0Var = (aq.s0) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (s0Var == null) {
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportAsLivePhoto result: rsp=");
        boolean z17 = s0Var.f94493a;
        sb6.append(z17);
        sb6.append(" errCode=");
        sb6.append(s0Var.f94494b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPhotoSaveComponent", sb6.toString());
        th5.z0 z0Var = this.f501013e;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = z0Var.m158354x19263085();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ncn);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            e4Var.c();
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = z0Var.m158354x19263085();
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x192630852);
            e4Var2.f293309c = z0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.og6);
            e4Var2.c();
        }
        return f0Var;
    }
}
