package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162617g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l0 f162618h;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l0 l0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f162618h = l0Var;
        this.f162614d = lVar;
        this.f162615e = str;
        this.f162616f = i17;
        this.f162617g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String C;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162614d;
        if (lVar.mo50262x39e05d35()) {
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(this.f162615e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l0 l0Var = this.f162618h;
            int i17 = this.f162616f;
            if (mo49620x1d537609 == null) {
                lVar.a(i17, l0Var.o("fail:file doesn't exist"));
                return;
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(mo49620x1d537609.o());
            java.lang.String str = this.f162617g;
            str.getClass();
            char c17 = 65535;
            switch (str.hashCode()) {
                case -903629273:
                    if (str.equals("sha256")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case 107902:
                    if (str.equals("md5")) {
                        c17 = 1;
                        break;
                    }
                    break;
                case 3528965:
                    if (str.equals("sha1")) {
                        c17 = 2;
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                    C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l0.C(new com.p314xaae8f345.mm.vfs.r6(r6Var.o()), "SHA-256");
                    break;
                case 1:
                    C = kk.k.e(r6Var.o());
                    break;
                case 2:
                    C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l0.C(new com.p314xaae8f345.mm.vfs.r6(r6Var.o()), "SHA1");
                    break;
                default:
                    C = "";
                    break;
            }
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("size", java.lang.Long.valueOf(r6Var.C()));
            hashMap.put("digest", C);
            lVar.a(i17, l0Var.p("ok", hashMap));
        }
    }
}
