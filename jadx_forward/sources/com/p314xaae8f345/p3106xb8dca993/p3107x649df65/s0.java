package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class s0 implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b, com.tencent.tmsqmsp.oaid2.r0.b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 f297195a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0 f297196b;

    @Override // com.tencent.tmsqmsp.oaid2.r0.b
    public void a(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0 r0Var) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56 = this.f297195a;
        if (interfaceC26782xfd577a56 != null) {
            interfaceC26782xfd577a56.mo36999x57429edc(e(), d(), a());
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String d() {
        java.lang.String a17;
        return (e() && (a17 = this.f297196b.a()) != null) ? a17 : "";
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean e() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0 r0Var = this.f297196b;
        if (r0Var != null) {
            return r0Var.d();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void j() {
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean k() {
        return false;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void l() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0 r0Var = this.f297196b;
        if (r0Var != null) {
            r0Var.e();
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void a(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56) {
        this.f297195a = interfaceC26782xfd577a56;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0 r0Var = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r0(context, this);
        this.f297196b = r0Var;
        r0Var.c();
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String a() {
        java.lang.String b17;
        return (e() && (b17 = this.f297196b.b()) != null) ? b17 : "";
    }
}
