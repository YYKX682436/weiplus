package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes15.dex */
public class c0 implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z f297091a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f297092b;

    /* renamed from: c, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 f297093c;

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void a(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56) {
        if (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z.a(context)) {
            java.lang.String a17 = com.p314xaae8f345.p3106xb8dca993.p3107x649df65.e.a(context);
            if (!android.text.TextUtils.isEmpty(a17)) {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z.a(context, a17);
            }
            this.f297091a = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z(context, this);
        }
        this.f297093c = interfaceC26782xfd577a56;
        this.f297092b = context;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0
    public void b() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56 = this.f297093c;
        if (interfaceC26782xfd577a56 != null) {
            interfaceC26782xfd577a56.mo36999x57429edc(false, "", "");
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String d() {
        java.lang.String a17;
        return (!e() || (a17 = this.f297091a.a()) == null) ? "" : a17;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean e() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z zVar = this.f297091a;
        if (zVar != null) {
            return zVar.c();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void j() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z zVar = this.f297091a;
        if (zVar != null) {
            zVar.a(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.e.a(this.f297092b));
        } else {
            b();
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean k() {
        return false;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void l() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.z zVar = this.f297091a;
        if (zVar != null) {
            zVar.d();
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String a() {
        java.lang.String b17;
        return (!e() || (b17 = this.f297091a.b()) == null) ? "" : b17;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a0
    public void a(boolean z17) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56 = this.f297093c;
        if (interfaceC26782xfd577a56 != null) {
            interfaceC26782xfd577a56.mo36999x57429edc(e(), d(), a());
        }
    }
}
