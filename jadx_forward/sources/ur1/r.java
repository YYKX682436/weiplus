package ur1;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f511902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f511903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f511904f;

    public r(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, java.lang.String str2) {
        this.f511902d = r6Var;
        this.f511903e = str;
        this.f511904f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f511902d;
        try {
            if (!r6Var.m()) {
                r6Var.J();
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(this.f511903e + "/LocalDraft");
            if (!r6Var2.m()) {
                r6Var2.k();
            }
            java.lang.String text = this.f511904f;
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
            byte[] bytes = text.getBytes(forName);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            com.p314xaae8f345.mm.vfs.s6.c(r6Var2, bytes);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("BizPersonalDraftFeatureService", e17, "writeDraft exception", new java.lang.Object[0]);
        }
    }
}
