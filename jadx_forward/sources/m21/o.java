package m21;

/* loaded from: classes4.dex */
public class o implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.h96 f404529a = new r45.h96();

    @Override // m21.u
    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            if (this.f404529a != null) {
                sb6.append("<EcsInfo>");
                sb6.append("<productId>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f404529a.f457498d));
                sb6.append("</productId>");
                sb6.append("<bizType>");
                sb6.append(this.f404529a.f457499e);
                sb6.append("</bizType>");
                sb6.append("<ecsJumpInfoBase64>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f404529a.f457500f));
                sb6.append("</ecsJumpInfoBase64>");
                sb6.append("<reportData>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f404529a.f457501g));
                sb6.append("</reportData>");
                sb6.append("<showDetailBtn>");
                sb6.append(this.f404529a.f457502h);
                sb6.append("</showDetailBtn>");
                sb6.append("</EcsInfo>");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMediaEcsInfoObject", "make content error %s", e17.getMessage());
        }
        return sb6.toString();
    }
}
