package ah0;

/* loaded from: classes4.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.modeltools.j1 f4743e;

    public f2(ah0.g2 g2Var, java.lang.String str, com.tencent.mm.plugin.webview.modeltools.j1 j1Var) {
        this.f4742d = str;
        this.f4743e = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.f4742d, "sysmsg", null);
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.hijackconfig.expiretime"), com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        int i17 = 0;
        java.lang.String str = ".sysmsg.hijackconfig.domainlist.domain";
        while (true) {
            if (i17 > 0) {
                str = ".sysmsg.hijackconfig.domainlist.domain" + i17;
            }
            i17++;
            java.lang.String str2 = (java.lang.String) d17.get(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            com.tencent.mm.plugin.webview.modeltools.g0 g0Var = new com.tencent.mm.plugin.webview.modeltools.g0();
            g0Var.field_expireTime = V;
            g0Var.field_host = str2;
            this.f4743e.insert(g0Var);
        }
    }
}
