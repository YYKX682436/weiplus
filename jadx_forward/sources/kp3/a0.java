package kp3;

/* loaded from: classes14.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f392495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82 f392496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82 activityC16780x4fcabb82, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392496e = activityC16780x4fcabb82;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp3.a0(this.f392496e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp3.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392495d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82 activityC16780x4fcabb82 = this.f392496e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f392495d = 1;
            obj = com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82.U6(activityC16780x4fcabb82, this);
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
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.palmPrintFrontUI", "[initPalm] doCheckSdkResource failed");
            jp3.g gVar = jp3.g.f382533a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16780x4fcabb82.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            gVar.i(mo55332x76847179, 80010, "ERR_PALM_SDK_CHECK", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return f0Var;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82.f234399h;
        activityC16780x4fcabb82.getClass();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.a(activityC16780x4fcabb82, "android.permission.CAMERA", 16, "", "")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.palmPrintFrontUI", "[initPalm] doCheckPermission failed");
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.palmPrintFrontUI", "[initPalm] check success");
        activityC16780x4fcabb82.V6(activityC16780x4fcabb82.f234401e, activityC16780x4fcabb82.f234402f);
        return f0Var;
    }
}
