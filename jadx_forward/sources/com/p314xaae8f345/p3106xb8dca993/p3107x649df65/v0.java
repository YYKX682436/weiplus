package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class v0 implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b {

    /* renamed from: a, reason: collision with root package name */
    com.p314xaae8f345.p3106xb8dca993.p3107x649df65.u0 f297207a;

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void a(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56) {
        this.f297207a = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.u0(context);
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String d() {
        return null;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean e() {
        return "1".equals(a("persist.sys.identifierid.supported", "0"));
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void j() {
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void l() {
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String a() {
        return this.f297207a.a(0, "");
    }

    private static java.lang.String a(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, str, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
