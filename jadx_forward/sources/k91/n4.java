package k91;

/* loaded from: classes4.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.m4 f387229e;

    public n4(k91.m4 m4Var, java.lang.String str) {
        this.f387229e = m4Var;
        this.f387228d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        k91.m4 m4Var = this.f387229e;
        try {
            k91.v5 n17 = m4Var.n1(this.f387228d, "appId", "versionInfo", "nickname", "bigHeadURL", "smallHeadURL", "appInfo", "dynamicInfo");
            if (n17 == null) {
                return;
            }
            m4Var.C1(n17);
            k91.m4.z1(m4Var, n17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxaAttrStorageWC", e17, "flushContactInMainDB", new java.lang.Object[0]);
        }
    }
}
