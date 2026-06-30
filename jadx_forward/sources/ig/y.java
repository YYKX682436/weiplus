package ig;

/* loaded from: classes16.dex */
public class y extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        ig.z m135251x3136c9db = ig.a0.m135251x3136c9db();
        try {
            m135251x3136c9db.mo20526x60f45402(d0Var, t4Var);
            return m135251x3136c9db.mo20557x85702333();
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            e17.f127272d = m135251x3136c9db.mo20557x85702333();
            throw e17;
        } catch (java.io.IOException e18) {
            com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18.getMessage());
            y6Var.f127272d = m135251x3136c9db.mo20557x85702333();
            throw y6Var;
        }
    }
}
