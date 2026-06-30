package mg4;

/* loaded from: classes.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f72890x366c91de = 644;

    /* renamed from: NAME */
    public static final java.lang.String f72891x24728b = "preloadMiniProgramEnv";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.JsApiPreloadMiniProgramEnv", "preloadEnv");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Yf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170366x);
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String format = objArr.length > 0 ? java.lang.String.format("ok", objArr) : "ok";
        hashMap.putAll(new java.util.HashMap());
        java.lang.String p17 = p(format, hashMap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "makeReturnJson(...)");
        return p17;
    }
}
