package zy2;

/* loaded from: classes9.dex */
public class z4 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f559167b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f559168c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f559169d;

    /* renamed from: e, reason: collision with root package name */
    public int f559170e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f559171f;

    @Override // ot0.h
    public ot0.h a() {
        zy2.z4 z4Var = new zy2.z4();
        z4Var.f559167b = this.f559167b;
        z4Var.f559168c = this.f559168c;
        z4Var.f559169d = this.f559169d;
        z4Var.f559170e = this.f559170e;
        z4Var.f559171f = this.f559171f;
        return z4Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<finderGuarantee>");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f559167b)) {
            sb6.append("<title>");
            sb6.append(ot0.q.g(this.f559167b));
            sb6.append("</title>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f559168c)) {
            sb6.append("<desc>");
            sb6.append(ot0.q.g(this.f559168c));
            sb6.append("</desc>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f559169d)) {
            sb6.append("<relativePath>");
            sb6.append(ot0.q.g(this.f559169d));
            sb6.append("</relativePath>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f559171f)) {
            sb6.append("<appid>");
            sb6.append(ot0.q.g(this.f559171f));
            sb6.append("</appid>");
        }
        sb6.append("<scene>");
        sb6.append(ot0.q.g(java.lang.String.valueOf(this.f559170e)));
        sb6.append("</scene>");
        sb6.append("</finderGuarantee>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f559167b = (java.lang.String) map.get(".msg.appmsg.finderGuarantee.title");
        this.f559168c = (java.lang.String) map.get(".msg.appmsg.finderGuarantee.desc");
        this.f559169d = (java.lang.String) map.get(".msg.appmsg.finderGuarantee.relativePath");
        this.f559171f = (java.lang.String) map.get(".msg.appmsg.finderGuarantee.appid");
        this.f559170e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.finderGuarantee.scene"), 0);
    }
}
