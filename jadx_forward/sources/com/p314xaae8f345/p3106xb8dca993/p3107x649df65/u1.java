package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t f297206d;

    public u1(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t tVar) {
        this.f297206d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a562;
        boolean z17;
        java.lang.String str2;
        android.content.Context context;
        java.lang.String str3;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a563;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a564;
        boolean z18;
        java.lang.String str4;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a565;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a566;
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t tVar = this.f297206d;
        try {
            context = tVar.f297198a;
            com.tencent.tmsqmsp.oaid2.r.a a17 = com.p314xaae8f345.p3106xb8dca993.p3107x649df65.r.a(context);
            if (a17 == null) {
                interfaceC26782xfd577a565 = tVar.f297199b;
                if (interfaceC26782xfd577a565 != null) {
                    interfaceC26782xfd577a566 = tVar.f297199b;
                    interfaceC26782xfd577a566.mo36999x57429edc(false, "", "");
                    return;
                }
                return;
            }
            tVar.f297200c = a17.a();
            a17.b();
            str3 = tVar.f297200c;
            if (!android.text.TextUtils.isEmpty(str3)) {
                tVar.f297201d = true;
            }
            interfaceC26782xfd577a563 = tVar.f297199b;
            if (interfaceC26782xfd577a563 != null) {
                interfaceC26782xfd577a564 = tVar.f297199b;
                z18 = tVar.f297201d;
                str4 = tVar.f297200c;
                interfaceC26782xfd577a564.mo36999x57429edc(z18, "", str4);
            }
        } catch (java.lang.Throwable unused) {
            str = tVar.f297200c;
            if (android.text.TextUtils.isEmpty(str)) {
                tVar.f297201d = false;
            }
            interfaceC26782xfd577a56 = tVar.f297199b;
            if (interfaceC26782xfd577a56 != null) {
                interfaceC26782xfd577a562 = tVar.f297199b;
                z17 = tVar.f297201d;
                str2 = tVar.f297200c;
                interfaceC26782xfd577a562.mo36999x57429edc(z17, "", str2);
            }
        }
    }
}
