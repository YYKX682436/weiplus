package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81084g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.l0 f81085h;

    public k0(com.tencent.mm.plugin.appbrand.jsapi.file.l0 l0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f81085h = l0Var;
        this.f81081d = lVar;
        this.f81082e = str;
        this.f81083f = i17;
        this.f81084g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String C;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81081d;
        if (lVar.isRunning()) {
            com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(this.f81082e);
            com.tencent.mm.plugin.appbrand.jsapi.file.l0 l0Var = this.f81085h;
            int i17 = this.f81083f;
            if (absoluteFile == null) {
                lVar.a(i17, l0Var.o("fail:file doesn't exist"));
                return;
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(absoluteFile.o());
            java.lang.String str = this.f81084g;
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
                    C = com.tencent.mm.plugin.appbrand.jsapi.file.l0.C(new com.tencent.mm.vfs.r6(r6Var.o()), "SHA-256");
                    break;
                case 1:
                    C = kk.k.e(r6Var.o());
                    break;
                case 2:
                    C = com.tencent.mm.plugin.appbrand.jsapi.file.l0.C(new com.tencent.mm.vfs.r6(r6Var.o()), "SHA1");
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
