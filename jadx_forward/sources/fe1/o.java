package fe1;

/* loaded from: classes15.dex */
public final class o extends fe1.a {

    /* renamed from: CTRL_INDEX */
    public static final int f69744x366c91de = 1580;

    /* renamed from: NAME */
    public static final java.lang.String f69745x24728b = "getTransitCardList";

    @Override // fe1.a
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject data, int i17, fe1.v manager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        fe1.n nVar = new fe1.n(java.lang.System.currentTimeMillis(), data.optString("issuerID", ""), env, this, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.C12256x915ef4c9 c12256x915ef4c9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.C12256x915ef4c9(manager.f343035a);
        c12256x915ef4c9.F(nVar);
        c12256x915ef4c9.d();
    }
}
