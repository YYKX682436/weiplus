package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public class h implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b, com.tencent.tmsqmsp.oaid2.f.b {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 f297127a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f f297128b;

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void a(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56) {
        this.f297127a = interfaceC26782xfd577a56;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f fVar = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f(context, this);
        this.f297128b = fVar;
        fVar.c();
    }

    @Override // com.tencent.tmsqmsp.oaid2.f.b
    public void b() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56 = this.f297127a;
        if (interfaceC26782xfd577a56 != null) {
            interfaceC26782xfd577a56.mo36999x57429edc(e(), d(), a());
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String d() {
        java.lang.String a17;
        return (e() && (a17 = this.f297128b.a()) != null) ? a17 : "";
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean e() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f fVar = this.f297128b;
        if (fVar != null) {
            return fVar.d();
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
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.f fVar = this.f297128b;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String a() {
        java.lang.String b17;
        return (e() && (b17 = this.f297128b.b()) != null) ? b17 : "";
    }
}
