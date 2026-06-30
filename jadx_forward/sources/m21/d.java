package m21;

/* loaded from: classes4.dex */
public class d implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.lh0 f404517a = new r45.lh0();

    @Override // m21.u
    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            if (this.f404517a != null) {
                sb6.append("<EcsShareInfo>");
                sb6.append("<title>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f404517a.f461007e));
                sb6.append("</title>");
                sb6.append("<productId>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f404517a.f461008f));
                sb6.append("</productId>");
                sb6.append("<ecsJumpInfoBase64>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f404517a.f461009g));
                sb6.append("</ecsJumpInfoBase64>");
                sb6.append("<type>");
                sb6.append(this.f404517a.f461006d);
                sb6.append("</type>");
                sb6.append("<reportData>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f404517a.f461011i));
                sb6.append("</reportData>");
                sb6.append("</EcsShareInfo>");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsEcsShareInfoObject", "make content error %s", e17.getMessage());
        }
        return sb6.toString();
    }
}
