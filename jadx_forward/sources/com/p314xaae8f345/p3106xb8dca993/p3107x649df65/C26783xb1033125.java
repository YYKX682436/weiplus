package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* renamed from: com.tencent.tmsqmsp.oaid2.VendorManager */
/* loaded from: classes8.dex */
public class C26783xb1033125 implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 {

    /* renamed from: vendorInfo */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b f56867x295d9a16 = null;

    /* renamed from: userCallback */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 f56866xc7f67530 = null;

    /* renamed from: getVendorInfo */
    public int m105541x179e520c(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56) {
        this.f56866xc7f67530 = interfaceC26782xfd577a56;
        switch (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.l.f297138a[com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.b().ordinal()]) {
            case 1:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.w0();
                break;
            case 2:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.v0();
                break;
            case 3:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t();
                break;
            case 4:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n0();
                break;
            case 5:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.w();
                break;
            case 6:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.p();
                break;
            case 7:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.s0();
                break;
            case 8:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.i0();
                break;
            case 9:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.j0();
                break;
            case 10:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.c0();
                break;
            case 11:
                this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.m();
                break;
            case 12:
                if (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.d.a(context)) {
                    this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.h();
                    break;
                }
                break;
        }
        if (this.f56867x295d9a16 == null && com.p314xaae8f345.p3106xb8dca993.p3107x649df65.e.a()) {
            this.f56867x295d9a16 = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t();
        }
        if (this.f56867x295d9a16 == null) {
            mo36999x57429edc(false, "", "");
            return com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a.f297086a;
        }
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        try {
            this.f56867x295d9a16.a(context, this);
            if (this.f56867x295d9a16.k()) {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a("sync");
                try {
                    mo36999x57429edc(this.f56867x295d9a16.e(), this.f56867x295d9a16.d(), this.f56867x295d9a16.a());
                } catch (java.lang.Throwable unused) {
                    mo36999x57429edc(false, "", "");
                }
            } else {
                try {
                    this.f56867x295d9a16.j();
                } catch (java.lang.Throwable unused2) {
                    mo36999x57429edc(false, "", "");
                    return com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a.f297087b;
                }
            }
            return 0;
        } catch (java.lang.Throwable unused3) {
            mo36999x57429edc(false, "", "");
            return com.p314xaae8f345.p3106xb8dca993.p3107x649df65.a.f297087b;
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56
    /* renamed from: onResult */
    public void mo36999x57429edc(boolean z17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("vm onResult ".concat(java.lang.String.valueOf(z17)));
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        try {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56 = this.f56866xc7f67530;
            if (interfaceC26782xfd577a56 != null) {
                interfaceC26782xfd577a56.mo36999x57429edc(z17, str, str2);
            }
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b bVar = this.f56867x295d9a16;
            if (bVar != null) {
                bVar.l();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a(th6.toString());
        }
    }
}
