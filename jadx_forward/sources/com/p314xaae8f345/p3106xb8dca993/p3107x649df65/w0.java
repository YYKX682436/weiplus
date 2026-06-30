package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class w0 implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b {

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.Class f297211b;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.Object f297212c;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.reflect.Method f297213d;

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f297214a;

    public w0() {
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("xm start");
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.id.impl.IdProviderImpl");
            f297211b = cls;
            f297212c = cls.newInstance();
            f297213d = f297211b.getMethod(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, android.content.Context.class);
            f297211b.getMethod("getAAID", android.content.Context.class);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.c("xm reflect exception!".concat(java.lang.String.valueOf(e17)));
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void a(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56) {
        this.f297214a = context;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String d() {
        return null;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean e() {
        return (f297211b == null || f297212c == null) ? false : true;
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
        java.lang.reflect.Method method;
        java.lang.Object obj = f297212c;
        if (obj == null || (method = f297213d) == null) {
            return null;
        }
        return a(this.f297214a, obj, method);
    }

    private java.lang.String a(android.content.Context context, java.lang.Object obj, java.lang.reflect.Method method) {
        if (obj == null || method == null) {
            return null;
        }
        try {
            java.lang.Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (java.lang.String) invoke;
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
