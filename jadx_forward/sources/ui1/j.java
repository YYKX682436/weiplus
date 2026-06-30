package ui1;

/* loaded from: classes7.dex */
public class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 f509590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ui1.t f509592c;

    public j(ui1.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 c0Var, java.lang.String str) {
        this.f509592c = tVar;
        this.f509590a = c0Var;
        this.f509591b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.h24 h24Var = (r45.h24) obj;
        try {
            ui1.t tVar = this.f509592c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 c0Var = this.f509590a;
            tVar.getClass();
            ui1.t.a(tVar, c0Var, h24Var);
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth appId = %s, e = %s", this.f509591b, e17);
            km5.u.b().a(e17);
            return null;
        }
    }
}
