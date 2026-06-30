package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class l2 implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager f76262a;

    public l2(com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager luggageLocalFileObjectManager) {
        this.f76262a = luggageLocalFileObjectManager;
    }

    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f76262a.f());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(r6Var.r());
        java.lang.String str2 = a18.f213279f;
        if (str2 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        return a17.equals(a18) && com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.g(r6Var, "tmp_", true);
    }
}
