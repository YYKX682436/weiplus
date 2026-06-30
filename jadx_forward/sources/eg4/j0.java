package eg4;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f334270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f334271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d f334273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f334274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334275i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean z17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d activityC18505x6ae0de9d, int i17, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f334270d = u3Var;
        this.f334271e = z17;
        this.f334272f = str;
        this.f334273g = activityC18505x6ae0de9d;
        this.f334274h = i17;
        this.f334275i = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new eg4.j0(this.f334270d, this.f334271e, this.f334272f, this.f334273g, this.f334274h, this.f334275i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        eg4.j0 j0Var = (eg4.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f334270d.dismiss();
        boolean z17 = this.f334271e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d activityC18505x6ae0de9d = this.f334273g;
        java.lang.String str = this.f334272f;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "deleteNewData success: " + str);
            activityC18505x6ae0de9d.W6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddFriendVerifyRecordUI", "deleteNewData fail: " + str + ", errorCode=" + this.f334274h + ", errorMsg=" + this.f334275i);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18505x6ae0de9d.mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f571901t1);
            e4Var.c();
        }
        return jz5.f0.f384359a;
    }
}
