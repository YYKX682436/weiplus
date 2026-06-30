package m21;

/* loaded from: classes4.dex */
public class t implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.fa6 f404533a = new r45.fa6();

    @Override // m21.u
    public java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeContent", "com.tencent.mm.modelsns.SnsScanCodeInfoObject");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            if (this.f404533a != null) {
                sb6.append("<code_info>");
                sb6.append("<code_content>");
                sb6.append(ot0.q.g(this.f404533a.f455683d));
                sb6.append("</code_content>");
                sb6.append("<src_type>");
                sb6.append(this.f404533a.f455684e);
                sb6.append("</src_type>");
                sb6.append("</code_info>");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsScanCodeInfoObject", e17, "makeContent exception", new java.lang.Object[0]);
        }
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeContent", "com.tencent.mm.modelsns.SnsScanCodeInfoObject");
        return sb7;
    }
}
