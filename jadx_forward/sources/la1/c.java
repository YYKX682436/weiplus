package la1;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.a {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f72772x366c91de = 6;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f72773x24728b = "insertVideoPlayer";

    @Override // gb1.i
    public java.lang.Boolean G(org.json.JSONObject jSONObject) {
        java.lang.Boolean bool = null;
        if (jSONObject != null) {
            try {
                bool = java.lang.Boolean.valueOf(jSONObject.getBoolean("underGameView"));
            } catch (org.json.JSONException unused) {
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WAGameJsApiInsertVideoPlayer", "getUnderView " + bool);
        return bool;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.a, gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t component, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        super.N(component, i17, view, jSONObject);
        if (!(component instanceof pa1.o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.WAGameJsApiInsertVideoPlayer", "wrong component: %s", p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(component.getClass()).g());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 U1 = ((pa1.o) component).U1();
        ae.q qVar = U1 != null ? (ae.q) U1.z1(ae.q.class) : null;
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiInsertHTMLCanvasElement", "hy: webgl extension not exists!");
            return;
        }
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w17 = ((ae.a) qVar).w();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.TRUE, G(jSONObject))) {
            w17.f130123n.m34848xd78cd66a(new la1.b(component));
            if (!((java.lang.Boolean) ha1.q.f361317c.e()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WAGameJsApiInsertVideoPlayer", "hy: use js thread choreographer");
                w17.u(gh.b.ChoreographerInJsThread);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WAGameJsApiInsertVideoPlayer", "hy: use main thread choreographer");
            if (((java.lang.Boolean) ha1.s.f361319c.e()).booleanValue()) {
                w17.u(gh.b.NativeLocker);
            } else {
                w17.u(gh.b.ChoreographerInMainThread);
            }
        }
    }
}
