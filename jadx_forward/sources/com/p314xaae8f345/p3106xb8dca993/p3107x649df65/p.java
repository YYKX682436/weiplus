package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class p implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 f297162a;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q f297165d;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f297163b = "";

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f297164c = "";

    /* renamed from: e, reason: collision with root package name */
    private boolean f297166e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f297167f = false;

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void a(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56) {
        this.f297162a = interfaceC26782xfd577a56;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q qVar = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q(context);
        this.f297165d = qVar;
        qVar.a(this);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return null;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o
    public void b() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56 = this.f297162a;
        if (interfaceC26782xfd577a56 != null) {
            interfaceC26782xfd577a56.mo36999x57429edc(false, null, null);
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String d() {
        return this.f297164c;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean e() {
        return this.f297167f;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void j() {
        this.f297165d.a(this);
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean k() {
        return false;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void l() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q qVar;
        if (!this.f297166e || (qVar = this.f297165d) == null) {
            return;
        }
        qVar.a();
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String a() {
        return this.f297163b;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o
    public void a(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n nVar) {
        try {
            java.lang.String c17 = nVar.c();
            this.f297163b = c17;
            if (c17 == null) {
                this.f297163b = "";
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            java.lang.String i17 = nVar.i();
            this.f297164c = i17;
            if (i17 == null) {
                this.f297164c = "";
            }
        } catch (java.lang.Exception unused2) {
        }
        try {
            this.f297167f = nVar.b();
        } catch (java.lang.Exception unused3) {
        }
        this.f297166e = true;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56 = this.f297162a;
        if (interfaceC26782xfd577a56 != null) {
            interfaceC26782xfd577a56.mo36999x57429edc(this.f297167f, this.f297164c, this.f297163b);
        }
    }
}
