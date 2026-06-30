package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf;

/* loaded from: classes8.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f264956b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e f264957c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f264955a = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f264958d = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(2);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e f264959e = com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273709f;

    public k(com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e c19774x1007d35e) {
        int P;
        this.f264956b = c19775x58fd37b3;
        java.lang.String str = x51.o1.f533593m;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
        } else {
            try {
                P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(x51.o1.f533593m, 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + e17.getMessage());
                this.f264956b = null;
            }
            if (P < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
            } else {
                this.f264956b = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(P);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.f264956b);
            }
        }
        this.f264957c = c19774x1007d35e;
        java.lang.String str2 = x51.o1.f533594n;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
        } else {
            try {
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(x51.o1.f533594n, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, permission = %d", java.lang.Integer.valueOf(P2));
                r45.y73 y73Var = new r45.y73();
                y73Var.f472371d = P2;
                this.f264957c = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e(y73Var);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl fail, ex = %s", e18.getMessage());
                this.f264957c = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGetA8KeyPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.f264957c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGetA8KeyPermission", "hardcodeJsPerm = " + c19775x58fd37b3 + ", hardcodeGenCtrl = " + c19774x1007d35e);
    }

    public final java.lang.String a(java.lang.String str) {
        int indexOf = str.indexOf("#");
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public boolean b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8KeyPermission", "has fail, url is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.j) ((java.util.HashMap) this.f264955a).get(a(str));
        return (jVar == null || jVar.f264953a == this.f264958d || jVar.f264954b == this.f264959e) ? false : true;
    }

    public void c(java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e c19774x1007d35e) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8KeyPermission", "update fail, url is null");
            return;
        }
        java.lang.String a17 = a(str);
        if (c19775x58fd37b3 == null) {
            c19775x58fd37b3 = this.f264958d;
        }
        if (c19774x1007d35e == null) {
            c19774x1007d35e = this.f264959e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGetA8KeyPermission", "edw update, jsPerm = " + c19775x58fd37b3 + ", genCtrl = " + c19774x1007d35e + ", url = " + a17);
        ((java.util.HashMap) this.f264955a).put(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.j(c19775x58fd37b3, c19774x1007d35e));
    }
}
