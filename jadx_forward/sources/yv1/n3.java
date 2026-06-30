package yv1;

/* loaded from: classes12.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(java.lang.String str) {
        super(0);
        this.f547654d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        d95.b0 b0Var = mt1.b0.f412724a.n().f430382d;
        java.lang.String str = this.f547654d;
        java.lang.String[] strArr = {str};
        try {
            try {
                b0Var.b();
                b0Var.H("WxFileIndexRefresh", "INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE linkUUID IN (SELECT linkUUID FROM WxFileIndex3 WHERE username = ?)", strArr);
                b0Var.H("WxFileIndexRefresh", "DELETE FROM WxFileIndexRefresh WHERE indexRowId IN (SELECT rowId FROM WxFileIndex3 WHERE username = ?)", strArr);
                b0Var.H("WxFileIndex3", "DELETE FROM WxFileIndex3 WHERE username = ?", strArr);
            } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxFileIndexStorage", e17, "Cannot delete WxFileIndex of user: " + str, new java.lang.Object[0]);
            }
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException unused) {
            }
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException unused2) {
            }
            throw th6;
        }
    }
}
