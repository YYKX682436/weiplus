package ur1;

/* loaded from: classes4.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f511900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f511901e;

    public q(java.lang.String str, yz5.l lVar) {
        this.f511900d = str;
        this.f511901e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f511900d;
        yz5.l lVar = this.f511901e;
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                lVar.mo146xb9724478("");
                return;
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str + "/LocalDraft");
            if (!r6Var.m()) {
                lVar.mo146xb9724478("");
                return;
            }
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
            java.lang.String a18 = com.p314xaae8f345.mm.vfs.s6.a(r6Var, forName);
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "readWebDraft from file contentLen: " + a18.length() + ", contentMd5: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(a18.getBytes()) + ", contentPrefix: " + r26.p0.E0(a18, 200));
            lVar.mo146xb9724478(a18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("BizPersonalDraftFeatureService", e17, "readWebDraft exception", new java.lang.Object[0]);
            lVar.mo146xb9724478("");
        }
    }
}
