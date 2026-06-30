package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public class w implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b, com.tencent.tmsqmsp.oaid2.x.b {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x f297209a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 f297210b;

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void a(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56) {
        this.f297210b = interfaceC26782xfd577a56;
        this.f297209a = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x(context, this);
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String d() {
        java.lang.String c17;
        return (e() && (c17 = this.f297209a.c()) != null) ? c17 : "";
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean e() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x xVar = this.f297209a;
        if (xVar != null) {
            return xVar.b();
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
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x xVar = this.f297209a;
        if (xVar != null) {
            xVar.d();
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String a() {
        java.lang.String a17;
        return (e() && (a17 = this.f297209a.a()) != null) ? a17 : "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.x.b
    public void a(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.x xVar) {
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56 = this.f297210b;
            if (interfaceC26782xfd577a56 != null) {
                interfaceC26782xfd577a56.mo36999x57429edc(e(), d(), a());
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a562 = this.f297210b;
            if (interfaceC26782xfd577a562 != null) {
                interfaceC26782xfd577a562.mo36999x57429edc(false, "", "");
            }
        }
    }
}
